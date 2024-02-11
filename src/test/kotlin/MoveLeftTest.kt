import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class MoveLeftTest {
    @Nested
    inner class IdleRover {

        @Test
        fun `turns to the WEST when it is directed to the NORTH`() {
            val initialPosition = Position(0, 0)
            val stoppedRover = IdleRover(initialPosition, Direction.NORTH)

            val movingRover = MoveLeft().execute(stoppedRover)
            assertEquals(movingRover, IdleRover(initialPosition, Direction.WEST))
        }

        @Test
        fun `turns to the SOUTH when it is directed to the WEST`() {
            val initialPosition = Position(0, 0)
            val stoppedRover = IdleRover(initialPosition, Direction.WEST)

            val movingRover = MoveLeft().execute(stoppedRover)
            assertEquals(movingRover, IdleRover(initialPosition, Direction.SOUTH))
        }

        @Test
        fun `turns to the EAST when it is directed to the SOUTH`() {
            val initialPosition = Position(0, 0)
            val stoppedRover = IdleRover(initialPosition, Direction.EAST)

            val movingRover = MoveLeft().execute(stoppedRover)
            assertEquals(movingRover, IdleRover(initialPosition, Direction.NORTH))
        }
    }
  @Nested
    inner class MovingRover{

        @Test
        fun `turns to the WEST when it is directed to the NORTH`() {
            val initialPosition = Position(0, 0)
            val stoppedRover = MovingRover(initialPosition, Direction.NORTH)

            val movingRover = MoveLeft().execute(stoppedRover)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.WEST))
        }

        @Test
        fun `turns to the SOUTH when it is directed to the WEST`() {
            val initialPosition = Position(0, 0)
            val stoppedRover = MovingRover(initialPosition, Direction.WEST)

            val movingRover = MoveLeft().execute(stoppedRover)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.SOUTH))
        }

        @Test
        fun `turns to the EAST when it is directed to the SOUTH`() {
            val initialPosition = Position(0, 0)
            val stoppedRover = MovingRover(initialPosition, Direction.EAST)

            val movingRover = MoveLeft().execute(stoppedRover)
            assertEquals(movingRover, MovingRover(initialPosition, Direction.NORTH))
        }
    }

}