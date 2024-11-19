import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stack.StackImpl;

import static org.junit.jupiter.api.Assertions.*;


class StackTest {
    StackImpl stackTest;

    //
    // crear un stacks
    @Test
    @BeforeEach
    @DisplayName("Test createStack")
    void createStack() {
        stackTest = new StackImpl();
        stackTest.setMaxSize(10);
    }

    // push
    @Test
    @DisplayName("Test pushTest")
    void pushTest(){
        assertTrue(stackTest.push(1));
    }

    //size
    @Test
    @DisplayName("Test sizeTest")
    void sizeTest(){
        assertEquals(0,stackTest.size());
    }

    // 4.- push y size
    @Test
    @DisplayName("Test pushSizeTest")
    void pushSizeTest(){
        stackTest.push(1);
        assertEquals(1,stackTest.size());
    }

    //5.- push push size
    @Test
    @DisplayName("Test pushPushSizeTest")
    void pushPushSizeTest(){
        stackTest.push(1);
        stackTest.push(2);
        assertEquals(2,stackTest.size());
    }

    //6.-pop
    @Test
    @DisplayName("Test popTest")
    void popTest(){
        assertFalse(stackTest.pop());
    }

    //7.- push pop
    @Test
    @DisplayName("Test pushPopTest")
    void pushPopTest(){
        stackTest.push(1);
        stackTest.pop();
        assertEquals(0,stackTest.size());
    }

    //8.- peek
    @Test
    @DisplayName("Test peekTest")
    void peekTest(){
        try {
            int resultado = stackTest.peek();
        }catch (Exception ex){
            System.out.println("fail :"+ex);
        }
    }

    //9.- push peek size
    @Test
    @DisplayName("Test pushPeekSizeTest")
    void pushPeekSizeTest(){
        stackTest.push(1);
        stackTest.peek();
        assertEquals(1,stackTest.size());
    }

    //10.- push push pop pop
    @Test
    @DisplayName("Test pushPushPopPopTest")
    void pushPushPopPopTest(){
        stackTest.push(1);
        stackTest.push(2);
        stackTest.pop();
        stackTest.pop();
        assertEquals(0  ,stackTest.size());
    }

    //11.-push pop push pop
    @Test
    @DisplayName("Test pushPopPushPopTest")
    void pushPopPushPopTest(){
        stackTest.push(1);
        stackTest.pop();
        stackTest.push(2);
        stackTest.pop();
        assertEquals(0,stackTest.size());
    }

    //12.- maxSize
    @Test
    @DisplayName("Test maxSizeTest")
    void maxSizeTest(){
        stackTest.setMaxSize(2);
        assertEquals(2,stackTest.getMaxSize());
    }

    //13.- push(max size)+1 StackOverFlow
    @Test
    @DisplayName("StackOverFlow")
    void StackOverFlow(){
        try {
            stackTest.setMaxSize(0);
            stackTest.push(1);
        }catch (Exception ex){
            System.out.println("fail :"+ex);
        }
    }

    //14.- push(1) puch(1) validar repetido
    @Test
    @DisplayName("Test push valor repeat")
    void pushValorRepeatTest(){
        stackTest.push(1);
        stackTest.push(1);
        assertEquals(1,stackTest.size());
    }


}