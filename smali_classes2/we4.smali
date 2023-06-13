.class public final Lwe4;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lve4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001b"
    }
    d2 = {
        "Lwe4;",
        "Lve4;",
        "LxE;",
        "Lio/reactivex/Observable;",
        "",
        "t4",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Landroid/location/Location;",
        "currentLocation",
        "W7",
        "",
        "show",
        "k",
        "Lco/bird/android/widget/QuickStartUnselectedBannerView;",
        "b",
        "Lco/bird/android/widget/QuickStartUnselectedBannerView;",
        "quickStartUnselectedBanner",
        "Landroid/widget/ProgressBar;",
        "kotlin.jvm.PlatformType",
        "c",
        "Landroid/widget/ProgressBar;",
        "secondaryProgressBar",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/widget/QuickStartUnselectedBannerView;Lco/bird/android/core/mvp/BaseActivity;)V",
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
.field public final b:Lco/bird/android/widget/QuickStartUnselectedBannerView;

.field public final c:Landroid/widget/ProgressBar;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/QuickStartUnselectedBannerView;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 1

    const-string v0, "quickStartUnselectedBanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p1, p0, Lwe4;->b:Lco/bird/android/widget/QuickStartUnselectedBannerView;

    sget p1, LVg4;->secondaryProgressBar:I

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lwe4;->c:Landroid/widget/ProgressBar;

    return-void
.end method


# virtual methods
.method public W7(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V
    .locals 1

    const-string v0, "currentLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe4;->b:Lco/bird/android/widget/QuickStartUnselectedBannerView;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/widget/QuickStartUnselectedBannerView;->setBird(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V

    return-void
.end method

.method public k(Z)V
    .locals 4

    iget-object v0, p0, Lwe4;->c:Landroid/widget/ProgressBar;

    const-string v1, "secondaryProgressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public t4()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwe4;->b:Lco/bird/android/widget/QuickStartUnselectedBannerView;

    invoke-virtual {v0}, Lco/bird/android/widget/QuickStartUnselectedBannerView;->r()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "quickStartUnselectedBanner.quickStartClicks()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
