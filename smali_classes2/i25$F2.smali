.class public final Li25$F2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->M8(Lco/bird/android/model/RideState;LQM4;Lco/bird/android/model/wire/configs/WarningPresentationKind;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/android/model/DialogResponse;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$showRideRestrictedWarningDialogWithAnalytics$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LQM4;

.field public final synthetic h:Li25;

.field public final synthetic i:Lco/bird/android/model/RideState;


# direct methods
.method public constructor <init>(LQM4;Li25;Lco/bird/android/model/RideState;)V
    .locals 0

    iput-object p1, p0, Li25$F2;->g:LQM4;

    iput-object p2, p0, Li25$F2;->h:Li25;

    iput-object p3, p0, Li25$F2;->i:Lco/bird/android/model/RideState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)V
    .locals 6

    iget-object v0, p0, Li25$F2;->g:LQM4;

    invoke-static {v0}, LPy;->a(LQM4;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li25$F2;->h:Li25;

    invoke-static {v0}, Li25;->access$getParkingManager$p(Li25;)LoF3;

    move-result-object v0

    invoke-interface {v0}, LoF3;->j()LFH3;

    move-result-object v0

    instance-of v1, v0, Ltz6;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ltz6;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ltz6;->g()Ljava/lang/Integer;

    move-result-object v2

    :cond_1
    iget-object v0, p0, Li25$F2;->h:Li25;

    invoke-static {v0}, Li25;->access$getAnalyticsManager$p(Li25;)LEa;

    move-result-object v0

    iget-object v1, p0, Li25$F2;->h:Li25;

    iget-object v3, p0, Li25$F2;->i:Lco/bird/android/model/RideState;

    invoke-virtual {v3}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v3

    sget-object v4, LgR4;->c:LgR4;

    invoke-interface {v4, v2}, LIc0;->a(Ljava/lang/Integer;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iget-object v2, p0, Li25$F2;->g:LQM4;

    invoke-virtual {v2}, LQM4;->b()Z

    move-result v2

    sget-object v5, Lco/bird/android/model/DialogResponse;->OTHER:Lco/bird/android/model/DialogResponse;

    if-ne p1, v5, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {v1, v3, v4, v2, p1}, LO25;->a(Li25;Lco/bird/android/model/wire/WireRide;LgR4;ZZ)LyQ4;

    move-result-object p1

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, Li25$F2;->a(Lco/bird/android/model/DialogResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
