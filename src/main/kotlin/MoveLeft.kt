class MoveLeft {
    fun execute(rover: IdleRover): IdleRover {
        when (rover.direction) {
            Direction.NORTH -> return IdleRover(rover.position, Direction.WEST)
            Direction.SOUTH -> return IdleRover(rover.position, Direction.EAST)
            Direction.EAST -> return IdleRover(rover.position, Direction.NORTH)
            Direction.WEST -> return IdleRover(rover.position, Direction.SOUTH)
        }
    }

    fun execute(rover: MovingRover): MovingRover {
        when (rover.direction) {
            Direction.NORTH -> return MovingRover(rover.position, Direction.WEST)
            Direction.SOUTH -> return MovingRover(rover.position, Direction.EAST)
            Direction.EAST -> return MovingRover(rover.position, Direction.NORTH)
            Direction.WEST -> return MovingRover(rover.position, Direction.SOUTH)
        }
    }
}