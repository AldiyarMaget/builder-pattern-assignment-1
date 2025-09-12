public class Minecraft {
    private String World_name;
    private int ip;
    private String mode;
    private String biome;
    private String player_name;
    private String modification;

    public Minecraft(String World_name, int ip, String mode, String biome, String player_name, String modification) {
        this.World_name = World_name;
        this.ip = ip;
        this.mode = mode;
        this.biome = biome;
        this.player_name = player_name;
        this.modification = modification;
    }

    public static MinecraftBuilder builder(){
        return new MinecraftBuilder();
    }
}
