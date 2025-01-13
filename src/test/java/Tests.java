import org.example.Main;
import org.junit.jupiter.api.Test;
import org.example.Convay;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    private void assert2dArrayEquals(int[][] expected,int[][] actual){
        for(int i=0;i<expected[0].length;i++){
            assertArrayEquals(expected[i],actual[i]);
        }

    }
    @Test
    void testUnderPopulation(){


        int[][] input1 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] expected1 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int [][] actual = Convay.next_state(input1);
        assert2dArrayEquals(expected1,actual);
    }
    @Test
    void testOverPopulation(){
        int[][] input2 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] expected2 = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        int [][] actual = Convay.next_state(input2);
        assert2dArrayEquals(expected2,actual);
    }
    @Test
    void testReproduction(){
        int[][] input3 = {
                {0, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        };

        int[][] expected3 = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        };
        int [][] actual = Convay.next_state(input3);
        assert2dArrayEquals(expected3,actual);
    }
    @Test
    void testStill(){
        int[][] input4 = {
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] expected4 = {
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int [][] actual = Convay.next_state(input4);
        assert2dArrayEquals(expected4,actual);
    }
    @Test
    void testBlinker(){
        int[][] input5 = {
                {0, 0, 0, 0},
                {0, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] expected5 = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };
        int [][] actual = Convay.next_state(input5);
        assert2dArrayEquals(expected5,actual);
    }
}
