.class public Liz0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liz0$b;
    }
.end annotation


# static fields
.field public static U0:F = 0.5f


# instance fields
.field public A:I

.field public A0:I

.field public B:F

.field public B0:I

.field public C:I

.field public C0:Z

.field public D:I

.field public D0:Z

.field public E:F

.field public E0:Z

.field public F:Z

.field public F0:Z

.field public G:Z

.field public G0:Z

.field public H:I

.field public H0:Z

.field public I:F

.field public I0:Z

.field public J:[I

.field public J0:I

.field public K:F

.field public K0:I

.field public L:Z

.field public L0:Z

.field public M:Z

.field public M0:Z

.field public N:Z

.field public N0:[F

.field public O:I

.field public O0:[Liz0;

.field public P:I

.field public P0:[Liz0;

.field public Q:LXy0;

.field public Q0:Liz0;

.field public R:LXy0;

.field public R0:Liz0;

.field public S:LXy0;

.field public S0:I

.field public T:LXy0;

.field public T0:I

.field public U:LXy0;

.field public V:LXy0;

.field public W:LXy0;

.field public X:LXy0;

.field public Y:[LXy0;

.field public Z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LXy0;",
            ">;"
        }
    .end annotation
.end field

.field public a:Z

.field public a0:[Z

.field public b:[LgB6;

.field public b0:[Liz0$b;

.field public c:Loh0;

.field public c0:Liz0;

.field public d:Loh0;

.field public d0:I

.field public e:LeN1;

.field public e0:I

.field public f:LKo6;

.field public f0:F

.field public g:[Z

.field public g0:I

.field public h:Z

.field public h0:I

.field public i:Z

.field public i0:I

.field public j:Z

.field public j0:I

.field public k:Z

.field public k0:I

.field public l:I

.field public l0:I

.field public m:I

.field public m0:I

.field public n:LdB6;

.field public n0:I

.field public o:Ljava/lang/String;

.field public o0:I

.field public p:Z

.field public p0:I

.field public q:Z

.field public q0:F

.field public r:Z

.field public r0:F

.field public s:Z

.field public s0:Ljava/lang/Object;

.field public t:I

.field public t0:I

.field public u:I

.field public u0:I

.field public v:I

.field public v0:Z

.field public w:I

.field public w0:Ljava/lang/String;

.field public x:I

.field public x0:Ljava/lang/String;

.field public y:[I

.field public y0:I

.field public z:I

.field public z0:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Liz0;->a:Z

    const/4 v1, 0x2

    new-array v2, v1, [LgB6;

    iput-object v2, p0, Liz0;->b:[LgB6;

    const/4 v2, 0x0

    iput-object v2, p0, Liz0;->e:LeN1;

    iput-object v2, p0, Liz0;->f:LKo6;

    new-array v3, v1, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Liz0;->g:[Z

    iput-boolean v0, p0, Liz0;->h:Z

    const/4 v3, 0x1

    iput-boolean v3, p0, Liz0;->i:Z

    iput-boolean v0, p0, Liz0;->j:Z

    iput-boolean v3, p0, Liz0;->k:Z

    const/4 v4, -0x1

    iput v4, p0, Liz0;->l:I

    iput v4, p0, Liz0;->m:I

    new-instance v5, LdB6;

    invoke-direct {v5, p0}, LdB6;-><init>(Liz0;)V

    iput-object v5, p0, Liz0;->n:LdB6;

    iput-boolean v0, p0, Liz0;->p:Z

    iput-boolean v0, p0, Liz0;->q:Z

    iput-boolean v0, p0, Liz0;->r:Z

    iput-boolean v0, p0, Liz0;->s:Z

    iput v4, p0, Liz0;->t:I

    iput v4, p0, Liz0;->u:I

    iput v0, p0, Liz0;->v:I

    iput v0, p0, Liz0;->w:I

    iput v0, p0, Liz0;->x:I

    new-array v5, v1, [I

    iput-object v5, p0, Liz0;->y:[I

    iput v0, p0, Liz0;->z:I

    iput v0, p0, Liz0;->A:I

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, p0, Liz0;->B:F

    iput v0, p0, Liz0;->C:I

    iput v0, p0, Liz0;->D:I

    iput v5, p0, Liz0;->E:F

    iput v4, p0, Liz0;->H:I

    iput v5, p0, Liz0;->I:F

    new-array v5, v1, [I

    fill-array-data v5, :array_1

    iput-object v5, p0, Liz0;->J:[I

    const/4 v5, 0x0

    iput v5, p0, Liz0;->K:F

    iput-boolean v0, p0, Liz0;->L:Z

    iput-boolean v0, p0, Liz0;->N:Z

    iput v0, p0, Liz0;->O:I

    iput v0, p0, Liz0;->P:I

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->c:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->Q:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->d:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->R:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->e:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->S:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->f:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->T:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->g:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->U:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->i:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->V:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->j:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->W:LXy0;

    new-instance v6, LXy0;

    sget-object v7, LXy0$b;->h:LXy0$b;

    invoke-direct {v6, p0, v7}, LXy0;-><init>(Liz0;LXy0$b;)V

    iput-object v6, p0, Liz0;->X:LXy0;

    const/4 v7, 0x6

    new-array v7, v7, [LXy0;

    iget-object v8, p0, Liz0;->Q:LXy0;

    aput-object v8, v7, v0

    iget-object v8, p0, Liz0;->S:LXy0;

    aput-object v8, v7, v3

    iget-object v8, p0, Liz0;->R:LXy0;

    aput-object v8, v7, v1

    const/4 v8, 0x3

    iget-object v9, p0, Liz0;->T:LXy0;

    aput-object v9, v7, v8

    const/4 v8, 0x4

    iget-object v9, p0, Liz0;->U:LXy0;

    aput-object v9, v7, v8

    const/4 v8, 0x5

    aput-object v6, v7, v8

    iput-object v7, p0, Liz0;->Y:[LXy0;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Liz0;->Z:Ljava/util/ArrayList;

    new-array v6, v1, [Z

    iput-object v6, p0, Liz0;->a0:[Z

    new-array v6, v1, [Liz0$b;

    sget-object v7, Liz0$b;->b:Liz0$b;

    aput-object v7, v6, v0

    aput-object v7, v6, v3

    iput-object v6, p0, Liz0;->b0:[Liz0$b;

    iput-object v2, p0, Liz0;->c0:Liz0;

    iput v0, p0, Liz0;->d0:I

    iput v0, p0, Liz0;->e0:I

    iput v5, p0, Liz0;->f0:F

    iput v4, p0, Liz0;->g0:I

    iput v0, p0, Liz0;->h0:I

    iput v0, p0, Liz0;->i0:I

    iput v0, p0, Liz0;->j0:I

    iput v0, p0, Liz0;->k0:I

    iput v0, p0, Liz0;->l0:I

    iput v0, p0, Liz0;->m0:I

    iput v0, p0, Liz0;->n0:I

    sget v5, Liz0;->U0:F

    iput v5, p0, Liz0;->q0:F

    iput v5, p0, Liz0;->r0:F

    iput v0, p0, Liz0;->t0:I

    iput v0, p0, Liz0;->u0:I

    iput-boolean v0, p0, Liz0;->v0:Z

    iput-object v2, p0, Liz0;->w0:Ljava/lang/String;

    iput-object v2, p0, Liz0;->x0:Ljava/lang/String;

    iput-boolean v0, p0, Liz0;->I0:Z

    iput v0, p0, Liz0;->J0:I

    iput v0, p0, Liz0;->K0:I

    new-array v5, v1, [F

    fill-array-data v5, :array_2

    iput-object v5, p0, Liz0;->N0:[F

    new-array v5, v1, [Liz0;

    aput-object v2, v5, v0

    aput-object v2, v5, v3

    iput-object v5, p0, Liz0;->O0:[Liz0;

    new-array v1, v1, [Liz0;

    aput-object v2, v1, v0

    aput-object v2, v1, v3

    iput-object v1, p0, Liz0;->P0:[Liz0;

    iput-object v2, p0, Liz0;->Q0:Liz0;

    iput-object v2, p0, Liz0;->R0:Liz0;

    iput v4, p0, Liz0;->S0:I

    iput v4, p0, Liz0;->T0:I

    invoke-virtual {p0}, Liz0;->d()V

    return-void

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        0x7fffffff
        0x7fffffff
    .end array-data

    :array_2
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method


# virtual methods
.method public A()F
    .locals 1

    iget v0, p0, Liz0;->q0:F

    return v0
.end method

.method public final A0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V
    .locals 0

    cmpl-float p4, p3, p4

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :   "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public B()I
    .locals 1

    iget v0, p0, Liz0;->J0:I

    return v0
.end method

.method public final B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V
    .locals 0

    if-ne p3, p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :   "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public C()Liz0$b;
    .locals 2

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final C0(Ljava/lang/StringBuilder;Ljava/lang/String;FI)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :  ["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "],\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public D()I
    .locals 2

    iget-object v0, p0, Liz0;->Q:LXy0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, LXy0;->g:I

    add-int/2addr v1, v0

    :cond_0
    iget-object v0, p0, Liz0;->S:LXy0;

    if-eqz v0, :cond_1

    iget v0, v0, LXy0;->g:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public D0(Z)V
    .locals 0

    iput-boolean p1, p0, Liz0;->v0:Z

    return-void
.end method

.method public E()I
    .locals 1

    iget v0, p0, Liz0;->O:I

    return v0
.end method

.method public E0(I)V
    .locals 0

    iput p1, p0, Liz0;->n0:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Liz0;->L:Z

    return-void
.end method

.method public F()I
    .locals 1

    iget v0, p0, Liz0;->P:I

    return v0
.end method

.method public F0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Liz0;->s0:Ljava/lang/Object;

    return-void
.end method

.method public G(I)I
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Liz0;->Y()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Liz0;->z()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public G0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Liz0;->w0:Ljava/lang/String;

    return-void
.end method

.method public H()I
    .locals 2

    iget-object v0, p0, Liz0;->J:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public H0(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2c

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-lez v2, :cond_3

    add-int/lit8 v6, v1, -0x1

    if-ge v2, v6, :cond_3

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "H"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_0
    add-int/2addr v2, v4

    move v5, v3

    move v3, v2

    :cond_3
    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_5

    sub-int/2addr v1, v4

    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/2addr v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v2, v1, v0

    if-lez v2, :cond_6

    cmpl-float v2, p1, v0

    if-lez v2, :cond_6

    if-ne v5, v4, :cond_4

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Liz0;->f0:F

    iput v5, p0, Liz0;->g0:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Liz0;->f0:F

    return-void
.end method

.method public I()I
    .locals 2

    iget-object v0, p0, Liz0;->J:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public I0(I)V
    .locals 3

    iget-boolean v0, p0, Liz0;->L:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Liz0;->n0:I

    sub-int v0, p1, v0

    iget v1, p0, Liz0;->e0:I

    add-int/2addr v1, v0

    iput v0, p0, Liz0;->i0:I

    iget-object v2, p0, Liz0;->R:LXy0;

    invoke-virtual {v2, v0}, LXy0;->t(I)V

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {v0, v1}, LXy0;->t(I)V

    iget-object v0, p0, Liz0;->U:LXy0;

    invoke-virtual {v0, p1}, LXy0;->t(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Liz0;->q:Z

    return-void
.end method

.method public J()I
    .locals 1

    iget v0, p0, Liz0;->p0:I

    return v0
.end method

.method public J0(II)V
    .locals 1

    iget-boolean v0, p0, Liz0;->p:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0, p1}, LXy0;->t(I)V

    iget-object v0, p0, Liz0;->S:LXy0;

    invoke-virtual {v0, p2}, LXy0;->t(I)V

    iput p1, p0, Liz0;->h0:I

    sub-int/2addr p2, p1

    iput p2, p0, Liz0;->d0:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Liz0;->p:Z

    return-void
.end method

.method public K()I
    .locals 1

    iget v0, p0, Liz0;->o0:I

    return v0
.end method

.method public K0(I)V
    .locals 1

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0, p1}, LXy0;->t(I)V

    iput p1, p0, Liz0;->h0:I

    return-void
.end method

.method public L(I)Liz0;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Liz0;->S:LXy0;

    iget-object v0, p1, LXy0;->f:LXy0;

    if-eqz v0, :cond_1

    iget-object v1, v0, LXy0;->f:LXy0;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, LXy0;->d:Liz0;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Liz0;->T:LXy0;

    iget-object v0, p1, LXy0;->f:LXy0;

    if-eqz v0, :cond_1

    iget-object v1, v0, LXy0;->f:LXy0;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, LXy0;->d:Liz0;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public L0(I)V
    .locals 1

    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {v0, p1}, LXy0;->t(I)V

    iput p1, p0, Liz0;->i0:I

    return-void
.end method

.method public M()Liz0;
    .locals 1

    iget-object v0, p0, Liz0;->c0:Liz0;

    return-object v0
.end method

.method public M0(II)V
    .locals 1

    iget-boolean v0, p0, Liz0;->q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {v0, p1}, LXy0;->t(I)V

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {v0, p2}, LXy0;->t(I)V

    iput p1, p0, Liz0;->i0:I

    sub-int/2addr p2, p1

    iput p2, p0, Liz0;->e0:I

    iget-boolean p2, p0, Liz0;->L:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Liz0;->U:LXy0;

    iget v0, p0, Liz0;->n0:I

    add-int/2addr p1, v0

    invoke-virtual {p2, p1}, LXy0;->t(I)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Liz0;->q:Z

    return-void
.end method

.method public N(I)Liz0;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Liz0;->Q:LXy0;

    iget-object v0, p1, LXy0;->f:LXy0;

    if-eqz v0, :cond_1

    iget-object v1, v0, LXy0;->f:LXy0;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, LXy0;->d:Liz0;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Liz0;->R:LXy0;

    iget-object v0, p1, LXy0;->f:LXy0;

    if-eqz v0, :cond_1

    iget-object v1, v0, LXy0;->f:LXy0;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, LXy0;->d:Liz0;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public N0(IIII)V
    .locals 2

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    iput p1, p0, Liz0;->h0:I

    iput p2, p0, Liz0;->i0:I

    iget p1, p0, Liz0;->u0:I

    const/16 p2, 0x8

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput v0, p0, Liz0;->d0:I

    iput v0, p0, Liz0;->e0:I

    return-void

    :cond_0
    iget-object p1, p0, Liz0;->b0:[Liz0$b;

    aget-object p2, p1, v0

    sget-object v0, Liz0$b;->b:Liz0$b;

    if-ne p2, v0, :cond_1

    iget v1, p0, Liz0;->d0:I

    if-ge p3, v1, :cond_1

    move p3, v1

    :cond_1
    const/4 v1, 0x1

    aget-object p1, p1, v1

    if-ne p1, v0, :cond_2

    iget p1, p0, Liz0;->e0:I

    if-ge p4, p1, :cond_2

    move p4, p1

    :cond_2
    iput p3, p0, Liz0;->d0:I

    iput p4, p0, Liz0;->e0:I

    iget p1, p0, Liz0;->p0:I

    if-ge p4, p1, :cond_3

    iput p1, p0, Liz0;->e0:I

    :cond_3
    iget p1, p0, Liz0;->o0:I

    if-ge p3, p1, :cond_4

    iput p1, p0, Liz0;->d0:I

    :cond_4
    iget p1, p0, Liz0;->A:I

    if-lez p1, :cond_5

    sget-object v0, Liz0$b;->d:Liz0$b;

    if-ne p2, v0, :cond_5

    iget p2, p0, Liz0;->d0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Liz0;->d0:I

    :cond_5
    iget p1, p0, Liz0;->D:I

    if-lez p1, :cond_6

    iget-object p2, p0, Liz0;->b0:[Liz0$b;

    aget-object p2, p2, v1

    sget-object v0, Liz0$b;->d:Liz0$b;

    if-ne p2, v0, :cond_6

    iget p2, p0, Liz0;->e0:I

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Liz0;->e0:I

    :cond_6
    iget p1, p0, Liz0;->d0:I

    if-eq p3, p1, :cond_7

    iput p1, p0, Liz0;->l:I

    :cond_7
    iget p1, p0, Liz0;->e0:I

    if-eq p4, p1, :cond_8

    iput p1, p0, Liz0;->m:I

    :cond_8
    return-void
.end method

.method public O()I
    .locals 2

    invoke-virtual {p0}, Liz0;->Z()I

    move-result v0

    iget v1, p0, Liz0;->d0:I

    add-int/2addr v0, v1

    return v0
.end method

.method public O0(Z)V
    .locals 0

    iput-boolean p1, p0, Liz0;->L:Z

    return-void
.end method

.method public P(I)LgB6;
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Liz0;->e:LeN1;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Liz0;->f:LKo6;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public P0(I)V
    .locals 1

    iput p1, p0, Liz0;->e0:I

    iget v0, p0, Liz0;->p0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Liz0;->e0:I

    :cond_0
    return-void
.end method

.method public Q(Ljava/lang/StringBuilder;)V
    .locals 12

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Liz0;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":{\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "    actualWidth:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Liz0;->d0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "    actualHeight:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Liz0;->e0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "    actualLeft:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Liz0;->h0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "    actualTop:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Liz0;->i0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "left"

    iget-object v1, p0, Liz0;->Q:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v0, "top"

    iget-object v1, p0, Liz0;->R:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v0, "right"

    iget-object v1, p0, Liz0;->S:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v0, "bottom"

    iget-object v1, p0, Liz0;->T:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v0, "baseline"

    iget-object v1, p0, Liz0;->U:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v0, "centerX"

    iget-object v1, p0, Liz0;->V:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v0, "centerY"

    iget-object v1, p0, Liz0;->W:LXy0;

    invoke-virtual {p0, p1, v0, v1}, Liz0;->S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V

    const-string v2, "    width"

    iget v3, p0, Liz0;->d0:I

    iget v4, p0, Liz0;->o0:I

    iget-object v0, p0, Liz0;->J:[I

    const/4 v11, 0x0

    aget v5, v0, v11

    iget v6, p0, Liz0;->l:I

    iget v7, p0, Liz0;->z:I

    iget v8, p0, Liz0;->w:I

    iget v9, p0, Liz0;->B:F

    iget-object v0, p0, Liz0;->N0:[F

    aget v10, v0, v11

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v10}, Liz0;->R(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFF)V

    const-string v2, "    height"

    iget v3, p0, Liz0;->e0:I

    iget v4, p0, Liz0;->p0:I

    iget-object v0, p0, Liz0;->J:[I

    const/4 v1, 0x1

    aget v5, v0, v1

    iget v6, p0, Liz0;->m:I

    iget v7, p0, Liz0;->C:I

    iget v8, p0, Liz0;->x:I

    iget v9, p0, Liz0;->E:F

    iget-object v0, p0, Liz0;->N0:[F

    aget v10, v0, v1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v10}, Liz0;->R(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFF)V

    iget v0, p0, Liz0;->f0:F

    iget v1, p0, Liz0;->g0:I

    const-string v2, "    dimensionRatio"

    invoke-virtual {p0, p1, v2, v0, v1}, Liz0;->C0(Ljava/lang/StringBuilder;Ljava/lang/String;FI)V

    iget v0, p0, Liz0;->q0:F

    sget v1, Liz0;->U0:F

    const-string v2, "    horizontalBias"

    invoke-virtual {p0, p1, v2, v0, v1}, Liz0;->A0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    iget v0, p0, Liz0;->r0:F

    sget v1, Liz0;->U0:F

    const-string v2, "    verticalBias"

    invoke-virtual {p0, p1, v2, v0, v1}, Liz0;->A0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string v0, "    horizontalChainStyle"

    iget v1, p0, Liz0;->J0:I

    invoke-virtual {p0, p1, v0, v1, v11}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string v0, "    verticalChainStyle"

    iget v1, p0, Liz0;->K0:I

    invoke-virtual {p0, p1, v0, v1, v11}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string v0, "  }"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public Q0(F)V
    .locals 0

    iput p1, p0, Liz0;->q0:F

    return-void
.end method

.method public final R(Ljava/lang/StringBuilder;Ljava/lang/String;IIIIIIFF)V
    .locals 0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " :  {\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "      size"

    const/4 p6, 0x0

    invoke-virtual {p0, p1, p2, p3, p6}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      min"

    invoke-virtual {p0, p1, p2, p4, p6}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      max"

    const p3, 0x7fffffff

    invoke-virtual {p0, p1, p2, p5, p3}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      matchMin"

    invoke-virtual {p0, p1, p2, p7, p6}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      matchDef"

    invoke-virtual {p0, p1, p2, p8, p6}, Liz0;->B0(Ljava/lang/StringBuilder;Ljava/lang/String;II)V

    const-string p2, "      matchPercent"

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, p2, p9, p3}, Liz0;->A0(Ljava/lang/StringBuilder;Ljava/lang/String;FF)V

    const-string p2, "    },\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public R0(I)V
    .locals 0

    iput p1, p0, Liz0;->J0:I

    return-void
.end method

.method public final S(Ljava/lang/StringBuilder;Ljava/lang/String;LXy0;)V
    .locals 2

    iget-object v0, p3, LXy0;->f:LXy0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "    "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " : [ \'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p3, LXy0;->f:LXy0;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p3, LXy0;->h:I

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_1

    iget p2, p3, LXy0;->g:I

    if-eqz p2, :cond_2

    :cond_1
    const-string p2, ","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p3, LXy0;->g:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p3, LXy0;->h:I

    if-eq v1, v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p3, LXy0;->h:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string p2, " ] ,\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public S0(II)V
    .locals 0

    iput p1, p0, Liz0;->h0:I

    sub-int/2addr p2, p1

    iput p2, p0, Liz0;->d0:I

    iget p1, p0, Liz0;->o0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Liz0;->d0:I

    :cond_0
    return-void
.end method

.method public T()F
    .locals 1

    iget v0, p0, Liz0;->r0:F

    return v0
.end method

.method public T0(Liz0$b;)V
    .locals 2

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public U()I
    .locals 1

    iget v0, p0, Liz0;->K0:I

    return v0
.end method

.method public U0(IIIF)V
    .locals 0

    iput p1, p0, Liz0;->w:I

    iput p2, p0, Liz0;->z:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Liz0;->A:I

    iput p4, p0, Liz0;->B:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Liz0;->w:I

    :cond_1
    return-void
.end method

.method public V()Liz0$b;
    .locals 2

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public V0(F)V
    .locals 2

    iget-object v0, p0, Liz0;->N0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public W()I
    .locals 2

    iget-object v0, p0, Liz0;->Q:LXy0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liz0;->R:LXy0;

    iget v0, v0, LXy0;->g:I

    add-int/2addr v1, v0

    :cond_0
    iget-object v0, p0, Liz0;->S:LXy0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Liz0;->T:LXy0;

    iget v0, v0, LXy0;->g:I

    add-int/2addr v1, v0

    :cond_1
    return v1
.end method

.method public W0(IZ)V
    .locals 1

    iget-object v0, p0, Liz0;->a0:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public X()I
    .locals 1

    iget v0, p0, Liz0;->u0:I

    return v0
.end method

.method public X0(Z)V
    .locals 0

    iput-boolean p1, p0, Liz0;->M:Z

    return-void
.end method

.method public Y()I
    .locals 2

    iget v0, p0, Liz0;->u0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Liz0;->d0:I

    return v0
.end method

.method public Y0(Z)V
    .locals 0

    iput-boolean p1, p0, Liz0;->N:Z

    return-void
.end method

.method public Z()I
    .locals 2

    iget-object v0, p0, Liz0;->c0:Liz0;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ljz0;

    if-eqz v1, :cond_0

    check-cast v0, Ljz0;

    iget v0, v0, Ljz0;->d1:I

    iget v1, p0, Liz0;->h0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Liz0;->h0:I

    return v0
.end method

.method public Z0(II)V
    .locals 0

    iput p1, p0, Liz0;->O:I

    iput p2, p0, Liz0;->P:I

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Liz0;->c1(Z)V

    return-void
.end method

.method public a0()I
    .locals 2

    iget-object v0, p0, Liz0;->c0:Liz0;

    if-eqz v0, :cond_0

    instance-of v1, v0, Ljz0;

    if-eqz v1, :cond_0

    check-cast v0, Ljz0;

    iget v0, v0, Ljz0;->e1:I

    iget v1, p0, Liz0;->i0:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Liz0;->i0:I

    return v0
.end method

.method public a1(I)V
    .locals 2

    iget-object v0, p0, Liz0;->J:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public b0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->L:Z

    return v0
.end method

.method public b1(I)V
    .locals 2

    iget-object v0, p0, Liz0;->J:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public c0(I)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    iget-object p1, p0, Liz0;->Q:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget-object v3, p0, Liz0;->S:LXy0;

    iget-object v3, v3, LXy0;->f:LXy0;

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    return v1

    :cond_3
    iget-object p1, p0, Liz0;->R:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    if-eqz p1, :cond_4

    move p1, v1

    goto :goto_3

    :cond_4
    move p1, v2

    :goto_3
    iget-object v3, p0, Liz0;->T:LXy0;

    iget-object v3, v3, LXy0;->f:LXy0;

    if-eqz v3, :cond_5

    move v3, v1

    goto :goto_4

    :cond_5
    move v3, v2

    :goto_4
    add-int/2addr p1, v3

    iget-object v3, p0, Liz0;->U:LXy0;

    iget-object v3, v3, LXy0;->f:LXy0;

    if-eqz v3, :cond_6

    move v3, v1

    goto :goto_5

    :cond_6
    move v3, v2

    :goto_5
    add-int/2addr p1, v3

    if-ge p1, v0, :cond_7

    goto :goto_6

    :cond_7
    move v1, v2

    :goto_6
    return v1
.end method

.method public c1(Z)V
    .locals 0

    iput-boolean p1, p0, Liz0;->i:Z

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->R:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->S:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->T:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->V:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->W:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->X:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    iget-object v1, p0, Liz0;->U:LXy0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d0()Z
    .locals 4

    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Liz0;->Z:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXy0;

    invoke-virtual {v3}, LXy0;->m()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public d1(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Liz0;->p0:I

    goto :goto_0

    :cond_0
    iput p1, p0, Liz0;->p0:I

    :goto_0
    return-void
.end method

.method public e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljz0;",
            "LLr2;",
            "Ljava/util/HashSet<",
            "Liz0;",
            ">;IZ)V"
        }
    .end annotation

    if-eqz p5, :cond_1

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p0}, Lhy3;->a(Ljz0;LLr2;Liz0;)V

    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/16 p5, 0x40

    invoke-virtual {p1, p5}, Ljz0;->Y1(I)Z

    move-result p5

    invoke-virtual {p0, p2, p5}, Liz0;->g(LLr2;Z)V

    :cond_1
    if-nez p4, :cond_3

    iget-object p5, p0, Liz0;->Q:LXy0;

    invoke-virtual {p5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v1, v0, LXy0;->d:Liz0;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Liz0;->e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V

    goto :goto_0

    :cond_2
    iget-object p5, p0, Liz0;->S:LXy0;

    invoke-virtual {p5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v1, v0, LXy0;->d:Liz0;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Liz0;->e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V

    goto :goto_1

    :cond_3
    iget-object p5, p0, Liz0;->R:LXy0;

    invoke-virtual {p5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_4

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_2
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v1, v0, LXy0;->d:Liz0;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Liz0;->e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V

    goto :goto_2

    :cond_4
    iget-object p5, p0, Liz0;->T:LXy0;

    invoke-virtual {p5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_5

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_3
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v1, v0, LXy0;->d:Liz0;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Liz0;->e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V

    goto :goto_3

    :cond_5
    iget-object p5, p0, Liz0;->U:LXy0;

    invoke-virtual {p5}, LXy0;->d()Ljava/util/HashSet;

    move-result-object p5

    if-eqz p5, :cond_6

    invoke-virtual {p5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_4
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXy0;

    iget-object v1, v0, LXy0;->d:Liz0;

    const/4 v6, 0x1

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Liz0;->e(Ljz0;LLr2;Ljava/util/HashSet;IZ)V

    goto :goto_4

    :cond_6
    return-void
.end method

.method public e0()Z
    .locals 2

    iget v0, p0, Liz0;->l:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Liz0;->m:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e1(I)V
    .locals 0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Liz0;->o0:I

    goto :goto_0

    :cond_0
    iput p1, p0, Liz0;->o0:I

    :goto_0
    return-void
.end method

.method public f()Z
    .locals 1

    instance-of v0, p0, Lzu6;

    if-nez v0, :cond_1

    instance-of v0, p0, LwE1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f0(II)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Liz0;->Q:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LXy0;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Liz0;->S:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LXy0;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Liz0;->S:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    invoke-virtual {p1}, LXy0;->e()I

    move-result p1

    iget-object v2, p0, Liz0;->S:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Liz0;->Q:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    iget-object v3, p0, Liz0;->Q:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    iget-object p1, p0, Liz0;->R:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LXy0;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Liz0;->T:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LXy0;->n()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Liz0;->T:LXy0;

    iget-object p1, p1, LXy0;->f:LXy0;

    invoke-virtual {p1}, LXy0;->e()I

    move-result p1

    iget-object v2, p0, Liz0;->T:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    sub-int/2addr p1, v2

    iget-object v2, p0, Liz0;->R:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    invoke-virtual {v2}, LXy0;->e()I

    move-result v2

    iget-object v3, p0, Liz0;->R:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    add-int/2addr v2, v3

    sub-int/2addr p1, v2

    if-lt p1, p2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    return v0

    :cond_3
    return v1
.end method

.method public f1(II)V
    .locals 0

    iput p1, p0, Liz0;->h0:I

    iput p2, p0, Liz0;->i0:I

    return-void
.end method

.method public g(LLr2;Z)V
    .locals 53

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    iget-object v0, v15, Liz0;->Q:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v13

    iget-object v0, v15, Liz0;->S:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v12

    iget-object v0, v15, Liz0;->R:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v11

    iget-object v0, v15, Liz0;->T:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v10

    iget-object v0, v15, Liz0;->U:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v9

    iget-object v0, v15, Liz0;->c0:Liz0;

    const/4 v8, 0x2

    const/4 v1, 0x3

    const/4 v7, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_4

    if-eqz v0, :cond_0

    iget-object v2, v0, Liz0;->b0:[Liz0$b;

    aget-object v2, v2, v6

    sget-object v3, Liz0$b;->c:Liz0$b;

    if-ne v2, v3, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Liz0;->b0:[Liz0$b;

    aget-object v0, v0, v7

    sget-object v3, Liz0$b;->c:Liz0$b;

    if-ne v0, v3, :cond_1

    move v0, v7

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    iget v3, v15, Liz0;->v:I

    if-eq v3, v7, :cond_3

    if-eq v3, v8, :cond_2

    if-eq v3, v1, :cond_4

    move v5, v0

    move v4, v2

    goto :goto_2

    :cond_2
    move v5, v0

    move v4, v6

    goto :goto_2

    :cond_3
    move v4, v2

    move v5, v6

    goto :goto_2

    :cond_4
    move v4, v6

    move v5, v4

    :goto_2
    iget v0, v15, Liz0;->u0:I

    const/16 v3, 0x8

    if-ne v0, v3, :cond_5

    iget-boolean v0, v15, Liz0;->v0:Z

    if-nez v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Liz0;->d0()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v15, Liz0;->a0:[Z

    aget-boolean v2, v0, v6

    if-nez v2, :cond_5

    aget-boolean v0, v0, v7

    if-nez v0, :cond_5

    return-void

    :cond_5
    iget-boolean v0, v15, Liz0;->p:Z

    const/4 v2, 0x5

    if-nez v0, :cond_6

    iget-boolean v8, v15, Liz0;->q:Z

    if-eqz v8, :cond_c

    :cond_6
    if-eqz v0, :cond_8

    iget v0, v15, Liz0;->h0:I

    invoke-virtual {v14, v13, v0}, LLr2;->f(LrN5;I)V

    iget v0, v15, Liz0;->h0:I

    iget v8, v15, Liz0;->d0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v12, v0}, LLr2;->f(LrN5;I)V

    if-eqz v4, :cond_8

    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_8

    iget-boolean v8, v15, Liz0;->k:Z

    if-eqz v8, :cond_7

    check-cast v0, Ljz0;

    iget-object v8, v15, Liz0;->Q:LXy0;

    invoke-virtual {v0, v8}, Ljz0;->D1(LXy0;)V

    iget-object v8, v15, Liz0;->S:LXy0;

    invoke-virtual {v0, v8}, Ljz0;->C1(LXy0;)V

    goto :goto_3

    :cond_7
    iget-object v0, v0, Liz0;->S:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v6, v2}, LLr2;->h(LrN5;LrN5;II)V

    :cond_8
    :goto_3
    iget-boolean v0, v15, Liz0;->q:Z

    if-eqz v0, :cond_b

    iget v0, v15, Liz0;->i0:I

    invoke-virtual {v14, v11, v0}, LLr2;->f(LrN5;I)V

    iget v0, v15, Liz0;->i0:I

    iget v8, v15, Liz0;->e0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v10, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->U:LXy0;

    invoke-virtual {v0}, LXy0;->m()Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, v15, Liz0;->i0:I

    iget v8, v15, Liz0;->n0:I

    add-int/2addr v0, v8

    invoke-virtual {v14, v9, v0}, LLr2;->f(LrN5;I)V

    :cond_9
    if-eqz v5, :cond_b

    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_b

    iget-boolean v8, v15, Liz0;->k:Z

    if-eqz v8, :cond_a

    check-cast v0, Ljz0;

    iget-object v8, v15, Liz0;->R:LXy0;

    invoke-virtual {v0, v8}, Ljz0;->I1(LXy0;)V

    iget-object v8, v15, Liz0;->T:LXy0;

    invoke-virtual {v0, v8}, Ljz0;->H1(LXy0;)V

    goto :goto_4

    :cond_a
    iget-object v0, v0, Liz0;->T:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v6, v2}, LLr2;->h(LrN5;LrN5;II)V

    :cond_b
    :goto_4
    iget-boolean v0, v15, Liz0;->p:Z

    if-eqz v0, :cond_c

    iget-boolean v0, v15, Liz0;->q:Z

    if-eqz v0, :cond_c

    iput-boolean v6, v15, Liz0;->p:Z

    iput-boolean v6, v15, Liz0;->q:Z

    return-void

    :cond_c
    sget-object v0, LLr2;->x:LbU2;

    const-wide/16 v17, 0x1

    if-eqz v0, :cond_d

    iget-wide v1, v0, LbU2;->z:J

    add-long v1, v1, v17

    iput-wide v1, v0, LbU2;->z:J

    :cond_d
    if-eqz p2, :cond_11

    iget-object v1, v15, Liz0;->e:LeN1;

    if-eqz v1, :cond_11

    iget-object v2, v15, Liz0;->f:LKo6;

    if-eqz v2, :cond_11

    iget-object v8, v1, LgB6;->h:Lp01;

    iget-boolean v7, v8, Lp01;->j:Z

    if-eqz v7, :cond_11

    iget-object v1, v1, LgB6;->i:Lp01;

    iget-boolean v1, v1, Lp01;->j:Z

    if-eqz v1, :cond_11

    iget-object v1, v2, LgB6;->h:Lp01;

    iget-boolean v1, v1, Lp01;->j:Z

    if-eqz v1, :cond_11

    iget-object v1, v2, LgB6;->i:Lp01;

    iget-boolean v1, v1, Lp01;->j:Z

    if-eqz v1, :cond_11

    if-eqz v0, :cond_e

    iget-wide v1, v0, LbU2;->r:J

    add-long v1, v1, v17

    iput-wide v1, v0, LbU2;->r:J

    :cond_e
    iget v0, v8, Lp01;->g:I

    invoke-virtual {v14, v13, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget v0, v0, Lp01;->g:I

    invoke-virtual {v14, v12, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->h:Lp01;

    iget v0, v0, Lp01;->g:I

    invoke-virtual {v14, v11, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget v0, v0, Lp01;->g:I

    invoke-virtual {v14, v10, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->f:LKo6;

    iget-object v0, v0, LKo6;->k:Lp01;

    iget v0, v0, Lp01;->g:I

    invoke-virtual {v14, v9, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_10

    if-eqz v4, :cond_f

    iget-object v0, v15, Liz0;->g:[Z

    aget-boolean v0, v0, v6

    if-eqz v0, :cond_f

    invoke-virtual/range {p0 .. p0}, Liz0;->k0()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, v15, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->S:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    invoke-virtual {v14, v0, v12, v6, v3}, LLr2;->h(LrN5;LrN5;II)V

    :cond_f
    if-eqz v5, :cond_10

    iget-object v0, v15, Liz0;->g:[Z

    const/4 v1, 0x1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_10

    invoke-virtual/range {p0 .. p0}, Liz0;->m0()Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, v15, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->T:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    invoke-virtual {v14, v0, v10, v6, v3}, LLr2;->h(LrN5;LrN5;II)V

    :cond_10
    iput-boolean v6, v15, Liz0;->p:Z

    iput-boolean v6, v15, Liz0;->q:Z

    return-void

    :cond_11
    if-eqz v0, :cond_12

    iget-wide v1, v0, LbU2;->s:J

    add-long v1, v1, v17

    iput-wide v1, v0, LbU2;->s:J

    :cond_12
    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_17

    invoke-virtual {v15, v6}, Liz0;->h0(I)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, v15, Liz0;->c0:Liz0;

    check-cast v0, Ljz0;

    invoke-virtual {v0, v15, v6}, Ljz0;->z1(Liz0;I)V

    const/4 v0, 0x1

    goto :goto_5

    :cond_13
    invoke-virtual/range {p0 .. p0}, Liz0;->k0()Z

    move-result v0

    :goto_5
    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Liz0;->h0(I)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, v15, Liz0;->c0:Liz0;

    check-cast v2, Ljz0;

    invoke-virtual {v2, v15, v1}, Ljz0;->z1(Liz0;I)V

    const/4 v1, 0x1

    goto :goto_6

    :cond_14
    invoke-virtual/range {p0 .. p0}, Liz0;->m0()Z

    move-result v1

    :goto_6
    if-nez v0, :cond_15

    if-eqz v4, :cond_15

    iget v2, v15, Liz0;->u0:I

    if-eq v2, v3, :cond_15

    iget-object v2, v15, Liz0;->Q:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    if-nez v2, :cond_15

    iget-object v2, v15, Liz0;->S:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    if-nez v2, :cond_15

    iget-object v2, v15, Liz0;->c0:Liz0;

    iget-object v2, v2, Liz0;->S:LXy0;

    invoke-virtual {v14, v2}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v2

    const/4 v7, 0x1

    invoke-virtual {v14, v2, v12, v6, v7}, LLr2;->h(LrN5;LrN5;II)V

    :cond_15
    if-nez v1, :cond_16

    if-eqz v5, :cond_16

    iget v2, v15, Liz0;->u0:I

    if-eq v2, v3, :cond_16

    iget-object v2, v15, Liz0;->R:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    if-nez v2, :cond_16

    iget-object v2, v15, Liz0;->T:LXy0;

    iget-object v2, v2, LXy0;->f:LXy0;

    if-nez v2, :cond_16

    iget-object v2, v15, Liz0;->U:LXy0;

    if-nez v2, :cond_16

    iget-object v2, v15, Liz0;->c0:Liz0;

    iget-object v2, v2, Liz0;->T:LXy0;

    invoke-virtual {v14, v2}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v2

    const/4 v7, 0x1

    invoke-virtual {v14, v2, v10, v6, v7}, LLr2;->h(LrN5;LrN5;II)V

    :cond_16
    move/from16 v29, v0

    move/from16 v28, v1

    goto :goto_7

    :cond_17
    move/from16 v28, v6

    move/from16 v29, v28

    :goto_7
    iget v0, v15, Liz0;->d0:I

    iget v1, v15, Liz0;->o0:I

    if-ge v0, v1, :cond_18

    goto :goto_8

    :cond_18
    move v1, v0

    :goto_8
    iget v2, v15, Liz0;->e0:I

    iget v7, v15, Liz0;->p0:I

    if-ge v2, v7, :cond_19

    goto :goto_9

    :cond_19
    move v7, v2

    :goto_9
    iget-object v8, v15, Liz0;->b0:[Liz0$b;

    aget-object v3, v8, v6

    sget-object v6, Liz0$b;->d:Liz0$b;

    move/from16 v22, v1

    if-eq v3, v6, :cond_1a

    const/4 v1, 0x1

    goto :goto_a

    :cond_1a
    const/4 v1, 0x0

    :goto_a
    const/16 v21, 0x1

    aget-object v8, v8, v21

    move/from16 v23, v7

    move-object/from16 v27, v9

    if-eq v8, v6, :cond_1b

    const/4 v7, 0x1

    goto :goto_b

    :cond_1b
    const/4 v7, 0x0

    :goto_b
    iget v9, v15, Liz0;->g0:I

    iput v9, v15, Liz0;->H:I

    move-object/from16 v30, v10

    iget v10, v15, Liz0;->f0:F

    iput v10, v15, Liz0;->I:F

    move-object/from16 v31, v11

    iget v11, v15, Liz0;->w:I

    move-object/from16 v32, v12

    iget v12, v15, Liz0;->x:I

    const/16 v24, 0x0

    cmpl-float v24, v10, v24

    move-object/from16 v33, v13

    if-lez v24, :cond_25

    iget v13, v15, Liz0;->u0:I

    const/16 v14, 0x8

    if-eq v13, v14, :cond_25

    if-ne v3, v6, :cond_1c

    if-nez v11, :cond_1c

    const/4 v11, 0x3

    :cond_1c
    if-ne v8, v6, :cond_1d

    if-nez v12, :cond_1d

    const/4 v12, 0x3

    :cond_1d
    if-ne v3, v6, :cond_1e

    if-ne v8, v6, :cond_1e

    const/4 v13, 0x3

    if-ne v11, v13, :cond_1f

    if-ne v12, v13, :cond_1f

    invoke-virtual {v15, v4, v5, v1, v7}, Liz0;->s1(ZZZZ)V

    goto :goto_c

    :cond_1e
    const/4 v13, 0x3

    :cond_1f
    const/4 v1, 0x4

    if-ne v3, v6, :cond_21

    if-ne v11, v13, :cond_21

    const/4 v7, 0x0

    iput v7, v15, Liz0;->H:I

    int-to-float v0, v2

    mul-float/2addr v10, v0

    float-to-int v0, v10

    if-eq v8, v6, :cond_20

    move/from16 v36, v1

    move/from16 v35, v12

    move/from16 v34, v23

    const/4 v14, 0x0

    move v1, v0

    goto :goto_10

    :cond_20
    move v1, v0

    move/from16 v36, v11

    move/from16 v35, v12

    goto :goto_d

    :cond_21
    if-ne v8, v6, :cond_24

    if-ne v12, v13, :cond_24

    const/4 v2, 0x1

    iput v2, v15, Liz0;->H:I

    const/4 v2, -0x1

    if-ne v9, v2, :cond_22

    const/high16 v2, 0x3f800000    # 1.0f

    div-float/2addr v2, v10

    iput v2, v15, Liz0;->I:F

    :cond_22
    iget v2, v15, Liz0;->I:F

    int-to-float v0, v0

    mul-float/2addr v2, v0

    float-to-int v7, v2

    if-eq v3, v6, :cond_23

    move/from16 v35, v1

    move/from16 v34, v7

    move/from16 v36, v11

    move/from16 v1, v22

    goto :goto_f

    :cond_23
    move/from16 v34, v7

    move/from16 v36, v11

    move/from16 v35, v12

    move/from16 v1, v22

    goto :goto_e

    :cond_24
    :goto_c
    move/from16 v36, v11

    move/from16 v35, v12

    move/from16 v1, v22

    :goto_d
    move/from16 v34, v23

    :goto_e
    const/4 v14, 0x1

    goto :goto_10

    :cond_25
    move/from16 v36, v11

    move/from16 v35, v12

    move/from16 v1, v22

    move/from16 v34, v23

    :goto_f
    const/4 v14, 0x0

    :goto_10
    iget-object v0, v15, Liz0;->y:[I

    const/4 v2, 0x0

    aput v36, v0, v2

    const/4 v2, 0x1

    aput v35, v0, v2

    iput-boolean v14, v15, Liz0;->h:Z

    if-eqz v14, :cond_27

    iget v0, v15, Liz0;->H:I

    const/4 v2, -0x1

    if-eqz v0, :cond_26

    if-ne v0, v2, :cond_28

    :cond_26
    const/16 v20, 0x1

    goto :goto_11

    :cond_27
    const/4 v2, -0x1

    :cond_28
    const/16 v20, 0x0

    :goto_11
    if-eqz v14, :cond_2a

    iget v0, v15, Liz0;->H:I

    const/4 v3, 0x1

    if-eq v0, v3, :cond_29

    if-ne v0, v2, :cond_2a

    :cond_29
    const/16 v37, 0x1

    goto :goto_12

    :cond_2a
    const/16 v37, 0x0

    :goto_12
    iget-object v0, v15, Liz0;->b0:[Liz0$b;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    sget-object v13, Liz0$b;->c:Liz0$b;

    if-ne v0, v13, :cond_2b

    instance-of v0, v15, Ljz0;

    if-eqz v0, :cond_2b

    const/4 v9, 0x1

    goto :goto_13

    :cond_2b
    const/4 v9, 0x0

    :goto_13
    if-eqz v9, :cond_2c

    const/16 v22, 0x0

    goto :goto_14

    :cond_2c
    move/from16 v22, v1

    :goto_14
    iget-object v0, v15, Liz0;->X:LXy0;

    invoke-virtual {v0}, LXy0;->o()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v38, v0, 0x1

    iget-object v0, v15, Liz0;->a0:[Z

    const/4 v2, 0x0

    aget-boolean v23, v0, v2

    aget-boolean v39, v0, v1

    iget v0, v15, Liz0;->t:I

    const/16 v40, 0x0

    const/4 v8, 0x2

    if-eq v0, v8, :cond_34

    iget-boolean v0, v15, Liz0;->p:Z

    if-nez v0, :cond_34

    if-eqz p2, :cond_30

    iget-object v0, v15, Liz0;->e:LeN1;

    if-eqz v0, :cond_30

    iget-object v1, v0, LgB6;->h:Lp01;

    iget-boolean v2, v1, Lp01;->j:Z

    if-eqz v2, :cond_30

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-boolean v0, v0, Lp01;->j:Z

    if-nez v0, :cond_2d

    goto :goto_15

    :cond_2d
    if-eqz p2, :cond_2f

    iget v0, v1, Lp01;->g:I

    move-object/from16 v12, p1

    move-object/from16 v11, v33

    invoke-virtual {v12, v11, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->e:LeN1;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget v0, v0, Lp01;->g:I

    move-object/from16 v10, v32

    invoke-virtual {v12, v10, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_2e

    if-eqz v4, :cond_2e

    iget-object v0, v15, Liz0;->g:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_2e

    invoke-virtual/range {p0 .. p0}, Liz0;->k0()Z

    move-result v0

    if-nez v0, :cond_2e

    iget-object v0, v15, Liz0;->c0:Liz0;

    iget-object v0, v0, Liz0;->S:LXy0;

    invoke-virtual {v12, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v12, v0, v10, v1, v3}, LLr2;->h(LrN5;LrN5;II)V

    :cond_2e
    move/from16 v43, v4

    move/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v13

    move/from16 v32, v14

    move-object/from16 v49, v27

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v30, v10

    move-object/from16 v31, v11

    goto/16 :goto_1a

    :cond_2f
    move-object/from16 v12, p1

    goto/16 :goto_19

    :cond_30
    :goto_15
    move-object/from16 v12, p1

    move-object/from16 v10, v32

    move-object/from16 v11, v33

    const/16 v3, 0x8

    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_31

    iget-object v0, v0, Liz0;->S:LXy0;

    invoke-virtual {v12, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    move-object v7, v0

    goto :goto_16

    :cond_31
    move-object/from16 v7, v40

    :goto_16
    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_32

    iget-object v0, v0, Liz0;->Q:LXy0;

    invoke-virtual {v12, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_17

    :cond_32
    move-object/from16 v16, v40

    :goto_17
    iget-object v0, v15, Liz0;->g:[Z

    const/16 v17, 0x0

    aget-boolean v18, v0, v17

    iget-object v0, v15, Liz0;->b0:[Liz0$b;

    aget-object v32, v0, v17

    iget-object v1, v15, Liz0;->Q:LXy0;

    iget-object v2, v15, Liz0;->S:LXy0;

    move-object/from16 v41, v2

    iget v2, v15, Liz0;->h0:I

    move/from16 v42, v2

    iget v2, v15, Liz0;->o0:I

    iget-object v3, v15, Liz0;->J:[I

    aget v44, v3, v17

    iget v3, v15, Liz0;->q0:F

    const/16 v21, 0x1

    aget-object v0, v0, v21

    if-ne v0, v6, :cond_33

    move/from16 v45, v21

    goto :goto_18

    :cond_33
    move/from16 v45, v17

    :goto_18
    iget v0, v15, Liz0;->z:I

    move/from16 v24, v0

    iget v0, v15, Liz0;->A:I

    move/from16 v25, v0

    iget v0, v15, Liz0;->B:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move-object/from16 v46, v1

    move-object/from16 v1, p1

    move-object/from16 v19, v41

    move/from16 v33, v42

    move/from16 v41, v2

    const/4 v2, 0x1

    move/from16 v42, v3

    move v3, v4

    move/from16 v43, v4

    move v4, v5

    move/from16 v47, v5

    move/from16 v5, v18

    move-object/from16 v48, v6

    move-object/from16 v6, v16

    move-object/from16 v8, v32

    move-object/from16 v49, v27

    move-object/from16 v16, v10

    move-object/from16 v50, v30

    move-object/from16 v10, v46

    move-object/from16 v17, v11

    move-object/from16 v51, v31

    move-object/from16 v11, v19

    move-object/from16 v30, v16

    move/from16 v12, v33

    move-object/from16 v52, v13

    move-object/from16 v31, v17

    move/from16 v13, v22

    move/from16 v32, v14

    move/from16 v14, v41

    move/from16 v15, v44

    move/from16 v16, v42

    move/from16 v17, v20

    move/from16 v18, v45

    move/from16 v19, v29

    move/from16 v20, v28

    move/from16 v21, v23

    move/from16 v22, v36

    move/from16 v23, v35

    move/from16 v27, v38

    invoke-virtual/range {v0 .. v27}, Liz0;->i(LLr2;ZZZZLrN5;LrN5;Liz0$b;ZLXy0;LXy0;IIIIFZZZZZIIIIFZ)V

    goto :goto_1a

    :cond_34
    :goto_19
    move/from16 v43, v4

    move/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v52, v13

    move-object/from16 v49, v27

    move-object/from16 v50, v30

    move-object/from16 v51, v31

    move-object/from16 v30, v32

    move-object/from16 v31, v33

    move/from16 v32, v14

    :goto_1a
    if-eqz p2, :cond_38

    move-object/from16 v15, p0

    iget-object v0, v15, Liz0;->f:LKo6;

    if-eqz v0, :cond_37

    iget-object v1, v0, LgB6;->h:Lp01;

    iget-boolean v2, v1, Lp01;->j:Z

    if-eqz v2, :cond_37

    iget-object v0, v0, LgB6;->i:Lp01;

    iget-boolean v0, v0, Lp01;->j:Z

    if-eqz v0, :cond_37

    iget v0, v1, Lp01;->g:I

    move-object/from16 v14, p1

    move-object/from16 v13, v51

    invoke-virtual {v14, v13, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->f:LKo6;

    iget-object v0, v0, LgB6;->i:Lp01;

    iget v0, v0, Lp01;->g:I

    move-object/from16 v12, v50

    invoke-virtual {v14, v12, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->f:LKo6;

    iget-object v0, v0, LKo6;->k:Lp01;

    iget v0, v0, Lp01;->g:I

    move-object/from16 v1, v49

    invoke-virtual {v14, v1, v0}, LLr2;->f(LrN5;I)V

    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_36

    if-nez v28, :cond_36

    if-eqz v47, :cond_36

    iget-object v2, v15, Liz0;->g:[Z

    const/4 v11, 0x1

    aget-boolean v2, v2, v11

    if-eqz v2, :cond_35

    iget-object v0, v0, Liz0;->T:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v10, 0x0

    invoke-virtual {v14, v0, v12, v10, v2}, LLr2;->h(LrN5;LrN5;II)V

    goto :goto_1b

    :cond_35
    const/16 v2, 0x8

    const/4 v10, 0x0

    goto :goto_1b

    :cond_36
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    :goto_1b
    move v7, v10

    goto :goto_1d

    :cond_37
    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_1c

    :cond_38
    const/16 v2, 0x8

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v1, v49

    move-object/from16 v12, v50

    move-object/from16 v13, v51

    :goto_1c
    move v7, v11

    :goto_1d
    iget v0, v15, Liz0;->u:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_39

    move v6, v10

    goto :goto_1e

    :cond_39
    move v6, v7

    :goto_1e
    if-eqz v6, :cond_44

    iget-boolean v0, v15, Liz0;->q:Z

    if-nez v0, :cond_44

    iget-object v0, v15, Liz0;->b0:[Liz0$b;

    aget-object v0, v0, v11

    move-object/from16 v3, v52

    if-ne v0, v3, :cond_3a

    instance-of v0, v15, Ljz0;

    if-eqz v0, :cond_3a

    move v9, v11

    goto :goto_1f

    :cond_3a
    move v9, v10

    :goto_1f
    if-eqz v9, :cond_3b

    move/from16 v34, v10

    :cond_3b
    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_3c

    iget-object v0, v0, Liz0;->T:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    move-object v7, v0

    goto :goto_20

    :cond_3c
    move-object/from16 v7, v40

    :goto_20
    iget-object v0, v15, Liz0;->c0:Liz0;

    if-eqz v0, :cond_3d

    iget-object v0, v0, Liz0;->R:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    move-object v6, v0

    goto :goto_21

    :cond_3d
    move-object/from16 v6, v40

    :goto_21
    iget v0, v15, Liz0;->n0:I

    if-gtz v0, :cond_3e

    iget v0, v15, Liz0;->u0:I

    if-ne v0, v2, :cond_42

    :cond_3e
    iget-object v0, v15, Liz0;->U:LXy0;

    iget-object v3, v0, LXy0;->f:LXy0;

    if-eqz v3, :cond_40

    invoke-virtual/range {p0 .. p0}, Liz0;->r()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    iget-object v0, v15, Liz0;->U:LXy0;

    iget-object v0, v0, LXy0;->f:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    iget-object v3, v15, Liz0;->U:LXy0;

    invoke-virtual {v3}, LXy0;->f()I

    move-result v3

    invoke-virtual {v14, v1, v0, v3, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    if-eqz v47, :cond_3f

    iget-object v0, v15, Liz0;->T:LXy0;

    invoke-virtual {v14, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v14, v7, v0, v10, v1}, LLr2;->h(LrN5;LrN5;II)V

    :cond_3f
    move/from16 v27, v10

    goto :goto_23

    :cond_40
    iget v3, v15, Liz0;->u0:I

    if-ne v3, v2, :cond_41

    invoke-virtual {v0}, LXy0;->f()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    goto :goto_22

    :cond_41
    invoke-virtual/range {p0 .. p0}, Liz0;->r()I

    move-result v0

    invoke-virtual {v14, v1, v13, v0, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_42
    :goto_22
    move/from16 v27, v38

    :goto_23
    iget-object v0, v15, Liz0;->g:[Z

    aget-boolean v5, v0, v11

    iget-object v0, v15, Liz0;->b0:[Liz0$b;

    aget-object v8, v0, v11

    iget-object v4, v15, Liz0;->R:LXy0;

    iget-object v3, v15, Liz0;->T:LXy0;

    iget v1, v15, Liz0;->i0:I

    iget v2, v15, Liz0;->p0:I

    iget-object v10, v15, Liz0;->J:[I

    aget v16, v10, v11

    iget v10, v15, Liz0;->r0:F

    const/16 v17, 0x0

    aget-object v0, v0, v17

    move-object/from16 v11, v48

    if-ne v0, v11, :cond_43

    const/16 v18, 0x1

    goto :goto_24

    :cond_43
    move/from16 v18, v17

    :goto_24
    iget v0, v15, Liz0;->C:I

    move/from16 v24, v0

    iget v0, v15, Liz0;->D:I

    move/from16 v25, v0

    iget v0, v15, Liz0;->E:F

    move/from16 v26, v0

    move-object/from16 v0, p0

    move/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v20, v2

    const/4 v2, 0x0

    move-object v11, v3

    move/from16 v3, v47

    move-object/from16 v21, v4

    move/from16 v4, v43

    move/from16 v17, v10

    move-object/from16 v10, v21

    move-object/from16 v33, v12

    move/from16 v12, v19

    move-object/from16 v38, v13

    move/from16 v13, v34

    move/from16 v14, v20

    move/from16 v15, v16

    move/from16 v16, v17

    move/from16 v17, v37

    move/from16 v19, v28

    move/from16 v20, v29

    move/from16 v21, v39

    move/from16 v22, v35

    move/from16 v23, v36

    invoke-virtual/range {v0 .. v27}, Liz0;->i(LLr2;ZZZZLrN5;LrN5;Liz0$b;ZLXy0;LXy0;IIIIFZZZZZIIIIFZ)V

    goto :goto_25

    :cond_44
    move-object/from16 v33, v12

    move-object/from16 v38, v13

    :goto_25
    if-eqz v32, :cond_46

    const/16 v6, 0x8

    move-object/from16 v7, p0

    iget v0, v7, Liz0;->H:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_45

    iget v5, v7, Liz0;->I:F

    move-object/from16 v0, p1

    move-object/from16 v1, v33

    move-object/from16 v2, v38

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-virtual/range {v0 .. v6}, LLr2;->k(LrN5;LrN5;LrN5;LrN5;FI)V

    goto :goto_26

    :cond_45
    iget v5, v7, Liz0;->I:F

    const/16 v6, 0x8

    move-object/from16 v0, p1

    move-object/from16 v1, v30

    move-object/from16 v2, v31

    move-object/from16 v3, v33

    move-object/from16 v4, v38

    invoke-virtual/range {v0 .. v6}, LLr2;->k(LrN5;LrN5;LrN5;LrN5;FI)V

    goto :goto_26

    :cond_46
    move-object/from16 v7, p0

    :goto_26
    iget-object v0, v7, Liz0;->X:LXy0;

    invoke-virtual {v0}, LXy0;->o()Z

    move-result v0

    if-eqz v0, :cond_47

    iget-object v0, v7, Liz0;->X:LXy0;

    invoke-virtual {v0}, LXy0;->j()LXy0;

    move-result-object v0

    invoke-virtual {v0}, LXy0;->h()Liz0;

    move-result-object v0

    iget v1, v7, Liz0;->K:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Liz0;->X:LXy0;

    invoke-virtual {v2}, LXy0;->f()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, LLr2;->b(Liz0;Liz0;FI)V

    :cond_47
    const/4 v0, 0x0

    iput-boolean v0, v7, Liz0;->p:Z

    iput-boolean v0, v7, Liz0;->q:Z

    return-void
.end method

.method public g0(LXy0$b;Liz0;LXy0$b;II)V
    .locals 0

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p4, p5, p3}, LXy0;->b(LXy0;IIZ)Z

    return-void
.end method

.method public g1(Liz0;)V
    .locals 0

    iput-object p1, p0, Liz0;->c0:Liz0;

    return-void
.end method

.method public h()Z
    .locals 2

    iget v0, p0, Liz0;->u0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h0(I)Z
    .locals 3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Liz0;->Y:[LXy0;

    aget-object v1, v0, p1

    iget-object v2, v1, LXy0;->f:LXy0;

    if-eqz v2, :cond_0

    iget-object v2, v2, LXy0;->f:LXy0;

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    iget-object v0, p1, LXy0;->f:LXy0;

    if-eqz v0, :cond_0

    iget-object v0, v0, LXy0;->f:LXy0;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public h1(F)V
    .locals 0

    iput p1, p0, Liz0;->r0:F

    return-void
.end method

.method public final i(LLr2;ZZZZLrN5;LrN5;Liz0$b;ZLXy0;LXy0;IIIIFZZZZZIIIIFZ)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p23

    move/from16 v3, p24

    move/from16 v4, p25

    invoke-virtual {v10, v13}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v9

    invoke-virtual {v10, v14}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v8

    invoke-virtual/range {p10 .. p10}, LXy0;->j()LXy0;

    move-result-object v5

    invoke-virtual {v10, v5}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v7

    invoke-virtual/range {p11 .. p11}, LXy0;->j()LXy0;

    move-result-object v5

    invoke-virtual {v10, v5}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v6

    invoke-static {}, LLr2;->x()LbU2;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {}, LLr2;->x()LbU2;

    move-result-object v5

    iget-wide v11, v5, LbU2;->w:J

    const-wide/16 v16, 0x1

    add-long v11, v11, v16

    iput-wide v11, v5, LbU2;->w:J

    :cond_0
    invoke-virtual/range {p10 .. p10}, LXy0;->o()Z

    move-result v11

    invoke-virtual/range {p11 .. p11}, LXy0;->o()Z

    move-result v12

    iget-object v5, v0, Liz0;->X:LXy0;

    invoke-virtual {v5}, LXy0;->o()Z

    move-result v16

    if-eqz v12, :cond_1

    add-int/lit8 v5, v11, 0x1

    goto :goto_0

    :cond_1
    move v5, v11

    :goto_0
    if-eqz v16, :cond_2

    add-int/lit8 v5, v5, 0x1

    :cond_2
    if-eqz p17, :cond_3

    const/16 v18, 0x3

    goto :goto_1

    :cond_3
    move/from16 v18, p22

    :goto_1
    sget-object v17, Liz0$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    aget v2, v17, v19

    const/4 v14, 0x1

    if-eq v2, v14, :cond_4

    const/4 v14, 0x2

    if-eq v2, v14, :cond_4

    const/4 v14, 0x3

    if-eq v2, v14, :cond_4

    const/4 v14, 0x4

    if-eq v2, v14, :cond_6

    :cond_4
    move/from16 v2, v18

    :cond_5
    const/16 v18, 0x0

    goto :goto_2

    :cond_6
    move/from16 v2, v18

    if-eq v2, v14, :cond_5

    const/16 v18, 0x1

    :goto_2
    iget v14, v0, Liz0;->l:I

    const/4 v13, -0x1

    if-eq v14, v13, :cond_7

    if-eqz p2, :cond_7

    iput v13, v0, Liz0;->l:I

    move-object/from16 v21, v6

    const/16 v18, 0x0

    goto :goto_3

    :cond_7
    move/from16 v14, p13

    move-object/from16 v21, v6

    :goto_3
    iget v6, v0, Liz0;->m:I

    if-eq v6, v13, :cond_8

    if-nez p2, :cond_8

    iput v13, v0, Liz0;->m:I

    move v14, v6

    const/16 v18, 0x0

    :cond_8
    iget v6, v0, Liz0;->u0:I

    const/16 v13, 0x8

    if-ne v6, v13, :cond_9

    const/4 v14, 0x0

    const/16 v18, 0x0

    :cond_9
    if-eqz p27, :cond_b

    if-nez v11, :cond_a

    if-nez v12, :cond_a

    if-nez v16, :cond_a

    move/from16 v6, p12

    invoke-virtual {v10, v9, v6}, LLr2;->f(LrN5;I)V

    goto :goto_4

    :cond_a
    if-eqz v11, :cond_b

    if-nez v12, :cond_b

    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v6

    invoke-virtual {v10, v9, v7, v6, v13}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_b
    :goto_4
    if-nez v18, :cond_f

    if-eqz p9, :cond_d

    const/4 v6, 0x3

    const/4 v13, 0x0

    invoke-virtual {v10, v8, v9, v13, v6}, LLr2;->e(LrN5;LrN5;II)Lxo;

    const/16 v6, 0x8

    if-lez v15, :cond_c

    invoke-virtual {v10, v8, v9, v15, v6}, LLr2;->h(LrN5;LrN5;II)V

    :cond_c
    const v14, 0x7fffffff

    if-ge v1, v14, :cond_e

    invoke-virtual {v10, v8, v9, v1, v6}, LLr2;->j(LrN5;LrN5;II)V

    goto :goto_5

    :cond_d
    move v6, v13

    const/4 v13, 0x0

    invoke-virtual {v10, v8, v9, v14, v6}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_e
    :goto_5
    move v1, v4

    move/from16 p9, v5

    move-object v13, v7

    move-object v15, v8

    move/from16 v23, v18

    move-object/from16 v14, v21

    move/from16 v18, p5

    move/from16 v21, v3

    goto/16 :goto_e

    :cond_f
    const/4 v1, 0x2

    const/4 v13, 0x0

    if-eq v5, v1, :cond_12

    if-nez p17, :cond_12

    const/4 v1, 0x1

    if-eq v2, v1, :cond_10

    if-nez v2, :cond_12

    :cond_10
    invoke-static {v3, v14}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_11

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_11
    const/16 v6, 0x8

    invoke-virtual {v10, v8, v9, v1, v6}, LLr2;->e(LrN5;LrN5;II)Lxo;

    move/from16 v18, p5

    move v1, v4

    move/from16 p9, v5

    move-object v15, v8

    move/from16 v23, v13

    move-object/from16 v14, v21

    move/from16 v21, v3

    move-object v13, v7

    goto/16 :goto_e

    :cond_12
    const/4 v1, -0x2

    if-ne v3, v1, :cond_13

    move v6, v14

    goto :goto_6

    :cond_13
    move v6, v3

    :goto_6
    if-ne v4, v1, :cond_14

    move v1, v14

    goto :goto_7

    :cond_14
    move v1, v4

    :goto_7
    if-lez v14, :cond_15

    const/4 v3, 0x1

    if-eq v2, v3, :cond_15

    move v14, v13

    :cond_15
    if-lez v6, :cond_16

    const/16 v3, 0x8

    invoke-virtual {v10, v8, v9, v6, v3}, LLr2;->h(LrN5;LrN5;II)V

    invoke-static {v14, v6}, Ljava/lang/Math;->max(II)I

    move-result v14

    :cond_16
    if-lez v1, :cond_19

    if-eqz p3, :cond_17

    const/4 v3, 0x1

    if-ne v2, v3, :cond_17

    move v3, v13

    goto :goto_8

    :cond_17
    const/4 v3, 0x1

    :goto_8
    if-eqz v3, :cond_18

    const/16 v3, 0x8

    invoke-virtual {v10, v8, v9, v1, v3}, LLr2;->j(LrN5;LrN5;II)V

    goto :goto_9

    :cond_18
    const/16 v3, 0x8

    :goto_9
    invoke-static {v14, v1}, Ljava/lang/Math;->min(II)I

    move-result v14

    goto :goto_a

    :cond_19
    const/16 v3, 0x8

    :goto_a
    const/4 v4, 0x1

    if-ne v2, v4, :cond_1c

    if-eqz p3, :cond_1a

    invoke-virtual {v10, v8, v9, v14, v3}, LLr2;->e(LrN5;LrN5;II)Lxo;

    const/4 v4, 0x5

    goto :goto_b

    :cond_1a
    if-eqz p19, :cond_1b

    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v14, v4}, LLr2;->e(LrN5;LrN5;II)Lxo;

    invoke-virtual {v10, v8, v9, v14, v3}, LLr2;->j(LrN5;LrN5;II)V

    goto :goto_b

    :cond_1b
    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v14, v4}, LLr2;->e(LrN5;LrN5;II)Lxo;

    invoke-virtual {v10, v8, v9, v14, v3}, LLr2;->j(LrN5;LrN5;II)V

    :goto_b
    move/from16 p9, v5

    move-object v13, v7

    move-object v15, v8

    move/from16 v23, v18

    move-object/from16 v14, v21

    move/from16 v18, p5

    move/from16 v21, v6

    goto/16 :goto_e

    :cond_1c
    const/4 v4, 0x5

    const/4 v14, 0x2

    if-ne v2, v14, :cond_20

    invoke-virtual/range {p10 .. p10}, LXy0;->k()LXy0$b;

    move-result-object v3

    sget-object v4, LXy0$b;->d:LXy0$b;

    if-eq v3, v4, :cond_1e

    invoke-virtual/range {p10 .. p10}, LXy0;->k()LXy0$b;

    move-result-object v3

    sget-object v13, LXy0$b;->f:LXy0$b;

    if-ne v3, v13, :cond_1d

    goto :goto_c

    :cond_1d
    iget-object v3, v0, Liz0;->c0:Liz0;

    sget-object v4, LXy0$b;->c:LXy0$b;

    invoke-virtual {v3, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v3

    invoke-virtual {v10, v3}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v3

    iget-object v4, v0, Liz0;->c0:Liz0;

    sget-object v13, LXy0$b;->e:LXy0$b;

    invoke-virtual {v4, v13}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v10, v4}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v4

    goto :goto_d

    :cond_1e
    :goto_c
    iget-object v3, v0, Liz0;->c0:Liz0;

    invoke-virtual {v3, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v3

    invoke-virtual {v10, v3}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v3

    iget-object v4, v0, Liz0;->c0:Liz0;

    sget-object v13, LXy0$b;->f:LXy0$b;

    invoke-virtual {v4, v13}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    invoke-virtual {v10, v4}, LLr2;->q(Ljava/lang/Object;)LrN5;

    move-result-object v4

    :goto_d
    move-object/from16 v23, v3

    move-object v13, v4

    invoke-virtual/range {p1 .. p1}, LLr2;->r()Lxo;

    move-result-object v3

    const/16 v24, 0x5

    move-object v4, v8

    move v14, v5

    move-object v5, v9

    move/from16 p9, v14

    move-object/from16 v14, v21

    move/from16 v21, v6

    move-object v6, v13

    move-object v13, v7

    move-object/from16 v7, v23

    move-object v15, v8

    move/from16 v8, p26

    invoke-virtual/range {v3 .. v8}, Lxo;->k(LrN5;LrN5;LrN5;LrN5;F)Lxo;

    move-result-object v3

    invoke-virtual {v10, v3}, LLr2;->d(Lxo;)V

    if-eqz p3, :cond_1f

    const/16 v18, 0x0

    :cond_1f
    move/from16 v23, v18

    move/from16 v18, p5

    goto :goto_e

    :cond_20
    move/from16 p9, v5

    move-object v13, v7

    move-object v15, v8

    move-object/from16 v14, v21

    move/from16 v21, v6

    move/from16 v23, v18

    const/16 v18, 0x1

    :goto_e
    if-eqz p27, :cond_5f

    if-eqz p19, :cond_21

    move-object/from16 v1, p6

    move-object/from16 v4, p7

    move/from16 v5, p9

    move-object v2, v15

    const/4 v3, 0x0

    const/4 v6, 0x2

    move-object v15, v9

    goto/16 :goto_31

    :cond_21
    if-nez v11, :cond_22

    if-nez v12, :cond_22

    if-nez v16, :cond_22

    move-object v2, v15

    const/4 v1, 0x5

    const/4 v3, 0x0

    goto/16 :goto_2c

    :cond_22
    if-eqz v11, :cond_24

    if-nez v12, :cond_24

    move-object/from16 v7, p10

    const/4 v8, 0x0

    iget-object v1, v7, LXy0;->f:LXy0;

    iget-object v1, v1, LXy0;->d:Liz0;

    if-eqz p3, :cond_23

    instance-of v1, v1, LCy;

    if-eqz v1, :cond_23

    const/16 v13, 0x8

    goto :goto_f

    :cond_23
    const/4 v13, 0x5

    :goto_f
    move/from16 v22, p3

    move v3, v8

    move v6, v13

    move-object v2, v15

    goto/16 :goto_2e

    :cond_24
    move-object/from16 v7, p10

    const/4 v8, 0x0

    if-nez v11, :cond_27

    if-eqz v12, :cond_27

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    const/16 v2, 0x8

    invoke-virtual {v10, v15, v14, v1, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    if-eqz p3, :cond_5a

    iget-boolean v1, v0, Liz0;->j:Z

    if-eqz v1, :cond_26

    iget-boolean v1, v9, LrN5;->h:Z

    if-eqz v1, :cond_26

    iget-object v1, v0, Liz0;->c0:Liz0;

    if-eqz v1, :cond_26

    check-cast v1, Ljz0;

    if-eqz p2, :cond_25

    invoke-virtual {v1, v7}, Ljz0;->D1(LXy0;)V

    goto/16 :goto_2b

    :cond_25
    invoke-virtual {v1, v7}, Ljz0;->I1(LXy0;)V

    goto/16 :goto_2b

    :cond_26
    move-object/from16 v6, p6

    const/4 v1, 0x5

    invoke-virtual {v10, v9, v6, v8, v1}, LLr2;->h(LrN5;LrN5;II)V

    move v3, v8

    move-object v2, v15

    goto/16 :goto_2c

    :cond_27
    move-object/from16 v6, p6

    if-eqz v11, :cond_5a

    if-eqz v12, :cond_5a

    iget-object v3, v7, LXy0;->f:LXy0;

    iget-object v11, v3, LXy0;->d:Liz0;

    move-object/from16 v12, p11

    const/4 v3, 0x2

    iget-object v4, v12, LXy0;->f:LXy0;

    iget-object v5, v4, LXy0;->d:Liz0;

    invoke-virtual/range {p0 .. p0}, Liz0;->M()Liz0;

    move-result-object v4

    const/16 v16, 0x6

    if-eqz v23, :cond_3d

    if-nez v2, :cond_2c

    if-nez v1, :cond_29

    if-nez v21, :cond_29

    iget-boolean v1, v13, LrN5;->h:Z

    if-eqz v1, :cond_28

    iget-boolean v1, v14, LrN5;->h:Z

    if-eqz v1, :cond_28

    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v1

    const/16 v2, 0x8

    invoke-virtual {v10, v9, v13, v1, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v15, v14, v1, v2}, LLr2;->e(LrN5;LrN5;II)Lxo;

    return-void

    :cond_28
    move/from16 v19, v8

    move/from16 v24, v19

    const/16 v1, 0x8

    const/16 v3, 0x8

    const/16 v22, 0x1

    goto :goto_10

    :cond_29
    move/from16 v22, v8

    const/4 v1, 0x5

    const/4 v3, 0x5

    const/16 v19, 0x1

    const/16 v24, 0x1

    :goto_10
    instance-of v8, v11, LCy;

    if-nez v8, :cond_2b

    instance-of v8, v5, LCy;

    if-eqz v8, :cond_2a

    goto :goto_12

    :cond_2a
    move-object/from16 v8, p7

    move/from16 v25, v22

    move/from16 v22, v19

    move/from16 v19, v3

    :goto_11
    move v3, v1

    move/from16 v1, v16

    goto/16 :goto_21

    :cond_2b
    :goto_12
    move-object/from16 v8, p7

    move v3, v1

    move/from16 v1, v16

    move/from16 v25, v22

    move/from16 v22, v19

    const/16 v19, 0x4

    goto/16 :goto_21

    :cond_2c
    if-ne v2, v3, :cond_2f

    instance-of v1, v11, LCy;

    if-nez v1, :cond_2e

    instance-of v1, v5, LCy;

    if-eqz v1, :cond_2d

    goto :goto_13

    :cond_2d
    move-object/from16 v8, p7

    move/from16 v1, v16

    const/4 v3, 0x5

    const/16 v19, 0x5

    goto/16 :goto_1f

    :cond_2e
    :goto_13
    move-object/from16 v8, p7

    goto/16 :goto_1d

    :cond_2f
    const/4 v8, 0x1

    if-ne v2, v8, :cond_30

    move-object/from16 v8, p7

    move/from16 v1, v16

    const/16 v3, 0x8

    goto/16 :goto_1e

    :cond_30
    const/4 v8, 0x3

    if-ne v2, v8, :cond_3c

    iget v8, v0, Liz0;->H:I

    const/4 v3, -0x1

    if-ne v8, v3, :cond_33

    if-eqz p20, :cond_32

    move-object/from16 v8, p7

    if-eqz p3, :cond_31

    const/4 v1, 0x5

    goto :goto_14

    :cond_31
    const/4 v1, 0x4

    goto :goto_14

    :cond_32
    move-object/from16 v8, p7

    const/16 v1, 0x8

    :goto_14
    const/16 v3, 0x8

    :goto_15
    const/16 v19, 0x5

    :goto_16
    const/16 v22, 0x1

    const/16 v24, 0x1

    const/16 v25, 0x1

    goto/16 :goto_21

    :cond_33
    if-eqz p17, :cond_37

    move/from16 v3, p23

    const/4 v8, 0x2

    if-eq v3, v8, :cond_35

    const/4 v1, 0x1

    if-ne v3, v1, :cond_34

    goto :goto_17

    :cond_34
    const/4 v1, 0x0

    goto :goto_18

    :cond_35
    :goto_17
    const/4 v1, 0x1

    :goto_18
    if-nez v1, :cond_36

    const/16 v1, 0x8

    const/4 v3, 0x5

    goto :goto_19

    :cond_36
    const/4 v1, 0x5

    const/4 v3, 0x4

    :goto_19
    move-object/from16 v8, p7

    move/from16 v19, v3

    const/16 v22, 0x1

    const/16 v24, 0x1

    const/16 v25, 0x1

    goto :goto_11

    :cond_37
    if-lez v1, :cond_38

    move-object/from16 v8, p7

    move/from16 v1, v16

    const/4 v3, 0x5

    goto :goto_15

    :cond_38
    if-nez v1, :cond_3b

    if-nez v21, :cond_3b

    if-nez p20, :cond_39

    move-object/from16 v8, p7

    move/from16 v1, v16

    const/4 v3, 0x5

    const/16 v19, 0x8

    goto :goto_16

    :cond_39
    if-eq v11, v4, :cond_3a

    if-eq v5, v4, :cond_3a

    const/4 v1, 0x4

    goto :goto_1a

    :cond_3a
    const/4 v1, 0x5

    :goto_1a
    move-object/from16 v8, p7

    move v3, v1

    move/from16 v1, v16

    goto :goto_1b

    :cond_3b
    move-object/from16 v8, p7

    move/from16 v1, v16

    const/4 v3, 0x5

    :goto_1b
    const/16 v19, 0x4

    goto :goto_16

    :cond_3c
    move-object/from16 v8, p7

    move/from16 v1, v16

    const/4 v3, 0x5

    const/16 v19, 0x4

    const/16 v22, 0x0

    const/16 v24, 0x0

    goto :goto_20

    :cond_3d
    iget-boolean v1, v13, LrN5;->h:Z

    if-eqz v1, :cond_2e

    iget-boolean v1, v14, LrN5;->h:Z

    if-eqz v1, :cond_2e

    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v1

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v2

    const/16 v3, 0x8

    move-object/from16 p17, p1

    move-object/from16 p18, v9

    move-object/from16 p19, v13

    move/from16 p20, v1

    move/from16 p21, p16

    move-object/from16 p22, v14

    move-object/from16 p23, v15

    move/from16 p24, v2

    move/from16 p25, v3

    invoke-virtual/range {p17 .. p25}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    if-eqz p3, :cond_3f

    if-eqz v18, :cond_3f

    iget-object v1, v12, LXy0;->f:LXy0;

    if-eqz v1, :cond_3e

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v13

    move-object/from16 v8, p7

    goto :goto_1c

    :cond_3e
    move-object/from16 v8, p7

    const/4 v13, 0x0

    :goto_1c
    if-eq v14, v8, :cond_3f

    const/4 v1, 0x5

    invoke-virtual {v10, v8, v15, v13, v1}, LLr2;->h(LrN5;LrN5;II)V

    :cond_3f
    return-void

    :goto_1d
    move/from16 v1, v16

    const/4 v3, 0x5

    :goto_1e
    const/16 v19, 0x4

    :goto_1f
    const/16 v22, 0x1

    const/16 v24, 0x1

    :goto_20
    const/16 v25, 0x0

    :goto_21
    if-eqz v24, :cond_40

    if-ne v13, v14, :cond_40

    if-eq v11, v4, :cond_40

    const/16 v24, 0x0

    const/16 v26, 0x0

    goto :goto_22

    :cond_40
    const/16 v26, 0x1

    :goto_22
    if-eqz v22, :cond_42

    if-nez v23, :cond_41

    if-nez p18, :cond_41

    if-nez p20, :cond_41

    if-ne v13, v6, :cond_41

    if-ne v14, v8, :cond_41

    const/16 v22, 0x0

    const/16 v26, 0x8

    const/16 v27, 0x8

    const/16 v28, 0x0

    goto :goto_23

    :cond_41
    move/from16 v22, p3

    move/from16 v27, v1

    move/from16 v28, v26

    move/from16 v26, v3

    :goto_23
    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v29

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v30

    move-object/from16 v1, p1

    move v3, v2

    move-object v2, v9

    move v12, v3

    move-object v3, v13

    move/from16 p8, v12

    move-object v12, v4

    move/from16 v4, v29

    move-object/from16 v29, v12

    move-object v12, v5

    move/from16 v5, p16

    move-object v6, v14

    move-object v7, v15

    move/from16 v8, v30

    move-object/from16 v20, v15

    move-object v15, v9

    move/from16 v9, v27

    invoke-virtual/range {v1 .. v9}, LLr2;->c(LrN5;LrN5;IFLrN5;LrN5;II)V

    move/from16 v3, v26

    move/from16 v26, v28

    goto :goto_24

    :cond_42
    move/from16 p8, v2

    move-object/from16 v29, v4

    move-object v12, v5

    move-object/from16 v20, v15

    move-object v15, v9

    move/from16 v22, p3

    :goto_24
    iget v1, v0, Liz0;->u0:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_43

    invoke-virtual/range {p11 .. p11}, LXy0;->m()Z

    move-result v1

    if-nez v1, :cond_43

    return-void

    :cond_43
    if-eqz v24, :cond_46

    if-eqz v22, :cond_45

    if-eq v13, v14, :cond_45

    if-nez v23, :cond_45

    instance-of v1, v11, LCy;

    if-nez v1, :cond_44

    instance-of v1, v12, LCy;

    if-eqz v1, :cond_45

    :cond_44
    move/from16 v3, v16

    :cond_45
    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v1

    invoke-virtual {v10, v15, v13, v1, v3}, LLr2;->h(LrN5;LrN5;II)V

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    move-object/from16 v2, v20

    invoke-virtual {v10, v2, v14, v1, v3}, LLr2;->j(LrN5;LrN5;II)V

    goto :goto_25

    :cond_46
    move-object/from16 v2, v20

    :goto_25
    if-eqz v22, :cond_47

    if-eqz p21, :cond_47

    instance-of v1, v11, LCy;

    if-nez v1, :cond_47

    instance-of v1, v12, LCy;

    if-nez v1, :cond_47

    move-object/from16 v1, v29

    if-eq v12, v1, :cond_48

    move/from16 v3, v16

    move v4, v3

    const/16 v26, 0x1

    goto :goto_26

    :cond_47
    move-object/from16 v1, v29

    :cond_48
    move/from16 v4, v19

    :goto_26
    if-eqz v26, :cond_55

    if-eqz v25, :cond_51

    if-eqz p20, :cond_49

    if-eqz p4, :cond_51

    :cond_49
    if-eq v11, v1, :cond_4b

    if-ne v12, v1, :cond_4a

    goto :goto_27

    :cond_4a
    move v6, v4

    goto :goto_28

    :cond_4b
    :goto_27
    move/from16 v6, v16

    :goto_28
    instance-of v5, v11, LwE1;

    if-nez v5, :cond_4c

    instance-of v5, v12, LwE1;

    if-eqz v5, :cond_4d

    :cond_4c
    const/4 v6, 0x5

    :cond_4d
    instance-of v5, v11, LCy;

    if-nez v5, :cond_4e

    instance-of v5, v12, LCy;

    if-eqz v5, :cond_4f

    :cond_4e
    const/4 v6, 0x5

    :cond_4f
    if-eqz p20, :cond_50

    const/4 v6, 0x5

    :cond_50
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    :cond_51
    if-eqz v22, :cond_54

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-eqz p17, :cond_53

    if-nez p20, :cond_53

    if-eq v11, v1, :cond_52

    if-ne v12, v1, :cond_53

    :cond_52
    const/4 v4, 0x4

    goto :goto_29

    :cond_53
    move v4, v3

    :cond_54
    :goto_29
    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v1

    invoke-virtual {v10, v15, v13, v1, v4}, LLr2;->e(LrN5;LrN5;II)Lxo;

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v2, v14, v1, v4}, LLr2;->e(LrN5;LrN5;II)Lxo;

    :cond_55
    if-eqz v22, :cond_57

    move-object/from16 v1, p6

    if-ne v1, v13, :cond_56

    invoke-virtual/range {p10 .. p10}, LXy0;->f()I

    move-result v3

    goto :goto_2a

    :cond_56
    const/4 v3, 0x0

    :goto_2a
    if-eq v13, v1, :cond_57

    const/4 v4, 0x5

    invoke-virtual {v10, v15, v1, v3, v4}, LLr2;->h(LrN5;LrN5;II)V

    :cond_57
    if-eqz v22, :cond_59

    if-eqz v23, :cond_59

    if-nez p14, :cond_59

    if-nez v21, :cond_59

    if-eqz v23, :cond_58

    move/from16 v1, p8

    const/4 v3, 0x3

    if-ne v1, v3, :cond_58

    const/16 v1, 0x8

    const/4 v3, 0x0

    invoke-virtual {v10, v2, v15, v3, v1}, LLr2;->h(LrN5;LrN5;II)V

    const/4 v1, 0x5

    goto :goto_2d

    :cond_58
    const/4 v3, 0x0

    const/4 v1, 0x5

    invoke-virtual {v10, v2, v15, v3, v1}, LLr2;->h(LrN5;LrN5;II)V

    goto :goto_2d

    :cond_59
    const/4 v1, 0x5

    const/4 v3, 0x0

    goto :goto_2d

    :cond_5a
    :goto_2b
    move v3, v8

    move-object v2, v15

    const/4 v1, 0x5

    :goto_2c
    move/from16 v22, p3

    :goto_2d
    move v6, v1

    :goto_2e
    if-eqz v22, :cond_5e

    if-eqz v18, :cond_5e

    move-object/from16 v1, p11

    iget-object v4, v1, LXy0;->f:LXy0;

    if-eqz v4, :cond_5b

    invoke-virtual/range {p11 .. p11}, LXy0;->f()I

    move-result v13

    move-object/from16 v4, p7

    goto :goto_2f

    :cond_5b
    move-object/from16 v4, p7

    move v13, v3

    :goto_2f
    if-eq v14, v4, :cond_5e

    iget-boolean v3, v0, Liz0;->j:Z

    if-eqz v3, :cond_5d

    iget-boolean v3, v2, LrN5;->h:Z

    if-eqz v3, :cond_5d

    iget-object v3, v0, Liz0;->c0:Liz0;

    if-eqz v3, :cond_5d

    check-cast v3, Ljz0;

    if-eqz p2, :cond_5c

    invoke-virtual {v3, v1}, Ljz0;->C1(LXy0;)V

    goto :goto_30

    :cond_5c
    invoke-virtual {v3, v1}, Ljz0;->H1(LXy0;)V

    :goto_30
    return-void

    :cond_5d
    invoke-virtual {v10, v4, v2, v13, v6}, LLr2;->h(LrN5;LrN5;II)V

    :cond_5e
    return-void

    :cond_5f
    move-object/from16 v1, p6

    move-object/from16 v4, p7

    move-object v2, v15

    const/4 v3, 0x0

    move-object v15, v9

    move/from16 v5, p9

    const/4 v6, 0x2

    :goto_31
    if-ge v5, v6, :cond_64

    if-eqz p3, :cond_64

    if-eqz v18, :cond_64

    const/16 v5, 0x8

    invoke-virtual {v10, v15, v1, v3, v5}, LLr2;->h(LrN5;LrN5;II)V

    if-nez p2, :cond_61

    iget-object v1, v0, Liz0;->U:LXy0;

    iget-object v1, v1, LXy0;->f:LXy0;

    if-nez v1, :cond_60

    goto :goto_32

    :cond_60
    move v13, v3

    goto :goto_33

    :cond_61
    :goto_32
    const/4 v13, 0x1

    :goto_33
    if-nez p2, :cond_63

    iget-object v1, v0, Liz0;->U:LXy0;

    iget-object v1, v1, LXy0;->f:LXy0;

    if-eqz v1, :cond_63

    iget-object v1, v1, LXy0;->d:Liz0;

    iget v5, v1, Liz0;->f0:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-eqz v5, :cond_62

    iget-object v1, v1, Liz0;->b0:[Liz0$b;

    aget-object v5, v1, v3

    sget-object v6, Liz0$b;->d:Liz0$b;

    if-ne v5, v6, :cond_62

    const/4 v5, 0x1

    aget-object v1, v1, v5

    if-ne v1, v6, :cond_62

    move v14, v5

    goto :goto_34

    :cond_62
    move v14, v3

    goto :goto_34

    :cond_63
    move v14, v13

    :goto_34
    if-eqz v14, :cond_64

    const/16 v1, 0x8

    invoke-virtual {v10, v4, v2, v3, v1}, LLr2;->h(LrN5;LrN5;II)V

    :cond_64
    return-void
.end method

.method public i0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->r:Z

    return v0
.end method

.method public i1(I)V
    .locals 0

    iput p1, p0, Liz0;->K0:I

    return-void
.end method

.method public j(LXy0$b;Liz0;LXy0$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    return-void
.end method

.method public j0(I)Z
    .locals 1

    iget-object v0, p0, Liz0;->a0:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public j1(II)V
    .locals 0

    iput p1, p0, Liz0;->i0:I

    sub-int/2addr p2, p1

    iput p2, p0, Liz0;->e0:I

    iget p1, p0, Liz0;->p0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Liz0;->e0:I

    :cond_0
    return-void
.end method

.method public k(LXy0$b;Liz0;LXy0$b;I)V
    .locals 8

    sget-object v0, LXy0$b;->h:LXy0$b;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_c

    if-ne p3, v0, :cond_8

    sget-object p1, LXy0$b;->c:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    sget-object p4, LXy0$b;->e:LXy0$b;

    invoke-virtual {p0, p4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v2

    sget-object v3, LXy0$b;->d:LXy0$b;

    invoke-virtual {p0, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v4

    sget-object v5, LXy0$b;->f:LXy0$b;

    invoke-virtual {p0, v5}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v6

    const/4 v7, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, LXy0;->o()Z

    move-result p3

    if-nez p3, :cond_1

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, LXy0;->o()Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, p1, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    invoke-virtual {p0, p4, p2, p4, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    move p1, v7

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {v4}, LXy0;->o()Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    if-eqz v6, :cond_5

    invoke-virtual {v6}, LXy0;->o()Z

    move-result p3

    if-eqz p3, :cond_5

    :cond_4
    move v7, v1

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v3, p2, v3, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    invoke-virtual {p0, v5, p2, v5, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    :goto_1
    if-eqz p1, :cond_6

    if-eqz v7, :cond_6

    invoke-virtual {p0, v0}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, v0}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_6
    if-eqz p1, :cond_7

    sget-object p1, LXy0$b;->i:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p2, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_7
    if-eqz v7, :cond_1c

    sget-object p1, LXy0$b;->j:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p2, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_8
    sget-object p1, LXy0$b;->c:LXy0$b;

    if-eq p3, p1, :cond_b

    sget-object p4, LXy0$b;->e:LXy0$b;

    if-ne p3, p4, :cond_9

    goto :goto_2

    :cond_9
    sget-object p1, LXy0$b;->d:LXy0$b;

    if-eq p3, p1, :cond_a

    sget-object p4, LXy0$b;->f:LXy0$b;

    if-ne p3, p4, :cond_1c

    :cond_a
    invoke-virtual {p0, p1, p2, p3, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    sget-object p1, LXy0$b;->f:LXy0$b;

    invoke-virtual {p0, p1, p2, p3, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    invoke-virtual {p0, v0}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_b
    :goto_2
    invoke-virtual {p0, p1, p2, p3, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    sget-object p1, LXy0$b;->e:LXy0$b;

    invoke-virtual {p0, p1, p2, p3, v1}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    invoke-virtual {p0, v0}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_c
    sget-object v2, LXy0$b;->i:LXy0$b;

    if-ne p1, v2, :cond_e

    sget-object v3, LXy0$b;->c:LXy0$b;

    if-eq p3, v3, :cond_d

    sget-object v4, LXy0$b;->e:LXy0$b;

    if-ne p3, v4, :cond_e

    :cond_d
    invoke-virtual {p0, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    sget-object p3, LXy0$b;->e:LXy0$b;

    invoke-virtual {p0, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    invoke-virtual {p3, p2, v1}, LXy0;->a(LXy0;I)Z

    invoke-virtual {p0, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_e
    sget-object v3, LXy0$b;->j:LXy0$b;

    if-ne p1, v3, :cond_10

    sget-object v4, LXy0$b;->d:LXy0$b;

    if-eq p3, v4, :cond_f

    sget-object v5, LXy0$b;->f:LXy0$b;

    if-ne p3, v5, :cond_10

    :cond_f
    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p0, v4}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, LXy0;->a(LXy0;I)Z

    sget-object p2, LXy0$b;->f:LXy0$b;

    invoke-virtual {p0, p2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, LXy0;->a(LXy0;I)Z

    invoke-virtual {p0, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_10
    if-ne p1, v2, :cond_11

    if-ne p3, v2, :cond_11

    sget-object p1, LXy0$b;->c:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p4

    invoke-virtual {p2, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, LXy0;->a(LXy0;I)Z

    sget-object p1, LXy0$b;->e:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p4

    invoke-virtual {p2, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, LXy0;->a(LXy0;I)Z

    invoke-virtual {p0, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_11
    if-ne p1, v3, :cond_12

    if-ne p3, v3, :cond_12

    sget-object p1, LXy0$b;->d:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p4

    invoke-virtual {p2, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, LXy0;->a(LXy0;I)Z

    sget-object p1, LXy0$b;->f:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p4

    invoke-virtual {p2, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, LXy0;->a(LXy0;I)Z

    invoke-virtual {p0, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, LXy0;->a(LXy0;I)Z

    goto/16 :goto_5

    :cond_12
    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object v1

    invoke-virtual {p2, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p2

    invoke-virtual {v1, p2}, LXy0;->p(LXy0;)Z

    move-result p3

    if-eqz p3, :cond_1c

    sget-object p3, LXy0$b;->g:LXy0$b;

    if-ne p1, p3, :cond_14

    sget-object p1, LXy0$b;->d:LXy0$b;

    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    sget-object p3, LXy0$b;->f:LXy0$b;

    invoke-virtual {p0, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    if-eqz p1, :cond_13

    invoke-virtual {p1}, LXy0;->q()V

    :cond_13
    if-eqz p3, :cond_1b

    invoke-virtual {p3}, LXy0;->q()V

    goto :goto_4

    :cond_14
    sget-object v4, LXy0$b;->d:LXy0$b;

    if-eq p1, v4, :cond_18

    sget-object v4, LXy0$b;->f:LXy0$b;

    if-ne p1, v4, :cond_15

    goto :goto_3

    :cond_15
    sget-object p3, LXy0$b;->c:LXy0$b;

    if-eq p1, p3, :cond_16

    sget-object p3, LXy0$b;->e:LXy0$b;

    if-ne p1, p3, :cond_1b

    :cond_16
    invoke-virtual {p0, v0}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p3}, LXy0;->j()LXy0;

    move-result-object v0

    if-eq v0, p2, :cond_17

    invoke-virtual {p3}, LXy0;->q()V

    :cond_17
    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p1}, LXy0;->g()LXy0;

    move-result-object p1

    invoke-virtual {p0, v2}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p3}, LXy0;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, LXy0;->q()V

    invoke-virtual {p3}, LXy0;->q()V

    goto :goto_4

    :cond_18
    :goto_3
    invoke-virtual {p0, p3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    if-eqz p3, :cond_19

    invoke-virtual {p3}, LXy0;->q()V

    :cond_19
    invoke-virtual {p0, v0}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p3}, LXy0;->j()LXy0;

    move-result-object v0

    if-eq v0, p2, :cond_1a

    invoke-virtual {p3}, LXy0;->q()V

    :cond_1a
    invoke-virtual {p0, p1}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p1

    invoke-virtual {p1}, LXy0;->g()LXy0;

    move-result-object p1

    invoke-virtual {p0, v3}, Liz0;->q(LXy0$b;)LXy0;

    move-result-object p3

    invoke-virtual {p3}, LXy0;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, LXy0;->q()V

    invoke-virtual {p3}, LXy0;->q()V

    :cond_1b
    :goto_4
    invoke-virtual {v1, p2, p4}, LXy0;->a(LXy0;I)Z

    :cond_1c
    :goto_5
    return-void
.end method

.method public k0()Z
    .locals 2

    iget-object v0, p0, Liz0;->Q:LXy0;

    iget-object v1, v0, LXy0;->f:LXy0;

    if-eqz v1, :cond_0

    iget-object v1, v1, LXy0;->f:LXy0;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Liz0;->S:LXy0;

    iget-object v1, v0, LXy0;->f:LXy0;

    if-eqz v1, :cond_2

    iget-object v1, v1, LXy0;->f:LXy0;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public k1(Liz0$b;)V
    .locals 2

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public l(LXy0;LXy0;I)V
    .locals 1

    invoke-virtual {p1}, LXy0;->h()Liz0;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p1}, LXy0;->k()LXy0$b;

    move-result-object p1

    invoke-virtual {p2}, LXy0;->h()Liz0;

    move-result-object v0

    invoke-virtual {p2}, LXy0;->k()LXy0$b;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2, p3}, Liz0;->k(LXy0$b;Liz0;LXy0$b;I)V

    :cond_0
    return-void
.end method

.method public l0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->M:Z

    return v0
.end method

.method public l1(IIIF)V
    .locals 0

    iput p1, p0, Liz0;->x:I

    iput p2, p0, Liz0;->C:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Liz0;->D:I

    iput p4, p0, Liz0;->E:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Liz0;->x:I

    :cond_1
    return-void
.end method

.method public m(Liz0;FI)V
    .locals 6

    sget-object v3, LXy0$b;->h:LXy0$b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Liz0;->g0(LXy0$b;Liz0;LXy0$b;II)V

    iput p2, p0, Liz0;->K:F

    return-void
.end method

.method public m0()Z
    .locals 2

    iget-object v0, p0, Liz0;->R:LXy0;

    iget-object v1, v0, LXy0;->f:LXy0;

    if-eqz v1, :cond_0

    iget-object v1, v1, LXy0;->f:LXy0;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Liz0;->T:LXy0;

    iget-object v1, v0, LXy0;->f:LXy0;

    if-eqz v1, :cond_2

    iget-object v1, v1, LXy0;->f:LXy0;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public m1(F)V
    .locals 2

    iget-object v0, p0, Liz0;->N0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public n(Liz0;Ljava/util/HashMap;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liz0;",
            "Ljava/util/HashMap<",
            "Liz0;",
            "Liz0;",
            ">;)V"
        }
    .end annotation

    iget v0, p1, Liz0;->t:I

    iput v0, p0, Liz0;->t:I

    iget v0, p1, Liz0;->u:I

    iput v0, p0, Liz0;->u:I

    iget v0, p1, Liz0;->w:I

    iput v0, p0, Liz0;->w:I

    iget v0, p1, Liz0;->x:I

    iput v0, p0, Liz0;->x:I

    iget-object v0, p0, Liz0;->y:[I

    iget-object v1, p1, Liz0;->y:[I

    const/4 v2, 0x0

    aget v3, v1, v2

    aput v3, v0, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    aput v1, v0, v3

    iget v0, p1, Liz0;->z:I

    iput v0, p0, Liz0;->z:I

    iget v0, p1, Liz0;->A:I

    iput v0, p0, Liz0;->A:I

    iget v0, p1, Liz0;->C:I

    iput v0, p0, Liz0;->C:I

    iget v0, p1, Liz0;->D:I

    iput v0, p0, Liz0;->D:I

    iget v0, p1, Liz0;->E:F

    iput v0, p0, Liz0;->E:F

    iget-boolean v0, p1, Liz0;->F:Z

    iput-boolean v0, p0, Liz0;->F:Z

    iget-boolean v0, p1, Liz0;->G:Z

    iput-boolean v0, p0, Liz0;->G:Z

    iget v0, p1, Liz0;->H:I

    iput v0, p0, Liz0;->H:I

    iget v0, p1, Liz0;->I:F

    iput v0, p0, Liz0;->I:F

    iget-object v0, p1, Liz0;->J:[I

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Liz0;->J:[I

    iget v0, p1, Liz0;->K:F

    iput v0, p0, Liz0;->K:F

    iget-boolean v0, p1, Liz0;->L:Z

    iput-boolean v0, p0, Liz0;->L:Z

    iget-boolean v0, p1, Liz0;->M:Z

    iput-boolean v0, p0, Liz0;->M:Z

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->S:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->U:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->V:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->W:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->X:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Liz0$b;

    iput-object v0, p0, Liz0;->b0:[Liz0$b;

    iget-object v0, p0, Liz0;->c0:Liz0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p1, Liz0;->c0:Liz0;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz0;

    :goto_0
    iput-object v0, p0, Liz0;->c0:Liz0;

    iget v0, p1, Liz0;->d0:I

    iput v0, p0, Liz0;->d0:I

    iget v0, p1, Liz0;->e0:I

    iput v0, p0, Liz0;->e0:I

    iget v0, p1, Liz0;->f0:F

    iput v0, p0, Liz0;->f0:F

    iget v0, p1, Liz0;->g0:I

    iput v0, p0, Liz0;->g0:I

    iget v0, p1, Liz0;->h0:I

    iput v0, p0, Liz0;->h0:I

    iget v0, p1, Liz0;->i0:I

    iput v0, p0, Liz0;->i0:I

    iget v0, p1, Liz0;->j0:I

    iput v0, p0, Liz0;->j0:I

    iget v0, p1, Liz0;->k0:I

    iput v0, p0, Liz0;->k0:I

    iget v0, p1, Liz0;->l0:I

    iput v0, p0, Liz0;->l0:I

    iget v0, p1, Liz0;->m0:I

    iput v0, p0, Liz0;->m0:I

    iget v0, p1, Liz0;->n0:I

    iput v0, p0, Liz0;->n0:I

    iget v0, p1, Liz0;->o0:I

    iput v0, p0, Liz0;->o0:I

    iget v0, p1, Liz0;->p0:I

    iput v0, p0, Liz0;->p0:I

    iget v0, p1, Liz0;->q0:F

    iput v0, p0, Liz0;->q0:F

    iget v0, p1, Liz0;->r0:F

    iput v0, p0, Liz0;->r0:F

    iget-object v0, p1, Liz0;->s0:Ljava/lang/Object;

    iput-object v0, p0, Liz0;->s0:Ljava/lang/Object;

    iget v0, p1, Liz0;->t0:I

    iput v0, p0, Liz0;->t0:I

    iget v0, p1, Liz0;->u0:I

    iput v0, p0, Liz0;->u0:I

    iget-boolean v0, p1, Liz0;->v0:Z

    iput-boolean v0, p0, Liz0;->v0:Z

    iget-object v0, p1, Liz0;->w0:Ljava/lang/String;

    iput-object v0, p0, Liz0;->w0:Ljava/lang/String;

    iget-object v0, p1, Liz0;->x0:Ljava/lang/String;

    iput-object v0, p0, Liz0;->x0:Ljava/lang/String;

    iget v0, p1, Liz0;->y0:I

    iput v0, p0, Liz0;->y0:I

    iget v0, p1, Liz0;->z0:I

    iput v0, p0, Liz0;->z0:I

    iget v0, p1, Liz0;->A0:I

    iput v0, p0, Liz0;->A0:I

    iget v0, p1, Liz0;->B0:I

    iput v0, p0, Liz0;->B0:I

    iget-boolean v0, p1, Liz0;->C0:Z

    iput-boolean v0, p0, Liz0;->C0:Z

    iget-boolean v0, p1, Liz0;->D0:Z

    iput-boolean v0, p0, Liz0;->D0:Z

    iget-boolean v0, p1, Liz0;->E0:Z

    iput-boolean v0, p0, Liz0;->E0:Z

    iget-boolean v0, p1, Liz0;->F0:Z

    iput-boolean v0, p0, Liz0;->F0:Z

    iget-boolean v0, p1, Liz0;->G0:Z

    iput-boolean v0, p0, Liz0;->G0:Z

    iget-boolean v0, p1, Liz0;->H0:Z

    iput-boolean v0, p0, Liz0;->H0:Z

    iget v0, p1, Liz0;->J0:I

    iput v0, p0, Liz0;->J0:I

    iget v0, p1, Liz0;->K0:I

    iput v0, p0, Liz0;->K0:I

    iget-boolean v0, p1, Liz0;->L0:Z

    iput-boolean v0, p0, Liz0;->L0:Z

    iget-boolean v0, p1, Liz0;->M0:Z

    iput-boolean v0, p0, Liz0;->M0:Z

    iget-object v0, p0, Liz0;->N0:[F

    iget-object v4, p1, Liz0;->N0:[F

    aget v5, v4, v2

    aput v5, v0, v2

    aget v4, v4, v3

    aput v4, v0, v3

    iget-object v0, p0, Liz0;->O0:[Liz0;

    iget-object v4, p1, Liz0;->O0:[Liz0;

    aget-object v5, v4, v2

    aput-object v5, v0, v2

    aget-object v4, v4, v3

    aput-object v4, v0, v3

    iget-object v0, p0, Liz0;->P0:[Liz0;

    iget-object v4, p1, Liz0;->P0:[Liz0;

    aget-object v5, v4, v2

    aput-object v5, v0, v2

    aget-object v2, v4, v3

    aput-object v2, v0, v3

    iget-object v0, p1, Liz0;->Q0:Liz0;

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz0;

    :goto_1
    iput-object v0, p0, Liz0;->Q0:Liz0;

    iget-object p1, p1, Liz0;->R0:Liz0;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Liz0;

    :goto_2
    iput-object v1, p0, Liz0;->R0:Liz0;

    return-void
.end method

.method public n0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->N:Z

    return v0
.end method

.method public n1(I)V
    .locals 0

    iput p1, p0, Liz0;->u0:I

    return-void
.end method

.method public o(LLr2;)V
    .locals 1

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {p1, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {p1, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    iget-object v0, p0, Liz0;->S:LXy0;

    invoke-virtual {p1, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {p1, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    iget v0, p0, Liz0;->n0:I

    if-lez v0, :cond_0

    iget-object v0, p0, Liz0;->U:LXy0;

    invoke-virtual {p1, v0}, LLr2;->q(Ljava/lang/Object;)LrN5;

    :cond_0
    return-void
.end method

.method public o0()Z
    .locals 2

    iget-boolean v0, p0, Liz0;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Liz0;->u0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o1(I)V
    .locals 1

    iput p1, p0, Liz0;->d0:I

    iget v0, p0, Liz0;->o0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Liz0;->d0:I

    :cond_0
    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Liz0;->e:LeN1;

    if-nez v0, :cond_0

    new-instance v0, LeN1;

    invoke-direct {v0, p0}, LeN1;-><init>(Liz0;)V

    iput-object v0, p0, Liz0;->e:LeN1;

    :cond_0
    iget-object v0, p0, Liz0;->f:LKo6;

    if-nez v0, :cond_1

    new-instance v0, LKo6;

    invoke-direct {v0, p0}, LKo6;-><init>(Liz0;)V

    iput-object v0, p0, Liz0;->f:LKo6;

    :cond_1
    return-void
.end method

.method public p0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->p:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0}, LXy0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liz0;->S:LXy0;

    invoke-virtual {v0}, LXy0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public p1(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    iput p1, p0, Liz0;->v:I

    :cond_0
    return-void
.end method

.method public q(LXy0$b;)LXy0;
    .locals 2

    sget-object v0, Liz0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, Liz0;->W:LXy0;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Liz0;->V:LXy0;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Liz0;->X:LXy0;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Liz0;->U:LXy0;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Liz0;->T:LXy0;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Liz0;->S:LXy0;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Liz0;->R:LXy0;

    return-object p1

    :pswitch_8
    iget-object p1, p0, Liz0;->Q:LXy0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->q:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {v0}, LXy0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {v0}, LXy0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public q1(I)V
    .locals 0

    iput p1, p0, Liz0;->h0:I

    return-void
.end method

.method public r()I
    .locals 1

    iget v0, p0, Liz0;->n0:I

    return v0
.end method

.method public r0()Z
    .locals 1

    iget-boolean v0, p0, Liz0;->s:Z

    return v0
.end method

.method public r1(I)V
    .locals 0

    iput p1, p0, Liz0;->i0:I

    return-void
.end method

.method public s(I)F
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Liz0;->q0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Liz0;->r0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method public s0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Liz0;->r:Z

    return-void
.end method

.method public s1(ZZZZ)V
    .locals 3

    iget p1, p0, Liz0;->H:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    iput v0, p0, Liz0;->H:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    iput v1, p0, Liz0;->H:I

    iget p1, p0, Liz0;->g0:I

    if-ne p1, v2, :cond_1

    iget p1, p0, Liz0;->I:F

    div-float p1, p2, p1

    iput p1, p0, Liz0;->I:F

    :cond_1
    :goto_0
    iget p1, p0, Liz0;->H:I

    if-nez p1, :cond_3

    iget-object p1, p0, Liz0;->R:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Liz0;->T:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput v1, p0, Liz0;->H:I

    goto :goto_1

    :cond_3
    iget p1, p0, Liz0;->H:I

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Liz0;->Q:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Liz0;->S:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iput v0, p0, Liz0;->H:I

    :cond_5
    :goto_1
    iget p1, p0, Liz0;->H:I

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Liz0;->R:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Liz0;->T:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Liz0;->Q:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Liz0;->S:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Liz0;->R:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Liz0;->T:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    iput v0, p0, Liz0;->H:I

    goto :goto_2

    :cond_7
    iget-object p1, p0, Liz0;->Q:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Liz0;->S:LXy0;

    invoke-virtual {p1}, LXy0;->o()Z

    move-result p1

    if-eqz p1, :cond_8

    iget p1, p0, Liz0;->I:F

    div-float p1, p2, p1

    iput p1, p0, Liz0;->I:F

    iput v1, p0, Liz0;->H:I

    :cond_8
    :goto_2
    iget p1, p0, Liz0;->H:I

    if-ne p1, v2, :cond_a

    iget p1, p0, Liz0;->z:I

    if-lez p1, :cond_9

    iget p3, p0, Liz0;->C:I

    if-nez p3, :cond_9

    iput v0, p0, Liz0;->H:I

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    iget p1, p0, Liz0;->C:I

    if-lez p1, :cond_a

    iget p1, p0, Liz0;->I:F

    div-float/2addr p2, p1

    iput p2, p0, Liz0;->I:F

    iput v1, p0, Liz0;->H:I

    :cond_a
    :goto_3
    return-void
.end method

.method public t()I
    .locals 2

    invoke-virtual {p0}, Liz0;->a0()I

    move-result v0

    iget v1, p0, Liz0;->e0:I

    add-int/2addr v0, v1

    return v0
.end method

.method public t0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Liz0;->s:Z

    return-void
.end method

.method public t1(ZZ)V
    .locals 7

    iget-object v0, p0, Liz0;->e:LeN1;

    invoke-virtual {v0}, LgB6;->k()Z

    move-result v0

    and-int/2addr p1, v0

    iget-object v0, p0, Liz0;->f:LKo6;

    invoke-virtual {v0}, LgB6;->k()Z

    move-result v0

    and-int/2addr p2, v0

    iget-object v0, p0, Liz0;->e:LeN1;

    iget-object v1, v0, LgB6;->h:Lp01;

    iget v1, v1, Lp01;->g:I

    iget-object v2, p0, Liz0;->f:LKo6;

    iget-object v3, v2, LgB6;->h:Lp01;

    iget v3, v3, Lp01;->g:I

    iget-object v0, v0, LgB6;->i:Lp01;

    iget v0, v0, Lp01;->g:I

    iget-object v2, v2, LgB6;->i:Lp01;

    iget v2, v2, Lp01;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    iput v1, p0, Liz0;->h0:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Liz0;->i0:I

    :cond_3
    iget v1, p0, Liz0;->u0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    iput v6, p0, Liz0;->d0:I

    iput v6, p0, Liz0;->e0:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, Liz0;->b0:[Liz0$b;

    aget-object p1, p1, v6

    sget-object v1, Liz0$b;->b:Liz0$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Liz0;->d0:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Liz0;->d0:I

    iget p1, p0, Liz0;->o0:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Liz0;->d0:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, Liz0;->b0:[Liz0$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Liz0$b;->b:Liz0$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Liz0;->e0:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, Liz0;->e0:I

    iget p1, p0, Liz0;->p0:I

    if-ge v2, p1, :cond_8

    iput p1, p0, Liz0;->e0:I

    :cond_8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Liz0;->x0:Ljava/lang/String;

    const-string v2, " "

    const-string v3, ""

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Liz0;->x0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Liz0;->w0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "id: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Liz0;->w0:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Liz0;->h0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Liz0;->i0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Liz0;->d0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Liz0;->e0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Liz0;->s0:Ljava/lang/Object;

    return-object v0
.end method

.method public u0()Z
    .locals 4

    iget-object v0, p0, Liz0;->b0:[Liz0$b;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    sget-object v3, Liz0$b;->d:Liz0$b;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    aget-object v0, v0, v2

    if-ne v0, v3, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public u1(LLr2;Z)V
    .locals 6

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {p1, v0}, LLr2;->y(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Liz0;->R:LXy0;

    invoke-virtual {p1, v1}, LLr2;->y(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Liz0;->S:LXy0;

    invoke-virtual {p1, v2}, LLr2;->y(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Liz0;->T:LXy0;

    invoke-virtual {p1, v3}, LLr2;->y(Ljava/lang/Object;)I

    move-result p1

    if-eqz p2, :cond_0

    iget-object v3, p0, Liz0;->e:LeN1;

    if-eqz v3, :cond_0

    iget-object v4, v3, LgB6;->h:Lp01;

    iget-boolean v5, v4, Lp01;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, LgB6;->i:Lp01;

    iget-boolean v5, v3, Lp01;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, Lp01;->g:I

    iget v2, v3, Lp01;->g:I

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Liz0;->f:LKo6;

    if-eqz p2, :cond_1

    iget-object v3, p2, LgB6;->h:Lp01;

    iget-boolean v4, v3, Lp01;->j:Z

    if-eqz v4, :cond_1

    iget-object p2, p2, LgB6;->i:Lp01;

    iget-boolean v4, p2, Lp01;->j:Z

    if-eqz v4, :cond_1

    iget v1, v3, Lp01;->g:I

    iget p1, p2, Lp01;->g:I

    :cond_1
    sub-int p2, v2, v0

    sub-int v3, p1, v1

    if-ltz p2, :cond_2

    if-ltz v3, :cond_2

    const/high16 p2, -0x80000000

    if-eq v0, p2, :cond_2

    const v3, 0x7fffffff

    if-eq v0, v3, :cond_2

    if-eq v1, p2, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v2, p2, :cond_2

    if-eq v2, v3, :cond_2

    if-eq p1, p2, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    const/4 v0, 0x0

    move p1, v0

    move v1, p1

    move v2, v1

    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Liz0;->N0(IIII)V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Liz0;->w0:Ljava/lang/String;

    return-object v0
.end method

.method public v0()V
    .locals 6

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->S:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->U:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->V:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->W:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    iget-object v0, p0, Liz0;->X:LXy0;

    invoke-virtual {v0}, LXy0;->q()V

    const/4 v0, 0x0

    iput-object v0, p0, Liz0;->c0:Liz0;

    const/4 v1, 0x0

    iput v1, p0, Liz0;->K:F

    const/4 v2, 0x0

    iput v2, p0, Liz0;->d0:I

    iput v2, p0, Liz0;->e0:I

    iput v1, p0, Liz0;->f0:F

    const/4 v1, -0x1

    iput v1, p0, Liz0;->g0:I

    iput v2, p0, Liz0;->h0:I

    iput v2, p0, Liz0;->i0:I

    iput v2, p0, Liz0;->l0:I

    iput v2, p0, Liz0;->m0:I

    iput v2, p0, Liz0;->n0:I

    iput v2, p0, Liz0;->o0:I

    iput v2, p0, Liz0;->p0:I

    sget v3, Liz0;->U0:F

    iput v3, p0, Liz0;->q0:F

    iput v3, p0, Liz0;->r0:F

    iget-object v3, p0, Liz0;->b0:[Liz0$b;

    sget-object v4, Liz0$b;->b:Liz0$b;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, Liz0;->s0:Ljava/lang/Object;

    iput v2, p0, Liz0;->t0:I

    iput v2, p0, Liz0;->u0:I

    iput-object v0, p0, Liz0;->x0:Ljava/lang/String;

    iput-boolean v2, p0, Liz0;->G0:Z

    iput-boolean v2, p0, Liz0;->H0:Z

    iput v2, p0, Liz0;->J0:I

    iput v2, p0, Liz0;->K0:I

    iput-boolean v2, p0, Liz0;->L0:Z

    iput-boolean v2, p0, Liz0;->M0:Z

    iget-object v0, p0, Liz0;->N0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    aput v3, v0, v5

    iput v1, p0, Liz0;->t:I

    iput v1, p0, Liz0;->u:I

    iget-object v0, p0, Liz0;->J:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    aput v3, v0, v5

    iput v2, p0, Liz0;->w:I

    iput v2, p0, Liz0;->x:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Liz0;->B:F

    iput v0, p0, Liz0;->E:F

    iput v3, p0, Liz0;->A:I

    iput v3, p0, Liz0;->D:I

    iput v2, p0, Liz0;->z:I

    iput v2, p0, Liz0;->C:I

    iput-boolean v2, p0, Liz0;->h:Z

    iput v1, p0, Liz0;->H:I

    iput v0, p0, Liz0;->I:F

    iput-boolean v2, p0, Liz0;->I0:Z

    iget-object v0, p0, Liz0;->g:[Z

    aput-boolean v5, v0, v2

    aput-boolean v5, v0, v5

    iput-boolean v2, p0, Liz0;->N:Z

    iget-object v0, p0, Liz0;->a0:[Z

    aput-boolean v2, v0, v2

    aput-boolean v2, v0, v5

    iput-boolean v5, p0, Liz0;->i:Z

    iget-object v0, p0, Liz0;->y:[I

    aput v2, v0, v2

    aput v2, v0, v5

    iput v1, p0, Liz0;->l:I

    iput v1, p0, Liz0;->m:I

    return-void
.end method

.method public w(I)Liz0$b;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Liz0;->C()Liz0$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Liz0;->V()Liz0$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public w0()V
    .locals 1

    invoke-virtual {p0}, Liz0;->x0()V

    sget v0, Liz0;->U0:F

    invoke-virtual {p0, v0}, Liz0;->h1(F)V

    sget v0, Liz0;->U0:F

    invoke-virtual {p0, v0}, Liz0;->Q0(F)V

    return-void
.end method

.method public x()F
    .locals 1

    iget v0, p0, Liz0;->f0:F

    return v0
.end method

.method public x0()V
    .locals 3

    invoke-virtual {p0}, Liz0;->M()Liz0;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v0, v0, Ljz0;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Liz0;->M()Liz0;

    move-result-object v0

    check-cast v0, Ljz0;

    invoke-virtual {v0}, Ljz0;->Q1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Liz0;->Z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Liz0;->Z:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXy0;

    invoke-virtual {v2}, LXy0;->q()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public y()I
    .locals 1

    iget v0, p0, Liz0;->g0:I

    return v0
.end method

.method public y0()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Liz0;->p:Z

    iput-boolean v0, p0, Liz0;->q:Z

    iput-boolean v0, p0, Liz0;->r:Z

    iput-boolean v0, p0, Liz0;->s:Z

    iget-object v1, p0, Liz0;->Z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Liz0;->Z:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXy0;

    invoke-virtual {v2}, LXy0;->r()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public z()I
    .locals 2

    iget v0, p0, Liz0;->u0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Liz0;->e0:I

    return v0
.end method

.method public z0(Lb80;)V
    .locals 1

    iget-object v0, p0, Liz0;->Q:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->R:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->S:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->T:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->U:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->X:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->V:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    iget-object v0, p0, Liz0;->W:LXy0;

    invoke-virtual {v0, p1}, LXy0;->s(Lb80;)V

    return-void
.end method
