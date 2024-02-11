import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class MoveBackwardsTest {
    private val initialPosition = Position(0, 0)

    @Nested
    inner class MovingRover {
        @Test
        fun `makes a rover moving to the NORTH move backwards to the SOUTH`() {
            val movingRoverBeforeTurningBack = MovingRover(initialPosition, Direction.NORTH)
            val movingRover = MoveBackwards().execute(movingRoverBeforeTurningBack)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.SOUTH))
        }

        @Test
        fun `makes a rover moving to the South move backwards to the North`() {
            val movingRoverBeforeTurningBack = MovingRover(initialPosition, Direction.SOUTH)
            val movingRover = MoveBackwards().execute(movingRoverBeforeTurningBack)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.NORTH))

        }

        @Test
        fun `makes a rover moving to the West move backwards to the East`() {
            val movingRoverBeforeTurningBack = MovingRover(initialPosition, Direction.WEST)
            val movingRover = MoveBackwards().execute(movingRoverBeforeTurningBack)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.EAST))
        }

        @Test
        fun `makes a rover moving to the East move backwards to the West`() {
            val movingRoverBeforeTurningBack = MovingRover(initialPosition, Direction.EAST)
            val movingRover = MoveBackwards().execute(movingRoverBeforeTurningBack)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.WEST))
        }
    }

    @Nested
    inner class IdleRover {
        @Test
        fun `makes a rover directed to the North move backwards to the South`() {
            val idleRoverBeforeTurningBack = IdleRover(initialPosition, Direction.NORTH)
            val idleRover = MoveBackwards().execute(idleRoverBeforeTurningBack)
            assertEquals(idleRover, IdleRover(initialPosition, Direction.SOUTH))
        }

        @Test
        fun `makes a rover directed to the South move backwards to the North`() {
            val idleRoverBeforeTurningBack = IdleRover(initialPosition, Direction.SOUTH)
            val idleRover = MoveBackwards().execute(idleRoverBeforeTurningBack)
            assertEquals(idleRover, IdleRover(initialPosition, Direction.NORTH))
        }

        @Test
        fun `makes a rover directed to the West move backwards to the East`() {
            val idleRoverBeforeTurningBack = IdleRover(initialPosition, Direction.WEST)
            val idleRover = MoveBackwards().execute(idleRoverBeforeTurningBack)
            assertEquals(idleRover, IdleRover(initialPosition, Direction.EAST))
        }

        @Test
        fun `makes a rover directed to the East move backwards to the West`() {
            val idleRoverBeforeTurningBack = IdleRover(initialPosition, Direction.EAST)
            val idleRover = MoveBackwards().execute(idleRoverBeforeTurningBack)
            assertEquals(idleRover, IdleRover(initialPosition, Direction.WEST))
        }
    }
}