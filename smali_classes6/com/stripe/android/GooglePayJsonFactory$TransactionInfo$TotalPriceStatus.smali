.class public final enum Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TotalPriceStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode$payments_core_release",
        "()Ljava/lang/String;",
        "NotCurrentlyKnown",
        "Estimated",
        "Final",
        "payments-core_release"
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

.field public static final enum Estimated:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

.field public static final enum Final:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

.field public static final enum NotCurrentlyKnown:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->NotCurrentlyKnown:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Estimated:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Final:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    const/4 v1, 0x0

    const-string v2, "NOT_CURRENTLY_KNOWN"

    const-string v3, "NotCurrentlyKnown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->NotCurrentlyKnown:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    const/4 v1, 0x1

    const-string v2, "ESTIMATED"

    const-string v3, "Estimated"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Estimated:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    new-instance v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    const/4 v1, 0x2

    const-string v2, "FINAL"

    const-string v3, "Final"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->Final:Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    invoke-static {}, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->$values()[Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->$VALUES:[Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

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

    iput-object p3, p0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;
    .locals 1

    const-class v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;
    .locals 1

    sget-object v0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->$VALUES:[Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;

    return-object v0
.end method


# virtual methods
.method public final getCode$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;->code:Ljava/lang/String;

    return-object v0
.end method
