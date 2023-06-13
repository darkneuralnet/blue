.class public final Lcom/stripe/android/paymentsheet/LinkHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;,
        Lcom/stripe/android/paymentsheet/LinkHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001WB\u0019\u0008\u0007\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\u0008U\u0010VJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0013\u0010\u0007\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000c\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0004J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0006J/\u0010#\u001a\u00020\u00042\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u0006\u0010%\u001a\u00020\u0004J\"\u0010%\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u0012R\u0017\u0010*\u001a\u00020)8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001d\u00106\u001a\u0008\u0012\u0004\u0012\u000202058\u0006\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R*\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u0016\u0010B\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010=R\u001d\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u00060E8\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010=R\u001f\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060E8\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010G\u001a\u0004\u0008K\u0010IR\u001a\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u00060:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010=R\u001d\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00060E8\u0006\u00a2\u0006\u000c\n\u0004\u0008M\u0010G\u001a\u0004\u0008N\u0010IR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010=R\u001f\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0E8\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010G\u001a\u0004\u0008Q\u0010IR\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00060R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010T\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006X"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "state",
        "",
        "setupLink",
        "",
        "requestLinkVerification",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "configuration",
        "setupLinkWithVerification",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "paymentMethodCreateParams",
        "shouldCompleteLinkInlineFlow",
        "completeLinkInlinePayment",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "convertToPaymentResult",
        "Lu5;",
        "activityResultCaller",
        "registerFromActivity",
        "unregisterFromActivity",
        "LZC0;",
        "scope",
        "setupLinkLaunchingEagerly",
        "prepareLink",
        "success",
        "handleLinkVerificationResult",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "userInput",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentSelection",
        "payWithLinkInline",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "launchLink",
        "launchedDirectly",
        "result",
        "onLinkActivityResult",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "linkLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "getLinkLauncher",
        "()Lcom/stripe/android/link/LinkPaymentLauncher;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "LBX2;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
        "_processingState",
        "LBX2;",
        "LEu1;",
        "processingState",
        "LEu1;",
        "getProcessingState",
        "()LEu1;",
        "LGX2;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
        "linkInlineSelection",
        "LGX2;",
        "getLinkInlineSelection",
        "()LGX2;",
        "setLinkInlineSelection",
        "(LGX2;)V",
        "launchedLinkDirectly",
        "Z",
        "_showLinkVerificationDialog",
        "LtP5;",
        "showLinkVerificationDialog",
        "LtP5;",
        "getShowLinkVerificationDialog",
        "()LtP5;",
        "_isLinkEnabled",
        "isLinkEnabled",
        "_activeLinkSession",
        "activeLinkSession",
        "getActiveLinkSession",
        "_linkConfiguration",
        "linkConfiguration",
        "getLinkConfiguration",
        "LFh0;",
        "linkVerificationChannel",
        "LFh0;",
        "<init>",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;Landroidx/lifecycle/p;)V",
        "ProcessingState",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final _activeLinkSession:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _isLinkEnabled:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _linkConfiguration:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private final _processingState:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
            ">;"
        }
    .end annotation
.end field

.field private final _showLinkVerificationDialog:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final activeLinkSession:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isLinkEnabled:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private launchedLinkDirectly:Z

.field private final linkConfiguration:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;"
        }
    .end annotation
.end field

.field private linkInlineSelection:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;"
        }
    .end annotation
.end field

.field private final linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

