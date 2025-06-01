package com.sfwonsoft.officialwebsite.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(
	        name = "New.listNews",
	        procedureName = "sp_list_news",
	        resultClasses = New.class
	    )
})
@Data
public class New {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_new;
	private String title;
	private String content;
	private String url_image;
	private LocalDateTime release_new;
}
