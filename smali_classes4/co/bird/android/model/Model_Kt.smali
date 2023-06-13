.class public final Lco/bird/android/model/Model_Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u00a2\u0006\u0002\u0010\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\u0008\u001a\u00020\t*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\u000b\u001a\u0011\u0010\u000c\u001a\u0004\u0018\u00010\r*\u00020\u0002\u00a2\u0006\u0002\u0010\u000e\u001a\u000c\u0010\u000f\u001a\u00020\r*\u0004\u0018\u00010\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "averageScore",
        "",
        "Lco/bird/android/model/ScoredDrop;",
        "(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Double;",
        "",
        "currentTimerState",
        "Lco/bird/android/model/TimerState;",
        "Lco/bird/android/model/wire/WireRide;",
        "currentTimerValueSeconds",
        "",
        "durationSeconds",
        "Lco/bird/android/model/Reservation;",
        "isGood",
        "",
        "(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Boolean;",
        "isUSA",
        "Lco/bird/android/model/Country;",
        "url",
        "",
        "Lco/bird/android/model/Link;",
        "app_birdRelease"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nModel+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Model+.kt\nco/bird/android/model/Model_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1603#2,9:73\n1855#2:82\n1856#2:84\n1612#2:85\n1549#2:87\n1620#2,3:88\n1#3:83\n1#3:86\n*S KotlinDebug\n*F\n+ 1 Model+.kt\nco/bird/android/model/Model_Kt\n*L\n51#1:73,9\n51#1:82\n51#1:84\n51#1:85\n55#1:87\n55#1:88,3\n51#1:83\n*E\n"
    }
.end annotation


# direct methods
.method public static final averageScore(Ljava/util/List;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/ScoredDrop;",
            ">;)D"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/ScoredDrop;

    invoke-static {v1}, Lco/bird/android/model/Model_Kt;->averageScore(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->averageOfDouble(Ljava/lang/Iterable;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static final averageScore(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Double;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/ScoredDrop;->getScoreReports()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/ScoredDrop;->getScoreReports()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/DropScoreReport;

    invoke-virtual {v1}, Lco/bird/android/model/DropScoreReport;->getScore()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->averageOfDouble(Ljava/lang/Iterable;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static final currentTimerState(Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/TimerState;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getDelivery()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getPayAsYouGo()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getDeliveryUnlockedAt()Lorg/joda/time/DateTime;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lco/bird/android/model/TimerState;->STOPPED:Lco/bird/android/model/TimerState;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/TimerState;->INCREASING:Lco/bird/android/model/TimerState;

    goto :goto_0

    :cond_1
    sget-object p0, Lco/bird/android/model/TimerState;->INCREASING:Lco/bird/android/model/TimerState;

    :goto_0
    return-object p0
.end method

.method public static final currentTimerValueSeconds(Lco/bird/android/model/wire/WireRide;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getDelivery()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getPayAsYouGo()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getDeliveryUnlockedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireRide;->getCompletedAt()Lorg/joda/time/DateTime;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p0

    :cond_1
    invoke-static {v0, p0}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final durationSeconds(Lco/bird/android/model/Reservation;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Reservation;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/Reservation;->getCompletedAt()Lorg/joda/time/DateTime;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p0

    :cond_0
    invoke-static {v0, p0}, Lorg/joda/time/Seconds;->secondsBetween(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Seconds;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/Seconds;->getSeconds()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isGood(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/android/model/Model_Kt;->averageScore(Lco/bird/android/model/ScoredDrop;)Ljava/lang/Double;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return-object p0
.end method

.method public static final isUSA(Lco/bird/android/model/Country;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/model/Country;->getCode()Ljava/lang/String;

    move-result-object p0

    const-string v0, "US"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final url(Lco/bird/android/model/Link;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/Link;->getCode()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://gift.bird.co/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
