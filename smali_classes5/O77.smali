.class public abstract LO77;
.super LlY6;
.source "SourceFile"

# interfaces
.implements LP77;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.mlkit.vision.text.aidls.ITextRecognizer"

    invoke-direct {p0, v0}, LlY6;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c5(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 p4, 0x1

    if-eq p1, p4, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LWO1$a;->c5(Landroid/os/IBinder;)LWO1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v0}, LqZ6;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;

    invoke-static {p2}, LqZ6;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, v0}, LP77;->y(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)[Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbf;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1, p4}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LWO1$a;->c5(Landroid/os/IBinder;)LWO1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v0}, LqZ6;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;

    invoke-static {p2}, LqZ6;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, v0}, LP77;->b0(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p4}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p1, p3, p4}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, LP77;->zbd()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_0

    :cond_3
    invoke-interface {p0}, LP77;->zbc()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    :goto_0
    return p4
.end method
