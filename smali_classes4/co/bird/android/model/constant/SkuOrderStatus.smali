.class public final enum Lco/bird/android/model/constant/SkuOrderStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/SkuOrderStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/model/constant/SkuOrderStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "isClosed",
        "",
        "()Z",
        "CANCELED",
        "IN_TRANSIT",
        "PENDING",
        "PROCESSED",
        "PROCESSED_WITH_OSD",
        "READY_FOR_PICKUP",
        "READY_FOR_PROCESSING",
        "RETURN_TO_SENDER",
        "CHECKED_IN",
        "COMPLETED",
        "RECEIVED",
        "RECEIVED_WITH_OSD",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum CANCELED:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum CHECKED_IN:Lco/bird/android/model/constant/SkuOrderStatus;
    .annotation runtime Lkotlin/Deprecated;
        message = "Deleted"
    .end annotation
.end field

.field public static final enum COMPLETED:Lco/bird/android/model/constant/SkuOrderStatus;
    .annotation runtime Lkotlin/Deprecated;
        message = "Deleted"
    .end annotation
.end field

.field public static final enum IN_TRANSIT:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum PENDING:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum PROCESSED:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum PROCESSED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum READY_FOR_PICKUP:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum READY_FOR_PROCESSING:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum RECEIVED:Lco/bird/android/model/constant/SkuOrderStatus;
    .annotation runtime Lkotlin/Deprecated;
        message = "Deleted"
    .end annotation
.end field

.field public static final enum RECEIVED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;
    .annotation runtime Lkotlin/Deprecated;
        message = "Deleted"
    .end annotation
.end field

.field public static final enum RETURN_TO_SENDER:Lco/bird/android/model/constant/SkuOrderStatus;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/SkuOrderStatus;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/SkuOrderStatus;
    .locals 3

    const/16 v0, 0xd

    new-array v0, v0, [Lco/bird/android/model/constant/SkuOrderStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->CANCELED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->IN_TRANSIT:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->PENDING:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PICKUP:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PROCESSING:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->RETURN_TO_SENDER:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->CHECKED_IN:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->COMPLETED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->UNKNOWN:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "CANCELED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->CANCELED:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "IN_TRANSIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->IN_TRANSIT:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "PENDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->PENDING:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "PROCESSED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "PROCESSED_WITH_OSD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "READY_FOR_PICKUP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PICKUP:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "READY_FOR_PROCESSING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->READY_FOR_PROCESSING:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "RETURN_TO_SENDER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->RETURN_TO_SENDER:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "CHECKED_IN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->CHECKED_IN:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "COMPLETED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->COMPLETED:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "RECEIVED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "RECEIVED_WITH_OSD"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->RECEIVED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    new-instance v0, Lco/bird/android/model/constant/SkuOrderStatus;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/SkuOrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->UNKNOWN:Lco/bird/android/model/constant/SkuOrderStatus;

    invoke-static {}, Lco/bird/android/model/constant/SkuOrderStatus;->$values()[Lco/bird/android/model/constant/SkuOrderStatus;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->$VALUES:[Lco/bird/android/model/constant/SkuOrderStatus;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/SkuOrderStatus;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/SkuOrderStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/SkuOrderStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/SkuOrderStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/SkuOrderStatus;->$VALUES:[Lco/bird/android/model/constant/SkuOrderStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/SkuOrderStatus;

    return-object v0
.end method


# virtual methods
.method public final isClosed()Z
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/bird/android/model/constant/SkuOrderStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->COMPLETED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->CANCELED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/SkuOrderStatus;->PROCESSED_WITH_OSD:Lco/bird/android/model/constant/SkuOrderStatus;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
