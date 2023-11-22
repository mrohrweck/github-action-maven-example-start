import static org.junit.jupiter.api.Assertions.*;

class DeepThoughtTest {

    @org.junit.jupiter.api.Test
    void answer_to_the_ultimate_question_of_life_the_universe_and_everything() {
        DeepThought superComputer = new DeepThought();
        assertEquals( 42, superComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything());

    }
}