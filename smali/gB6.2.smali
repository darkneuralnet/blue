.class public abstract LgB6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll01;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LgB6$b;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Liz0;

.field public c:Led5;

.field public d:Liz0$b;

.field public e:LY31;

.field public f:I

.field public g:Z

.field public h:Lp01;

.field public i:Lp01;

.field public j:LgB6$b;


# direct methods
.method public constructor <init>(Liz0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LY31;

    invoke-direct {v0, p0}, LY31;-><init>(LgB6;)V

    iput-object v0, p0, LgB6;->e:LY31;

    const/4 v0, 0x0

    iput v0, p0, LgB6;->f:I

    iput-boolean v0, p0, LgB6;->g:Z

    new-instance v0, Lp01;

    invoke-direct {v0, p0}, Lp01;-><init>(LgB6;)V

    iput-object v0, p0, LgB6;->h:Lp01;

    new-instance v0, Lp01;

    invoke-direct {v0, p0}, Lp01;-><init>(LgB6;)V

    iput-object v0, p0, LgB6;->i:Lp01;

    sget-object v0, LgB6$b;->b:LgB6$b;

    iput-object v0, p0, LgB6;->j:LgB6$b;

    iput-object p1, p0, LgB6;->b:Liz0;

    return-void
.end method


# virtual methods
.method public a(Ll01;)V
    .locals 0

    return-void
.end method

.method public final b(Lp01;Lp01;I)V
    .locals 1

    iget-object v0, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lp01;->f:I

    iget-object p2, p2, Lp01;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lp01;Lp01;ILY31;)V
    .locals 2

    iget-object v0, p1, Lp01;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, Lp01;->l:Ljava/util/List;

    iget-object v1, p0, LgB6;->e:LY31;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, Lp01;->h:I

    iput-object p4, p1, Lp01;->i:LY31;

    iget-object p2, p2, Lp01;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p2, p4, Lp01;->k:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public final g(II)I
    .locals 1

    if-nez p2, :cond_1

    iget-object p2, p0, LgB6;->b:Liz0;

    iget v0, p2, Liz0;->A:I

    iget p2, p2, Liz0;->z:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_0

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    if-eq p2, p1, :cond_3

    goto :goto_0

    :cond_1
    iget-object p2, p0, LgB6;->b:Liz0;

    iget v0, p2, Liz0;->D:I

    iget p2, p2, Liz0;->C:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    if-lez v0, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_2
    if-eq p2, p1, :cond_3

    :goto_0
    move p1, p2

    :cond_3
    return p1
.end method

.method public final h(LXy0;)Lp01;
    .locals 3

    iget-object p1, p1, LXy0;->f:LXy0;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, LXy0;->d:Liz0;

    iget-object p1, p1, LXy0;->e:LXy0$b;

    sget-object v2, LgB6$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_5

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    const/4 v2, 0x3

    if-eq p1, v2, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v1, Liz0;->f:LKo6;

    iget-object v0, p1, LgB6;->i:Lp01;

    goto :goto_0

    :cond_2
    iget-object p1, v1, Liz0;->f:LKo6;

    iget-object v0, p1, LKo6;->k:Lp01;

    goto :goto_0

    :cond_3
    iget-object p1, v1, Liz0;->f:LKo6;

    iget-object v0, p1, LgB6;->h:Lp01;

    goto :goto_0

    :cond_4
    iget-object p1, v1, Liz0;->e:LeN1;

    iget-object v0, p1, LgB6;->i:Lp01;

    goto :goto_0

    :cond_5
    iget-object p1, v1, Liz0;->e:LeN1;

    iget-object v0, p1, LgB6;->h:Lp01;

    :goto_0
    return-object v0
.end method

.method public final i(LXy0;I)Lp01;
    .locals 2

    iget-object p1, p1, LXy0;->f:LXy0;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p1, LXy0;->d:Liz0;

    if-nez p2, :cond_1

    iget-object p2, v1, Liz0;->e:LeN1;

    goto :goto_0

    :cond_1
    iget-object p2, v1, Liz0;->f:LKo6;

    :goto_0
    iget-object p1, p1, LXy0;->e:LXy0$b;

    sget-object v1, LgB6$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p2, LgB6;->i:Lp01;

    goto :goto_1

    :cond_3
    iget-object v0, p2, LgB6;->h:Lp01;

    :goto_1
    return-object v0
.end method

.method public j()J
    .locals 2

    iget-object v0, p0, LgB6;->e:LY31;

    iget-boolean v1, v0, Lp01;->j:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lp01;->g:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, LgB6;->g:Z

    return v0
.end method

