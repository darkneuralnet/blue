.class public final Lcom/stripe/android/link/ui/signup/SignUpViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;,
        Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;,
        Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 Q2\u00020\u0001:\u0003QRSB1\u0008\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008O\u0010PJ&\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\u001b\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0008\u0010\u000e\u001a\u00020\u0008H\u0002J\u0010\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\u0008R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010%R\u0014\u0010\'\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%R\u0017\u0010(\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010%\u001a\u0004\u0008)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0017\u00101\u001a\u0002008\u0006\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u0017\u00105\u001a\u00020+8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010-\u001a\u0004\u00086\u0010/R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001c\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00109R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u00109R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00060<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u001d\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u0006078\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u00109\u001a\u0004\u0008?\u0010@R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020A0<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010>R\u001d\u0010C\u001a\u0008\u0012\u0004\u0012\u00020A078\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u00109\u001a\u0004\u0008D\u0010@R\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010>R\u001f\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E078\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u00109\u001a\u0004\u0008H\u0010@R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0011\u0010N\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010M\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006T"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
        "LOr6;",
        "",
        "email",
        "phone",
        "name",
        "",
        "determineIsReadyToSignUp",
        "",
        "lookupConsumerEmail",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "onAccountFetched",
        "clearError",
        "",
        "error",
        "onError",
        "onSignUpClick",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "args",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
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
        "isLoggedOut",
        "Z",
        "prefilledEmail",
        "Ljava/lang/String;",
        "prefilledPhone",
        "prefilledName",
        "merchantName",
        "getMerchantName",
        "()Ljava/lang/String;",
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
        "_isReadyToSignUp",
        "LGX2;",
        "isReadyToSignUp",
        "()LtP5;",
        "Lcom/stripe/android/link/ui/signup/SignUpState;",
        "_signUpStatus",
        "signUpState",
        "getSignUpState",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "_errorMessage",
        "errorMessage",
        "getErrorMessage",
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;",
        "debouncer",
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;",
        "getRequiresNameCollection",
        "()Z",
        "requiresNameCollection",
        "<init>",
        "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V",
        "Companion",
        "Debouncer",
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
        "SMAP\nSignUpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,272:1\n1#2:273\n47#3:274\n49#3:278\n47#3:279\n49#3:283\n47#3:284\n49#3:288\n50#4:275\n55#4:277\n50#4:280\n55#4:282\n50#4:285\n55#4:287\n106#5:276\n106#5:281\n106#5:286\n*S KotlinDebug\n*F\n+ 1 SignUpViewModel.kt\ncom/stripe/android/link/ui/signup/SignUpViewModel\n*L\n69#1:274\n69#1:278\n76#1:279\n76#1:283\n83#1:284\n83#1:288\n69#1:275\n69#1:277\n76#1:280\n76#1:282\n83#1:285\n83#1:287\n69#1:276\n76#1:281\n83#1:286\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

.field public static final LOOKUP_DEBOUNCE_MS:J = 0x3e8L


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

.field private final _isReadyToSignUp:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _signUpStatus:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/link/LinkActivityContract$Args;

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

.field private final debouncer:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

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

.field private final isLoggedOut:Z

.field private final isReadyToSignUp:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final merchantName:Ljava/lang/String;

.field private final nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final navigator:Lcom/stripe/android/link/model/Navigator;

.field private final phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field private final prefilledEmail:Ljava/lang/String;

.field private final prefilledName:Ljava/lang/String;

.field private final prefilledPhone:Ljava/lang/String;

