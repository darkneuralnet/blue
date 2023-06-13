.class public interface abstract Lea5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00030\u0002H\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u00030\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "Lea5;",
        "",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
        "c",
        "Lco/bird/api/response/BeginnerModeRiderMapResponse;",
        "a",
        "Lco/bird/api/response/RiderProfileBody;",
        "body",
        "Lco/bird/api/response/RiderProfileResponse;",
        "b",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract a()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "rider-profile/ui/beginner-mode-options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/BeginnerModeRiderMapResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lco/bird/api/response/RiderProfileBody;)Lio/reactivex/F;
    .param p1    # Lco/bird/api/response/RiderProfileBody;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LCD3;
        value = "rider-profile"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/RiderProfileBody;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/RiderProfileResponse;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract c()Lio/reactivex/F;
    .annotation runtime LNA1;
        value = "rider-profile/ui/beginner-mode-onboarding"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/BeginnerModeOnboardingResponse;",
            ">;>;"
        }
    .end annotation
.end method
