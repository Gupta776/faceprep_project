package dao;

 import model.Cart;
 
public interface CartDao {
	public void addCartItem(long userId, long menuItemId) throws SystemException;

	public void removeCartItem(long userId, long menuItemId) throws SystemException;

	public Cart getAllCartItems(long userId) throws CartEmptyException, SystemException;
}