.field private final signUpState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->Companion:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V
    .locals 8

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getCustomerEmail$link_release()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/stripe/android/link/account/LinkAccountManager;->hasUserLoggedOut(Ljava/lang/String;)Z

    move-result p2

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->isLoggedOut:Z

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getCustomerEmail$link_release()Ljava/lang/String;

    move-result-object p4

    const/4 p5, 0x0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p4, p5

    :goto_0
    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->prefilledEmail:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getCustomerPhone$link_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p5

    :goto_1
    const-string v1, ""

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    iput-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->prefilledPhone:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getCustomerName$link_release()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, p5

    :goto_2
    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v2

    :goto_3
    iput-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->prefilledName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getMerchantName$link_release()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->merchantName:Ljava/lang/String;

    sget-object p2, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    invoke-virtual {p2, p4}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    sget-object v2, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getConfiguration$link_release()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;->getCustomerBillingCountryCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    sget-object v0, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()LEu1;

    move-result-object p2

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$special$$inlined$map$1;

    invoke-direct {v1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p2

    sget-object v2, Ljz5;->a:Ljz5$a;

    invoke-virtual {v2}, Ljz5$a;->c()Ljz5;

    move-result-object v3

    invoke-static {v1, p2, v3, p4}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerEmail:LtP5;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFormFieldValue()LEu1;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$special$$inlined$map$2;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$special$$inlined$map$2;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p1

    invoke-virtual {v2}, Ljz5$a;->c()Ljz5;

    move-result-object v3

    invoke-static {v1, p1, v3, p5}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerPhoneNumber:LtP5;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()LEu1;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$special$$inlined$map$3;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$special$$inlined$map$3;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p1

    invoke-virtual {v2}, Ljz5$a;->c()Ljz5;

    move-result-object v1

    invoke-static {v0, p1, v1, p5}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerName:LtP5;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_isReadyToSignUp:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->isReadyToSignUp:LtP5;

    sget-object p1, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_signUpStatus:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->signUpState:LtP5;

    invoke-static {p5}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_errorMessage:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->errorMessage:LtP5;

    new-instance p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-direct {p1, p4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->debouncer:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p4

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V

    new-instance v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$2;

    invoke-direct {v1, p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$2;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V

    invoke-virtual {p1, p4, p2, v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Debouncer;->startWatching(LZC0;LtP5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/link/ui/signup/SignUpViewModel$3;

    invoke-direct {v5, p0, p5}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$3;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-interface {p3}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupFlowPresented()V

    return-void
.end method

.method public static final synthetic access$clearError(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->clearError()V

    return-void
.end method

.method public static final synthetic access$determineIsReadyToSignUp(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->determineIsReadyToSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getConsumerEmail$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerEmail:LtP5;

    return-object p0
.end method

.method public static final synthetic access$getConsumerName$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerName:LtP5;

    return-object p0
.end method

.method public static final synthetic access$getConsumerPhoneNumber$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerPhoneNumber:LtP5;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$getLinkEventsReporter$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/analytics/LinkEventsReporter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    return-object p0
.end method

.method public static final synthetic access$get_isReadyToSignUp$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_isReadyToSignUp:LGX2;

    return-object p0
.end method

.method public static final synthetic access$get_signUpStatus$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_signUpStatus:LGX2;

    return-object p0
.end method

.method public static final synthetic access$lookupConsumerEmail(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->lookupConsumerEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onAccountFetched(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lcom/stripe/android/link/model/LinkAccount;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onAccountFetched(Lcom/stripe/android/link/model/LinkAccount;)V

    return-void
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final clearError()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_errorMessage:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final determineIsReadyToSignUp(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->getRequiresNameCollection()Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    if-eqz p3, :cond_1

    invoke-static {p3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p2

    :goto_1
    if-nez p1, :cond_3

    :cond_2
    move v0, p2

    :cond_3
    return v0
.end method

.method private final lookupConsumerEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p2, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;

    iget v1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    iget-object p2, v4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, v4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->label:I

    const/4 v7, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

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

    invoke-direct {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->clearError()V

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    iput-object p0, v4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->L$0:Ljava/lang/Object;

    iput v7, v4, Lcom/stripe/android/link/ui/signup/SignUpViewModel$lookupConsumerEmail$1;->label:I

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-0E7RQCE$default(Lcom/stripe/android/link/account/LinkAccountManager;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_5

    check-cast p2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz p2, :cond_4

    invoke-direct {p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onAccountFetched(Lcom/stripe/android/link/model/LinkAccount;)V

    goto :goto_2

    :cond_4
    iget-object p2, p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_signUpStatus:LGX2;

    sget-object v0, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPhoneOrName:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-interface {p2, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p2, v7, v0}, Lcom/stripe/android/link/analytics/LinkEventsReporter$DefaultImpls;->onSignupStarted$default(Lcom/stripe/android/link/analytics/LinkEventsReporter;ZILjava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object p2, p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_signUpStatus:LGX2;

    sget-object v1, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingEmail:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-interface {p2, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError(Ljava/lang/Throwable;)V

    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final onAccountFetched(Lcom/stripe/android/link/model/LinkAccount;)V
    .locals 4

    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->isVerified()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v0, Lcom/stripe/android/link/LinkScreen$Wallet;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Wallet;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/link/model/Navigator;->navigateTo(Lcom/stripe/android/link/LinkScreen;Z)Lkotlin/Unit;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v0, Lcom/stripe/android/link/LinkScreen$Verification;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Verification;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lcom/stripe/android/link/model/Navigator;->navigateTo$default(Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/LinkScreen;ZILjava/lang/Object;)Lkotlin/Unit;

    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Error: "

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->_errorMessage:LGX2;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

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

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->errorMessage:LtP5;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getNameController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    return-object v0
.end method

.method public final getRequiresNameCollection()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

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

.method public final getSignUpState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->signUpState:LtP5;

    return-object v0
.end method

.method public final isReadyToSignUp()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->isReadyToSignUp:LtP5;

    return-object v0
.end method

.method public final onSignUpClick()V
    .locals 14

    invoke-direct {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->clearError()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerEmail:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_1

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerPhoneNumber:LtP5;

    invoke-interface {v2}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getE164PhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->consumerName:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Lcom/stripe/android/link/ui/signup/SignUpViewModel$onSignUpClick$1;

    const/4 v8, 0x0

    move-object v2, v11

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$onSignUpClick$1;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    move-object v8, v0

    invoke-static/range {v8 .. v13}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
