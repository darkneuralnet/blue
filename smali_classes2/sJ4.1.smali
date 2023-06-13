.class public interface abstract LsJ4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LsJ4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H&J,\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H&J&\u0010\r\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H&J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH&J\"\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH&J\u0008\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001d2\u0006\u0010\u001a\u001a\u00020\u000bH&\u00a8\u0006\u001f"
    }
    d2 = {
        "LsJ4;",
        "",
        "",
        "onDestroy",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Lco/bird/android/model/constant/RideRequirementReason;",
        "requirementReason",
        "",
        "userGuestId",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/RideRequirement;",
        "f",
        "a",
        "Lio/reactivex/Observable;",
        "LJ35$a;",
        "e",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "h",
        "",
        "c",
        "rideRequirement",
        "b",
        "d",
        "Lio/reactivex/F;",
        "g",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/RideRequirementReason;Ljava/lang/String;)V
.end method

.method public abstract b(Lco/bird/android/model/RideRequirement;)V
.end method

.method public abstract c()Z
.end method

.method public abstract d(Lco/bird/android/model/RideRequirement;)Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/RideRequirement;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LJ35$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract f(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/RideRequirementReason;Ljava/lang/String;)Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Lco/bird/android/model/constant/RideRequirementReason;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g(Lco/bird/android/model/RideRequirement;)Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/RideRequirement;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract h()Lio/reactivex/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onActivityResult(IILandroid/content/Intent;)V
.end method

.method public abstract onDestroy()V
.end method
