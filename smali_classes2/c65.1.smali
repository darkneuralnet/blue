.class public final Lc65;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lb65;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lc65;",
        "Lb65;",
        "LxE;",
        "",
        "remainingSeconds",
        "",
        "Z6",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scope",
        "Lco/bird/android/widget/RideStartInBadAreaView;",
        "b",
        "Lco/bird/android/widget/RideStartInBadAreaView;",
        "rideStartInBadAreaView",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/widget/RideStartInBadAreaView;Lco/bird/android/core/mvp/BaseActivity;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRideStartInBadAreaBannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaBannerUi.kt\nco/bird/android/app/feature/banners/presenter/RideStartInBadAreaBannerUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,26:1\n41#2:27\n*S KotlinDebug\n*F\n+ 1 RideStartInBadAreaBannerUi.kt\nco/bird/android/app/feature/banners/presenter/RideStartInBadAreaBannerUiImpl\n*L\n23#1:27\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/RideStartInBadAreaView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/RideStartInBadAreaView;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 1

    const-string v0, "rideStartInBadAreaView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p1, p0, Lc65;->b:Lco/bird/android/widget/RideStartInBadAreaView;

    return-void
.end method


# virtual methods
.method public Z6(I)V
    .locals 1

    iget-object v0, p0, Lc65;->b:Lco/bird/android/widget/RideStartInBadAreaView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/RideStartInBadAreaView;->r(I)V

    return-void
.end method

.method public scope()Lcom/uber/autodispose/ScopeProvider;
    .locals 2

    iget-object v0, p0, Lc65;->b:Lco/bird/android/widget/RideStartInBadAreaView;

    invoke-static {v0}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    const-string v1, "ViewScopeProvider.from(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
