.class public final enum Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "VerificationSuccessful",
        "VerificationDenied",
        "VerificationNotPerformed",
        "VerificationAttempted",
        "ChallengeAdditionalAuth",
        "ChallengeDecoupledAuth",
        "VerificationRejected",
        "InformationOnly",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum ChallengeAdditionalAuth:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum ChallengeDecoupledAuth:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final Companion:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;

.field public static final enum InformationOnly:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum VerificationAttempted:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum VerificationDenied:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum VerificationNotPerformed:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum VerificationRejected:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

.field public static final enum VerificationSuccessful:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationSuccessful:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationDenied:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationNotPerformed:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationAttempted:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->ChallengeAdditionalAuth:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->ChallengeDecoupledAuth:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationRejected:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->InformationOnly:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x0

    const-string v2, "Y"

    const-string v3, "VerificationSuccessful"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationSuccessful:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x1

    const-string v2, "N"

    const-string v3, "VerificationDenied"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationDenied:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x2

    const-string v2, "U"

    const-string v3, "VerificationNotPerformed"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationNotPerformed:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x3

    const-string v2, "A"

    const-string v3, "VerificationAttempted"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationAttempted:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x4

    const-string v2, "C"

    const-string v3, "ChallengeAdditionalAuth"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->ChallengeAdditionalAuth:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x5

    const-string v2, "D"

    const-string v3, "ChallengeDecoupledAuth"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->ChallengeDecoupledAuth:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x6

    const-string v2, "R"

    const-string v3, "VerificationRejected"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->VerificationRejected:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    const/4 v1, 0x7

    const-string v2, "I"

    const-string v3, "InformationOnly"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->InformationOnly:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->$values()[Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->$VALUES:[Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->Companion:Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->$VALUES:[Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;->code:Ljava/lang/String;

    return-object v0
.end method
