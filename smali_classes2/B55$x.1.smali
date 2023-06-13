.class public final LB55$x;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55;->v1(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Balance;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Balance;",
        "balance",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"
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

.field public final synthetic h:Lco/bird/android/model/wire/configs/RideConfig;


# direct methods
.method public constructor <init>(LB55;Lco/bird/android/model/wire/configs/RideConfig;)V
    .locals 0

    iput-object p1, p0, LB55$x;->g:LB55;

    iput-object p2, p0, LB55$x;->h:Lco/bird/android/model/wire/configs/RideConfig;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Balance;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Balance;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "balance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB55$x;->g:LB55;

    invoke-static {v0, p1}, LB55;->access$hasSeenAutoPay(LB55;Lco/bird/android/model/Balance;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    new-instance v0, Lkotlin/Pair;

    iget-object v1, p0, LB55$x;->h:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayRefillAmount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, LB55$x;->h:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayExpName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz p1, :cond_0

    if-eqz v1, :cond_0

    sget-object p1, Lco/bird/android/model/RideRequirement$AutoPay;->INSTANCE:Lco/bird/android/model/RideRequirement$AutoPay;

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    iget-object p1, p0, LB55$x;->g:LB55;

    invoke-static {p1, v0}, LB55;->access$autoPayOptIn(LB55;Ljava/lang/String;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p0, p1}, LB55$x;->a(Lco/bird/android/model/Balance;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
