.class public final enum Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CancelReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "UserSelected",
        "Reserved",
        "TransactionTimedOutDecoupled",
        "TransactionTimedOutOther",
        "TransactionTimedOutFirstCreq",
        "TransactionError",
        "Unknown",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum Reserved:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum TransactionError:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum TransactionTimedOutDecoupled:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum TransactionTimedOutFirstCreq:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum TransactionTimedOutOther:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum Unknown:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

.field public static final enum UserSelected:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->UserSelected:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->Reserved:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionTimedOutDecoupled:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionTimedOutOther:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionTimedOutFirstCreq:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionError:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->Unknown:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x0

    const-string v2, "01"

    const-string v3, "UserSelected"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->UserSelected:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x1

    const-string v2, "02"

    const-string v3, "Reserved"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->Reserved:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x2

    const-string v2, "03"

    const-string v3, "TransactionTimedOutDecoupled"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionTimedOutDecoupled:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x3

    const-string v2, "04"

    const-string v3, "TransactionTimedOutOther"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionTimedOutOther:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x4

    const-string v2, "05"

    const-string v3, "TransactionTimedOutFirstCreq"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionTimedOutFirstCreq:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x5

    const-string v2, "06"

    const-string v3, "TransactionError"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->TransactionError:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    const/4 v1, 0x6

    const-string v2, "07"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->Unknown:Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->$values()[Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->$VALUES:[Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

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

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->$VALUES:[Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;->code:Ljava/lang/String;

    return-object v0
.end method
