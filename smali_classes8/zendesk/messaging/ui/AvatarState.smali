.class Lzendesk/messaging/ui/AvatarState;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final avatarLetter:Ljava/lang/String;

.field private final avatarRes:Ljava/lang/Integer;

.field private final avatarUrl:Ljava/lang/String;

.field private final uniqueIdentifier:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/AvatarState;->uniqueIdentifier:Ljava/lang/Object;

    iput-object p2, p0, Lzendesk/messaging/ui/AvatarState;->avatarLetter:Ljava/lang/String;

    iput-object p3, p0, Lzendesk/messaging/ui/AvatarState;->avatarUrl:Ljava/lang/String;

    iput-object p4, p0, Lzendesk/messaging/ui/AvatarState;->avatarRes:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getAvatarLetter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AvatarState;->avatarLetter:Ljava/lang/String;

    return-object v0
.end method

.method public getAvatarRes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AvatarState;->avatarRes:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AvatarState;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getUniqueIdentifier()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/AvatarState;->uniqueIdentifier:Ljava/lang/Object;

    return-object v0
.end method
