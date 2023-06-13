.class public final enum Lco/bird/api/request/ReservationPromoSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/api/request/ReservationPromoSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/api/request/ReservationPromoSource;",
        "",
        "(Ljava/lang/String;I)V",
        "BAD_SCAN",
        "CANCELLED_RIDE",
        "LOW_BATTERY",
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
.field private static final synthetic $VALUES:[Lco/bird/api/request/ReservationPromoSource;

.field public static final enum BAD_SCAN:Lco/bird/api/request/ReservationPromoSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bad_scan"
    .end annotation

    .annotation runtime Lft5;
        value = "bad_scan"
    .end annotation
.end field

.field public static final enum CANCELLED_RIDE:Lco/bird/api/request/ReservationPromoSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "cancelled_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "cancelled_ride"
    .end annotation
.end field

.field public static final enum LOW_BATTERY:Lco/bird/api/request/ReservationPromoSource;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "low_battery"
    .end annotation

    .annotation runtime Lft5;
        value = "low_battery"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/api/request/ReservationPromoSource;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/api/request/ReservationPromoSource;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/api/request/ReservationPromoSource;->BAD_SCAN:Lco/bird/api/request/ReservationPromoSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/api/request/ReservationPromoSource;->CANCELLED_RIDE:Lco/bird/api/request/ReservationPromoSource;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/api/request/ReservationPromoSource;->LOW_BATTERY:Lco/bird/api/request/ReservationPromoSource;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/api/request/ReservationPromoSource;

    const-string v1, "BAD_SCAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/ReservationPromoSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/ReservationPromoSource;->BAD_SCAN:Lco/bird/api/request/ReservationPromoSource;

    new-instance v0, Lco/bird/api/request/ReservationPromoSource;

    const-string v1, "CANCELLED_RIDE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/ReservationPromoSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/ReservationPromoSource;->CANCELLED_RIDE:Lco/bird/api/request/ReservationPromoSource;

    new-instance v0, Lco/bird/api/request/ReservationPromoSource;

    const-string v1, "LOW_BATTERY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/ReservationPromoSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/request/ReservationPromoSource;->LOW_BATTERY:Lco/bird/api/request/ReservationPromoSource;

    invoke-static {}, Lco/bird/api/request/ReservationPromoSource;->$values()[Lco/bird/api/request/ReservationPromoSource;

    move-result-object v0

    sput-object v0, Lco/bird/api/request/ReservationPromoSource;->$VALUES:[Lco/bird/api/request/ReservationPromoSource;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/api/request/ReservationPromoSource;
    .locals 1

    const-class v0, Lco/bird/api/request/ReservationPromoSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/api/request/ReservationPromoSource;

    return-object p0
.end method

.method public static values()[Lco/bird/api/request/ReservationPromoSource;
    .locals 1

    sget-object v0, Lco/bird/api/request/ReservationPromoSource;->$VALUES:[Lco/bird/api/request/ReservationPromoSource;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/api/request/ReservationPromoSource;

    return-object v0
.end method
