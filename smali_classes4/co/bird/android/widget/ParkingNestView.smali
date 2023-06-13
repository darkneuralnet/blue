.class public final Lco/bird/android/widget/ParkingNestView;
.super Landroidx/cardview/widget/CardView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB\u001b\u0008\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008\u001c\u0010 B#\u0008\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008\u001c\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R;\u0010\u0019\u001a&\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013 \u0014*\u0012\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006$"
    }
    d2 = {
        "Lco/bird/android/widget/ParkingNestView;",
        "Landroidx/cardview/widget/CardView;",
        "Lco/bird/android/model/ParkingNest;",
        "nest",
        "",
        "distance",
        "",
        "setParkingNest",
        "",
        "show",
        "t",
        "LCs6;",
        "k",
        "LCs6;",
        "binding",
        "l",
        "Lco/bird/android/model/ParkingNest;",
        "parkingNest",
        "Lio/reactivex/Observable;",
        "",
        "kotlin.jvm.PlatformType",
        "m",
        "Lio/reactivex/Observable;",
        "getMapArNestClicks",
        "()Lio/reactivex/Observable;",
        "mapArNestClicks",
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
.field public final k:LCs6;

.field public l:Lco/bird/android/model/ParkingNest;

.field public final m:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, LCs6;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LCs6;

    move-result-object p1

    const-string v1, "inflate(context.layoutInflater, this, true)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object p1, p1, LCs6;->f:Landroid/widget/Button;

    const-string v1, "binding.mapArNestButton"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v0, v3}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lco/bird/android/widget/ParkingNestView$a;

    invoke-direct {v0, p0}, Lco/bird/android/widget/ParkingNestView$a;-><init>(Lco/bird/android/widget/ParkingNestView;)V

    new-instance v1, LnG3;

    invoke-direct {v1, v0}, LnG3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->m:Lio/reactivex/Observable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, LCs6;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LCs6;

    move-result-object p1

    const-string v0, "inflate(context.layoutInflater, this, true)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object p1, p1, LCs6;->f:Landroid/widget/Button;

    const-string v0, "binding.mapArNestButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, p2, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/widget/ParkingNestView$a;

    invoke-direct {p2, p0}, Lco/bird/android/widget/ParkingNestView$a;-><init>(Lco/bird/android/widget/ParkingNestView;)V

    new-instance v0, LnG3;

    invoke-direct {v0, p2}, LnG3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->m:Lio/reactivex/Observable;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, LCs6;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LCs6;

    move-result-object p1

    const-string p3, "inflate(context.layoutInflater, this, true)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object p1, p1, LCs6;->f:Landroid/widget/Button;

    const-string p3, "binding.mapArNestButton"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    const/4 p3, 0x0

    invoke-static {p1, v0, v1, p2, p3}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/widget/ParkingNestView$a;

    invoke-direct {p2, p0}, Lco/bird/android/widget/ParkingNestView$a;-><init>(Lco/bird/android/widget/ParkingNestView;)V

    new-instance p3, LnG3;

    invoke-direct {p3, p2}, LnG3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->m:Lio/reactivex/Observable;

    return-void
.end method

.method public static final synthetic access$getParkingNest$p(Lco/bird/android/widget/ParkingNestView;)Lco/bird/android/model/ParkingNest;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/ParkingNestView;->l:Lco/bird/android/model/ParkingNest;

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/widget/ParkingNestView;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final setParkingNest(Lco/bird/android/model/ParkingNest;F)V
    .locals 10

    const-string v0, "nest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, LDf4;->birdWhite:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    iput-object p1, p0, Lco/bird/android/widget/ParkingNestView;->l:Lco/bird/android/model/ParkingNest;

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getNotes()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->d:Landroid/widget/Button;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-double v3, p2

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getAvailableParkingCapacity()Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnl4;->x_parking_spots:I

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_0

    :cond_0
    move v6, v5

    :goto_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->b:Landroid/widget/TextView;

    const-string v1, "binding.capacityTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v5, v2, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->h:Landroid/widget/Button;

    const-string v1, "binding.showNearestParkingButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    move v3, v5

    :goto_3
    invoke-static {v0, v3, v5, v2, v4}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getPhotos()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/WireNestPhoto;

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object p1

    invoke-virtual {p2}, Lco/bird/android/model/wire/WireNestPhoto;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object p2, p2, LCs6;->e:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    goto :goto_6

    :cond_4
    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getAvailableParkingCapacity()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_6

    sget p1, Lrg4;->marker_parking_unavailable_selected:I

    goto :goto_5

    :cond_6
    :goto_4
    sget p1, Lrg4;->marker_parking_selected:I

    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/bumptech/glide/a;->t(Landroid/content/Context;)LUI4;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, LUI4;->j(Ljava/lang/Integer;)LrI4;

    move-result-object p1

    iget-object p2, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object p2, p2, LCs6;->e:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    :goto_6
    invoke-static {p0}, Ltu6;->r(Landroid/view/View;)V

    return-void
.end method

.method public final t(Z)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/ParkingNestView;->k:LCs6;

    iget-object v0, v0, LCs6;->f:Landroid/widget/Button;

    const-string v1, "binding.mapArNestButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method
