.class public final enum Lco/bird/android/model/FlightBannerNode$BannerPriority;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/FlightBannerNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BannerPriority"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/FlightBannerNode$BannerPriority;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/FlightBannerNode$BannerPriority;",
        "",
        "(Ljava/lang/String;I)V",
        "SYSTEM_BANNER",
        "USER_INTERACTION_IN_SELECTED_STATE_BANNER",
        "USER_INTERACTION_BANNER",
        "PERSISTENT_LOCATION_BASED_BANNER",
        "DISMISSABLE_BANNER",
        "PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER",
        "NON_LOCATION_PERSISTENT_BANNER",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum DISMISSABLE_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum NON_LOCATION_PERSISTENT_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum PERSISTENT_LOCATION_BASED_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum SYSTEM_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum UNKNOWN:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum USER_INTERACTION_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

.field public static final enum USER_INTERACTION_IN_SELECTED_STATE_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/FlightBannerNode$BannerPriority;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->SYSTEM_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->USER_INTERACTION_IN_SELECTED_STATE_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->USER_INTERACTION_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->PERSISTENT_LOCATION_BASED_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->DISMISSABLE_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->NON_LOCATION_PERSISTENT_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/FlightBannerNode$BannerPriority;->UNKNOWN:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "SYSTEM_BANNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->SYSTEM_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "USER_INTERACTION_IN_SELECTED_STATE_BANNER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->USER_INTERACTION_IN_SELECTED_STATE_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "USER_INTERACTION_BANNER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->USER_INTERACTION_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "PERSISTENT_LOCATION_BASED_BANNER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->PERSISTENT_LOCATION_BASED_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "DISMISSABLE_BANNER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->DISMISSABLE_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->PERSISTENT_EXPIRABLE_NON_LOCATION_BASED_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "NON_LOCATION_PERSISTENT_BANNER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->NON_LOCATION_PERSISTENT_BANNER:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    new-instance v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/FlightBannerNode$BannerPriority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->UNKNOWN:Lco/bird/android/model/FlightBannerNode$BannerPriority;

    invoke-static {}, Lco/bird/android/model/FlightBannerNode$BannerPriority;->$values()[Lco/bird/android/model/FlightBannerNode$BannerPriority;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->$VALUES:[Lco/bird/android/model/FlightBannerNode$BannerPriority;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/FlightBannerNode$BannerPriority;
    .locals 1

    const-class v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/FlightBannerNode$BannerPriority;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/FlightBannerNode$BannerPriority;
    .locals 1

    sget-object v0, Lco/bird/android/model/FlightBannerNode$BannerPriority;->$VALUES:[Lco/bird/android/model/FlightBannerNode$BannerPriority;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/FlightBannerNode$BannerPriority;

    return-object v0
.end method
