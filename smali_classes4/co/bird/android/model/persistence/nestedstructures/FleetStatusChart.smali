.class public final Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;",
        "",
        "title",
        "",
        "fromDegrees",
        "",
        "fillStrategy",
        "Lco/bird/android/model/constant/ChartFillStrategy;",
        "sections",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;",
        "(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)V",
        "getFillStrategy",
        "()Lco/bird/android/model/constant/ChartFillStrategy;",
        "getFromDegrees",
        "()I",
        "getSections",
        "()Ljava/util/List;",
        "getTitle",
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
.field private final fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fill_strategy"
    .end annotation

    .annotation runtime Lft5;
        value = "fill_strategy"
    .end annotation
.end field

.field private final fromDegrees:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "from_degrees"
    .end annotation

    .annotation runtime Lft5;
        value = "from_degrees"
    .end annotation
.end field

.field private final sections:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "sections"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "sections"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .annotation runtime Lft5;
        value = "title"
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

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lco/bird/android/model/constant/ChartFillStrategy;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fillStrategy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    iput p2, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    iput-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    iput-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    sget-object p3, Lco/bird/android/model/constant/ChartFillStrategy;->FILL_CLOCKWISE:Lco/bird/android/model/constant/ChartFillStrategy;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p4

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->copy(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    return v0
.end method

.method public final component3()Lco/bird/android/model/constant/ChartFillStrategy;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lco/bird/android/model/constant/ChartFillStrategy;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;",
            ">;)",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fillStrategy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;-><init>(Ljava/lang/String;ILco/bird/android/model/constant/ChartFillStrategy;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    iget v3, p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFillStrategy()Lco/bird/android/model/constant/ChartFillStrategy;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    return-object v0
.end method

.method public final getFromDegrees()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    return v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChartSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->title:Ljava/lang/String;

    iget v1, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fromDegrees:I

    iget-object v2, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->fillStrategy:Lco/bird/android/model/constant/ChartFillStrategy;

    iget-object v3, p0, Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;->sections:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "FleetStatusChart(title="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fromDegrees="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fillStrategy="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sections="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
