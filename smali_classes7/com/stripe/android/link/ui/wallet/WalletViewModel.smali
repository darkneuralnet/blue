.class public final Lcom/stripe/android/link/ui/wallet/WalletViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u0001]B9\u0008\u0007\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010C\u001a\u00020B\u00a2\u0006\u0004\u0008[\u0010\\J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0002J*\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u001e\u0010\u001c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000cH\u0002J\u0008\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u001eH\u0002J\u0006\u0010$\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010\'\u001a\u00020\u0006J\u0010\u0010)\u001a\u00020\u00062\u0008\u0008\u0002\u0010(\u001a\u00020\u0019J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0002J\u000e\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\u0006R\u0017\u00102\u001a\u0002018\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u001a\u0010J\u001a\u0008\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u001d\u0010M\u001a\u0008\u0012\u0004\u0012\u00020I0L8\u0006\u00a2\u0006\u000c\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010PR\u0017\u0010R\u001a\u00020Q8\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010UR\u0017\u0010W\u001a\u00020V8\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010Z\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006^"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletViewModel;",
        "LOr6;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "selectedPaymentDetails",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "",
        "performPaymentConfirmation",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "confirmParams",
        "confirmStripeIntent",
        "",
        "clientSecret",
        "handleNextAction",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "performPaymentDetailsUpdate-gIAlu-s",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "performPaymentDetailsUpdate",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "createPaymentMethodCreateParams",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "paymentResult",
        "handleConfirmPaymentSuccess",
        "",
        "initialSetup",
        "selectedItem",
        "loadPaymentDetails",
        "clearError",
        "",
        "error",
        "onError",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "fatalError",
        "onFatal",
        "onConfirmPayment",
        "expanded",
        "setExpanded",
        "payAnotherWay",
        "clearBackStack",
        "addNewPaymentMethod",
        "paymentDetails",
        "editPaymentMethod",
        "setDefault",
        "deletePaymentMethod",
        "item",
        "onItemSelected",
        "onAlertDismissed",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "args",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "getArgs",
        "()Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "Lcom/stripe/android/link/model/Navigator;",
        "navigator",
        "Lcom/stripe/android/link/model/Navigator;",
        "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
        "confirmationManager",
        "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "intentConfirmationInterceptor",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "LGX2;",
        "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
        "_uiState",
        "LGX2;",
        "LtP5;",
        "uiState",
        "LtP5;",
        "getUiState",
        "()LtP5;",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "expiryDateController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getExpiryDateController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "Lcom/stripe/android/ui/core/elements/CvcController;",
        "cvcController",
        "Lcom/stripe/android/ui/core/elements/CvcController;",
        "getCvcController",
        "()Lcom/stripe/android/ui/core/elements/CvcController;",
        "<init>",
        "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/IntentConfirmationInterceptor;)V",
        "Factory",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWalletViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,418:1\n47#2:419\n49#2:423\n50#3:420\n55#3:422\n106#4:421\n230#5,5:424\n230#5,5:441\n230#5,5:447\n230#5,5:452\n230#5,5:457\n230#5,5:462\n230#5,5:467\n230#5,5:472\n230#5,5:477\n230#5,5:482\n230#5,5:487\n618#6,12:429\n1#7:446\n*S KotlinDebug\n*F\n+ 1 WalletViewModel.kt\ncom/stripe/android/link/ui/wallet/WalletViewModel\n*L\n72#1:419\n72#1:423\n72#1:420\n72#1:422\n72#1:421\n118#1:424,5\n144#1:441,5\n233#1:447,5\n252#1:452,5\n271#1:457,5\n300#1:462,5\n324#1:467,5\n330#1:472,5\n339#1:477,5\n370#1:482,5\n381#1:487,5\n137#1:429,12\n*E\n"
    }
.end annotation


# instance fields
.field private final _uiState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/link/LinkActivityContract$Args;

.field private final confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

.field private final cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

