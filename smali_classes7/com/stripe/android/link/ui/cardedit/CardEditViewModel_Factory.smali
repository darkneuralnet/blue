.class public final Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;",
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

.field private final formControllerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->linkAccountProvider:LY94;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->linkAccountManagerProvider:LY94;

    iput-object p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->navigatorProvider:LY94;

    iput-object p4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->loggerProvider:LY94;

    iput-object p5, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->argsProvider:LY94;

    iput-object p6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->formControllerProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
            "Lcom/stripe/android/core/Logger;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static newInstance(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkActivityContract$Args;LY94;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/link/model/Navigator;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)",
            "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;"
        }
    .end annotation

    new-instance v7, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkActivityContract$Args;LY94;)V

    return-object v7
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->linkAccountProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/link/model/LinkAccount;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->linkAccountManagerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/link/account/LinkAccountManager;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->navigatorProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/link/model/Navigator;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->loggerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/core/Logger;

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->argsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->formControllerProvider:LY94;

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->newInstance(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkActivityContract$Args;LY94;)Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel_Factory;->get()Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;

    move-result-object v0

    return-object v0
.end method
