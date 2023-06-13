.class public final enum Lco/bird/android/model/identification/IdentificationStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/model/identification/IdentificationStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "canTreatAsSuccessful",
        "",
        "PENDING",
        "ACCEPTED",
        "REJECTED",
        "REQUIRED",
        "NOT_REQUIRED",
        "UNKNOWN",
        "Companion",
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
.field private static final synthetic $VALUES:[Lco/bird/android/model/identification/IdentificationStatus;

.field public static final enum ACCEPTED:Lco/bird/android/model/identification/IdentificationStatus;

.field public static final Companion:Lco/bird/android/model/identification/IdentificationStatus$Companion;

.field public static final enum NOT_REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

.field public static final enum PENDING:Lco/bird/android/model/identification/IdentificationStatus;

.field public static final enum REJECTED:Lco/bird/android/model/identification/IdentificationStatus;

.field public static final enum REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

.field public static final enum UNKNOWN:Lco/bird/android/model/identification/IdentificationStatus;


# direct methods
.method private static final synthetic $values()[Lco/bird/android/model/identification/IdentificationStatus;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lco/bird/android/model/identification/IdentificationStatus;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/model/identification/IdentificationStatus;->PENDING:Lco/bird/android/model/identification/IdentificationStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/model/identification/IdentificationStatus;->ACCEPTED:Lco/bird/android/model/identification/IdentificationStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lco/bird/android/model/identification/IdentificationStatus;->REJECTED:Lco/bird/android/model/identification/IdentificationStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lco/bird/android/model/identification/IdentificationStatus;->REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lco/bird/android/model/identification/IdentificationStatus;->NOT_REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lco/bird/android/model/identification/IdentificationStatus;->UNKNOWN:Lco/bird/android/model/identification/IdentificationStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->PENDING:Lco/bird/android/model/identification/IdentificationStatus;

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus;

    const-string v1, "ACCEPTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->ACCEPTED:Lco/bird/android/model/identification/IdentificationStatus;

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus;

    const-string v1, "REJECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->REJECTED:Lco/bird/android/model/identification/IdentificationStatus;

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus;

    const-string v1, "REQUIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus;

    const-string v1, "NOT_REQUIRED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->NOT_REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lco/bird/android/model/identification/IdentificationStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->UNKNOWN:Lco/bird/android/model/identification/IdentificationStatus;

    invoke-static {}, Lco/bird/android/model/identification/IdentificationStatus;->$values()[Lco/bird/android/model/identification/IdentificationStatus;

    move-result-object v0

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->$VALUES:[Lco/bird/android/model/identification/IdentificationStatus;

    new-instance v0, Lco/bird/android/model/identification/IdentificationStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/model/identification/IdentificationStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/model/identification/IdentificationStatus;->Companion:Lco/bird/android/model/identification/IdentificationStatus$Companion;

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

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationStatus;
    .locals 1

    const-class v0, Lco/bird/android/model/identification/IdentificationStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/identification/IdentificationStatus;

    return-object p0
.end method

.method public static values()[Lco/bird/android/model/identification/IdentificationStatus;
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationStatus;->$VALUES:[Lco/bird/android/model/identification/IdentificationStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/model/identification/IdentificationStatus;

    return-object v0
.end method


# virtual methods
.method public final canTreatAsSuccessful()Z
    .locals 1

    sget-object v0, Lco/bird/android/model/identification/IdentificationStatus;->ACCEPTED:Lco/bird/android/model/identification/IdentificationStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lco/bird/android/model/identification/IdentificationStatus;->NOT_REQUIRED:Lco/bird/android/model/identification/IdentificationStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lco/bird/android/model/identification/IdentificationStatus;->UNKNOWN:Lco/bird/android/model/identification/IdentificationStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
