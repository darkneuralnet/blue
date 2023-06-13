.class public abstract LLD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LLD<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:Z

.field public b:I

.field public c:F

.field public d:LB41;

.field public e:LP24;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:I

.field public h:Landroid/graphics/drawable/Drawable;

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:Lak2;

.field public n:Z

.field public o:Z

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:I

.field public r:Lsy3;

.field public s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lr96<",
            "*>;>;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public u:Z

.field public v:Landroid/content/res/Resources$Theme;

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LLD;->c:F

    sget-object v0, LB41;->e:LB41;

    iput-object v0, p0, LLD;->d:LB41;

    sget-object v0, LP24;->d:LP24;

    iput-object v0, p0, LLD;->e:LP24;

    const/4 v0, 0x1

    iput-boolean v0, p0, LLD;->j:Z

    const/4 v1, -0x1

    iput v1, p0, LLD;->k:I

    iput v1, p0, LLD;->l:I

    invoke-static {}, LWa1;->c()LWa1;

    move-result-object v1

    iput-object v1, p0, LLD;->m:Lak2;

    iput-boolean v0, p0, LLD;->o:Z

    new-instance v1, Lsy3;

    invoke-direct {v1}, Lsy3;-><init>()V

    iput-object v1, p0, LLD;->r:Lsy3;

    new-instance v1, Li80;

    invoke-direct {v1}, Li80;-><init>()V

    iput-object v1, p0, LLD;->s:Ljava/util/Map;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, LLD;->t:Ljava/lang/Class;

    iput-boolean v0, p0, LLD;->z:Z

    return-void
.end method

