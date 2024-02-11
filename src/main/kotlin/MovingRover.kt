data class MovingRover(override val position: Position, override val direction: Direction): Rover {
    override val state: RoverState = RoverState.MOVING
}
