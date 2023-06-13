.class public final enum Lco/bird/api/response/OpsBatchJobActionKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lco/bird/api/response/OpsBatchJobActionKind;",
        "",
        "(Ljava/lang/String;I)V",
        "CHIRP",
        "MARK_DAMAGED",
        "MARK_FIXED",
        "WAKE_BLUETOOTH",
        "ADD_TO_BATCH",
        "UNKNOWN",
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
.field private static final synthetic $VALUES:[Lco/bird/api/response/OpsBatchJobActionKind;

.field public static final enum ADD_TO_BATCH:Lco/bird/api/response/OpsBatchJobActionKind;

.field public static final enum CHIRP:Lco/bird/api/response/OpsBatchJobActionKind;

.field public static final enum MARK_DAMAGED:Lco/bird/api/response/OpsBatchJobActionKind;

.field public static final enum MARK_FIXED:Lco/bird/api/response/OpsBatchJobActionKind;

.field public static final enum UNKNOWN:Lco/bird/api/response/OpsBatchJobActionKind;

.field public static final enum WAKE_BLUETOOTH:Lco/bird/api/response/OpsBatchJobActionKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/api/response/OpsBatchJobActionKind;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lco/bird/api/response/OpsBatchJobActionKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->CHIRP:Lco/bird/api/response/OpsBatchJobActionKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->MARK_DAMAGED:Lco/bird/api/response/OpsBatchJobActionKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->MARK_FIXED:Lco/bird/api/response/OpsBatchJobActionKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->WAKE_BLUETOOTH:Lco/bird/api/response/OpsBatchJobActionKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->ADD_TO_BATCH:Lco/bird/api/response/OpsBatchJobActionKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/api/response/OpsBatchJobActionKind;->UNKNOWN:Lco/bird/api/response/OpsBatchJobActionKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/api/response/OpsBatchJobActionKind;

    const-string v1, "CHIRP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobActionKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->CHIRP:Lco/bird/api/response/OpsBatchJobActionKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobActionKind;

    const-string v1, "MARK_DAMAGED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobActionKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->MARK_DAMAGED:Lco/bird/api/response/OpsBatchJobActionKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobActionKind;

    const-string v1, "MARK_FIXED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobActionKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->MARK_FIXED:Lco/bird/api/response/OpsBatchJobActionKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobActionKind;

    const-string v1, "WAKE_BLUETOOTH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobActionKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->WAKE_BLUETOOTH:Lco/bird/api/response/OpsBatchJobActionKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobActionKind;

    const-string v1, "ADD_TO_BATCH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobActionKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->ADD_TO_BATCH:Lco/bird/api/response/OpsBatchJobActionKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobActionKind;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobActionKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->UNKNOWN:Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-static {}, Lco/bird/api/response/OpsBatchJobActionKind;->$values()[Lco/bird/api/response/OpsBatchJobActionKind;

    move-result-object v0

    sput-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->$VALUES:[Lco/bird/api/response/OpsBatchJobActionKind;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/api/response/OpsBatchJobActionKind;
    .locals 1

    const-class v0, Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/OpsBatchJobActionKind;

    return-object p0
.end method

.method public static values()[Lco/bird/api/response/OpsBatchJobActionKind;
    .locals 1

    sget-object v0, Lco/bird/api/response/OpsBatchJobActionKind;->$VALUES:[Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/api/response/OpsBatchJobActionKind;

    return-object v0
.end method
