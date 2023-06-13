.class public final Lth3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/FlightBanner;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lth3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0005BA\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0010\u0012\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0014\u0012\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lth3;",
        "Lco/bird/android/model/FlightBanner;",
        "",
        "onBannerShown",
        "LEa;",
        "a",
        "LEa;",
        "analyticsManager",
        "Lgl;",
        "b",
        "Lgl;",
        "preference",
        "Lxh3;",
        "c",
        "Lxh3;",
        "onboardingBannerUi",
        "LsJ4;",
        "d",
        "LsJ4;",
        "requirementPresenter",
        "Lcom/uber/autodispose/ScopeProvider;",
        "e",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Lth3$a;",
        "f",
        "Lth3$a;",
        "bannerState",
        "<init>",
        "(LEa;Lgl;Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)V",
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
        "SMAP\nOnboardingBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/OnboardingBannerPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,49:1\n180#2:50\n*S KotlinDebug\n*F\n+ 1 OnboardingBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/OnboardingBannerPresenterImpl\n*L\n37#1:50\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LEa;

.field public final b:Lgl;

.field public final c:Lxh3;

.field public final d:LsJ4;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:Lth3$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LEa;Lgl;Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingBannerUi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requirementPresenter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bannerState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth3;->a:LEa;

    iput-object p2, p0, Lth3;->b:Lgl;

    iput-object p3, p0, Lth3;->c:Lxh3;

    iput-object p4, p0, Lth3;->d:LsJ4;

    iput-object p5, p0, Lth3;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p6, p0, Lth3;->f:Lth3$a;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lth3;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(Lth3;)LEa;
    .locals 0

    iget-object p0, p0, Lth3;->a:LEa;

    return-object p0
.end method

.method public static final synthetic access$getBannerState$p(Lth3;)Lth3$a;
    .locals 0

    iget-object p0, p0, Lth3;->f:Lth3$a;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lth3;)Lgl;
    .locals 0

    iget-object p0, p0, Lth3;->b:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getRequirementPresenter$p(Lth3;)LsJ4;
    .locals 0

    iget-object p0, p0, Lth3;->d:LsJ4;

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public closeImmediately()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lco/bird/android/model/FlightBanner$DefaultImpls;->closeImmediately(Lco/bird/android/model/FlightBanner;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public onBannerRemoved()V
    .locals 0

    invoke-static {p0}, Lco/bird/android/model/FlightBanner$DefaultImpls;->onBannerRemoved(Lco/bird/android/model/FlightBanner;)V

    return-void
.end method

.method public onBannerShown()V
    .locals 3

    iget-object v0, p0, Lth3;->c:Lxh3;

    invoke-interface {v0}, Lxh3;->a()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lth3;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lth3$b;

    invoke-direct {v1, p0}, Lth3$b;-><init>(Lth3;)V

    new-instance v2, Lsh3;

    invoke-direct {v2, v1}, Lsh3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
