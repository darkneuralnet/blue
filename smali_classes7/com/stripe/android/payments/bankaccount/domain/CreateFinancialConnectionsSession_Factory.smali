.class public final Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;",
        ">;"
    }
.end annotation


# instance fields
.field private final stripeRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->stripeRepositoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;)",
            "Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;-><init>(Lcom/stripe/android/networking/StripeRepository;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->stripeRepositoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/networking/StripeRepository;

    invoke-static {v0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->newInstance(Lcom/stripe/android/networking/StripeRepository;)Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession_Factory;->get()Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;

    move-result-object v0

    return-object v0
.end method
