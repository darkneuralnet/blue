.class public final Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final confirmationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
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

.field private final intentConfirmationInterceptorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final navigatorProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->linkAccountProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->linkAccountManagerProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->navigatorProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->confirmationManagerProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->loggerProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->formControllerProvider:LY94;

    iput-object p8, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->intentConfirmationInterceptorProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/IntentConfirmationInterceptor;",
            ">;)",
            "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;"
        }
    .end annotation

    new-instance v9, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;LY94;Lcom/stripe/android/IntentConfirmationInterceptor;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;
    .locals 10
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
            ")",
            "Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;"
        }
    .end annotation

    new-instance v9, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;-><init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;LY94;Lcom/stripe/android/IntentConfirmationInterceptor;)V

    return-object v9
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->linkAccountProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/model/LinkAccount;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->linkAccountManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->navigatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/model/Navigator;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->confirmationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/link/confirmation/ConfirmationManager;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/core/Logger;

    iget-object v7, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->formControllerProvider:LY94;

    iget-object v0, p0, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->intentConfirmationInterceptorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/IntentConfirmationInterceptor;

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->newInstance(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;Lcom/stripe/android/core/Logger;LY94;Lcom/stripe/android/IntentConfirmationInterceptor;)Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel_Factory;->get()Lcom/stripe/android/link/ui/paymentmethod/PaymentMethodViewModel;

    move-result-object v0

    return-object v0
.end method
