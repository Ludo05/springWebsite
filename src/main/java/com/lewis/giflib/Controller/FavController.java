package com.lewis.giflib.Controller;

import com.lewis.giflib.data.FavouriteRepo;
import com.lewis.giflib.model.Favourites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavController {

    @Autowired
    private FavouriteRepo favouriteRepo;


    @RequestMapping("/favourites")
    public String allfavourites(ModelMap modelMap){
        List<Favourites> favourites = favouriteRepo.allFavs();
        modelMap.put("fav",favourites);
        return "favourites";
    }



}
