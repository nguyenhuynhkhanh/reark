package com.tehmou.rxbookapp.network;

import android.support.annotation.NonNull;

import com.tehmou.rxandroidarchitecture.utils.Preconditions;
import com.tehmou.rxbookapp.pojo.GitHubRepository;

import java.util.List;

/**
 * Created by ttuo on 11/01/15.
 */
public class GitHubRepositorySearchResults {

    @NonNull
    final private List<GitHubRepository> items;

    public GitHubRepositorySearchResults(@NonNull final List<GitHubRepository> items) {
        Preconditions.checkNotNull(items, "GitHub Repository Items cannot be null.");

        this.items = items;
    }

    @NonNull
    public List<GitHubRepository> getItems() {
        return items;
    }
}