.class public Lzendesk/messaging/ui/InputBoxConsumer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/messaging/ui/InputBox$InputTextConsumer;


# instance fields
.field private final belvedere:Lzendesk/belvedere/a;

.field private final belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

.field private final belvedereMediaResolverCallback:Lzendesk/messaging/BelvedereMediaResolverCallback;

.field private final eventFactory:Lzendesk/messaging/EventFactory;

.field private final eventListener:Lzendesk/messaging/EventListener;

.field private final imageStream:Lzendesk/belvedere/b;


# direct methods
.method public constructor <init>(Lzendesk/messaging/EventListener;Lzendesk/messaging/EventFactory;Lzendesk/belvedere/b;Lzendesk/belvedere/a;Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/BelvedereMediaResolverCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/InputBoxConsumer;->eventListener:Lzendesk/messaging/EventListener;

    iput-object p2, p0, Lzendesk/messaging/ui/InputBoxConsumer;->eventFactory:Lzendesk/messaging/EventFactory;

    iput-object p3, p0, Lzendesk/messaging/ui/InputBoxConsumer;->imageStream:Lzendesk/belvedere/b;

    iput-object p4, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedere:Lzendesk/belvedere/a;

    iput-object p5, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    iput-object p6, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedereMediaResolverCallback:Lzendesk/messaging/BelvedereMediaResolverCallback;

    return-void
.end method


# virtual methods
.method public onConsumeText(Ljava/lang/String;)Z
    .locals 3

    invoke-static {p1}, LlS5;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer;->eventListener:Lzendesk/messaging/EventListener;

    iget-object v1, p0, Lzendesk/messaging/ui/InputBoxConsumer;->eventFactory:Lzendesk/messaging/EventFactory;

    invoke-virtual {v1, p1}, Lzendesk/messaging/EventFactory;->textInput(Ljava/lang/String;)Lzendesk/messaging/Event;

    move-result-object p1

    invoke-interface {v0, p1}, Lzendesk/messaging/EventListener;->onEvent(Lzendesk/messaging/Event;)V

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {v0}, Lzendesk/messaging/BelvedereMediaHolder;->getSelectedMedia()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/belvedere/MediaResult;

    invoke-virtual {v1}, Lzendesk/belvedere/MediaResult;->j()Landroid/net/Uri;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedere:Lzendesk/belvedere/a;

    const-string v1, "zendesk/messaging"

    iget-object v2, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedereMediaResolverCallback:Lzendesk/messaging/BelvedereMediaResolverCallback;

    invoke-virtual {v0, p1, v1, v2}, Lzendesk/belvedere/a;->h(Ljava/util/List;Ljava/lang/String;LG80;)V

    iget-object p1, p0, Lzendesk/messaging/ui/InputBoxConsumer;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {p1}, Lzendesk/messaging/BelvedereMediaHolder;->clear()V

    :cond_2
    iget-object p1, p0, Lzendesk/messaging/ui/InputBoxConsumer;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {p1}, Lzendesk/belvedere/b;->D9()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lzendesk/messaging/ui/InputBoxConsumer;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {p1}, Lzendesk/belvedere/b;->dismiss()V

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