.method public final l(II)V
    .locals 7

    iget v0, p0, LgB6;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, LgB6;->b:Liz0;

    iget-object v3, v0, Liz0;->e:LeN1;

    iget-object v4, v3, LgB6;->d:Liz0$b;

    sget-object v5, Liz0$b;->d:Liz0$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, LgB6;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, Liz0;->f:LKo6;

    iget-object v6, v4, LgB6;->d:Liz0$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, LgB6;->a:I

    if-ne v4, p2, :cond_1

    goto/16 :goto_3

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, Liz0;->f:LKo6;

    :cond_2
    iget-object p2, v3, LgB6;->e:LY31;

    iget-boolean p2, p2, Lp01;->j:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0}, Liz0;->x()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, LgB6;->e:LY31;

    iget p1, p1, Lp01;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, LgB6;->e:LY31;

    iget p1, p1, Lp01;->g:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p2, p0, LgB6;->e:LY31;

    invoke-virtual {p2, p1}, LY31;->d(I)V

    goto :goto_3

    :cond_4
    iget-object p2, p0, LgB6;->b:Liz0;

    invoke-virtual {p2}, Liz0;->M()Liz0;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, Liz0;->e:LeN1;

    goto :goto_1

    :cond_5
    iget-object p2, p2, Liz0;->f:LKo6;

    :goto_1
    iget-object p2, p2, LgB6;->e:LY31;

    iget-boolean v0, p2, Lp01;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, LgB6;->b:Liz0;

    if-nez p1, :cond_6

    iget v0, v0, Liz0;->B:F

    goto :goto_2

    :cond_6
    iget v0, v0, Liz0;->E:F

    :goto_2
    iget p2, p2, Lp01;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    iget-object v0, p0, LgB6;->e:LY31;

    invoke-virtual {p0, p2, p1}, LgB6;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, LY31;->d(I)V

    goto :goto_3

    :cond_7
    iget-object v0, p0, LgB6;->e:LY31;

    iget v0, v0, LY31;->m:I

    invoke-virtual {p0, v0, p1}, LgB6;->g(II)I

    move-result p1

    iget-object v0, p0, LgB6;->e:LY31;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {v0, p1}, LY31;->d(I)V

    goto :goto_3

    :cond_8
    iget-object v0, p0, LgB6;->e:LY31;

    invoke-virtual {p0, p2, p1}, LgB6;->g(II)I

    move-result p1

    invoke-virtual {v0, p1}, LY31;->d(I)V

    :cond_9
    :goto_3
    return-void
.end method

.method public abstract m()Z
.end method

.method public n(Ll01;LXy0;LXy0;I)V
    .locals 4

    invoke-virtual {p0, p2}, LgB6;->h(LXy0;)Lp01;

    move-result-object p1

    invoke-virtual {p0, p3}, LgB6;->h(LXy0;)Lp01;

    move-result-object v0

    iget-boolean v1, p1, Lp01;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, Lp01;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p1, Lp01;->g:I

    invoke-virtual {p2}, LXy0;->f()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, Lp01;->g:I

    invoke-virtual {p3}, LXy0;->f()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, LgB6;->e:LY31;

    iget-boolean v2, v2, Lp01;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, LgB6;->d:Liz0$b;

    sget-object v3, Liz0$b;->d:Liz0$b;

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, p4, p3}, LgB6;->l(II)V

    :cond_1
    iget-object v2, p0, LgB6;->e:LY31;

    iget-boolean v3, v2, Lp01;->j:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, Lp01;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, LgB6;->h:Lp01;

    invoke-virtual {p1, v1}, Lp01;->d(I)V

    iget-object p1, p0, LgB6;->i:Lp01;

    invoke-virtual {p1, p2}, Lp01;->d(I)V

    return-void

    :cond_3
    iget-object p3, p0, LgB6;->b:Liz0;

    if-nez p4, :cond_4

    invoke-virtual {p3}, Liz0;->A()F

    move-result p3

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Liz0;->T()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, Lp01;->g:I

    iget p2, v0, Lp01;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, LgB6;->e:LY31;

    iget p1, p1, Lp01;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, LgB6;->h:Lp01;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, Lp01;->d(I)V

    iget-object p1, p0, LgB6;->i:Lp01;

    iget-object p2, p0, LgB6;->h:Lp01;

    iget p2, p2, Lp01;->g:I

    iget-object p3, p0, LgB6;->e:LY31;

    iget p3, p3, Lp01;->g:I

    add-int/2addr p2, p3

    invoke-virtual {p1, p2}, Lp01;->d(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method public o(Ll01;)V
    .locals 0

    return-void
.end method

.method public p(Ll01;)V
    .locals 0

    return-void
.end method
