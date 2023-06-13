.class public abstract Lli0;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lli0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/github/mikephil/charting/charts/Chart<",
        "*>;>",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;",
        "Landroid/view/View$OnTouchListener;"
    }
.end annotation


# instance fields
.field public b:Lli0$a;

.field public c:I

.field public d:LOM1;

.field public e:Landroid/view/GestureDetector;

.field public f:Lcom/github/mikephil/charting/charts/Chart;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/github/mikephil/charting/charts/Chart;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    sget-object v0, Lli0$a;->b:Lli0$a;

    iput-object v0, p0, Lli0;->b:Lli0$a;

    const/4 v0, 0x0

    iput v0, p0, Lli0;->c:I

    iput-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lli0;->e:Landroid/view/GestureDetector;

    return-void
.end method

.method public static a(FFFF)F
    .locals 0

    sub-float/2addr p0, p1

    sub-float/2addr p2, p3

    mul-float/2addr p0, p0

    mul-float/2addr p2, p2

    add-float/2addr p0, p2

    float-to-double p0, p0

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method


# virtual methods
.method public b(Landroid/view/MotionEvent;)V
    .locals 0

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    return-void
.end method

.method public c(LOM1;Landroid/view/MotionEvent;)V
    .locals 1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lli0;->d:LOM1;

    invoke-virtual {p1, v0}, LOM1;->a(LOM1;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-virtual {v0, p1, p2}, Lcom/github/mikephil/charting/charts/Chart;->N(LOM1;Z)V

    iput-object p1, p0, Lli0;->d:LOM1;

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/github/mikephil/charting/charts/Chart;->N(LOM1;Z)V

    iput-object v0, p0, Lli0;->d:LOM1;

    :goto_1
    return-void
.end method

.method public d(LOM1;)V
    .locals 0

    iput-object p1, p0, Lli0;->d:LOM1;

    return-void
.end method

.method public e(Landroid/view/MotionEvent;)V
    .locals 0

    iget-object p1, p0, Lli0;->f:Lcom/github/mikephil/charting/charts/Chart;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->K()Lif3;

    return-void
.end method
