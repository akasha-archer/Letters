package nyc.c4q.akashaarcher.majorkeys.backend;

import java.util.List;

import nyc.c4q.akashaarcher.majorkeys.model.Key;

/**
 * Created by akashaarcher on 1/11/17.
 */

public class KeyResponse {


    private boolean success;
    List<Key> keys;


    public List<Key> getKeys(){
        return keys;
    }
}
