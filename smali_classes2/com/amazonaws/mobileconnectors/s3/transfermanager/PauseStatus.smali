.class public final enum Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

.field public static final enum CANCELLED:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

.field public static final enum CANCELLED_BEFORE_START:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

.field public static final enum NOT_STARTED:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

.field public static final enum NO_EFFECT:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

.field public static final enum SUCCESS:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->SUCCESS:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    new-instance v1, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    const-string v3, "NOT_STARTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->NOT_STARTED:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    new-instance v3, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    const-string v5, "CANCELLED_BEFORE_START"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->CANCELLED_BEFORE_START:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    new-instance v5, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    const-string v7, "NO_EFFECT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->NO_EFFECT:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    new-instance v7, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    const-string v9, "CANCELLED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->CANCELLED:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->$VALUES:[Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;
    .locals 1

    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->$VALUES:[Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    invoke-virtual {v0}, [Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    return-object v0
.end method


# virtual methods
.method public isCancelled()Z
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->CANCELLED:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->CANCELLED_BEFORE_START:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isPaused()Z
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->SUCCESS:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public unchanged()Z
    .locals 1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->NOT_STARTED:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;->NO_EFFECT:Lcom/amazonaws/mobileconnectors/s3/transfermanager/PauseStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
