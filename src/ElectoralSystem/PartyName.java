package ElectoralSystem;

public enum PartyName {
    PDP("People Democratic Party"),
    APC("All Progressive Congress"),
    LP("Labour Party");

    PartyName(String partyName) {
        this.partyName = partyName;
    }
    private String partyName;
    public String getPartyName() {
        return partyName;
    }
}
