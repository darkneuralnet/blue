.class abstract Lzendesk/messaging/ui/EndUserCellBaseState;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final id:Ljava/lang/String;

.field private final messageActionListener:Lzendesk/messaging/ui/MessageActionListener;

.field private final props:Lzendesk/messaging/ui/MessagingCellProps;

.field private final status:Lzendesk/messaging/MessagingItem$Query$Status;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzendesk/messaging/ui/MessagingCellProps;Lzendesk/messaging/MessagingItem$Query$Status;Lzendesk/messaging/ui/MessageActionListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->id:Ljava/lang/String;

    iput-object p2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->props:Lzendesk/messaging/ui/MessagingCellProps;

    iput-object p3, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->status:Lzendesk/messaging/MessagingItem$Query$Status;

    iput-object p4, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->messageActionListener:Lzendesk/messaging/ui/MessageActionListener;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_5

    :cond_1
    check-cast p1, Lzendesk/messaging/ui/EndUserCellBaseState;

    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->id:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lzendesk/messaging/ui/EndUserCellBaseState;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lzendesk/messaging/ui/EndUserCellBaseState;->id:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    :cond_3
    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->props:Lzendesk/messaging/ui/MessagingCellProps;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lzendesk/messaging/ui/EndUserCellBaseState;->props:Lzendesk/messaging/ui/MessagingCellProps;

    invoke-virtual {v2, v3}, Lzendesk/messaging/ui/MessagingCellProps;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lzendesk/messaging/ui/EndUserCellBaseState;->props:Lzendesk/messaging/ui/MessagingCellProps;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    :cond_5
    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->status:Lzendesk/messaging/MessagingItem$Query$Status;

    iget-object v3, p1, Lzendesk/messaging/ui/EndUserCellBaseState;->status:Lzendesk/messaging/MessagingItem$Query$Status;

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->messageActionListener:Lzendesk/messaging/ui/MessageActionListener;

    if-eqz v2, :cond_7

    move v2, v0

    goto :goto_2

    :cond_7
    move v2, v1

    :goto_2
    iget-object p1, p1, Lzendesk/messaging/ui/EndUserCellBaseState;->messageActionListener:Lzendesk/messaging/ui/MessageActionListener;

    if-nez p1, :cond_8

    move p1, v0

    goto :goto_3

    :cond_8
    move p1, v1

    :goto_3
    if-ne v2, p1, :cond_9

    goto :goto_4

    :cond_9
    move v0, v1

    :goto_4
    return v0

    :cond_a
    :goto_5
    return v1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageActionListener()Lzendesk/messaging/ui/MessageActionListener;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->messageActionListener:Lzendesk/messaging/ui/MessageActionListener;

    return-object v0
.end method

.method public getProps()Lzendesk/messaging/ui/MessagingCellProps;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->props:Lzendesk/messaging/ui/MessagingCellProps;

    return-object v0
.end method

.method public getStatus()Lzendesk/messaging/MessagingItem$Query$Status;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->status:Lzendesk/messaging/MessagingItem$Query$Status;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->props:Lzendesk/messaging/ui/MessagingCellProps;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lzendesk/messaging/ui/MessagingCellProps;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->status:Lzendesk/messaging/MessagingItem$Query$Status;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lzendesk/messaging/ui/EndUserCellBaseState;->messageActionListener:Lzendesk/messaging/ui/MessageActionListener;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method
