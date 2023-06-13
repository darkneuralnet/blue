.class public final LwV4$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwV4;->a()V
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
.field public final synthetic g:LwV4;


# direct methods
.method public constructor <init>(LwV4;)V
    .locals 0

    iput-object p1, p0, LwV4$i;->g:LwV4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
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

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdPayment;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-static {p1}, LwV4;->access$buyRidePass(LwV4;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string v0, "googlePayReady"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-static {p1}, LwV4;->access$getGooglePayManager$p(LwV4;)LiD1;

    move-result-object v0

    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-static {p1}, LwV4;->access$getUserStream$p(LwV4;)LRh6;

    move-result-object p1

    invoke-interface {p1}, LRh6;->a()Lco/bird/android/model/User;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-static {p1}, LwV4;->access$getActivity$p(LwV4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    const/16 v3, 0x272e

    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-virtual {p1}, LwV4;->v()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-virtual {p1}, LwV4;->v()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->getPrice()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, LiD1;->h(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, LwV4$i;->g:LwV4;

    invoke-static {p1}, LwV4;->access$getNavigator$p(LwV4;)Le13;

    move-result-object p1

    const/16 v0, 0x272f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Le13$a;->goToPayment$default(Le13;Ljava/lang/Integer;ZILjava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LwV4$i;->invoke(Lkotlin/Triple;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
