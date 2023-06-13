.class public abstract LR77;
.super LlY6;
.source "SourceFile"

# interfaces
.implements LS77;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"

    invoke-direct {p0, v0}, LlY6;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)LS77;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LS77;

    if-eqz v1, :cond_1

    check-cast v0, LS77;

    return-object v0

    :cond_1
    new-instance v0, LQ77;

    invoke-direct {v0, p0}, LQ77;-><init>(Landroid/os/IBinder;)V

    return-object v0
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

    if-eq p1, p4, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LWO1$a;->c5(Landroid/os/IBinder;)LWO1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v0}, LqZ6;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;

    invoke-static {p2}, LqZ6;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, v0}, LS77;->newTextRecognizerWithOptions(LWO1;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zboo;)LP77;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, LqZ6;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LWO1$a;->c5(Landroid/os/IBinder;)LWO1;

    move-result-object p1

    invoke-static {p2}, LqZ6;->b(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, LS77;->newTextRecognizer(LWO1;)LP77;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, LqZ6;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    :goto_0
    return p4
.end method
