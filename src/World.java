public class World {
    public Minecraft createWorld() {
        System.out.println("World created");
        return Minecraft.builder()
                .playerName("Liquin")
                .biome("Desert")
                .mode("Survival")
                .build();
    }
    public Minecraft joinServer() {
        System.out.println("Server joined");
        return Minecraft.builder()
                .playerName("Eneri")
                .ip("192.168.1.228:55615")
                .build();
    }
}
