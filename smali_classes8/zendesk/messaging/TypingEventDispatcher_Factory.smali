.class public final Lzendesk/messaging/TypingEventDispatcher_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/TypingEventDispatcher;",
        ">;"
    }
.end annotation


# instance fields
.field private final eventFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final eventListenerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/EventListener;",
            ">;"
        }
    .end annotation
.end field

.field private final handlerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/os/Handler;",
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
            "Lzendesk/messaging/EventListener;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/TypingEventDispatcher_Factory;->eventListenerProvider:LY94;

    iput-object p2, p0, Lzendesk/messaging/TypingEventDispatcher_Factory;->handlerProvider:LY94;

    iput-object p3, p0, Lzendesk/messaging/TypingEventDispatcher_Factory;->eventFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/messaging/TypingEventDispatcher_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/messaging/EventListener;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;)",
            "Lzendesk/messaging/TypingEventDispatcher_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/TypingEventDispatcher_Factory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/messaging/TypingEventDispatcher_Factory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lzendesk/messaging/EventListener;Landroid/os/Handler;Lzendesk/messaging/EventFactory;)Lzendesk/messaging/TypingEventDispatcher;
    .locals 1

    new-instance v0, Lzendesk/messaging/TypingEventDispatcher;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/messaging/TypingEventDispatcher;-><init>(Lzendesk/messaging/EventListener;Landroid/os/Handler;Lzendesk/messaging/EventFactory;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/TypingEventDispatcher_Factory;->get()Lzendesk/messaging/TypingEventDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/TypingEventDispatcher;
    .locals 3

    iget-object v0, p0, Lzendesk/messaging/TypingEventDispatcher_Factory;->eventListenerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/EventListener;

    iget-object v1, p0, Lzendesk/messaging/TypingEventDispatcher_Factory;->handlerProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    iget-object v2, p0, Lzendesk/messaging/TypingEventDispatcher_Factory;->eventFactoryProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/messaging/EventFactory;

    invoke-static {v0, v1, v2}, Lzendesk/messaging/TypingEventDispatcher_Factory;->newInstance(Lzendesk/messaging/EventListener;Landroid/os/Handler;Lzendesk/messaging/EventFactory;)Lzendesk/messaging/TypingEventDispatcher;

    move-result-object v0

    return-object v0
.end method
