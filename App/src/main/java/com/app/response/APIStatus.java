package com.app.response;

import java.util.HashMap;
import java.util.Map;

public enum APIStatus {
	OK(200, "OK"), 
	ERROR(300, "ERROR"),
	//////////////////
	// CLIENT SIDE //
	//////////////////
	ERR_BAD_REQUEST(400, "Bad request"), 
	ERR_UNAUTHORIZED(401, "Unauthorized or Access Token is expired"),
	ERR_FORBIDDEN(403, "Forbidden! Access denied"), 
	ERR_BAD_PARAMS(406, "Bad parameters"),
	INVALID_PARAMETER(407, "Invalid parameters"),
	ERR_PROCESS(500, "Lỗi xử lý"),
 
	//notify message product
    ERR_PRODUCT_LIST_IS_EMPTY(116, "Danh sách sản phẩm trống."),//List of product is null
    ERR_PRODUCT_ID_NOT_EXIST(117, "Sản phẩm không tồn tại."),//Product not exists
    ERR_PRODUCT_NAME_ALREADY_EXISTS(118, "Tên sản phẩm đã tồn tại."),//Product already exists
    ERR_CREATE_PRODUCT(119, "Không thể thêm sản phẩm."),//Can't create product
    ERR_UPDATE_PRODUCT(120, "Không thể cập nhật sản phẩm."),//Can't update product
    ERR_PRODUCT_CATEGORY_IS_NULL(121, "Danh mục không được để trống."),//Can't update product
	//notify message category
	ERR_CATEGORY_LIST_IS_EMPTY(156, "Danh sách danh mục trống."),
	ERR_CATEGORY_ID_NOT_EXIST(157, "Danh mục không tồn tại."),
	ERR_CATEGORY_NAME_ALREADY_EXISTS(158, "Danh mục đã tồn tại."),
	ERR_CREATE_CATEGORY(159, "Không thể thêm danh mục."),
	ERR_UPDATE_CATEGORY(160, "Không thể cập nhật danh mục."),
	
	 
	//user
	ERR_USER_ID_NOT_EXIST(157, "User không tồn tại."),
	ERR_USER_NAME_ALREADY_EXISTS(158,"User đã tồn tại."),
	ERR_CREATE_USER(159, "Không thể thêm user."),
	ERR_UPDATE_USER(160, "Không thể cập nhật user."),
	;
	
	private static Map<Integer, APIStatus>   values = new HashMap<Integer, APIStatus>(
			APIStatus.values().length);
	
	private final int code;
	private final String description;
	
	private APIStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
   
	public static APIStatus parseCode(int code) {
		for(APIStatus api : APIStatus.values()) {
			values.put(api.getCode(), api);
		}
		return values.get(code);
	}
	
}
