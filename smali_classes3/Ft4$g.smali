.class public final LFt4$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFt4;->o()V
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
        "Lco/bird/android/model/Balance;",
        "+",
        "Lco/bird/api/response/BalanceRefundResponse;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/Balance;",
        "Lco/bird/api/response/BalanceRefundResponse;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRefundAccountBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundAccountBalancePresenter.kt\nco/bird/android/feature/selfservepayment/refund/RefundAccountBalancePresenter$setupClickListeners$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LFt4;


# direct methods
.method public constructor <init>(LFt4;)V
    .locals 0

    iput-object p1, p0, LFt4$g;->g:LFt4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LFt4$g;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Balance;",
            "Lco/bird/api/response/BalanceRefundResponse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Balance;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/BalanceRefundResponse;

    invoke-virtual {p1}, Lco/bird/api/response/BalanceRefundResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget-object v4, p0, LFt4$g;->g:LFt4;

    invoke-static {v4}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object v4

    invoke-virtual {v4, v1}, LIt4;->t(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lco/bird/api/response/BalanceRefundResponse;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_3

    iget-object v4, p0, LFt4$g;->g:LFt4;

    invoke-static {v4}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object v4

    invoke-virtual {v4, v1}, LIt4;->Ql(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p1}, Lco/bird/api/response/BalanceRefundResponse;->getAmount()Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_4
    move p1, v1

    :goto_2
    if-lez p1, :cond_5

    move p1, v3

    goto :goto_3

    :cond_5
    move p1, v1

    :goto_3
    sget-object v4, Lxx1;->a:Lxx1;

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getBalance()J

    move-result-wide v5

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0

    sget-object v7, LUx1;->d:LUx1;

    invoke-virtual {v4, v5, v6, v0, v7}, Lxx1;->d(JLjava/util/Currency;LUx1;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, LFt4$g;->g:LFt4;

    invoke-static {v4}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object v4

    xor-int/2addr p1, v3

    invoke-virtual {v4, p1}, LIt4;->Rl(Z)V

    iget-object p1, p0, LFt4$g;->g:LFt4;

    invoke-static {p1}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object p1

    const/4 v4, 0x2

    invoke-static {p1, v1, v1, v4, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object p1, p0, LFt4$g;->g:LFt4;

    invoke-static {p1}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object v4

    new-instance v5, LpB1;

    iget-object p1, p0, LFt4$g;->g:LFt4;

    invoke-static {p1}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object p1

    sget v6, Lnl4;->update_successful:I

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v6, v7}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v6, p0, LFt4$g;->g:LFt4;

    invoke-static {v6}, LFt4;->access$getUi$p(LFt4;)LIt4;

    move-result-object v6

    sget v7, Lnl4;->your_refund_has_been_applied:I

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v1

    invoke-virtual {v6, v7, v3}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lnl4;->general_got_it:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v5, p1, v0, v1, v2}, LpB1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, LFt4$g$a;

    iget-object p1, p0, LFt4$g;->g:LFt4;

    invoke-direct {v8, p1}, LFt4$g$a;-><init>(LFt4;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x76

    const/4 v13, 0x0

    invoke-static/range {v4 .. v13}, LH31$a;->showBirdDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
