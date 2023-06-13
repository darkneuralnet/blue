.class public final Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Integer;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart$e;->g:Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart$e;->g:Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->L()LFs6;

    move-result-object v0

    invoke-virtual {v0}, LFs6;->G()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/fleetstatus/kpi/views/TargetBarChart$e;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
