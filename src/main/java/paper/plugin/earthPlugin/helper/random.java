package paper.plugin.earthPlugin.helper;

import java.util.concurrent.ThreadLocalRandom;

public class random {
    public static float randomFloat(float min, float max) {
      return ThreadLocalRandom.current().nextFloat(min, max);
    }

    public static int randomInt(int min, int maxExclusive) {
        return ThreadLocalRandom.current().nextInt(min, maxExclusive);
    }

    public static boolean ifChance(int num) {
        return randomInt(0, num) == 1;
    }

    // does a cf, returns either true or false those stuff
    public static boolean randBool() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}

// i lowk needed a good amount of help by gpt for this, asked it what some stuff means and
// just said "you dont need to learn this yet" so ig its fine lol
