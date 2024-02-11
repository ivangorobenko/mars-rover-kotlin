data class IdleRover(override val position: Position, override val direction: Direction) : Rover {
    override val state = RoverState.IDLE
}