.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Creator;->newArray(I)[Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;

    move-result-object p1

    return-object p1
.end method
