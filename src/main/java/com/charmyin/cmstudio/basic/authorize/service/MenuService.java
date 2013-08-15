package com.charmyin.cmstudio.basic.authorize.service;

import java.util.List;

import com.charmyin.cmstudio.basic.authorize.vo.Menu;

public interface MenuService {
	
	/**
	 * Get all the menu items.
	 * Only the developer has this operation. 
	 * @return Menu List
	 */
	public List<Menu> getAllMenu();
	
	/**
	 * Get the children menu of one parent node, only include the second generation.
	 * @param parentId
	 * @return Menu List
	 */
	public List<Menu> getChildrenMenus(int parentId);
	
	/**
	 * Update one menu by id
	 * @param menu
	 */
	public void updateMenu(Menu menu);
	
	/**
	 * Delete menu by id array (int)
	 * @param int array Menu Ids
	 */
	public void deleteMenu(int[] ids);
	
	/**
	 * SearchMenu by menu fields
	 * @param menu
	 * @return Menu List
	 */
	public List<Menu> searchMenu(Menu menu);
	
	/**
	 * Get menu item by its id
	 * @param id
	 * @return Menu Object
	 */
	public Menu getMenuById(int id);
	
	/**
	 * Get the menu owned by a role
	 * @return Menu List
	 */
	public List<Menu> getMenuByRole();
	
	/**
	 * Get the menus owned by a user. (A user has several roles~)
	 * @return Menu List
	 */
	public List<Menu> getMenuByUser();
}