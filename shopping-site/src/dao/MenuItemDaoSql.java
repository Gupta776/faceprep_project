package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.MenuItem;

public class MenuItemDaoSql implements MenuItemDao {
	private static List<MenuItem> menuItemList;
	@Override
	public List<MenuItem> getMenuItemListAdmin() throws SystemException {
		menuItemList = new ArrayList<MenuItem>();
		Connection connection = null;
		//PreparedStatement preparedStatement = null;
		
		ResultSet resultSet = null;
		try {
			connection = JDBC.getConnection();
			if(connection != null) {
				System.out.println("connectd");
			}
			//String query = "select me_id, me_name, me_price, me_active, me_date_of_launch, me_category, me_free_delivery from menu_item ";
			//preparedStatement = connection.prepareStatement(query);
			//resultSet = preparedStatement.executeQuery();
			Statement stmt = connection.createStatement();
			resultSet = stmt.executeQuery("select me_id, me_name, me_price, me_active, me_date_of_launch, me_category, me_free_delivery from menu_item ");
			while (resultSet.next()) {
				MenuItem menuItem = new MenuItem(resultSet.getLong(1), resultSet.getString(2), resultSet.getFloat(3),
						resultSet.getBoolean(4), resultSet.getDate(5), resultSet.getString(6), resultSet.getBoolean(7));
				System.out.println(resultSet.getLong(1));
				menuItemList.add(menuItem);
			}
		} catch (SQLException sqlException) {
			//throw new SystemException(sqlException.getErrorCode(), sqlException.getMessage());
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
//				if (preparedStatement != null) {
//					preparedStatement.close();
//				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException sqlException) {
				throw new SystemException(sqlException.getErrorCode(), sqlException.getMessage());
			}
		}
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) throws SystemException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) throws SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}
