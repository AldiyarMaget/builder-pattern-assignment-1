public class Main {
    public static void main(String[] args) {
        World world = new World();
        Minecraft mc1 = world.createWorld();

        Minecraft mc2 = Minecraft.builder()
                .player_name("Technoblade")
                .mode("Legend")
                .World_name("Paradise")
                .build();
    }
}
