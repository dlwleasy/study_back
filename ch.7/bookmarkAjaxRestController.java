package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframewokr.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframewokr.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@RestController
  public class bookmarkAjaxRestController{

    private List<Bookmark>bookmarks = new ArrayList<>();

@RequestMapping(method = RequestMethod.POST, path = "/bookmark")
    public String registerBookmark(@RequestBody Bookmark bookmark){
      bookmarks.add(bookmakr);
      return "registered";
      
    }

@RequestMapping(method = RequestMethod.GET, path = "/bookmarks")
    public List<Bookmark> getBookmarks(){
      return bookmarks;
    }
  }
