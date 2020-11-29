package com.myregion.util;

import java.util.List;

/**
 * Created by Alexander Crepaz on 29.11.2020.
 */

public interface RepositorySingleCallback<T> {
    void onListCallback(T data);
}
