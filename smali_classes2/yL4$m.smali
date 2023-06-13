.class public final LyL4$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyL4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LyL4$m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/widget/c$b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/widget/c$b;",
        "kotlin.jvm.PlatformType",
        "whichButton",
        "",
        "a",
        "(Lco/bird/android/widget/c$b;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LyL4;


# direct methods
.method public constructor <init>(LyL4;)V
    .locals 0

    iput-object p1, p0, LyL4$m;->g:LyL4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/widget/c$b;)V
    .locals 8

    iget-object v0, p0, LyL4$m;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getConfigForCurrentBird(LyL4;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-static {v0}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v0

    iget-object v1, p0, LyL4$m;->g:LyL4;

    invoke-static {v1}, LyL4;->access$getConfigForCurrentBird(LyL4;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v1

    invoke-static {v1}, Lco/bird/android/model/ReservationPriceKt;->reservationPrice(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/ReservationPrice;

    move-result-object v1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, LyL4$m$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    :goto_0
    const/4 v2, 0x1

    if-eq p1, v2, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LyL4$m;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getAnalyticsManager$p(LyL4;)LEa;

    move-result-object p1

    new-instance v2, Lco/bird/android/model/analytics/RiderReserveConfirmButtonTapped;

    invoke-direct {v2, v0, v1}, Lco/bird/android/model/analytics/RiderReserveConfirmButtonTapped;-><init>(Lco/bird/android/model/wire/WireRidePrice;Lco/bird/android/model/ReservationPrice;)V

    invoke-interface {p1, v2}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LyL4$m;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getAnalyticsManager$p(LyL4;)LEa;

    move-result-object p1

    new-instance v7, LFL4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LFL4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v7}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LyL4$m;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getAnalyticsManager$p(LyL4;)LEa;

    move-result-object p1

    new-instance v2, Lco/bird/android/model/analytics/RiderReserveConfirmCancelButtonTapped;

    invoke-direct {v2, v0, v1}, Lco/bird/android/model/analytics/RiderReserveConfirmCancelButtonTapped;-><init>(Lco/bird/android/model/wire/WireRidePrice;Lco/bird/android/model/ReservationPrice;)V

    invoke-interface {p1, v2}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LyL4$m;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getAnalyticsManager$p(LyL4;)LEa;

    move-result-object p1

    new-instance v6, LEL4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LEL4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/widget/c$b;

    invoke-virtual {p0, p1}, LyL4$m;->a(Lco/bird/android/widget/c$b;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
