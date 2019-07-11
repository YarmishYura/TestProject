import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void getLikes_1(){
        String[] array = new String[0];
        Assert.assertEquals("no likes for this post", Solution.getLikes(array));
    }
    @Test
    public void getLikes_2(){
        String[] array = new String[] {"Peter"};
        Assert.assertEquals("Peter like this post", Solution.getLikes(array));
    }
    @Test
    public void getLikes_3(){
        String[] array = new String[] {"Jacob", "Alex"};
        Assert.assertEquals("Jacob and Alex like this post", Solution.getLikes(array));
    }
    @Test
    public void getLikes_4(){
        String[] array = new  String[] {"Max", "John", "Mark"};
        Assert.assertEquals("Max, John and Mark like this post", Solution.getLikes(array));
    }
    @Test
    public void getLikes_5(){
        String[] array = new String[] {"Alex", "Jacob", "Mark", "Max"};
        Assert.assertEquals("Alex, Jacob and 2 others like this post", Solution.getLikes(array));
    }
    @Test
    public void getLikes_6(){
        String[] array = new String[] {"Jacob", "Jacob"};
        Assert.assertEquals("Jacob like this post", Solution.getLikes(array));
    }
}