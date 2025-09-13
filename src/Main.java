public class Main {
    public static void main(String[] args) {
        World world = new World();
        Minecraft mc1 = world.createWorld();

        Minecraft mc2 = Minecraft.builder()
                .playerName("Technoblade")
                .mode("Legend")
                .worldName("Paradise")
                .build();
    }
}