.field private final expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigator:Lcom/stripe/android/link/model/Navigator;

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private final uiState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/IntentConfirmationInterceptor;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "args"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkAccountManager"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "navigator"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "confirmationManager"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "logger"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "intentConfirmationInterceptor"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LOr6;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    iput-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    iput-object v5, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object v6, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccount()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    check-cast v2, Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {v1, v2}, Lcom/stripe/android/link/model/SupportedPaymentMethodTypesKt;->supportedPaymentMethodTypes(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/model/LinkAccount;)Ljava/util/Set;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7fe

    const/16 v17, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v17}, Lcom/stripe/android/link/ui/wallet/WalletUiState;-><init>(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    iput-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:LtP5;

    new-instance v2, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v3, Lcom/stripe/android/uicore/elements/DateConfig;

    invoke-direct {v3}, Lcom/stripe/android/uicore/elements/DateConfig;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x2

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    invoke-direct/range {p1 .. p6}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v2, Lcom/stripe/android/ui/core/elements/CvcController;

    const/4 v9, 0x0

    new-instance v10, Lcom/stripe/android/link/ui/wallet/WalletViewModel$special$$inlined$map$1;

    invoke-direct {v10, v1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    const/4 v12, 0x0

    const/16 v13, 0xd

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, Lcom/stripe/android/ui/core/elements/CvcController;-><init>(Lcom/stripe/android/ui/core/elements/CvcConfig;LEu1;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->loadPaymentDetails$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLjava/lang/String;ILjava/lang/Object;)V

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletViewModel$1;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move/from16 p5, v6

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletViewModel$2;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    move-object/from16 p1, v1

    move-object/from16 p4, v5

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletViewModel$3;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$3;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    move-object/from16 p1, v1

    move-object/from16 p4, v5

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$4;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x3

    const/4 v6, 0x0

    move-object/from16 p1, v1

    move-object/from16 p4, v5

    move/from16 p5, v3

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)Lcom/stripe/android/link/model/Navigator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    return-object p0
.end method

.method public static final synthetic access$get_uiState$p(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    return-object p0
.end method

.method public static final synthetic access$handleConfirmPaymentSuccess(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->handleConfirmPaymentSuccess(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/link/ui/ErrorMessage;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onError(Lcom/stripe/android/link/ui/ErrorMessage;)V

    return-void
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$onFatal(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onFatal(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$performPaymentConfirmation(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performPaymentDetailsUpdate-gIAlu-s(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentDetailsUpdate-gIAlu-s(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addNewPaymentMethod$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->addNewPaymentMethod(Z)V

    return-void
.end method

.method private final clearError()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x7bf

    const/16 v16, 0x0

    invoke-static/range {v3 .. v16}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method private final confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    new-instance v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel$confirmStripeIntent$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$confirmStripeIntent$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)V

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final createPaymentMethodCreateParams(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getCvcInput()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    const-string v1, "cvc"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "card"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    :cond_2
    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2, v2}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createLink(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    return-object p1
.end method

.method private final handleConfirmPaymentSuccess(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2, p1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->updateWithPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "Error: "

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    if-eqz p1, :cond_2

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleConfirmPaymentSuccess$2;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleConfirmPaymentSuccess$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_2
    :goto_0
    return-void
.end method

.method private final handleNextAction(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    new-instance v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleNextAction$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$handleNextAction$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->handleNextAction(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final loadPaymentDetails(ZLjava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->setProcessing()Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, p2, v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$loadPaymentDetails$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static synthetic loadPaymentDetails$default(Lcom/stripe/android/link/ui/wallet/WalletViewModel;ZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->loadPaymentDetails(ZLjava/lang/String;)V

    return-void
.end method

.method private final onError(Lcom/stripe/android/link/ui/ErrorMessage;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2, p1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->updateWithError(Lcom/stripe/android/link/ui/ErrorMessage;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Error: "

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onError(Lcom/stripe/android/link/ui/ErrorMessage;)V

    return-void
.end method

.method private final onFatal(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Fatal error: "

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->dismiss(Lcom/stripe/android/link/LinkActivityResult;)Lkotlin/Unit;

    return-void
.end method

.method private final performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;

    iget v4, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v9, v3

    iget-object v2, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v1, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget-object v1, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/link/model/LinkAccount;

    iget-object v4, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-object v6, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/link/ui/wallet/WalletViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    move-object v2, v1

    move-object v1, v4

    move-object/from16 v4, v26

    goto :goto_3

    :cond_4
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    instance-of v2, v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v2, :cond_5

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_1

    :cond_5
    move-object v2, v10

    :goto_1
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v2

    if-eqz v2, :cond_6

    move v2, v8

    goto :goto_2

    :cond_6
    move v2, v5

    :goto_2
    if-eqz v2, :cond_e

    iput-object v0, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    iput-object v1, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$1:Ljava/lang/Object;

    move-object/from16 v2, p2

    iput-object v2, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$2:Ljava/lang/Object;

    iput v8, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    invoke-direct {v0, v1, v9}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentDetailsUpdate-gIAlu-s(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_7

    return-object v3

    :cond_7
    move-object v6, v0

    :goto_3
    invoke-static {v4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v11

    if-nez v11, :cond_c

    check-cast v4, Lcom/stripe/android/model/ConsumerPaymentDetails;

    invoke-virtual {v4}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v11, v10

    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {v13}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    if-nez v5, :cond_9

    move v5, v8

    move-object v11, v12

    goto :goto_4

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Collection contains more than one matching element."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    if-eqz v5, :cond_b

    check-cast v11, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iput-object v10, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    iput-object v10, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$1:Ljava/lang/Object;

    iput-object v10, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$2:Ljava/lang/Object;

    iput v7, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    invoke-direct {v6, v11, v2, v9}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->performPaymentConfirmation(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_14

    return-object v3

    :cond_b
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Collection contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    iget-object v4, v6, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_d
    invoke-interface {v4}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-static {v11}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v22

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x5ef

    const/16 v25, 0x0

    invoke-static/range {v12 .. v25}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    invoke-interface {v4, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_7

    :cond_e
    move-object/from16 v2, p2

    invoke-direct/range {p0 .. p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->createPaymentMethodCreateParams(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v2}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v2}, Lcom/stripe/android/link/LinkActivityContract$Args;->getShippingValues$link_release()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-static {v2}, Lcom/stripe/android/ui/core/address/AddressUtilKt;->toConfirmPaymentIntentShipping(Ljava/util/Map;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    move-result-object v2

    move-object v7, v2

    goto :goto_5

    :cond_f
    move-object v7, v10

    :goto_5
    const/4 v8, 0x0

    iput-object v0, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->L$0:Ljava/lang/Object;

    iput v6, v9, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentConfirmation$1;->label:I

    move-object v6, v1

    invoke-interface/range {v4 .. v9}, Lcom/stripe/android/IntentConfirmationInterceptor;->intercept(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_10

    return-object v3

    :cond_10
    move-object v1, v0

    :goto_6
    check-cast v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;

    instance-of v3, v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    if-eqz v3, :cond_11

    check-cast v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-virtual {v2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;->getConfirmParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    goto :goto_7

    :cond_11
    instance-of v3, v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    if-eqz v3, :cond_12

    check-cast v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    invoke-virtual {v2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->handleNextAction(Ljava/lang/String;)V

    goto :goto_7

    :cond_12
    instance-of v3, v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    if-eqz v3, :cond_13

    new-instance v3, Lcom/stripe/android/link/ui/ErrorMessage$Raw;

    check-cast v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    invoke-virtual {v2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/stripe/android/link/ui/ErrorMessage$Raw;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v3}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->onError(Lcom/stripe/android/link/ui/ErrorMessage;)V

    goto :goto_7

    :cond_13
    instance-of v2, v2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;

    if-eqz v2, :cond_14

    sget-object v2, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->handleConfirmPaymentSuccess(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    :cond_14
    :goto_7
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final performPaymentDetailsUpdate-gIAlu-s(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;

    iget v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:LtP5;

    invoke-interface {p2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-static {p2}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->access$toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p2

    new-instance v2, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v2, v4, p1, p2}, Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput v3, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel$performPaymentDetailsUpdate$1;->label:I

    invoke-virtual {p1, v2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->updatePaymentDetails-gIAlu-s(Lcom/stripe/android/model/ConsumerPaymentDetailsUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    return-object p1
.end method


# virtual methods
.method public final addNewPaymentMethod(Z)V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    new-instance v1, Lcom/stripe/android/link/LinkScreen$PaymentMethod;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/link/LinkScreen$PaymentMethod;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;

    return-void
.end method

.method public final deletePaymentMethod(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 8

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->setProcessing()Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletViewModel$deletePaymentMethod$2;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$deletePaymentMethod$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final editPaymentMethod(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 4

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->clearError()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    new-instance v1, Lcom/stripe/android/link/LinkScreen$CardEdit;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkScreen$CardEdit;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, p1, v2}, Lcom/stripe/android/link/model/Navigator;->navigateTo$default(Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/LinkScreen;ZILjava/lang/Object;)Lkotlin/Unit;

    return-void
.end method

.method public final getArgs()Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object v0
.end method

.method public final getCvcController()Lcom/stripe/android/ui/core/elements/CvcController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    return-object v0
.end method

.method public final getExpiryDateController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getUiState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:LtP5;

    return-object v0
.end method

.method public final onAlertDismissed()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x5ff

    const/16 v16, 0x0

    invoke-static/range {v3 .. v16}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final onConfirmPayment()V
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {v1}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccount()LtP5;

    move-result-object v1

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/model/LinkAccount;

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_2
    invoke-interface {v2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->setProcessing()Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onConfirmPayment$2;

    const/4 v2, 0x0

    invoke-direct {v7, p0, v0, v1, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$onConfirmPayment$2;-><init>(Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onItemSelected(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    const-string v1, "item"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->uiState:LtP5;

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->expiryDateController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    const-string v2, ""

    invoke-virtual {v1, v2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    invoke-virtual {v1, v2}, Lcom/stripe/android/ui/core/elements/CvcController;->onRawValueChange(Ljava/lang/String;)V

    iget-object v14, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :goto_0
    invoke-interface {v14}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v13

    move-object v1, v13

    check-cast v1, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x7fb

    const/16 v17, 0x0

    move-object/from16 v4, p1

    move-object/from16 v18, v13

    move/from16 v13, v16

    move-object v0, v14

    move-object/from16 v14, v17

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-interface {v0, v2, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    move-object v14, v0

    move-object/from16 v0, p0

    goto :goto_0
.end method

.method public final payAnotherWay()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->PayAnotherWay:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->cancel(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V

    return-void
.end method

.method public final setDefault(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "paymentDetails"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x3ff

    const/16 v17, 0x0

    invoke-static/range {v4 .. v17}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/link/ui/wallet/WalletViewModel$setDefault$2;

    const/4 v2, 0x0

    invoke-direct {v7, v1, v0, v2}, Lcom/stripe/android/link/ui/wallet/WalletViewModel$setDefault$2;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/ui/wallet/WalletViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final setExpanded(Z)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x7f7

    const/16 v16, 0x0

    move/from16 v7, p1

    invoke-static/range {v3 .. v16}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v3

    invoke-interface {v1, v2, v3}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method
