.class public final LtW4$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtW4;->S(LxW4;)V
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
        "Lco/bird/android/model/persistence/RidePassView;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/BirdPayment;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00020\u00072z\u0010\u0006\u001av\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/persistence/RidePassView;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/BirdPayment;",
        "",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lkotlin/Triple;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtW4;

.field public final synthetic h:LxW4;


# direct methods
.method public constructor <init>(LtW4;LxW4;)V
    .locals 0

    iput-object p1, p0, LtW4$d;->g:LtW4;

    iput-object p2, p0, LtW4$d;->h:LxW4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/persistence/RidePassView;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/BirdPayment;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/BirdPayment;

    invoke-virtual {v1}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, p0, LtW4$d;->g:LtW4;

    sget-object v0, LbA5;->a:LbA5;

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_2

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

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-static {p1}, LtW4;->access$getGooglePayManager$p(LtW4;)LiD1;

    move-result-object v0

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-static {p1}, LtW4;->access$getUserStream$p(LtW4;)LRh6;

    move-result-object p1

    invoke-interface {p1}, LRh6;->a()Lco/bird/android/model/User;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p0, LtW4$d;->h:LxW4;

    const-string v2, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Landroid/app/Activity;

    const/16 v3, 0x272e

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-virtual {p1}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-virtual {p1}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v5

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-virtual {p1}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getPriceTax()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x0

    :goto_0
    add-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, LiD1;->h(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-static {p1}, LtW4;->access$getNavigator$p(LtW4;)Le13;

    move-result-object v0

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-static {p1}, LtW4;->access$getTitleResId$p(LtW4;)I

    move-result v1

    const/16 v2, 0x273e

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-virtual {p1}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v3

    iget-object p1, p0, LtW4$d;->g:LtW4;

    invoke-virtual {p1}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lco/bird/android/model/PaymentAddSource;->RIDE_PASS_PURCHASE:Lco/bird/android/model/PaymentAddSource;

    invoke-interface/range {v0 .. v6}, Le13;->K3(IIJLjava/lang/String;Lco/bird/android/model/PaymentAddSource;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LtW4$d;->a(Lkotlin/Triple;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
