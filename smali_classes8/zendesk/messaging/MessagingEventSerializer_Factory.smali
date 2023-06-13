.class public final Lzendesk/messaging/MessagingEventSerializer_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/MessagingEventSerializer;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final timestampFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/TimestampFactory;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/TimestampFactory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingEventSerializer_Factory;->contextProvider:LY94;

    iput-object p2, p0, Lzendesk/messaging/MessagingEventSerializer_Factory;->timestampFactoryProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lzendesk/messaging/MessagingEventSerializer_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lzendesk/messaging/TimestampFactory;",
            ">;)",
            "Lzendesk/messaging/MessagingEventSerializer_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/MessagingEventSerializer_Factory;

    invoke-direct {v0, p0, p1}, Lzendesk/messaging/MessagingEventSerializer_Factory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static newInstance(Landroid/content/Context;Ljava/lang/Object;)Lzendesk/messaging/MessagingEventSerializer;
    .locals 1

    new-instance v0, Lzendesk/messaging/MessagingEventSerializer;

    check-cast p1, Lzendesk/messaging/TimestampFactory;

    invoke-direct {v0, p0, p1}, Lzendesk/messaging/MessagingEventSerializer;-><init>(Landroid/content/Context;Lzendesk/messaging/TimestampFactory;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingEventSerializer_Factory;->get()Lzendesk/messaging/MessagingEventSerializer;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/MessagingEventSerializer;
    .locals 2

    iget-object v0, p0, Lzendesk/messaging/MessagingEventSerializer_Factory;->contextProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lzendesk/messaging/MessagingEventSerializer_Factory;->timestampFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lzendesk/messaging/MessagingEventSerializer_Factory;->newInstance(Landroid/content/Context;Ljava/lang/Object;)Lzendesk/messaging/MessagingEventSerializer;

    move-result-object v0

    return-object v0
.end method
