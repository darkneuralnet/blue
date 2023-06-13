.class public final LB55$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55;->c1(Lco/bird/android/model/wire/configs/Config;)Lio/reactivex/F;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Balance;",
        "balance",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Balance;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/configs/BankRedirectConfig;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/BankRedirectConfig;)V
    .locals 0

    iput-object p1, p0, LB55$r;->g:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Balance;)Ljava/lang/Boolean;
    .locals 5

    const-string v0, "balance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB55$r;->g:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BankRedirectConfig;->getMinBalanceToRide()Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, LB55$r;->g:Lco/bird/android/model/wire/configs/BankRedirectConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/BankRedirectConfig;->getAllowSufficientBalanceToStartRide()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v0, :cond_0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p0, p1}, LB55$r;->a(Lco/bird/android/model/Balance;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
