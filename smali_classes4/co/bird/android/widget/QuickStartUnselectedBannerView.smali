.class public final Lco/bird/android/widget/QuickStartUnselectedBannerView;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u001b\u0008\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001e\u0010\"B#\u0008\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008\u001e\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J*\u0010\n\u001a&\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00060\u0006 \t*\u0012\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00080\u0008J\u0008\u0010\u000b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006&"
    }
    d2 = {
        "Lco/bird/android/widget/QuickStartUnselectedBannerView;",
        "Landroidx/cardview/widget/CardView;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "Landroid/location/Location;",
        "currentLocation",
        "",
        "setBird",
        "Lio/reactivex/Observable;",
        "kotlin.jvm.PlatformType",
        "r",
        "s",
        "Landroid/widget/ImageView;",
        "k",
        "Landroid/widget/ImageView;",
        "birdIconImageView",
        "Landroid/widget/TextView;",
        "l",
        "Landroid/widget/TextView;",
        "birdCodeTextView",
        "m",
        "distanceTextView",
        "n",
        "rangeTextView",
        "Landroid/widget/Button;",
        "o",
        "Landroid/widget/Button;",
        "quickStartButton",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final k:Landroid/widget/ImageView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/TextView;

.field public final n:Landroid/widget/TextView;

.field public final o:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget v0, Lmk4;->view_quick_start_unselected_banner:I

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, Lzi4;->birdIcon:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->k:Landroid/widget/ImageView;

    sget p1, Lzi4;->birdCode:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->l:Landroid/widget/TextView;

    sget p1, Lzi4;->distanceTextView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->m:Landroid/widget/TextView;

    sget p1, Lzi4;->rangeTextView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->n:Landroid/widget/TextView;

    sget p1, Lzi4;->quickStartButton:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->o:Landroid/widget/Button;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lmk4;->view_quick_start_unselected_banner:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, Lzi4;->birdIcon:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->k:Landroid/widget/ImageView;

    sget p1, Lzi4;->birdCode:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->l:Landroid/widget/TextView;

    sget p1, Lzi4;->distanceTextView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->m:Landroid/widget/TextView;

    sget p1, Lzi4;->rangeTextView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->n:Landroid/widget/TextView;

    sget p1, Lzi4;->quickStartButton:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->o:Landroid/widget/Button;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lmk4;->view_quick_start_unselected_banner:I

    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, Lzi4;->birdIcon:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->k:Landroid/widget/ImageView;

    sget p1, Lzi4;->birdCode:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->l:Landroid/widget/TextView;

    sget p1, Lzi4;->distanceTextView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->m:Landroid/widget/TextView;

    sget p1, Lzi4;->rangeTextView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->n:Landroid/widget/TextView;

    sget p1, Lzi4;->quickStartButton:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->o:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final r()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->o:Landroid/widget/Button;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->share()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final s()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->k:Landroid/widget/ImageView;

    sget v1, Lrg4;->ic_scooter_flying:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->l:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->o:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final setBird(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V
    .locals 13

    const-string v0, "currentLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/QuickStartUnselectedBannerView;->s()V

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->k:Landroid/widget/ImageView;

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isCruiserModel(Lco/bird/android/model/wire/WireBird;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget v1, Lrg4;->ic_vehicle_moped:I

    goto :goto_0

    :cond_1
    sget v1, Lrg4;->ic_scooter_flying:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->m:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p2

    sget-object v10, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v11, "context"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-double v3, p2

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v1, v10

    invoke-static/range {v1 .. v9}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->n:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v0

    const/4 v12, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-double v3, v0

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v1, v10

    invoke-static/range {v1 .. v9}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getBatteryLevel()I

    move-result p1

    invoke-virtual {v10, v0, p1, v12}, Lxx1;->a(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lco/bird/android/widget/QuickStartUnselectedBannerView;->o:Landroid/widget/Button;

    invoke-virtual {p1, v12}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
