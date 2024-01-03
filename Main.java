// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

    List<String> Favourites = new ArrayList<>();

    Favourites.add("Hunger Games 1");
    Favourites.add("Hunger Games 2");
    Favourites.add("Hunger Games 3");
    Favourites.add("song 1");
    Favourites.add("song 2");
    Favourites.add("song 3");
    Favourites.add("Book 1");
    Favourites.add("Book 2");
    Favourites.add("Book 3");

    Favourites.remove(5);
    for (String Favourite : Favourites)
      {System.out.println(Favourite);};
    
    
    

    

      
    }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}