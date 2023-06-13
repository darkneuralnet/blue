.class public final LrP5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:[B

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:[B

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:I

.field public R:J

.field public S:[B

.field public T:I

.field public U:I

.field public V:I

.field public W:I

.field public X:I

.field public Y:I

.field public Z:[B

.field public a:I

.field public b:I

.field public final c:LIT;

.field public d:[B

.field public final e:[I

.field public final f:[I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Z

.field public final k:LRN1;

.field public final l:LRN1;

.field public final m:LRN1;

.field public final n:[I

.field public final o:[I

.field public final p:[I

.field public final q:[I

.field public r:I

.field public s:I

.field public t:I

.field public u:Z

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:[B


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LrP5;->a:I

    new-instance v1, LIT;

    invoke-direct {v1}, LIT;-><init>()V

    iput-object v1, p0, LrP5;->c:LIT;

    const/16 v1, 0xca8

    new-array v2, v1, [I

    iput-object v2, p0, LrP5;->e:[I

    new-array v1, v1, [I

    iput-object v1, p0, LrP5;->f:[I

    new-instance v1, LRN1;

    invoke-direct {v1}, LRN1;-><init>()V

    iput-object v1, p0, LrP5;->k:LRN1;

    new-instance v1, LRN1;

    invoke-direct {v1}, LRN1;-><init>()V

    iput-object v1, p0, LrP5;->l:LRN1;

    new-instance v1, LRN1;

    invoke-direct {v1}, LRN1;-><init>()V

    iput-object v1, p0, LrP5;->m:LRN1;

    const/4 v1, 0x3

    new-array v2, v1, [I

    iput-object v2, p0, LrP5;->n:[I

    new-array v1, v1, [I

    iput-object v1, p0, LrP5;->o:[I

    const/4 v1, 0x6

    new-array v1, v1, [I

    iput-object v1, p0, LrP5;->p:[I

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    iput-object v1, p0, LrP5;->q:[I

    iput v0, p0, LrP5;->r:I

    iput v0, p0, LrP5;->s:I

    iput v0, p0, LrP5;->t:I

    iput-boolean v0, p0, LrP5;->u:Z

    iput v0, p0, LrP5;->v:I

    iput v0, p0, LrP5;->Q:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, LrP5;->R:J

    new-array v1, v0, [B

    iput-object v1, p0, LrP5;->S:[B

    iput v0, p0, LrP5;->T:I

    return-void

    nop

    :array_0
    .array-data 4
        0x10
        0xf
        0xb
        0x4
    .end array-data
.end method

.method public static a(LrP5;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LrP5;->a:I

    if-eqz v0, :cond_1

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iput v1, p0, LrP5;->a:I

    iget-object p0, p0, LrP5;->c:LIT;

    invoke-static {p0}, LIT;->b(LIT;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "State MUST be initialized"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(LIT;)I
    .locals 3

    const/4 v0, 0x1

    invoke-static {p0, v0}, LIT;->i(LIT;I)I

    move-result v0

    if-nez v0, :cond_0

    const/16 p0, 0x10

    return p0

    :cond_0
    const/4 v0, 0x3

    invoke-static {p0, v0}, LIT;->i(LIT;I)I

    move-result v1

    const/16 v2, 0x11

    if-eqz v1, :cond_1

    add-int/2addr v1, v2

    return v1

    :cond_1
    invoke-static {p0, v0}, LIT;->i(LIT;I)I

    move-result p0

    if-eqz p0, :cond_2

    add-int/lit8 p0, p0, 0x8

    return p0

    :cond_2
    return v2
.end method

.method public static c(LrP5;Ljava/io/InputStream;)V
    .locals 1

    iget v0, p0, LrP5;->a:I

    if-nez v0, :cond_1

    iget-object v0, p0, LrP5;->c:LIT;

    invoke-static {v0, p1}, LIT;->e(LIT;Ljava/io/InputStream;)V

    iget-object p1, p0, LrP5;->c:LIT;

    invoke-static {p1}, LrP5;->b(LIT;)I

    move-result p1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    shl-int p1, v0, p1

    iput p1, p0, LrP5;->P:I

    add-int/lit8 p1, p1, -0x10

    iput p1, p0, LrP5;->O:I

    iput v0, p0, LrP5;->a:I

    return-void

    :cond_0
    new-instance p0, LP20;

    const-string p1, "Invalid \'windowBits\' code"

    invoke-direct {p0, p1}, LP20;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "State MUST be uninitialized"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
