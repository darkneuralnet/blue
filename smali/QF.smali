.class public LQF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBs2;


# instance fields
.field public final b:LBs2;

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LBs2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LQF;->c:I

    const/4 v0, -0x1

    iput v0, p0, LQF;->d:I

    iput v0, p0, LQF;->e:I

    const/4 v0, 0x0

    iput-object v0, p0, LQF;->f:Ljava/lang/Object;

    iput-object p1, p0, LQF;->b:LBs2;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget v0, p0, LQF;->c:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LQF;->b:LBs2;

    iget v1, p0, LQF;->d:I

    iget v2, p0, LQF;->e:I

    iget-object v3, p0, LQF;->f:Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, LBs2;->onChanged(IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LQF;->b:LBs2;

    iget v1, p0, LQF;->d:I

    iget v2, p0, LQF;->e:I

    invoke-interface {v0, v1, v2}, LBs2;->onRemoved(II)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, LQF;->b:LBs2;

    iget v1, p0, LQF;->d:I

    iget v2, p0, LQF;->e:I

    invoke-interface {v0, v1, v2}, LBs2;->onInserted(II)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, LQF;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, LQF;->c:I

    return-void
.end method

.method public onChanged(IILjava/lang/Object;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    iget v0, p0, LQF;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget v0, p0, LQF;->d:I

    iget v2, p0, LQF;->e:I

    add-int v3, v0, v2

    if-gt p1, v3, :cond_0

    add-int v3, p1, p2

    if-lt v3, v0, :cond_0

    iget-object v4, p0, LQF;->f:Ljava/lang/Object;

    if-ne v4, p3, :cond_0

    add-int/2addr v2, v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, LQF;->d:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, LQF;->d:I

    sub-int/2addr p1, p2

    iput p1, p0, LQF;->e:I

    return-void

    :cond_0
    invoke-virtual {p0}, LQF;->a()V

    iput p1, p0, LQF;->d:I

    iput p2, p0, LQF;->e:I

    iput-object p3, p0, LQF;->f:Ljava/lang/Object;

    iput v1, p0, LQF;->c:I

    return-void
.end method

.method public onInserted(II)V
    .locals 4

    iget v0, p0, LQF;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, LQF;->d:I

    if-lt p1, v0, :cond_0

    iget v2, p0, LQF;->e:I

    add-int v3, v0, v2

    if-gt p1, v3, :cond_0

    add-int/2addr v2, p2

    iput v2, p0, LQF;->e:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, LQF;->d:I

    return-void

    :cond_0
    invoke-virtual {p0}, LQF;->a()V

    iput p1, p0, LQF;->d:I

    iput p2, p0, LQF;->e:I

    iput v1, p0, LQF;->c:I

    return-void
.end method

.method public onMoved(II)V
    .locals 1

    invoke-virtual {p0}, LQF;->a()V

    iget-object v0, p0, LQF;->b:LBs2;

    invoke-interface {v0, p1, p2}, LBs2;->onMoved(II)V

    return-void
.end method

.method public onRemoved(II)V
    .locals 3

    iget v0, p0, LQF;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget v0, p0, LQF;->d:I

    if-lt v0, p1, :cond_0

    add-int v2, p1, p2

    if-gt v0, v2, :cond_0

    iget v0, p0, LQF;->e:I

    add-int/2addr v0, p2

    iput v0, p0, LQF;->e:I

    iput p1, p0, LQF;->d:I

    return-void

    :cond_0
    invoke-virtual {p0}, LQF;->a()V

    iput p1, p0, LQF;->d:I

    iput p2, p0, LQF;->e:I

    iput v1, p0, LQF;->c:I

    return-void
.end method
