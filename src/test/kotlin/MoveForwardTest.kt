import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MoveForwardTest {

    @Test
    fun `moves already moving rover forward in its current direction by 1`() {
        mapOf(
            Direction.NORTH to Position(1, 2),
            Direction.WEST to Position(0, 1),
            Direction.SOUTH to Position(1, 0),
            Direction.EAST to Position(2, 1)
        ).forEach { (direction, position) ->
            val initialMovingRover = MovingRover(Position(1, 1), direction)
            val movingRover = MoveForward().execute(initialMovingRover)
            assertEquals(movingRover.direction, direction)
            assertEquals(movingRover.state, RoverState.MOVING)
            assertEquals(movingRover.position, position)
        }
    }

    @Test
    fun `moves idle rover forward in its current direction by 1`() {
        mapOf(
            Direction.NORTH to Position(1, 2),
            Direction.WEST to Position(0, 1),
            Direction.SOUTH to Position(1, 0),
            Direction.EAST to Position(2, 1)
        ).forEach { (direction, position) ->
            val idleRover = IdleRover(Position(1, 1), direction)
            val movingRover = MoveForward().execute(idleRover)
            assertEquals(movingRover.direction, direction)
            assertEquals(movingRover.state, RoverState.MOVING)
            assertEquals(movingRover.position, position)
        }
    }

    @Test
    fun `changes direction from NORTH to SOUTH when rover arrives at the north pole `() {
        val initialMovingRover = MovingRover(Position(2, 0), Direction.NORTH)
        val movingRover = MoveForward().execute(initialMovingRover)
        assertEquals(movingRover.direction, Direction.SOUTH)
        assertEquals(movingRover.state, RoverState.MOVING)
        assertEquals(movingRover.position, Position(2, 1))
    }

    @Test
    fun `changes direction from SOUTH to NORTH when rover arrives at the south pole `() {
        val initialMovingRover = MovingRover(Position(2, 9), Direction.SOUTH)
        val movingRover = MoveForward().execute(initialMovingRover)
        assertEquals(movingRover.direction, Direction.NORTH)
        assertEquals(movingRover.state, RoverState.MOVING)
        assertEquals(movingRover.position, Position(2, 8))
    }
}