.class public final LbX4$j$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbX4$j;->d(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/h;
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
        "Lkotlin/Unit;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/BirdPayment;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "invoke",
        "(Lkotlin/Triple;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LbX4;

.field public final synthetic h:Lco/bird/android/model/persistence/RidePassView;

.field public final synthetic i:LrX4;


# direct methods
.method public constructor <init>(LbX4;Lco/bird/android/model/persistence/RidePassView;LrX4;)V
    .locals 0

    iput-object p1, p0, LbX4$j$b;->g:LbX4;

    iput-object p2, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    iput-object p3, p0, LbX4$j$b;->i:LrX4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LbX4$j$b;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LbX4;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, LbX4$j$b;->h(LbX4;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LbX4$j$b;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LbX4$j$b;->invoke$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LbX4;Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;
    .locals 0

    invoke-static {p0, p1}, LbX4$j$b;->g(LbX4;Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final g(LbX4;Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;
    .locals 1

    invoke-static {p0}, LbX4;->access$getRidePassManager$p(LbX4;)LWU4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LWU4;->y0(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LlX4;

    invoke-direct {v0, p0}, LlX4;-><init>(LbX4;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LbX4$j$b$c;

    invoke-direct {v0, p0}, LbX4$j$b$c;-><init>(LbX4;)V

    new-instance p0, LmX4;

    invoke-direct {p0, v0}, LmX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p0

    const-string p1, "override fun consume(ren\u2026eId.toLong())\n      }\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final h(LbX4;)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LbX4;->access$getRidePassManager$p(LbX4;)LWU4;

    move-result-object p0

    invoke-interface {p0}, LWU4;->refresh()Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lkotlin/Triple;)Lio/reactivex/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Unit;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p0, LbX4$j$b;->g:LbX4;

    invoke-static {p1}, LbX4;->access$getNavigator$p(LbX4;)Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/PurchasePaymentReason;->RIDE_PASS:Lco/bird/android/model/constant/PurchasePaymentReason;

    const/16 v2, 0x273e

    iget-object p1, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v3

    iget-object p1, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getPriceTax()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    :goto_0
    add-long/2addr v3, v5

    iget-object p1, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/PaymentAddSource;->RIDE_PASS_PURCHASE:Lco/bird/android/model/PaymentAddSource;

    invoke-interface/range {v0 .. v6}, Le13;->A2(Lco/bird/android/model/constant/PurchasePaymentReason;IJLjava/lang/String;Lco/bird/android/model/PaymentAddSource;)V

    iget-object p1, p0, LbX4$j$b;->i:LrX4;

    invoke-interface {p1}, LrX4;->b1()Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LbX4$j$b$a;

    iget-object v1, p0, LbX4$j$b;->g:LbX4;

    iget-object v2, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-direct {v0, v1, v2}, LbX4$j$b$a;-><init>(LbX4;Lco/bird/android/model/persistence/RidePassView;)V

    new-instance v1, LjX4;

    invoke-direct {v1, v0}, LjX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdPayment;

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "googlePayReady"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LbX4$j$b;->g:LbX4;

    invoke-static {p1}, LbX4;->access$getGooglePayManager$p(LbX4;)LiD1;

    move-result-object p1

    iget-object v0, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0

    iget-object v1, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/RidePassView;->getPriceTax()Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, LbX4$j$b;->g:LbX4;

    invoke-virtual {v3}, Lf1;->k()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LsX4;

    invoke-virtual {v3}, LsX4;->f()Z

    move-result v3

    invoke-interface {p1, v0, v1, v2, v3}, LiD1;->e(Ljava/util/Currency;Ljava/lang/Long;Ljava/lang/Long;Z)V

    iget-object p1, p0, LbX4$j$b;->i:LrX4;

    invoke-interface {p1}, LrX4;->b1()Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, LbX4$j$b$b;

    iget-object v1, p0, LbX4$j$b;->g:LbX4;

    iget-object v2, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-direct {v0, v1, v2}, LbX4$j$b$b;-><init>(LbX4;Lco/bird/android/model/persistence/RidePassView;)V

    new-instance v1, LkX4;

    invoke-direct {v1, v0}, LkX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, LbX4$j$b;->g:LbX4;

    iget-object v0, p0, LbX4$j$b;->h:Lco/bird/android/model/persistence/RidePassView;

    invoke-static {p1, v0}, LbX4$j$b;->g(LbX4;Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LbX4$j$b;->invoke(Lkotlin/Triple;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
