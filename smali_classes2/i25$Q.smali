.class public final Li25$Q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->j5(Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideRequirement;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/RideRequirement;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Li25;


# direct methods
.method public constructor <init>(ZLi25;)V
    .locals 0

    iput-boolean p1, p0, Li25$Q;->g:Z

    iput-object p2, p0, Li25$Q;->h:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideRequirement;)V
    .locals 1

    iget-boolean v0, p0, Li25$Q;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/RideRequirement$AutoPayV2;

    if-eqz v0, :cond_1

    iget-object p1, p0, Li25$Q;->h:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->ONBOARDING_START:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lco/bird/android/model/RideRequirement$Payment;

    if-eqz p1, :cond_2

    iget-object p1, p0, Li25$Q;->h:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->ONBOARDING_START:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Li25$Q;->h:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->ONBOARDING_START:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->N1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    iget-object p1, p0, Li25$Q;->h:Li25;

    invoke-static {p1}, Li25;->access$getFlightBannerCoordinatorPresenter$p(Li25;)LZr1;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$FlightBanner;->ONBOARDING_IN_PROGRESS:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    invoke-interface {p1, v0}, LZr1;->M1(Lco/bird/android/model/FlightBannerNode$FlightBanner;)V

    :goto_0
    iget-object p1, p0, Li25$Q;->h:Li25;

    invoke-static {p1}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/OnboardingTeaserShown;

    invoke-direct {v0}, Lco/bird/android/model/analytics/OnboardingTeaserShown;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, Li25$Q;->h:Li25;

    invoke-static {p1}, Li25;->access$getMutableRequirementBannerShown$p(Li25;)La94;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideRequirement;

    invoke-virtual {p0, p1}, Li25$Q;->a(Lco/bird/android/model/RideRequirement;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
