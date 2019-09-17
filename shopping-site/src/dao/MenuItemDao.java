package dao;

import java.util.List;

import model.MenuItem;

public interface MenuItemDao {
	public List<MenuItem> getMenuItemListAdmin() throws SystemException;

	public List<MenuItem> getMenuItemListCustomer() throws SystemException;

	public void modifyMenuItem(MenuItem menuItem) throws SystemException;

	public MenuItem getMenuItem(long menuItemId) throws SystemException;

}
