.class public final Lcom/stripe/android/link/ui/verification/VerificationViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001:\u0001@B)\u0008\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008>\u0010?J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\n\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\"\u0010\u000c\u001a\u00020\u000b8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010\u000eR\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u001d\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00080,8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R(\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u0002018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R\u0017\u00109\u001a\u0002088\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010.\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/verification/VerificationViewModel;",
        "LOr6;",
        "",
        "clearError",
        "",
        "error",
        "onError",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
        "block",
        "updateViewState",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "init$link_release",
        "(Lcom/stripe/android/link/model/LinkAccount;)V",
        "init",
        "",
        "code",
        "onVerificationCodeEntered",
        "startVerification",
        "resendCode",
        "didShowCodeSentNotification",
        "onBack",
        "onChangeEmailClicked",
        "onFocusRequested",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "Lcom/stripe/android/link/model/Navigator;",
        "navigator",
        "Lcom/stripe/android/link/model/Navigator;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "getLinkAccount",
        "()Lcom/stripe/android/link/model/LinkAccount;",
        "setLinkAccount",
        "LGX2;",
        "_viewState",
        "LGX2;",
        "LtP5;",
        "viewState",
        "LtP5;",
        "getViewState",
        "()LtP5;",
        "Lkotlin/Function0;",
        "onVerificationCompleted",
        "Lkotlin/jvm/functions/Function0;",
        "getOnVerificationCompleted",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnVerificationCompleted",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "otpElement",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "getOtpElement",
        "()Lcom/stripe/android/uicore/elements/OTPElement;",
        "otpCode",
        "<init>",
        "(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V",
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
        "SMAP\nVerificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationViewModel.kt\ncom/stripe/android/link/ui/verification/VerificationViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,200:1\n47#2:201\n49#2:205\n50#3:202\n55#3:204\n106#4:203\n230#5,5:206\n*S KotlinDebug\n*F\n+ 1 VerificationViewModel.kt\ncom/stripe/android/link/ui/verification/VerificationViewModel\n*L\n62#1:201\n62#1:205\n62#1:202\n62#1:204\n62#1:203\n180#1:206,5\n*E\n"
    }
.end annotation


# instance fields
.field private final _viewState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;"
        }
    .end annotation
.end field

.field public linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigator:Lcom/stripe/android/link/model/Navigator;

.field private onVerificationCompleted:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final otpCode:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field private final viewState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V
    .locals 9

    const-string v0, "linkAccountManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iput-object p3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->logger:Lcom/stripe/android/core/Logger;

    new-instance p1, Lcom/stripe/android/link/ui/verification/VerificationViewState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1f

    const/4 v8, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/link/ui/verification/VerificationViewState;-><init>(ZZLcom/stripe/android/link/ui/ErrorMessage;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->_viewState:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->viewState:LtP5;

    new-instance p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCompleted$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCompleted$1;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->onVerificationCompleted:Lkotlin/jvm/functions/Function0;

    sget-object p1, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lcom/stripe/android/uicore/elements/OTPElement;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getFormFieldValueFlow()LEu1;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/link/ui/verification/VerificationViewModel$special$$inlined$map$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p1

    sget-object p3, Ljz5;->a:Ljz5$a;

    invoke-virtual {p3}, Ljz5$a;->d()Ljz5;

    move-result-object p3

    const/4 p4, 0x0

    invoke-static {p2, p1, p3, p4}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->otpCode:LtP5;

    return-void
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getLinkEventsReporter$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)Lcom/stripe/android/link/model/Navigator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    return-object p0
.end method

.method public static final synthetic access$getOtpCode$p(Lcom/stripe/android/link/ui/verification/VerificationViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->otpCode:LtP5;

    return-object p0
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$updateViewState(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final clearError()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$clearError$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$clearError$1;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Error: "

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onError$1$1;

    invoke-direct {p1, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onError$1$1;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final updateViewState(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->_viewState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method


# virtual methods
.method public final didShowCodeSentNotification()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$didShowCodeSentNotification$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$didShowCodeSentNotification$1;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "linkAccount"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getOnVerificationCompleted()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->onVerificationCompleted:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getOtpElement()Lcom/stripe/android/uicore/elements/OTPElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    return-object v0
.end method

.method public final getViewState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/verification/VerificationViewState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->viewState:LtP5;

    return-object v0
.end method

.method public final init$link_release(Lcom/stripe/android/link/model/LinkAccount;)V
    .locals 6

    const-string v0, "linkAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->setLinkAccount(Lcom/stripe/android/link/model/LinkAccount;)V

    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getAccountStatus()Lcom/stripe/android/link/model/AccountStatus;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/link/model/AccountStatus;->VerificationStarted:Lcom/stripe/android/link/model/AccountStatus;

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->startVerification()V

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FAStart()V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/link/ui/verification/VerificationViewModel$init$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$init$1;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final onBack()V
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->clearError()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->onBack(Z)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v0}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->on2FACancel()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkAccountManager;->logout()Lzh2;

    return-void
.end method

.method public final onChangeEmailClicked()V
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->clearError()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v1, Lcom/stripe/android/link/LinkScreen$SignUp;->INSTANCE:Lcom/stripe/android/link/LinkScreen$SignUp;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;

    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkAccountManager;->logout()Lzh2;

    return-void
.end method

.method public final onFocusRequested()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onFocusRequested$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$onFocusRequested$1;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onVerificationCodeEntered(Ljava/lang/String;)V
    .locals 7

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$1;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$onVerificationCodeEntered$2;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final resendCode()V
    .locals 1

    sget-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$resendCode$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$resendCode$1;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->startVerification()V

    return-void
.end method

.method public final setLinkAccount(Lcom/stripe/android/link/model/LinkAccount;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    return-void
.end method

.method public final setOnVerificationCompleted(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->onVerificationCompleted:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final startVerification()V
    .locals 7

    sget-object v0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$startVerification$1;->INSTANCE:Lcom/stripe/android/link/ui/verification/VerificationViewModel$startVerification$1;

    invoke-direct {p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel;->updateViewState(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/verification/VerificationViewModel$startVerification$2;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$startVerification$2;-><init>(Lcom/stripe/android/link/ui/verification/VerificationViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
