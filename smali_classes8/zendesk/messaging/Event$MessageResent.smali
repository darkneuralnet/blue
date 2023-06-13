.class public Lzendesk/messaging/Event$MessageResent;
.super Lzendesk/messaging/Event;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MessageResent"
.end annotation


# instance fields
.field private final query:Lzendesk/messaging/MessagingItem$Query;


# direct methods
.method public constructor <init>(Lzendesk/messaging/MessagingItem$Query;Ljava/util/Date;)V
    .locals 1

    const-string v0, "message_resent"

    invoke-direct {p0, v0, p2}, Lzendesk/messaging/Event;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    iput-object p1, p0, Lzendesk/messaging/Event$MessageResent;->query:Lzendesk/messaging/MessagingItem$Query;

    return-void
.end method
