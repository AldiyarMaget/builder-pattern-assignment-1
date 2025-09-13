public class Minecraft {
    final private String worldName;
    final private String ip;
    final private String mode;
    final private String biome;
    final private String playerName;
    final private String modification;

    public Minecraft(String worldName, String ip, String mode, String biome, String playerName, String modification) {
        this.worldName = worldName;
        this.ip = ip;
        this.mode = mode;
        this.biome = biome;
        this.playerName = playerName;
        this.modification = modification;
    }

    public static MinecraftBuilder builder(){
        return new MinecraftBuilder();
    }

    public static class MinecraftBuilder{
        private String worldName;
        private String ip;
        private String mode;
        private String biome;
        private String playerName;
        private String modification;

        public MinecraftBuilder worldName(String worldName) {
            this.worldName = worldName;
            return this;
        }
        public MinecraftBuilder ip(String ip) {
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
        public MinecraftBuilder playerName(String playerName) {
            this.playerName = playerName;
            return this;
        }
        public MinecraftBuilder modification(String modification) {
            this.modification = modification;
            return this;
        }

        public Minecraft build(){
            return new Minecraft(worldName, ip, mode, biome, playerName, modification);
        }
    }
}
