.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    const-class v1, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result$Creator;->newArray(I)[Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;

    move-result-object p1

    return-object p1
.end method
