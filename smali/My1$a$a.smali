.class public LMy1$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMy1$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LMy1$a;


# direct methods
.method public constructor <init>(LMy1$a;)V
    .locals 0

    iput-object p1, p0, LMy1$a$a;->a:LMy1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 8

    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    const/4 v0, 0x1

    and-int/2addr p3, v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz p3, :cond_0

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v1

    invoke-virtual {p2, v2}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v3

    invoke-virtual {p1, p3, v3, v4}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_0
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    const/4 v3, 0x2

    and-int/2addr p3, v3

    if-eqz p3, :cond_1

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v0

    invoke-virtual {p2, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v4

    invoke-virtual {p1, p3, v4, v5}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_1
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    const/4 v0, 0x4

    and-int/2addr p3, v0

    const/4 v4, 0x3

    if-eqz p3, :cond_2

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v3

    invoke-virtual {p2, v4}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v5

    invoke-virtual {p1, p3, v5, v6}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_2
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    and-int/2addr p3, v2

    if-eqz p3, :cond_3

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v4

    invoke-virtual {p2, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v4

    invoke-virtual {p1, p3, v4, v5}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_3
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    and-int/lit8 p3, p3, 0x10

    const/4 v4, 0x5

    if-eqz p3, :cond_4

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v0

    invoke-virtual {p2, v4}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v5

    invoke-virtual {p1, p3, v5, v6}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_4
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    and-int/lit8 p3, p3, 0x40

    const/4 v0, 0x7

    const/4 v5, 0x6

    if-eqz p3, :cond_5

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v5

    invoke-virtual {p2, v0}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v6

    invoke-virtual {p1, p3, v6, v7}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_5
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    and-int/lit8 p3, p3, 0x20

    if-eqz p3, :cond_6

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v4

    invoke-virtual {p2, v5}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v4

    invoke-virtual {p1, p3, v4, v5}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_6
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    and-int/lit16 p3, p3, 0x80

    if-eqz p3, :cond_7

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v0

    invoke-virtual {p2, v1}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v0

    invoke-virtual {p1, p3, v0, v1}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_7
    iget-object p1, p0, LMy1$a$a;->a:LMy1$a;

    iget p3, p1, LMy1$a;->a:I

    and-int/lit16 p3, p3, 0x100

    if-eqz p3, :cond_8

    iget-object p3, p1, LMy1$a;->b:[Landroid/util/SparseIntArray;

    aget-object p3, p3, v2

    invoke-virtual {p2, v3}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v0

    invoke-virtual {p1, p3, v0, v1}, LMy1$a;->e(Landroid/util/SparseIntArray;J)V

    :cond_8
    return-void
.end method
