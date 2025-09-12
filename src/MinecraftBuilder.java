public class MinecraftBuilder{
    private String World_name;
    private int ip;
    private String mode;
    private String biome;
    private String player_name;
    private String modification;

    public MinecraftBuilder World_name(String World_name) {
        this.World_name = World_name;
        return this;
    }
    public MinecraftBuilder ip(int ip) {
        this.ip = ip;
        return this;
    }
    public MinecraftBuilder mode(String mode) {
        this.mode = mode;
        return this;
    }
    public MinecraftBuilder biome(String biome) {
        this.biome = biome;
        return this;
    }
    public MinecraftBuilder player_name(String player_name) {
        this.player_name = player_name;
        return this;
    }
    public MinecraftBuilder modification(String modification) {
        this.modification = modification;
        return this;
    }

    public Minecraft build(){
        return new Minecraft(World_name, ip, mode, biome, player_name, modification);
    }
}