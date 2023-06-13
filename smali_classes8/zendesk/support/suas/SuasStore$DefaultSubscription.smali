.class Lzendesk/support/suas/SuasStore$DefaultSubscription;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/suas/Subscription;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/suas/SuasStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DefaultSubscription"
.end annotation


# instance fields
.field private final listener:Lzendesk/support/suas/Listener;

.field private final stateListener:Lzendesk/support/suas/Listeners$StateListener;

.field final synthetic this$0:Lzendesk/support/suas/SuasStore;


# direct methods
.method public constructor <init>(Lzendesk/support/suas/SuasStore;Lzendesk/support/suas/Listeners$StateListener;Lzendesk/support/suas/Listener;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->this$0:Lzendesk/support/suas/SuasStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->stateListener:Lzendesk/support/suas/Listeners$StateListener;

    iput-object p3, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->listener:Lzendesk/support/suas/Listener;

    return-void
.end method


# virtual methods
.method public addListener()V
    .locals 3

    iget-object v0, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->this$0:Lzendesk/support/suas/SuasStore;

    invoke-static {v0}, Lzendesk/support/suas/SuasStore;->access$800(Lzendesk/support/suas/SuasStore;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->listener:Lzendesk/support/suas/Listener;

    iget-object v2, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->stateListener:Lzendesk/support/suas/Listeners$StateListener;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public informWithCurrentState()V
    .locals 4

    iget-object v0, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->stateListener:Lzendesk/support/suas/Listeners$StateListener;

    iget-object v1, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->this$0:Lzendesk/support/suas/SuasStore;

    invoke-virtual {v1}, Lzendesk/support/suas/SuasStore;->getState()Lzendesk/support/suas/State;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v3, v1, v2}, Lzendesk/support/suas/Listeners$StateListener;->update(Lzendesk/support/suas/State;Lzendesk/support/suas/State;Z)V

    return-void
.end method

.method public removeListener()V
    .locals 2

    iget-object v0, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->this$0:Lzendesk/support/suas/SuasStore;

    iget-object v1, p0, Lzendesk/support/suas/SuasStore$DefaultSubscription;->listener:Lzendesk/support/suas/Listener;

    invoke-virtual {v0, v1}, Lzendesk/support/suas/SuasStore;->removeListener(Lzendesk/support/suas/Listener;)V

    return-void
.end method
