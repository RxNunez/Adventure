import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class AdventureMainTest {

    @Test

    public void whenUserToYoungGameIsOver() throws Exception {
        AgeVerificationGameStage stage = new AgeVerificationGameStage();

        stage.setUserInput("12");

        assertTrue(stage.isGameOver());

        stage.setUserInput("13");

        assertFalse(stage.isGameOver());
    }

}