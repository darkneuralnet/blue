.class public final Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$WhenMappings;,
        Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001:\u0001{BO\u0008\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010C\u001a\u00020B\u0012\u000c\u0010G\u001a\u0008\u0012\u0004\u0012\u00020F0E\u0012\u0006\u0010J\u001a\u00020I\u00a2\u0006\u0004\u0008y\u0010zJ \u0010\u0007\u001a\u00020\u00062\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0008\u0010\u000b\u001a\u00020\u0006H\u0002J\u001b\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0008\u0010\u0018\u001a\u00020\u0006H\u0002J\u0008\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"J\u000e\u0010\'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%J\u001a\u0010*\u001a\u00020\u00062\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u0002J\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,R\u0017\u00100\u001a\u00020/8\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u0017\u00105\u001a\u0002048\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u001a\u0010G\u001a\u0008\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u001a\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u001f0O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u001d\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u001f0R8\u0006\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010VR\u001d\u0010X\u001a\u0008\u0012\u0004\u0012\u00020\"0W8\u0006\u00a2\u0006\u000c\n\u0004\u0008X\u0010Y\u001a\u0004\u0008X\u0010ZR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010QR\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0R8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010T\u001a\u0004\u0008\\\u0010VR\u0014\u0010]\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0017\u0010`\u001a\u00020_8\u0006\u00a2\u0006\u000c\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010cR\u001d\u0010e\u001a\u0008\u0012\u0004\u0012\u00020%0d8\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010hR\u001a\u0010i\u001a\u0008\u0012\u0004\u0012\u00020%0O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010QR\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0R8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010T\u001a\u0004\u0008j\u0010VR\u001f\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010k0O8\u0006\u00a2\u0006\u000c\n\u0004\u0008l\u0010Q\u001a\u0004\u0008m\u0010nR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020k0o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u001c\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010QR\u001f\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040R8\u0006\u00a2\u0006\u000c\n\u0004\u0008s\u0010T\u001a\u0004\u0008t\u0010VR\u0017\u0010u\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008u\u0010v\u001a\u0004\u0008w\u0010x\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006|"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;",
        "LOr6;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "initialValues",
        "",
        "updateFormController",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;",
        "selectedAccount",
        "navigateToWallet",
        "payAnotherWay",
        "Lcom/stripe/android/link/LinkPaymentDetails;",
        "linkPaymentDetails",
        "completePayment",
        "(Lcom/stripe/android/link/LinkPaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/model/ConfirmStripeIntentParams;",
        "confirmParams",
        "confirmStripeIntent",
        "clientSecret",
        "handleNextAction",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "paymentResult",
        "handlePaymentResult",
        "handlePaymentSuccess",
        "clearError",
        "",
        "error",
        "onError",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "errorMessage",
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "state",
        "setState",
        "",
        "loadFromArgs",
        "init",
        "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
        "paymentMethod",
        "onPaymentMethodSelected",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formValues",
        "startPayment",
        "onSecondaryButtonClick",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;",
        "result",
        "onFinancialConnectionsAccountLinked",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "args",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "getArgs",
        "()Lcom/stripe/android/link/LinkActivityContract$Args;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "getLinkAccount",
        "()Lcom/stripe/android/link/model/LinkAccount;",
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
        "LY94;",
        "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
        "formControllerProvider",
        "LY94;",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "intentConfirmationInterceptor",
        "Lcom/stripe/android/IntentConfirmationInterceptor;",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "LGX2;",
        "_primaryButtonState",
        "LGX2;",
        "LtP5;",
        "primaryButtonState",
        "LtP5;",
        "getPrimaryButtonState",
        "()LtP5;",
        "LEu1;",
        "isEnabled",
        "LEu1;",
        "()LEu1;",
        "_errorMessage",
        "getErrorMessage",
        "isRootScreen",
        "Z",
        "",
        "secondaryButtonLabel",
        "I",
        "getSecondaryButtonLabel",
        "()I",
        "",
        "supportedTypes",
        "Ljava/util/List;",
        "getSupportedTypes",
        "()Ljava/util/List;",
        "_paymentMethod",
        "getPaymentMethod",
        "Lcom/stripe/android/ui/core/FormController;",
        "formController",
        "getFormController",
        "()LGX2;",
        "",
        "formControllersCache",
        "Ljava/util/Map;",
        "_financialConnectionsSessionClientSecret",
        "financialConnectionsSessionClientSecret",
        "getFinancialConnectionsSessionClientSecret",
        "publishableKey",
        "Ljava/lang/String;",
        "getPublishableKey",
        "()Ljava/lang/String;",
        "<init>",
        "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;LY94;Lcom/stripe/android/IntentConfirmationInterceptor;)V",
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
        "SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n47#2:313\n49#2:317\n50#3:314\n55#3:316\n106#4:315\n3792#5:318\n4307#5,2:319\n1#6:321\n*S KotlinDebug\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel\n*L\n66#1:313\n66#1:317\n66#1:314\n66#1:316\n66#1:315\n81#1:318\n81#1:319,2\n*E\n"
    }
