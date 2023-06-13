.class public final LZT2;
.super LYT2;
.source "SourceFile"


# static fields
.field public static final c0:[I


# instance fields
.field public final A:I

.field public B:LIf;

.field public C:LIf;

.field public D:I

.field public E:[LIf;

.field public F:I

.field public G:[LIf;

.field public H:LIf;

.field public I:LIf;

.field public J:LO70;

.field public K:I

.field public L:LO70;

.field public M:Ltp;

.field public final N:I

.field public O:LTl2;

.field public P:LTl2;

.field public Q:LTl2;

.field public R:I

.field public S:I

.field public T:I

.field public U:I

.field public V:[I

.field public W:[I

.field public X:Z

.field public Y:Z

.field public Z:I

.field public a0:I

.field public b0:I

.field public final c:LzX5;

.field public final d:I

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public final k:LO70;

.field public l:LNE1;

.field public m:LNE1;

.field public n:I

.field public o:LO70;

.field public p:I

.field public q:LO70;

.field public r:I

.field public s:LO70;

.field public t:I

.field public u:LO70;

.field public v:LIf;

.field public w:LIf;

.field public x:Ltp;

.field public final y:I

.field public final z:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xca

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LZT2;->c0:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x2
        0x2
        0x1
        0x1
        0x1
        0x2
        0x2
        0x1
        0x1
        0x1
        0x0
        0x0
        0x1
        0x2
        0x1
        0x2
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x1
        0x0
        -0x1
        0x0
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x3
        -0x4
        -0x3
        -0x4
        -0x3
        -0x3
        -0x3
        -0x3
        -0x1
        -0x2
        0x1
        0x1
        0x1
        0x2
        0x2
        0x2
        0x0
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        0x0
        0x0
        0x0
        0x0
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        -0x2
        0x0
        0x1
        0x0
        0x1
        -0x1
        -0x1
        0x0
        0x0
        0x1
        0x1
        -0x1
        0x0
        -0x1
        0x0
        0x0
        0x0
        -0x3
        -0x1
        -0x1
        -0x3
        -0x3
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        -0x2
        0x0
        0x1
        0x0
        -0x1
        -0x1
        -0x1
        -0x2
        -0x1
        -0x2
        -0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        -0x1
        -0x1
        0x0
        0x0
        -0x1
        -0x1
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>(LzX5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 1

    const/high16 v0, 0x90000

    invoke-direct {p0, v0}, LYT2;-><init>(I)V

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LZT2;->k:LO70;

    iput-object p1, p0, LZT2;->c:LzX5;

    const-string v0, "<init>"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x40000

    or-int/2addr v0, p2

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    iput v0, p0, LZT2;->d:I

    invoke-virtual {p1, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LZT2;->e:I

    iput-object p3, p0, LZT2;->f:Ljava/lang/String;

    invoke-virtual {p1, p4}, LzX5;->D(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, LZT2;->g:I

    iput-object p4, p0, LZT2;->h:Ljava/lang/String;

    const/4 p3, 0x0

    if-nez p5, :cond_1

    move p5, p3

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p5}, LzX5;->D(Ljava/lang/String;)I

    move-result p5

    :goto_1
    iput p5, p0, LZT2;->A:I

    if-eqz p6, :cond_2

    array-length p5, p6

    if-lez p5, :cond_2

    array-length p5, p6

    iput p5, p0, LZT2;->y:I

    new-array p5, p5, [I

    iput-object p5, p0, LZT2;->z:[I

    :goto_2
    iget p5, p0, LZT2;->y:I

    if-ge p3, p5, :cond_3

    iget-object p5, p0, LZT2;->z:[I

    aget-object v0, p6, p3

    invoke-virtual {p1, v0}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    aput v0, p5, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_2
    iput p3, p0, LZT2;->y:I

    const/4 p1, 0x0

    iput-object p1, p0, LZT2;->z:[I

    :cond_3
    iput p7, p0, LZT2;->N:I

    if-eqz p7, :cond_5

    invoke-static {p4}, LAb6;->c(Ljava/lang/String;)I

    move-result p1

    shr-int/lit8 p1, p1, 0x2

    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_4

    add-int/lit8 p1, p1, -0x1

    :cond_4
    iput p1, p0, LZT2;->j:I

    iput p1, p0, LZT2;->T:I

    new-instance p1, LTl2;

    invoke-direct {p1}, LTl2;-><init>()V

    iput-object p1, p0, LZT2;->O:LTl2;

    invoke-virtual {p0, p1}, LZT2;->o(LTl2;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public A(ILDb6;Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p4, :cond_0

    iget-object p4, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->v:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->v:LIf;

    return-object p1

    :cond_0
    iget-object p4, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->w:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->w:LIf;

    return-object p1
.end method

.method public B(LTl2;LTl2;LTl2;Ljava/lang/String;)V
    .locals 7

    new-instance v6, LNE1;

    if-eqz p4, :cond_0

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p4}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object v0

    iget v0, v0, LvX5;->a:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v4, v0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LNE1;-><init>(LTl2;LTl2;LTl2;ILjava/lang/String;)V

    iget-object p1, p0, LZT2;->l:LNE1;

    if-nez p1, :cond_1

    iput-object v6, p0, LZT2;->l:LNE1;

    goto :goto_1

    :cond_1
    iget-object p1, p0, LZT2;->m:LNE1;

    iput-object v6, p1, LNE1;->f:LNE1;

    :goto_1
    iput-object v6, p0, LZT2;->m:LNE1;

    return-void
.end method

.method public C(ILDb6;Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p4, :cond_0

    iget-object p4, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->H:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->H:LIf;

    return-object p1

    :cond_0
    iget-object p4, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->I:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->I:LIf;

    return-object p1
.end method

.method public D(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    iput v0, p0, LZT2;->Z:I

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p2}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p2

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, p2, LvX5;->a:I

    invoke-virtual {v0, p1, v1}, LO70;->e(II)LO70;

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_3

    iget v1, p0, LZT2;->N:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0xbb

    if-ne p1, p2, :cond_3

    iget p1, p0, LZT2;->R:I

    add-int/lit8 p1, p1, 0x1

    iget p2, p0, LZT2;->S:I

    if-le p1, p2, :cond_1

    iput p1, p0, LZT2;->S:I

    :cond_1
    iput p1, p0, LZT2;->R:I

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, v0, LTl2;->j:LJy1;

    iget v1, p0, LZT2;->Z:I

    iget-object v2, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p1, v1, p2, v2}, LJy1;->d(IILvX5;LzX5;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public E(II)V
    .locals 6

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    const/16 v1, 0xa9

    const/16 v2, 0x36

    const/4 v3, 0x4

    if-ge p2, v3, :cond_1

    if-eq p1, v1, :cond_1

    if-ge p1, v2, :cond_0

    add-int/lit8 v4, p1, -0x15

    shl-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x1a

    goto :goto_0

    :cond_0
    add-int/lit8 v4, p1, -0x36

    shl-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x3b

    :goto_0
    add-int/2addr v4, p2

    invoke-virtual {v0, v4}, LO70;->g(I)LO70;

    goto :goto_1

    :cond_1
    const/16 v4, 0x100

    if-lt p2, v4, :cond_2

    const/16 v4, 0xc4

    invoke-virtual {v0, v4}, LO70;->g(I)LO70;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LO70;->e(II)LO70;

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p1, p2}, LO70;->c(II)LO70;

    :goto_1
    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_7

    iget v4, p0, LZT2;->N:I

    if-eq v4, v3, :cond_6

    const/4 v5, 0x3

    if-ne v4, v5, :cond_3

    goto :goto_2

    :cond_3
    if-ne p1, v1, :cond_4

    iget-short v1, v0, LTl2;->a:S

    or-int/lit8 v1, v1, 0x40

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->a:S

    iget v1, p0, LZT2;->R:I

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->g:S

    invoke-virtual {p0}, LZT2;->L()V

    goto :goto_3

    :cond_4
    iget v0, p0, LZT2;->R:I

    sget-object v1, LZT2;->c0:[I

    aget v1, v1, p1

    add-int/2addr v0, v1

    iget v1, p0, LZT2;->S:I

    if-le v0, v1, :cond_5

    iput v0, p0, LZT2;->S:I

    :cond_5
    iput v0, p0, LZT2;->R:I

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v0, v0, LTl2;->j:LJy1;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v1}, LJy1;->d(IILvX5;LzX5;)V

    :cond_7
    :goto_3
    iget v0, p0, LZT2;->N:I

    if-eqz v0, :cond_a

    const/16 v1, 0x16

    if-eq p1, v1, :cond_9

    const/16 v1, 0x18

    if-eq p1, v1, :cond_9

    const/16 v1, 0x37

    if-eq p1, v1, :cond_9

    const/16 v1, 0x39

    if-ne p1, v1, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 p2, p2, 0x1

    goto :goto_5

    :cond_9
    :goto_4
    add-int/lit8 p2, p2, 0x2

    :goto_5
    iget v1, p0, LZT2;->j:I

    if-le p2, v1, :cond_a

    iput p2, p0, LZT2;->j:I

    :cond_a
    if-lt p1, v2, :cond_b

    if-ne v0, v3, :cond_b

    iget-object p1, p0, LZT2;->l:LNE1;

    if-eqz p1, :cond_b

    new-instance p1, LTl2;

    invoke-direct {p1}, LTl2;-><init>()V

    invoke-virtual {p0, p1}, LZT2;->o(LTl2;)V

    :cond_b
    return-void
.end method

.method public final F(ILTl2;)V
    .locals 3

    iget-object v0, p0, LZT2;->Q:LTl2;

    new-instance v1, Lp91;

    iget-object v2, v0, LTl2;->l:Lp91;

    invoke-direct {v1, p1, p2, v2}, Lp91;-><init>(ILTl2;Lp91;)V

    iput-object v1, v0, LTl2;->l:Lp91;

    return-void
.end method

.method public G(LKj0;ZZIII)Z
    .locals 2

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0}, LzX5;->S()LKj0;

    move-result-object v0

    const/4 v1, 0x0

    if-ne p1, v0, :cond_7

    iget v0, p0, LZT2;->g:I

    if-ne p4, v0, :cond_7

    iget p4, p0, LZT2;->A:I

    if-ne p5, p4, :cond_7

    iget p4, p0, LZT2;->d:I

    const/high16 p5, 0x20000

    and-int/2addr p4, p5

    const/4 p5, 0x1

    if-eqz p4, :cond_0

    move p4, p5

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    if-eq p3, p4, :cond_1

    goto :goto_3

    :cond_1
    iget-object p3, p0, LZT2;->c:LzX5;

    invoke-virtual {p3}, LzX5;->R()I

    move-result p3

    const/16 p4, 0x31

    if-ge p3, p4, :cond_2

    iget p3, p0, LZT2;->d:I

    and-int/lit16 p3, p3, 0x1000

    if-eqz p3, :cond_2

    move p3, p5

    goto :goto_1

    :cond_2
    move p3, v1

    :goto_1
    if-eq p2, p3, :cond_3

    return v1

    :cond_3
    if-nez p6, :cond_4

    iget p1, p0, LZT2;->y:I

    if-eqz p1, :cond_6

    return v1

    :cond_4
    invoke-virtual {p1, p6}, LKj0;->I(I)I

    move-result p2

    iget p3, p0, LZT2;->y:I

    if-ne p2, p3, :cond_6

    add-int/lit8 p6, p6, 0x2

    move p2, v1

    :goto_2
    iget p3, p0, LZT2;->y:I

    if-ge p2, p3, :cond_6

    invoke-virtual {p1, p6}, LKj0;->I(I)I

    move-result p3

    iget-object p4, p0, LZT2;->z:[I

    aget p4, p4, p2

    if-eq p3, p4, :cond_5

    return v1

    :cond_5
    add-int/lit8 p6, p6, 0x2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return p5

    :cond_7
    :goto_3
    return v1
.end method

.method public final H(Ltp$a;)V
    .locals 1

    iget-object v0, p0, LZT2;->M:Ltp;

    invoke-virtual {p1, v0}, Ltp$a;->b(Ltp;)V

    iget-object v0, p0, LZT2;->x:Ltp;

    invoke-virtual {p1, v0}, Ltp$a;->b(Ltp;)V

    return-void
.end method

.method public final I()V
    .locals 11

    iget-object v0, p0, LZT2;->l:LNE1;

    :goto_0
    const-string v1, "java/lang/Throwable"

    if-eqz v0, :cond_2

    iget-object v2, v0, LNE1;->e:Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_1
    iget-object v2, p0, LZT2;->c:LzX5;

    invoke-static {v2, v1}, LJy1;->g(LzX5;Ljava/lang/String;)I

    move-result v1

    iget-object v2, v0, LNE1;->c:LTl2;

    invoke-virtual {v2}, LTl2;->e()LTl2;

    move-result-object v2

    iget-short v3, v2, LTl2;->a:S

    or-int/lit8 v3, v3, 0x2

    int-to-short v3, v3

    iput-short v3, v2, LTl2;->a:S

    iget-object v3, v0, LNE1;->a:LTl2;

    invoke-virtual {v3}, LTl2;->e()LTl2;

    move-result-object v3

    iget-object v4, v0, LNE1;->b:LTl2;

    invoke-virtual {v4}, LTl2;->e()LTl2;

    move-result-object v4

    :goto_2
    if-eq v3, v4, :cond_1

    new-instance v5, Lp91;

    iget-object v6, v3, LTl2;->l:Lp91;

    invoke-direct {v5, v1, v2, v6}, Lp91;-><init>(ILTl2;Lp91;)V

    iput-object v5, v3, LTl2;->l:Lp91;

    iget-object v3, v3, LTl2;->k:LTl2;

    goto :goto_2

    :cond_1
    iget-object v0, v0, LNE1;->f:LNE1;

    goto :goto_0

    :cond_2
    iget-object v0, p0, LZT2;->O:LTl2;

    iget-object v0, v0, LTl2;->j:LJy1;

    iget-object v2, p0, LZT2;->c:LzX5;

    iget v3, p0, LZT2;->d:I

    iget-object v4, p0, LZT2;->h:Ljava/lang/String;

    iget v5, p0, LZT2;->j:I

    invoke-virtual {v0, v2, v3, v4, v5}, LJy1;->u(LzX5;ILjava/lang/String;I)V

    invoke-virtual {v0, p0}, LJy1;->a(LZT2;)V

    iget-object v0, p0, LZT2;->O:LTl2;

    sget-object v2, LTl2;->n:LTl2;

    iput-object v2, v0, LTl2;->m:LTl2;

    const/4 v2, 0x0

    move v3, v2

    :goto_3
    sget-object v4, LTl2;->n:LTl2;

    if-eq v0, v4, :cond_6

    iget-object v4, v0, LTl2;->m:LTl2;

    const/4 v5, 0x0

    iput-object v5, v0, LTl2;->m:LTl2;

    iget-short v5, v0, LTl2;->a:S

    or-int/lit8 v5, v5, 0x8

    int-to-short v5, v5

    iput-short v5, v0, LTl2;->a:S

    iget-object v5, v0, LTl2;->j:LJy1;

    invoke-virtual {v5}, LJy1;->j()I

    move-result v5

    iget-short v6, v0, LTl2;->h:S

    add-int/2addr v5, v6

    if-le v5, v3, :cond_3

    move v3, v5

    :cond_3
    iget-object v5, v0, LTl2;->l:Lp91;

    :goto_4
    if-eqz v5, :cond_5

    iget-object v6, v5, Lp91;->b:LTl2;

    invoke-virtual {v6}, LTl2;->e()LTl2;

    move-result-object v6

    iget-object v7, v0, LTl2;->j:LJy1;

    iget-object v8, p0, LZT2;->c:LzX5;

    iget-object v9, v6, LTl2;->j:LJy1;

    iget v10, v5, Lp91;->a:I

    invoke-virtual {v7, v8, v9, v10}, LJy1;->m(LzX5;LJy1;I)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, v6, LTl2;->m:LTl2;

    if-nez v7, :cond_4

    iput-object v4, v6, LTl2;->m:LTl2;

    move-object v4, v6

    :cond_4
    iget-object v5, v5, Lp91;->c:Lp91;

    goto :goto_4

    :cond_5
    move-object v0, v4

    goto :goto_3

    :cond_6
    iget-object v0, p0, LZT2;->O:LTl2;

    :goto_5
    if-eqz v0, :cond_b

    iget-short v4, v0, LTl2;->a:S

    const/16 v5, 0xa

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_7

    iget-object v4, v0, LTl2;->j:LJy1;

    invoke-virtual {v4, p0}, LJy1;->a(LZT2;)V

    :cond_7
    iget-short v4, v0, LTl2;->a:S

    and-int/lit8 v4, v4, 0x8

    if-nez v4, :cond_a

    iget-object v4, v0, LTl2;->k:LTl2;

    iget v5, v0, LTl2;->d:I

    if-nez v4, :cond_8

    iget-object v6, p0, LZT2;->k:LO70;

    iget v6, v6, LO70;->b:I

    goto :goto_6

    :cond_8
    iget v6, v4, LTl2;->d:I

    :goto_6
    const/4 v7, 0x1

    sub-int/2addr v6, v7

    if-lt v6, v5, :cond_a

    move v8, v5

    :goto_7
    if-ge v8, v6, :cond_9

    iget-object v9, p0, LZT2;->k:LO70;

    iget-object v9, v9, LO70;->a:[B

    aput-byte v2, v9, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    :cond_9
    iget-object v8, p0, LZT2;->k:LO70;

    iget-object v8, v8, LO70;->a:[B

    const/16 v9, -0x41

    aput-byte v9, v8, v6

    invoke-virtual {p0, v5, v2, v7}, LZT2;->V(III)I

    move-result v5

    iget-object v6, p0, LZT2;->W:[I

    iget-object v8, p0, LZT2;->c:LzX5;

    invoke-static {v8, v1}, LJy1;->g(LzX5;Ljava/lang/String;)I

    move-result v8

    aput v8, v6, v5

    invoke-virtual {p0}, LZT2;->U()V

    iget-object v5, p0, LZT2;->l:LNE1;

    invoke-static {v5, v0, v4}, LNE1;->d(LNE1;LTl2;LTl2;)LNE1;

    move-result-object v4

    iput-object v4, p0, LZT2;->l:LNE1;

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_a
    iget-object v0, v0, LTl2;->k:LTl2;

    goto :goto_5

    :cond_b
    iput v3, p0, LZT2;->i:I

    return-void
.end method

.method public final J()V
    .locals 8

    iget-object v0, p0, LZT2;->l:LNE1;

    :goto_0
    const v1, 0x7fffffff

    if-eqz v0, :cond_2

    iget-object v2, v0, LNE1;->c:LTl2;

    iget-object v3, v0, LNE1;->a:LTl2;

    iget-object v4, v0, LNE1;->b:LTl2;

    :goto_1
    if-eq v3, v4, :cond_1

    iget-short v5, v3, LTl2;->a:S

    and-int/lit8 v5, v5, 0x10

    if-nez v5, :cond_0

    new-instance v5, Lp91;

    iget-object v6, v3, LTl2;->l:Lp91;

    invoke-direct {v5, v1, v2, v6}, Lp91;-><init>(ILTl2;Lp91;)V

    iput-object v5, v3, LTl2;->l:Lp91;

    goto :goto_2

    :cond_0
    iget-object v5, v3, LTl2;->l:Lp91;

    iget-object v5, v5, Lp91;->c:Lp91;

    new-instance v6, Lp91;

    iget-object v7, v5, Lp91;->c:Lp91;

    invoke-direct {v6, v1, v2, v7}, Lp91;-><init>(ILTl2;Lp91;)V

    iput-object v6, v5, Lp91;->c:Lp91;

    :goto_2
    iget-object v3, v3, LTl2;->k:LTl2;

    goto :goto_1

    :cond_1
    iget-object v0, v0, LNE1;->f:LNE1;

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, LZT2;->X:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_7

    iget-object v0, p0, LZT2;->O:LTl2;

    invoke-virtual {v0, v2}, LTl2;->f(S)V

    move v0, v2

    move v3, v0

    :goto_3
    if-gt v0, v3, :cond_5

    iget-object v4, p0, LZT2;->O:LTl2;

    :goto_4
    if-eqz v4, :cond_4

    iget-short v5, v4, LTl2;->a:S

    and-int/lit8 v5, v5, 0x10

    if-eqz v5, :cond_3

    iget-short v5, v4, LTl2;->i:S

    if-ne v5, v0, :cond_3

    iget-object v5, v4, LTl2;->l:Lp91;

    iget-object v5, v5, Lp91;->c:Lp91;

    iget-object v5, v5, Lp91;->b:LTl2;

    iget-short v6, v5, LTl2;->i:S

    if-nez v6, :cond_3

    add-int/lit8 v3, v3, 0x1

    int-to-short v3, v3

    invoke-virtual {v5, v3}, LTl2;->f(S)V

    :cond_3
    iget-object v4, v4, LTl2;->k:LTl2;

    goto :goto_4

    :cond_4
    add-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    goto :goto_3

    :cond_5
    iget-object v0, p0, LZT2;->O:LTl2;

    :goto_5
    if-eqz v0, :cond_7

    iget-short v3, v0, LTl2;->a:S

    and-int/lit8 v3, v3, 0x10

    if-eqz v3, :cond_6

    iget-object v3, v0, LTl2;->l:Lp91;

    iget-object v3, v3, Lp91;->c:Lp91;

    iget-object v3, v3, Lp91;->b:LTl2;

    invoke-virtual {v3, v0}, LTl2;->d(LTl2;)V

    :cond_6
    iget-object v0, v0, LTl2;->k:LTl2;

    goto :goto_5

    :cond_7
    iget-object v0, p0, LZT2;->O:LTl2;

    sget-object v3, LTl2;->n:LTl2;

    iput-object v3, v0, LTl2;->m:LTl2;

    iget v3, p0, LZT2;->i:I

    :cond_8
    sget-object v4, LTl2;->n:LTl2;

    if-eq v0, v4, :cond_d

    iget-object v4, v0, LTl2;->m:LTl2;

    iget-short v5, v0, LTl2;->f:S

    iget-short v6, v0, LTl2;->h:S

    add-int/2addr v6, v5

    if-le v6, v3, :cond_9

    move v3, v6

    :cond_9
    iget-object v6, v0, LTl2;->l:Lp91;

    iget-short v0, v0, LTl2;->a:S

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_a

    iget-object v6, v6, Lp91;->c:Lp91;

    :cond_a
    move-object v0, v4

    :goto_6
    if-eqz v6, :cond_8

    iget-object v4, v6, Lp91;->b:LTl2;

    iget-object v7, v4, LTl2;->m:LTl2;

    if-nez v7, :cond_c

    iget v7, v6, Lp91;->a:I

    if-ne v7, v1, :cond_b

    move v7, v2

    goto :goto_7

    :cond_b
    add-int/2addr v7, v5

    :goto_7
    int-to-short v7, v7

    iput-short v7, v4, LTl2;->f:S

    iput-object v0, v4, LTl2;->m:LTl2;

    move-object v0, v4

    :cond_c
    iget-object v6, v6, Lp91;->c:Lp91;

    goto :goto_6

    :cond_d
    iput v3, p0, LZT2;->i:I

    return-void
.end method

.method public K()I
    .locals 9

    iget v0, p0, LZT2;->a0:I

    if-eqz v0, :cond_0

    iget v0, p0, LZT2;->b0:I

    add-int/lit8 v0, v0, 0x6

    return v0

    :cond_0
    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    const/16 v1, 0x8

    if-lez v0, :cond_a

    const v2, 0xffff

    if-gt v0, v2, :cond_9

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v2, "Code"

    invoke-virtual {v0, v2}, LzX5;->D(Ljava/lang/String;)I

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    add-int/lit8 v0, v0, 0x10

    iget-object v2, p0, LZT2;->l:LNE1;

    invoke-static {v2}, LNE1;->b(LNE1;)I

    move-result v2

    add-int/2addr v0, v2

    add-int/2addr v0, v1

    iget-object v2, p0, LZT2;->u:LO70;

    if-eqz v2, :cond_3

    iget-object v2, p0, LZT2;->c:LzX5;

    invoke-virtual {v2}, LzX5;->R()I

    move-result v2

    const/16 v3, 0x32

    if-lt v2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, LZT2;->c:LzX5;

    if-eqz v2, :cond_2

    const-string v2, "StackMapTable"

    goto :goto_1

    :cond_2
    const-string v2, "StackMap"

    :goto_1
    invoke-virtual {v3, v2}, LzX5;->D(Ljava/lang/String;)I

    iget-object v2, p0, LZT2;->u:LO70;

    iget v2, v2, LO70;->b:I

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_3
    iget-object v2, p0, LZT2;->o:LO70;

    if-eqz v2, :cond_4

    iget-object v2, p0, LZT2;->c:LzX5;

    const-string v3, "LineNumberTable"

    invoke-virtual {v2, v3}, LzX5;->D(Ljava/lang/String;)I

    iget-object v2, p0, LZT2;->o:LO70;

    iget v2, v2, LO70;->b:I

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_4
    iget-object v2, p0, LZT2;->q:LO70;

    if-eqz v2, :cond_5

    iget-object v2, p0, LZT2;->c:LzX5;

    const-string v3, "LocalVariableTable"

    invoke-virtual {v2, v3}, LzX5;->D(Ljava/lang/String;)I

    iget-object v2, p0, LZT2;->q:LO70;

    iget v2, v2, LO70;->b:I

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_5
    iget-object v2, p0, LZT2;->s:LO70;

    if-eqz v2, :cond_6

    iget-object v2, p0, LZT2;->c:LzX5;

    const-string v3, "LocalVariableTypeTable"

    invoke-virtual {v2, v3}, LzX5;->D(Ljava/lang/String;)I

    iget-object v2, p0, LZT2;->s:LO70;

    iget v2, v2, LO70;->b:I

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_6
    iget-object v2, p0, LZT2;->v:LIf;

    if-eqz v2, :cond_7

    const-string v3, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {v2, v3}, LIf;->g(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_7
    iget-object v2, p0, LZT2;->w:LIf;

    if-eqz v2, :cond_8

    const-string v3, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {v2, v3}, LIf;->g(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_8
    iget-object v2, p0, LZT2;->x:Ltp;

    if-eqz v2, :cond_b

    iget-object v3, p0, LZT2;->c:LzX5;

    iget-object v4, p0, LZT2;->k:LO70;

    iget-object v5, v4, LO70;->a:[B

    iget v6, v4, LO70;->b:I

    iget v7, p0, LZT2;->i:I

    iget v8, p0, LZT2;->j:I

    move-object v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    invoke-virtual/range {v2 .. v7}, Ltp;->c(LzX5;[BIII)I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_2

    :cond_9
    new-instance v0, Lcom/nimbusds/jose/shaded/ow2asm/MethodTooLargeException;

    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v1}, LzX5;->O()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LZT2;->f:Ljava/lang/String;

    iget-object v3, p0, LZT2;->h:Ljava/lang/String;

    iget-object v4, p0, LZT2;->k:LO70;

    iget v4, v4, LO70;->b:I

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/nimbusds/jose/shaded/ow2asm/MethodTooLargeException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    throw v0

    :cond_a
    move v0, v1

    :cond_b
    :goto_2
    iget v2, p0, LZT2;->y:I

    if-lez v2, :cond_c

    iget-object v2, p0, LZT2;->c:LzX5;

    const-string v3, "Exceptions"

    invoke-virtual {v2, v3}, LzX5;->D(Ljava/lang/String;)I

    iget v2, p0, LZT2;->y:I

    mul-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :cond_c
    iget-object v1, p0, LZT2;->c:LzX5;

    iget v2, p0, LZT2;->d:I

    iget v3, p0, LZT2;->A:I

    invoke-static {v1, v2, v3}, Ltp;->b(LzX5;II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LZT2;->B:LIf;

    iget-object v2, p0, LZT2;->C:LIf;

    iget-object v3, p0, LZT2;->H:LIf;

    iget-object v4, p0, LZT2;->I:LIf;

    invoke-static {v1, v2, v3, v4}, LIf;->f(LIf;LIf;LIf;LIf;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LZT2;->E:[LIf;

    if-eqz v1, :cond_e

    iget v2, p0, LZT2;->D:I

    if-nez v2, :cond_d

    array-length v2, v1

    :cond_d
    const-string v3, "RuntimeVisibleParameterAnnotations"

    invoke-static {v3, v1, v2}, LIf;->h(Ljava/lang/String;[LIf;I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, LZT2;->G:[LIf;

    if-eqz v1, :cond_10

    iget v2, p0, LZT2;->F:I

    if-nez v2, :cond_f

    array-length v2, v1

    :cond_f
    const-string v3, "RuntimeInvisibleParameterAnnotations"

    invoke-static {v3, v1, v2}, LIf;->h(Ljava/lang/String;[LIf;I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_10
    iget-object v1, p0, LZT2;->J:LO70;

    if-eqz v1, :cond_11

    iget-object v1, p0, LZT2;->c:LzX5;

    const-string v2, "AnnotationDefault"

    invoke-virtual {v1, v2}, LzX5;->D(Ljava/lang/String;)I

    iget-object v1, p0, LZT2;->J:LO70;

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x6

    add-int/2addr v0, v1

    :cond_11
    iget-object v1, p0, LZT2;->L:LO70;

    if-eqz v1, :cond_12

    iget-object v1, p0, LZT2;->c:LzX5;

    const-string v2, "MethodParameters"

    invoke-virtual {v1, v2}, LzX5;->D(Ljava/lang/String;)I

    iget-object v1, p0, LZT2;->L:LO70;

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x7

    add-int/2addr v0, v1

    :cond_12
    iget-object v1, p0, LZT2;->M:Ltp;

    if-eqz v1, :cond_13

    iget-object v2, p0, LZT2;->c:LzX5;

    invoke-virtual {v1, v2}, Ltp;->a(LzX5;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_13
    return v0
.end method

.method public final L()V
    .locals 4

    iget v0, p0, LZT2;->N:I

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-instance v0, LTl2;

    invoke-direct {v0}, LTl2;-><init>()V

    new-instance v1, LJy1;

    invoke-direct {v1, v0}, LJy1;-><init>(LTl2;)V

    iput-object v1, v0, LTl2;->j:LJy1;

    iget-object v1, p0, LZT2;->k:LO70;

    iget-object v3, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v3, v1}, LTl2;->i([BI)Z

    iget-object v1, p0, LZT2;->P:LTl2;

    iput-object v0, v1, LTl2;->k:LTl2;

    iput-object v0, p0, LZT2;->P:LTl2;

    iput-object v2, p0, LZT2;->Q:LTl2;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LZT2;->Q:LTl2;

    iget v1, p0, LZT2;->S:I

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->h:S

    iput-object v2, p0, LZT2;->Q:LTl2;

    :cond_1
    :goto_0
    return-void
.end method

.method public M()Z
    .locals 1

    iget-boolean v0, p0, LZT2;->Y:Z

    return v0
.end method

.method public N()Z
    .locals 1

    iget v0, p0, LZT2;->t:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final O(II)V
    .locals 3

    :goto_0
    if-ge p1, p2, :cond_0

    iget-object v0, p0, LZT2;->c:LzX5;

    iget-object v1, p0, LZT2;->W:[I

    aget v1, v1, p1

    iget-object v2, p0, LZT2;->u:LO70;

    invoke-static {v0, v1, v2}, LJy1;->s(LzX5;ILO70;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final P()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LZT2;->W:[I

    const/4 v2, 0x1

    aget v3, v1, v2

    const/4 v4, 0x2

    aget v1, v1, v4

    iget-object v4, v0, LZT2;->c:LzX5;

    invoke-virtual {v4}, LzX5;->R()I

    move-result v4

    const/16 v5, 0x32

    const/4 v6, 0x0

    const/4 v7, 0x3

    if-ge v4, v5, :cond_0

    iget-object v2, v0, LZT2;->u:LO70;

    iget-object v4, v0, LZT2;->W:[I

    aget v4, v4, v6

    invoke-virtual {v2, v4}, LO70;->k(I)LO70;

    move-result-object v2

    invoke-virtual {v2, v3}, LO70;->k(I)LO70;

    add-int/2addr v3, v7

    invoke-virtual {v0, v7, v3}, LZT2;->O(II)V

    iget-object v2, v0, LZT2;->u:LO70;

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    add-int/2addr v1, v3

    invoke-virtual {v0, v3, v1}, LZT2;->O(II)V

    return-void

    :cond_0
    iget v4, v0, LZT2;->t:I

    if-nez v4, :cond_1

    iget-object v4, v0, LZT2;->W:[I

    aget v4, v4, v6

    goto :goto_0

    :cond_1
    iget-object v4, v0, LZT2;->W:[I

    aget v4, v4, v6

    iget-object v5, v0, LZT2;->V:[I

    aget v5, v5, v6

    sub-int/2addr v4, v5

    sub-int/2addr v4, v2

    :goto_0
    iget-object v5, v0, LZT2;->V:[I

    aget v5, v5, v2

    sub-int v8, v3, v5

    const/16 v9, 0xfc

    const/16 v10, 0xf8

    const/16 v11, 0xf7

    const/16 v12, 0x40

    const/16 v13, 0xff

    const/16 v14, 0xfb

    if-nez v1, :cond_3

    packed-switch v8, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    move v2, v9

    goto :goto_2

    :pswitch_1
    if-ge v4, v12, :cond_2

    move v2, v6

    goto :goto_2

    :cond_2
    move v2, v14

    goto :goto_2

    :pswitch_2
    move v2, v10

    goto :goto_2

    :cond_3
    if-nez v8, :cond_5

    if-ne v1, v2, :cond_5

    const/16 v2, 0x3f

    if-ge v4, v2, :cond_4

    move v2, v12

    goto :goto_2

    :cond_4
    move v2, v11

    goto :goto_2

    :cond_5
    :goto_1
    move v2, v13

    :goto_2
    if-eq v2, v13, :cond_7

    move v15, v7

    :goto_3
    if-ge v6, v5, :cond_7

    if-ge v6, v3, :cond_7

    iget-object v7, v0, LZT2;->W:[I

    aget v7, v7, v15

    iget-object v13, v0, LZT2;->V:[I

    aget v13, v13, v15

    if-eq v7, v13, :cond_6

    const/16 v2, 0xff

    goto :goto_4

    :cond_6
    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x3

    const/16 v13, 0xff

    goto :goto_3

    :cond_7
    :goto_4
    if-eqz v2, :cond_d

    if-eq v2, v12, :cond_c

    if-eq v2, v11, :cond_b

    if-eq v2, v10, :cond_a

    if-eq v2, v14, :cond_9

    if-eq v2, v9, :cond_8

    iget-object v2, v0, LZT2;->u:LO70;

    const/16 v5, 0xff

    invoke-virtual {v2, v5}, LO70;->g(I)LO70;

    move-result-object v2

    invoke-virtual {v2, v4}, LO70;->k(I)LO70;

    move-result-object v2

    invoke-virtual {v2, v3}, LO70;->k(I)LO70;

    const/4 v2, 0x3

    add-int/2addr v3, v2

    invoke-virtual {v0, v2, v3}, LZT2;->O(II)V

    iget-object v2, v0, LZT2;->u:LO70;

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    add-int/2addr v1, v3

    invoke-virtual {v0, v3, v1}, LZT2;->O(II)V

    goto :goto_5

    :cond_8
    const/4 v2, 0x3

    iget-object v1, v0, LZT2;->u:LO70;

    add-int/2addr v8, v14

    invoke-virtual {v1, v8}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    add-int/2addr v5, v2

    add-int/2addr v3, v2

    invoke-virtual {v0, v5, v3}, LZT2;->O(II)V

    goto :goto_5

    :cond_9
    iget-object v1, v0, LZT2;->u:LO70;

    invoke-virtual {v1, v14}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    goto :goto_5

    :cond_a
    iget-object v1, v0, LZT2;->u:LO70;

    add-int/2addr v8, v14

    invoke-virtual {v1, v8}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    goto :goto_5

    :cond_b
    iget-object v1, v0, LZT2;->u:LO70;

    invoke-virtual {v1, v11}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    add-int/lit8 v1, v3, 0x3

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v1, v3}, LZT2;->O(II)V

    goto :goto_5

    :cond_c
    iget-object v1, v0, LZT2;->u:LO70;

    add-int/2addr v4, v12

    invoke-virtual {v1, v4}, LO70;->g(I)LO70;

    add-int/lit8 v1, v3, 0x3

    add-int/lit8 v3, v3, 0x4

    invoke-virtual {v0, v1, v3}, LZT2;->O(II)V

    goto :goto_5

    :cond_d
    iget-object v1, v0, LZT2;->u:LO70;

    invoke-virtual {v1, v4}, LO70;->g(I)LO70;

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final Q(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, LZT2;->u:LO70;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LO70;->g(I)LO70;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, LZT2;->u:LO70;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, LO70;->g(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->c:LzX5;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LZT2;->u:LO70;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, LO70;->g(I)LO70;

    move-result-object v0

    check-cast p1, LTl2;

    iget p1, p1, LTl2;->d:I

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    :goto_0
    return-void
.end method

.method public R(LO70;)V
    .locals 13

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0}, LzX5;->R()I

    move-result v0

    const/16 v1, 0x31

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const/16 v1, 0x1000

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iget v4, p0, LZT2;->d:I

    not-int v1, v1

    and-int/2addr v1, v4

    invoke-virtual {p1, v1}, LO70;->k(I)LO70;

    move-result-object v1

    iget v4, p0, LZT2;->e:I

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    move-result-object v1

    iget v4, p0, LZT2;->g:I

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    iget v1, p0, LZT2;->a0:I

    if-eqz v1, :cond_2

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0}, LzX5;->S()LKj0;

    move-result-object v0

    iget-object v0, v0, LKj0;->c:[B

    iget v1, p0, LZT2;->a0:I

    iget v2, p0, LZT2;->b0:I

    invoke-virtual {p1, v0, v1, v2}, LO70;->h([BII)LO70;

    return-void

    :cond_2
    iget-object v1, p0, LZT2;->k:LO70;

    iget v1, v1, LO70;->b:I

    if-lez v1, :cond_3

    move v1, v3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    iget v4, p0, LZT2;->y:I

    if-lez v4, :cond_4

    add-int/lit8 v1, v1, 0x1

    :cond_4
    iget v4, p0, LZT2;->d:I

    and-int/lit16 v5, v4, 0x1000

    if-eqz v5, :cond_5

    if-eqz v0, :cond_5

    add-int/lit8 v1, v1, 0x1

    :cond_5
    iget v0, p0, LZT2;->A:I

    if-eqz v0, :cond_6

    add-int/lit8 v1, v1, 0x1

    :cond_6
    const/high16 v0, 0x20000

    and-int/2addr v0, v4

    if-eqz v0, :cond_7

    add-int/lit8 v1, v1, 0x1

    :cond_7
    iget-object v0, p0, LZT2;->B:LIf;

    if-eqz v0, :cond_8

    add-int/lit8 v1, v1, 0x1

    :cond_8
    iget-object v0, p0, LZT2;->C:LIf;

    if-eqz v0, :cond_9

    add-int/lit8 v1, v1, 0x1

    :cond_9
    iget-object v0, p0, LZT2;->E:[LIf;

    if-eqz v0, :cond_a

    add-int/lit8 v1, v1, 0x1

    :cond_a
    iget-object v0, p0, LZT2;->G:[LIf;

    if-eqz v0, :cond_b

    add-int/lit8 v1, v1, 0x1

    :cond_b
    iget-object v0, p0, LZT2;->H:LIf;

    if-eqz v0, :cond_c

    add-int/lit8 v1, v1, 0x1

    :cond_c
    iget-object v0, p0, LZT2;->I:LIf;

    if-eqz v0, :cond_d

    add-int/lit8 v1, v1, 0x1

    :cond_d
    iget-object v0, p0, LZT2;->J:LO70;

    if-eqz v0, :cond_e

    add-int/lit8 v1, v1, 0x1

    :cond_e
    iget-object v0, p0, LZT2;->L:LO70;

    if-eqz v0, :cond_f

    add-int/lit8 v1, v1, 0x1

    :cond_f
    iget-object v0, p0, LZT2;->M:Ltp;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ltp;->d()I

    move-result v0

    add-int/2addr v1, v0

    :cond_10
    invoke-virtual {p1, v1}, LO70;->k(I)LO70;

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    if-lez v0, :cond_20

    add-int/lit8 v0, v0, 0xa

    iget-object v1, p0, LZT2;->l:LNE1;

    invoke-static {v1}, LNE1;->b(LNE1;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LZT2;->u:LO70;

    if-eqz v1, :cond_11

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    move v1, v3

    goto :goto_3

    :cond_11
    move v1, v2

    :goto_3
    iget-object v4, p0, LZT2;->o:LO70;

    if-eqz v4, :cond_12

    iget v4, v4, LO70;->b:I

    add-int/lit8 v4, v4, 0x8

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    :cond_12
    iget-object v4, p0, LZT2;->q:LO70;

    if-eqz v4, :cond_13

    iget v4, v4, LO70;->b:I

    add-int/lit8 v4, v4, 0x8

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    :cond_13
    iget-object v4, p0, LZT2;->s:LO70;

    if-eqz v4, :cond_14

    iget v4, v4, LO70;->b:I

    add-int/lit8 v4, v4, 0x8

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    :cond_14
    iget-object v4, p0, LZT2;->v:LIf;

    const-string v5, "RuntimeVisibleTypeAnnotations"

    if-eqz v4, :cond_15

    invoke-virtual {v4, v5}, LIf;->g(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    :cond_15
    iget-object v4, p0, LZT2;->w:LIf;

    const-string v6, "RuntimeInvisibleTypeAnnotations"

    if-eqz v4, :cond_16

    invoke-virtual {v4, v6}, LIf;->g(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    :cond_16
    iget-object v7, p0, LZT2;->x:Ltp;

    if-eqz v7, :cond_17

    iget-object v8, p0, LZT2;->c:LzX5;

    iget-object v4, p0, LZT2;->k:LO70;

    iget-object v9, v4, LO70;->a:[B

    iget v10, v4, LO70;->b:I

    iget v11, p0, LZT2;->i:I

    iget v12, p0, LZT2;->j:I

    invoke-virtual/range {v7 .. v12}, Ltp;->c(LzX5;[BIII)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, LZT2;->x:Ltp;

    invoke-virtual {v4}, Ltp;->d()I

    move-result v4

    add-int/2addr v1, v4

    :cond_17
    iget-object v4, p0, LZT2;->c:LzX5;

    const-string v7, "Code"

    invoke-virtual {v4, v7}, LzX5;->D(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p1, v4}, LO70;->k(I)LO70;

    move-result-object v4

    invoke-virtual {v4, v0}, LO70;->i(I)LO70;

    move-result-object v0

    iget v4, p0, LZT2;->i:I

    invoke-virtual {v0, v4}, LO70;->k(I)LO70;

    move-result-object v0

    iget v4, p0, LZT2;->j:I

    invoke-virtual {v0, v4}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v4, p0, LZT2;->k:LO70;

    iget v4, v4, LO70;->b:I

    invoke-virtual {v0, v4}, LO70;->i(I)LO70;

    move-result-object v0

    iget-object v4, p0, LZT2;->k:LO70;

    iget-object v7, v4, LO70;->a:[B

    iget v4, v4, LO70;->b:I

    invoke-virtual {v0, v7, v2, v4}, LO70;->h([BII)LO70;

    iget-object v0, p0, LZT2;->l:LNE1;

    invoke-static {v0, p1}, LNE1;->c(LNE1;LO70;)V

    invoke-virtual {p1, v1}, LO70;->k(I)LO70;

    iget-object v0, p0, LZT2;->u:LO70;

    if-eqz v0, :cond_1a

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0}, LzX5;->R()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_18

    move v0, v3

    goto :goto_4

    :cond_18
    move v0, v2

    :goto_4
    iget-object v1, p0, LZT2;->c:LzX5;

    if-eqz v0, :cond_19

    const-string v0, "StackMapTable"

    goto :goto_5

    :cond_19
    const-string v0, "StackMap"

    :goto_5
    invoke-virtual {v1, v0}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->u:LO70;

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->t:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->u:LO70;

    iget-object v4, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v4, v2, v1}, LO70;->h([BII)LO70;

    :cond_1a
    iget-object v0, p0, LZT2;->o:LO70;

    if-eqz v0, :cond_1b

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "LineNumberTable"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->o:LO70;

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->n:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->o:LO70;

    iget-object v4, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v4, v2, v1}, LO70;->h([BII)LO70;

    :cond_1b
    iget-object v0, p0, LZT2;->q:LO70;

    if-eqz v0, :cond_1c

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "LocalVariableTable"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->q:LO70;

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->p:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->q:LO70;

    iget-object v4, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v4, v2, v1}, LO70;->h([BII)LO70;

    :cond_1c
    iget-object v0, p0, LZT2;->s:LO70;

    if-eqz v0, :cond_1d

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "LocalVariableTypeTable"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->s:LO70;

    iget v1, v1, LO70;->b:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->r:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->s:LO70;

    iget-object v4, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v4, v2, v1}, LO70;->h([BII)LO70;

    :cond_1d
    iget-object v0, p0, LZT2;->v:LIf;

    if-eqz v0, :cond_1e

    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v1, v5}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, p1}, LIf;->k(ILO70;)V

    :cond_1e
    iget-object v0, p0, LZT2;->w:LIf;

    if-eqz v0, :cond_1f

    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v1, v6}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, p1}, LIf;->k(ILO70;)V

    :cond_1f
    iget-object v4, p0, LZT2;->x:Ltp;

    if-eqz v4, :cond_20

    iget-object v5, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->k:LO70;

    iget-object v6, v0, LO70;->a:[B

    iget v7, v0, LO70;->b:I

    iget v8, p0, LZT2;->i:I

    iget v9, p0, LZT2;->j:I

    move-object v10, p1

    invoke-virtual/range {v4 .. v10}, Ltp;->h(LzX5;[BIIILO70;)V

    :cond_20
    iget v0, p0, LZT2;->y:I

    if-lez v0, :cond_21

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "Exceptions"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->y:I

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->y:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    iget-object v0, p0, LZT2;->z:[I

    array-length v1, v0

    move v4, v2

    :goto_6
    if-ge v4, v1, :cond_21

    aget v5, v0, v4

    invoke-virtual {p1, v5}, LO70;->k(I)LO70;

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_21
    iget-object v0, p0, LZT2;->c:LzX5;

    iget v1, p0, LZT2;->d:I

    iget v4, p0, LZT2;->A:I

    invoke-static {v0, v1, v4, p1}, Ltp;->f(LzX5;IILO70;)V

    iget-object v5, p0, LZT2;->c:LzX5;

    iget-object v6, p0, LZT2;->B:LIf;

    iget-object v7, p0, LZT2;->C:LIf;

    iget-object v8, p0, LZT2;->H:LIf;

    iget-object v9, p0, LZT2;->I:LIf;

    move-object v10, p1

    invoke-static/range {v5 .. v10}, LIf;->l(LzX5;LIf;LIf;LIf;LIf;LO70;)V

    iget-object v0, p0, LZT2;->E:[LIf;

    if-eqz v0, :cond_23

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "RuntimeVisibleParameterAnnotations"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, LZT2;->E:[LIf;

    iget v4, p0, LZT2;->D:I

    if-nez v4, :cond_22

    array-length v4, v1

    :cond_22
    invoke-static {v0, v1, v4, p1}, LIf;->m(I[LIf;ILO70;)V

    :cond_23
    iget-object v0, p0, LZT2;->G:[LIf;

    if-eqz v0, :cond_25

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "RuntimeInvisibleParameterAnnotations"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, LZT2;->G:[LIf;

    iget v4, p0, LZT2;->F:I

    if-nez v4, :cond_24

    array-length v4, v1

    :cond_24
    invoke-static {v0, v1, v4, p1}, LIf;->m(I[LIf;ILO70;)V

    :cond_25
    iget-object v0, p0, LZT2;->J:LO70;

    if-eqz v0, :cond_26

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "AnnotationDefault"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->J:LO70;

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->J:LO70;

    iget-object v4, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v4, v2, v1}, LO70;->h([BII)LO70;

    :cond_26
    iget-object v0, p0, LZT2;->L:LO70;

    if-eqz v0, :cond_27

    iget-object v0, p0, LZT2;->c:LzX5;

    const-string v1, "MethodParameters"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->L:LO70;

    iget v1, v1, LO70;->b:I

    add-int/2addr v1, v3

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, LZT2;->K:I

    invoke-virtual {v0, v1}, LO70;->g(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->L:LO70;

    iget-object v3, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {v0, v3, v2, v1}, LO70;->h([BII)LO70;

    :cond_27
    iget-object v0, p0, LZT2;->M:Ltp;

    if-eqz v0, :cond_28

    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, v1, p1}, Ltp;->g(LzX5;LO70;)V

    :cond_28
    return-void
.end method

.method public S(II)V
    .locals 0

    add-int/lit8 p1, p1, 0x6

    iput p1, p0, LZT2;->a0:I

    add-int/lit8 p2, p2, -0x6

    iput p2, p0, LZT2;->b0:I

    return-void
.end method

.method public T(II)V
    .locals 1

    iget-object v0, p0, LZT2;->W:[I

    aput p2, v0, p1

    return-void
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, LZT2;->V:[I

    if-eqz v0, :cond_1

    iget-object v0, p0, LZT2;->u:LO70;

    if-nez v0, :cond_0

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LZT2;->u:LO70;

    :cond_0
    invoke-virtual {p0}, LZT2;->P()V

    iget v0, p0, LZT2;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LZT2;->t:I

    :cond_1
    iget-object v0, p0, LZT2;->W:[I

    iput-object v0, p0, LZT2;->V:[I

    const/4 v0, 0x0

    iput-object v0, p0, LZT2;->W:[I

    return-void
.end method

.method public V(III)I
    .locals 2

    add-int/lit8 v0, p2, 0x3

    add-int/2addr v0, p3

    iget-object v1, p0, LZT2;->W:[I

    if-eqz v1, :cond_0

    array-length v1, v1

    if-ge v1, v0, :cond_1

    :cond_0
    new-array v0, v0, [I

    iput-object v0, p0, LZT2;->W:[I

    :cond_1
    iget-object v0, p0, LZT2;->W:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    const/4 p1, 0x2

    aput p3, v0, p1

    const/4 p1, 0x3

    return p1
.end method

.method public final W(LTl2;[LTl2;)V
    .locals 4

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_2

    iget v1, p0, LZT2;->N:I

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    iget-object v0, v0, LTl2;->j:LJy1;

    const/16 v1, 0xab

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v2, v2}, LJy1;->d(IILvX5;LzX5;)V

    invoke-virtual {p0, v3, p1}, LZT2;->F(ILTl2;)V

    invoke-virtual {p1}, LTl2;->e()LTl2;

    move-result-object p1

    iget-short v0, p1, LTl2;->a:S

    or-int/lit8 v0, v0, 0x2

    int-to-short v0, v0

    iput-short v0, p1, LTl2;->a:S

    array-length p1, p2

    move v0, v3

    :goto_0
    if-ge v0, p1, :cond_1

    aget-object v1, p2, v0

    invoke-virtual {p0, v3, v1}, LZT2;->F(ILTl2;)V

    invoke-virtual {v1}, LTl2;->e()LTl2;

    move-result-object v1

    iget-short v2, v1, LTl2;->a:S

    or-int/lit8 v2, v2, 0x2

    int-to-short v2, v2

    iput-short v2, v1, LTl2;->a:S

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    iget v1, p0, LZT2;->R:I

    sub-int/2addr v1, v0

    iput v1, p0, LZT2;->R:I

    invoke-virtual {p0, v1, p1}, LZT2;->F(ILTl2;)V

    array-length p1, p2

    :goto_1
    if-ge v3, p1, :cond_1

    aget-object v0, p2, v3

    iget v1, p0, LZT2;->R:I

    invoke-virtual {p0, v1, v0}, LZT2;->F(ILTl2;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LZT2;->L()V

    :cond_2
    return-void
.end method

.method public a(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    iput p1, p0, LZT2;->D:I

    goto :goto_0

    :cond_0
    iput p1, p0, LZT2;->F:I

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->B:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->B:LIf;

    return-object p1

    :cond_0
    iget-object p2, p0, LZT2;->c:LzX5;

    iget-object v0, p0, LZT2;->C:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->C:LIf;

    return-object p1
.end method

.method public c()LHf;
    .locals 5

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LZT2;->J:LO70;

    new-instance v1, LIf;

    iget-object v2, p0, LZT2;->c:LzX5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v0, v4}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    return-object v1
.end method

.method public d(Ltp;)V
    .locals 1

    invoke-virtual {p1}, Ltp;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZT2;->x:Ltp;

    iput-object v0, p1, Ltp;->c:Ltp;

    iput-object p1, p0, LZT2;->x:Ltp;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZT2;->M:Ltp;

    iput-object v0, p1, Ltp;->c:Ltp;

    iput-object p1, p0, LZT2;->M:Ltp;

    :goto_0
    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    iput v0, p0, LZT2;->Z:I

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p2, p3, p4}, LzX5;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LvX5;

    move-result-object p2

    iget-object p3, p0, LZT2;->k:LO70;

    iget v0, p2, LvX5;->a:I

    invoke-virtual {p3, p1, v0}, LO70;->e(II)LO70;

    iget-object p3, p0, LZT2;->Q:LTl2;

    if-eqz p3, :cond_a

    iget v0, p0, LZT2;->N:I

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_9

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p4, v2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/4 p3, 0x1

    const/4 p4, -0x2

    const/16 v0, 0x4a

    const/16 v1, 0x44

    packed-switch p1, :pswitch_data_0

    iget p1, p0, LZT2;->R:I

    if-eq p2, v1, :cond_7

    if-ne p2, v0, :cond_4

    goto :goto_1

    :pswitch_0
    iget p1, p0, LZT2;->R:I

    if-eq p2, v1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    move v2, p3

    :cond_2
    add-int/2addr p1, v2

    goto :goto_2

    :pswitch_1
    iget p1, p0, LZT2;->R:I

    if-eq p2, v1, :cond_4

    if-ne p2, v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p4, -0x1

    :cond_4
    :goto_0
    add-int/2addr p1, p4

    goto :goto_2

    :pswitch_2
    iget p1, p0, LZT2;->R:I

    if-eq p2, v1, :cond_5

    if-ne p2, v0, :cond_6

    :cond_5
    const/4 p3, 0x2

    :cond_6
    add-int/2addr p1, p3

    goto :goto_2

    :cond_7
    :goto_1
    const/4 p4, -0x3

    goto :goto_0

    :goto_2
    iget p2, p0, LZT2;->S:I

    if-le p1, p2, :cond_8

    iput p1, p0, LZT2;->S:I

    :cond_8
    iput p1, p0, LZT2;->R:I

    goto :goto_4

    :cond_9
    :goto_3
    iget-object p3, p3, LTl2;->j:LJy1;

    iget-object p4, p0, LZT2;->c:LzX5;

    invoke-virtual {p3, p1, v2, p2, p4}, LJy1;->d(IILvX5;LzX5;)V

    :cond_a
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0xb2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 12

    move-object v0, p0

    move v1, p1

    move v3, p2

    move/from16 v7, p4

    iget v2, v0, LZT2;->N:I

    const/4 v4, 0x4

    if-ne v2, v4, :cond_0

    return-void

    :cond_0
    const/4 v5, -0x1

    const/4 v8, 0x2

    const/4 v6, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-ne v2, v6, :cond_3

    iget-object v2, v0, LZT2;->Q:LTl2;

    iget-object v4, v2, LTl2;->j:LJy1;

    if-nez v4, :cond_1

    new-instance v1, LaF0;

    invoke-direct {v1, v2}, LaF0;-><init>(LTl2;)V

    iput-object v1, v2, LTl2;->j:LJy1;

    iget-object v1, v0, LZT2;->Q:LTl2;

    iget-object v1, v1, LTl2;->j:LJy1;

    iget-object v2, v0, LZT2;->c:LzX5;

    iget v4, v0, LZT2;->d:I

    iget-object v5, v0, LZT2;->h:Ljava/lang/String;

    invoke-virtual {v1, v2, v4, v5, p2}, LJy1;->u(LzX5;ILjava/lang/String;I)V

    iget-object v1, v0, LZT2;->Q:LTl2;

    iget-object v1, v1, LTl2;->j:LJy1;

    invoke-virtual {v1, p0}, LJy1;->a(LZT2;)V

    goto/16 :goto_8

    :cond_1
    if-ne v1, v5, :cond_2

    iget-object v2, v0, LZT2;->c:LzX5;

    move-object v1, v4

    move v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, LJy1;->t(LzX5;I[Ljava/lang/Object;I[Ljava/lang/Object;)V

    :cond_2
    iget-object v1, v0, LZT2;->Q:LTl2;

    iget-object v1, v1, LTl2;->j:LJy1;

    invoke-virtual {v1, p0}, LJy1;->a(LZT2;)V

    goto/16 :goto_8

    :cond_3
    if-ne v1, v5, :cond_7

    iget-object v1, v0, LZT2;->V:[I

    if-nez v1, :cond_4

    iget-object v1, v0, LZT2;->h:Ljava/lang/String;

    invoke-static {v1}, LAb6;->c(Ljava/lang/String;)I

    move-result v1

    shr-int/2addr v1, v8

    new-instance v2, LJy1;

    new-instance v4, LTl2;

    invoke-direct {v4}, LTl2;-><init>()V

    invoke-direct {v2, v4}, LJy1;-><init>(LTl2;)V

    iget-object v4, v0, LZT2;->c:LzX5;

    iget v5, v0, LZT2;->d:I

    iget-object v6, v0, LZT2;->h:Ljava/lang/String;

    invoke-virtual {v2, v4, v5, v6, v1}, LJy1;->u(LzX5;ILjava/lang/String;I)V

    invoke-virtual {v2, p0}, LJy1;->a(LZT2;)V

    :cond_4
    iput v3, v0, LZT2;->T:I

    iget-object v1, v0, LZT2;->k:LO70;

    iget v1, v1, LO70;->b:I

    invoke-virtual {p0, v1, p2, v7}, LZT2;->V(III)I

    move-result v1

    move v2, v9

    :goto_0
    if-ge v2, v3, :cond_5

    iget-object v4, v0, LZT2;->W:[I

    add-int/lit8 v5, v1, 0x1

    iget-object v6, v0, LZT2;->c:LzX5;

    aget-object v11, p3, v2

    invoke-static {v6, v11}, LJy1;->e(LzX5;Ljava/lang/Object;)I

    move-result v6

    aput v6, v4, v1

    add-int/lit8 v2, v2, 0x1

    move v1, v5

    goto :goto_0

    :cond_5
    move v2, v9

    :goto_1
    if-ge v2, v7, :cond_6

    iget-object v3, v0, LZT2;->W:[I

    add-int/lit8 v4, v1, 0x1

    iget-object v5, v0, LZT2;->c:LzX5;

    aget-object v6, p5, v2

    invoke-static {v5, v6}, LJy1;->e(LzX5;Ljava/lang/Object;)I

    move-result v5

    aput v5, v3, v1

    add-int/lit8 v2, v2, 0x1

    move v1, v4

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, LZT2;->U()V

    goto/16 :goto_8

    :cond_7
    iget-object v2, v0, LZT2;->c:LzX5;

    invoke-virtual {v2}, LzX5;->R()I

    move-result v2

    const/16 v5, 0x32

    if-lt v2, v5, :cond_18

    iget-object v2, v0, LZT2;->u:LO70;

    if-nez v2, :cond_8

    new-instance v2, LO70;

    invoke-direct {v2}, LO70;-><init>()V

    iput-object v2, v0, LZT2;->u:LO70;

    iget-object v2, v0, LZT2;->k:LO70;

    iget v2, v2, LO70;->b:I

    goto :goto_2

    :cond_8
    iget-object v2, v0, LZT2;->k:LO70;

    iget v2, v2, LO70;->b:I

    iget v5, v0, LZT2;->U:I

    sub-int/2addr v2, v5

    sub-int/2addr v2, v10

    if-gez v2, :cond_a

    if-ne v1, v6, :cond_9

    return-void

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_a
    :goto_2
    if-eqz v1, :cond_11

    if-eq v1, v10, :cond_10

    const/16 v5, 0xfb

    if-eq v1, v8, :cond_f

    const/16 v3, 0x40

    if-eq v1, v6, :cond_d

    if-ne v1, v4, :cond_c

    if-ge v2, v3, :cond_b

    iget-object v1, v0, LZT2;->u:LO70;

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, LO70;->g(I)LO70;

    goto :goto_3

    :cond_b
    iget-object v1, v0, LZT2;->u:LO70;

    const/16 v3, 0xf7

    invoke-virtual {v1, v3}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    :goto_3
    aget-object v1, p5, v9

    invoke-virtual {p0, v1}, LZT2;->Q(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_d
    if-ge v2, v3, :cond_e

    iget-object v1, v0, LZT2;->u:LO70;

    invoke-virtual {v1, v2}, LO70;->g(I)LO70;

    goto :goto_7

    :cond_e
    iget-object v1, v0, LZT2;->u:LO70;

    invoke-virtual {v1, v5}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    goto :goto_7

    :cond_f
    iget v1, v0, LZT2;->T:I

    sub-int/2addr v1, v3

    iput v1, v0, LZT2;->T:I

    iget-object v1, v0, LZT2;->u:LO70;

    sub-int/2addr v5, v3

    invoke-virtual {v1, v5}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    goto :goto_7

    :cond_10
    iget v1, v0, LZT2;->T:I

    add-int/2addr v1, v3

    iput v1, v0, LZT2;->T:I

    iget-object v1, v0, LZT2;->u:LO70;

    add-int/lit16 v4, v3, 0xfb

    invoke-virtual {v1, v4}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    move v1, v9

    :goto_4
    if-ge v1, v3, :cond_13

    aget-object v2, p3, v1

    invoke-virtual {p0, v2}, LZT2;->Q(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_11
    iput v3, v0, LZT2;->T:I

    iget-object v1, v0, LZT2;->u:LO70;

    const/16 v4, 0xff

    invoke-virtual {v1, v4}, LO70;->g(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    move-result-object v1

    invoke-virtual {v1, p2}, LO70;->k(I)LO70;

    move v1, v9

    :goto_5
    if-ge v1, v3, :cond_12

    aget-object v2, p3, v1

    invoke-virtual {p0, v2}, LZT2;->Q(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_12
    iget-object v1, v0, LZT2;->u:LO70;

    invoke-virtual {v1, v7}, LO70;->k(I)LO70;

    move v1, v9

    :goto_6
    if-ge v1, v7, :cond_13

    aget-object v2, p5, v1

    invoke-virtual {p0, v2}, LZT2;->Q(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_13
    :goto_7
    iget-object v1, v0, LZT2;->k:LO70;

    iget v1, v1, LO70;->b:I

    iput v1, v0, LZT2;->U:I

    iget v1, v0, LZT2;->t:I

    add-int/2addr v1, v10

    iput v1, v0, LZT2;->t:I

    :goto_8
    iget v1, v0, LZT2;->N:I

    if-ne v1, v8, :cond_17

    iput v7, v0, LZT2;->R:I

    :goto_9
    if-ge v9, v7, :cond_16

    aget-object v1, p5, v9

    sget-object v2, LIh3;->e:Ljava/lang/Integer;

    if-eq v1, v2, :cond_14

    sget-object v2, LIh3;->d:Ljava/lang/Integer;

    if-ne v1, v2, :cond_15

    :cond_14
    iget v1, v0, LZT2;->R:I

    add-int/2addr v1, v10

    iput v1, v0, LZT2;->R:I

    :cond_15
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_16
    iget v1, v0, LZT2;->R:I

    iget v2, v0, LZT2;->S:I

    if-le v1, v2, :cond_17

    iput v1, v0, LZT2;->S:I

    :cond_17
    iget v1, v0, LZT2;->i:I

    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, LZT2;->i:I

    iget v1, v0, LZT2;->j:I

    iget v2, v0, LZT2;->T:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, LZT2;->j:I

    return-void

    :cond_18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Class versions V1_5 or less must use F_NEW frames."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public i(II)V
    .locals 3

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    const/16 v1, 0xff

    const/16 v2, 0x84

    if-gt p1, v1, :cond_1

    const/16 v1, 0x7f

    if-gt p2, v1, :cond_1

    const/16 v1, -0x80

    if-ge p2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, LO70;->g(I)LO70;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LO70;->c(II)LO70;

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v1, 0xc4

    invoke-virtual {v0, v1}, LO70;->g(I)LO70;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, LO70;->e(II)LO70;

    move-result-object v0

    invoke-virtual {v0, p2}, LO70;->k(I)LO70;

    :goto_1
    iget-object p2, p0, LZT2;->Q:LTl2;

    if-eqz p2, :cond_3

    iget v0, p0, LZT2;->N:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    :cond_2
    iget-object p2, p2, LTl2;->j:LJy1;

    const/4 v0, 0x0

    invoke-virtual {p2, v2, p1, v0, v0}, LJy1;->d(IILvX5;LzX5;)V

    :cond_3
    iget p2, p0, LZT2;->N:I

    if-eqz p2, :cond_4

    add-int/lit8 p1, p1, 0x1

    iget p2, p0, LZT2;->j:I

    if-le p1, p2, :cond_4

    iput p1, p0, LZT2;->j:I

    :cond_4
    return-void
.end method

.method public j(I)V
    .locals 3

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    invoke-virtual {v0, p1}, LO70;->g(I)LO70;

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_5

    iget v1, p0, LZT2;->N:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, LZT2;->R:I

    sget-object v1, LZT2;->c0:[I

    aget v1, v1, p1

    add-int/2addr v0, v1

    iget v1, p0, LZT2;->S:I

    if-le v0, v1, :cond_1

    iput v0, p0, LZT2;->S:I

    :cond_1
    iput v0, p0, LZT2;->R:I

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, v0, LTl2;->j:LJy1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, LJy1;->d(IILvX5;LzX5;)V

    :goto_1
    const/16 v0, 0xac

    if-lt p1, v0, :cond_3

    const/16 v0, 0xb1

    if-le p1, v0, :cond_4

    :cond_3
    const/16 v0, 0xbf

    if-ne p1, v0, :cond_5

    :cond_4
    invoke-virtual {p0}, LZT2;->L()V

    :cond_5
    return-void
.end method

.method public k(ILDb6;Ljava/lang/String;Z)LHf;
    .locals 1

    const v0, -0xffff01

    if-eqz p4, :cond_0

    iget-object p4, p0, LZT2;->c:LzX5;

    and-int/2addr p1, v0

    iget v0, p0, LZT2;->Z:I

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p1, v0

    iget-object v0, p0, LZT2;->v:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->v:LIf;

    return-object p1

    :cond_0
    iget-object p4, p0, LZT2;->c:LzX5;

    and-int/2addr p1, v0

    iget v0, p0, LZT2;->Z:I

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p1, v0

    iget-object v0, p0, LZT2;->w:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LZT2;->w:LIf;

    return-object p1
.end method

.method public l(II)V
    .locals 3

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    const/16 v1, 0x11

    if-ne p1, v1, :cond_0

    invoke-virtual {v0, p1, p2}, LO70;->e(II)LO70;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LO70;->c(II)LO70;

    :goto_0
    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_4

    iget v1, p0, LZT2;->N:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/16 p2, 0xbc

    if-eq p1, p2, :cond_4

    iget p1, p0, LZT2;->R:I

    add-int/lit8 p1, p1, 0x1

    iget p2, p0, LZT2;->S:I

    if-le p1, p2, :cond_2

    iput p1, p0, LZT2;->S:I

    :cond_2
    iput p1, p0, LZT2;->R:I

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, v0, LTl2;->j:LJy1;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v1}, LJy1;->d(IILvX5;LzX5;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public varargs m(Ljava/lang/String;Ljava/lang/String;LGE1;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    iput v0, p0, LZT2;->Z:I

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p1, p2, p3, p4}, LzX5;->o(Ljava/lang/String;Ljava/lang/String;LGE1;[Ljava/lang/Object;)LvX5;

    move-result-object p1

    iget-object p2, p0, LZT2;->k:LO70;

    iget p3, p1, LvX5;->a:I

    const/16 p4, 0xba

    invoke-virtual {p2, p4, p3}, LO70;->e(II)LO70;

    iget-object p2, p0, LZT2;->k:LO70;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, LO70;->k(I)LO70;

    iget-object p2, p0, LZT2;->Q:LTl2;

    if-eqz p2, :cond_3

    iget v0, p0, LZT2;->N:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LvX5;->a()I

    move-result p1

    and-int/lit8 p2, p1, 0x3

    shr-int/lit8 p1, p1, 0x2

    sub-int/2addr p2, p1

    add-int/lit8 p2, p2, 0x1

    iget p1, p0, LZT2;->R:I

    add-int/2addr p1, p2

    iget p2, p0, LZT2;->S:I

    if-le p1, p2, :cond_1

    iput p1, p0, LZT2;->S:I

    :cond_1
    iput p1, p0, LZT2;->R:I

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p2, p2, LTl2;->j:LJy1;

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {p2, p4, p3, p1, v0}, LJy1;->d(IILvX5;LzX5;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public n(ILTl2;)V
    .locals 10

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    const/16 v2, 0xc8

    if-lt p1, v2, :cond_0

    add-int/lit8 v3, p1, -0x21

    goto :goto_0

    :cond_0
    move v3, p1

    :goto_0
    iget-short v4, p2, LTl2;->a:S

    const/4 v5, 0x4

    and-int/2addr v4, v5

    const/16 v6, 0xa8

    const/16 v7, 0xa7

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v4, :cond_4

    iget v4, p2, LTl2;->d:I

    sub-int/2addr v4, v1

    const/16 v1, -0x8000

    if-ge v4, v1, :cond_4

    if-ne v3, v7, :cond_1

    invoke-virtual {v0, v2}, LO70;->g(I)LO70;

    goto :goto_1

    :cond_1
    if-ne v3, v6, :cond_2

    const/16 p1, 0xc9

    invoke-virtual {v0, p1}, LO70;->g(I)LO70;

    :goto_1
    move p1, v8

    goto :goto_3

    :cond_2
    const/16 p1, 0xc6

    if-lt v3, p1, :cond_3

    xor-int/lit8 p1, v3, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 p1, v3, 0x1

    xor-int/2addr p1, v9

    sub-int/2addr p1, v9

    :goto_2
    invoke-virtual {v0, p1}, LO70;->g(I)LO70;

    iget-object p1, p0, LZT2;->k:LO70;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    iget-object p1, p0, LZT2;->k:LO70;

    const/16 v0, 0xdc

    invoke-virtual {p1, v0}, LO70;->g(I)LO70;

    iput-boolean v9, p0, LZT2;->Y:Z

    move p1, v9

    :goto_3
    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    sub-int/2addr v1, v9

    invoke-virtual {p2, v0, v1, v9}, LTl2;->h(LO70;IZ)V

    goto :goto_5

    :cond_4
    if-eq v3, p1, :cond_5

    invoke-virtual {v0, p1}, LO70;->g(I)LO70;

    iget-object p1, p0, LZT2;->k:LO70;

    iget v0, p1, LO70;->b:I

    sub-int/2addr v0, v9

    invoke-virtual {p2, p1, v0, v9}, LTl2;->h(LO70;IZ)V

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v3}, LO70;->g(I)LO70;

    iget-object p1, p0, LZT2;->k:LO70;

    iget v0, p1, LO70;->b:I

    sub-int/2addr v0, v9

    invoke-virtual {p2, p1, v0, v8}, LTl2;->h(LO70;IZ)V

    :goto_4
    move p1, v8

    :goto_5
    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_e

    iget v1, p0, LZT2;->N:I

    const/4 v2, 0x2

    const/4 v4, 0x0

    if-ne v1, v5, :cond_6

    iget-object v0, v0, LTl2;->j:LJy1;

    invoke-virtual {v0, v3, v8, v4, v4}, LJy1;->d(IILvX5;LzX5;)V

    invoke-virtual {p2}, LTl2;->e()LTl2;

    move-result-object v0

    iget-short v1, v0, LTl2;->a:S

    or-int/2addr v1, v2

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->a:S

    invoke-virtual {p0, v8, p2}, LZT2;->F(ILTl2;)V

    if-eq v3, v7, :cond_b

    new-instance v4, LTl2;

    invoke-direct {v4}, LTl2;-><init>()V

    goto :goto_6

    :cond_6
    const/4 v5, 0x3

    if-ne v1, v5, :cond_7

    iget-object p2, v0, LTl2;->j:LJy1;

    invoke-virtual {p2, v3, v8, v4, v4}, LJy1;->d(IILvX5;LzX5;)V

    goto :goto_6

    :cond_7
    if-ne v1, v2, :cond_8

    iget p2, p0, LZT2;->R:I

    sget-object v0, LZT2;->c0:[I

    aget v0, v0, v3

    add-int/2addr p2, v0

    iput p2, p0, LZT2;->R:I

    goto :goto_6

    :cond_8
    if-ne v3, v6, :cond_a

    iget-short v1, p2, LTl2;->a:S

    and-int/lit8 v4, v1, 0x20

    if-nez v4, :cond_9

    or-int/lit8 v1, v1, 0x20

    int-to-short v1, v1

    iput-short v1, p2, LTl2;->a:S

    iput-boolean v9, p0, LZT2;->X:Z

    :cond_9
    iget-short v1, v0, LTl2;->a:S

    or-int/lit8 v1, v1, 0x10

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->a:S

    iget v0, p0, LZT2;->R:I

    add-int/2addr v0, v9

    invoke-virtual {p0, v0, p2}, LZT2;->F(ILTl2;)V

    new-instance v4, LTl2;

    invoke-direct {v4}, LTl2;-><init>()V

    goto :goto_6

    :cond_a
    iget v0, p0, LZT2;->R:I

    sget-object v1, LZT2;->c0:[I

    aget v1, v1, v3

    add-int/2addr v0, v1

    iput v0, p0, LZT2;->R:I

    invoke-virtual {p0, v0, p2}, LZT2;->F(ILTl2;)V

    :cond_b
    :goto_6
    if-eqz v4, :cond_d

    if-eqz p1, :cond_c

    iget-short p1, v4, LTl2;->a:S

    or-int/2addr p1, v2

    int-to-short p1, p1

    iput-short p1, v4, LTl2;->a:S

    :cond_c
    invoke-virtual {p0, v4}, LZT2;->o(LTl2;)V

    :cond_d
    if-ne v3, v7, :cond_e

    invoke-virtual {p0}, LZT2;->L()V

    :cond_e
    return-void
.end method

.method public o(LTl2;)V
    .locals 6

    iget-boolean v0, p0, LZT2;->Y:Z

    iget-object v1, p0, LZT2;->k:LO70;

    iget-object v2, v1, LO70;->a:[B

    iget v1, v1, LO70;->b:I

    invoke-virtual {p1, v2, v1}, LTl2;->i([BI)Z

    move-result v1

    or-int/2addr v0, v1

    iput-boolean v0, p0, LZT2;->Y:Z

    iget-short v0, p1, LTl2;->a:S

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget v1, p0, LZT2;->N:I

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, LZT2;->Q:LTl2;

    if-eqz v1, :cond_2

    iget v2, p1, LTl2;->d:I

    iget v5, v1, LTl2;->d:I

    if-ne v2, v5, :cond_1

    iget-short v2, v1, LTl2;->a:S

    and-int/2addr v0, v4

    or-int/2addr v0, v2

    int-to-short v0, v0

    iput-short v0, v1, LTl2;->a:S

    iget-object v0, v1, LTl2;->j:LJy1;

    iput-object v0, p1, LTl2;->j:LJy1;

    return-void

    :cond_1
    invoke-virtual {p0, v3, p1}, LZT2;->F(ILTl2;)V

    :cond_2
    iget-object v0, p0, LZT2;->P:LTl2;

    if-eqz v0, :cond_4

    iget v1, p1, LTl2;->d:I

    iget v2, v0, LTl2;->d:I

    if-ne v1, v2, :cond_3

    iget-short v1, v0, LTl2;->a:S

    iget-short v2, p1, LTl2;->a:S

    and-int/2addr v2, v4

    or-int/2addr v1, v2

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->a:S

    iget-object v1, v0, LTl2;->j:LJy1;

    iput-object v1, p1, LTl2;->j:LJy1;

    iput-object v0, p0, LZT2;->Q:LTl2;

    return-void

    :cond_3
    iput-object p1, v0, LTl2;->k:LTl2;

    :cond_4
    iput-object p1, p0, LZT2;->P:LTl2;

    iput-object p1, p0, LZT2;->Q:LTl2;

    new-instance v0, LJy1;

    invoke-direct {v0, p1}, LJy1;-><init>(LTl2;)V

    iput-object v0, p1, LTl2;->j:LJy1;

    goto :goto_0

    :cond_5
    const/4 v0, 0x3

    if-ne v1, v0, :cond_7

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-nez v0, :cond_6

    iput-object p1, p0, LZT2;->Q:LTl2;

    goto :goto_0

    :cond_6
    iget-object v0, v0, LTl2;->j:LJy1;

    iput-object p1, v0, LJy1;->a:LTl2;

    goto :goto_0

    :cond_7
    const/4 v0, 0x1

    if-ne v1, v0, :cond_a

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_8

    iget v1, p0, LZT2;->S:I

    int-to-short v1, v1

    iput-short v1, v0, LTl2;->h:S

    iget v0, p0, LZT2;->R:I

    invoke-virtual {p0, v0, p1}, LZT2;->F(ILTl2;)V

    :cond_8
    iput-object p1, p0, LZT2;->Q:LTl2;

    iput v3, p0, LZT2;->R:I

    iput v3, p0, LZT2;->S:I

    iget-object v0, p0, LZT2;->P:LTl2;

    if-eqz v0, :cond_9

    iput-object p1, v0, LTl2;->k:LTl2;

    :cond_9
    iput-object p1, p0, LZT2;->P:LTl2;

    goto :goto_0

    :cond_a
    if-ne v1, v4, :cond_b

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-nez v0, :cond_b

    iput-object p1, p0, LZT2;->Q:LTl2;

    :cond_b
    :goto_0
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    iput v0, p0, LZT2;->Z:I

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p1}, LzX5;->d(Ljava/lang/Object;)LvX5;

    move-result-object p1

    iget v0, p1, LvX5;->a:I

    iget v1, p1, LvX5;->b:I

    const/4 v2, 0x5

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    const/16 v2, 0x11

    if-ne v1, v2, :cond_0

    iget-object v1, p1, LvX5;->e:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x4a

    if-eq v1, v2, :cond_1

    const/16 v2, 0x44

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    const/16 v2, 0x12

    if-eqz v1, :cond_2

    iget-object v5, p0, LZT2;->k:LO70;

    const/16 v6, 0x14

    invoke-virtual {v5, v6, v0}, LO70;->e(II)LO70;

    goto :goto_2

    :cond_2
    const/16 v5, 0x100

    if-lt v0, v5, :cond_3

    iget-object v5, p0, LZT2;->k:LO70;

    const/16 v6, 0x13

    invoke-virtual {v5, v6, v0}, LO70;->e(II)LO70;

    goto :goto_2

    :cond_3
    iget-object v5, p0, LZT2;->k:LO70;

    invoke-virtual {v5, v2, v0}, LO70;->c(II)LO70;

    :goto_2
    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_8

    iget v5, p0, LZT2;->N:I

    const/4 v6, 0x4

    if-eq v5, v6, :cond_7

    const/4 v6, 0x3

    if-ne v5, v6, :cond_4

    goto :goto_3

    :cond_4
    iget p1, p0, LZT2;->R:I

    if-eqz v1, :cond_5

    const/4 v3, 0x2

    :cond_5
    add-int/2addr p1, v3

    iget v0, p0, LZT2;->S:I

    if-le p1, v0, :cond_6

    iput p1, p0, LZT2;->S:I

    :cond_6
    iput p1, p0, LZT2;->R:I

    goto :goto_4

    :cond_7
    :goto_3
    iget-object v0, v0, LTl2;->j:LJy1;

    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, v2, v4, p1, v1}, LJy1;->d(IILvX5;LzX5;)V

    :cond_8
    :goto_4
    return-void
.end method

.method public q(ILTl2;)V
    .locals 1

    iget-object v0, p0, LZT2;->o:LO70;

    if-nez v0, :cond_0

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LZT2;->o:LO70;

    :cond_0
    iget v0, p0, LZT2;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LZT2;->n:I

    iget-object v0, p0, LZT2;->o:LO70;

    iget p2, p2, LTl2;->d:I

    invoke-virtual {v0, p2}, LO70;->k(I)LO70;

    iget-object p2, p0, LZT2;->o:LO70;

    invoke-virtual {p2, p1}, LO70;->k(I)LO70;

    return-void
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LTl2;LTl2;I)V
    .locals 4

    const/4 v0, 0x1

    if-eqz p3, :cond_1

    iget-object v1, p0, LZT2;->s:LO70;

    if-nez v1, :cond_0

    new-instance v1, LO70;

    invoke-direct {v1}, LO70;-><init>()V

    iput-object v1, p0, LZT2;->s:LO70;

    :cond_0
    iget v1, p0, LZT2;->r:I

    add-int/2addr v1, v0

    iput v1, p0, LZT2;->r:I

    iget-object v1, p0, LZT2;->s:LO70;

    iget v2, p4, LTl2;->d:I

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    move-result-object v1

    iget v2, p5, LTl2;->d:I

    iget v3, p4, LTl2;->d:I

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v2, p0, LZT2;->c:LzX5;

    invoke-virtual {v2, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v2, p0, LZT2;->c:LzX5;

    invoke-virtual {v2, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {v1, p3}, LO70;->k(I)LO70;

    move-result-object p3

    invoke-virtual {p3, p6}, LO70;->k(I)LO70;

    :cond_1
    iget-object p3, p0, LZT2;->q:LO70;

    if-nez p3, :cond_2

    new-instance p3, LO70;

    invoke-direct {p3}, LO70;-><init>()V

    iput-object p3, p0, LZT2;->q:LO70;

    :cond_2
    iget p3, p0, LZT2;->p:I

    add-int/2addr p3, v0

    iput p3, p0, LZT2;->p:I

    iget-object p3, p0, LZT2;->q:LO70;

    iget v1, p4, LTl2;->d:I

    invoke-virtual {p3, v1}, LO70;->k(I)LO70;

    move-result-object p3

    iget p5, p5, LTl2;->d:I

    iget p4, p4, LTl2;->d:I

    sub-int/2addr p5, p4

    invoke-virtual {p3, p5}, LO70;->k(I)LO70;

    move-result-object p3

    iget-object p4, p0, LZT2;->c:LzX5;

    invoke-virtual {p4, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p3, p1}, LO70;->k(I)LO70;

    move-result-object p1

    iget-object p3, p0, LZT2;->c:LzX5;

    invoke-virtual {p3, p2}, LzX5;->D(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p1, p3}, LO70;->k(I)LO70;

    move-result-object p1

    invoke-virtual {p1, p6}, LO70;->k(I)LO70;

    iget p1, p0, LZT2;->N:I

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 p2, 0x4a

    if-eq p1, p2, :cond_3

    const/16 p2, 0x44

    if-ne p1, p2, :cond_4

    :cond_3
    const/4 v0, 0x2

    :cond_4
    add-int/2addr p6, v0

    iget p1, p0, LZT2;->j:I

    if-le p6, p1, :cond_5

    iput p6, p0, LZT2;->j:I

    :cond_5
    return-void
.end method

.method public s(ILDb6;[LTl2;[LTl2;[ILjava/lang/String;Z)LHf;
    .locals 5

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    ushr-int/lit8 p1, p1, 0x18

    invoke-virtual {v0, p1}, LO70;->g(I)LO70;

    move-result-object p1

    array-length v1, p3

    invoke-virtual {p1, v1}, LO70;->k(I)LO70;

    const/4 p1, 0x0

    move v1, p1

    :goto_0
    array-length v2, p3

    if-ge v1, v2, :cond_0

    aget-object v2, p3, v1

    iget v2, v2, LTl2;->d:I

    invoke-virtual {v0, v2}, LO70;->k(I)LO70;

    move-result-object v2

    aget-object v3, p4, v1

    iget v3, v3, LTl2;->d:I

    aget-object v4, p3, v1

    iget v4, v4, LTl2;->d:I

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, LO70;->k(I)LO70;

    move-result-object v2

    aget v3, p5, v1

    invoke-virtual {v2, v3}, LO70;->k(I)LO70;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p2, v0}, LDb6;->d(LDb6;LO70;)V

    iget-object p2, p0, LZT2;->c:LzX5;

    invoke-virtual {p2, p6}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, LO70;->k(I)LO70;

    move-result-object p2

    invoke-virtual {p2, p1}, LO70;->k(I)LO70;

    const/4 p1, 0x1

    if-eqz p7, :cond_1

    new-instance p2, LIf;

    iget-object p3, p0, LZT2;->c:LzX5;

    iget-object p4, p0, LZT2;->v:LIf;

    invoke-direct {p2, p3, p1, v0, p4}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    iput-object p2, p0, LZT2;->v:LIf;

    return-object p2

    :cond_1
    new-instance p2, LIf;

    iget-object p3, p0, LZT2;->c:LzX5;

    iget-object p4, p0, LZT2;->w:LIf;

    invoke-direct {p2, p3, p1, v0, p4}, LIf;-><init>(LzX5;ZLO70;LIf;)V

    iput-object p2, p0, LZT2;->w:LIf;

    return-object p2
.end method

.method public t(LTl2;[I[LTl2;)V
    .locals 5

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    const/16 v1, 0xab

    invoke-virtual {v0, v1}, LO70;->g(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->k:LO70;

    iget v1, v1, LO70;->b:I

    rem-int/lit8 v1, v1, 0x4

    rsub-int/lit8 v1, v1, 0x4

    rem-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, LO70;->h([BII)LO70;

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, p0, LZT2;->Z:I

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, LTl2;->h(LO70;IZ)V

    iget-object v0, p0, LZT2;->k:LO70;

    array-length v1, p3

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    :goto_0
    array-length v0, p3

    if-ge v3, v0, :cond_0

    iget-object v0, p0, LZT2;->k:LO70;

    aget v1, p2, v3

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    aget-object v0, p3, v3

    iget-object v1, p0, LZT2;->k:LO70;

    iget v4, p0, LZT2;->Z:I

    invoke-virtual {v0, v1, v4, v2}, LTl2;->h(LO70;IZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p3}, LZT2;->W(LTl2;[LTl2;)V

    return-void
.end method

.method public u(II)V
    .locals 2

    iget v0, p0, LZT2;->N:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LZT2;->I()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LZT2;->J()V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget p1, p0, LZT2;->S:I

    iput p1, p0, LZT2;->i:I

    goto :goto_0

    :cond_2
    iput p1, p0, LZT2;->i:I

    iput p2, p0, LZT2;->j:I

    :goto_0
    return-void
.end method

.method public v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    iput v0, p0, LZT2;->Z:I

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p2, p3, p4, p5}, LzX5;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)LvX5;

    move-result-object p2

    const/4 p3, 0x0

    const/16 p4, 0xb9

    if-ne p1, p4, :cond_0

    iget-object p5, p0, LZT2;->k:LO70;

    iget v0, p2, LvX5;->a:I

    invoke-virtual {p5, p4, v0}, LO70;->e(II)LO70;

    move-result-object p4

    invoke-virtual {p2}, LvX5;->a()I

    move-result p5

    shr-int/lit8 p5, p5, 0x2

    invoke-virtual {p4, p5, p3}, LO70;->c(II)LO70;

    goto :goto_0

    :cond_0
    iget-object p4, p0, LZT2;->k:LO70;

    iget p5, p2, LvX5;->a:I

    invoke-virtual {p4, p1, p5}, LO70;->e(II)LO70;

    :goto_0
    iget-object p4, p0, LZT2;->Q:LTl2;

    if-eqz p4, :cond_5

    iget p5, p0, LZT2;->N:I

    const/4 v0, 0x4

    if-eq p5, v0, :cond_4

    const/4 v0, 0x3

    if-ne p5, v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, LvX5;->a()I

    move-result p2

    and-int/lit8 p3, p2, 0x3

    shr-int/lit8 p2, p2, 0x2

    sub-int/2addr p3, p2

    const/16 p2, 0xb8

    if-ne p1, p2, :cond_2

    iget p1, p0, LZT2;->R:I

    add-int/2addr p1, p3

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    iget p1, p0, LZT2;->R:I

    add-int/2addr p1, p3

    :goto_1
    iget p2, p0, LZT2;->S:I

    if-le p1, p2, :cond_3

    iput p1, p0, LZT2;->S:I

    :cond_3
    iput p1, p0, LZT2;->R:I

    goto :goto_3

    :cond_4
    :goto_2
    iget-object p4, p4, LTl2;->j:LJy1;

    iget-object p5, p0, LZT2;->c:LzX5;

    invoke-virtual {p4, p1, p3, p2, p5}, LJy1;->d(IILvX5;LzX5;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public w(Ljava/lang/String;I)V
    .locals 4

    iget-object v0, p0, LZT2;->k:LO70;

    iget v0, v0, LO70;->b:I

    iput v0, p0, LZT2;->Z:I

    iget-object v0, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, p1, LvX5;->a:I

    const/16 v2, 0xc5

    invoke-virtual {v0, v2, v1}, LO70;->e(II)LO70;

    move-result-object v0

    invoke-virtual {v0, p2}, LO70;->g(I)LO70;

    iget-object v0, p0, LZT2;->Q:LTl2;

    if-eqz v0, :cond_2

    iget v1, p0, LZT2;->N:I

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, LZT2;->R:I

    rsub-int/lit8 p2, p2, 0x1

    add-int/2addr p1, p2

    iput p1, p0, LZT2;->R:I

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, v0, LTl2;->j:LJy1;

    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v0, v2, p2, p1, v1}, LJy1;->d(IILvX5;LzX5;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public x(Ljava/lang/String;I)V
    .locals 2

    iget-object v0, p0, LZT2;->L:LO70;

    if-nez v0, :cond_0

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LZT2;->L:LO70;

    :cond_0
    iget v0, p0, LZT2;->K:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LZT2;->K:I

    iget-object v0, p0, LZT2;->L:LO70;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LZT2;->c:LzX5;

    invoke-virtual {v1, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    move-result-object p1

    invoke-virtual {p1, p2}, LO70;->k(I)LO70;

    return-void
.end method

.method public y(ILjava/lang/String;Z)LHf;
    .locals 2

    if-eqz p3, :cond_1

    iget-object p3, p0, LZT2;->E:[LIf;

    if-nez p3, :cond_0

    iget-object p3, p0, LZT2;->h:Ljava/lang/String;

    invoke-static {p3}, LAb6;->b(Ljava/lang/String;)[LAb6;

    move-result-object p3

    array-length p3, p3

    new-array p3, p3, [LIf;

    iput-object p3, p0, LZT2;->E:[LIf;

    :cond_0
    iget-object p3, p0, LZT2;->E:[LIf;

    iget-object v0, p0, LZT2;->c:LzX5;

    aget-object v1, p3, p1

    invoke-static {v0, p2, v1}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p2

    aput-object p2, p3, p1

    return-object p2

    :cond_1
    iget-object p3, p0, LZT2;->G:[LIf;

    if-nez p3, :cond_2

    iget-object p3, p0, LZT2;->h:Ljava/lang/String;

    invoke-static {p3}, LAb6;->b(Ljava/lang/String;)[LAb6;

    move-result-object p3

    array-length p3, p3

    new-array p3, p3, [LIf;

    iput-object p3, p0, LZT2;->G:[LIf;

    :cond_2
    iget-object p3, p0, LZT2;->G:[LIf;

    iget-object v0, p0, LZT2;->c:LzX5;

    aget-object v1, p3, p1

    invoke-static {v0, p2, v1}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p2

    aput-object p2, p3, p1

    return-object p2
.end method

.method public varargs z(IILTl2;[LTl2;)V
    .locals 4

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, v0, LO70;->b:I

    iput v1, p0, LZT2;->Z:I

    const/16 v1, 0xaa

    invoke-virtual {v0, v1}, LO70;->g(I)LO70;

    move-result-object v0

    iget-object v1, p0, LZT2;->k:LO70;

    iget v1, v1, LO70;->b:I

    rem-int/lit8 v1, v1, 0x4

    rsub-int/lit8 v1, v1, 0x4

    rem-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, LO70;->h([BII)LO70;

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, p0, LZT2;->Z:I

    const/4 v2, 0x1

    invoke-virtual {p3, v0, v1, v2}, LTl2;->h(LO70;IZ)V

    iget-object v0, p0, LZT2;->k:LO70;

    invoke-virtual {v0, p1}, LO70;->i(I)LO70;

    move-result-object p1

    invoke-virtual {p1, p2}, LO70;->i(I)LO70;

    array-length p1, p4

    :goto_0
    if-ge v3, p1, :cond_0

    aget-object p2, p4, v3

    iget-object v0, p0, LZT2;->k:LO70;

    iget v1, p0, LZT2;->Z:I

    invoke-virtual {p2, v0, v1, v2}, LTl2;->h(LO70;IZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p3, p4}, LZT2;->W(LTl2;[LTl2;)V

    return-void
.end method
