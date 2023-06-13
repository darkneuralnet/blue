.class public final enum Lco/bird/android/model/constant/BirdTaskKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/BirdTaskKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0012\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/constant/BirdTaskKind;",
        "",
        "(Ljava/lang/String;I)V",
        "CHARGE",
        "DAMAGED_CHARGE",
        "REBALANCE",
        "DAMAGED_TRANSPORT",
        "BOUNTY",
        "REPAIR",
        "TRANSPORT",
        "ACCIDENT",
        "MARKET_SHIPMENT",
        "OPERATOR_TRANSPORT",
        "REBALANCE_FOR_CHARGE",
        "OPERATOR_REBALANCE_FOR_TRANSPORT",
        "CAPTIVE_RECOVERY",
        "ULM",
        "PRIVATE_PROPERTY",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum ACCIDENT:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum BOUNTY:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum CAPTIVE_RECOVERY:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum DAMAGED_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum DAMAGED_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum MARKET_SHIPMENT:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum OPERATOR_REBALANCE_FOR_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum OPERATOR_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum PRIVATE_PROPERTY:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum REBALANCE:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum REBALANCE_FOR_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum REPAIR:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum ULM:Lco/bird/android/model/constant/BirdTaskKind;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/BirdTaskKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/BirdTaskKind;
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [Lco/bird/android/model/constant/BirdTaskKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->DAMAGED_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->REBALANCE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->DAMAGED_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->BOUNTY:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->REPAIR:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->ACCIDENT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->MARKET_SHIPMENT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->OPERATOR_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->REBALANCE_FOR_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->OPERATOR_REBALANCE_FOR_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->CAPTIVE_RECOVERY:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->ULM:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->PRIVATE_PROPERTY:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lco/bird/android/model/constant/BirdTaskKind;->UNKNOWN:Lco/bird/android/model/constant/BirdTaskKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "CHARGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "DAMAGED_CHARGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->DAMAGED_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "REBALANCE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->REBALANCE:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "DAMAGED_TRANSPORT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->DAMAGED_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "BOUNTY"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->BOUNTY:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "REPAIR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->REPAIR:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "TRANSPORT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "ACCIDENT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->ACCIDENT:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "MARKET_SHIPMENT"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->MARKET_SHIPMENT:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "OPERATOR_TRANSPORT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->OPERATOR_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "REBALANCE_FOR_CHARGE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->REBALANCE_FOR_CHARGE:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "OPERATOR_REBALANCE_FOR_TRANSPORT"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->OPERATOR_REBALANCE_FOR_TRANSPORT:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "CAPTIVE_RECOVERY"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->CAPTIVE_RECOVERY:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "ULM"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->ULM:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "PRIVATE_PROPERTY"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->PRIVATE_PROPERTY:Lco/bird/android/model/constant/BirdTaskKind;

    new-instance v0, Lco/bird/android/model/constant/BirdTaskKind;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/BirdTaskKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->UNKNOWN:Lco/bird/android/model/constant/BirdTaskKind;

    invoke-static {}, Lco/bird/android/model/constant/BirdTaskKind;->$values()[Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/BirdTaskKind;->$VALUES:[Lco/bird/android/model/constant/BirdTaskKind;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/BirdTaskKind;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/BirdTaskKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/BirdTaskKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/BirdTaskKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/BirdTaskKind;->$VALUES:[Lco/bird/android/model/constant/BirdTaskKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/BirdTaskKind;

    return-object v0
.end method
