/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe.level.data;

import java.util.HashMap;
import javafx.util.StringConverter;

/**
 *
 * @author Christos
 */
public class GemToString extends StringConverter<Gem> {

    private HashMap<String, Gem> map = new HashMap<>();

    @Override
    public Gem fromString(String string) {
        if (!map.containsKey(string)) {
            return null;
        }
        return map.get(string);
    }

    @Override
    public String toString(Gem t) {
        if (t != null) {
            String str = t.getGemName();
            map.put(str, t);
            return str;
        } else {
            return "";
        }
    }
}
