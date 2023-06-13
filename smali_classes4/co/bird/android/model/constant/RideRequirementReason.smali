.class public final enum Lco/bird/android/model/constant/RideRequirementReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/RideRequirementReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/constant/RideRequirementReason;",
        "",
        "(Ljava/lang/String;I)V",
        "RESERVATION",
        "SCAN",
        "RIDE",
        "ONBOARDING_BANNER",
        "BIRD_AGNOSTIC",
        "ONE_OFF",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum BIRD_AGNOSTIC:Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum ONBOARDING_BANNER:Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum ONE_OFF:Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum RESERVATION:Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum RIDE:Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum SCAN:Lco/bird/android/model/constant/RideRequirementReason;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/RideRequirementReason;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/RideRequirementReason;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/constant/RideRequirementReason;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->RESERVATION:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->SCAN:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->RIDE:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->ONBOARDING_BANNER:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->BIRD_AGNOSTIC:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->ONE_OFF:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->UNKNOWN:Lco/bird/android/model/constant/RideRequirementReason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "RESERVATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->RESERVATION:Lco/bird/android/model/constant/RideRequirementReason;

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "SCAN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->SCAN:Lco/bird/android/model/constant/RideRequirementReason;

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "RIDE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->RIDE:Lco/bird/android/model/constant/RideRequirementReason;

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "ONBOARDING_BANNER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->ONBOARDING_BANNER:Lco/bird/android/model/constant/RideRequirementReason;

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "BIRD_AGNOSTIC"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->BIRD_AGNOSTIC:Lco/bird/android/model/constant/RideRequirementReason;

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "ONE_OFF"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->ONE_OFF:Lco/bird/android/model/constant/RideRequirementReason;

    new-instance v0, Lco/bird/android/model/constant/RideRequirementReason;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/RideRequirementReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->UNKNOWN:Lco/bird/android/model/constant/RideRequirementReason;

    invoke-static {}, Lco/bird/android/model/constant/RideRequirementReason;->$values()[Lco/bird/android/model/constant/RideRequirementReason;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/RideRequirementReason;->$VALUES:[Lco/bird/android/model/constant/RideRequirementReason;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/RideRequirementReason;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/RideRequirementReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/RideRequirementReason;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/RideRequirementReason;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/RideRequirementReason;->$VALUES:[Lco/bird/android/model/constant/RideRequirementReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/RideRequirementReason;

    return-object v0
.end method
