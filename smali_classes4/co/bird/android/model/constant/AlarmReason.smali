.class public final enum Lco/bird/android/model/constant/AlarmReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/AlarmReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lco/bird/android/model/constant/AlarmReason;",
        "",
        "(Ljava/lang/String;I)V",
        "WHEEL_ROTATION",
        "LOCATION_CHANGE",
        "MANUAL",
        "INDOOR",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/AlarmReason;

.field public static final enum INDOOR:Lco/bird/android/model/constant/AlarmReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "indoor"
    .end annotation

    .annotation runtime Lft5;
        value = "indoor"
    .end annotation
.end field

.field public static final enum LOCATION_CHANGE:Lco/bird/android/model/constant/AlarmReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location_change"
    .end annotation

    .annotation runtime Lft5;
        value = "location_change"
    .end annotation
.end field

.field public static final enum MANUAL:Lco/bird/android/model/constant/AlarmReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "manual"
    .end annotation

    .annotation runtime Lft5;
        value = "manual"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/AlarmReason;

.field public static final enum WHEEL_ROTATION:Lco/bird/android/model/constant/AlarmReason;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "wheel_rotation"
    .end annotation

    .annotation runtime Lft5;
        value = "wheel_rotation"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/AlarmReason;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/constant/AlarmReason;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/AlarmReason;->WHEEL_ROTATION:Lco/bird/android/model/constant/AlarmReason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/AlarmReason;->LOCATION_CHANGE:Lco/bird/android/model/constant/AlarmReason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/AlarmReason;->MANUAL:Lco/bird/android/model/constant/AlarmReason;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/AlarmReason;->INDOOR:Lco/bird/android/model/constant/AlarmReason;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/AlarmReason;->UNKNOWN:Lco/bird/android/model/constant/AlarmReason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/AlarmReason;

    const-string v1, "WHEEL_ROTATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/AlarmReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/AlarmReason;->WHEEL_ROTATION:Lco/bird/android/model/constant/AlarmReason;

    new-instance v0, Lco/bird/android/model/constant/AlarmReason;

    const-string v1, "LOCATION_CHANGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/AlarmReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/AlarmReason;->LOCATION_CHANGE:Lco/bird/android/model/constant/AlarmReason;

    new-instance v0, Lco/bird/android/model/constant/AlarmReason;

    const-string v1, "MANUAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/AlarmReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/AlarmReason;->MANUAL:Lco/bird/android/model/constant/AlarmReason;

    new-instance v0, Lco/bird/android/model/constant/AlarmReason;

    const-string v1, "INDOOR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/AlarmReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/AlarmReason;->INDOOR:Lco/bird/android/model/constant/AlarmReason;

    new-instance v0, Lco/bird/android/model/constant/AlarmReason;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/AlarmReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/AlarmReason;->UNKNOWN:Lco/bird/android/model/constant/AlarmReason;

    invoke-static {}, Lco/bird/android/model/constant/AlarmReason;->$values()[Lco/bird/android/model/constant/AlarmReason;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/AlarmReason;->$VALUES:[Lco/bird/android/model/constant/AlarmReason;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/AlarmReason;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/AlarmReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/AlarmReason;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/AlarmReason;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/AlarmReason;->$VALUES:[Lco/bird/android/model/constant/AlarmReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/AlarmReason;

    return-object v0
.end method
