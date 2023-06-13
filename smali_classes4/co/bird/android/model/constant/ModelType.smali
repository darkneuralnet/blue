.class public final enum Lco/bird/android/model/constant/ModelType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/ModelType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/android/model/constant/ModelType;",
        "",
        "(Ljava/lang/String;I)V",
        "SCOOTER",
        "CRUISER",
        "MINI_CRUISER",
        "MOTO",
        "BIKE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/ModelType;

.field public static final enum BIKE:Lco/bird/android/model/constant/ModelType;

.field public static final enum CRUISER:Lco/bird/android/model/constant/ModelType;

.field public static final enum MINI_CRUISER:Lco/bird/android/model/constant/ModelType;

.field public static final enum MOTO:Lco/bird/android/model/constant/ModelType;

.field public static final enum SCOOTER:Lco/bird/android/model/constant/ModelType;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/ModelType;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/ModelType;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lco/bird/android/model/constant/ModelType;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/ModelType;->SCOOTER:Lco/bird/android/model/constant/ModelType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/ModelType;->CRUISER:Lco/bird/android/model/constant/ModelType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/ModelType;->MINI_CRUISER:Lco/bird/android/model/constant/ModelType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/ModelType;->MOTO:Lco/bird/android/model/constant/ModelType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/ModelType;->BIKE:Lco/bird/android/model/constant/ModelType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/ModelType;->UNKNOWN:Lco/bird/android/model/constant/ModelType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/ModelType;

    const-string v1, "SCOOTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ModelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ModelType;->SCOOTER:Lco/bird/android/model/constant/ModelType;

    new-instance v0, Lco/bird/android/model/constant/ModelType;

    const-string v1, "CRUISER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ModelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ModelType;->CRUISER:Lco/bird/android/model/constant/ModelType;

    new-instance v0, Lco/bird/android/model/constant/ModelType;

    const-string v1, "MINI_CRUISER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ModelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ModelType;->MINI_CRUISER:Lco/bird/android/model/constant/ModelType;

    new-instance v0, Lco/bird/android/model/constant/ModelType;

    const-string v1, "MOTO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ModelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ModelType;->MOTO:Lco/bird/android/model/constant/ModelType;

    new-instance v0, Lco/bird/android/model/constant/ModelType;

    const-string v1, "BIKE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ModelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ModelType;->BIKE:Lco/bird/android/model/constant/ModelType;

    new-instance v0, Lco/bird/android/model/constant/ModelType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ModelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ModelType;->UNKNOWN:Lco/bird/android/model/constant/ModelType;

    invoke-static {}, Lco/bird/android/model/constant/ModelType;->$values()[Lco/bird/android/model/constant/ModelType;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ModelType;->$VALUES:[Lco/bird/android/model/constant/ModelType;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ModelType;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/ModelType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/ModelType;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/ModelType;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ModelType;->$VALUES:[Lco/bird/android/model/constant/ModelType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/ModelType;

    return-object v0
.end method
