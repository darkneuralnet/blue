.class public final enum Lco/bird/android/model/constant/AreaKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/AreaKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0007j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/model/constant/AreaKind;",
        "",
        "areaName",
        "",
        "areaValue",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getAreaName",
        "()Ljava/lang/String;",
        "getAreaValue",
        "OPERATIONAL",
        "NO_PARKING",
        "NO_RIDING",
        "SLOW_SPEED",
        "PREFERRED_PARKING",
        "DEMAND_CELLS",
        "FEE_MODIFIED",
        "REQUIRED_RELEASES",
        "UNKNOWN",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/AreaKind;

.field public static final enum DEMAND_CELLS:Lco/bird/android/model/constant/AreaKind;

.field public static final enum FEE_MODIFIED:Lco/bird/android/model/constant/AreaKind;

.field public static final enum NO_PARKING:Lco/bird/android/model/constant/AreaKind;

.field public static final enum NO_RIDING:Lco/bird/android/model/constant/AreaKind;

.field public static final enum OPERATIONAL:Lco/bird/android/model/constant/AreaKind;

.field public static final enum PREFERRED_PARKING:Lco/bird/android/model/constant/AreaKind;

.field public static final enum REQUIRED_RELEASES:Lco/bird/android/model/constant/AreaKind;

.field public static final enum SLOW_SPEED:Lco/bird/android/model/constant/AreaKind;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/AreaKind;


# instance fields
.field private final areaName:Ljava/lang/String;

.field private final areaValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/AreaKind;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->OPERATIONAL:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->NO_PARKING:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->NO_RIDING:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->SLOW_SPEED:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->PREFERRED_PARKING:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->DEMAND_CELLS:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->FEE_MODIFIED:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->REQUIRED_RELEASES:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/AreaKind;->UNKNOWN:Lco/bird/android/model/constant/AreaKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x0

    const-string v2, "Operational"

    const-string v3, "OPERATIONAL"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->OPERATIONAL:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x1

    const-string v2, "No Parking"

    const-string v3, "NO_PARKING"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->NO_PARKING:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x2

    const-string v2, "No Riding"

    const-string v3, "NO_RIDING"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->NO_RIDING:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x3

    const-string v2, "Slow Speed"

    const-string v3, "SLOW_SPEED"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->SLOW_SPEED:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x4

    const-string v2, "Preferred Parking"

    const-string v3, "PREFERRED_PARKING"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->PREFERRED_PARKING:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x5

    const-string v2, "Revenue Map"

    const-string v3, "DEMAND_CELLS"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->DEMAND_CELLS:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x6

    const-string v2, "Fee Map"

    const-string v3, "FEE_MODIFIED"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->FEE_MODIFIED:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/4 v1, 0x7

    const-string v2, "Required Releases"

    const-string v3, "REQUIRED_RELEASES"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->REQUIRED_RELEASES:Lco/bird/android/model/constant/AreaKind;

    new-instance v0, Lco/bird/android/model/constant/AreaKind;

    const/16 v1, 0x8

    const-string v2, "Unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/constant/AreaKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->UNKNOWN:Lco/bird/android/model/constant/AreaKind;

    invoke-static {}, Lco/bird/android/model/constant/AreaKind;->$values()[Lco/bird/android/model/constant/AreaKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/AreaKind;->$VALUES:[Lco/bird/android/model/constant/AreaKind;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lco/bird/android/model/constant/AreaKind;->areaName:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/constant/AreaKind;->areaValue:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/AreaKind;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/AreaKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/AreaKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/AreaKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/AreaKind;->$VALUES:[Lco/bird/android/model/constant/AreaKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/AreaKind;

    return-object v0
.end method


# virtual methods
.method public final getAreaName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/AreaKind;->areaName:Ljava/lang/String;

    return-object v0
.end method

.method public final getAreaValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/constant/AreaKind;->areaValue:Ljava/lang/String;

    return-object v0
.end method
