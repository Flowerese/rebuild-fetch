/*
rebuild - Building your system freely.
Copyright (C) 2019 devezhao <zhaofang123@gmail.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

package com.rebuild.server.service.base;

/**
 * TODO
 * 
 * @author devezhao zhaofang123@gmail.com
 * @since 2019/03/23
 */
public class BulkOperatorTx {
	
	private static final ThreadLocal<Object> STATE = new ThreadLocal<>();

	/**
	 */
	public static void begin() {
		STATE.set(new Object());
	}
	
	/**
	 * @return
	 */
	public static boolean isInTx() {
		return STATE.get() != null;
	}
	
	/**
	 */
	public static void end() {
		STATE.remove();
	}
}
