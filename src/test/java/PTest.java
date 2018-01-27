import com.sdabyd2.programowanie.PTestImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;


public class PTest {

    @Test
    public void shouldFindLastElementFromList() throws Exception{

        assertThat(PTestImpl.last(asList("a","b","c","d")),is(equalTo("d")));
    }
    @Test
    public void shouldFindListOfNonEmptyList()throws Exception{
        assertThat(PTestImpl.length(
                Arrays.asList(1,2,3,4,5)),
                is(equalTo(5))
        );
    }

    @Test
    public void shouldReverseAList()throws Exception{
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        assertThat(PTestImpl.reverse(
                numbers),
        is(equalTo(Arrays.asList(5,4,3,2,1))));
    }
    @Test
    public void shouldReturnTrueWhenListIsPalindrome() throws Exception{
        assertThat(PTestImpl.isPalindrome(
                Arrays.asList("x","a","m","a","x")
        ));
    }
    @Test
    public void shouldRemoveKthElementFromList()throws Exception{
        Object[] result = PTestImpl.removeAt(
                Arrays.asList("a","b","c","d"),2);
        assertThat(result[0]);
    }

}

