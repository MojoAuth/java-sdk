package com.mojoauth.sdk.util;

public interface AsyncHandler<T> {

	public void onSuccess(T data);

	public void onFailure(ErrorResponse errorcode);

}
