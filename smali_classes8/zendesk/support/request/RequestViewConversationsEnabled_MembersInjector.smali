.class public final Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/request/RequestViewConversationsEnabled;",
        ">;"
    }
.end annotation


# instance fields
.field private final afProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final cellFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/CellFactory;",
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
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
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
            "Lzendesk/support/request/CellFactory;",
            ">;",
            "LY94<",
            "LiT3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->storeProvider:LY94;

    iput-object p2, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->afProvider:LY94;

    iput-object p3, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->cellFactoryProvider:LY94;

    iput-object p4, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->picassoProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Ldagger/MembersInjector;
    .locals 1
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
            "Lzendesk/support/request/CellFactory;",
            ">;",
            "LY94<",
            "LiT3;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/request/RequestViewConversationsEnabled;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;

    invoke-direct {v0, p0, p1, p2, p3}, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static injectAf(Lzendesk/support/request/RequestViewConversationsEnabled;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/ActionFactory;

    iput-object p1, p0, Lzendesk/support/request/RequestViewConversationsEnabled;->af:Lzendesk/support/request/ActionFactory;

    return-void
.end method

.method public static injectCellFactory(Lzendesk/support/request/RequestViewConversationsEnabled;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/CellFactory;

    iput-object p1, p0, Lzendesk/support/request/RequestViewConversationsEnabled;->cellFactory:Lzendesk/support/request/CellFactory;

    return-void
.end method

.method public static injectPicasso(Lzendesk/support/request/RequestViewConversationsEnabled;LiT3;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/RequestViewConversationsEnabled;->picasso:LiT3;

    return-void
.end method

.method public static injectStore(Lzendesk/support/request/RequestViewConversationsEnabled;Lzendesk/support/suas/Store;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/request/RequestViewConversationsEnabled;->store:Lzendesk/support/suas/Store;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/RequestViewConversationsEnabled;

    invoke-virtual {p0, p1}, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->injectMembers(Lzendesk/support/request/RequestViewConversationsEnabled;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/request/RequestViewConversationsEnabled;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->storeProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/suas/Store;

    invoke-static {p1, v0}, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->injectStore(Lzendesk/support/request/RequestViewConversationsEnabled;Lzendesk/support/suas/Store;)V

    iget-object v0, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->afProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->injectAf(Lzendesk/support/request/RequestViewConversationsEnabled;Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->cellFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->injectCellFactory(Lzendesk/support/request/RequestViewConversationsEnabled;Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->picassoProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiT3;

    invoke-static {p1, v0}, Lzendesk/support/request/RequestViewConversationsEnabled_MembersInjector;->injectPicasso(Lzendesk/support/request/RequestViewConversationsEnabled;LiT3;)V

    return-void
.end method
