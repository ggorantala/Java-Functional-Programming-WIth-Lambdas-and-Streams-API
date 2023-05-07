package src.dev.ggorantala.streamsapi.model;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public record Book(
    String title,
    String author,
    Integer year,
    Integer copiesSold,
    Double rating,
    Double costInEuros) {}
