.class public final Lco/bird/android/model/wire/WireFleetReportBarChartLine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFleetReportBarChartLine;",
        "",
        "value",
        "",
        "color",
        "Lco/bird/android/model/wire/WireThemedColors;",
        "fillDirection",
        "Lco/bird/android/model/constant/TargetDirection;",
        "(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;)V",
        "getColor",
        "()Lco/bird/android/model/wire/WireThemedColors;",
        "getFillDirection",
        "()Lco/bird/android/model/constant/TargetDirection;",
        "getValue",
        "()D",
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
.field private final color:Lco/bird/android/model/wire/WireThemedColors;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "color"
    .end annotation

    .annotation runtime Lft5;
        value = "color"
    .end annotation
.end field

.field private final fillDirection:Lco/bird/android/model/constant/TargetDirection;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fill_direction"
    .end annotation

    .annotation runtime Lft5;
        value = "fill_direction"
    .end annotation
.end field

.field private final value:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "value"
    .end annotation

    .annotation runtime Lft5;
        value = "value"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/wire/WireFleetReportBarChartLine;-><init>(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;)V
    .locals 1

    const-string v0, "color"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    iput-object p3, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    iput-object p4, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    return-void
.end method

.method public synthetic constructor <init>(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    new-instance p3, Lco/bird/android/model/wire/WireThemedColors;

    const/4 p6, 0x3

    const/4 v1, 0x0

    invoke-direct {p3, v1, v1, p6, v0}, Lco/bird/android/model/wire/WireThemedColors;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireFleetReportBarChartLine;-><init>(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireFleetReportBarChartLine;DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;ILjava/lang/Object;)Lco/bird/android/model/wire/WireFleetReportBarChartLine;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->copy(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;)Lco/bird/android/model/wire/WireFleetReportBarChartLine;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    return-wide v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/constant/TargetDirection;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    return-object v0
.end method

.method public final copy(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;)Lco/bird/android/model/wire/WireFleetReportBarChartLine;
    .locals 1

    const-string v0, "color"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireFleetReportBarChartLine;-><init>(DLco/bird/android/model/wire/WireThemedColors;Lco/bird/android/model/constant/TargetDirection;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireFleetReportBarChartLine;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireFleetReportBarChartLine;

    iget-wide v3, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    iget-wide v5, p1, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    iget-object p1, p1, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getColor()Lco/bird/android/model/wire/WireThemedColors;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    return-object v0
.end method

.method public final getFillDirection()Lco/bird/android/model/constant/TargetDirection;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    return-object v0
.end method

.method public final getValue()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireThemedColors;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->value:D

    iget-object v2, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->color:Lco/bird/android/model/wire/WireThemedColors;

    iget-object v3, p0, Lco/bird/android/model/wire/WireFleetReportBarChartLine;->fillDirection:Lco/bird/android/model/constant/TargetDirection;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WireFleetReportBarChartLine(value="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillDirection="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
