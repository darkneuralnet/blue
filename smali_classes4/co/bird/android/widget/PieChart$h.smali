.class public final Lco/bird/android/widget/PieChart$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/PieChart;->onDraw(Landroid/graphics/Canvas;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/widget/PieChart$b;",
        "Landroid/graphics/Paint;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/widget/PieChart$b;",
        "datum",
        "Landroid/graphics/Paint;",
        "a",
        "(Lco/bird/android/widget/PieChart$b;)Landroid/graphics/Paint;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/PieChart;

.field public final synthetic h:F


# direct methods
.method public constructor <init>(Lco/bird/android/widget/PieChart;F)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/PieChart$h;->g:Lco/bird/android/widget/PieChart;

    iput p2, p0, Lco/bird/android/widget/PieChart$h;->h:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/widget/PieChart$b;)Landroid/graphics/Paint;
    .locals 3

    const-string v0, "datum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/PieChart$h;->g:Lco/bird/android/widget/PieChart;

    invoke-static {v0}, Lco/bird/android/widget/PieChart;->access$getChartPaint$p(Lco/bird/android/widget/PieChart;)Landroid/graphics/Paint;

    move-result-object v0

    iget v1, p0, Lco/bird/android/widget/PieChart$h;->h:F

    invoke-virtual {p1}, Lco/bird/android/widget/PieChart$b;->f()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p1}, Lco/bird/android/widget/PieChart$b;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/PieChart$h;->a(Lco/bird/android/widget/PieChart$b;)Landroid/graphics/Paint;

    move-result-object p1

    return-object p1
.end method