.field private final linkVerificationChannel:LFh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFh0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final processingState:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final showLinkVerificationDialog:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher;Landroidx/lifecycle/p;)V
    .locals 2

    const-string v0, "linkLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->savedStateHandle:Landroidx/lifecycle/p;

    const/4 p1, 0x4

    const/4 p2, 0x1

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, p1, v1}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->processingState:LEu1;

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkInlineSelection:LGX2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_showLinkVerificationDialog:LGX2;

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->showLinkVerificationDialog:LtP5;

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_isLinkEnabled:LGX2;

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled:LtP5;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_activeLinkSession:LGX2;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->activeLinkSession:LtP5;

    invoke-static {v1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_linkConfiguration:LGX2;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:LtP5;

    const/4 p1, 0x6

    invoke-static {p2, v1, v1, p1, v1}, LPh0;->b(ILk30;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LFh0;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkVerificationChannel:LFh0;

    return-void
.end method

.method public static final synthetic access$completeLinkInlinePayment(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/LinkHandler;->completeLinkInlinePayment(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$requestLinkVerification(Lcom/stripe/android/paymentsheet/LinkHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/LinkHandler;->requestLinkVerification(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setupLinkWithVerification(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/LinkHandler;->setupLinkWithVerification(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final completeLinkInlinePayment(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->L$0:Ljava/lang/Object;

    check-cast p1, LBX2;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p4, Lkotlin/Result;

    invoke-virtual {p4}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    if-eqz p3, :cond_4

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3, p2}, Lcom/stripe/android/paymentsheet/LinkHandler;->launchLink(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    iget-object p4, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    iput-object p3, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->label:I

    invoke-virtual {p4, p1, p2, v0}, Lcom/stripe/android/link/LinkPaymentLauncher;->attachNewCardToAccount-0E7RQCE(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p3

    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_6

    move-object p2, p4

    :cond_6
    check-cast p2, Lcom/stripe/android/link/LinkPaymentDetails$New;

    new-instance p3, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;

    invoke-direct {p3, p2}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;-><init>(Lcom/stripe/android/link/LinkPaymentDetails$New;)V

    iput-object p4, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/LinkHandler$completeLinkInlinePayment$1;->label:I

    invoke-interface {p1, p3, v0}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final convertToPaymentResult(Lcom/stripe/android/link/LinkActivityResult;)Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
    .locals 1

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;-><init>(Ljava/lang/Throwable;)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic launchLink$default(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/LinkHandler;->launchLink(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;)V

    return-void
.end method

.method private final requestLinkVerification(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_showLinkVerificationDialog:LGX2;

    const/4 v1, 0x1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkVerificationChannel:LFh0;

    invoke-interface {v0, p1}, Lks4;->G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final setupLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_isLinkEnabled:LGX2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v3}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_activeLinkSession:LGX2;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getLoginState()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    sget-object v4, Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;->LoggedIn:Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    if-ne v3, v4, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_linkConfiguration:LGX2;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setupLinkWithVerification(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, p1

    move-object v2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkWithVerification$1;->label:I

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->requestLinkVerification(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v2, p0

    move-object v3, p1

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/LinkHandler;->launchLink$default(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;ILjava/lang/Object;)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method


# virtual methods
.method public final getActiveLinkSession()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->activeLinkSession:LtP5;

    return-object v0
.end method

.method public final getLinkConfiguration()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:LtP5;

    return-object v0
.end method

.method public final getLinkInlineSelection()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkInlineSelection:LGX2;

    return-object v0
.end method

.method public final getLinkLauncher()Lcom/stripe/android/link/LinkPaymentLauncher;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    return-object v0
.end method

.method public final getProcessingState()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->processingState:LEu1;

    return-object v0
.end method

.method public final getShowLinkVerificationDialog()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->showLinkVerificationDialog:LtP5;

    return-object v0
.end method

.method public final handleLinkVerificationResult(Z)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_showLinkVerificationDialog:LGX2;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_activeLinkSession:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkVerificationChannel:LFh0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final isLinkEnabled()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled:LtP5;

    return-object v0
.end method

.method public final launchLink()V
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/LinkHandler;->launchLink$default(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final launchLink(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->launchedLinkDirectly:Z

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-virtual {p2, p1, p3}, Lcom/stripe/android/link/LinkPaymentLauncher;->present(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object p2, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;

    invoke-interface {p1, p2}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->launchedLinkDirectly:Z

    if-eqz v1, :cond_0

    instance-of v1, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityResult$Canceled;->getReason()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->BackPressed:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/LinkHandler;->convertToPaymentResult(Lcom/stripe/android/link/LinkActivityResult;)Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;-><init>(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    :goto_1
    return-void
.end method

.method public final payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/inline/UserInput;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    instance-of v3, v2, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;

    iget v4, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    const/4 v6, 0x5

    const/4 v7, 0x2

    const-string v8, "processing"

    const/4 v9, 0x0

    const/4 v10, 0x1

    packed-switch v5, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_1
    iget-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget-boolean v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iget-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v7, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    move-object v12, v5

    move-object v5, v2

    move v2, v1

    move-object v1, v7

    goto/16 :goto_4

    :pswitch_4
    iget-boolean v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iget-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v7, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v12, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_5
    iget-boolean v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iget-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v12, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    check-cast v12, Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    check-cast v13, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v14, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    check-cast v14, Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v15, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    check-cast v15, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v14

    move-object v14, v12

    move-object v12, v13

    move-object/from16 v13, v17

    goto/16 :goto_3

    :pswitch_6
    iget-boolean v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iget-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v12, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    check-cast v12, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    check-cast v13, Lcom/stripe/android/link/ui/inline/UserInput;

    iget-object v14, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lcom/stripe/android/paymentsheet/LinkHandler;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v14

    move v14, v1

    move-object/from16 v1, v17

    goto :goto_2

    :pswitch_7
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    instance-of v2, v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v5

    if-eqz v5, :cond_11

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/LinkHandler;->savedStateHandle:Landroidx/lifecycle/p;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v2, v8, v12}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object v12, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;

    iput-object v0, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    move-object/from16 v13, p1

    iput-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    move/from16 v14, p3

    iput-boolean v14, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iput v10, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-interface {v2, v12, v3}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2

    return-object v4

    :cond_2
    move-object v12, v1

    move-object v1, v0

    :goto_2
    iget-object v2, v1, Lcom/stripe/android/paymentsheet/LinkHandler;->linkConfiguration:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_10

    check-cast v2, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v15, v1, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-virtual {v15, v2}, Lcom/stripe/android/link/LinkPaymentLauncher;->getAccountStatusFlow(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)LEu1;

    move-result-object v15

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$4:Ljava/lang/Object;

    iput-boolean v14, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iput v7, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-static {v15, v3}, LVu1;->w(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v4, :cond_3

    return-object v4

    :cond_3
    move-object/from16 v17, v15

    move-object v15, v1

    move v1, v14

    move-object v14, v5

    move-object v5, v2

    move-object/from16 v2, v17

    :goto_3
    check-cast v2, Lcom/stripe/android/link/model/AccountStatus;

    sget-object v16, Lcom/stripe/android/paymentsheet/LinkHandler$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v16, v2

    const/4 v11, 0x3

    if-eq v2, v10, :cond_e

    const/4 v10, 0x4

    if-eq v2, v7, :cond_a

    if-eq v2, v11, :cond_a

    if-eq v2, v10, :cond_4

    if-eq v2, v6, :cond_4

    goto/16 :goto_b

    :cond_4
    iget-object v2, v15, Lcom/stripe/android/paymentsheet/LinkHandler;->_activeLinkSession:LGX2;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v2, v6}, LGX2;->setValue(Ljava/lang/Object;)V

    if-eqz v13, :cond_9

    iget-object v2, v15, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    iput-object v15, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v12, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    iput-object v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$4:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    const/4 v6, 0x7

    iput v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-virtual {v2, v5, v13, v3}, Lcom/stripe/android/link/LinkPaymentLauncher;->signInWithUserInput-0E7RQCE(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    return-object v4

    :cond_5
    move-object v5, v2

    move-object v6, v13

    move v2, v1

    move-object v1, v15

    :goto_4
    invoke-static {v5}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_7

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    const/16 v5, 0x8

    iput v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-virtual {v1, v6, v12, v2, v3}, Lcom/stripe/android/paymentsheet/LinkHandler;->payWithLinkInline(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    return-object v4

    :cond_6
    :goto_5
    move-object v15, v1

    goto :goto_7

    :cond_7
    iget-object v2, v1, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    new-instance v5, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;

    invoke-virtual {v7}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;-><init>(Ljava/lang/String;)V

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    const/16 v6, 0x9

    iput v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-interface {v2, v5, v3}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_8

    return-object v4

    :cond_8
    :goto_6
    iget-object v2, v1, Lcom/stripe/android/paymentsheet/LinkHandler;->savedStateHandle:Landroidx/lifecycle/p;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v8, v5}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v1, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object v5, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    const/16 v6, 0xa

    iput v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-interface {v2, v5, v3}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    return-object v4

    :goto_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_8

    :cond_9
    const/4 v1, 0x0

    :goto_8
    if-nez v1, :cond_11

    iget-object v1, v15, Lcom/stripe/android/paymentsheet/LinkHandler;->savedStateHandle:Landroidx/lifecycle/p;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v15, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object v2, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;

    const/4 v5, 0x0

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$4:Ljava/lang/Object;

    const/16 v5, 0xb

    iput v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-interface {v1, v2, v3}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    return-object v4

    :cond_a
    iput-object v15, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v13, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v14, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$4:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->Z$0:Z

    iput v10, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-direct {v15, v3}, Lcom/stripe/android/paymentsheet/LinkHandler;->requestLinkVerification(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_b

    return-object v4

    :cond_b
    move-object v12, v13

    move-object v7, v14

    move-object v13, v15

    :goto_9
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_d

    instance-of v2, v12, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz v2, :cond_c

    if-eqz v1, :cond_c

    const/4 v1, 0x0

    const/4 v9, 0x1

    goto :goto_a

    :cond_c
    const/4 v1, 0x0

    :goto_a
    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-direct {v13, v5, v7, v9, v3}, Lcom/stripe/android/paymentsheet/LinkHandler;->completeLinkInlinePayment(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    return-object v4

    :cond_d
    iget-object v1, v13, Lcom/stripe/android/paymentsheet/LinkHandler;->savedStateHandle:Landroidx/lifecycle/p;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v13, Lcom/stripe/android/paymentsheet/LinkHandler;->_processingState:LBX2;

    sget-object v2, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;

    const/4 v5, 0x0

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    const/4 v5, 0x6

    iput v5, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-interface {v1, v2, v3}, LBX2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    return-object v4

    :cond_e
    iget-object v2, v15, Lcom/stripe/android/paymentsheet/LinkHandler;->_activeLinkSession:LGX2;

    const/4 v6, 0x1

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v2, v7}, LGX2;->setValue(Ljava/lang/Object;)V

    instance-of v2, v13, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz v2, :cond_f

    if-eqz v1, :cond_f

    move v9, v6

    :cond_f
    const/4 v1, 0x0

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$2:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$3:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->L$4:Ljava/lang/Object;

    iput v11, v3, Lcom/stripe/android/paymentsheet/LinkHandler$payWithLinkInline$1;->label:I

    invoke-direct {v15, v5, v14, v9, v3}, Lcom/stripe/android/paymentsheet/LinkHandler;->completeLinkInlinePayment(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    return-object v4

    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    :goto_b
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final prepareLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/LinkHandler;->setupLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/LinkState;->isReadyForUse()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v0, "selection"

    sget-object v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final registerFromActivity(Lu5;)V
    .locals 2

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    new-instance v1, Lcom/stripe/android/paymentsheet/LinkHandler$registerFromActivity$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/LinkHandler$registerFromActivity$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/link/LinkPaymentLauncher;->register(Lu5;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setLinkInlineSelection(LGX2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkInlineSelection:LGX2;

    return-void
.end method

.method public final setupLinkLaunchingEagerly(LZC0;Lcom/stripe/android/paymentsheet/state/LinkState;)V
    .locals 12

    const-string v1, "scope"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/LinkHandler;->setupLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/LinkState;->getLoginState()Lcom/stripe/android/paymentsheet/state/LinkState$LoginState;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    if-nez v3, :cond_1

    const/4 v3, -0x1

    goto :goto_1

    :cond_1
    sget-object v4, Lcom/stripe/android/paymentsheet/LinkHandler$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    :goto_1
    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkLaunchingEagerly$1;

    invoke-direct {v9, p0, p2, v1}, Lcom/stripe/android/paymentsheet/LinkHandler$setupLinkLaunchingEagerly$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/state/LinkState;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-object v6, p1

    invoke-static/range {v6 .. v11}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/state/LinkState;->getConfiguration()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/LinkHandler;->launchLink$default(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;ZLcom/stripe/android/model/PaymentMethodCreateParams;ILjava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public final unregisterFromActivity()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkPaymentLauncher;->unregister()V

    return-void
.end method
