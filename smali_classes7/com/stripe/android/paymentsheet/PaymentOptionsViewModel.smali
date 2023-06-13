.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;
.super Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0001WBi\u0008\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0014\u0010D\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010B\u0012\u0004\u0012\u00020C0A\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\u0008\u0008\u0001\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010T\u001a\u00020S\u00a2\u0006\u0004\u0008U\u0010VJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016J\u0008\u0010\u000e\u001a\u00020\u0004H\u0016J\u001b\u0010\u0011\u001a\u00020\u00042\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0012\u0010\u0011\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00042\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J\u0008\u0010\u001a\u001a\u00020\u0004H\u0016J\u0008\u0010\u001b\u001a\u00020\u0004H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R \u0010\'\u001a\u0008\u0012\u0004\u0012\u00020#0&8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130.8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010/\u001a\u0004\u00080\u00101R$\u00103\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090.8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010/\u001a\u0004\u0008;\u00101R\u001a\u0010=\u001a\u00020<8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\u00a8\u0006X"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
        "processingState",
        "",
        "handleLinkProcessingState",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentSelection",
        "processExistingPaymentMethod",
        "processNewPaymentMethod",
        "",
        "throwable",
        "onFatal",
        "onUserCancel",
        "onFinish",
        "",
        "error",
        "onError",
        "(Ljava/lang/Integer;)V",
        "",
        "onUserSelection",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "paymentResult",
        "onPaymentResult",
        "selection",
        "handlePaymentMethodSelected",
        "clearErrorMessages",
        "transitionToFirstScreen",
        "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
        "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
        "primaryButtonUiStateMapper",
        "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
        "LBX2;",
        "Lcom/stripe/android/paymentsheet/PaymentOptionResult;",
        "_paymentOptionResult",
        "LBX2;",
        "LTy5;",
        "paymentOptionResult",
        "LTy5;",
        "getPaymentOptionResult$paymentsheet_release",
        "()LTy5;",
        "LGX2;",
        "_error",
        "LGX2;",
        "LtP5;",
        "LtP5;",
        "getError$paymentsheet_release",
        "()LtP5;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "newPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "getNewPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "setNewPaymentSelection",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "primaryButtonUiState",
        "getPrimaryButtonUiState",
        "",
        "shouldCompleteLinkFlowInline",
        "Z",
        "getShouldCompleteLinkFlowInline",
        "()Z",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "Lcom/stripe/android/paymentsheet/PrefsRepository;",
        "prefsRepositoryFactory",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
        "customerRepository",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Landroid/app/Application;",
        "application",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "lpmRepository",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Lcom/stripe/android/paymentsheet/LinkHandler;",
        "linkHandler",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;)V",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/JvmSuppressWildcards;
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentOptionsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsViewModel.kt\ncom/stripe/android/paymentsheet/PaymentOptionsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"
    }
.end annotation


# instance fields
.field private final _error:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _paymentOptionResult:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionResult;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;

.field private final error:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

.field private final paymentOptionResult:LTy5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTy5<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionResult;",
            ">;"
        }
    .end annotation
.end field

.field private final primaryButtonUiState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation
.end field

.field private final primaryButtonUiStateMapper:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

