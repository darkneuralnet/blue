.class public final LnS1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnS1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic attachParts$default(LnS1;Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Ljava/lang/String;Lco/bird/android/model/RadarTagMetadata;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 1

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, LnS1;->a(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Ljava/lang/String;Lco/bird/android/model/RadarTagMetadata;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: attachParts"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic detachParts$default(LnS1;Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, LnS1;->b(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: detachParts"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
