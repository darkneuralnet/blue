.class public final enum Lzendesk/support/AttachmentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzendesk/support/AttachmentType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lzendesk/support/AttachmentType;

.field public static final enum BLOCK:Lzendesk/support/AttachmentType;

.field public static final enum INLINE:Lzendesk/support/AttachmentType;


# instance fields
.field private attachmentType:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lzendesk/support/AttachmentType;

    const-string v1, "inline"

    const-string v2, "INLINE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lzendesk/support/AttachmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lzendesk/support/AttachmentType;->INLINE:Lzendesk/support/AttachmentType;

    new-instance v1, Lzendesk/support/AttachmentType;

    const-string v2, "block"

    const-string v4, "BLOCK"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lzendesk/support/AttachmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lzendesk/support/AttachmentType;->BLOCK:Lzendesk/support/AttachmentType;

    const/4 v2, 0x2

    new-array v2, v2, [Lzendesk/support/AttachmentType;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    sput-object v2, Lzendesk/support/AttachmentType;->$VALUES:[Lzendesk/support/AttachmentType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lzendesk/support/AttachmentType;->attachmentType:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lzendesk/support/AttachmentType;
    .locals 1

    const-class v0, Lzendesk/support/AttachmentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzendesk/support/AttachmentType;

    return-object p0
.end method

.method public static values()[Lzendesk/support/AttachmentType;
    .locals 1

    sget-object v0, Lzendesk/support/AttachmentType;->$VALUES:[Lzendesk/support/AttachmentType;

    invoke-virtual {v0}, [Lzendesk/support/AttachmentType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzendesk/support/AttachmentType;

    return-object v0
.end method


# virtual methods
.method public getAttachmentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzendesk/support/AttachmentType;->attachmentType:Ljava/lang/String;

    return-object v0
.end method
