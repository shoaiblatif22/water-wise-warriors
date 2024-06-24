package com.water_wise_warriors.api.model;


import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommentTests {

    @Test
    public void commentHasContent() {
        Comment comment = new Comment("This is comment content", "ukc2102-03600", "Laura");
        assertEquals("This is comment content", comment.getContent());
    }

    @Test
    public void commentHasEubwid() {
        Comment comment = new Comment("This is comment content", "ukc2102-03600", "Laura");
        assertEquals("ukc2102-03600", comment.getEubwid());
    }

    @Test
    public void commentCanHaveAuthor() {
        Comment comment = new Comment("This is comment content", "ukc2102-03600", "Laura");
        assertEquals("Laura", comment.getAuthor());
    }

    @Test
    public void commentCanHaveNullAuthor() {
        Comment comment = new Comment("This is comment content", "ukc2102-03600", null);
        assertNull(comment.getAuthor());
    }

//    @Test
//    public void commentHasTimestamp() {
//        Comment comment = new Comment("This is comment content", "ukc2102-03600", null);
//        assertEquals(new Timestamp(10000), comment.getCreatedAt());
//    }
}
