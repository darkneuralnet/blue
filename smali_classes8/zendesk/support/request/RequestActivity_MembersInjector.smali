.class public final Lzendesk/support/request/RequestActivity_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/request/RequestActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final actionHandlerRegistryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private final afProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final headlessComponentListenerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/HeadlessComponentListener;",
            ">;"
        }
    .end annotation
.end field

.field private final picassoProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiT3;",
            ">;"
        }
    .end annotation
.end field

.field private final storeProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/suas/Store;",
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
            "Lzendesk/support/suas/Store;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/HeadlessComponentListener;",
            ">;",
            "LY94<",
            "LiT3;",
            ">;",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->storeProvider:LY94;

    iput-object p2, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->afProvider:LY94;

    iput-object p3, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->headlessComponentListenerProvider:LY94;

    iput-object p4, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->picassoProvider:LY94;

    iput-object p5, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->actionHandlerRegistryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Ldagger/MembersInjector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/suas/Store;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/HeadlessComponentListener;",
            ">;",
            "LY94<",
            "LiT3;",
            ">;",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/request/RequestActivity;",
            ">;"
        }
    .end annotation

    new-instance v6, Lzendesk/support/request/RequestActivity_MembersInjector;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lzendesk/support/request/RequestActivity_MembersInjector;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static injectActionHandlerRegistry(Lzendesk/support/request/RequestActivity;Lzendesk/core/ActionHandlerRegistry;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    return-void
.end method

.method public static injectAf(Lzendesk/support/request/RequestActivity;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/ActionFactory;

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->af:Lzendesk/support/request/ActionFactory;

    return-void
.end method

.method public static injectHeadlessComponentListener(Lzendesk/support/request/RequestActivity;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/HeadlessComponentListener;

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->headlessComponentListener:Lzendesk/support/request/HeadlessComponentListener;

    return-void
.end method

.method public static injectPicasso(Lzendesk/support/request/RequestActivity;LiT3;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->picasso:LiT3;

    return-void
.end method

.method public static injectStore(Lzendesk/support/request/RequestActivity;Lzendesk/support/suas/Store;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/RequestActivity;

    invoke-virtual {p0, p1}, Lzendesk/support/request/RequestActivity_MembersInjector;->injectMembers(Lzendesk/support/request/RequestActivity;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/request/RequestActivity;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->storeProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/suas/Store;

    invoke-static {p1, v0}, Lzendesk/support/request/RequestActivity_MembersInjector;->injectStore(Lzendesk/support/request/RequestActivity;Lzendesk/support/suas/Store;)V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->afProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/request/RequestActivity_MembersInjector;->injectAf(Lzendesk/support/request/RequestActivity;Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->headlessComponentListenerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/request/RequestActivity_MembersInjector;->injectHeadlessComponentListener(Lzendesk/support/request/RequestActivity;Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->picassoProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiT3;

    invoke-static {p1, v0}, Lzendesk/support/request/RequestActivity_MembersInjector;->injectPicasso(Lzendesk/support/request/RequestActivity;LiT3;)V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity_MembersInjector;->actionHandlerRegistryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandlerRegistry;

    invoke-static {p1, v0}, Lzendesk/support/request/RequestActivity_MembersInjector;->injectActionHandlerRegistry(Lzendesk/support/request/RequestActivity;Lzendesk/core/ActionHandlerRegistry;)V

    return-void
.end method
