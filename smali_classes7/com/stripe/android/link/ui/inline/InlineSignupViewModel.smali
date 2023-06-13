.class public final Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001:\u0001OB)\u0008\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008M\u0010NJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"R\u0017\u0010&\u001a\u00020%8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u0010+\u001a\u00020*8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u0017\u0010/\u001a\u00020%8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010\'\u001a\u0004\u00080\u0010)R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00103R\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001d\u0010:\u001a\u0008\u0012\u0004\u0012\u000207018\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u00103\u001a\u0004\u0008;\u0010<R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00109R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=018\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u00103\u001a\u0004\u0008@\u0010<R\u001f\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040A8\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER\u0016\u0010F\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010 R\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0011\u0010L\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010K\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;",
        "LOr6;",
        "",
        "watchUserInput",
        "",
        "email",
        "phoneNumber",
        "name",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "mapToUserInput",
        "lookupConsumerEmail",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "clearError",
        "",
        "error",
        "onError",
        "toggleExpanded",
        "logout",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "config",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "",
        "isLoggedOut",
        "Z",
        "prefilledEmail",
        "Ljava/lang/String;",
        "prefilledPhone",
        "prefilledName",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "emailController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getEmailController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "phoneController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "getPhoneController",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "nameController",
        "getNameController",
        "LtP5;",
        "consumerEmail",
        "LtP5;",
        "consumerPhoneNumber",
        "consumerName",
        "LGX2;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "_viewState",
        "LGX2;",
        "viewState",
        "getViewState",
        "()LtP5;",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "_errorMessage",
        "errorMessage",
        "getErrorMessage",
        "LEu1;",
        "accountEmail",
        "LEu1;",
        "getAccountEmail",
        "()LEu1;",
        "hasExpanded",
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;",
        "debouncer",
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;",
        "getRequiresNameCollection",
        "()Z",
        "requiresNameCollection",
        "<init>",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V",
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
        "SMAP\nInlineSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,245:1\n1#2:246\n47#3:247\n49#3:251\n47#3:252\n49#3:256\n47#3:257\n49#3:261\n47#3:262\n49#3:266\n50#4:248\n55#4:250\n50#4:253\n55#4:255\n50#4:258\n55#4:260\n50#4:263\n55#4:265\n106#5:249\n106#5:254\n106#5:259\n106#5:264\n230#6,5:267\n230#6,5:272\n230#6,5:277\n230#6,5:282\n*S KotlinDebug\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n*L\n59#1:247\n59#1:251\n66#1:252\n66#1:256\n73#1:257\n73#1:261\n91#1:262\n91#1:266\n59#1:248\n59#1:250\n66#1:253\n66#1:255\n73#1:258\n73#1:260\n91#1:263\n91#1:265\n59#1:249\n66#1:254\n73#1:259\n91#1:264\n107#1:267,5\n189#1:272,5\n197#1:277,5\n208#1:282,5\n*E\n"
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

.field private final _viewState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final accountEmail:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

.field private final consumerEmail:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final consumerName:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final consumerPhoneNumber:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private debouncer:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

.field private final emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final errorMessage:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation
.end field

.field private hasExpanded:Z

.field private final isLoggedOut:Z

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field private final prefilledEmail:Ljava/lang/String;

.field private final prefilledName:Ljava/lang/String;

.field private final prefilledPhone:Ljava/lang/String;

