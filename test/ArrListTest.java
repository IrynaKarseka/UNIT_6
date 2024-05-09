import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrListTest {
    int[] array1;
    int[] array2;
    int[] array3;
    ArrList arrList;
    ArrList arrListMock;
    double averageArray;
    double averageArray1;

    @BeforeEach
    void setUp() {
        arrList = new ArrList();
        arrListMock = mock(ArrList.class);
        array1 = new int[]{1,1,1,1,1};
        array2 = new int[]{1,1,1,1,1};
        array3 = new int[]{1,2,1,3,4};
        averageArray = 1.0;
        averageArray1 = 2.0;
    }


    /**
     * Mock-тест - проверка метода сравнения средних значений двух списков (средние значения равны)
     */
    @Test
    void compareArray() {
        double average1 = arrList.averageArray(array2);
        double average2 = arrList.averageArray(array1);
        arrList.compareArray(average1, average2);
    }

    /**
     * Unit, Mock-тест - проверка метода вычисления среднего значения списка
     */
    @Test
    void averageArray() {
        assertThat(arrList.averageArray(array3)).isEqualTo(2.0);
        //проверка с помощью Mock
        when(arrListMock.averageArray(array2)).thenReturn(averageArray);
    }

    /**
     *  Unit, Mock-тест - проверка метода создания списка
     */
    @Test
    void createArray() {
        //проверка на ограничение длины списка равное 10
        assertThat(arrList.creteArray().length).isEqualTo(10);
        //проверка с помощью Mock
        when(arrListMock.creteArray()).thenReturn(array3);
    }

    /**
     * Mock-тест - проверка создания нового списка в классе ArrList
     */
    @Test
    void createList(){
        when(arrListMock.creteArray()).thenReturn(new int[]{1,1,1,1,1});
    }
}
