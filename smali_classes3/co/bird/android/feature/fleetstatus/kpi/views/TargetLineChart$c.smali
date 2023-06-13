.class public final Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c;
.super LJj6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart;->x0(Lco/bird/android/model/persistence/nestedstructures/FleetReportLineChart;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "co/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c",
        "LJj6;",
        "",
        "value",
        "LXu;",
        "axis",
        "",
        "a",
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
.field public final synthetic a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c;->a:Ljava/util/Map;

    invoke-direct {p0}, LJj6;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FLXu;)Ljava/lang/String;
    .locals 0

    iget-object p2, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetLineChart$c;->a:Ljava/util/Map;

    invoke-static {p2, p1}, LSY5;->access$nearestValueForKey(Ljava/util/Map;F)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method
