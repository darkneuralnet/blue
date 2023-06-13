.class public final Lk66;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J)\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lk66;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "a",
        "Landroid/bluetooth/BluetoothDevice;",
        "b",
        "bird",
        "bluetoothDevice",
        "",
        "forRide",
        "c",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Lco/bird/android/model/wire/WireBird;",
        "d",
        "()Lco/bird/android/model/wire/WireBird;",
        "Landroid/bluetooth/BluetoothDevice;",
        "e",
        "()Landroid/bluetooth/BluetoothDevice;",
        "Z",
        "f",
        "()Z",
        "<init>",
        "(Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;Z)V",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/wire/WireBird;

.field public final b:Landroid/bluetooth/BluetoothDevice;

.field public final c:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    iput-boolean p3, p0, Lk66;->c:Z

    return-void
.end method

.method public static synthetic copy$default(Lk66;Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;ZILjava/lang/Object;)Lk66;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lk66;->c:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lk66;->c(Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;Z)Lk66;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final b()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public final c(Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;Z)Lk66;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk66;

    invoke-direct {v0, p1, p2, p3}, Lk66;-><init>(Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;Z)V

    return-object v0
.end method

.method public final d()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final e()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk66;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lk66;

    iget-object v1, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p1, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lk66;->c:Z

    iget-boolean p1, p1, Lk66;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lk66;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lk66;->c:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lk66;->a:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lk66;->b:Landroid/bluetooth/BluetoothDevice;

    iget-boolean v2, p0, Lk66;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TrackedBird(bird="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bluetoothDevice="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", forRide="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
