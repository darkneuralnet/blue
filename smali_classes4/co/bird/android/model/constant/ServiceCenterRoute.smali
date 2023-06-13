.class public final enum Lco/bird/android/model/constant/ServiceCenterRoute;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/constant/ServiceCenterRoute$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/constant/ServiceCenterRoute;",
        "",
        "(Ljava/lang/String;I)V",
        "CHECK_IN",
        "REPAIR",
        "CHARGE",
        "SCRAP",
        "HIBERNATE",
        "SERVICE_COMPLETE",
        "UNKNOWN",
        "Companion",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/ServiceCenterRoute;

.field public static final enum CHARGE:Lco/bird/android/model/constant/ServiceCenterRoute;

.field public static final enum CHECK_IN:Lco/bird/android/model/constant/ServiceCenterRoute;

.field private static final CHECK_IN_ROUTE_STATUSES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/constant/ServiceCenterStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lco/bird/android/model/constant/ServiceCenterRoute$Companion;

.field public static final enum HIBERNATE:Lco/bird/android/model/constant/ServiceCenterRoute;

.field public static final enum REPAIR:Lco/bird/android/model/constant/ServiceCenterRoute;

.field private static final REPAIR_ROUTE_STATUSES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/constant/ServiceCenterStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SCRAP:Lco/bird/android/model/constant/ServiceCenterRoute;

.field private static final SCRAP_ROUTE_STATUSES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/constant/ServiceCenterStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SERVICE_COMPLETE:Lco/bird/android/model/constant/ServiceCenterRoute;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/ServiceCenterRoute;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/ServiceCenterRoute;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/constant/ServiceCenterRoute;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->CHECK_IN:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->REPAIR:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->CHARGE:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->SCRAP:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->HIBERNATE:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->SERVICE_COMPLETE:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/ServiceCenterRoute;->UNKNOWN:Lco/bird/android/model/constant/ServiceCenterRoute;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "CHECK_IN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->CHECK_IN:Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "REPAIR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->REPAIR:Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "CHARGE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->CHARGE:Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "SCRAP"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->SCRAP:Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "HIBERNATE"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->HIBERNATE:Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "SERVICE_COMPLETE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->SERVICE_COMPLETE:Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    const-string v1, "UNKNOWN"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lco/bird/android/model/constant/ServiceCenterRoute;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->UNKNOWN:Lco/bird/android/model/constant/ServiceCenterRoute;

    invoke-static {}, Lco/bird/android/model/constant/ServiceCenterRoute;->$values()[Lco/bird/android/model/constant/ServiceCenterRoute;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->$VALUES:[Lco/bird/android/model/constant/ServiceCenterRoute;

    new-instance v0, Lco/bird/android/model/constant/ServiceCenterRoute$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/constant/ServiceCenterRoute$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->Companion:Lco/bird/android/model/constant/ServiceCenterRoute$Companion;

    new-array v0, v5, [Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->ENTRY:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v3

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->CHECKED_IN:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->CHECK_IN_ROUTE_STATUSES:Ljava/util/Set;

    new-array v0, v7, [Lco/bird/android/model/constant/ServiceCenterStatus;

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->ACTIVE_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v3

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v4

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR_PROCESS_OR_KNOWLEDGE:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v5

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->CANT_REPAIR_TOOLS_AND_PARTS:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v6

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->REPAIR_ROUTE_STATUSES:Ljava/util/Set;

    new-array v0, v8, [Lco/bird/android/model/constant/ServiceCenterStatus;

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v2

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_SUBMERGED:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v3

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_INSPECTION:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v4

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->AWAITING_SCRAP_APPROVAL:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v5

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->SCRAP_REJECTED:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v6

    sget-object v1, Lco/bird/android/model/constant/ServiceCenterStatus;->SCRAP_COMPLETE:Lco/bird/android/model/constant/ServiceCenterStatus;

    aput-object v1, v0, v7

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->SCRAP_ROUTE_STATUSES:Ljava/util/Set;

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

.method public static final synthetic access$getCHECK_IN_ROUTE_STATUSES$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->CHECK_IN_ROUTE_STATUSES:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getREPAIR_ROUTE_STATUSES$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->REPAIR_ROUTE_STATUSES:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getSCRAP_ROUTE_STATUSES$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->SCRAP_ROUTE_STATUSES:Ljava/util/Set;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ServiceCenterRoute;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/ServiceCenterRoute;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/ServiceCenterRoute;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/ServiceCenterRoute;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ServiceCenterRoute;->$VALUES:[Lco/bird/android/model/constant/ServiceCenterRoute;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/ServiceCenterRoute;

    return-object v0
.end method
