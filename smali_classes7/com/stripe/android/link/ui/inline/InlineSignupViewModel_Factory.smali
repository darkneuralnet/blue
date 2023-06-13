.class public final Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final configProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
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

.field private final linkEventsReporterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
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


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->configProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->linkAccountManagerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->linkEventsReporterProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->configProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->linkAccountManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v2, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->linkEventsReporterProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v3, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->newInstance(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel_Factory;->get()Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    move-result-object v0

    return-object v0
.end method
