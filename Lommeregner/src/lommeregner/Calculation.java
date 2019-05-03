/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lommeregner;

/**
 *
 * @author Frederik Jensen
 */
public class Calculation
{

    public double calculateCubeVolume(double width, double height, double length)
    {
        double volume = width * height * length;
        return volume;
    }
    
    public double calculateCubeSize(double volume, double size1, double size2) {
        double size3 = volume / (size1*size2);
        return size3;
    }
}
