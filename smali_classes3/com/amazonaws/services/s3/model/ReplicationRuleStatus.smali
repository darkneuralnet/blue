.class public final enum Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

.field public static final enum Disabled:Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

.field public static final enum Enabled:Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;


# instance fields
.field private final status:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    const-string v1, "Enabled"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->Enabled:Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    new-instance v1, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    const-string v3, "Disabled"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->Disabled:Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->$VALUES:[Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

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

    iput-object p3, p0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->status:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;
    .locals 1

    const-class v0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;
    .locals 1

    sget-object v0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->$VALUES:[Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    invoke-virtual {v0}, [Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;

    return-object v0
.end method


# virtual methods
.method public getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/services/s3/model/ReplicationRuleStatus;->status:Ljava/lang/String;

    return-object v0
.end method
