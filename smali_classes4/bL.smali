.class public abstract LbL;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\"\u0010#J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\'J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0004H\'J\u0016\u0010\u000f\u001a\u00020\r2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\'J#\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\'\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0008\u0010\u0015\u001a\u00020\rH\'J\u0016\u0010\u0017\u001a\u00020\r2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\'J)\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00032\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H%\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H%\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0003H%J#\u0010!\u001a\u00020\u001c2\u0012\u0010\u0018\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0010\"\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008!\u0010\u001e\u00a8\u0006$"
    }
    d2 = {
        "LbL;",
        "",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/Bird;",
        "h",
        "",
        "id",
        "a",
        "ids",
        "Lio/reactivex/k;",
        "b",
        "bird",
        "Lio/reactivex/c;",
        "f",
        "g",
        "",
        "Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;",
        "markerUpdates",
        "k",
        "([Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;)Lio/reactivex/c;",
        "c",
        "birdIds",
        "i",
        "birds",
        "",
        "e",
        "([Lco/bird/android/model/persistence/Bird;)Ljava/util/List;",
        "",
        "j",
        "([Lco/bird/android/model/persistence/Bird;)V",
        "rowids",
        "d",
        "l",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.bird.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/util/List;)Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c()Lio/reactivex/c;
.end method

.method public abstract d(Ljava/util/List;)Ljava/util/List;
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

.method public varargs abstract e([Lco/bird/android/model/persistence/Bird;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lco/bird/android/model/persistence/Bird;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;
.end method

.method public abstract g(Ljava/util/List;)Lio/reactivex/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation
.end method

.method public abstract h()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract i(Ljava/util/List;)Lio/reactivex/c;
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

.method public varargs abstract j([Lco/bird/android/model/persistence/Bird;)V
.end method

.method public varargs abstract k([Lco/bird/android/model/persistence/update/BirdMapMarkerUpdate;)Lio/reactivex/c;
.end method

.method public varargs l([Lco/bird/android/model/persistence/Bird;)V
    .locals 2

    const-string v0, "birds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, LbL$a;

    invoke-direct {v0, p0}, LbL$a;-><init>(LbL;)V

    const/16 v1, 0x3e7

    invoke-static {p1, v1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/util/List;

    return-void
.end method
