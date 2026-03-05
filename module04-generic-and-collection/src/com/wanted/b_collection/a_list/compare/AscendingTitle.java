package com.wanted.b_collection.a_list.compare;

import com.wanted.b_collection.a_list.dto.BookDTO;

import java.util.Comparator;

public class AscendingTitle implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }



//    public int compare(BookDTO o1, BookDTO o2) {
//        return Integer.compare(o2.getPrice(), o1.getPrice());
//    }
}
