.class public final enum Lcom/stripe/android/model/StripeIntent$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/StripeIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/StripeIntent$Status$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "toString",
        "Canceled",
        "Processing",
        "RequiresAction",
        "RequiresConfirmation",
        "RequiresPaymentMethod",
        "Succeeded",
        "RequiresCapture",
        "Companion",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/model/StripeIntent$Status;

.field public static final enum Canceled:Lcom/stripe/android/model/StripeIntent$Status;

.field public static final Companion:Lcom/stripe/android/model/StripeIntent$Status$Companion;

.field public static final enum Processing:Lcom/stripe/android/model/StripeIntent$Status;

.field public static final enum RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

.field public static final enum RequiresCapture:Lcom/stripe/android/model/StripeIntent$Status;

.field public static final enum RequiresConfirmation:Lcom/stripe/android/model/StripeIntent$Status;

.field public static final enum RequiresPaymentMethod:Lcom/stripe/android/model/StripeIntent$Status;

.field public static final enum Succeeded:Lcom/stripe/android/model/StripeIntent$Status;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/StripeIntent$Status;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->Canceled:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->RequiresConfirmation:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->RequiresPaymentMethod:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->Succeeded:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->RequiresCapture:Lcom/stripe/android/model/StripeIntent$Status;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x0

    const-string v2, "canceled"

    const-string v3, "Canceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->Canceled:Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x1

    const-string v2, "processing"

    const-string v3, "Processing"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x2

    const-string v2, "requires_action"

    const-string v3, "RequiresAction"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x3

    const-string v2, "requires_confirmation"

    const-string v3, "RequiresConfirmation"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->RequiresConfirmation:Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x4

    const-string v2, "requires_payment_method"

    const-string v3, "RequiresPaymentMethod"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->RequiresPaymentMethod:Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x5

    const-string v2, "succeeded"

    const-string v3, "Succeeded"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->Succeeded:Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status;

    const/4 v1, 0x6

    const-string v2, "requires_capture"

    const-string v3, "RequiresCapture"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$Status;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->RequiresCapture:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-static {}, Lcom/stripe/android/model/StripeIntent$Status;->$values()[Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->$VALUES:[Lcom/stripe/android/model/StripeIntent$Status;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$Status$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/StripeIntent$Status$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$Status;->Companion:Lcom/stripe/android/model/StripeIntent$Status$Companion;

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

    iput-object p3, p0, Lcom/stripe/android/model/StripeIntent$Status;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;
    .locals 1

    const-class v0, Lcom/stripe/android/model/StripeIntent$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/StripeIntent$Status;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/StripeIntent$Status;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Status;->$VALUES:[Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/StripeIntent$Status;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$Status;->code:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$Status;->code:Ljava/lang/String;

    return-object v0
.end method
