.class public abstract LlH1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\'J\u001e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\'J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u0015"
    }
    d2 = {
        "LlH1;",
        "",
        "Lco/bird/android/model/persistence/HardCountScan;",
        "hardCountScan",
        "Lio/reactivex/c;",
        "e",
        "",
        "hardCountSessionId",
        "birdId",
        "Lio/reactivex/p;",
        "c",
        "scanIdentifier",
        "d",
        "Lio/reactivex/k;",
        "",
        "b",
        "a",
        "Lio/reactivex/Observable;",
        "f",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.hard-count.api"
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
.method public abstract a(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract b(Ljava/lang/String;)Lio/reactivex/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lco/bird/android/model/persistence/HardCountScan;)Lio/reactivex/c;
.end method

.method public abstract f(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;"
        }
    .end annotation
.end method
