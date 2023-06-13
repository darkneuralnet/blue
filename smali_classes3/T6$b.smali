.class public final LT6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT6;->l()V
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
        "Lco/bird/android/model/wire/configs/BankRedirectConfig;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/configs/BankRedirectConfig;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
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
.field public final synthetic g:LT6;


# direct methods
.method public constructor <init>(LT6;)V
    .locals 0

    iput-object p1, p0, LT6$b;->g:LT6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LT6$b;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/configs/BankRedirectConfig;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/BankRedirectConfig;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BankRedirectConfig;->getMinBalanceToRide()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    sget-object v3, Lxx1;->a:Lxx1;

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    sget-object v5, LUx1;->d:LUx1;

    invoke-virtual {v3, v1, v2, v4, v5}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, p0, LT6$b;->g:LT6;

    invoke-static {v2}, LT6;->access$getUi$p(LT6;)LX6;

    move-result-object v2

    invoke-interface {v2, v1}, LX6;->e3(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, LT6$b;->g:LT6;

    invoke-static {v1}, LT6;->access$getUi$p(LT6;)LX6;

    move-result-object v1

    invoke-interface {v1}, LX6;->ah()V

    :goto_1
    iget-object v1, p0, LT6$b;->g:LT6;

    invoke-static {v1}, LT6;->access$getPreselectedPreloadAmount$p(LT6;)Lco/bird/android/buava/Optional;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, LT6$b;->g:LT6;

    invoke-static {p1}, LT6;->access$getConverter$p(LT6;)Lh04;

    move-result-object p1

    iget-object v0, p0, LT6$b;->g:LT6;

    invoke-static {v0}, LT6;->access$getPreselectedPreloadAmount$p(LT6;)Lco/bird/android/buava/Optional;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc04;

    invoke-virtual {p1, v0}, Lh04;->b(Lc04;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_2
    iget-object v1, p0, LT6$b;->g:LT6;

    invoke-static {v1}, LT6;->access$getConverter$p(LT6;)Lh04;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/BankRedirectConfig;->getReloadOptions()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Lh04;->a(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    :goto_2
    iget-object v0, p0, LT6$b;->g:LT6;

    invoke-static {v0}, LT6;->access$getUi$p(LT6;)LX6;

    move-result-object v0

    invoke-interface {v0, p1}, LX6;->Aj(Ljava/util/List;)V

    return-void
.end method