.end annotation


# instance fields
.field private final _errorMessage:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final _financialConnectionsSessionClientSecret:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _paymentMethod:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final _primaryButtonState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/link/LinkActivityContract$Args;

.field private final confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

.field private final errorMessage:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final financialConnectionsSessionClientSecret:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final formController:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/ui/core/FormController;",
            ">;"
        }
    .end annotation
.end field

.field private final formControllerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final formControllersCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            "Lcom/stripe/android/ui/core/FormController;",
            ">;"
        }
    .end annotation
.end field

.field private final intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

.field private final isEnabled:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isRootScreen:Z

.field private final linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigator:Lcom/stripe/android/link/model/Navigator;

.field private final paymentMethod:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final primaryButtonState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKey:Ljava/lang/String;

.field private final secondaryButtonLabel:I

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private final supportedTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;LY94;Lcom/stripe/android/IntentConfirmationInterceptor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/link/model/Navigator;",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
            "Lcom/stripe/android/core/Logger;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ")V"
        }
    .end annotation

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formControllerProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentConfirmationInterceptor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    iput-object p6, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p7, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formControllerProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    sget-object p3, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-static {p3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_primaryButtonState:LGX2;

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->primaryButtonState:LtP5;

    new-instance p5, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$special$$inlined$map$1;

    invoke-direct {p5, p3}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->isEnabled:LEu1;

    const/4 p3, 0x0

    invoke-static {p3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p5

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_errorMessage:LGX2;

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->errorMessage:LtP5;

    invoke-virtual {p4}, Lcom/stripe/android/link/model/Navigator;->isOnRootScreen()Ljava/lang/Boolean;

    move-result-object p4

    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->isRootScreen:Z

    if-eqz p4, :cond_0

    sget p4, Lcom/stripe/android/link/R$string;->wallet_pay_another_way:I

    goto :goto_0

    :cond_0
    sget p4, Lcom/stripe/android/link/R$string;->cancel:I

    :goto_0
    iput p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->secondaryButtonLabel:I

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/stripe/android/link/model/SupportedPaymentMethodTypesKt;->supportedPaymentMethodTypes(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/model/LinkAccount;)Ljava/util/Set;

    move-result-object p1

    invoke-static {}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->values()[Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    move-result-object p2

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    array-length p5, p2

    const/4 p6, 0x0

    :goto_1
    if-ge p6, p5, :cond_2

    aget-object p7, p2, p6

    invoke-virtual {p7}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->getType()Ljava/lang/String;

    move-result-object p8

    invoke-interface {p1, p8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p8

    if-eqz p8, :cond_1

    invoke-interface {p4, p7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p6, p6, 0x1

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->supportedTypes:Ljava/util/List;

    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_paymentMethod:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    invoke-static {p3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formController:LGX2;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formControllersCache:Ljava/util/Map;

    invoke-static {p3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_financialConnectionsSessionClientSecret:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->financialConnectionsSessionClientSecret:LtP5;

    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {p1}, Lcom/stripe/android/link/account/LinkAccountManager;->getConsumerPublishableKey()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->publishableKey:Ljava/lang/String;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic access$completePayment(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/link/LinkPaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->completePayment(Lcom/stripe/android/link/LinkPaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)Lcom/stripe/android/link/model/Navigator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    return-object p0
.end method

.method public static final synthetic access$get_financialConnectionsSessionClientSecret$p(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_financialConnectionsSessionClientSecret:LGX2;

    return-object p0
.end method

.method public static final synthetic access$handlePaymentResult(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->handlePaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V

    return-void
.end method

.method public static final synthetic access$navigateToWallet(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigateToWallet(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)V

    return-void
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final clearError()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_errorMessage:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final completePayment(Lcom/stripe/android/link/LinkPaymentDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentDetails;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;

    iget v1, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p2, v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->intentConfirmationInterceptor:Lcom/stripe/android/IntentConfirmationInterceptor;

    iget-object p2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {p2}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentDetails;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getShippingValues$link_release()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/stripe/android/ui/core/address/AddressUtilKt;->toConfirmPaymentIntentShipping(Ljava/util/Map;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    move-object v4, p1

    const/4 v5, 0x0

    iput-object p0, v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->L$0:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$completePayment$1;->label:I

    move-object v2, p2

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/IntentConfirmationInterceptor;->intercept(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    return-object v0

    :cond_4
    move-object p1, p0

    :goto_2
    check-cast p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep;

    instance-of v0, p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    if-eqz v0, :cond_5

    check-cast p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;

    invoke-virtual {p2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Confirm;->getConfirmParams()Lcom/stripe/android/model/ConfirmStripeIntentParams;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V

    goto :goto_3

    :cond_5
    instance-of v0, p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    if-eqz v0, :cond_6

    check-cast p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;

    invoke-virtual {p2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$HandleNextAction;->getClientSecret()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->handleNextAction(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    instance-of v0, p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    if-eqz v0, :cond_7

    new-instance v0, Lcom/stripe/android/link/ui/ErrorMessage$Raw;

    check-cast p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;

    invoke-virtual {p2}, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Fail;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/stripe/android/link/ui/ErrorMessage$Raw;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->onError(Lcom/stripe/android/link/ui/ErrorMessage;)V

    goto :goto_3

    :cond_7
    instance-of p2, p2, Lcom/stripe/android/IntentConfirmationInterceptor$NextStep$Complete;

    if-eqz p2, :cond_8

    invoke-direct {p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->handlePaymentSuccess()V

    :cond_8
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    new-instance v1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$confirmStripeIntent$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$confirmStripeIntent$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)V

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->confirmStripeIntent(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final handleNextAction(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    new-instance v2, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$handleNextAction$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$handleNextAction$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->handleNextAction(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final handlePaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 1

    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->setState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->handlePaymentSuccess()V

    :cond_2
    :goto_0
    return-void
.end method

.method private final handlePaymentSuccess()V
    .locals 7

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Completed:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->setState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$handlePaymentSuccess$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$handlePaymentSuccess$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method private final navigateToWallet(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/Navigator;->isOnRootScreen()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    new-instance v1, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;-><init>(Ljava/lang/String;)V

    const-string p1, "PaymentDetailsResult"

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/link/model/Navigator;->setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;

    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/link/model/Navigator;->onBack(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v0, Lcom/stripe/android/link/LinkScreen$Wallet;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Wallet;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;

    :goto_0
    return-void
.end method

.method private final onError(Lcom/stripe/android/link/ui/ErrorMessage;)V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->setState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_errorMessage:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v1, "Error: "

    invoke-interface {v0, v1, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->onError(Lcom/stripe/android/link/ui/ErrorMessage;)V

    return-void
.end method

.method private final payAnotherWay()V
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->clearError()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->PayAnotherWay:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->cancel(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V

    return-void
.end method

.method private final setState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_primaryButtonState:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/model/Navigator;->setUserNavigationEnabled(Z)V

    return-void
.end method

.method private final updateFormController(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formController:LGX2;

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formControllersCache:Ljava/util/Map;

    iget-object v2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/ui/core/FormController;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formControllerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    new-instance v2, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    iget-object v3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    invoke-interface {v3}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->getFormSpec()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v2}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->formSpec(Lcom/stripe/android/ui/core/elements/LayoutSpec;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->viewOnlyFields(Ljava/util/Set;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v1

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->viewModelScope(LZC0;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->initialValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->stripeIntent(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getMerchantName$link_release()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->merchantName(Ljava/lang/String;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getShippingValues$link_release()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->shippingValues(Ljava/util/Map;)Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;->build()Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent;->getFormController()Lcom/stripe/android/ui/core/FormController;

    move-result-object v1

    iget-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formControllersCache:Ljava/util/Map;

    iget-object v2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic updateFormController$default(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->updateFormController(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final getArgs()Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object v0
.end method

.method public final getErrorMessage()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->errorMessage:LtP5;

    return-object v0
.end method

.method public final getFinancialConnectionsSessionClientSecret()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->financialConnectionsSessionClientSecret:LtP5;

    return-object v0
.end method

.method public final getFormController()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lcom/stripe/android/ui/core/FormController;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->formController:LGX2;

    return-object v0
.end method

.method public final getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    return-object v0
.end method

.method public final getPaymentMethod()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    return-object v0
.end method

.method public final getPrimaryButtonState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/PrimaryButtonState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->primaryButtonState:LtP5;

    return-object v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecondaryButtonLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->secondaryButtonLabel:I

    return v0
.end method

.method public final getSupportedTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->supportedTypes:Ljava/util/List;

    return-object v0
.end method

.method public final init(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityContract$Args;->getPrefilledCardParams$link_release()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/stripe/android/ui/core/forms/ConvertToFormValuesMapKt;->convertToFormValuesMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_1
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->updateFormController(Ljava/util/Map;)V

    return-void
.end method

.method public final isEnabled()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->isEnabled:LEu1;

    return-object v0
.end method

.method public final onFinancialConnectionsAccountLinked(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Canceled;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->setState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult$Completed;

    if-eqz v0, :cond_2

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$onFinancialConnectionsAccountLinked$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLinkResult;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :cond_2
    :goto_0
    return-void
.end method

.method public final onPaymentMethodSelected(Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->_paymentMethod:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->updateFormController$default(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final onSecondaryButtonClick()V
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->isRootScreen:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->payAnotherWay()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->onBack(Z)V

    :goto_0
    return-void
.end method

.method public final startPayment(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "formValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->clearError()V

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->setState(Lcom/stripe/android/link/ui/PrimaryButtonState;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    sget-object v1, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$2;

    invoke-direct {v6, p0, v2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$2;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    iget-object v1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;->paymentMethod:LtP5;

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->getType()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v3}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodCreateParams(Ljava/util/Map;Ljava/lang/String;Z)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;

    invoke-direct {v6, p0, p1, v2}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$startPayment$1;-><init>(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    :goto_0
    return-void
.end method
