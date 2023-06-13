.class public final Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final stripeAccountIdProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

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
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->contextProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->stripeRepositoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->publishableKeyProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->stripeAccountIdProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/networking/StripeRepository;",
            ">;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;",
            "LY94<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/DefaultIntentConfirmationInterceptor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/networking/StripeRepository;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/DefaultIntentConfirmationInterceptor;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor;-><init>(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/DefaultIntentConfirmationInterceptor;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->stripeRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/networking/StripeRepository;

    iget-object v2, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->publishableKeyProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->stripeAccountIdProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->newInstance(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/DefaultIntentConfirmationInterceptor_Factory;->get()Lcom/stripe/android/DefaultIntentConfirmationInterceptor;

    move-result-object v0

    return-object v0
.end method
