.class public final Lam5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\'\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lam5;",
        "",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "scanItem",
        "",
        "force",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "vehicleAcceptanceOptions",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "c",
        "()Lco/bird/android/model/wire/WireSkuScanItem;",
        "b",
        "Z",
        "()Z",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "d",
        "()Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "<init>",
        "(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/wire/WireSkuScanItem;

.field public final b:Z

.field public final c:Lco/bird/api/response/TransferOrderVehicleViewResponse;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)V
    .locals 1

    const-string v0, "scanItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicleAcceptanceOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    iput-boolean p2, p0, Lam5;->b:Z

    iput-object p3, p0, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    return-void
.end method

.method public static synthetic copy$default(Lam5;Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;ILjava/lang/Object;)Lam5;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lam5;->b:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lam5;->a(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)Lam5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)Lam5;
    .locals 1

    const-string v0, "scanItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vehicleAcceptanceOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lam5;

    invoke-direct {v0, p1, p2, p3}, Lam5;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)V

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lam5;->b:Z

    return v0
.end method

.method public final c()Lco/bird/android/model/wire/WireSkuScanItem;
    .locals 1

    iget-object v0, p0, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    return-object v0
.end method

.method public final d()Lco/bird/api/response/TransferOrderVehicleViewResponse;
    .locals 1

    iget-object v0, p0, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lam5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lam5;

    iget-object v1, p0, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    iget-object v3, p1, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lam5;->b:Z

    iget-boolean v3, p1, Lam5;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    iget-object p1, p1, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScanItem;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lam5;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    invoke-virtual {v1}, Lco/bird/api/response/TransferOrderVehicleViewResponse;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lam5;->a:Lco/bird/android/model/wire/WireSkuScanItem;

    iget-boolean v1, p0, Lam5;->b:Z

    iget-object v2, p0, Lam5;->c:Lco/bird/api/response/TransferOrderVehicleViewResponse;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ScannedItem(scanItem="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", force="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", vehicleAcceptanceOptions="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
