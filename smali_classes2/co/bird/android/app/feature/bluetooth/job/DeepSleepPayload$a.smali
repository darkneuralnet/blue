.class public final Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;",
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
.method public final a(Landroid/os/Parcel;)Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    const-class v1, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, v1, p1}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;-><init>(Lco/bird/android/model/wire/WireBird;Z)V

    return-object v0
.end method

.method public final b(I)[Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;
    .locals 0

    new-array p1, p1, [Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload$a;->a(Landroid/os/Parcel;)Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload$a;->b(I)[Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    move-result-object p1

    return-object p1
.end method
