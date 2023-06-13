.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;
.super Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payment"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0008\u001a\u00020\tX\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;",
        "amount",
        "",
        "currency",
        "",
        "setupFutureUse",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;",
        "captureMethod",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
        "(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)V",
        "getAmount",
        "()J",
        "getCaptureMethod$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
        "getCurrency",
        "()Ljava/lang/String;",
        "getSetupFutureUse$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "paymentsheet_release"
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final amount:J

.field private final captureMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

.field private final currency:Ljava/lang/String;

.field private final setupFutureUse:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureMethod"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-wide p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->amount:J

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->currency:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->setupFutureUse:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->captureMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    sget-object p5, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;->Automatic:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;-><init>(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getAmount()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->amount:J

    return-wide v0
.end method

.method public getCaptureMethod$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->captureMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getSetupFutureUse$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->setupFutureUse:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "out"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->amount:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->currency:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->setupFutureUse:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->captureMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
