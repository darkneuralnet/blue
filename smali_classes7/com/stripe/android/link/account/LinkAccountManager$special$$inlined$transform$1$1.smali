.class public final Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LGu1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 LinkAccountManager.kt\ncom/stripe/android/link/account/LinkAccountManager\n*L\n1#1,222:1\n44#2,36:223\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$this$flow:LGu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGu1<",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/link/account/LinkAccountManager;


# direct methods
.method public constructor <init>(LGu1;Lcom/stripe/android/link/account/LinkAccountManager;)V
    .locals 0

    iput-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->$$this$flow:LGu1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;-><init>(Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    iget v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v2, 0x1

    const/4 v11, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v2, :cond_4

    if-eq v1, v10, :cond_3

    if-eq v1, v9, :cond_2

    if-ne v1, v8, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, LGu1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_9

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    check-cast p1, LGu1;

    iget-object v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_5

    :cond_4
    iget-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    check-cast p1, LGu1;

    iget-object v1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->$$this$flow:LGu1;

    check-cast p1, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object p1

    if-nez p1, :cond_18

    :cond_6
    iget-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->access$getCookieStore$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/account/CookieStore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/account/CookieStore;->getAuthSessionCookie$link_release()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    const/4 p1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    iput-object p0, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput v2, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    move-object v2, p1

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_7

    return-object v7

    :cond_7
    move-object v1, p0

    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object p2

    goto :goto_2

    :cond_8
    move-object p2, v11

    :cond_9
    :goto_2
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_a
    sget-object p2, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    :goto_3
    check-cast p2, Lcom/stripe/android/link/model/AccountStatus;

    if-nez p2, :cond_b

    move-object p2, v1

    goto :goto_4

    :cond_b
    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    goto/16 :goto_d

    :cond_c
    move-object p1, p2

    move-object p2, p0

    :goto_4
    iget-object v1, p2, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {v1}, Lcom/stripe/android/link/account/LinkAccountManager;->access$getCookieStore$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/account/CookieStore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/account/CookieStore;->getNewUserEmail$link_release()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_11

    iget-object v1, p2, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    iput-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput v10, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_d

    return-object v7

    :cond_d
    move-object v12, v1

    move-object v1, p2

    move-object p2, v12

    :goto_5
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object p2

    goto :goto_6

    :cond_e
    move-object p2, v11

    :cond_f
    :goto_6
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_10

    goto :goto_7

    :cond_10
    sget-object p2, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    :goto_7
    check-cast p2, Lcom/stripe/android/link/model/AccountStatus;

    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    goto :goto_8

    :cond_11
    move-object v1, p2

    move-object p2, p1

    move-object p1, v11

    :goto_8
    if-nez p1, :cond_18

    iget-object p1, v1, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-static {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->access$getConfig$p(Lcom/stripe/android/link/account/LinkAccountManager;)Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerEmail()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_17

    iget-object p1, v1, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {p1, v2}, Lcom/stripe/android/link/account/LinkAccountManager;->hasUserLoggedOut(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_12

    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    goto :goto_c

    :cond_12
    iget-object v1, v1, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1;->this$0:Lcom/stripe/android/link/account/LinkAccountManager;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    iput-object p2, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v11, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput v9, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_13

    return-object v7

    :cond_13
    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    :goto_9
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_14

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object p2

    goto :goto_a

    :cond_14
    move-object p2, v11

    :cond_15
    :goto_a
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_16

    goto :goto_b

    :cond_16
    sget-object p2, Lcom/stripe/android/link/model/AccountStatus;->Error:Lcom/stripe/android/link/model/AccountStatus;

    :goto_b
    check-cast p2, Lcom/stripe/android/link/model/AccountStatus;

    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    goto :goto_c

    :cond_17
    move-object p1, v11

    :goto_c
    if-nez p1, :cond_18

    sget-object p1, Lcom/stripe/android/link/model/AccountStatus;->SignedOut:Lcom/stripe/android/link/model/AccountStatus;

    :cond_18
    :goto_d
    iput-object v11, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$0:Ljava/lang/Object;

    iput-object v11, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->L$1:Ljava/lang/Object;

    iput v8, v0, Lcom/stripe/android/link/account/LinkAccountManager$special$$inlined$transform$1$1$1;->label:I

    invoke-interface {p2, p1, v0}, LGu1;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_19

    return-object v7

    :cond_19
    :goto_e
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
