.class public final enum Lco/bird/android/model/constant/TransferOrderDemandSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/TransferOrderDemandSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/constant/TransferOrderDemandSource;",
        "",
        "(Ljava/lang/String;I)V",
        "toString",
        "",
        "BIRD_ALLOCATION",
        "FM_DROP_OFF",
        "FM_DROP_OFF_3PL",
        "FM_LONGTAIL_DELIVERY",
        "FM_LONGTAIL_DELIVERY_3PL",
        "FM_LONGTAIL_RETURN",
        "FM_LONGTAIL_RETURN_3PL",
        "FM_PICK_UP",
        "FM_PICK_UP_3PL",
        "FM_TO_FM",
        "FROM_3PL_DELIVERY",
        "MANUFACTURER_DELIVERY",
        "SCRAP_REMOVAL",
        "SC_TO_3PL",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum BIRD_ALLOCATION:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_DROP_OFF_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_LONGTAIL_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_LONGTAIL_DELIVERY_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_LONGTAIL_RETURN:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_LONGTAIL_RETURN_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_PICK_UP_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FM_TO_FM:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum FROM_3PL_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum MANUFACTURER_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum SCRAP_REMOVAL:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum SC_TO_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/TransferOrderDemandSource;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/TransferOrderDemandSource;
    .locals 3

    const/16 v0, 0xf

    new-array v0, v0, [Lco/bird/android/model/constant/TransferOrderDemandSource;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->BIRD_ALLOCATION:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_DELIVERY_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_RETURN:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_RETURN_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_TO_FM:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->FROM_3PL_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->MANUFACTURER_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->SCRAP_REMOVAL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->SC_TO_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lco/bird/android/model/constant/TransferOrderDemandSource;->UNKNOWN:Lco/bird/android/model/constant/TransferOrderDemandSource;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "BIRD_ALLOCATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->BIRD_ALLOCATION:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_DROP_OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_DROP_OFF_3PL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_LONGTAIL_DELIVERY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_LONGTAIL_DELIVERY_3PL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_DELIVERY_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_LONGTAIL_RETURN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_RETURN:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_LONGTAIL_RETURN_3PL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_LONGTAIL_RETURN_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_PICK_UP"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_PICK_UP_3PL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FM_TO_FM"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_TO_FM:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "FROM_3PL_DELIVERY"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->FROM_3PL_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "MANUFACTURER_DELIVERY"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->MANUFACTURER_DELIVERY:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "SCRAP_REMOVAL"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->SCRAP_REMOVAL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "SC_TO_3PL"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->SC_TO_3PL:Lco/bird/android/model/constant/TransferOrderDemandSource;

    new-instance v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TransferOrderDemandSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->UNKNOWN:Lco/bird/android/model/constant/TransferOrderDemandSource;

    invoke-static {}, Lco/bird/android/model/constant/TransferOrderDemandSource;->$values()[Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->$VALUES:[Lco/bird/android/model/constant/TransferOrderDemandSource;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/TransferOrderDemandSource;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/TransferOrderDemandSource;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/TransferOrderDemandSource;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/TransferOrderDemandSource;->$VALUES:[Lco/bird/android/model/constant/TransferOrderDemandSource;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/TransferOrderDemandSource;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
