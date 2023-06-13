.class Lzendesk/messaging/ui/AgentMessageView$State;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/ui/AgentMessageView;
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

.field private final message:Ljava/lang/String;

.field private final props:Lzendesk/messaging/ui/MessagingCellProps;


# direct methods
.method public constructor <init>(Lzendesk/messaging/ui/MessagingCellProps;Ljava/lang/String;Ljava/lang/String;ZLzendesk/messaging/ui/AvatarState;Lzendesk/messaging/ui/AvatarStateRenderer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/AgentMessageView$State;->props:Lzendesk/messaging/ui/MessagingCellProps;

    iput-object p2, p0, Lzendesk/messaging/ui/AgentMessageView$State;->message:Ljava/lang/String;

    iput-object p3, p0, Lzendesk/messaging/ui/AgentMessageView$State;->label:Ljava/lang/String;

    iput-boolean p4, p0, Lzendesk/messaging/ui/AgentMessageView$State;->isBot:Z

    iput-object p5, p0, Lzendesk/messaging/ui/AgentMessageView$State;->avatarState:Lzendesk/messaging/ui/AvatarState;

    iput-object p6, p0, Lzendesk/messaging/ui/AgentMessageView$State;->avatarStateRenderer:Lzendesk/messaging/ui/AvatarStateRenderer;

    return-void
.end method


# virtual methods
.method public getAvatarState()Lzendesk/messaging/ui/AvatarState;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentMessageView$State;->avatarState:Lzendesk/messaging/ui/AvatarState;

    return-object v0
.end method

.method public getAvatarStateRenderer()Lzendesk/messaging/ui/AvatarStateRenderer;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentMessageView$State;->avatarStateRenderer:Lzendesk/messaging/ui/AvatarStateRenderer;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentMessageView$State;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentMessageView$State;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getProps()Lzendesk/messaging/ui/MessagingCellProps;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AgentMessageView$State;->props:Lzendesk/messaging/ui/MessagingCellProps;

    return-object v0
.end method

.method public isBot()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/messaging/ui/AgentMessageView$State;->isBot:Z

    return v0
.end method
