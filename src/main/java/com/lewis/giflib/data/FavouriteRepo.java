package com.lewis.giflib.data;

import com.lewis.giflib.model.Favourites;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class FavouriteRepo {
    private static final List<Favourites> ALL_FAVOURITES = Arrays.asList(
    new Favourites("Lewis Williams",22),
            new Favourites("Lewis Williams",22),
            new Favourites("Lewis Williams",22),
            new Favourites("Lewis Williams",22),
            new Favourites("Lewis Williams",22)

);


    public List<Favourites> allFavs(){
        return ALL_FAVOURITES;

    }

    public Favourites returnName(String name){
        for(Favourites f : ALL_FAVOURITES){
            if(f.getName().equals(name)){
                return f;
            }
        }

        return null;
    }

}
