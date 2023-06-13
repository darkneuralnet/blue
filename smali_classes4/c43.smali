.class public final Lc43;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireNestMarker;",
        "Lco/bird/android/model/persistence/NestMarker;",
        "a",
        "Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;",
        "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
        "b",
        "nest-marker_release"
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
        "SMAP\nNestMarkerConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerConversion.kt\nco/bird/android/repository/nestmarker/conversion/NestMarkerConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n*S KotlinDebug\n*F\n+ 1 NestMarkerConversion.kt\nco/bird/android/repository/nestmarker/conversion/NestMarkerConversionKt\n*L\n24#1:36\n24#1:37,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireNestMarker;)Lco/bird/android/model/persistence/NestMarker;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getLocation()Lco/bird/android/model/wire/WireCoordinate;

    move-result-object v0

    invoke-static {v0}, LqB0;->c(Lco/bird/android/model/wire/WireCoordinate;)Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getCapacity()I

    move-result v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getState()Lco/bird/android/model/constant/NestViewState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NestViewState;->UNKNOWN:Lco/bird/android/model/constant/NestViewState;

    const/4 v5, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getState()Lco/bird/android/model/constant/NestViewState;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v1

    sget-object v6, Lco/bird/android/model/constant/NestIcon;->UNKNOWN:Lco/bird/android/model/constant/NestIcon;

    if-eq v1, v6, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getIcon()Lco/bird/android/model/constant/NestIcon;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getSecondaryIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getSecondaryIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, v5

    :goto_2
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getSecondaryIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    move-object v9, v1

    goto :goto_3

    :cond_3
    move-object v9, v5

    :goto_3
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getProminence()Lco/bird/android/model/constant/NestProminence;

    move-result-object v10

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v11

    const-string v1, "now()"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestMarker;->getAvailableSpaceDetails()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;

    invoke-static {v1}, Lc43;->b(Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;)Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;

    move-result-object v1

    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    new-instance p0, Lco/bird/android/model/persistence/NestMarker;

    move-object v1, p0

    move-object v5, v0

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/persistence/NestMarker;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;)Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->getCount()I

    move-result v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNestAvailableSpaceDetail;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;-><init>(ILco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/constant/ClientIcon;)V

    return-object v0
.end method
