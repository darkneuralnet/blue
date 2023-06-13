.class public final Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\'\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;",
        "",
        "",
        "color",
        "",
        "label",
        "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;",
        "stroke",
        "a",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "I",
        "b",
        "()I",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;",
        "d",
        "()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;",
        "<init>",
        "(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)V",
        "co.bird.android.feature.fleet-status"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stroke"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    iput-object p2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;ILjava/lang/Object;)Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;
    .locals 1

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stroke"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;-><init>(ILjava/lang/String;Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;)V

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;

    iget v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    iget v3, p1, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    iget-object p1, p1, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->a:I

    iget-object v1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->b:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$b;->c:Lco/bird/android/feature/fleetstatus/kpi/views/FleetReportChartLegendView$c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "LegendEntry(color="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stroke="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
