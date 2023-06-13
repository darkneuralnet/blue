.class public final LoP3$F;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoP3;->C0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LeD1;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LeD1;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(LeD1;)V"
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
        "SMAP\nPaymentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentPresenter.kt\nco/bird/android/app/feature/payment/PaymentPresenterImpl$setupAdditionalClicks$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,705:1\n1#2:706\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LoP3;


# direct methods
.method public constructor <init>(LoP3;)V
    .locals 0

    iput-object p1, p0, LoP3$F;->g:LoP3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LeD1;)V
    .locals 9

    invoke-virtual {p1}, LeD1;->a()Lco/bird/android/model/Balance;

    move-result-object v0

    invoke-virtual {p1}, LeD1;->b()Lco/bird/android/model/User;

    move-result-object v2

    invoke-virtual {p1}, LeD1;->c()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    iget-object v1, p0, LoP3$F;->g:LoP3;

    invoke-static {v1}, LoP3;->access$getAnalyticsManager$p(LoP3;)LEa;

    move-result-object v1

    new-instance v3, Lco/bird/android/model/analytics/GooglePayButtonClicked;

    sget-object v4, Lco/bird/android/model/analytics/ScreenType;->PAYMENT:Lco/bird/android/model/analytics/ScreenType;

    invoke-direct {v3, v4}, Lco/bird/android/model/analytics/GooglePayButtonClicked;-><init>(Lco/bird/android/model/analytics/ScreenType;)V

    invoke-interface {v1, v3}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayRefillAmount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getAutoPayActive()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x0

    :goto_1
    move-wide v7, v0

    iget-object v0, p0, LoP3$F;->g:LoP3;

    invoke-static {v0}, LoP3;->access$getGooglePayManager$p(LoP3;)LiD1;

    move-result-object v1

    iget-object v0, p0, LoP3$F;->g:LoP3;

    invoke-static {v0}, LoP3;->access$getActivity$p(LoP3;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    sget-object v0, LwI4;->e:LwI4;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object v5, p1

    invoke-interface/range {v1 .. v6}, LiD1;->h(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V

    iget-object v0, p0, LoP3$F;->g:LoP3;

    invoke-static {v0}, LoP3;->access$getAnalyticsManager$p(LoP3;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;-><init>(Ljava/util/Currency;Ljava/lang/Long;)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LeD1;

    invoke-virtual {p0, p1}, LoP3$F;->a(LeD1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
