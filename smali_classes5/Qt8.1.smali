.class public final LQt8;
.super LCk8;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LCk8<",
        "LQt8;",
        ">;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:Lcom/google/android/gms/internal/clearcut/j;

.field public B:Z

.field public d:J

.field public e:J

.field public f:J

.field public g:Ljava/lang/String;

.field public h:I

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Z

.field public l:[Lfu8;

.field public m:[B

.field public n:Lcom/google/android/gms/internal/clearcut/i;

.field public o:[B

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/String;

.field public r:LCs8;

.field public s:Ljava/lang/String;

.field public t:J

.field public u:LRs8;

.field public v:[B

.field public w:Ljava/lang/String;

.field public x:I

.field public y:[I

.field public z:J


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, LCk8;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LQt8;->d:J

    iput-wide v0, p0, LQt8;->e:J

    iput-wide v0, p0, LQt8;->f:J

    const-string v2, ""

    iput-object v2, p0, LQt8;->g:Ljava/lang/String;

    const/4 v3, 0x0

    iput v3, p0, LQt8;->h:I

    iput-object v2, p0, LQt8;->i:Ljava/lang/String;

    iput v3, p0, LQt8;->j:I

    iput-boolean v3, p0, LQt8;->k:Z

    invoke-static {}, Lfu8;->k()[Lfu8;

    move-result-object v4

    iput-object v4, p0, LQt8;->l:[Lfu8;

    sget-object v4, Len8;->h:[B

    iput-object v4, p0, LQt8;->m:[B

    const/4 v5, 0x0

    iput-object v5, p0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    iput-object v4, p0, LQt8;->o:[B

    iput-object v2, p0, LQt8;->p:Ljava/lang/String;

    iput-object v2, p0, LQt8;->q:Ljava/lang/String;

    iput-object v5, p0, LQt8;->r:LCs8;

    iput-object v2, p0, LQt8;->s:Ljava/lang/String;

    const-wide/32 v6, 0x2bf20

    iput-wide v6, p0, LQt8;->t:J

    iput-object v5, p0, LQt8;->u:LRs8;

    iput-object v4, p0, LQt8;->v:[B

    iput-object v2, p0, LQt8;->w:Ljava/lang/String;

    iput v3, p0, LQt8;->x:I

    sget-object v2, Len8;->a:[I

    iput-object v2, p0, LQt8;->y:[I

    iput-wide v0, p0, LQt8;->z:J

    iput-object v5, p0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    iput-boolean v3, p0, LQt8;->B:Z

    iput-object v5, p0, LCk8;->c:Lcl8;

    const/4 v0, -0x1

    iput v0, p0, LQl8;->b:I

    return-void
.end method


# virtual methods
.method public final synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LQt8;->k()LQt8;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lck8;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-wide v0, p0, LQt8;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    invoke-virtual {p1, v4, v0, v1}, Lck8;->u(IJ)V

    :cond_0
    iget-object v0, p0, LQt8;->g:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v4, p0, LQt8;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v4}, Lck8;->b(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, LQt8;->l:[Lfu8;

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v4

    :goto_0
    iget-object v5, p0, LQt8;->l:[Lfu8;

    array-length v6, v5

    if-ge v0, v6, :cond_3

    aget-object v5, v5, v0

    if-eqz v5, :cond_2

    const/4 v6, 0x3

    invoke-virtual {p1, v6, v5}, Lck8;->c(ILQl8;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, LQt8;->m:[B

    sget-object v5, Len8;->h:[B

    invoke-static {v0, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x4

    iget-object v6, p0, LQt8;->m:[B

    invoke-virtual {p1, v0, v6}, Lck8;->d(I[B)V

    :cond_4
    iget-object v0, p0, LQt8;->o:[B

    invoke-static {v0, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x6

    iget-object v6, p0, LQt8;->o:[B

    invoke-virtual {p1, v0, v6}, Lck8;->d(I[B)V

    :cond_5
    iget-object v0, p0, LQt8;->r:LCs8;

    if-eqz v0, :cond_6

    const/4 v6, 0x7

    invoke-virtual {p1, v6, v0}, Lck8;->c(ILQl8;)V

    :cond_6
    iget-object v0, p0, LQt8;->p:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const/16 v0, 0x8

    iget-object v6, p0, LQt8;->p:Ljava/lang/String;

    invoke-virtual {p1, v0, v6}, Lck8;->b(ILjava/lang/String;)V

    :cond_7
    iget-object v0, p0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    if-eqz v0, :cond_8

    const/16 v6, 0x9

    invoke-virtual {p1, v6, v0}, Lck8;->o(ILH28;)V

    :cond_8
    iget v0, p0, LQt8;->h:I

    if-eqz v0, :cond_9

    const/16 v6, 0xb

    invoke-virtual {p1, v6, v0}, Lck8;->l(II)V

    :cond_9
    iget-object v0, p0, LQt8;->q:Ljava/lang/String;

    if-eqz v0, :cond_a

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    const/16 v0, 0xd

    iget-object v6, p0, LQt8;->q:Ljava/lang/String;

    invoke-virtual {p1, v0, v6}, Lck8;->b(ILjava/lang/String;)V

    :cond_a
    iget-object v0, p0, LQt8;->s:Ljava/lang/String;

    if-eqz v0, :cond_b

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const/16 v0, 0xe

    iget-object v6, p0, LQt8;->s:Ljava/lang/String;

    invoke-virtual {p1, v0, v6}, Lck8;->b(ILjava/lang/String;)V

    :cond_b
    iget-wide v6, p0, LQt8;->t:J

    const-wide/32 v8, 0x2bf20

    cmp-long v0, v6, v8

    if-eqz v0, :cond_c

    const/16 v0, 0xf

    invoke-virtual {p1, v0, v4}, Lck8;->j(II)V

    invoke-static {v6, v7}, Lck8;->v(J)J

    move-result-wide v6

    invoke-virtual {p1, v6, v7}, Lck8;->w(J)V

    :cond_c
    iget-object v0, p0, LQt8;->u:LRs8;

    if-eqz v0, :cond_d

    const/16 v6, 0x10

    invoke-virtual {p1, v6, v0}, Lck8;->c(ILQl8;)V

    :cond_d
    iget-wide v6, p0, LQt8;->e:J

    cmp-long v0, v6, v2

    if-eqz v0, :cond_e

    const/16 v0, 0x11

    invoke-virtual {p1, v0, v6, v7}, Lck8;->u(IJ)V

    :cond_e
    iget-object v0, p0, LQt8;->v:[B

    invoke-static {v0, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_f

    const/16 v0, 0x12

    iget-object v2, p0, LQt8;->v:[B

    invoke-virtual {p1, v0, v2}, Lck8;->d(I[B)V

    :cond_f
    iget-object v0, p0, LQt8;->y:[I

    if-eqz v0, :cond_10

    array-length v0, v0

    if-lez v0, :cond_10

    :goto_1
    iget-object v0, p0, LQt8;->y:[I

    array-length v2, v0

    if-ge v4, v2, :cond_10

    const/16 v2, 0x14

    aget v0, v0, v4

    invoke-virtual {p1, v2, v0}, Lck8;->l(II)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_10
    iget-object v0, p0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    if-eqz v0, :cond_11

    const/16 v2, 0x17

    invoke-virtual {p1, v2, v0}, Lck8;->o(ILH28;)V

    :cond_11
    iget-object v0, p0, LQt8;->w:Ljava/lang/String;

    if-eqz v0, :cond_12

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    const/16 v0, 0x18

    iget-object v2, p0, LQt8;->w:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lck8;->b(ILjava/lang/String;)V

    :cond_12
    iget-boolean v0, p0, LQt8;->B:Z

    if-eqz v0, :cond_13

    const/16 v2, 0x19

    invoke-virtual {p1, v2, v0}, Lck8;->k(IZ)V

    :cond_13
    iget-object v0, p0, LQt8;->i:Ljava/lang/String;

    if-eqz v0, :cond_14

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    const/16 v0, 0x1a

    iget-object v1, p0, LQt8;->i:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lck8;->b(ILjava/lang/String;)V

    :cond_14
    invoke-super {p0, p1}, LCk8;->d(Lck8;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LQt8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LQt8;

    iget-wide v3, p0, LQt8;->d:J

    iget-wide v5, p1, LQt8;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LQt8;->e:J

    iget-wide v5, p1, LQt8;->e:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LQt8;->g:Ljava/lang/String;

    if-nez v1, :cond_4

    iget-object v1, p1, LQt8;->g:Ljava/lang/String;

    if-eqz v1, :cond_5

    return v2

    :cond_4
    iget-object v3, p1, LQt8;->g:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, LQt8;->h:I

    iget v3, p1, LQt8;->h:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LQt8;->i:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p1, LQt8;->i:Ljava/lang/String;

    if-eqz v1, :cond_8

    return v2

    :cond_7
    iget-object v3, p1, LQt8;->i:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LQt8;->l:[Lfu8;

    iget-object v3, p1, LQt8;->l:[Lfu8;

    invoke-static {v1, v3}, LDl8;->c([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, LQt8;->m:[B

    iget-object v3, p1, LQt8;->m:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    if-nez v1, :cond_b

    iget-object v1, p1, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    if-eqz v1, :cond_c

    return v2

    :cond_b
    iget-object v3, p1, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/clearcut/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, LQt8;->o:[B

    iget-object v3, p1, LQt8;->o:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, LQt8;->p:Ljava/lang/String;

    if-nez v1, :cond_e

    iget-object v1, p1, LQt8;->p:Ljava/lang/String;

    if-eqz v1, :cond_f

    return v2

    :cond_e
    iget-object v3, p1, LQt8;->p:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, LQt8;->q:Ljava/lang/String;

    if-nez v1, :cond_10

    iget-object v1, p1, LQt8;->q:Ljava/lang/String;

    if-eqz v1, :cond_11

    return v2

    :cond_10
    iget-object v3, p1, LQt8;->q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, LQt8;->r:LCs8;

    if-nez v1, :cond_12

    iget-object v1, p1, LQt8;->r:LCs8;

    if-eqz v1, :cond_13

    return v2

    :cond_12
    iget-object v3, p1, LQt8;->r:LCs8;

    invoke-virtual {v1, v3}, LCs8;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, LQt8;->s:Ljava/lang/String;

    if-nez v1, :cond_14

    iget-object v1, p1, LQt8;->s:Ljava/lang/String;

    if-eqz v1, :cond_15

    return v2

    :cond_14
    iget-object v3, p1, LQt8;->s:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, LQt8;->t:J

    iget-wide v5, p1, LQt8;->t:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, LQt8;->u:LRs8;

    if-nez v1, :cond_17

    iget-object v1, p1, LQt8;->u:LRs8;

    if-eqz v1, :cond_18

    return v2

    :cond_17
    iget-object v3, p1, LQt8;->u:LRs8;

    invoke-virtual {v1, v3}, LRs8;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, LQt8;->v:[B

    iget-object v3, p1, LQt8;->v:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, LQt8;->w:Ljava/lang/String;

    if-nez v1, :cond_1a

    iget-object v1, p1, LQt8;->w:Ljava/lang/String;

    if-eqz v1, :cond_1b

    return v2

    :cond_1a
    iget-object v3, p1, LQt8;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, LQt8;->y:[I

    iget-object v3, p1, LQt8;->y:[I

    invoke-static {v1, v3}, LDl8;->a([I[I)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    if-nez v1, :cond_1d

    iget-object v1, p1, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    if-eqz v1, :cond_1e

    return v2

    :cond_1d
    iget-object v3, p1, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/clearcut/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-boolean v1, p0, LQt8;->B:Z

    iget-boolean v3, p1, LQt8;->B:Z

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, LCk8;->c:Lcl8;

    if-eqz v1, :cond_21

    invoke-virtual {v1}, Lcl8;->d()Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_0

    :cond_20
    iget-object v0, p0, LCk8;->c:Lcl8;

    iget-object p1, p1, LCk8;->c:Lcl8;

    invoke-virtual {v0, p1}, Lcl8;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_21
    :goto_0
    iget-object p1, p1, LCk8;->c:Lcl8;

    if-eqz p1, :cond_23

    invoke-virtual {p1}, Lcl8;->d()Z

    move-result p1

    if-eqz p1, :cond_22

    goto :goto_1

    :cond_22
    return v2

    :cond_23
    :goto_1
    return v0
.end method

.method public final g()I
    .locals 13

    invoke-super {p0}, LCk8;->g()I

    move-result v0

    iget-wide v1, p0, LQt8;->d:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    invoke-static {v6, v1, v2}, Lck8;->m(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, LQt8;->g:Ljava/lang/String;

    const/4 v2, 0x2

    const-string v5, ""

    if-eqz v1, :cond_1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LQt8;->g:Ljava/lang/String;

    invoke-static {v2, v1}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, LQt8;->l:[Lfu8;

    const/4 v7, 0x0

    if-eqz v1, :cond_3

    array-length v1, v1

    if-lez v1, :cond_3

    move v1, v7

    :goto_0
    iget-object v8, p0, LQt8;->l:[Lfu8;

    array-length v9, v8

    if-ge v1, v9, :cond_3

    aget-object v8, v8, v1

    if-eqz v8, :cond_2

    const/4 v9, 0x3

    invoke-static {v9, v8}, Lck8;->h(ILQl8;)I

    move-result v8

    add-int/2addr v0, v8

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, LQt8;->m:[B

    sget-object v8, Len8;->h:[B

    invoke-static {v1, v8}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x4

    iget-object v9, p0, LQt8;->m:[B

    invoke-static {v1, v9}, Lck8;->i(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-object v1, p0, LQt8;->o:[B

    invoke-static {v1, v8}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x6

    iget-object v9, p0, LQt8;->o:[B

    invoke-static {v1, v9}, Lck8;->i(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, LQt8;->r:LCs8;

    if-eqz v1, :cond_6

    const/4 v9, 0x7

    invoke-static {v9, v1}, Lck8;->h(ILQl8;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, LQt8;->p:Ljava/lang/String;

    if-eqz v1, :cond_7

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const/16 v1, 0x8

    iget-object v9, p0, LQt8;->p:Ljava/lang/String;

    invoke-static {v1, v9}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    if-eqz v1, :cond_8

    const/16 v9, 0x9

    invoke-static {v9, v1}, Lcom/google/android/gms/internal/clearcut/zzbn;->O(ILH28;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget v1, p0, LQt8;->h:I

    if-eqz v1, :cond_9

    const/16 v9, 0xb

    invoke-static {v9}, Lck8;->y(I)I

    move-result v9

    invoke-static {v1}, Lck8;->z(I)I

    move-result v1

    add-int/2addr v9, v1

    add-int/2addr v0, v9

    :cond_9
    iget-object v1, p0, LQt8;->q:Ljava/lang/String;

    if-eqz v1, :cond_a

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    const/16 v1, 0xd

    iget-object v9, p0, LQt8;->q:Ljava/lang/String;

    invoke-static {v1, v9}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget-object v1, p0, LQt8;->s:Ljava/lang/String;

    if-eqz v1, :cond_b

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    const/16 v1, 0xe

    iget-object v9, p0, LQt8;->s:Ljava/lang/String;

    invoke-static {v1, v9}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-wide v9, p0, LQt8;->t:J

    const-wide/32 v11, 0x2bf20

    cmp-long v1, v9, v11

    if-eqz v1, :cond_c

    const/16 v1, 0xf

    invoke-static {v1}, Lck8;->y(I)I

    move-result v1

    invoke-static {v9, v10}, Lck8;->v(J)J

    move-result-wide v9

    invoke-static {v9, v10}, Lck8;->x(J)I

    move-result v9

    add-int/2addr v1, v9

    add-int/2addr v0, v1

    :cond_c
    iget-object v1, p0, LQt8;->u:LRs8;

    if-eqz v1, :cond_d

    const/16 v9, 0x10

    invoke-static {v9, v1}, Lck8;->h(ILQl8;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget-wide v9, p0, LQt8;->e:J

    cmp-long v1, v9, v3

    if-eqz v1, :cond_e

    const/16 v1, 0x11

    invoke-static {v1, v9, v10}, Lck8;->m(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, LQt8;->v:[B

    invoke-static {v1, v8}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_f

    const/16 v1, 0x12

    iget-object v3, p0, LQt8;->v:[B

    invoke-static {v1, v3}, Lck8;->i(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_f
    iget-object v1, p0, LQt8;->y:[I

    if-eqz v1, :cond_11

    array-length v1, v1

    if-lez v1, :cond_11

    move v1, v7

    :goto_1
    iget-object v3, p0, LQt8;->y:[I

    array-length v4, v3

    if-ge v7, v4, :cond_10

    aget v3, v3, v7

    invoke-static {v3}, Lck8;->z(I)I

    move-result v3

    add-int/2addr v1, v3

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_10
    add-int/2addr v0, v1

    array-length v1, v3

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_11
    iget-object v1, p0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    if-eqz v1, :cond_12

    const/16 v2, 0x17

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/clearcut/zzbn;->O(ILH28;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_12
    iget-object v1, p0, LQt8;->w:Ljava/lang/String;

    if-eqz v1, :cond_13

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    const/16 v1, 0x18

    iget-object v2, p0, LQt8;->w:Ljava/lang/String;

    invoke-static {v1, v2}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_13
    iget-boolean v1, p0, LQt8;->B:Z

    if-eqz v1, :cond_14

    const/16 v1, 0x19

    invoke-static {v1}, Lck8;->y(I)I

    move-result v1

    add-int/2addr v1, v6

    add-int/2addr v0, v1

    :cond_14
    iget-object v1, p0, LQt8;->i:Ljava/lang/String;

    if-eqz v1, :cond_15

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    const/16 v1, 0x1a

    iget-object v2, p0, LQt8;->i:Ljava/lang/String;

    invoke-static {v1, v2}, Lck8;->g(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_15
    return v0
.end method

.method public final synthetic h()LQl8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQt8;

    return-object v0
.end method

.method public final hashCode()I
    .locals 8

    const-class v0, LQt8;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LQt8;->d:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LQt8;->e:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQt8;->g:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LQt8;->h:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQt8;->i:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    const/16 v1, 0x4d5

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, LQt8;->l:[Lfu8;

    invoke-static {v4}, LDl8;->f([Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, LQt8;->m:[B

    invoke-static {v4}, Ljava/util/Arrays;->hashCode([B)I

    move-result v4

    add-int/2addr v0, v4

    iget-object v4, p0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    mul-int/lit8 v0, v0, 0x1f

    if-nez v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lcom/google/android/gms/internal/clearcut/c;->hashCode()I

    move-result v4

    :goto_2
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, LQt8;->o:[B

    invoke-static {v4}, Ljava/util/Arrays;->hashCode([B)I

    move-result v4

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, LQt8;->p:Ljava/lang/String;

    if-nez v4, :cond_3

    move v4, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    :goto_3
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, LQt8;->q:Ljava/lang/String;

    if-nez v4, :cond_4

    move v4, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    :goto_4
    add-int/2addr v0, v4

    iget-object v4, p0, LQt8;->r:LCs8;

    mul-int/lit8 v0, v0, 0x1f

    if-nez v4, :cond_5

    move v4, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v4}, LCs8;->hashCode()I

    move-result v4

    :goto_5
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-object v4, p0, LQt8;->s:Ljava/lang/String;

    if-nez v4, :cond_6

    move v4, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    :goto_6
    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v4, p0, LQt8;->t:J

    ushr-long v6, v4, v3

    xor-long v3, v4, v6

    long-to-int v3, v3

    add-int/2addr v0, v3

    iget-object v3, p0, LQt8;->u:LRs8;

    mul-int/lit8 v0, v0, 0x1f

    if-nez v3, :cond_7

    move v3, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, LRs8;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, LQt8;->v:[B

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, LQt8;->w:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, LQt8;->y:[I

    invoke-static {v3}, LDl8;->d([I)I

    move-result v3

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v3, p0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    mul-int/lit8 v0, v0, 0x1f

    if-nez v3, :cond_9

    move v3, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Lcom/google/android/gms/internal/clearcut/c;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, LQt8;->B:Z

    if-eqz v3, :cond_a

    const/16 v1, 0x4cf

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCk8;->c:Lcl8;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcl8;->d()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_a

    :cond_b
    iget-object v1, p0, LCk8;->c:Lcl8;

    invoke-virtual {v1}, Lcl8;->hashCode()I

    move-result v2

    :cond_c
    :goto_a
    add-int/2addr v0, v2

    return v0
.end method

.method public final synthetic j()LCk8;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQt8;

    return-object v0
.end method

.method public final k()LQt8;
    .locals 4

    :try_start_0
    invoke-super {p0}, LCk8;->j()LCk8;

    move-result-object v0

    check-cast v0, LQt8;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, LQt8;->l:[Lfu8;

    if-eqz v1, :cond_1

    array-length v2, v1

    if-lez v2, :cond_1

    array-length v1, v1

    new-array v1, v1, [Lfu8;

    iput-object v1, v0, LQt8;->l:[Lfu8;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LQt8;->l:[Lfu8;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    if-eqz v2, :cond_0

    iget-object v3, v0, LQt8;->l:[Lfu8;

    invoke-virtual {v2}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfu8;

    aput-object v2, v3, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    if-eqz v1, :cond_2

    iput-object v1, v0, LQt8;->n:Lcom/google/android/gms/internal/clearcut/i;

    :cond_2
    iget-object v1, p0, LQt8;->r:LCs8;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCs8;

    iput-object v1, v0, LQt8;->r:LCs8;

    :cond_3
    iget-object v1, p0, LQt8;->u:LRs8;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LQl8;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRs8;

    iput-object v1, v0, LQt8;->u:LRs8;

    :cond_4
    iget-object v1, p0, LQt8;->y:[I

    if-eqz v1, :cond_5

    array-length v2, v1

    if-lez v2, :cond_5

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, LQt8;->y:[I

    :cond_5
    iget-object v1, p0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    if-eqz v1, :cond_6

    iput-object v1, v0, LQt8;->A:Lcom/google/android/gms/internal/clearcut/j;

    :cond_6
    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method
