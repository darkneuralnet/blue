.class public interface abstract Lxk1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J*\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH&J\u0008\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lxk1;",
        "",
        "Lio/reactivex/Observable;",
        "",
        "W4",
        "Lco/bird/android/model/persistence/Announcement;",
        "announcement",
        "Lio/reactivex/c;",
        "ia",
        "Lco/bird/android/model/constant/AnnouncementContext;",
        "context",
        "",
        "startingBirdCode",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;",
        "nj",
        "l9",
        "announcement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract W4()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end method

.method public abstract ia(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/c;
.end method

.method public abstract l9()V
.end method

.method public abstract nj(Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/persistence/Announcement;Ljava/lang/String;)Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/AnnouncementContext;",
            "Lco/bird/android/model/persistence/Announcement;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;",
            ">;"
        }
    .end annotation
.end method
