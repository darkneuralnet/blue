.class public final Lco/bird/android/widget/RideDetailsView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/widget/RideDetailsView;",
        "Landroid/widget/LinearLayout;",
        "",
        "battery",
        "",
        "setBattery",
        "",
        "distanceMeters",
        "setDistance",
        "estimatedRange",
        "setRange",
        "seconds",
        "",
        "countDown",
        "setTimer",
        "Lrt6;",
        "b",
        "Lrt6;",
        "binding",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "defStyleAttr",
        "<init>",
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
.field public final b:Lrt6;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/RideDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/RideDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lrt6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrt6;

    move-result-object p1

    const-string p2, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/RideDetailsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic setTimer$default(Lco/bird/android/widget/RideDetailsView;IZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/RideDetailsView;->setTimer(IZ)V

    return-void
.end method


# virtual methods
.method public final setBattery(I)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->i:Landroid/widget/LinearLayout;

    const-string v1, "binding.rangeView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->d:Landroid/widget/LinearLayout;

    const-string v1, "binding.batteryView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->b:Landroid/widget/TextView;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p1, v3}, Lxx1;->a(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->c:Lco/bird/android/widget/BatteryView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    return-void
.end method

.method public final setDistance(D)V
    .locals 10

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->g:Landroid/widget/TextView;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-wide v3, p1

    invoke-static/range {v1 .. v9}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setRange(I)V
    .locals 10

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->i:Landroid/widget/LinearLayout;

    const-string v1, "binding.rangeView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->r(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->d:Landroid/widget/LinearLayout;

    const-string v1, "binding.batteryView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ltu6;->l(Landroid/view/View;)V

    iget-object v0, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v0, v0, Lrt6;->h:Landroid/widget/TextView;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-double v3, p1

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTimer(IZ)V
    .locals 13

    const-string v0, "binding.clock"

    const-string v1, "binding.countDownClock"

    if-eqz p2, :cond_0

    iget-object p2, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object p2, p2, Lrt6;->e:Landroid/widget/TextView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ltu6;->l(Landroid/view/View;)V

    iget-object p2, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object p2, p2, Lrt6;->f:Lco/bird/android/widget/CountdownView;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ltu6;->r(Landroid/view/View;)V

    iget-object p2, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object v2, p2, Lrt6;->f:Lco/bird/android/widget/CountdownView;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    const/high16 p2, -0x1000000

    invoke-direct {v9, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/high16 p2, 0x41900000    # 18.0f

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const/16 v11, 0x3e

    const/4 v12, 0x0

    move v3, p1

    invoke-static/range {v2 .. v12}, Lco/bird/android/widget/CountdownView;->init$default(Lco/bird/android/widget/CountdownView;ILjava/util/concurrent/TimeUnit;Ljava/lang/Boolean;Lcom/uber/autodispose/ScopeProvider;Ljava/lang/Integer;Landroid/text/style/StyleSpan;Landroid/text/style/ForegroundColorSpan;Ljava/lang/Float;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object p2, p2, Lrt6;->f:Lco/bird/android/widget/CountdownView;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ltu6;->l(Landroid/view/View;)V

    iget-object p2, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object p2, p2, Lrt6;->e:Landroid/widget/TextView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ltu6;->r(Landroid/view/View;)V

    iget-object p2, p0, Lco/bird/android/widget/RideDetailsView;->b:Lrt6;

    iget-object p2, p2, Lrt6;->e:Landroid/widget/TextView;

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {v0, p1}, Lxx1;->j(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
