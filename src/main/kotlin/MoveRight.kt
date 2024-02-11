class MoveRight {
    fun execute(rover: IdleRover): IdleRover {
        when (rover.direction) {
            Direction.NORTH -> return IdleRover(rover.position, Direction.EAST)
            Direction.SOUTH -> return IdleRover(rover.position, Direction.WEST)
            Direction.EAST -> return IdleRover(rover.position, Direction.SOUTH)
            Direction.WEST -> return IdleRover(rover.position, Direction.NORTH)
        }
    }

    fun execute(rover: MovingRover): MovingRover {
        when (rover.direction) {
            Direction.NORTH -> return MovingRover(rover.position, Direction.EAST)
            Direction.SOUTH -> return MovingRover(rover.position, Direction.WEST)
            Direction.EAST -> return MovingRover(rover.position, Direction.SOUTH)
            Direction.WEST -> return MovingRover(rover.position, Direction.NORTH)
        }
    }
}