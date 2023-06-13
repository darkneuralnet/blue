.class public final Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/coreinterface/core/job/Payload;
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010\u0007\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;",
        "Lco/bird/android/coreinterface/core/job/Payload;",
        "Landroid/os/Parcelable;",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "",
        "enabled",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "b",
        "Lco/bird/android/model/wire/WireBird;",
        "()Lco/bird/android/model/wire/WireBird;",
        "c",
        "Z",
        "()Z",
        "<init>",
        "(Lco/bird/android/model/wire/WireBird;Z)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lco/bird/android/model/wire/WireBird;

.field public final c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload$a;

    invoke-direct {v0}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload$a;-><init>()V

    sput-object v0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Z)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    iput-boolean p2, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;Lco/bird/android/model/wire/WireBird;ZILjava/lang/Object;)Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->a(Lco/bird/android/model/wire/WireBird;Z)Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;Z)Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    invoke-direct {v0, p1, p2}, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;-><init>(Lco/bird/android/model/wire/WireBird;Z)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;

    iget-object v1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    iget-boolean p1, p1, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    iget-boolean v1, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeepSleepPayload(bird="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->b:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Lco/bird/android/app/feature/bluetooth/job/DeepSleepPayload;->c:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
