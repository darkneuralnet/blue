.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final _viewEffectProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;"
        }
    .end annotation
.end field

.field private final argsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final attachFinancialConnectionsSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;"
        }
    .end annotation
.end field

.field private final createFinancialConnectionsSessionProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
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

.field private final retrieveStripeIntentProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;"
        }
    .end annotation
.end field

.field private final savedStateHandleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;",
            "LY94<",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->_viewEffectProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->createFinancialConnectionsSessionProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->attachFinancialConnectionsSessionProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->retrieveStripeIntentProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->savedStateHandleProvider:LY94;

    iput-object p7, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            ">;",
            "LY94<",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;>;",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            ">;",
            "LY94<",
            "Landroidx/lifecycle/p;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;"
        }
    .end annotation

    new-instance v8, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static newInstance(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;",
            "LBX2<",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;",
            ">;",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;",
            "Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;",
            "Landroidx/lifecycle/p;",
            "Lcom/stripe/android/core/Logger;",
            ")",
            "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;"
        }
    .end annotation

    new-instance v8, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)V

    return-object v8
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->_viewEffectProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LBX2;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->createFinancialConnectionsSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->attachFinancialConnectionsSessionProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->retrieveStripeIntentProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->savedStateHandleProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroidx/lifecycle/p;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/core/Logger;

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->newInstance(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;LBX2;Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;Landroidx/lifecycle/p;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel_Factory;->get()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;

    move-result-object v0

    return-object v0
.end method
