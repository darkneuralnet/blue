.class public final Lcom/stripe/android/link/LinkActivityViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001*B)\u0008\u0001\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "LOr6;",
        "Lcom/stripe/android/model/StripeIntent;",
        "stripeIntent",
        "",
        "assertStripeIntentIsValid",
        "Lu5;",
        "activityResultCaller",
        "setupPaymentLauncher",
        "onBackPressed",
        "logout",
        "unregisterFromActivity",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "getLinkAccountManager",
        "()Lcom/stripe/android/link/account/LinkAccountManager;",
        "Lcom/stripe/android/link/model/Navigator;",
        "navigator",
        "Lcom/stripe/android/link/model/Navigator;",
        "getNavigator",
        "()Lcom/stripe/android/link/model/Navigator;",
        "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
        "confirmationManager",
        "Lcom/stripe/android/link/confirmation/ConfirmationManager;",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "injector",
        "Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "getInjector",
        "()Lcom/stripe/android/core/injection/NonFallbackInjector;",
        "setInjector",
        "(Lcom/stripe/android/core/injection/NonFallbackInjector;)V",
        "LtP5;",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "LtP5;",
        "getLinkAccount",
        "()LtP5;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "args",
        "<init>",
        "(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;)V",
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


# instance fields
.field private final confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

.field public injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

.field private final linkAccount:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final navigator:Lcom/stripe/android/link/model/Navigator;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/link/confirmation/ConfirmationManager;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    iput-object p4, p0, Lcom/stripe/android/link/LinkActivityViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    invoke-virtual {p2}, Lcom/stripe/android/link/account/LinkAccountManager;->getLinkAccount()LtP5;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccount:LtP5;

    invoke-virtual {p1}, Lcom/stripe/android/link/LinkActivityContract$Args;->getStripeIntent$link_release()Lcom/stripe/android/model/StripeIntent;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/link/LinkActivityViewModel;->assertStripeIntentIsValid(Lcom/stripe/android/model/StripeIntent;)V

    return-void
.end method

.method private final assertStripeIntentIsValid(Lcom/stripe/android/model/StripeIntent;)V
    .locals 3

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_5

    :try_start_1
    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/PaymentIntent;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent;->getAmount()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentIntent;->getCurrency()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    new-instance v1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    invoke-direct {v1, p1}, Lcom/stripe/android/link/LinkActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->dismiss(Lcom/stripe/android/link/LinkActivityResult;)Lkotlin/Unit;

    :cond_6
    return-void
.end method


# virtual methods
.method public final getInjector()Lcom/stripe/android/core/injection/NonFallbackInjector;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "injector"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLinkAccount()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccount:LtP5;

    return-object v0
.end method

.method public final getLinkAccountManager()Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object v0
.end method

.method public final getNavigator()Lcom/stripe/android/link/model/Navigator;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    return-object v0
.end method

.method public final logout()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    sget-object v1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->LoggedOut:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->cancel(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkAccountManager;->logout()Lzh2;

    return-void
.end method

.method public final onBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/link/model/Navigator;->onBack(Z)V

    return-void
.end method

.method public final setInjector(Lcom/stripe/android/core/injection/NonFallbackInjector;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel;->injector:Lcom/stripe/android/core/injection/NonFallbackInjector;

    return-void
.end method

.method public final setupPaymentLauncher(Lu5;)V
    .locals 1

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->setupPaymentLauncher(Lu5;)V

    return-void
.end method

.method public final unregisterFromActivity()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->confirmationManager:Lcom/stripe/android/link/confirmation/ConfirmationManager;

    invoke-virtual {v0}, Lcom/stripe/android/link/confirmation/ConfirmationManager;->invalidatePaymentLauncher()V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    invoke-virtual {v0}, Lcom/stripe/android/link/model/Navigator;->unregister()V

    return-void
.end method
