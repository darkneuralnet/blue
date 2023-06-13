.class public final Li25$k0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->I5(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<no name provided>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onBirdInfoItemClick$options$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,4445:1\n180#2:4446\n*S KotlinDebug\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onBirdInfoItemClick$options$2\n*L\n2367#1:4446\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, Li25$k0;->g:Li25;

    iput-object p2, p0, Li25$k0;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Li25$k0;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li25$k0;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    iget-object v0, p0, Li25$k0;->g:Li25;

    invoke-static {v0}, Li25;->access$getReactiveConfig$p(Li25;)LTq4;

    move-result-object v0

    iget-object v1, p0, Li25$k0;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getInaccessibleBirdConfig()Lco/bird/android/model/wire/configs/InaccessibleBirdConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/InaccessibleBirdConfig;->getEnableRiderCannotAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li25$k0;->g:Li25;

    invoke-static {v0}, Li25;->access$getNavigator$p(Li25;)Le13;

    move-result-object v0

    iget-object v1, p0, Li25$k0;->h:Lco/bird/android/model/wire/WireBird;

    const/16 v2, 0x272d

    sget-object v3, Lco/bird/android/model/InaccessibleReportSource;->RIDER:Lco/bird/android/model/InaccessibleReportSource;

    invoke-interface {v0, v1, v2, v3}, Le13;->K2(Lco/bird/android/model/wire/WireBird;ILco/bird/android/model/InaccessibleReportSource;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li25$k0;->g:Li25;

    invoke-static {v0}, Li25;->access$getBirdManager$p(Li25;)LaM;

    move-result-object v0

    iget-object v1, p0, Li25$k0;->h:Lco/bird/android/model/wire/WireBird;

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    invoke-interface {v0, v1, v2}, LaM;->N0(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/MapMode;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Li25$k0;->g:Li25;

    invoke-static {v1}, Li25;->access$getScopeProvider$p(Li25;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Li25$k0$a;

    iget-object v2, p0, Li25$k0;->g:Li25;

    invoke-direct {v1, v2}, Li25$k0$a;-><init>(Li25;)V

    new-instance v2, Lt25;

    invoke-direct {v2, v1}, Lt25;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    :goto_0
    return-void
.end method
