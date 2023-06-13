.class public final enum Lco/bird/api/response/OrderStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/api/response/OrderStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/api/response/OrderStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "REQUESTED",
        "PENDING",
        "SUBMITTED",
        "DELIVERED",
        "SHIPPED",
        "REJECTED",
        "FAILED",
        "CANCELED",
        "RETURNED",
        "FULFILLED",
        "COMPLETED",
        "co.bird.android.api"
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
.field private static final synthetic $VALUES:[Lco/bird/api/response/OrderStatus;

.field public static final enum CANCELED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "canceled"
    .end annotation

    .annotation runtime Lft5;
        value = "canceled"
    .end annotation
.end field

.field public static final enum COMPLETED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "completed"
    .end annotation

    .annotation runtime Lft5;
        value = "completed"
    .end annotation
.end field

.field public static final enum DELIVERED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delivered"
    .end annotation

    .annotation runtime Lft5;
        value = "delivered"
    .end annotation
.end field

.field public static final enum FAILED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "failed"
    .end annotation

    .annotation runtime Lft5;
        value = "failed"
    .end annotation
.end field

.field public static final enum FULFILLED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fulfilled"
    .end annotation

    .annotation runtime Lft5;
        value = "fulfilled"
    .end annotation
.end field

.field public static final enum PENDING:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pending"
    .end annotation

    .annotation runtime Lft5;
        value = "pending"
    .end annotation
.end field

.field public static final enum REJECTED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rejected"
    .end annotation

    .annotation runtime Lft5;
        value = "rejected"
    .end annotation
.end field

.field public static final enum REQUESTED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "requested"
    .end annotation

    .annotation runtime Lft5;
        value = "requested"
    .end annotation
.end field

.field public static final enum RETURNED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "returned"
    .end annotation

    .annotation runtime Lft5;
        value = "returned"
    .end annotation
.end field

.field public static final enum SHIPPED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "shipped"
    .end annotation

    .annotation runtime Lft5;
        value = "shipped"
    .end annotation
.end field

.field public static final enum SUBMITTED:Lco/bird/api/response/OrderStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "submitted"
    .end annotation

    .annotation runtime Lft5;
        value = "submitted"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/api/response/OrderStatus;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lco/bird/api/response/OrderStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/api/response/OrderStatus;->REQUESTED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/api/response/OrderStatus;->PENDING:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/api/response/OrderStatus;->SUBMITTED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/api/response/OrderStatus;->DELIVERED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/api/response/OrderStatus;->SHIPPED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/api/response/OrderStatus;->REJECTED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/api/response/OrderStatus;->FAILED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/api/response/OrderStatus;->CANCELED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/api/response/OrderStatus;->RETURNED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/api/response/OrderStatus;->FULFILLED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/api/response/OrderStatus;->COMPLETED:Lco/bird/api/response/OrderStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "REQUESTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->REQUESTED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "PENDING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->PENDING:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "SUBMITTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->SUBMITTED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "DELIVERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->DELIVERED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "SHIPPED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->SHIPPED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "REJECTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->REJECTED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "FAILED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->FAILED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "CANCELED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->CANCELED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "RETURNED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->RETURNED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "FULFILLED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->FULFILLED:Lco/bird/api/response/OrderStatus;

    new-instance v0, Lco/bird/api/response/OrderStatus;

    const-string v1, "COMPLETED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OrderStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OrderStatus;->COMPLETED:Lco/bird/api/response/OrderStatus;

    invoke-static {}, Lco/bird/api/response/OrderStatus;->$values()[Lco/bird/api/response/OrderStatus;

    move-result-object v0

    sput-object v0, Lco/bird/api/response/OrderStatus;->$VALUES:[Lco/bird/api/response/OrderStatus;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/api/response/OrderStatus;
    .locals 1

    const-class v0, Lco/bird/api/response/OrderStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/OrderStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/api/response/OrderStatus;
    .locals 1

    sget-object v0, Lco/bird/api/response/OrderStatus;->$VALUES:[Lco/bird/api/response/OrderStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/api/response/OrderStatus;

    return-object v0
.end method
