import static org.junit.Assert.assertEquals; 
import org.junit.Test;

public class AppTest {
    @Test
    public void check_text_get_set(){
        //arrange
        final String testText = "Java8 makes Java more powerful"; 
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.setText("Java8 makes Java more powerful");
        //assert
        assertEquals(searchWord.getText(), testText);
    }

    @Test
    public void check_word_get_set(){
        //arrange
        final String testWord = "Java8";   
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.setSearch_word("Java8");
        //assert
        assertEquals(searchWord.getSearch_word(), testWord);
    }

    @Test
    public void check_boolean_get_set(){
        //arrange
        final boolean TrueBool = true;
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.setFound(true);
        //assert
        assertEquals(TrueBool, searchWord.isFound());
    }

    @Test
    public void check_search_function(){
        //arrange
        final boolean TrueBool = true;
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.setSearch_word("Java8");
        searchWord.setText("Java8 makes Java more powerful");
        searchWord.search();
        //assert
        assertEquals(TrueBool, searchWord.isFound());
    }

    @Test
    public void check_counter_function(){
        //arrange
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.word_counter();
        searchWord.word_counter();
        searchWord.word_counter();        
        searchWord.word_counter();               
        //assert
        assertEquals(4, searchWord.getWord_counter());
    }
    
    @Test
    public void check_counter_call(){
        //arrange
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.setSearch_word("Java8");   
        searchWord.setText("Java8 makes Java more powerful");
        searchWord.search();
        //assert
        assertEquals(1, searchWord.getWord_counter());
    }

    @Test
    public void check_counter_loop(){
        //arrange
        SearchWord searchWord = new SearchWord();
        //act
        searchWord.setSearch_word("Java8");   
        searchWord.setText("Java8 makes Java more powerful Java8");
        searchWord.search();
        //assert
        assertEquals(2, searchWord.getWord_counter());
    }
}