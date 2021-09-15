package com.star.alicloud.service;

/**
 * @author: liuxiuxue
 * @date: 2021/7/2 9:39
 */
public class PageQuery {

    private int currentPage =1;

    private int size = 10;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
