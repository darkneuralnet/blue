.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;
    .locals 3

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/stripe/android/model/ShippingInformation;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lcom/stripe/android/model/ShippingInformation;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData$Creator;->newArray(I)[Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;

    move-result-object p1

    return-object p1
.end method