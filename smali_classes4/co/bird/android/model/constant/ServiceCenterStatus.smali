.class public final enum Lco/bird/android/model/constant/ServiceCenterStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/ServiceCenterStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0019\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/android/model/constant/ServiceCenterStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "isCharging",
        "",
        "isHibernate",
        "isHibernateCreateBatch",
        "ENTRY",
        "CHECKED_IN",
        "AWAITING_INSPECTION",
        "AWAITING_REPAIR",
        "ACTIVE_REPAIR",
        "CANT_REPAIR",
        "CANT_REPAIR_PROCESS_OR_KNOWLEDGE",
        "CANT_REPAIR_TOOLS_AND_PARTS",
        "AWAITING_QUALITY_CONTROL",
        "HIBERNATE_CREATE_BATCH",
        "HIBERNATE",
        "CHARGING",
        "AWAITING_SCRAP",
        "AWAITING_SCRAP_SUBMERGED",
        "AWAITING_SCRAP_INSPECTION",
        "AWAITING_SCRAP_APPROVAL",
        "SCRAP_REJECTED",
        "SCRAP_COMPLETE",
        "SERVICE_COMPLETE_AWAITING_EXIT",
        "SERVICE_COMPLETE_RETURN_TO_CHARGER",
        "UNKNOWN",
        "NO_REPAIR_NEEDED",
        "model-constant"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum ACTIVE_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_QUALITY_CONTROL:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_SCRAP:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_SCRAP_APPROVAL:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_SCRAP_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum AWAITING_SCRAP_SUBMERGED:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum CANT_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum CANT_REPAIR_PROCESS_OR_KNOWLEDGE:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum CANT_REPAIR_TOOLS_AND_PARTS:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum CHARGING:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum CHECKED_IN:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum ENTRY:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum HIBERNATE:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum HIBERNATE_CREATE_BATCH:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum NO_REPAIR_NEEDED:Lco/bird/android/model/constant/ServiceCenterStatus;
    .annotation runtime Lkotlin/Deprecated;
        message = "This status does not correspond to an actual status in the Service Center"
    .end annotation
.end field

.field public static final enum SCRAP_COMPLETE:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum SCRAP_REJECTED:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum SERVICE_COMPLETE_AWAITING_EXIT:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum SERVICE_COMPLETE_RETURN_TO_CHARGER:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/ServiceCenterStatus;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/ServiceCenterStatus;
    .locals 3

    const/16 v0, 0x16

    new-array v0, v0, [Lco/bird/android/model/constant/ServiceCenterStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->ENTRY:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->CHECKED_IN:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->ACTIVE_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR_PROCESS_OR_KNOWLEDGE:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR_TOOLS_AND_PARTS:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_QUALITY_CONTROL:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE_CREATE_BATCH:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->CHARGING:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_SUBMERGED:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_APPROVAL:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->SCRAP_REJECTED:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->SCRAP_COMPLETE:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->SERVICE_COMPLETE_AWAITING_EXIT:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->SERVICE_COMPLETE_RETURN_TO_CHARGER:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->UNKNOWN:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterStatus;->NO_REPAIR_NEEDED:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "ENTRY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->ENTRY:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "CHECKED_IN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->CHECKED_IN:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_INSPECTION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_REPAIR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "ACTIVE_REPAIR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->ACTIVE_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "CANT_REPAIR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "CANT_REPAIR_PROCESS_OR_KNOWLEDGE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR_PROCESS_OR_KNOWLEDGE:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "CANT_REPAIR_TOOLS_AND_PARTS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR_TOOLS_AND_PARTS:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_QUALITY_CONTROL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_QUALITY_CONTROL:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "HIBERNATE_CREATE_BATCH"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE_CREATE_BATCH:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "HIBERNATE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "CHARGING"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->CHARGING:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_SCRAP"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_SCRAP_SUBMERGED"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_SUBMERGED:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_SCRAP_INSPECTION"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "AWAITING_SCRAP_APPROVAL"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_APPROVAL:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "SCRAP_REJECTED"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->SCRAP_REJECTED:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "SCRAP_COMPLETE"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->SCRAP_COMPLETE:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "SERVICE_COMPLETE_AWAITING_EXIT"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->SERVICE_COMPLETE_AWAITING_EXIT:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "SERVICE_COMPLETE_RETURN_TO_CHARGER"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->SERVICE_COMPLETE_RETURN_TO_CHARGER:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->UNKNOWN:Lco/bird/android/model/constant/ServiceCenterStatus;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    const-string v1, "NO_REPAIR_NEEDED"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->NO_REPAIR_NEEDED:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-static {}, Lco/bird/android/model/constant/ServiceCenterStatus;->$values()[Lco/bird/android/model/constant/ServiceCenterStatus;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->$VALUES:[Lco/bird/android/model/constant/ServiceCenterStatus;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ServiceCenterStatus;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/ServiceCenterStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/ServiceCenterStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->$VALUES:[Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/ServiceCenterStatus;

    return-object v0
.end method


# virtual methods
.method public final isCharging()Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->CHARGING:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isHibernate()Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isHibernateCreateBatch()Z
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterStatus;->HIBERNATE_CREATE_BATCH:Lco/bird/android/model/constant/ServiceCenterStatus;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
