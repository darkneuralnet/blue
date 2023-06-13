.class public final LiK4$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiK4;->onBannerShown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/widget/ReservationBannerView$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/widget/ReservationBannerView$a;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/widget/ReservationBannerView$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LiK4;


# direct methods
.method public constructor <init>(LiK4;)V
    .locals 0

    iput-object p1, p0, LiK4$b;->g:LiK4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/widget/ReservationBannerView$a;)V
    .locals 7

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "CTA clicked reservation before"

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LiK4$b;->g:LiK4;

    invoke-static {p1}, LiK4;->access$getAnalyticsManager$p(LiK4;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/RiderReserveButtonTapped;

    iget-object v1, p0, LiK4$b;->g:LiK4;

    invoke-static {v1}, LiK4;->access$getConfigForCurrentBird(LiK4;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v1

    invoke-static {v1}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v1

    iget-object v2, p0, LiK4$b;->g:LiK4;

    invoke-static {v2}, LiK4;->access$getConfigForCurrentBird(LiK4;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v2

    invoke-static {v2}, Lco/bird/android/model/ReservationPriceKt;->reservationPrice(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/ReservationPrice;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/analytics/RiderReserveButtonTapped;-><init>(Lco/bird/android/model/wire/WireRidePrice;Lco/bird/android/model/ReservationPrice;)V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LiK4$b;->g:LiK4;

    invoke-static {p1}, LiK4;->access$getAnalyticsManager$p(LiK4;)LEa;

    move-result-object p1

    new-instance v6, LDL4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LDL4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/widget/ReservationBannerView$a;

    invoke-virtual {p0, p1}, LiK4$b;->a(Lco/bird/android/widget/ReservationBannerView$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
