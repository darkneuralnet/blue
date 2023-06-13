.class public final LJI6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0008\u001a\n\u0010\r\u001a\u00020\u000c*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireZoneFlightSheetDetails;",
        "",
        "zoneId",
        "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
        "a",
        "Lco/bird/android/model/wire/WireZoneSummary;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;",
        "f",
        "Lco/bird/android/model/wire/WireZoneStatus;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;",
        "e",
        "Lco/bird/android/model/wire/WireZoneFlightSheetIcon;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;",
        "d",
        "Lco/bird/android/model/wire/WireZoneDetails;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
        "c",
        "Lco/bird/android/model/wire/WireZoneDetail;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;",
        "b",
        "zone_release"
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
        "SMAP\nZoneFlightSheetConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetConversions.kt\nco/bird/android/repository/zone/conversion/ZoneFlightSheetConversionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetConversions.kt\nco/bird/android/repository/zone/conversion/ZoneFlightSheetConversionsKt\n*L\n22#1:69\n22#1:70,3\n55#1:73\n55#1:74,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/ZoneFlightSheetDetails;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->getZoneSummary()Lco/bird/android/model/wire/WireZoneSummary;

    move-result-object v0

    invoke-static {v0}, LJI6;->f(Lco/bird/android/model/wire/WireZoneSummary;)Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->getZoneStatus()Lco/bird/android/model/wire/WireZoneStatus;

    move-result-object v1

    invoke-static {v1}, LJI6;->e(Lco/bird/android/model/wire/WireZoneStatus;)Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->getDetailSections()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireZoneDetails;

    invoke-static {v3}, LJI6;->c(Lco/bird/android/model/wire/WireZoneDetails;)Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;

    invoke-direct {p0, p1, v0, v1, v2}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)V

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireZoneDetail;)Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetail;->getDetails()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetail;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetail;->getIcon()Lco/bird/android/model/wire/WireZoneFlightSheetIcon;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, LJI6;->d(Lco/bird/android/model/wire/WireZoneFlightSheetIcon;)Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v5, v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetail;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireZoneDetails;)Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetails;->getIdx()I

    move-result v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetails;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneDetails;->getDetails()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireZoneDetail;

    invoke-static {v3}, LJI6;->b(Lco/bird/android/model/wire/WireZoneDetail;)Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;

    invoke-direct {p0, v0, v1, v2}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final d(Lco/bird/android/model/wire/WireZoneFlightSheetIcon;)Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneFlightSheetIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneFlightSheetIcon;->getIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;-><init>(Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/wire/WireZoneStatus;)Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneStatus;->getIdx()I

    move-result v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneStatus;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneStatus;->getDetails()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneStatus;->getIcon()Lco/bird/android/model/wire/WireZoneFlightSheetIcon;

    move-result-object v1

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LJI6;->d(Lco/bird/android/model/wire/WireZoneFlightSheetIcon;)Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneStatus;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneStatus;->getIconBackgroundColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v5

    :goto_1
    move-object v1, v0

    move-object v5, v6

    move-object v6, v7

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method

.method public static final f(Lco/bird/android/model/wire/WireZoneSummary;)Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneSummary;->getIdx()I

    move-result v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneSummary;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;-><init>(ILjava/lang/String;)V

    return-object v0
.end method
