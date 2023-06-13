.class public final Lx04;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx04$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "Ly04;",
        "Lz04;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0008\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lx04;",
        "Lf1;",
        "Ly04;",
        "Lz04;",
        "renderer",
        "",
        "n",
        "Landroid/content/Context;",
        "context",
        "",
        "o",
        "p",
        "Le13;",
        "e",
        "Le13;",
        "navigator",
        "Lgl;",
        "f",
        "Lgl;",
        "preference",
        "LTq4;",
        "g",
        "LTq4;",
        "reactiveConfig",
        "LVM3;",
        "h",
        "LVM3;",
        "paymentManagerV3",
        "<init>",
        "(Le13;Lgl;LTq4;LVM3;)V",
        "co.bird.android.feature.payment"
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
        "SMAP\nPreloadV2LandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2LandingPresenter.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2LandingPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,82:1\n180#2:83\n*S KotlinDebug\n*F\n+ 1 PreloadV2LandingPresenter.kt\nco/bird/android/feature/payment/preload/v2/landing/PreloadV2LandingPresenter\n*L\n49#1:83\n*E\n"
    }
.end annotation


# instance fields
.field public final e:Le13;

.field public final f:Lgl;

.field public final g:LTq4;

.field public final h:LVM3;


# direct methods
.method public constructor <init>(Le13;Lgl;LTq4;LVM3;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentManagerV3"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk22;->a:Lk22;

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lx04;->e:Le13;

    iput-object p2, p0, Lx04;->f:Lgl;

    iput-object p3, p0, Lx04;->g:LTq4;

    iput-object p4, p0, Lx04;->h:LVM3;

    return-void
.end method

.method public static final synthetic access$getNavigator$p(Lx04;)Le13;
    .locals 0

    iget-object p0, p0, Lx04;->e:Le13;

    return-object p0
.end method

.method public static final synthetic access$getPaymentManagerV3$p(Lx04;)LVM3;
    .locals 0

    iget-object p0, p0, Lx04;->h:LVM3;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lx04;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, Ly04;

    invoke-virtual {p0, p1}, Lx04;->n(Ly04;)V

    return-void
.end method

.method public n(Ly04;)V
    .locals 5

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    iget-object v0, p0, Lx04;->h:LVM3;

    invoke-interface {v0}, LVM3;->m()LR04;

    move-result-object v0

    sget-object v1, Lx04$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    new-instance v0, LHY3;

    iget-object v4, p0, Lx04;->g:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getLocalizedDynamicPriceString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v4, v3, v1}, LHY3;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lrx4;->render(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg04;

    iget-object v4, p0, Lx04;->g:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/RideConfig;->getLocalizedDynamicPriceString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v4, v3, v1}, Lg04;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lrx4;->render(Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p1}, Ly04;->u0()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Lx04;->h:LVM3;

    invoke-interface {v0}, LVM3;->i()LZ84;

    move-result-object v0

    invoke-static {p1, v0}, Lio/reactivex/rxkotlin/f;->a(Lio/reactivex/Observable;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lx04$b;

    invoke-direct {v0, p0}, Lx04$b;-><init>(Lx04;)V

    new-instance v1, Lw04;

    invoke-direct {v1, v0}, Lw04;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final o(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx04;->g:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getFraudConfig()Lco/bird/android/model/wire/configs/FraudConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/FraudConfig;->getAuthChargeAmount()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    sget v2, Lnl4;->payment_quick_deposit_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget-object v4, Lxx1;->a:Lxx1;

    iget-object v5, p0, Lx04;->g:LTq4;

    invoke-virtual {v5}, LTq4;->f8()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v5

    sget-object v6, LUx1;->d:LUx1;

    invoke-virtual {v4, v0, v1, v5, v6}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lx04;->f:Lgl;

    invoke-virtual {v0}, Lgl;->y2()V

    iget-object v0, p0, Lx04;->e:Le13;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Le13;->b1(I)V

    return-void
.end method
