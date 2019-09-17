package dao;

import java.util.List;

import model.MenuItem;

public class MenuItemDaoSqlImplTest {

	public static void main(String[] args) throws SystemException {
		// TODO Auto-generated method stub
		System.out.println("**********************");
		System.out.println("Admin List");
		System.out.println("**********************");
		testGetMenuItemListAdmin();
	}

	private static void testGetMenuItemListAdmin() throws SystemException {
		// TODO Auto-generated method stub
		MenuItemDao menuItemDao = new MenuItemDaoSql();
		List<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();
		System.out.println(menuItemList.size());
		for (int i = 0; i < menuItemList.size(); i++) {
			System.out.println(menuItemList.get(i));
		}
	}
	

}
