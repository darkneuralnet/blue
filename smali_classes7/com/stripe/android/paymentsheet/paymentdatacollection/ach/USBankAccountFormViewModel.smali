.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0000\u0018\u0000 c2\u00020\u0001:\u0003dceB7\u0008\u0001\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,\u0012\u0006\u00101\u001a\u000200\u00a2\u0006\u0004\u0008a\u0010bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J4\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0008\u0010\u000f\u001a\u00020\u0006H\u0002J\u0008\u0010\u0010\u001a\u00020\u0006H\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0019\u0010\u001c\u001a\u00020\u00042\n\u0008\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u001a\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0017\u00104\u001a\u0002038\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u001d\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u0006088\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u0017\u0010=\u001a\u0002038\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u00105\u001a\u0004\u0008>\u00107R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006088\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010:\u001a\u0004\u0008@\u0010<R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00170A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0017\u0010E\u001a\u00020D8\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010HR\u001d\u0010I\u001a\u0008\u0012\u0004\u0012\u00020 088\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010:\u001a\u0004\u0008J\u0010<R\u001d\u0010K\u001a\u0008\u0012\u0004\u0012\u00020 088\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010:\u001a\u0004\u0008L\u0010<R\u001a\u0010M\u001a\u0008\u0012\u0004\u0012\u00020 0A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010CR*\u0010O\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008O\u0010P\u0012\u0004\u0008U\u0010V\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR$\u0010\\\u001a\u00020 2\u0006\u0010W\u001a\u00020 8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008X\u0010Y\"\u0004\u0008Z\u0010[R\u0017\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u0017088F\u00a2\u0006\u0006\u001a\u0004\u0008]\u0010<R\u0017\u0010`\u001a\u0008\u0012\u0004\u0012\u00020 088F\u00a2\u0006\u0006\u001a\u0004\u0008_\u0010<\u00a8\u0006f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;",
        "LOr6;",
        "Lcom/stripe/android/paymentsheet/model/ClientSecret;",
        "clientSecret",
        "",
        "collectBankAccount",
        "",
        "intentId",
        "linkAccountId",
        "bankName",
        "last4",
        "attachFinancialAccountToIntent",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "paymentSelection",
        "confirm",
        "buildPrimaryButtonText",
        "buildMandateText",
        "Landroidx/fragment/app/Fragment;",
        "fragment",
        "registerFragment",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
        "result",
        "handleCollectBankAccountResult",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
        "screenState",
        "handlePrimaryButtonClick",
        "",
        "error",
        "reset",
        "(Ljava/lang/Integer;)V",
        "onDestroy",
        "formattedMerchantName",
        "",
        "enabled",
        "setProcessing",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;",
        "Landroid/app/Application;",
        "application",
        "Landroid/app/Application;",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "LY94;",
        "Lcom/stripe/android/PaymentConfiguration;",
        "lazyPaymentConfig",
        "LY94;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "nameController",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "getNameController",
        "()Lcom/stripe/android/uicore/elements/TextFieldController;",
        "LtP5;",
        "name",
        "LtP5;",
        "getName",
        "()LtP5;",
        "emailController",
        "getEmailController",
        "email",
        "getEmail",
        "LGX2;",
        "_currentScreenState",
        "LGX2;",
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "saveForFutureUseElement",
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "getSaveForFutureUseElement",
        "()Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "saveForFutureUse",
        "getSaveForFutureUse",
        "requiredFields",
        "getRequiredFields",
        "_processing",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "collectBankAccountLauncher",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "getCollectBankAccountLauncher",
        "()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;",
        "setCollectBankAccountLauncher",
        "(Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;)V",
        "getCollectBankAccountLauncher$annotations",
        "()V",
        "value",
        "getHasLaunched",
        "()Z",
        "setHasLaunched",
        "(Z)V",
        "hasLaunched",
        "getCurrentScreenState",
        "currentScreenState",
        "getProcessing",
        "processing",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Landroid/app/Application;Lcom/stripe/android/networking/StripeRepository;LY94;Landroidx/lifecycle/p;)V",
        "Companion",
        "Args",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUSBankAccountFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,508:1\n47#2:509\n49#2:513\n47#2:514\n49#2:518\n47#2:519\n49#2:523\n47#2:524\n49#2:528\n50#3:510\n55#3:512\n50#3:515\n55#3:517\n50#3:520\n55#3:522\n50#3:525\n55#3:527\n106#4:511\n106#4:516\n106#4:521\n106#4:526\n230#5,5:529\n230#5,5:534\n230#5,5:539\n230#5,5:544\n230#5,5:549\n230#5,5:560\n141#6:554\n130#6,5:555\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel\n*L\n69#1:509\n69#1:513\n76#1:514\n76#1:518\n101#1:519\n101#1:523\n104#1:524\n104#1:528\n69#1:510\n69#1:512\n76#1:515\n76#1:517\n101#1:520\n101#1:522\n104#1:525\n104#1:527\n69#1:511\n76#1:516\n101#1:521\n104#1:526\n124#1:529,5\n162#1:534,5\n179#1:539,5\n259#1:544,5\n273#1:549,5\n289#1:560,5\n285#1:554\n285#1:555,5\n*E\n"
    }
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;

