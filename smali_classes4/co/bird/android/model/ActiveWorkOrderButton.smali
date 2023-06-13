.class public final Lco/bird/android/model/ActiveWorkOrderButton;
.super Lco/bird/android/model/CommandCenterButton;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/model/ActiveWorkOrderButton;",
        "Lco/bird/android/model/CommandCenterButton;",
        "text",
        "",
        "bird",
        "Lco/bird/android/model/wire/WireBird;",
        "workOrder",
        "Lco/bird/android/model/WorkOrder;",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V",
        "getBird",
        "()Lco/bird/android/model/wire/WireBird;",
        "getText",
        "()Ljava/lang/String;",
        "getWorkOrder",
        "()Lco/bird/android/model/WorkOrder;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bird:Lco/bird/android/model/wire/WireBird;

.field private final text:Ljava/lang/String;

.field private final workOrder:Lco/bird/android/model/WorkOrder;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workOrder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/model/CommandCenterButton;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/ActiveWorkOrderButton;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;ILjava/lang/Object;)Lco/bird/android/model/ActiveWorkOrderButton;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/ActiveWorkOrderButton;->copy(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)Lco/bird/android/model/ActiveWorkOrderButton;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/WorkOrder;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)Lco/bird/android/model/ActiveWorkOrderButton;
    .locals 1

    const-string v0, "bird"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workOrder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/ActiveWorkOrderButton;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/ActiveWorkOrderButton;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/ActiveWorkOrderButton;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/ActiveWorkOrderButton;

    iget-object v1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    iget-object p1, p1, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getBird()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkOrder()Lco/bird/android/model/WorkOrder;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    invoke-virtual {v1}, Lco/bird/android/model/WorkOrder;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/ActiveWorkOrderButton;->text:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/ActiveWorkOrderButton;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v2, p0, Lco/bird/android/model/ActiveWorkOrderButton;->workOrder:Lco/bird/android/model/WorkOrder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ActiveWorkOrderButton(text="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bird="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", workOrder="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
