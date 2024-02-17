package edu.sullivb.assign03;

public class GreetingCard {
    // Data
    private String [] message;
    private char boundary;
    private int cardWidth = 50;
    private int linesPerCard = 5;
    // Constructors
    public GreetingCard(String [] lines, char boundaryChar) {
        setLines(lines);
        boundary = boundaryChar;
    }
    public GreetingCard(String [] lines, char boundary, int width, int numLines) {
        //just for fun
        setLines(lines);
        setBoundaryChar(boundary);
        setLinesPerCard(numLines);
        setCardWidth(width);
    }
    // Setters
    public void setBoundaryChar(char b) {
        boundary = b;
    }
    public void setCardWidth(int w) {
        cardWidth = w;
    }
    public void setLinesPerCard(int l) {
        linesPerCard = l;
    }
    public void setLines(String [] lines) {
        message = new String [lines.length];
        System.arraycopy(lines, 0, message, 0, message.length);
    }
    // Getters
    public String getLines() {
        StringBuilder msg = new StringBuilder();
        for (String s : message) {
            msg.append(s).append("\n");
        }
        return msg.toString();
    }
    public char getBoundaryChar() {
        return boundary;
    }
    public String generateBoundaryLine() {
        return String.valueOf(getBoundaryChar()).repeat(cardWidth) + "\n";
    }
    public String generateCenteredLine(String text) {
        if (!text.isEmpty()) {
            // only build a string if the line contains something...
            int totalPadding = cardWidth - (text.length() + 2); // add +2 for the spaces
            int paddingLeft = totalPadding / 2;
            int paddingRight = totalPadding - paddingLeft;
            StringBuilder cl = new StringBuilder();
            cl.append(String.valueOf(getBoundaryChar()).repeat(paddingLeft));
            cl.append(" ").append(text).append(" ");
            cl.append(String.valueOf(getBoundaryChar()).repeat(paddingRight)).append("\n");
            return cl.toString();
        } else {
            // ...otherwise we'll just return a boundary line
            return generateBoundaryLine();
        }
    }

    public String toStringAlt() {
        // slightly different way I did it at first
        StringBuilder sb = new StringBuilder();
        int linesRemaining = message.length; // keeping track of the number of lines left
        int cards = ((int)Math.ceil(((double)linesRemaining / linesPerCard))); // calculate number of cards we need
        while (cards > 0) {
            // append 2 lines at the beginning of each card
            sb.append(generateBoundaryLine()).append(generateBoundaryLine());
            // print the number of message lines we need per card
            for (int cnt = 0; cnt < linesPerCard; cnt++) {
                if (linesRemaining > 0) {
                    sb.append(generateCenteredLine(message[message.length-linesRemaining]));
                    linesRemaining--;
                } else {
                    // if there are no lines left, then we'll just fill out the remaining lines of the card with boundary lines
                    sb.append(generateBoundaryLine());
                }
            }
            // append 2 lines at the end of each card
            sb.append(generateBoundaryLine()).append(generateBoundaryLine());
            cards--;
            if (cards > 0) { sb.append("\n"); } //separate cards with a newline
        }
        return sb.toString();
    }
    public String toString() {
        // wanted to follow logic in the assignment exactly
        StringBuilder sb = new StringBuilder();
        int linesToPrint = linesPerCard;
        int extraLines = 0;

        for (int linesRemaining = message.length; linesRemaining > 0;) {
            // add extra line to separate multiple cards
            if (!sb.isEmpty()) { sb.append("\n"); }
            // add the top 2 boundary lines
            sb.append(generateBoundaryLine()).append(generateBoundaryLine());
            // check if the lines remaining are less than the number to print.
            // if so, adjust the number of actual lines to add
            if (linesRemaining < linesPerCard) {
                linesToPrint = linesRemaining;
                extraLines = linesPerCard - linesRemaining;
            }
            // add the number of lines we want to on each card
            for (int cnt = 0; cnt < linesToPrint; cnt++) {
                sb.append(generateCenteredLine(message[message.length-linesRemaining]));
                linesRemaining--;
            }
            // if there's extra lines we need to fill, do it now
            for (int cnt = 0; cnt < extraLines; cnt++) {
                sb.append(generateBoundaryLine());
            }
            // add the bottom two boundary lines
            sb.append(generateBoundaryLine()).append(generateBoundaryLine());
        }
        return sb.toString();
    }
}

