.class public final enum Lco/bird/android/model/constant/ScrapRequestReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/ScrapRequestReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/constant/ScrapRequestReason;",
        "",
        "(Ljava/lang/String;I)V",
        "SUBMERGED",
        "THERMAL_EVENT",
        "GRAFFITI",
        "CHASSIS_DAMAGE",
        "MISSING_BATTERY",
        "OTHER",
        "UNKNOWN",
        "model_release"
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum CHASSIS_DAMAGE:Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum GRAFFITI:Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum MISSING_BATTERY:Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum OTHER:Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum SUBMERGED:Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum THERMAL_EVENT:Lco/bird/android/model/constant/ScrapRequestReason;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/ScrapRequestReason;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/ScrapRequestReason;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/constant/ScrapRequestReason;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->SUBMERGED:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->THERMAL_EVENT:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->GRAFFITI:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->CHASSIS_DAMAGE:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->MISSING_BATTERY:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->OTHER:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/ScrapRequestReason;->UNKNOWN:Lco/bird/android/model/constant/ScrapRequestReason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "SUBMERGED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->SUBMERGED:Lco/bird/android/model/constant/ScrapRequestReason;

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "THERMAL_EVENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->THERMAL_EVENT:Lco/bird/android/model/constant/ScrapRequestReason;

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "GRAFFITI"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->GRAFFITI:Lco/bird/android/model/constant/ScrapRequestReason;

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "CHASSIS_DAMAGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->CHASSIS_DAMAGE:Lco/bird/android/model/constant/ScrapRequestReason;

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "MISSING_BATTERY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->MISSING_BATTERY:Lco/bird/android/model/constant/ScrapRequestReason;

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "OTHER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->OTHER:Lco/bird/android/model/constant/ScrapRequestReason;

    new-instance v0, Lco/bird/android/model/constant/ScrapRequestReason;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ScrapRequestReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->UNKNOWN:Lco/bird/android/model/constant/ScrapRequestReason;

    invoke-static {}, Lco/bird/android/model/constant/ScrapRequestReason;->$values()[Lco/bird/android/model/constant/ScrapRequestReason;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->$VALUES:[Lco/bird/android/model/constant/ScrapRequestReason;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ScrapRequestReason;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/ScrapRequestReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/ScrapRequestReason;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/ScrapRequestReason;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ScrapRequestReason;->$VALUES:[Lco/bird/android/model/constant/ScrapRequestReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/ScrapRequestReason;

    return-object v0
.end method