.field private final viewState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V
    .locals 7

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerEmail()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/stripe/android/link/account/LinkAccountManager;->hasUserLoggedOut(Ljava/lang/String;)Z

    move-result p3

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->isLoggedOut:Z

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerEmail()Ljava/lang/String;

    move-result-object p4

    const/4 v0, 0x0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p4, v0

    :goto_0
    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledEmail:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerPhone()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    iput-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledPhone:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-nez p3, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v0

    :goto_2
    iput-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledName:Ljava/lang/String;

    sget-object p3, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    invoke-virtual {p3, p4}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    sget-object v3, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerBillingCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    sget-object v3, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    invoke-virtual {v3, v2}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()LEu1;

    move-result-object p3

    new-instance v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$1;

    invoke-direct {v3, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p3

    sget-object v4, Ljz5;->a:Ljz5$a;

    invoke-virtual {v4}, Ljz5$a;->d()Ljz5;

    move-result-object v5

    invoke-static {v3, p3, v5, p4}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:LtP5;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFormFieldValue()LEu1;

    move-result-object p3

    new-instance v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$2;

    invoke-direct {v1, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$2;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p3

    invoke-virtual {v4}, Ljz5$a;->d()Ljz5;

    move-result-object v3

    invoke-static {v1, p3, v3, v0}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber:LtP5;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()LEu1;

    move-result-object p3

    new-instance v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$3;

    invoke-direct {v1, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$3;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p3

    invoke-virtual {v4}, Ljz5$a;->d()Ljz5;

    move-result-object v2

    invoke-static {v1, p3, v2, v0}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerName:LtP5;

    new-instance p3, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getMerchantName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;-><init>(Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;)V

    invoke-static {p3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->viewState:LtP5;

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_errorMessage:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->errorMessage:LtP5;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccount()LtP5;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$4;

    invoke-direct {p2, p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$special$$inlined$map$4;-><init>(LEu1;)V

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->accountEmail:LEu1;

    new-instance p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-direct {p1, p4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->debouncer:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    return-void
.end method

.method public static final synthetic access$clearError(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->clearError()V

    return-void
.end method

.method public static final synthetic access$getConsumerEmail$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:LtP5;

    return-object p0
.end method

.method public static final synthetic access$getConsumerName$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerName:LtP5;

    return-object p0
.end method

.method public static final synthetic access$getConsumerPhoneNumber$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber:LtP5;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$get_viewState$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    return-object p0
.end method

.method public static final synthetic access$lookupConsumerEmail(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->lookupConsumerEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mapToUserInput(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object p0

    return-object p0
.end method

.method private final clearError()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_errorMessage:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final lookupConsumerEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;

    iget v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->clearError()V

    iget-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountManager;->logout()Lzh2;

    iget-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p0, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    const/4 v2, 0x0

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_5

    iget-object p2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    :cond_4
    invoke-interface {p2}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    new-instance v2, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    invoke-direct {v2, p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;-><init>(Ljava/lang/String;)V

    sget-object v6, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;ILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_5
    iget-object p1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    :cond_6
    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    sget-object v9, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPhoneOrName:Lcom/stripe/android/link/ui/signup/SignUpState;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;ILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v1

    invoke-interface {p1, p2, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {p1, v3}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupStarted(Z)V

    goto :goto_2

    :cond_7
    iget-object p1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    :cond_8
    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    sget-object v7, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    instance-of v10, v1, Lcom/stripe/android/core/exception/APIConnectionException;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move v6, v10

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;ILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v2

    invoke-interface {p1, p2, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    if-nez v10, :cond_9

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->onError(Ljava/lang/Throwable;)V

    :cond_9
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getRequiresNameCollection()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    invoke-static {p3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v2

    :goto_1
    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    move v2, v1

    :cond_3
    :goto_2
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getE164PhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    invoke-direct {v3, p1, p2, v1, p3}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_4

    move-object v0, v3

    :cond_4
    return-object v0
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Error: "

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_errorMessage:LGX2;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final watchUserInput()V
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->debouncer:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:LtP5;

    new-instance v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$1;

    invoke-direct {v3, p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V

    new-instance v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$2;

    invoke-direct {v4, p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$2;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->startWatching(LZC0;LtP5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3;

    const/4 v0, 0x0

    invoke-direct {v8, p0, v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$3;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method


# virtual methods
.method public final getAccountEmail()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->accountEmail:LEu1;

    return-object v0
.end method

.method public final getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

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

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->errorMessage:LtP5;

    return-object v0
.end method

.method public final getNameController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    return-object v0
.end method

.method public final getRequiresNameCollection()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->config:Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/stripe/android/model/SetupIntent;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/stripe/android/model/SetupIntent;

    invoke-virtual {v0}, Lcom/stripe/android/model/SetupIntent;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode$Companion;->getUS()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final getViewState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->viewState:LtP5;

    return-object v0
.end method

.method public final logout()V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$logout$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$logout$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final toggleExpanded()V
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded$link_release()Z

    move-result v5

    const/4 v10, 0x1

    xor-int/2addr v5, v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1b

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;ZZLcom/stripe/android/link/ui/signup/SignUpState;ILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded$link_release()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->hasExpanded:Z

    if-nez v0, :cond_1

    iput-boolean v10, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->hasExpanded:Z

    invoke-direct {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->watchUserInput()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v0}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onInlineSignupCheckboxChecked()V

    :cond_1
    return-void
.end method
