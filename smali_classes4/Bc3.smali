.class public abstract LBc3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\'\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\t0\u0008H\'J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\t0\u00082\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u0008\u0010\u0010\u001a\u00020\u0005H\'J\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\'\u00a8\u0006\u0016"
    }
    d2 = {
        "LBc3;",
        "",
        "",
        "Lco/bird/android/model/persistence/Notification;",
        "notifications",
        "Lio/reactivex/c;",
        "c",
        "([Lco/bird/android/model/persistence/Notification;)Lio/reactivex/c;",
        "Lio/reactivex/Observable;",
        "",
        "f",
        "",
        "id",
        "d",
        "groupId",
        "e",
        "a",
        "Lio/reactivex/p;",
        "Lorg/joda/time/DateTime;",
        "b",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.notificationcenter.api"
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

.method public abstract b()Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract c([Lco/bird/android/model/persistence/Notification;)Lio/reactivex/c;
.end method

.method public abstract d(Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/Notification;",
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
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Notification;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract f()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Notification;",
            ">;>;"
        }
    .end annotation
.end method
