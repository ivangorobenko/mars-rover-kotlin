import Direction.*

class MoveBackwards {
    fun execute(rover: Rover): Rover {
        return rover.copy(direction = determineOppositionDirection(rover.direction))
    }

    private fun Rover.copy(direction: Direction) = when (this) {
        is MovingRover -> MovingRover(position, direction)
        is IdleRover -> IdleRover(position, direction)
        else -> {
            throw IllegalArgumentException("Unknown rover type")
        }
    }
}