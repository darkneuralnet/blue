.class public final LNU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMU4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\n\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "LNU4;",
        "LMU4;",
        "Lio/reactivex/Observable;",
        "",
        "a",
        "",
        "Lco/bird/android/model/persistence/RidePassView;",
        "ridePasses",
        "",
        "alwaysShowStaticTitle",
        "b",
        "Lco/bird/android/feature/ridepass/view/RidePassBannerView;",
        "Lco/bird/android/feature/ridepass/view/RidePassBannerView;",
        "ridePassBannerView",
        "<init>",
        "(Lco/bird/android/feature/ridepass/view/RidePassBannerView;)V",
        "ride-pass_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/ridepass/view/RidePassBannerView;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/ridepass/view/RidePassBannerView;)V
    .locals 1

    const-string v0, "ridePassBannerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNU4;->a:Lco/bird/android/feature/ridepass/view/RidePassBannerView;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LNU4;->a:Lco/bird/android/feature/ridepass/view/RidePassBannerView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "ridePasses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNU4;->a:Lco/bird/android/feature/ridepass/view/RidePassBannerView;

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, LNU4;->a:Lco/bird/android/feature/ridepass/view/RidePassBannerView;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/feature/ridepass/view/RidePassBannerView;->e(Ljava/util/List;Z)V

    return-void
.end method
