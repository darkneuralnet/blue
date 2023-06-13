.class public final LA51$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA51;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LA51$d;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LA51$d;",
        "kotlin.jvm.PlatformType",
        "state",
        "",
        "a",
        "(LA51$d;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LA51;


# direct methods
.method public constructor <init>(LA51;)V
    .locals 0

    iput-object p1, p0, LA51$f;->g:LA51;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA51$d;)V
    .locals 6

    instance-of v0, p1, LA51$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LA51$f;->g:LA51;

    invoke-static {v0}, LA51;->access$getNavigator$p(LA51;)Le13;

    move-result-object v0

    sget-object v2, Le13$b;->c:Le13$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lkotlin/Pair;

    check-cast p1, LA51$a;

    invoke-virtual {p1}, LA51$a;->b()Ljava/lang/Long;

    move-result-object v4

    const-string v5, "transaction_amount"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "transaction_currency"

    invoke-virtual {p1}, LA51$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v1

    invoke-interface {v0, v2, v3}, Le13;->J(Le13$b;[Lkotlin/Pair;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LA51$b;

    if-eqz v0, :cond_1

    iget-object p1, p0, LA51$f;->g:LA51;

    invoke-static {p1}, LA51;->access$getNavigator$p(LA51;)Le13;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    iget-object v2, p0, LA51$f;->g:LA51;

    invoke-static {v2}, LA51;->access$getReactiveConfig$p(LA51;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getDispute()Lco/bird/android/model/wire/configs/DisputeConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/DisputeConfig;->getZendeskArticleId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v2, v1}, Le13;->j0(Lco/bird/android/model/constant/MapMode;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, LA51$c;

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA51$d;

    invoke-virtual {p0, p1}, LA51$f;->a(LA51$d;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
