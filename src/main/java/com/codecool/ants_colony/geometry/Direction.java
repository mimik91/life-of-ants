package com.codecool.ants_colony.geometry;

    public enum Direction {
        NORTH(new Position(-1, 0)),
        EAST(new Position(0, 1)),
        SOUTH(new Position(1, 0)),
        WEST(new Position(0, -1));

        public final Position dirction;

        private Direction(Position dirction) {
            this.dirction = dirction;
        }

        public Position getDirction(){
            return this.dirction;
        }
    }
