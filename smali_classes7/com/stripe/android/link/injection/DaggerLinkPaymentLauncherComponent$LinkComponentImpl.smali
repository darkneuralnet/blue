.class final Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;
.super Lcom/stripe/android/link/injection/LinkComponent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LinkComponentImpl"
.end annotation


# instance fields
.field private formControllerSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final linkComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

.field private final linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

.field private signedInViewModelSubcomponentBuilderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/injection/SignedInViewModelSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;


# direct methods
.method private constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/LinkActivityContract$Args;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/injection/LinkComponent;-><init>()V

    iput-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    iput-object p2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-direct {p0, p2}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->initialize(Lcom/stripe/android/link/LinkActivityContract$Args;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/LinkActivityContract$Args;LBL0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;Lcom/stripe/android/link/LinkActivityContract$Args;)V

    return-void
.end method

.method public static bridge synthetic a(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->formControllerSubcomponentBuilderProvider:LY94;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object p0
.end method

.method private initialize(Lcom/stripe/android/link/LinkActivityContract$Args;)V
    .locals 0

    new-instance p1, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl$1;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    new-instance p1, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl$2;-><init>(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;)V

    iput-object p1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->formControllerSubcomponentBuilderProvider:LY94;

    return-void
.end method

.method private injectFactory(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)Lcom/stripe/android/link/LinkActivityViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkActivityViewModel()Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/LinkActivityViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/link/LinkActivityViewModel$Factory;Lcom/stripe/android/link/LinkActivityViewModel;)V

    return-object p1
.end method

.method private injectFactory2(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->signUpViewModel()Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory_MembersInjector;->injectSignUpViewModel(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;Lcom/stripe/android/link/ui/signup/SignUpViewModel;)V

    return-object p1
.end method

.method private injectFactory3(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->i(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/verification/VerificationViewModel_Factory_MembersInjector;->injectViewModel(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;Lcom/stripe/android/link/ui/verification/VerificationViewModel;)V

    return-object p1
.end method

.method private injectFactory4(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/wallet/WalletViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private injectFactory5(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private injectFactory6(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->signedInViewModelSubcomponentBuilderProvider:LY94;

    invoke-static {p1, v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory_MembersInjector;->injectSubComponentBuilderProvider(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;LY94;)V

    return-object p1
.end method

.method private linkActivityViewModel()Lcom/stripe/android/link/LinkActivityViewModel;
    .locals 5

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v2, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v2}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->f(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v2

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v3, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v3}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->g(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v3

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/model/Navigator;

    iget-object v4, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v4}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->d(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v4

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/link/confirmation/ConfirmationManager;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/LinkActivityViewModel;-><init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;)V

    return-object v0
.end method

.method private signUpViewModel()Lcom/stripe/android/link/ui/signup/SignUpViewModel;
    .locals 7

    new-instance v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    iget-object v1, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->f(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v0

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->c(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v0

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->g(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v0

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/model/Navigator;

    iget-object v0, p0, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->linkPaymentLauncherComponentImpl:Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;

    invoke-static {v0}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;->h(Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkPaymentLauncherComponentImpl;)LY94;

    move-result-object v0

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/core/Logger;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;-><init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V

    return-object v6
.end method


# virtual methods
.method public inject(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->injectFactory(Lcom/stripe/android/link/LinkActivityViewModel$Factory;)Lcom/stripe/android/link/LinkActivityViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->injectFactory6(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->injectFactory5(Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->injectFactory2(Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;)Lcom/stripe/android/link/ui/signup/SignUpViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->injectFactory3(Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;)Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;

    return-void
.end method

.method public inject(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/injection/DaggerLinkPaymentLauncherComponent$LinkComponentImpl;->injectFactory4(Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;)Lcom/stripe/android/link/ui/wallet/WalletViewModel$Factory;

    return-void
.end method
