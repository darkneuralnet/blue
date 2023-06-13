.class public final LUn9;
.super Lye7;
.source "SourceFile"

# interfaces
.implements Leo9;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator"

    invoke-direct {p0, p1, v0}, Lye7;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final t3(LWO1;LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsi;)Ljo9;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lye7;->c5()Landroid/os/Parcel;

    move-result-object p2

    invoke-static {p2, p1}, LHP7;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x0

    invoke-static {p2, p1}, LHP7;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {p2, p3}, LHP7;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p3, 0x1

    invoke-virtual {p0, p3, p2}, Lye7;->d5(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p2

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "com.google.mlkit.vision.text.aidls.ITextRecognizer"

    invoke-interface {p3, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    instance-of v0, p1, Ljo9;

    if-eqz v0, :cond_1

    check-cast p1, Ljo9;

    goto :goto_0

    :cond_1
    new-instance p1, Ljo9;

    invoke-direct {p1, p3}, Ljo9;-><init>(Landroid/os/IBinder;)V

    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    return-object p1
.end method
