package paper.plugin.earthPlugin.helper;

import java.util.concurrent.ThreadLocalRandom;

public class random {

    public static int randomInt(int min, int maxExclusive) {
        return ThreadLocalRandom.current().nextInt(min, maxExclusive);
    }

    // chooses between 1, 2, or 3. if 1 is chosen, returns true
    public static boolean chanceOneInThree() {
        return randomInt(1, 4) == 1;
    }

    // does a cf, returns either true or false those stuff
    public static boolean coinflip() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}

// i lowk needed a good amount of help by gpt for this, asked it what some stuff means and
// just said "you dont need to learn this yet" so ig its fine lol