.method public static Y(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final A()Lsy3;
    .locals 1

    iget-object v0, p0, LLD;->r:Lsy3;

    return-object v0
.end method

.method public A0(Lr96;Z)LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LLD;->A0(Lr96;Z)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, LX61;

    invoke-direct {v0, p1, p2}, LX61;-><init>(Lr96;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, LLD;->B0(Ljava/lang/Class;Lr96;Z)LLD;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, LLD;->B0(Ljava/lang/Class;Lr96;Z)LLD;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, LX61;->c()Lr96;

    move-result-object v0

    invoke-virtual {p0, v1, v0, p2}, LLD;->B0(Ljava/lang/Class;Lr96;Z)LLD;

    new-instance v0, LyC1;

    invoke-direct {v0, p1}, LyC1;-><init>(Lr96;)V

    const-class p1, LuC1;

    invoke-virtual {p0, p1, v0, p2}, LLD;->B0(Ljava/lang/Class;Lr96;Z)LLD;

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public final B()I
    .locals 1

    iget v0, p0, LLD;->k:I

    return v0
.end method

.method public B0(Ljava/lang/Class;Lr96;Z)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TY;>;",
            "Lr96<",
            "TY;>;Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LLD;->B0(Ljava/lang/Class;Lr96;Z)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LLD;->s:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x800

    const/4 p2, 0x1

    iput-boolean p2, p0, LLD;->o:Z

    const/high16 v0, 0x10000

    or-int/2addr p1, v0

    iput p1, p0, LLD;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LLD;->z:Z

    if-eqz p3, :cond_1

    const/high16 p3, 0x20000

    or-int/2addr p1, p3

    iput p1, p0, LLD;->b:I

    iput-boolean p2, p0, LLD;->n:Z

    :cond_1
    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public final C()I
    .locals 1

    iget v0, p0, LLD;->l:I

    return v0
.end method

.method public C0(Z)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->C0(Z)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iput-boolean p1, p0, LLD;->A:Z

    iget p1, p0, LLD;->b:I

    const/high16 v0, 0x100000

    or-int/2addr p1, v0

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public final D()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final G()I
    .locals 1

    iget v0, p0, LLD;->i:I

    return v0
.end method

.method public final H()LP24;
    .locals 1

    iget-object v0, p0, LLD;->e:LP24;

    return-object v0
.end method

.method public final I()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LLD;->t:Ljava/lang/Class;

    return-object v0
.end method

.method public final J()Lak2;
    .locals 1

    iget-object v0, p0, LLD;->m:Lak2;

    return-object v0
.end method

.method public final M()F
    .locals 1

    iget v0, p0, LLD;->c:F

    return v0
.end method

.method public final N()Landroid/content/res/Resources$Theme;
    .locals 1

    iget-object v0, p0, LLD;->v:Landroid/content/res/Resources$Theme;

    return-object v0
.end method

.method public final O()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lr96<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, LLD;->s:Ljava/util/Map;

    return-object v0
.end method

.method public final P()Z
    .locals 1

    iget-boolean v0, p0, LLD;->A:Z

    return v0
.end method

.method public final Q()Z
    .locals 1

    iget-boolean v0, p0, LLD;->x:Z

    return v0
.end method

.method public final S()Z
    .locals 1

    iget-boolean v0, p0, LLD;->w:Z

    return v0
.end method

.method public final U()Z
    .locals 1

    iget-boolean v0, p0, LLD;->j:Z

    return v0
.end method

.method public final V()Z
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, LLD;->X(I)Z

    move-result v0

    return v0
.end method

.method public W()Z
    .locals 1

    iget-boolean v0, p0, LLD;->z:Z

    return v0
.end method

.method public final X(I)Z
    .locals 1

    iget v0, p0, LLD;->b:I

    invoke-static {v0, p1}, LLD;->Y(II)Z

    move-result p1

    return p1
.end method

.method public final Z()Z
    .locals 1

    iget-boolean v0, p0, LLD;->o:Z

    return v0
.end method

.method public final a0()Z
    .locals 1

    iget-boolean v0, p0, LLD;->n:Z

    return v0
.end method

.method public final b0()Z
    .locals 1

    const/16 v0, 0x800

    invoke-virtual {p0, v0}, LLD;->X(I)Z

    move-result v0

    return v0
.end method

.method public final c0()Z
    .locals 2

    iget v0, p0, LLD;->l:I

    iget v1, p0, LLD;->k:I

    invoke-static {v0, v1}, Lpi6;->t(II)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    return-object v0
.end method

.method public d(LLD;)LLD;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLD<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->d(LLD;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, LLD;->b:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, LLD;->c:F

    iput v0, p0, LLD;->c:F

    :cond_1
    iget v0, p1, LLD;->b:I

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p1, LLD;->x:Z

    iput-boolean v0, p0, LLD;->x:Z

    :cond_2
    iget v0, p1, LLD;->b:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p1, LLD;->A:Z

    iput-boolean v0, p0, LLD;->A:Z

    :cond_3
    iget v0, p1, LLD;->b:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, LLD;->d:LB41;

    iput-object v0, p0, LLD;->d:LB41;

    :cond_4
    iget v0, p1, LLD;->b:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, LLD;->e:LP24;

    iput-object v0, p0, LLD;->e:LP24;

    :cond_5
    iget v0, p1, LLD;->b:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, LLD;->Y(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p1, LLD;->f:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LLD;->f:Landroid/graphics/drawable/Drawable;

    iput v1, p0, LLD;->g:I

    iget v0, p0, LLD;->b:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LLD;->b:I

    :cond_6
    iget v0, p1, LLD;->b:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, LLD;->Y(II)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget v0, p1, LLD;->g:I

    iput v0, p0, LLD;->g:I

    iput-object v2, p0, LLD;->f:Landroid/graphics/drawable/Drawable;

    iget v0, p0, LLD;->b:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, LLD;->b:I

    :cond_7
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x40

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, LLD;->h:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    iput v1, p0, LLD;->i:I

    iget v0, p0, LLD;->b:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, LLD;->b:I

    :cond_8
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x80

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, LLD;->i:I

    iput v0, p0, LLD;->i:I

    iput-object v2, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    iget v0, p0, LLD;->b:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, LLD;->b:I

    :cond_9
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x100

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p1, LLD;->j:Z

    iput-boolean v0, p0, LLD;->j:Z

    :cond_a
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x200

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, p1, LLD;->l:I

    iput v0, p0, LLD;->l:I

    iget v0, p1, LLD;->k:I

    iput v0, p0, LLD;->k:I

    :cond_b
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x400

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p1, LLD;->m:Lak2;

    iput-object v0, p0, LLD;->m:Lak2;

    :cond_c
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x1000

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, LLD;->t:Ljava/lang/Class;

    iput-object v0, p0, LLD;->t:Ljava/lang/Class;

    :cond_d
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x2000

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p1, LLD;->p:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LLD;->p:Landroid/graphics/drawable/Drawable;

    iput v1, p0, LLD;->q:I

    iget v0, p0, LLD;->b:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, LLD;->b:I

    :cond_e
    iget v0, p1, LLD;->b:I

    const/16 v3, 0x4000

    invoke-static {v0, v3}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, p1, LLD;->q:I

    iput v0, p0, LLD;->q:I

    iput-object v2, p0, LLD;->p:Landroid/graphics/drawable/Drawable;

    iget v0, p0, LLD;->b:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, LLD;->b:I

    :cond_f
    iget v0, p1, LLD;->b:I

    const v2, 0x8000

    invoke-static {v0, v2}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, LLD;->v:Landroid/content/res/Resources$Theme;

    iput-object v0, p0, LLD;->v:Landroid/content/res/Resources$Theme;

    :cond_10
    iget v0, p1, LLD;->b:I

    const/high16 v2, 0x10000

    invoke-static {v0, v2}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-boolean v0, p1, LLD;->o:Z

    iput-boolean v0, p0, LLD;->o:Z

    :cond_11
    iget v0, p1, LLD;->b:I

    const/high16 v2, 0x20000

    invoke-static {v0, v2}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-boolean v0, p1, LLD;->n:Z

    iput-boolean v0, p0, LLD;->n:Z

    :cond_12
    iget v0, p1, LLD;->b:I

    const/16 v2, 0x800

    invoke-static {v0, v2}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, LLD;->s:Ljava/util/Map;

    iget-object v2, p1, LLD;->s:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, LLD;->z:Z

    iput-boolean v0, p0, LLD;->z:Z

    :cond_13
    iget v0, p1, LLD;->b:I

    const/high16 v2, 0x80000

    invoke-static {v0, v2}, LLD;->Y(II)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean v0, p1, LLD;->y:Z

    iput-boolean v0, p0, LLD;->y:Z

    :cond_14
    iget-boolean v0, p0, LLD;->o:Z

    if-nez v0, :cond_15

    iget-object v0, p0, LLD;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget v0, p0, LLD;->b:I

    and-int/lit16 v0, v0, -0x801

    iput-boolean v1, p0, LLD;->n:Z

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, LLD;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LLD;->z:Z

    :cond_15
    iget v0, p0, LLD;->b:I

    iget v1, p1, LLD;->b:I

    or-int/2addr v0, v1

    iput v0, p0, LLD;->b:I

    iget-object v0, p0, LLD;->r:Lsy3;

    iget-object p1, p1, LLD;->r:Lsy3;

    invoke-virtual {v0, p1}, Lsy3;->d(Lsy3;)V

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public d0()LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LLD;->u:Z

    invoke-virtual {p0}, LLD;->s0()LLD;

    move-result-object v0

    return-object v0
.end method

.method public e()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->u:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LLD;->w:Z

    invoke-virtual {p0}, LLD;->d0()LLD;

    move-result-object v0

    return-object v0
.end method

.method public e0()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lc61;->e:Lc61;

    new-instance v1, LQg0;

    invoke-direct {v1}, LQg0;-><init>()V

    invoke-virtual {p0, v0, v1}, LLD;->i0(Lc61;Lr96;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LLD;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LLD;

    iget v0, p1, LLD;->c:F

    iget v2, p0, LLD;->c:F

    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, LLD;->g:I

    iget v2, p1, LLD;->g:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LLD;->f:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, LLD;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lpi6;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LLD;->i:I

    iget v2, p1, LLD;->i:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, LLD;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lpi6;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LLD;->q:I

    iget v2, p1, LLD;->q:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LLD;->p:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, LLD;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Lpi6;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LLD;->j:Z

    iget-boolean v2, p1, LLD;->j:Z

    if-ne v0, v2, :cond_0

    iget v0, p0, LLD;->k:I

    iget v2, p1, LLD;->k:I

    if-ne v0, v2, :cond_0

    iget v0, p0, LLD;->l:I

    iget v2, p1, LLD;->l:I

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, LLD;->n:Z

    iget-boolean v2, p1, LLD;->n:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, LLD;->o:Z

    iget-boolean v2, p1, LLD;->o:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, LLD;->x:Z

    iget-boolean v2, p1, LLD;->x:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, LLD;->y:Z

    iget-boolean v2, p1, LLD;->y:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LLD;->d:LB41;

    iget-object v2, p1, LLD;->d:LB41;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLD;->e:LP24;

    iget-object v2, p1, LLD;->e:LP24;

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LLD;->r:Lsy3;

    iget-object v2, p1, LLD;->r:Lsy3;

    invoke-virtual {v0, v2}, Lsy3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLD;->s:Ljava/util/Map;

    iget-object v2, p1, LLD;->s:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLD;->t:Ljava/lang/Class;

    iget-object v2, p1, LLD;->t:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLD;->m:Lak2;

    iget-object v2, p1, LLD;->m:Lak2;

    invoke-static {v0, v2}, Lpi6;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLD;->v:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, LLD;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v0, p1}, Lpi6;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lc61;->e:Lc61;

    new-instance v1, LQg0;

    invoke-direct {v1}, LQg0;-><init>()V

    invoke-virtual {p0, v0, v1}, LLD;->y0(Lc61;Lr96;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public f0()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lc61;->d:Lc61;

    new-instance v1, LRg0;

    invoke-direct {v1}, LRg0;-><init>()V

    invoke-virtual {p0, v0, v1}, LLD;->h0(Lc61;Lr96;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public g()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lc61;->d:Lc61;

    new-instance v1, LRg0;

    invoke-direct {v1}, LRg0;-><init>()V

    invoke-virtual {p0, v0, v1}, LLD;->q0(Lc61;Lr96;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public g0()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lc61;->c:Lc61;

    new-instance v1, Lco1;

    invoke-direct {v1}, Lco1;-><init>()V

    invoke-virtual {p0, v0, v1}, LLD;->h0(Lc61;Lr96;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public h()LLD;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLD;

    new-instance v1, Lsy3;

    invoke-direct {v1}, Lsy3;-><init>()V

    iput-object v1, v0, LLD;->r:Lsy3;

    iget-object v2, p0, LLD;->r:Lsy3;

    invoke-virtual {v1, v2}, Lsy3;->d(Lsy3;)V

    new-instance v1, Li80;

    invoke-direct {v1}, Li80;-><init>()V

    iput-object v1, v0, LLD;->s:Ljava/util/Map;

    iget-object v2, p0, LLD;->s:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, LLD;->u:Z

    iput-boolean v1, v0, LLD;->w:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final h0(Lc61;Lr96;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc61;",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, LLD;->r0(Lc61;Lr96;Z)LLD;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LLD;->c:F

    invoke-static {v0}, Lpi6;->l(F)I

    move-result v0

    iget v1, p0, LLD;->g:I

    invoke-static {v1, v0}, Lpi6;->n(II)I

    move-result v0

    iget-object v1, p0, LLD;->f:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, LLD;->i:I

    invoke-static {v1, v0}, Lpi6;->n(II)I

    move-result v0

    iget-object v1, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget v1, p0, LLD;->q:I

    invoke-static {v1, v0}, Lpi6;->n(II)I

    move-result v0

    iget-object v1, p0, LLD;->p:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, LLD;->j:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    iget v1, p0, LLD;->k:I

    invoke-static {v1, v0}, Lpi6;->n(II)I

    move-result v0

    iget v1, p0, LLD;->l:I

    invoke-static {v1, v0}, Lpi6;->n(II)I

    move-result v0

    iget-boolean v1, p0, LLD;->n:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    iget-boolean v1, p0, LLD;->o:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    iget-boolean v1, p0, LLD;->x:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    iget-boolean v1, p0, LLD;->y:Z

    invoke-static {v1, v0}, Lpi6;->p(ZI)I

    move-result v0

    iget-object v1, p0, LLD;->d:LB41;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LLD;->e:LP24;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LLD;->r:Lsy3;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LLD;->s:Ljava/util/Map;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LLD;->t:Ljava/lang/Class;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LLD;->m:Lak2;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, LLD;->v:Landroid/content/res/Resources$Theme;

    invoke-static {v1, v0}, Lpi6;->o(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final i0(Lc61;Lr96;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc61;",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LLD;->i0(Lc61;Lr96;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LLD;->m(Lc61;)LLD;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, LLD;->A0(Lr96;Z)LLD;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Class;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->j(Ljava/lang/Class;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    iput-object p1, p0, LLD;->t:Ljava/lang/Class;

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public k(LB41;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB41;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->k(LB41;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LB41;

    iput-object p1, p0, LLD;->d:LB41;

    iget p1, p0, LLD;->b:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public k0(II)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LLD;->k0(II)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, LLD;->l:I

    iput p2, p0, LLD;->k:I

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public l()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, LEC1;->b:Liy3;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, LLD;->u0(Liy3;Ljava/lang/Object;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public l0(I)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->l0(I)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, LLD;->i:I

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x80

    const/4 v0, 0x0

    iput-object v0, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    and-int/lit8 p1, p1, -0x41

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public m(Lc61;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc61;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lc61;->h:Liy3;

    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LLD;->u0(Liy3;Ljava/lang/Object;)LLD;

    move-result-object p1

    return-object p1
.end method

.method public n(I)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->n(I)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, LLD;->g:I

    iget p1, p0, LLD;->b:I

    or-int/lit8 p1, p1, 0x20

    const/4 v0, 0x0

    iput-object v0, p0, LLD;->f:Landroid/graphics/drawable/Drawable;

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public n0(Landroid/graphics/drawable/Drawable;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->n0(Landroid/graphics/drawable/Drawable;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LLD;->h:Landroid/graphics/drawable/Drawable;

    iget p1, p0, LLD;->b:I

    or-int/lit8 p1, p1, 0x40

    const/4 v0, 0x0

    iput v0, p0, LLD;->i:I

    and-int/lit16 p1, p1, -0x81

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public o(Landroid/graphics/drawable/Drawable;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->o(Landroid/graphics/drawable/Drawable;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LLD;->p:Landroid/graphics/drawable/Drawable;

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x2000

    const/4 v0, 0x0

    iput v0, p0, LLD;->q:I

    and-int/lit16 p1, p1, -0x4001

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public o0(LP24;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP24;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->o0(LP24;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP24;

    iput-object p1, p0, LLD;->e:LP24;

    iget p1, p0, LLD;->b:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public p()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lc61;->c:Lc61;

    new-instance v1, Lco1;

    invoke-direct {v1}, Lco1;-><init>()V

    invoke-virtual {p0, v0, v1}, LLD;->q0(Lc61;Lr96;)LLD;

    move-result-object v0

    return-object v0
.end method

.method public final q()LB41;
    .locals 1

    iget-object v0, p0, LLD;->d:LB41;

    return-object v0
.end method

.method public final q0(Lc61;Lr96;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc61;",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LLD;->r0(Lc61;Lr96;Z)LLD;

    move-result-object p1

    return-object p1
.end method

.method public final r()I
    .locals 1

    iget v0, p0, LLD;->g:I

    return v0
.end method

.method public final r0(Lc61;Lr96;Z)LLD;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc61;",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, LLD;->y0(Lc61;Lr96;)LLD;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, LLD;->i0(Lc61;Lr96;)LLD;

    move-result-object p1

    :goto_0
    const/4 p2, 0x1

    iput-boolean p2, p1, LLD;->z:Z

    return-object p1
.end method

.method public final s0()LLD;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    return-object p0
.end method

.method public final t()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LLD;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final t0()LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->u:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLD;->s0()LLD;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public u0(Liy3;Ljava/lang/Object;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Liy3<",
            "TY;>;TY;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LLD;->u0(Liy3;Ljava/lang/Object;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LLD;->r:Lsy3;

    invoke-virtual {v0, p1, p2}, Lsy3;->e(Liy3;Ljava/lang/Object;)Lsy3;

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public v0(Lak2;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lak2;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->v0(Lak2;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LzZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lak2;

    iput-object p1, p0, LLD;->m:Lak2;

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public final w()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, LLD;->p:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public w0(F)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1}, LLD;->w0(F)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_1

    iput p1, p0, LLD;->c:F

    iget p1, p0, LLD;->b:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "sizeMultiplier must be between 0 and 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x0(Z)LLD;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object p1

    invoke-virtual {p1, v1}, LLD;->x0(Z)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    xor-int/2addr p1, v1

    iput-boolean p1, p0, LLD;->j:Z

    iget p1, p0, LLD;->b:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, LLD;->b:I

    invoke-virtual {p0}, LLD;->t0()LLD;

    move-result-object p1

    return-object p1
.end method

.method public final y()I
    .locals 1

    iget v0, p0, LLD;->q:I

    return v0
.end method

.method public final y0(Lc61;Lr96;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc61;",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    iget-boolean v0, p0, LLD;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LLD;->h()LLD;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LLD;->y0(Lc61;Lr96;)LLD;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, LLD;->m(Lc61;)LLD;

    invoke-virtual {p0, p2}, LLD;->z0(Lr96;)LLD;

    move-result-object p1

    return-object p1
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, LLD;->y:Z

    return v0
.end method

.method public z0(Lr96;)LLD;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr96<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LLD;->A0(Lr96;Z)LLD;

    move-result-object p1

    return-object p1
.end method
