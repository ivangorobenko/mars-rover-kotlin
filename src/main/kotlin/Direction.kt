enum class Direction {
    NORTH, EAST, SOUTH, WEST
}


fun determineOppositionDirection(direction: Direction) = when (direction) {
    Direction.NORTH -> Direction.SOUTH
    Direction.SOUTH -> Direction.NORTH
    Direction.EAST -> Direction.WEST
    Direction.WEST -> Direction.EAST
}
