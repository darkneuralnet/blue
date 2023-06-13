.class public final Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->argsProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->linkAccountManagerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->linkEventsReporterProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->navigatorProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->loggerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/model/Navigator;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/core/Logger;",
            ">;)",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;"
        }
    .end annotation

    new-instance v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static newInstance(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/ui/signup/SignUpViewModel;
    .locals 7

    new-instance v6, Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;-><init>(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)V

    return-object v6
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/ui/signup/SignUpViewModel;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->linkAccountManagerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->linkEventsReporterProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/analytics/LinkEventsReporter;

    iget-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->navigatorProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/link/model/Navigator;

    iget-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/core/Logger;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->newInstance(Lcom/stripe/android/link/LinkActivityContract$Args;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel_Factory;->get()Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-result-object v0

    return-object v0
.end method
