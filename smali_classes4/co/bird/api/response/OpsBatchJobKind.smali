.class public final enum Lco/bird/api/response/OpsBatchJobKind;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/api/response/OpsBatchJobKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/api/response/OpsBatchJobKind;",
        "",
        "(Ljava/lang/String;I)V",
        "ASSIGN_BATCH_TO_PARTNER",
        "BIRD_BULK_ACTION",
        "BULK_SCANNER",
        "CREATE_BATCH_OF_BIRDS",
        "CREATE_INCENTIVES",
        "CREATE_NESTS",
        "INVALID",
        "OPS_ONBOARD_LEAD_EXPORT",
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
.field private static final synthetic $VALUES:[Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum ASSIGN_BATCH_TO_PARTNER:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum BIRD_BULK_ACTION:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum BULK_SCANNER:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum CREATE_BATCH_OF_BIRDS:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum CREATE_INCENTIVES:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum CREATE_NESTS:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum INVALID:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum OPS_ONBOARD_LEAD_EXPORT:Lco/bird/api/response/OpsBatchJobKind;

.field public static final enum UNKNOWN:Lco/bird/api/response/OpsBatchJobKind;


# direct methods
.method private static final synthetic $values()[Lco/bird/api/response/OpsBatchJobKind;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Lco/bird/api/response/OpsBatchJobKind;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->ASSIGN_BATCH_TO_PARTNER:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->BIRD_BULK_ACTION:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->BULK_SCANNER:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->CREATE_BATCH_OF_BIRDS:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->CREATE_INCENTIVES:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->CREATE_NESTS:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->INVALID:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->OPS_ONBOARD_LEAD_EXPORT:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lco/bird/api/response/OpsBatchJobKind;->UNKNOWN:Lco/bird/api/response/OpsBatchJobKind;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "ASSIGN_BATCH_TO_PARTNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->ASSIGN_BATCH_TO_PARTNER:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "BIRD_BULK_ACTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->BIRD_BULK_ACTION:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "BULK_SCANNER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->BULK_SCANNER:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "CREATE_BATCH_OF_BIRDS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->CREATE_BATCH_OF_BIRDS:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "CREATE_INCENTIVES"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->CREATE_INCENTIVES:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "CREATE_NESTS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->CREATE_NESTS:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "INVALID"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->INVALID:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "OPS_ONBOARD_LEAD_EXPORT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->OPS_ONBOARD_LEAD_EXPORT:Lco/bird/api/response/OpsBatchJobKind;

    new-instance v0, Lco/bird/api/response/OpsBatchJobKind;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lco/bird/api/response/OpsBatchJobKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->UNKNOWN:Lco/bird/api/response/OpsBatchJobKind;

    invoke-static {}, Lco/bird/api/response/OpsBatchJobKind;->$values()[Lco/bird/api/response/OpsBatchJobKind;

    move-result-object v0

    sput-object v0, Lco/bird/api/response/OpsBatchJobKind;->$VALUES:[Lco/bird/api/response/OpsBatchJobKind;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/api/response/OpsBatchJobKind;
    .locals 1

    const-class v0, Lco/bird/api/response/OpsBatchJobKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/api/response/OpsBatchJobKind;

    return-object p0
.end method

.method public static values()[Lco/bird/api/response/OpsBatchJobKind;
    .locals 1

    sget-object v0, Lco/bird/api/response/OpsBatchJobKind;->$VALUES:[Lco/bird/api/response/OpsBatchJobKind;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/api/response/OpsBatchJobKind;

    return-object v0
.end method
