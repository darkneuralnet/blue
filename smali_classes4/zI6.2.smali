.class public final LzI6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireZoneAssignmentGroup;",
        "Lco/bird/android/model/persistence/ZoneAssignmentGroup;",
        "a",
        "Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;",
        "d",
        "Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;",
        "b",
        "Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;",
        "c",
        "co.bird.android.repository.release-assignment"
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
        "SMAP\nZoneAssignmentGroupConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneAssignmentGroupConversion.kt\nco/bird/android/repository/releaseassignment/converters/ZoneAssignmentGroupConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1549#2:58\n1620#2,3:59\n1549#2:62\n1620#2,3:63\n1549#2:66\n1620#2,3:67\n*S KotlinDebug\n*F\n+ 1 ZoneAssignmentGroupConversion.kt\nco/bird/android/repository/releaseassignment/converters/ZoneAssignmentGroupConversionKt\n*L\n19#1:58\n19#1:59,3\n20#1:62\n20#1:63,3\n45#1:66\n45#1:67,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireZoneAssignmentGroup;)Lco/bird/android/model/persistence/ZoneAssignmentGroup;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentGroup;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentGroup;->getColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v0

    invoke-static {v0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentGroup;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentGroup;->getEmptyText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentGroup;->getReleaseAssignments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;

    invoke-static {v7}, LzI6;->d(Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentGroup;->getCappedZoneReservationGroups()Ljava/util/List;

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

    check-cast v0, Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;

    invoke-static {v0}, LzI6;->b(Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p0, Lco/bird/android/model/persistence/ZoneAssignmentGroup;

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/ZoneAssignmentGroup;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;->getZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;->getZoneCenterPoint()Lco/bird/android/model/Point;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedReservationGroup;->getCappedZoneReservations()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;

    invoke-static {v4}, LzI6;->c(Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;

    invoke-direct {p0, v0, v1, v2, v3}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;-><init>(Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;->getBirdCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;->getTimeRemaining()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;->getBatteryLevel()I

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedZoneReservation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;)Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getZoneId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getZoneCenterPoint()Lco/bird/android/model/Point;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDescriptionLeadingIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDescriptionLeadingIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v1

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object v8, v7

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDescription()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDescriptionSubtitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDueAt()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDueAtTrailingIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v12

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireZoneAssignmentReleaseAssignment;->getDueAtTrailingIconColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v7

    :goto_1
    move-object v1, v0

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, p0

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/Point;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object v0
.end method
