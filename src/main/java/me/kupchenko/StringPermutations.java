package me.kupchenko;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

    public Set<String> permute(String input) {
        return permutations(input);
    }

    private Set<String> permutations(String str) {
        if (str.isEmpty()) {
            return Collections.singleton(str);
        } else {
            Set<String> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++)
                for (String s : permutations(str.substring(0, i) + str.substring(i + 1)))
                    set.add(str.charAt(i) + s);
            return set;
        }
    }


}
