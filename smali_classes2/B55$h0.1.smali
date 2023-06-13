.class public final LB55$h0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55;->A2(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;
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
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "allowToStartRide",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/lang/Boolean;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LB55;

.field public final synthetic h:Lco/bird/android/model/User;


# direct methods
.method public constructor <init>(LB55;Lco/bird/android/model/User;)V
    .locals 0

    iput-object p1, p0, LB55$h0;->g:LB55;

    iput-object p2, p0, LB55$h0;->h:Lco/bird/android/model/User;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lio/reactivex/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "allowToStartRide"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB55$h0;->g:LB55;

    invoke-static {v0}, LB55;->access$getPaymentMethodManager$p(LB55;)LzN3;

    move-result-object v0

    invoke-interface {v0}, LzN3;->a()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdPayment;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, LB55$h0;->g:LB55;

    invoke-static {p1}, LB55;->access$getBird(LB55;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    invoke-static {p1}, LS55;->d(Lco/bird/android/model/wire/WireBird;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LB55$h0;->h:Lco/bird/android/model/User;

    invoke-static {p1}, LS55;->a(Lco/bird/android/model/User;)Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lco/bird/android/model/RideRequirement$Payment;->INSTANCE:Lco/bird/android/model/RideRequirement$Payment;

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LB55$h0;->a(Ljava/lang/Boolean;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
