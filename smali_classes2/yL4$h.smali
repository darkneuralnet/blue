.class public final LyL4$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyL4;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LyL4;


# direct methods
.method public constructor <init>(LyL4;)V
    .locals 0

    iput-object p1, p0, LyL4$h;->g:LyL4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LyL4$h;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 5

    iget-object p1, p0, LyL4$h;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getReactiveConfig$p(LyL4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ReservationConfig;->getMaximumReservationDurationMinutes()I

    move-result v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ReservationConfig;->getMinutePrice()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    iget-object p1, p0, LyL4$h;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getActivity$p(LyL4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p1

    sget v1, Lnl4;->reservation_ended_free_message:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LyL4$h;->g:LyL4;

    invoke-static {v0}, LyL4;->access$isPromotionalReservation$p(LyL4;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LyL4$h;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getActivity$p(LyL4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v1, Lnl4;->reservation_ended_free_message:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ReservationConfig;->getReservePromoReservationDuration()I

    move-result p1

    div-int/lit8 p1, p1, 0x3c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, LyL4$h;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getActivity$p(LyL4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p1

    sget v0, Lnl4;->reservation_charged:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    const-string v0, "if (isFree) {\n          \u2026vation_charged)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LyL4$h;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getReservationUi$p(LyL4;)LGL4;

    move-result-object v0

    invoke-interface {v0, p1}, LGL4;->qg(Ljava/lang/String;)V

    iget-object p1, p0, LyL4$h;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getReservationManager$p(LyL4;)LMK4;

    move-result-object p1

    invoke-interface {p1}, LMK4;->g()V

    return-void
.end method