.field private static final HAS_LAUNCHED_KEY:Ljava/lang/String; = "has_launched"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final _currentScreenState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
            ">;"
        }
    .end annotation
.end field

.field private final _processing:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final application:Landroid/app/Application;

.field private final args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

.field private collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

.field private final email:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field private final lazyPaymentConfig:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private final name:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field private final requiredFields:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final saveForFutureUse:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final stripeRepository:Lcom/stripe/android/networking/StripeRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;Landroid/app/Application;Lcom/stripe/android/networking/StripeRepository;LY94;Landroidx/lifecycle/p;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "LY94<",
            "Lcom/stripe/android/PaymentConfiguration;",
            ">;",
            "Landroidx/lifecycle/p;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "args"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "application"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "stripeRepository"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "lazyPaymentConfig"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "savedStateHandle"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LOr6;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:LY94;

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    sget-object v3, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-virtual {v3, v4}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    invoke-interface {v3}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v4

    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$1;

    invoke-direct {v6, v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v4

    sget-object v7, Ljz5;->a:Ljz5$a;

    invoke-virtual {v7}, Ljz5$a;->c()Ljz5;

    move-result-object v8

    const-string v9, ""

    invoke-static {v6, v4, v8, v9}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    sget-object v6, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v5

    :goto_1
    invoke-virtual {v6, v8}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v6

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    invoke-interface {v6}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v8

    new-instance v9, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$2;

    invoke-direct {v9, v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$2;-><init>(LEu1;)V

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v8

    invoke-virtual {v7}, Ljz5$a;->c()Ljz5;

    move-result-object v10

    invoke-static {v9, v8, v10, v5}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v8

    iput-object v8, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    new-instance v16, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;

    const/4 v10, 0x0

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    invoke-interface {v8}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Ljava/lang/String;

    sget v4, Lcom/stripe/android/paymentsheet/R$string;->stripe_continue_button_label:I

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    const-string v2, "application.getString(\n \u2026n_label\n                )"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object/from16 v9, v16

    invoke-direct/range {v9 .. v15}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v16 .. v16}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    new-instance v4, Lcom/stripe/android/ui/core/elements/SaveForFutureUseSpec;

    const/4 v8, 0x1

    invoke-direct {v4, v5, v8, v5}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShowCheckbox()Z

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getMerchantName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v8, v9}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseSpec;->transform(ZLjava/lang/String;)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object v4

    const-string v8, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.SaveForFutureUseElement"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->getSaveForFutureUse()LEu1;

    move-result-object v4

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v8

    invoke-virtual {v7}, Ljz5$a;->d()Ljz5;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShowCheckbox()Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v4, v8, v9, v10}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    invoke-interface {v3}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$3;

    invoke-direct {v4, v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$3;-><init>(LEu1;)V

    invoke-interface {v6}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v3

    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$4;

    invoke-direct {v6, v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$special$$inlined$map$4;-><init>(LEu1;)V

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$requiredFields$3;

    invoke-direct {v3, v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$requiredFields$3;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v4, v6, v3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v3

    invoke-static/range {p0 .. p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v4

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x3

    const/4 v13, 0x0

    invoke-static/range {v7 .. v13}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object v5

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4, v5, v6}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields:LtP5;

    invoke-static {v6}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_processing:LGX2;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    if-eqz v1, :cond_7

    :cond_2
    invoke-interface {v2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->name:Ljava/lang/String;

    if-nez v5, :cond_4

    :cond_3
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v5}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    :cond_4
    move-object v6, v5

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v5

    if-eqz v5, :cond_5

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->email:Ljava/lang/String;

    if-nez v5, :cond_6

    :cond_5
    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v5}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    :cond_6
    move-object v7, v5

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getFinancialConnectionsSessionId()Ljava/lang/String;

    move-result-object v8

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getIntentId()Ljava/lang/String;

    move-result-object v9

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getBankName()Ljava/lang/String;

    move-result-object v10

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getLast4()Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildPrimaryButtonText()Ljava/lang/String;

    move-result-object v12

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText()Ljava/lang/String;

    move-result-object v13

    iget-object v5, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShowCheckbox()Z

    move-result v14

    move-object v5, v4

    invoke-direct/range {v5 .. v14}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v2, v3, v4}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_7
    return-void
.end method

.method public static final synthetic access$confirm(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->confirm(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V

    return-void
.end method

.method public static final synthetic access$getApplication$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    return-object p0
.end method

.method public static final synthetic access$getLazyPaymentConfig$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:LY94;

    return-object p0
.end method

.method public static final synthetic access$getStripeRepository$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)Lcom/stripe/android/networking/StripeRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->stripeRepository:Lcom/stripe/android/networking/StripeRepository;

    return-object p0
.end method

.method public static final synthetic access$get_currentScreenState$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    return-object p0
.end method

.method private final attachFinancialAccountToIntent(Lcom/stripe/android/paymentsheet/model/ClientSecret;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;

    const/4 v7, 0x0

    move-object v0, v11

    move-object v1, p1

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$attachFinancialAccountToIntent$1$1$1;-><init>(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_0
    return-void
.end method

.method private final buildMandateText()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_save_mandate:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->formattedMerchantName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{\n            applicatio\u2026)\n            )\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/ACHText;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/ACHText;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/ACHText;->getContinueMandateText(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final buildPrimaryButtonText()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->isCompleteFlow()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getAmount()Lcom/stripe/android/ui/core/Amount;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "application.resources"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/Amount;->buildPayButtonLabel(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_setup_button_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{\n                    ap\u2026      )\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_continue_button_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "application.getString(\n \u2026utton_label\n            )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method private final collectBankAccount(Lcom/stripe/android/paymentsheet/model/ClientSecret;)V
    .locals 6

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getHasLaunched()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/ClientSecret;->getValue()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v5}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, p1, v3}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithPaymentIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/SetupIntentClientSecret;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->lazyPaymentConfig:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/PaymentConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/ClientSecret;->getValue()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v5}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2, p1, v3}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->presentWithSetupIntent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final confirm(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$confirm$1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, p0, p2, v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$confirm$1;-><init>(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static synthetic getCollectBankAccountLauncher$annotations()V
    .locals 0

    return-void
.end method

.method private final getHasLaunched()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "has_launched"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static synthetic reset$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Ljava/lang/Integer;)V

    return-void
.end method

.method private final setHasLaunched(Z)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "has_launched"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final formattedMerchantName()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getMerchantName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_3

    :goto_0
    add-int/lit8 v2, v1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v4, :cond_0

    move v3, v5

    goto :goto_1

    :cond_0
    move v3, v6

    :goto_1
    if-nez v3, :cond_1

    add-int/2addr v1, v5

    invoke-interface {v0, v6, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_3

    :cond_1
    if-gez v2, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    :goto_2
    const-string v0, ""

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCollectBankAccountLauncher()Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-object v0
.end method

.method public final getCurrentScreenState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    return-object v0
.end method

.method public final getEmail()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    return-object v0
.end method

.method public final getEmailController()Lcom/stripe/android/uicore/elements/TextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    return-object v0
.end method

.method public final getName()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    return-object v0
.end method

.method public final getNameController()Lcom/stripe/android/uicore/elements/TextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    return-object v0
.end method

.method public final getProcessing()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_processing:LGX2;

    return-object v0
.end method

.method public final getRequiredFields()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->requiredFields:LtP5;

    return-object v0
.end method

.method public final getSaveForFutureUse()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    return-object v0
.end method

.method public final getSaveForFutureUseElement()Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    return-object v0
.end method

.method public final handleCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V
    .locals 14

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/financialconnections/model/BankAccount;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v11, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    :cond_0
    invoke-interface {v11}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v12

    move-object v2, v12

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    new-instance v13, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/model/BankAccount;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildPrimaryButtonText()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText()Ljava/lang/String;

    move-result-object v9

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    move-object v2, v13

    move-object v7, v1

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/BankAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v11, v12, v13}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_0

    :cond_1
    instance-of v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-interface {v1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v11, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    :cond_2
    invoke-interface {v11}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v12

    move-object v2, v12

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    new-instance v13, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {p1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildPrimaryButtonText()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->buildMandateText()Ljava/lang/String;

    move-result-object v9

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    move-object v2, v13

    move-object v7, v1

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v11, v12, v13}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_3
    if-nez v0, :cond_6

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_something_went_wrong:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    if-eqz v0, :cond_5

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_ach_something_went_wrong:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_5
    instance-of p1, p1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Cancelled;

    if-eqz p1, :cond_6

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->reset$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Ljava/lang/Integer;ILjava/lang/Object;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final handlePrimaryButtonClick(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V
    .locals 7

    const-string v0, "screenState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->updateInputs(Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    move-result-object v1

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccount(Lcom/stripe/android/paymentsheet/model/ClientSecret;)V

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;

    move-result-object v2

    if-eqz v2, :cond_3

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getIntentId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getFinancialConnectionsSessionId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getInstitutionName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getLast4()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->attachFinancialAccountToIntent(Lcom/stripe/android/paymentsheet/model/ClientSecret;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;

    move-result-object v2

    if-eqz v2, :cond_3

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getIntentId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getFinancialConnectionsSessionId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/BankAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/BankAccount;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->attachFinancialAccountToIntent(Lcom/stripe/android/paymentsheet/model/ClientSecret;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$Args;->getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;

    move-result-object v2

    if-eqz v2, :cond_3

    check-cast p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getFinancialConnectionsSessionId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getIntentId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getBankName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getLast4()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->attachFinancialAccountToIntent(Lcom/stripe/android/paymentsheet/model/ClientSecret;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onDestroy()V
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUse:LtP5;

    invoke-interface {v5}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->updateInputs(Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-void
.end method

.method public final registerFragment(Landroidx/fragment/app/Fragment;)V
    .locals 2

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;->Companion:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$registerFragment$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$registerFragment$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher$Companion;->create(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-void
.end method

.method public final reset(Ljava/lang/Integer;)V
    .locals 7

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->setHasLaunched(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->saveForFutureUseElement:Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->onValueChange(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_currentScreenState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->name:LtP5;

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->email:LtP5;

    invoke-interface {v4}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->application:Landroid/app/Application;

    sget v6, Lcom/stripe/android/paymentsheet/R$string;->stripe_continue_button_label:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "application.getString(\n \u2026n_label\n                )"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v3, v4, v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final setCollectBankAccountLauncher(Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->collectBankAccountLauncher:Lcom/stripe/android/payments/bankaccount/CollectBankAccountLauncher;

    return-void
.end method

.method public final setProcessing(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->_processing:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method
