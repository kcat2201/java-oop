package org.coba.service;

import org.coba.logic.Sort;

import java.util.List;

public class SortService {

    //DI(의존성 주입)
    private final Sort<String> sort; //생성자에서 한번만 세팅하니까 final 키워드 사용 가능

    //CI(생성자주입)
    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
//        Sort<String> sort=new JavaSort<>();
        return sort.sort(list);
    }

}