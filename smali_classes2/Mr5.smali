.class public final LMr5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLr5;
.implements LsS;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ.\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0096\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0096\u0001J\u001b\u0010\u0011\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001J)\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00082\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u0096\u0001R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "LMr5;",
        "LLr5;",
        "LsS;",
        "",
        "resId",
        "",
        "",
        "formatArgs",
        "",
        "getString",
        "(I[Ljava/lang/Object;)Ljava/lang/String;",
        "Lio/reactivex/Observable;",
        "",
        "G1",
        "Lco/bird/android/model/wire/WireRidePrice;",
        "ridePrice",
        "maxLines",
        "Ji",
        "promotionText",
        "holdString",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "af",
        "Lco/bird/android/widget/SelectedBirdRidePriceBannerView;",
        "b",
        "Lco/bird/android/widget/SelectedBirdRidePriceBannerView;",
        "selectedBirdRidePriceBanner",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/widget/SelectedBirdRidePriceBannerView;Lco/bird/android/core/mvp/BaseActivity;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/SelectedBirdRidePriceBannerView;

.field public final synthetic c:LtS;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/SelectedBirdRidePriceBannerView;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 1

    const-string v0, "selectedBirdRidePriceBanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMr5;->b:Lco/bird/android/widget/SelectedBirdRidePriceBannerView;

    new-instance v0, LtS;

    invoke-direct {v0, p1, p2}, LtS;-><init>(LuS;Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object v0, p0, LMr5;->c:LtS;

    return-void
.end method


# virtual methods
.method public G1()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LMr5;->c:LtS;

    invoke-virtual {v0}, LtS;->G1()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public Ji(Lco/bird/android/model/wire/WireRidePrice;I)V
    .locals 1

    iget-object v0, p0, LMr5;->c:LtS;

    invoke-virtual {v0, p1, p2}, LtS;->Ji(Lco/bird/android/model/wire/WireRidePrice;I)V

    return-void
.end method

.method public af(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRidePrice;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "ridePrice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promotionText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMr5;->c:LtS;

    invoke-virtual {v0, p1, p2, p3}, LtS;->af(Lco/bird/android/model/wire/WireRidePrice;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "formatArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LMr5;->c:LtS;

    invoke-virtual {v0, p1, p2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
