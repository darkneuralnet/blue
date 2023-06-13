.class Lzendesk/messaging/MessagingConversationLog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TIMESTAMP_COMPARATOR:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lzendesk/messaging/MessagingEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final events:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/messaging/Event;",
            ">;"
        }
    .end annotation
.end field

.field private final messagingEventSerializer:Lzendesk/messaging/MessagingEventSerializer;

.field private final messagingItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/messaging/MessagingItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzendesk/messaging/MessagingConversationLog$1;

    invoke-direct {v0}, Lzendesk/messaging/MessagingConversationLog$1;-><init>()V

    sput-object v0, Lzendesk/messaging/MessagingConversationLog;->TIMESTAMP_COMPARATOR:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lzendesk/messaging/MessagingEventSerializer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingConversationLog;->messagingEventSerializer:Lzendesk/messaging/MessagingEventSerializer;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingConversationLog;->messagingItems:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingConversationLog;->events:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addEvent(Lzendesk/messaging/Event;)V
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingConversationLog;->events:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setMessagingItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/messaging/MessagingItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingConversationLog;->messagingItems:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {p1}, Ljm0;->i(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/messaging/MessagingConversationLog;->messagingItems:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method
