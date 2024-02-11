class MoveForward {
    fun execute(rover: Rover): MovingRover {
        when (rover.direction) {
            Direction.NORTH -> {
                if (rover.position.y == 0) {
                    return MovingRover(
                        rover.position.moveForward(Direction.NORTH),
                        determineOppositionDirection(rover.direction)
                    )
                }
                return MovingRover(rover.position.moveForward(Direction.NORTH), rover.direction)
            }

            Direction.SOUTH -> return MovingRover(rover.position.moveForward(Direction.SOUTH), rover.direction)
            Direction.EAST -> return MovingRover(rover.position.moveForward(Direction.EAST), rover.direction)
            Direction.WEST -> return MovingRover(rover.position.moveForward(Direction.WEST), rover.direction)
        }
        return MovingRover(rover.position, rover.direction)
    }
}