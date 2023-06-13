.class public final Lco/bird/android/model/persistence/ZoneData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J=\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ZoneData;",
        "",
        "zoneId",
        "",
        "overlay",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;",
        "annotation",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;",
        "selectability",
        "Lco/bird/android/model/constant/OperatorMapZoneSelectability;",
        "dataUpdatedAt",
        "Lorg/joda/time/DateTime;",
        "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)V",
        "getAnnotation",
        "()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;",
        "getDataUpdatedAt",
        "()Lorg/joda/time/DateTime;",
        "getOverlay",
        "()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;",
        "getSelectability",
        "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;",
        "getZoneId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "model-persistence_release"
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
.field private final annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

.field private final dataUpdatedAt:Lorg/joda/time/DateTime;

.field private final overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

.field private final selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

.field private final zoneId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectability"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataUpdatedAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    iput-object p3, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    iput-object p4, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    iput-object p5, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/ZoneData;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/persistence/ZoneData;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/persistence/ZoneData;->copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/ZoneData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object v0
.end method

.method public final component5()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/ZoneData;
    .locals 7

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectability"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataUpdatedAt"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/ZoneData;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/ZoneData;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/ZoneData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/ZoneData;

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    return-object v0
.end method

.method public final getDataUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getOverlay()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    return-object v0
.end method

.method public final getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneData;->zoneId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneData;->overlay:Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    iget-object v2, p0, Lco/bird/android/model/persistence/ZoneData;->annotation:Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    iget-object v3, p0, Lco/bird/android/model/persistence/ZoneData;->selectability:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    iget-object v4, p0, Lco/bird/android/model/persistence/ZoneData;->dataUpdatedAt:Lorg/joda/time/DateTime;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ZoneData(zoneId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", overlay="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", annotation="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectability="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dataUpdatedAt="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
