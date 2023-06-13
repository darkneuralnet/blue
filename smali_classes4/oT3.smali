.class public final synthetic LoT3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Lco/bird/android/widget/PieChart;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lco/bird/android/widget/PieChart;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoT3;->a:Ljava/util/Map;

    iput-object p2, p0, LoT3;->b:Lco/bird/android/widget/PieChart;

    iput-object p3, p0, LoT3;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, LoT3;->a:Ljava/util/Map;

    iget-object v1, p0, LoT3;->b:Lco/bird/android/widget/PieChart;

    iget-object v2, p0, LoT3;->c:Ljava/util/Map;

    invoke-static {v0, v1, v2, p1}, Lco/bird/android/widget/PieChart;->a(Ljava/util/Map;Lco/bird/android/widget/PieChart;Ljava/util/Map;Landroid/animation/ValueAnimator;)V

    return-void
.end method
