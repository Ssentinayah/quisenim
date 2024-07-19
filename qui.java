private static int getNumTickets(Scanner scanner) {
    int totalTickets = 0;
    while (scanner.hasNextLine()) {
        totalTickets += scanner.nextInt();
    }
    return totalTickets;
}
