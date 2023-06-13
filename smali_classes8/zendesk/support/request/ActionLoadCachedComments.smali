.class Lzendesk/support/request/ActionLoadCachedComments;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/request/AsyncMiddleware$AsyncAction;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/ActionLoadCachedComments$LoadComments;
    }
.end annotation


# instance fields
.field private final af:Lzendesk/support/request/ActionFactory;

.field private final belvedere:Lzendesk/belvedere/a;

.field private final executorService:Ljava/util/concurrent/Executor;

.field private final sdkVersion:Ljava/lang/String;

.field private final supportUiStorage:Lzendesk/support/SupportUiStorage;


# direct methods
.method public constructor <init>(Lzendesk/support/request/ActionFactory;Lzendesk/support/SupportUiStorage;Lzendesk/belvedere/a;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/ActionLoadCachedComments;->af:Lzendesk/support/request/ActionFactory;

    iput-object p2, p0, Lzendesk/support/request/ActionLoadCachedComments;->supportUiStorage:Lzendesk/support/SupportUiStorage;

    iput-object p3, p0, Lzendesk/support/request/ActionLoadCachedComments;->belvedere:Lzendesk/belvedere/a;

    iput-object p4, p0, Lzendesk/support/request/ActionLoadCachedComments;->executorService:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lzendesk/support/request/ActionLoadCachedComments;->sdkVersion:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public actionQueued(Lzendesk/support/suas/Dispatcher;Lzendesk/support/suas/GetState;)V
    .locals 0

    iget-object p2, p0, Lzendesk/support/request/ActionLoadCachedComments;->af:Lzendesk/support/request/ActionFactory;

    invoke-virtual {p2}, Lzendesk/support/request/ActionFactory;->loadCommentsFromCache()Lzendesk/support/suas/Action;

    move-result-object p2

    invoke-interface {p1, p2}, Lzendesk/support/suas/Dispatcher;->dispatch(Lzendesk/support/suas/Action;)V

    return-void
.end method

.method public execute(Lzendesk/support/suas/Dispatcher;Lzendesk/support/suas/GetState;Lzendesk/support/request/AsyncMiddleware$Callback;)V
    .locals 10

    invoke-interface {p2}, Lzendesk/support/suas/GetState;->getState()Lzendesk/support/suas/State;

    move-result-object p2

    invoke-static {p2}, Lzendesk/support/request/StateConversation;->fromState(Lzendesk/support/suas/State;)Lzendesk/support/request/StateConversation;

    move-result-object p2

    invoke-virtual {p2}, Lzendesk/support/request/StateConversation;->getLocalId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LlS5;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/support/request/ActionLoadCachedComments;->executorService:Ljava/util/concurrent/Executor;

    new-instance v9, Lzendesk/support/request/ActionLoadCachedComments$LoadComments;

    invoke-virtual {p2}, Lzendesk/support/request/StateConversation;->getLocalId()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lzendesk/support/request/ActionLoadCachedComments;->supportUiStorage:Lzendesk/support/SupportUiStorage;

    iget-object v6, p0, Lzendesk/support/request/ActionLoadCachedComments;->af:Lzendesk/support/request/ActionFactory;

    iget-object v7, p0, Lzendesk/support/request/ActionLoadCachedComments;->belvedere:Lzendesk/belvedere/a;

    iget-object v8, p0, Lzendesk/support/request/ActionLoadCachedComments;->sdkVersion:Ljava/lang/String;

    move-object v1, v9

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v1 .. v8}, Lzendesk/support/request/ActionLoadCachedComments$LoadComments;-><init>(Ljava/lang/String;Lzendesk/support/suas/Dispatcher;Lzendesk/support/request/AsyncMiddleware$Callback;Lzendesk/support/SupportUiStorage;Lzendesk/support/request/ActionFactory;Lzendesk/belvedere/a;Ljava/lang/String;)V

    invoke-interface {v0, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lzendesk/support/request/ActionLoadCachedComments;->af:Lzendesk/support/request/ActionFactory;

    invoke-virtual {p2}, Lzendesk/support/request/ActionFactory;->skipAction()Lzendesk/support/suas/Action;

    move-result-object p2

    invoke-interface {p1, p2}, Lzendesk/support/suas/Dispatcher;->dispatch(Lzendesk/support/suas/Action;)V

    invoke-interface {p3}, Lzendesk/support/request/AsyncMiddleware$Callback;->done()V

    :goto_0
    return-void
.end method
