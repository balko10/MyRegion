package com.myregion.util;

import java.util.List;

/**
 * Created by Alexander Crepaz on 29.11.2020.
 */

public interface RepositoryListCallback<T> {
    void onListCallback(List<T> data);
}
