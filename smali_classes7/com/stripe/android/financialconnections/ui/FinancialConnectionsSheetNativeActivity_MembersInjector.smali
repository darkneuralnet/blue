.class public final Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final imageLoaderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
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

.field private final navigationManagerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->navigationManagerProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->loggerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->imageLoaderProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/financialconnections/navigation/NavigationManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static injectImageLoader(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/uicore/image/StripeImageLoader;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    return-void
.end method

.method public static injectLogger(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/core/Logger;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method public static injectNavigationManager(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/navigation/NavigationManager;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->navigationManager:Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->navigationManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/NavigationManager;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectNavigationManager(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/financialconnections/navigation/NavigationManager;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectLogger(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/core/Logger;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->imageLoaderProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageLoader;

    invoke-static {p1, v0}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectImageLoader(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;Lcom/stripe/android/uicore/image/StripeImageLoader;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity_MembersInjector;->injectMembers(Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;)V

    return-void
.end method
