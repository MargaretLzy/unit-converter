/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.vassar.unitConverter;

/**
 *
 * @author Middle-Earth (Middle-Left group)
 */
public interface ConversionsTemplate {

    /**
     * CONVERTDISTANCE
     *
     * @param unitAndValSource, a string in the format "unit_value", e.g.
     * "feet_10.9"
     * @param targetUnit, a string containing unit to convert to, e.g. "meters"
     * @return a string containing the target unit and converted value, e.g.
     * "meters_3.32232"
     */
    public String convertDistance(String unitAndValSource, String targetUnit);

    /**
     * CONVERTAREAS
     * @param unitAndValSource, a string in the format "unit_value",
     *  e.g. "feet_10.9"
     * @param targetUnit, a string containing unit to convert to,
     *  e.g. "meters"
     * @return a string containing the target unit and converted value,
     *  e.g. "meters_3.32232"
     */
    public String convertAreas(String unitAndValSource, String targetUnit);

    /**
     * CONVERTVOLUME
     * @param unitAndValSource, a string in the format "unit_value",
     *  e.g. "feet_10.9"
     * @param targetUnit, a string containing unit to convert to,
     *  e.g. "meters"
     * @return a string containing the target unit and converted value,
     *  e.g. "meters_3.32232"
     */
    public String convertVolume(String unitAndValSource, String targetUnit);

    /**
     * CONVERTTEMPERATURES
     * @param unitAndValSource, a string in the format "unit_value",
     *  e.g. "feet_10.9"
     * @param targetUnit, a string containing unit to convert to,
     *  e.g. "meters"
     * @return a string containing the target unit and converted value,
     *  e.g. "meters_3.32232"
     */
    public String convertTemperatures(String unitAndValSource, String targetUnit);

}
