.class Lzendesk/messaging/ui/AgentImageCellView$State;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/ui/AgentImageCellView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "State"
.end annotation


# instance fields
.field private final avatarState:Lzendesk/messaging/ui/AvatarState;

.field private final avatarStateRenderer:Lzendesk/messaging/ui/AvatarStateRenderer;

.field private final isBot:Z

.field private final label:Ljava/lang/String;

.field private final picasso:LiT3;

.field private final props:Lzendesk/messaging/ui/MessagingCellProps;


# direct methods
.method public constructor <init>(LiT3;Lzendesk/messaging/ui/MessagingCellProps;Lzendesk/messaging/Attachment;Ljava/lang/String;ZLzendesk/messaging/ui/AvatarState;Lzendesk/messaging/ui/AvatarStateRenderer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->picasso:LiT3;

    iput-object p2, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->props:Lzendesk/messaging/ui/MessagingCellProps;

    iput-object p4, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->label:Ljava/lang/String;

    iput-boolean p5, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->isBot:Z

    iput-object p6, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->avatarState:Lzendesk/messaging/ui/AvatarState;

    iput-object p7, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->avatarStateRenderer:Lzendesk/messaging/ui/AvatarStateRenderer;

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

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_4

    :cond_1
    check-cast p1, Lzendesk/messaging/ui/AgentImageCellView$State;

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->isBot()Z

    move-result v2

    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->isBot()Z

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getPicasso()LiT3;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getPicasso()LiT3;

    move-result-object v2

    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getPicasso()LiT3;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getPicasso()LiT3;

    move-result-object v2

    if-eqz v2, :cond_4

    :goto_0
    return v1

    :cond_4
    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getProps()Lzendesk/messaging/ui/MessagingCellProps;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getProps()Lzendesk/messaging/ui/MessagingCellProps;

    move-result-object v2

    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getProps()Lzendesk/messaging/ui/MessagingCellProps;

    move-result-object v3

    invoke-virtual {v2, v3}, Lzendesk/messaging/ui/MessagingCellProps;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getProps()Lzendesk/messaging/ui/MessagingCellProps;

    move-result-object v2

    if-eqz v2, :cond_6

    :goto_1
    return v1

    :cond_6
    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getLabel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getLabel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    :goto_2
    return v1

    :cond_8
    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAttachment()Lzendesk/messaging/Attachment;

    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAttachment()Lzendesk/messaging/Attachment;

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAvatarState()Lzendesk/messaging/ui/AvatarState;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAvatarState()Lzendesk/messaging/ui/AvatarState;

    move-result-object v0

    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAvatarState()Lzendesk/messaging/ui/AvatarState;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAvatarState()Lzendesk/messaging/ui/AvatarState;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_3

    :cond_a
    move v0, v1

    :goto_3
    return v0

    :cond_b
    :goto_4
    return v1
.end method

.method public getAttachment()Lzendesk/messaging/Attachment;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAvatarState()Lzendesk/messaging/ui/AvatarState;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->avatarState:Lzendesk/messaging/ui/AvatarState;

    return-object v0
.end method

.method public getAvatarStateRenderer()Lzendesk/messaging/ui/AvatarStateRenderer;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->avatarStateRenderer:Lzendesk/messaging/ui/AvatarStateRenderer;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getPicasso()LiT3;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->picasso:LiT3;

    return-object v0
.end method

.method public getProps()Lzendesk/messaging/ui/MessagingCellProps;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->props:Lzendesk/messaging/ui/MessagingCellProps;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getPicasso()LiT3;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getPicasso()LiT3;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getProps()Lzendesk/messaging/ui/MessagingCellProps;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getProps()Lzendesk/messaging/ui/MessagingCellProps;

    move-result-object v2

    invoke-virtual {v2}, Lzendesk/messaging/ui/MessagingCellProps;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getLabel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->isBot()Z

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAttachment()Lzendesk/messaging/Attachment;

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAvatarState()Lzendesk/messaging/ui/AvatarState;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lzendesk/messaging/ui/AgentImageCellView$State;->getAvatarState()Lzendesk/messaging/ui/AvatarState;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public isBot()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/messaging/ui/AgentImageCellView$State;->isBot:Z

    return v0
.end method
