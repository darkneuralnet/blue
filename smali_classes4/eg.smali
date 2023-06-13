.class public abstract Leg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\u0008H\'J#\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000c\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\'\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\r2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0005H\'J\u0008\u0010\u0013\u001a\u00020\rH\'\u00a8\u0006\u0016"
    }
    d2 = {
        "Leg;",
        "",
        "Lco/bird/android/model/constant/AnnouncementContext;",
        "context",
        "Lio/reactivex/Observable;",
        "",
        "Lco/bird/android/model/persistence/Announcement;",
        "a",
        "Lco/bird/android/model/constant/AnnouncementDisplayType;",
        "displayType",
        "b",
        "",
        "announcement",
        "Lio/reactivex/c;",
        "d",
        "([Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/c;",
        "",
        "retainedAnnouncementIds",
        "e",
        "c",
        "<init>",
        "()V",
        "co.bird.android.lib.persistence.announcements.api"
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
.method public abstract a(Lco/bird/android/model/constant/AnnouncementContext;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AnnouncementContext;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/android/model/constant/AnnouncementDisplayType;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AnnouncementDisplayType;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Announcement;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c()Lio/reactivex/c;
.end method

.method public varargs abstract d([Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/c;
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
