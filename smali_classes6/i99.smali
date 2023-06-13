.class public final Li99;
.super LFe7;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.wallet.internal.IOwService"

    invoke-direct {p0, p1, v0}, LFe7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final e5(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Landroid/os/Bundle;LDh9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LFe7;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LMP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LMP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, LMP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xe

    invoke-virtual {p0, p1, v0}, LFe7;->d5(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final f5(Lcom/google/android/gms/wallet/PaymentDataRequest;Landroid/os/Bundle;LDh9;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, LFe7;->c5()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, LMP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, LMP7;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, LMP7;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0x13

    invoke-virtual {p0, p1, v0}, LFe7;->d5(ILandroid/os/Parcel;)V

    return-void
.end method
