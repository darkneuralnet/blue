.class public final enum Lco/bird/android/model/constant/TripStopStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/constant/TripStopStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/model/constant/TripStopStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "isComplete",
        "",
        "isCurrent",
        "UNVISITED",
        "NEXT",
        "IN_PROGRESS",
        "SKIPPED",
        "WORK_DONE",
        "COMPLETED",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum COMPLETED:Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum IN_PROGRESS:Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum NEXT:Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum SKIPPED:Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum UNKNOWN:Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum UNVISITED:Lco/bird/android/model/constant/TripStopStatus;

.field public static final enum WORK_DONE:Lco/bird/android/model/constant/TripStopStatus;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/constant/TripStopStatus;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lco/bird/android/model/constant/TripStopStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->UNVISITED:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->NEXT:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->IN_PROGRESS:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->SKIPPED:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->WORK_DONE:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->COMPLETED:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->UNKNOWN:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "UNVISITED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->UNVISITED:Lco/bird/android/model/constant/TripStopStatus;

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "NEXT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->NEXT:Lco/bird/android/model/constant/TripStopStatus;

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "IN_PROGRESS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->IN_PROGRESS:Lco/bird/android/model/constant/TripStopStatus;

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "SKIPPED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->SKIPPED:Lco/bird/android/model/constant/TripStopStatus;

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "WORK_DONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->WORK_DONE:Lco/bird/android/model/constant/TripStopStatus;

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "COMPLETED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->COMPLETED:Lco/bird/android/model/constant/TripStopStatus;

    new-instance v0, Lco/bird/android/model/constant/TripStopStatus;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/constant/TripStopStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->UNKNOWN:Lco/bird/android/model/constant/TripStopStatus;

    invoke-static {}, Lco/bird/android/model/constant/TripStopStatus;->$values()[Lco/bird/android/model/constant/TripStopStatus;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/constant/TripStopStatus;->$VALUES:[Lco/bird/android/model/constant/TripStopStatus;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/TripStopStatus;
    .locals 1

    const-class v0, Lco/bird/android/model/constant/TripStopStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/constant/TripStopStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/constant/TripStopStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/constant/TripStopStatus;->$VALUES:[Lco/bird/android/model/constant/TripStopStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/constant/TripStopStatus;

    return-object v0
.end method


# virtual methods
.method public final isComplete()Z
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/constant/TripStopStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->COMPLETED:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->SKIPPED:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->WORK_DONE:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isCurrent()Z
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lco/bird/android/model/constant/TripStopStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->NEXT:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->IN_PROGRESS:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/constant/TripStopStatus;->WORK_DONE:Lco/bird/android/model/constant/TripStopStatus;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
