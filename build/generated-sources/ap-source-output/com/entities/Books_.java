package com.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-15T14:39:54")
@StaticMetamodel(Books.class)
public class Books_ { 

    public static volatile SingularAttribute<Books, String> author;
    public static volatile SingularAttribute<Books, Integer> price;
    public static volatile SingularAttribute<Books, Integer> isbn;
    public static volatile SingularAttribute<Books, Integer> rating;
    public static volatile SingularAttribute<Books, Integer> available;
    public static volatile SingularAttribute<Books, String> bookName;

}