.field private final shouldCompleteLinkFlowInline:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;)V
    .locals 27
    .param p5    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Lcom/stripe/android/paymentsheet/PrefsRepository;",
            ">;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/paymentsheet/LinkHandler;",
            ")V"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move-object/from16 v0, p2

    move-object/from16 v14, p9

    move-object/from16 v15, p10

    const-string v1, "args"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "prefsRepositoryFactory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "eventReporter"

    move-object/from16 v3, p3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "customerRepository"

    move-object/from16 v4, p4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workContext"

    move-object/from16 v6, p5

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "application"

    move-object/from16 v2, p6

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "logger"

    move-object/from16 v7, p7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lpmRepository"

    move-object/from16 v11, p8

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "savedStateHandle"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "linkHandler"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getConfig()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v1

    const/4 v10, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v10

    :goto_0
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/paymentsheet/PrefsRepository;

    new-instance v9, Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;

    const/4 v1, 0x0

    invoke-direct {v9, v1}, Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;-><init>(Z)V

    move-object/from16 v0, p0

    move v15, v1

    move-object/from16 v1, p6

    move-object v2, v5

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object v5, v8

    move-object/from16 v6, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v16, v9

    move-object/from16 v9, p9

    move-object v14, v10

    move-object/from16 v10, p10

    move-object/from16 v11, v16

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V

    iput-object v13, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->args:Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;

    new-instance v0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    invoke-virtual/range {p0 .. p0}, Lie;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApplication()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getConfig$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v2

    instance-of v2, v2, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getCurrentScreen()LtP5;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getButtonsEnabled()LEu1;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getAmount$paymentsheet_release()LtP5;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getCustomPrimaryButtonUiState()LGX2;

    move-result-object v25

    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$primaryButtonUiStateMapper$1;

    invoke-direct {v3, v12}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$primaryButtonUiStateMapper$1;-><init>(Ljava/lang/Object;)V

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move/from16 v20, v2

    move-object/from16 v26, v3

    invoke-direct/range {v17 .. v26}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;-><init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->primaryButtonUiStateMapper:Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;

    const/4 v1, 0x1

    const/4 v2, 0x6

    invoke-static {v1, v15, v14, v2, v14}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object v1

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_paymentOptionResult:LBX2;

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->paymentOptionResult:LTy5;

    invoke-static {v14}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_error:LGX2;

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->error:LtP5;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v1

    iput-object v1, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->forCustomFlow()LEu1;

    move-result-object v0

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    sget-object v2, Ljz5;->a:Ljz5$a;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object v2

    invoke-static {v0, v1, v2, v14}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v0

    iput-object v0, v12, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->primaryButtonUiState:LtP5;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->isGooglePayReady()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/stripe/android/paymentsheet/state/GooglePayState$Available;->INSTANCE:Lcom/stripe/android/paymentsheet/state/GooglePayState$Available;

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/stripe/android/paymentsheet/state/GooglePayState$NotAvailable;->INSTANCE:Lcom/stripe/android/paymentsheet/state/GooglePayState$NotAvailable;

    :goto_1
    const-string v1, "google_pay_state"

    move-object/from16 v2, p9

    move-object v3, v14

    invoke-virtual {v2, v1, v0}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getLinkState()Lcom/stripe/android/paymentsheet/state/LinkState;

    move-result-object v0

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$1;

    move-object/from16 v7, p10

    invoke-direct {v6, v7, v12, v3}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object/from16 p2, v1

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move/from16 p6, v8

    move-object/from16 p7, v9

    invoke-static/range {p2 .. p7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual/range {p10 .. p10}, Lcom/stripe/android/paymentsheet/LinkHandler;->getLinkInlineSelection()LGX2;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v4

    instance-of v5, v4, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v5, :cond_2

    move-object v10, v4

    check-cast v10, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    goto :goto_2

    :cond_2
    move-object v10, v3

    :goto_2
    invoke-interface {v1, v10}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v7, v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->prepareLink(Lcom/stripe/android/paymentsheet/state/LinkState;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setStripeIntent(Lcom/stripe/android/model/StripeIntent;)V

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getCustomerPaymentMethods()Ljava/util/List;

    move-result-object v0

    const-string v1, "customer_payment_methods"

    invoke-virtual {v2, v1, v0}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getSavedSelection()Lcom/stripe/android/paymentsheet/model/SavedSelection;

    move-result-object v0

    const-string v1, "saved_selection"

    invoke-virtual {v2, v1, v0}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "processing"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, v0, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p8 .. p8}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->getServerSpecLoadingState()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;->getServerLpmSpecs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setLpmServerSpec$paymentsheet_release(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->transitionToFirstScreen()V

    return-void
.end method

.method public static final synthetic access$handleLinkProcessingState(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->handleLinkProcessingState(Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;)V

    return-void
.end method

.method private final handleLinkProcessingState(Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;)V
    .locals 3

    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    if-eqz v2, :cond_1

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-interface {p1, v0, v1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentSuccess(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrefsRepository()Lcom/stripe/android/paymentsheet/PrefsRepository;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/PrefsRepository;->savePaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    sget-object p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;->INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setContentVisible(Z)V

    check-cast p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;->getResult()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onError(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setContentVisible(Z)V

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;->getDetails()Lcom/stripe/android/link/LinkPaymentDetails$New;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;-><init>(Lcom/stripe/android/link/LinkPaymentDetails$New;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onUserSelection()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_6
    if-nez v1, :cond_9

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onUserSelection()V

    goto :goto_0

    :cond_7
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    goto :goto_0

    :cond_8
    sget-object v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;->INSTANCE:Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    :cond_9
    :goto_0
    return-void
.end method

.method private final processExistingPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrefsRepository()Lcom/stripe/android/paymentsheet/PrefsRepository;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/PrefsRepository;->savePaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_paymentOptionResult:LBX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentMethods$paymentsheet_release()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)V

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method private final processNewPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPrefsRepository()Lcom/stripe/android/paymentsheet/PrefsRepository;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/PrefsRepository;->savePaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_paymentOptionResult:LBX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentMethods$paymentsheet_release()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)V

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public clearErrorMessages()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_error:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getError$paymentsheet_release()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->error:LtP5;

    return-object v0
.end method

.method public getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-object v0
.end method

.method public final getPaymentOptionResult$paymentsheet_release()LTy5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LTy5<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->paymentOptionResult:LTy5;

    return-object v0
.end method

.method public getPrimaryButtonUiState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->primaryButtonUiState:LtP5;

    return-object v0
.end method

.method public getShouldCompleteLinkFlowInline()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->shouldCompleteLinkFlowInline:Z

    return v0
.end method

.method public handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEditing$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->getRequiresConfirmation()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onUserSelection()V

    :cond_1
    return-void
.end method

.method public onError(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Lie;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onError(Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_error:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onFatal(Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->setMostRecentError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_paymentOptionResult:LBX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentMethods$paymentsheet_release()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-direct {v1, p1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;-><init>(Ljava/lang/Throwable;Ljava/util/List;)V

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public onFinish()V
    .locals 0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->onUserSelection()V

    return-void
.end method

.method public onPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 2

    const-string v0, "paymentResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSavedStateHandle()Landroidx/lifecycle/p;

    move-result-object p1

    const-string v0, "processing"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onUserCancel()V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->_paymentOptionResult:LBX2;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getMostRecentError()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v3

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentMethods$paymentsheet_release()LtP5;

    move-result-object v4

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)V

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onUserSelection()V
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->clearErrorMessages()V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getEventReporter$paymentsheet_release()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getStripeIntent$paymentsheet_release()LtP5;

    move-result-object v2

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/stripe/android/paymentsheet/model/IntentKt;->getCurrency(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1, v0, v2}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onSelectPaymentOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;)V

    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    :goto_1
    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    instance-of v2, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    :goto_2
    if-eqz v2, :cond_3

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->processExistingPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    goto :goto_3

    :cond_3
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v1, :cond_4

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->processNewPaymentMethod(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V

    :cond_4
    :goto_3
    return-void
.end method

.method public setNewPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->newPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    return-void
.end method

.method public transitionToFirstScreen()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->args:Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;->getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;->getHasPaymentOptions()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;

    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;->getNewPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getBackStack()LGX2;

    move-result-object v1

    invoke-interface {v1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->reportNavigationEvent(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V

    return-void
.end method
