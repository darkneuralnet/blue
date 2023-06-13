.class public final Lco/bird/android/core/base/viewmodel/UnmarkDamaged$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/core/base/viewmodel/UnmarkDamaged;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lco/bird/android/core/base/viewmodel/UnmarkDamaged;",
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
.method public final a(Landroid/os/Parcel;)Lco/bird/android/core/base/viewmodel/UnmarkDamaged;
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/constant/BirdModel;->valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;

    move-result-object p1

    invoke-direct {v0, p1}, Lco/bird/android/core/base/viewmodel/UnmarkDamaged;-><init>(Lco/bird/android/model/constant/BirdModel;)V

    return-object v0
.end method

.method public final b(I)[Lco/bird/android/core/base/viewmodel/UnmarkDamaged;
    .locals 0

    new-array p1, p1, [Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/core/base/viewmodel/UnmarkDamaged$a;->a(Landroid/os/Parcel;)Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/core/base/viewmodel/UnmarkDamaged$a;->b(I)[Lco/bird/android/core/base/viewmodel/UnmarkDamaged;

    move-result-object p1

    return-object p1
.end method
