.class public final Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/BelvedereMediaResolverCallback;",
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


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/messaging/EventListener;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->eventListenerProvider:LY94;

    iput-object p2, p0, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->eventFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/messaging/EventListener;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;)",
            "Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;

    invoke-direct {v0, p0, p1}, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;)Lzendesk/messaging/BelvedereMediaResolverCallback;
    .locals 1

    new-instance v0, Lzendesk/messaging/BelvedereMediaResolverCallback;

    invoke-direct {v0, p0, p1}, Lzendesk/messaging/BelvedereMediaResolverCallback;-><init>(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->get()Lzendesk/messaging/BelvedereMediaResolverCallback;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/BelvedereMediaResolverCallback;
    .locals 2

    iget-object v0, p0, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->eventListenerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/EventListener;

    iget-object v1, p0, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->eventFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/messaging/EventFactory;

    invoke-static {v0, v1}, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->newInstance(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;)Lzendesk/messaging/BelvedereMediaResolverCallback;

    move-result-object v0

    return-object v0
.end method
