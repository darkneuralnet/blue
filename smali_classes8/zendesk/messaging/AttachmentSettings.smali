.class public Lzendesk/messaging/AttachmentSettings;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final maxFileSize:J

.field private final sendingEnabled:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lzendesk/messaging/AttachmentSettings;->maxFileSize:J

    iput-boolean p3, p0, Lzendesk/messaging/AttachmentSettings;->sendingEnabled:Z

    return-void
.end method


# virtual methods
.method public getMaxFileSize()J
    .locals 2

    iget-wide v0, p0, Lzendesk/messaging/AttachmentSettings;->maxFileSize:J

    return-wide v0
.end method

.method public isSendingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/messaging/AttachmentSettings;->sendingEnabled:Z

    return v0
.end method
