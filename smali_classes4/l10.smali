.class public abstract Ll10;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\t0\u0008H\'J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\'J\u0016\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\u000e\u001a\u00020\u000bH\'J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\'\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u0008\u0010\u0015\u001a\u00020\u0005H\'\u00a8\u0006\u0018"
    }
    d2 = {
        "Ll10;",
        "",
        "",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "Lio/reactivex/c;",
        "b",
        "([Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;",
        "Lio/reactivex/Observable;",
        "",
        "f",
        "",
        "imei",
        "e",
        "birdId",
        "d",
        "",
        "status",
        "g",
        "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;",
        "c",
        "a",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.brain-swap.api"
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
.method public abstract a()Lio/reactivex/c;
.end method

.method public varargs abstract b([Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/BrainSwapRecord;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;
.end method
