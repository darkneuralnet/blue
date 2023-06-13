.class public final enum Lco/bird/android/model/constant/ConfigurableTutorialContext;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
        "",
        "(Ljava/lang/String;I)V",
        "CABLE_LOCK",
        "CABLE_UNLOCK",
        "HELMET_LOCK",
        "HELMET_UNLOCK",
        "RIDER_ONBOARDING",
        "RIDE_START",
        "RIDE_END",
        "AR_NEST_SETUP",
        "GOOGLE_AR_PARKING_RESOLUTION",
        "QUIZ",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum AR_NEST_SETUP:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum CABLE_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum CABLE_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum GOOGLE_AR_PARKING_RESOLUTION:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum HELMET_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum HELMET_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum QUIZ:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum RIDER_ONBOARDING:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum RIDE_END:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum RIDE_START:Lco/bird/android/model/constant/ConfigurableTutorialContext;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/ConfigurableTutorialContext;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/ConfigurableTutorialContext;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->CABLE_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->CABLE_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->HELMET_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->HELMET_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDER_ONBOARDING:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDE_START:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDE_END:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->AR_NEST_SETUP:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->GOOGLE_AR_PARKING_RESOLUTION:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->QUIZ:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lco/bird/android/model/constant/ConfigurableTutorialContext;->UNKNOWN:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "CABLE_LOCK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->CABLE_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "CABLE_UNLOCK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->CABLE_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "HELMET_LOCK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->HELMET_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "HELMET_UNLOCK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->HELMET_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "RIDER_ONBOARDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDER_ONBOARDING:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "RIDE_START"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDE_START:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "RIDE_END"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDE_END:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "AR_NEST_SETUP"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->AR_NEST_SETUP:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "GOOGLE_AR_PARKING_RESOLUTION"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->GOOGLE_AR_PARKING_RESOLUTION:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "QUIZ"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->QUIZ:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    new-instance v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    const-string v1, "UNKNOWN"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/ConfigurableTutorialContext;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->UNKNOWN:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    invoke-static {}, Lco/bird/android/model/constant/ConfigurableTutorialContext;->$values()[Lco/bird/android/model/constant/ConfigurableTutorialContext;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->$VALUES:[Lco/bird/android/model/constant/ConfigurableTutorialContext;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ConfigurableTutorialContext;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/ConfigurableTutorialContext;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/ConfigurableTutorialContext;->$VALUES:[Lco/bird/android/model/constant/ConfigurableTutorialContext;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object v0
.end method
