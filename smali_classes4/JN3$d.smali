.class public final LJN3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJN3;-><init>(LLL3;LTq4;LiD1;LAM3;LVM3;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/User;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/PaymentInfo;",
        ">;>;",
        "Lio/reactivex/u<",
        "+",
        "LHM4<",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\t\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0003*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007 \u0003* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \u0003*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/PaymentInfo;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "LHM4;",
        "Lco/bird/api/request/SetDefaultProviderBody;",
        "b",
        "(Lkotlin/Pair;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LJN3;


# direct methods
.method public constructor <init>(LJN3;)V
    .locals 0

    iput-object p1, p0, LJN3$d;->g:LJN3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LJN3$d;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lkotlin/Pair;)Lio/reactivex/u;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/User;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/PaymentInfo;",
            ">;>;)",
            "Lio/reactivex/u<",
            "+",
            "LHM4<",
            "Lco/bird/api/request/SetDefaultProviderBody;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/PaymentInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/PaymentInfo;->getPaymentMethod()Lco/bird/android/model/BirdPayment;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/PaymentInfo;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/PaymentInfo;->getPaymentProvider()Lco/bird/android/model/constant/PaymentProvider;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    if-eqz p1, :cond_3

    sget-object v3, Lco/bird/android/model/constant/PaymentProvider;->UNKNOWN:Lco/bird/android/model/constant/PaymentProvider;

    if-eq p1, v3, :cond_3

    if-eqz v0, :cond_3

    iget-object v3, p0, LJN3$d;->g:LJN3;

    invoke-static {v3}, LJN3;->access$getPaymentClient$p(LJN3;)LLL3;

    move-result-object v3

    new-instance v4, Lco/bird/api/request/SetDefaultProviderBody;

    invoke-virtual {v0}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/BirdPayment;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-direct {v4, p1, v0, v2}, Lco/bird/api/request/SetDefaultProviderBody;-><init>(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, LLL3;->l(Lco/bird/api/request/SetDefaultProviderBody;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    sget-object v0, LJN3$d$a;->g:LJN3$d$a;

    new-instance v1, LKN3;

    invoke-direct {v1, v0}, LKN3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->p(Lio/reactivex/functions/g;)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/p;->J()Lio/reactivex/p;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LJN3$d;->b(Lkotlin/Pair;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
