package de.nebur97.git.gw2api.item;

import de.nebur97.git.gw2api.type.Type;
import de.nebur97.git.gw2api.type.gizmo.GizmoType;

/**
 * A Gizmo item.
 * 
 * @author NeBuR97
 * 
 */
public class Gizmo extends Item
{
    private static final long serialVersionUID = -3504473715660108829L;
    
    private GizmoType type;
    
    public Gizmo(Item parent)
    {
	super(parent);
	setItemType(Type.GIZMO);
    }
    
    @Override
    public GizmoType getType()
    {
	return type;
    }
    
    /**
     * @see #setType(String)
     * @param gt
     */
    public void setType(String s)
    {
	try {
	    setType(GizmoType.valueOf(s.toUpperCase()));
	}
	catch(Exception e) {
	    e.printStackTrace();
	}
	
    }
    
}
