.class final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->PartnerAuthScreen(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenKt$PartnerAuthScreen$1$1"
    f = "PartnerAuthScreen.kt"
    i = {}
    l = {
        0x76
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $activityViewModel:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

.field final synthetic $bottomSheetState:LGU2;

.field final synthetic $uriHandler:LDf6;

.field final synthetic $viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

.field final synthetic $viewModel:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

.field label:I


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;LGU2;LDf6;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;",
            "LGU2;",
            "LDf6;",
            "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$bottomSheetState:LGU2;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$uriHandler:LDf6;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$activityViewModel:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$viewModel:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$bottomSheetState:LGU2;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$uriHandler:LDf6;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$activityViewModel:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$viewModel:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;LGU2;LDf6;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$viewEffect:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenBottomSheet;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$bottomSheetState:LGU2;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->label:I

    invoke-virtual {p1, p0}, LGU2;->m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_2
    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenUrl;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$uriHandler:LDf6;

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenUrl;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenUrl;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LDf6;->openUri(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenPartnerAuth;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$activityViewModel:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenPartnerAuth;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect$OpenPartnerAuth;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->openPartnerAuthFlowInBrowser(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;->$viewModel:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->onViewEffectLaunched()V

    :cond_4
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
