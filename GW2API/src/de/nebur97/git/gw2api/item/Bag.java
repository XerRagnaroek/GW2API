package de.nebur97.git.gw2api.item;

import de.nebur97.git.gw2api.type.Type;

/**
 * An object representing an inventory bag.
 * 
 * @author NeBuR97
 **/
public class Bag extends Item
{
    private static final long serialVersionUID = 4572375528258362620L;
    
    private boolean noSellSort;
    
    private int size;
    
    public Bag(Item parent)
    {
	super(parent);
	setItemType(Type.BAG);
    }
    
    /**
     * Get the bag's size.
     * 
     * @return size
     */
    public int getSize()
    {
	return size;
    }
    
    @Override
    public Type getType()
    {
	return Type.BAG;
    }
    
    /**
     * Returns whether the bag is affected by sorting or shows up in vendor
     * dialogues.
     * 
     * @return true - the bag is affected by sorting mechanics<br>
     * false - the bag is not affected
     */
    public boolean isNoSellSort()
    {
	return noSellSort;
    }
    
    /**
     * Set the no sell and no sort state.
     * 
     * @param noSellSort
     */
    public void setNoSellSort(boolean noSellSort)
    {
	this.noSellSort = noSellSort;
    }
    
    /**
     * Set the bag's size.
     * 
     * @param size
     */
    public void setSize(int size)
    {
	this.size = size;
    }
}
