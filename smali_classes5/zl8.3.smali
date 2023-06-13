.class public final Lzl8;
.super LOm8;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LOm8;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nearby/zzfz;
    .locals 1

    invoke-super {p0, p1}, LOm8;->a(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nearby/zzfz;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/nearby/zzfz;->u(Lcom/google/android/gms/internal/nearby/zzfz;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/nearby/zzfz;->u(Lcom/google/android/gms/internal/nearby/zzfz;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/nearby/zzfz;->s(Landroid/os/ParcelFileDescriptor;)[B

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/nearby/zzfz;->v(Lcom/google/android/gms/internal/nearby/zzfz;[B)[B

    :cond_0
    return-object p1
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LOm8;->a(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nearby/zzfz;

    move-result-object p1

    return-object p1
.end method
