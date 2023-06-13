.class public final Lzendesk/support/SdkDependencyProvider_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/SdkDependencyProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final actionHandlersProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/List<",
            "Lzendesk/core/ActionHandler;",
            ">;>;"
        }
    .end annotation
.end field

.field private final registryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;",
            "LY94<",
            "Ljava/util/List<",
            "Lzendesk/core/ActionHandler;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/SdkDependencyProvider_MembersInjector;->registryProvider:LY94;

    iput-object p2, p0, Lzendesk/support/SdkDependencyProvider_MembersInjector;->actionHandlersProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;",
            "LY94<",
            "Ljava/util/List<",
            "Lzendesk/core/ActionHandler;",
            ">;>;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/SdkDependencyProvider;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/SdkDependencyProvider_MembersInjector;

    invoke-direct {v0, p0, p1}, Lzendesk/support/SdkDependencyProvider_MembersInjector;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static injectActionHandlers(Lzendesk/support/SdkDependencyProvider;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/SdkDependencyProvider;",
            "Ljava/util/List<",
            "Lzendesk/core/ActionHandler;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzendesk/support/SdkDependencyProvider;->actionHandlers:Ljava/util/List;

    return-void
.end method

.method public static injectRegistry(Lzendesk/support/SdkDependencyProvider;Lzendesk/core/ActionHandlerRegistry;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/SdkDependencyProvider;->registry:Lzendesk/core/ActionHandlerRegistry;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/SdkDependencyProvider;

    invoke-virtual {p0, p1}, Lzendesk/support/SdkDependencyProvider_MembersInjector;->injectMembers(Lzendesk/support/SdkDependencyProvider;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/SdkDependencyProvider;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/SdkDependencyProvider_MembersInjector;->registryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandlerRegistry;

    invoke-static {p1, v0}, Lzendesk/support/SdkDependencyProvider_MembersInjector;->injectRegistry(Lzendesk/support/SdkDependencyProvider;Lzendesk/core/ActionHandlerRegistry;)V

    iget-object v0, p0, Lzendesk/support/SdkDependencyProvider_MembersInjector;->actionHandlersProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v0}, Lzendesk/support/SdkDependencyProvider_MembersInjector;->injectActionHandlers(Lzendesk/support/SdkDependencyProvider;Ljava/util/List;)V

    return-void
.end method
