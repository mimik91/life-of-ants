package com.codecool.ants_colony.geometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

    public class RandomDirection {
        private final Random RANDOM = new Random();
        public List<Direction> directions = Collections.unmodifiableList(Arrays.asList(Direction.values()));

        public Direction get() {
            int size = directions.size();
            return directions.get(RANDOM.nextInt(size));
        }
}
