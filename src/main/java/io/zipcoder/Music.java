package io.zipcoder;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer downIndex;
        Integer upIndex;
        for (upIndex = 0; upIndex < startIndex + 1; upIndex++) {
            if (selection.equals(this.playList[upIndex])) break;
        }
        for (downIndex = startIndex; downIndex < this.playList.length; downIndex++) {
            if(selection.equals(this.playList[downIndex])) break;
        }
        if (downIndex < upIndex) {
            return downIndex;
        } else {
            return upIndex;
        }
    }
}
