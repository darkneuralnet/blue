.class public final Lzendesk/messaging/ui/InputBoxConsumer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/ui/InputBoxConsumer;",
        ">;"
    }
.end annotation


# instance fields
.field private final belvedereMediaHolderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final belvedereMediaResolverCallbackProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaResolverCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final belvedereProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/belvedere/a;",
            ">;"
        }
    .end annotation
.end field

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

.field private final imageStreamProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/belvedere/b;",
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
            "Lzendesk/messaging/EventListener;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;",
            "LY94<",
            "Lzendesk/belvedere/b;",
            ">;",
            "LY94<",
            "Lzendesk/belvedere/a;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaResolverCallback;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->eventListenerProvider:LY94;

    iput-object p2, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->eventFactoryProvider:LY94;

    iput-object p3, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->imageStreamProvider:LY94;

    iput-object p4, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->belvedereProvider:LY94;

    iput-object p5, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->belvedereMediaHolderProvider:LY94;

    iput-object p6, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->belvedereMediaResolverCallbackProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;LY94;)Lzendesk/messaging/ui/InputBoxConsumer_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/messaging/EventListener;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;",
            "LY94<",
            "Lzendesk/belvedere/b;",
            ">;",
            "LY94<",
            "Lzendesk/belvedere/a;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaResolverCallback;",
            ">;)",
            "Lzendesk/messaging/ui/InputBoxConsumer_Factory;"
        }
    .end annotation

    new-instance v7, Lzendesk/messaging/ui/InputBoxConsumer_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lzendesk/messaging/ui/InputBoxConsumer_Factory;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static newInstance(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;Lzendesk/belvedere/b;Lzendesk/belvedere/a;Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/BelvedereMediaResolverCallback;)Lzendesk/messaging/ui/InputBoxConsumer;
    .locals 8

    new-instance v7, Lzendesk/messaging/ui/InputBoxConsumer;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lzendesk/messaging/ui/InputBoxConsumer;-><init>(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;Lzendesk/belvedere/b;Lzendesk/belvedere/a;Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/BelvedereMediaResolverCallback;)V

    return-object v7
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->get()Lzendesk/messaging/ui/InputBoxConsumer;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/ui/InputBoxConsumer;
    .locals 7

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->eventListenerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lzendesk/messaging/EventListener;

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->eventFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lzendesk/messaging/EventFactory;

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->imageStreamProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lzendesk/belvedere/b;

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->belvedereProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lzendesk/belvedere/a;

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->belvedereMediaHolderProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lzendesk/messaging/BelvedereMediaHolder;

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->belvedereMediaResolverCallbackProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lzendesk/messaging/BelvedereMediaResolverCallback;

    invoke-static/range {v1 .. v6}, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->newInstance(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;Lzendesk/belvedere/b;Lzendesk/belvedere/a;Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/BelvedereMediaResolverCallback;)Lzendesk/messaging/ui/InputBoxConsumer;

    move-result-object v0

    return-object v0
.end method
