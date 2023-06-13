.class public abstract LM00;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\'J\u0008\u0010\u0007\u001a\u00020\u0006H\'J\u0016\u0010\n\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0003H\'J)\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H%\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H%\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0003H%J#\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0015\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0016\u0010\u0012\u00a8\u0006\u0019"
    }
    d2 = {
        "LM00;",
        "",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/BountyMapMarker;",
        "a",
        "Lio/reactivex/c;",
        "b",
        "",
        "ids",
        "e",
        "",
        "bountyMapMarker",
        "",
        "d",
        "([Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/util/List;",
        "",
        "f",
        "([Lco/bird/android/model/persistence/BountyMapMarker;)V",
        "rowids",
        "c",
        "bountyMapMarkers",
        "g",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.bounty-flight-sheet.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBountyMapMarkerDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMapMarkerDao.kt\nco/bird/android/persistence/bountyflightsheet/api/BountyMapMarkerDao\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,43:1\n4117#2:44\n4217#2,2:45\n37#3,2:47\n*S KotlinDebug\n*F\n+ 1 BountyMapMarkerDao.kt\nco/bird/android/persistence/bountyflightsheet/api/BountyMapMarkerDao\n*L\n38#1:44\n38#1:45,2\n39#1:47,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BountyMapMarker;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b()Lio/reactivex/c;
.end method

.method public abstract c(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract d([Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lco/bird/android/model/persistence/BountyMapMarker;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public varargs abstract f([Lco/bird/android/model/persistence/BountyMapMarker;)V
.end method

.method public varargs g([Lco/bird/android/model/persistence/BountyMapMarker;)V
    .locals 7

    const-string v0, "bountyMapMarkers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p0, v0}, LM00;->d([Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, LM00;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, p1, v4

    invoke-virtual {v5}, Lco/bird/android/model/persistence/BountyMapMarker;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v3, [Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-interface {v1, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/BountyMapMarker;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-virtual {p0, p1}, LM00;->f([Lco/bird/android/model/persistence/BountyMapMarker;)V

    return-void
.end method
