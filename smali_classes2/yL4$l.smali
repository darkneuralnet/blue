.class public final LyL4$l;
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

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "LJ35$a;",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Ljava/lang/Integer;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/widget/c$b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000620\u0010\u0005\u001a,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "LJ35$a;",
        "kotlin.jvm.PlatformType",
        "",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "Lco/bird/android/widget/c$b;",
        "a",
        "(Lkotlin/Triple;)Lio/reactivex/u;"
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

    iput-object p1, p0, LyL4$l;->g:LyL4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lio/reactivex/u;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "LJ35$a;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/widget/c$b;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    iget-object v1, p0, LyL4$l;->g:LyL4;

    invoke-static {v1}, LyL4;->access$getEphemeralPromoManager$p(LyL4;)LBf1;

    move-result-object v1

    invoke-interface {v1}, LBf1;->a()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LyL4$l;->g:LyL4;

    invoke-static {p1}, LyL4;->access$getReservationUi$p(LyL4;)LGL4;

    move-result-object p1

    iget-object v0, p0, LyL4$l;->g:LyL4;

    invoke-static {v0}, LyL4;->access$getActivity$p(LyL4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v1, Lnl4;->reservation_instructions_no_price:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, LyL4$l;->g:LyL4;

    invoke-static {v3}, LyL4;->access$getReactiveConfig$p(LyL4;)LTq4;

    move-result-object v3

    invoke-virtual {v3}, LTq4;->f8()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/configs/ReservationConfig;->getReservePromoReservationDuration()I

    move-result v3

    div-int/lit8 v3, v3, 0x3c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "activity.getString(L.str\u2026ReservationDuration / 60)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LyL4$l;->g:LyL4;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, LyL4;->access$bottomSheetTitle(LyL4;J)I

    move-result v1

    invoke-interface {p1, v0, v1}, LGL4;->i4(Ljava/lang/String;I)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LyL4$l;->g:LyL4;

    invoke-static {v1}, LyL4;->access$getReactiveConfig$p(LyL4;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getReservationConfig()Lco/bird/android/model/wire/configs/ReservationConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ReservationConfig;->getMinutePrice()J

    move-result-wide v1

    iget-object v3, p0, LyL4$l;->g:LyL4;

    invoke-static {v3}, LyL4;->access$getReservationUi$p(LyL4;)LGL4;

    move-result-object v3

    iget-object v4, p0, LyL4$l;->g:LyL4;

    const-string v5, "applyTax"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v5, "maximumReservationDurationMinutes"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v4, v0, p1, v1, v2}, LyL4;->access$pricingSubtitle(LyL4;ZIJ)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LyL4$l;->g:LyL4;

    invoke-static {v0, v1, v2}, LyL4;->access$bottomSheetTitle(LyL4;J)I

    move-result v0

    invoke-interface {v3, p1, v0}, LGL4;->i4(Ljava/lang/String;I)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LyL4$l;->a(Lkotlin/Triple;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
