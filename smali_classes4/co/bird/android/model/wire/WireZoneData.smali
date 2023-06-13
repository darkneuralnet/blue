.class public final Lco/bird/android/model/wire/WireZoneData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireZoneData;",
        "",
        "zoneId",
        "",
        "overlay",
        "Lco/bird/android/model/wire/WireZoneOverlay;",
        "annotation",
        "Lco/bird/android/model/wire/WireZoneAnnotation;",
        "selectability",
        "Lco/bird/android/model/constant/OperatorMapZoneSelectability;",
        "(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V",
        "getAnnotation",
        "()Lco/bird/android/model/wire/WireZoneAnnotation;",
        "getOverlay",
        "()Lco/bird/android/model/wire/WireZoneOverlay;",
        "getSelectability",
        "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;",
        "getZoneId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final annotation:Lco/bird/android/model/wire/WireZoneAnnotation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "annotation"
    .end annotation

    .annotation runtime Lft5;
        value = "annotation"
    .end annotation
.end field

.field private final overlay:Lco/bird/android/model/wire/WireZoneOverlay;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "overlay"
    .end annotation

    .annotation runtime Lft5;
        value = "overlay"
    .end annotation
.end field

.field private final selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "selectability"
    .end annotation

    .annotation runtime Lft5;
        value = "selectability"
    .end annotation
.end field

.field private final zoneId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zone_id"
    .end annotation

    .annotation runtime Lft5;
        value = "zone_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/wire/WireZoneData;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectability"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    iput-object p3, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    iput-object p4, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    new-instance p2, Lco/bird/android/model/wire/WireZoneOverlay;

    const/4 p6, 0x3

    invoke-direct {p2, v0, v0, p6, v0}, Lco/bird/android/model/wire/WireZoneOverlay;-><init>(Lco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/wire/WireThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    sget-object p4, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->UNKNOWN:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireZoneData;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireZoneData;Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;ILjava/lang/Object;)Lco/bird/android/model/wire/WireZoneData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireZoneData;->copy(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Lco/bird/android/model/wire/WireZoneData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireZoneOverlay;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireZoneAnnotation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Lco/bird/android/model/wire/WireZoneData;
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectability"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireZoneData;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireZoneData;-><init>(Ljava/lang/String;Lco/bird/android/model/wire/WireZoneOverlay;Lco/bird/android/model/wire/WireZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireZoneData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireZoneData;

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    iget-object v3, p1, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    iget-object v3, p1, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    iget-object p1, p1, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAnnotation()Lco/bird/android/model/wire/WireZoneAnnotation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    return-object v0
.end method

.method public final getOverlay()Lco/bird/android/model/wire/WireZoneOverlay;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    return-object v0
.end method

.method public final getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireZoneOverlay;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireZoneAnnotation;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneData;->zoneId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneData;->overlay:Lco/bird/android/model/wire/WireZoneOverlay;

    iget-object v2, p0, Lco/bird/android/model/wire/WireZoneData;->annotation:Lco/bird/android/model/wire/WireZoneAnnotation;

    iget-object v3, p0, Lco/bird/android/model/wire/WireZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WireZoneData(zoneId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", overlay="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", annotation="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectability="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
