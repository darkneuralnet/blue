.class public final Lco/bird/android/model/wire/WireFleetListComplication;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFleetListComplication;",
        "",
        "kind",
        "Lco/bird/android/model/constant/ComplicationKind;",
        "batteryComplication",
        "Lco/bird/android/model/wire/WireBatteryComplication;",
        "iconComplication",
        "Lco/bird/android/model/wire/WireIconComplication;",
        "(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)V",
        "getBatteryComplication",
        "()Lco/bird/android/model/wire/WireBatteryComplication;",
        "getIconComplication",
        "()Lco/bird/android/model/wire/WireIconComplication;",
        "getKind",
        "()Lco/bird/android/model/constant/ComplicationKind;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "model-wire_release"
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
.field private final batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "battery_complication"
    .end annotation

    .annotation runtime Lft5;
        value = "battery_complication"
    .end annotation
.end field

.field private final iconComplication:Lco/bird/android/model/wire/WireIconComplication;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "icon_complication"
    .end annotation

    .annotation runtime Lft5;
        value = "icon_complication"
    .end annotation
.end field

.field private final kind:Lco/bird/android/model/constant/ComplicationKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireFleetListComplication;-><init>(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    iput-object p2, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    iput-object p3, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lco/bird/android/model/constant/ComplicationKind;->UNKNOWN:Lco/bird/android/model/constant/ComplicationKind;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireFleetListComplication;-><init>(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireFleetListComplication;Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;ILjava/lang/Object;)Lco/bird/android/model/wire/WireFleetListComplication;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireFleetListComplication;->copy(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)Lco/bird/android/model/wire/WireFleetListComplication;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/ComplicationKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireBatteryComplication;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireIconComplication;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)Lco/bird/android/model/wire/WireFleetListComplication;
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireFleetListComplication;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/WireFleetListComplication;-><init>(Lco/bird/android/model/constant/ComplicationKind;Lco/bird/android/model/wire/WireBatteryComplication;Lco/bird/android/model/wire/WireIconComplication;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireFleetListComplication;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireFleetListComplication;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    iget-object p1, p1, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBatteryComplication()Lco/bird/android/model/wire/WireBatteryComplication;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    return-object v0
.end method

.method public final getIconComplication()Lco/bird/android/model/wire/WireIconComplication;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    return-object v0
.end method

.method public final getKind()Lco/bird/android/model/constant/ComplicationKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBatteryComplication;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireIconComplication;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetListComplication;->kind:Lco/bird/android/model/constant/ComplicationKind;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetListComplication;->batteryComplication:Lco/bird/android/model/wire/WireBatteryComplication;

    iget-object v2, p0, Lco/bird/android/model/wire/WireFleetListComplication;->iconComplication:Lco/bird/android/model/wire/WireIconComplication;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireFleetListComplication(kind="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", batteryComplication="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconComplication="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
