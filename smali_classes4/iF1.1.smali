.class public abstract LiF1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\r0\u000c2\u0006\u0010\u000b\u001a\u00020\u0008H\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\r0\u000f2\u0006\u0010\u000b\u001a\u00020\u0008H\'J#\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00110\u0002\"\u00020\u0011H\'\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\r0\u000c2\u0006\u0010\u000b\u001a\u00020\u0008H\'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\r0\u000f2\u0006\u0010\u000b\u001a\u00020\u0008H\'\u00a8\u0006\u001a"
    }
    d2 = {
        "LiF1;",
        "",
        "",
        "Lco/bird/android/model/persistence/PendingScanEntity;",
        "pendingScans",
        "Lio/reactivex/c;",
        "e",
        "([Lco/bird/android/model/persistence/PendingScanEntity;)Lio/reactivex/c;",
        "",
        "scanIdentifier",
        "a",
        "hardCountSessionId",
        "Lio/reactivex/F;",
        "",
        "c",
        "Lio/reactivex/Observable;",
        "g",
        "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
        "unidentifiedScans",
        "f",
        "([Lco/bird/android/model/persistence/UnidentifiedScanEntity;)Lio/reactivex/c;",
        "b",
        "d",
        "h",
        "<init>",
        "()V",
        "co.bird.android.manager.hardcount"
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

.method public abstract b(Ljava/lang/String;)Lio/reactivex/c;
.end method

.method public abstract c(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/PendingScanEntity;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
            ">;>;"
        }
    .end annotation
.end method

.method public varargs abstract e([Lco/bird/android/model/persistence/PendingScanEntity;)Lio/reactivex/c;
.end method

.method public varargs abstract f([Lco/bird/android/model/persistence/UnidentifiedScanEntity;)Lio/reactivex/c;
.end method

.method public abstract g(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/PendingScanEntity;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/UnidentifiedScanEntity;",
            ">;>;"
        }
    .end annotation
.end method
