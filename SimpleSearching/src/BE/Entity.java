/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Frederik Jensen
 */
public class Entity implements Comparable<Entity>
{
    private double time;
    private boolean exist;
    private String is;

    public Entity(double time, boolean exist, String is)
    {
        this.time = time;
        this.exist = exist;
        this.is = is;
    }
    
    public double getTime()
    {
        return time;
    }

    public void setTime(double time)
    {
        this.time = time;
    }

    public boolean isExist()
    {
        return exist;
    }

    public void setExist(boolean exist)
    {
        this.exist = exist;
    }

    public String getIs()
    {
        return is;
    }

    public void setIs(String is)
    {
        this.is = is;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Entity other = (Entity) obj;
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time))
        {
            return false;
        }
        if (this.exist != other.exist)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Entity{" + "is=" + is + '}';
    }

    @Override
    public int compareTo(Entity other)
    {
        return this.is.compareTo(other.is);
    }
    
    
    
}
