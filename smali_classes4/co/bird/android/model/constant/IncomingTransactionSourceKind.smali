.class public final enum Lco/bird/android/model/constant/IncomingTransactionSourceKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/IncomingTransactionSourceKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000e\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/constant/IncomingTransactionSourceKind;",
        "",
        "(Ljava/lang/String;I)V",
        "RIDE",
        "DELIVERY",
        "SUPPORT",
        "DIRECT_CHARGE",
        "BALANCE_TRANSFER",
        "AUTO_PAY_INCENTIVE",
        "AUTO_PAY_REFILL",
        "MONTHLY_RENTAL_SUBSCRIPTION",
        "MERCHANT",
        "LEASE_DELINQUENT_FEE",
        "LEASE_INITIAL_CHARGE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum AUTO_PAY_INCENTIVE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum AUTO_PAY_REFILL:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum BALANCE_TRANSFER:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum DELIVERY:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum DIRECT_CHARGE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum LEASE_DELINQUENT_FEE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum LEASE_INITIAL_CHARGE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum MERCHANT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum MONTHLY_RENTAL_SUBSCRIPTION:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum RIDE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum SUPPORT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/IncomingTransactionSourceKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/IncomingTransactionSourceKind;
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->RIDE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->DELIVERY:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->SUPPORT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->DIRECT_CHARGE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->BALANCE_TRANSFER:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->AUTO_PAY_INCENTIVE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->AUTO_PAY_REFILL:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->MONTHLY_RENTAL_SUBSCRIPTION:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->MERCHANT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->LEASE_DELINQUENT_FEE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->LEASE_INITIAL_CHARGE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->UNKNOWN:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "RIDE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->RIDE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "DELIVERY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->DELIVERY:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "SUPPORT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->SUPPORT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "DIRECT_CHARGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->DIRECT_CHARGE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "BALANCE_TRANSFER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->BALANCE_TRANSFER:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "AUTO_PAY_INCENTIVE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->AUTO_PAY_INCENTIVE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "AUTO_PAY_REFILL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->AUTO_PAY_REFILL:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "MONTHLY_RENTAL_SUBSCRIPTION"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->MONTHLY_RENTAL_SUBSCRIPTION:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "MERCHANT"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->MERCHANT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "LEASE_DELINQUENT_FEE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->LEASE_DELINQUENT_FEE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "LEASE_INITIAL_CHARGE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->LEASE_INITIAL_CHARGE:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    new-instance v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->UNKNOWN:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    invoke-static {}, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->$values()[Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->$VALUES:[Lco/bird/android/model/constant/IncomingTransactionSourceKind;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/IncomingTransactionSourceKind;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/IncomingTransactionSourceKind;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->$VALUES:[Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    return-object v0
.end method
