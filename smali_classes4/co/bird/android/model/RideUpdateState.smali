.class public final enum Lco/bird/android/model/RideUpdateState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/RideUpdateState$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/RideUpdateState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lco/bird/android/model/RideUpdateState;",
        "",
        "(Ljava/lang/String;I)V",
        "toPhaseString",
        "",
        "RIDE_REQUIREMENTS",
        "STARTING",
        "LOCKING",
        "ENDING",
        "NONE",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/RideUpdateState;

.field public static final enum ENDING:Lco/bird/android/model/RideUpdateState;

.field public static final enum LOCKING:Lco/bird/android/model/RideUpdateState;

.field public static final enum NONE:Lco/bird/android/model/RideUpdateState;

.field public static final enum RIDE_REQUIREMENTS:Lco/bird/android/model/RideUpdateState;

.field public static final enum STARTING:Lco/bird/android/model/RideUpdateState;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/RideUpdateState;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lco/bird/android/model/RideUpdateState;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/RideUpdateState;->RIDE_REQUIREMENTS:Lco/bird/android/model/RideUpdateState;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/RideUpdateState;->STARTING:Lco/bird/android/model/RideUpdateState;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/RideUpdateState;->LOCKING:Lco/bird/android/model/RideUpdateState;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/RideUpdateState;->ENDING:Lco/bird/android/model/RideUpdateState;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/RideUpdateState;->NONE:Lco/bird/android/model/RideUpdateState;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/RideUpdateState;

    const-string v1, "RIDE_REQUIREMENTS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/RideUpdateState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/RideUpdateState;->RIDE_REQUIREMENTS:Lco/bird/android/model/RideUpdateState;

    new-instance v0, Lco/bird/android/model/RideUpdateState;

    const-string v1, "STARTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/RideUpdateState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/RideUpdateState;->STARTING:Lco/bird/android/model/RideUpdateState;

    new-instance v0, Lco/bird/android/model/RideUpdateState;

    const-string v1, "LOCKING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/RideUpdateState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/RideUpdateState;->LOCKING:Lco/bird/android/model/RideUpdateState;

    new-instance v0, Lco/bird/android/model/RideUpdateState;

    const-string v1, "ENDING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/RideUpdateState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/RideUpdateState;->ENDING:Lco/bird/android/model/RideUpdateState;

    new-instance v0, Lco/bird/android/model/RideUpdateState;

    const-string v1, "NONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/RideUpdateState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/RideUpdateState;->NONE:Lco/bird/android/model/RideUpdateState;

    invoke-static {}, Lco/bird/android/model/RideUpdateState;->$values()[Lco/bird/android/model/RideUpdateState;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/RideUpdateState;->$VALUES:[Lco/bird/android/model/RideUpdateState;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/RideUpdateState;
    .locals 1

    const-class v0, Lco/bird/android/model/RideUpdateState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/RideUpdateState;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/RideUpdateState;
    .locals 1

    sget-object v0, Lco/bird/android/model/RideUpdateState;->$VALUES:[Lco/bird/android/model/RideUpdateState;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/RideUpdateState;

    return-object v0
.end method


# virtual methods
.method public final toPhaseString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lco/bird/android/model/RideUpdateState$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const-string v0, "unknown"

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const-string v0, "ride_end"

    goto :goto_0

    :cond_2
    const-string v0, "mid_ride"

    goto :goto_0

    :cond_3
    const-string v0, "ride_start"

    goto :goto_0

    :cond_4
    const-string v0, "ride_requirements"

    :goto_0
    return-object v0
.end method
