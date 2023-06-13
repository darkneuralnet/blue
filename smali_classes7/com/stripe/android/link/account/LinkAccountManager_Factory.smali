.class public final Lcom/stripe/android/link/account/LinkAccountManager_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
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

.field private final cookieStoreProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/account/CookieStore;",
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

.field private final linkRepositoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/link/repositories/LinkRepository;",
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
            "Lcom/stripe/android/link/repositories/LinkRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/CookieStore;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->configProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->linkRepositoryProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->cookieStoreProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->linkEventsReporterProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/account/LinkAccountManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/repositories/LinkRepository;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/CookieStore;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;)",
            "Lcom/stripe/android/link/account/LinkAccountManager_Factory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/account/LinkAccountManager_Factory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/stripe/android/link/account/LinkAccountManager;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->configProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    iget-object v1, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->linkRepositoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/repositories/LinkRepository;

    iget-object v2, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->cookieStoreProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/account/CookieStore;

    iget-object v3, p0, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->linkEventsReporterProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-static {v0, v1, v2, v3}, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->newInstance(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/repositories/LinkRepository;Lcom/stripe/android/link/account/CookieStore;Lcom/stripe/android/link/analytics/LinkEventsReporter;)Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/account/LinkAccountManager_Factory;->get()Lcom/stripe/android/link/account/LinkAccountManager;

    move-result-object v0

    return-object v0
.end method
