package utils;

public enum Colors {
    EMPY("*"),KROMIS("K"),CAGUANOS("C"),TRUPALLAS("T");
    private String simbol;
    
    private Colors(String simbol) {
        this.simbol = simbol;
    }

    public String getSimbol() {
        return simbol;
    }



}