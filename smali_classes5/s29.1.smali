.class public abstract Ls29;
.super LRB7;
.source "SourceFile"

# interfaces
.implements LC29;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator"

    invoke-direct {p0, v0}, LRB7;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)LC29;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LC29;

    if-eqz v1, :cond_1

    check-cast v0, LC29;

    return-object v0

    :cond_1
    new-instance v0, Li29;

    invoke-direct {v0, p0}, Li29;-><init>(Landroid/os/IBinder;)V

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

    if-ne p1, p4, :cond_0

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LWO1$a;->c5(Landroid/os/IBinder;)LWO1;

    move-result-object p1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, v0}, LEP7;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;

    invoke-interface {p0, p1, p2}, LC29;->newFaceDetector(LWO1;Lcom/google/android/gms/internal/mlkit_vision_face_bundled/zzmh;)LY19;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, LEP7;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    return p4

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
