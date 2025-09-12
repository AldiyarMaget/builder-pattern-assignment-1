public class World {
    public Minecraft createWorld() {
        System.out.println("World created");
        return Minecraft.builder()
                .player_name("Liquin")
                .biome("Desert")
                .mode("Survival")
                .build();
    }
    public Minecraft joinServer() {
        System.out.println("Server joined");
        return Minecraft.builder()
                .player_name("Eneri")
                .ip(228228228)
                .build();
    }
}
