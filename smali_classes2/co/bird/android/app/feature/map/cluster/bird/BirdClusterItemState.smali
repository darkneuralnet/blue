.class public final enum Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;",
        "",
        "(Ljava/lang/String;I)V",
        "inRide",
        "",
        "getInRide",
        "()Z",
        "AVAILABLE",
        "SELECTED",
        "ACTIVE_RIDE",
        "ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA",
        "ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA",
        "ACTIVE_RIDE_IN_NO_PARK_AREA",
        "ACTIVE_RIDE_IN_NO_RIDE_AREA",
        "ACTIVE_RIDE_IN_SLOW_AREA",
        "ACTIVE_RIDE_IN_WARNING_RED_AREA",
        "ACTIVE_RIDE_IN_WARNING_YELLOW_AREA",
        "ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST",
        "ACTIVE_RIDE_NEAR_PARKING_NEST",
        "ACTIVE_RIDE_IN_FULL_NEST",
        "co.bird.android.feature.map"
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
.field private static final synthetic $VALUES:[Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_FULL_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_NO_PARK_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_NO_RIDE_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_SLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_WARNING_RED_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_IN_WARNING_YELLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum ACTIVE_RIDE_NEAR_PARKING_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

.field public static final enum SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;
    .locals 3

    const/16 v0, 0xd

    new-array v0, v0, [Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_PARK_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_RIDE_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_SLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_WARNING_RED_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_WARNING_YELLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_NEAR_PARKING_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_FULL_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "AVAILABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "SELECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_NO_PARK_AREA"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_PARK_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_NO_RIDE_AREA"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_NO_RIDE_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_SLOW_AREA"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_SLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_WARNING_RED_AREA"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_WARNING_RED_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_WARNING_YELLOW_AREA"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_WARNING_YELLOW_AREA:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_NEAR_PARKING_NEST"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_NEAR_PARKING_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    new-instance v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    const-string v1, "ACTIVE_RIDE_IN_FULL_NEST"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->ACTIVE_RIDE_IN_FULL_NEST:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-static {}, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->$values()[Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->$VALUES:[Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;
    .locals 1

    const-class v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    return-object p0
.end method

.method public static values()[Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->$VALUES:[Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    return-object v0
.end method


# virtual methods
.method public final getInRide()Z
    .locals 3

    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
