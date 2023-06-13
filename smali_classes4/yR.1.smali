.class public final LyR;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/api/response/WireRatingHistoryResponse;",
        "",
        "birdId",
        "Lco/bird/android/model/persistence/BirdRatingHistory;",
        "a",
        "Lco/bird/android/model/wire/WireFlightSheetRideRating;",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;",
        "b",
        "Lco/bird/android/model/wire/WireFlightSheetRatingTag;",
        "Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;",
        "c",
        "co.bird.android.repository.bird-rating-history"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdRatingHistoryConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryConversion.kt\nco/bird/android/repository/birdratinghistory/converters/BirdRatingHistoryConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1549#2:35\n1620#2,3:36\n1549#2:39\n1620#2,3:40\n*S KotlinDebug\n*F\n+ 1 BirdRatingHistoryConversion.kt\nco/bird/android/repository/birdratinghistory/converters/BirdRatingHistoryConversionKt\n*L\n15#1:35\n15#1:36,3\n16#1:39\n16#1:40,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/api/response/WireRatingHistoryResponse;Ljava/lang/String;)Lco/bird/android/model/persistence/BirdRatingHistory;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/WireRatingHistoryResponse;->getBirdCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/api/response/WireRatingHistoryResponse;->getRatingAverage()D

    move-result-wide v4

    invoke-virtual {p0}, Lco/bird/api/response/WireRatingHistoryResponse;->getRatings()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireFlightSheetRideRating;

    invoke-static {v2}, LyR;->b(Lco/bird/android/model/wire/WireFlightSheetRideRating;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/api/response/WireRatingHistoryResponse;->getTags()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WireFlightSheetRatingTag;

    invoke-static {v0}, LyR;->c(Lco/bird/android/model/wire/WireFlightSheetRatingTag;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p0, Lco/bird/android/model/persistence/BirdRatingHistory;

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/BirdRatingHistory;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireFlightSheetRideRating;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFlightSheetRideRating;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFlightSheetRideRating;->getRating()D

    move-result-wide v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFlightSheetRideRating;->getFeedback()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRating;-><init>(Ljava/lang/String;DLjava/lang/String;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireFlightSheetRatingTag;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFlightSheetRatingTag;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireFlightSheetRatingTag;->getCount()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatingTag;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
