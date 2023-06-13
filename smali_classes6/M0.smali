.class public abstract LM0;
.super LY0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LY0<",
        "TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public transient d:LJd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJd3<",
            "TE;>;"
        }
    .end annotation
.end field

.field public transient e:J


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    invoke-static {p1}, LZs5;->c(Ljava/io/ObjectInputStream;)I

    move-result v0

    const/4 v1, 0x3

    invoke-virtual {p0, v1}, LM0;->j(I)LJd3;

    move-result-object v1

    iput-object v1, p0, LM0;->d:LJd3;

    invoke-static {p0, p1, v0}, LZs5;->b(LmX2;Ljava/io/ObjectInputStream;I)V

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    invoke-static {p0, p1}, LZs5;->e(LmX2;Ljava/io/ObjectOutputStream;)V

    return-void
.end method


# virtual methods
.method public final A2(Ljava/lang/Object;I)I
    .locals 3

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, LM0;->d3(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-lez p2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    const-string v2, "occurrences cannot be negative: %s"

    invoke-static {v1, v2, p2}, LEZ3;->f(ZLjava/lang/String;I)V

    iget-object v1, p0, LM0;->d:LJd3;

    invoke-virtual {v1, p1}, LJd3;->j(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0, p1}, LJd3;->h(I)I

    move-result v0

    if-le v0, p2, :cond_3

    iget-object v1, p0, LM0;->d:LJd3;

    sub-int v2, v0, p2

    invoke-virtual {v1, p1, v2}, LJd3;->y(II)V

    goto :goto_1

    :cond_3
    iget-object p2, p0, LM0;->d:LJd3;

    invoke-virtual {p2, p1}, LJd3;->u(I)I

    move p2, v0

    :goto_1
    iget-wide v1, p0, LM0;->e:J

    int-to-long p1, p2

    sub-long/2addr v1, p1

    iput-wide v1, p0, LM0;->e:J

    return v0
.end method

.method public final H0(Ljava/lang/Object;I)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, LM0;->d3(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lez p2, :cond_1

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    const-string v3, "occurrences cannot be negative: %s"

    invoke-static {v2, v3, p2}, LEZ3;->f(ZLjava/lang/String;I)V

    iget-object v2, p0, LM0;->d:LJd3;

    invoke-virtual {v2, p1}, LJd3;->j(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0, p1, p2}, LJd3;->r(Ljava/lang/Object;I)I

    iget-wide v2, p0, LM0;->e:J

    int-to-long p1, p2

    add-long/2addr v2, p1

    iput-wide v2, p0, LM0;->e:J

    return v1

    :cond_2
    iget-object p1, p0, LM0;->d:LJd3;

    invoke-virtual {p1, v2}, LJd3;->h(I)I

    move-result p1

    int-to-long v3, p1

    int-to-long v5, p2

    add-long/2addr v3, v5

    const-wide/32 v7, 0x7fffffff

    cmp-long p2, v3, v7

    if-gtz p2, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    const-string p2, "too many occurrences: %s"

    invoke-static {v0, p2, v3, v4}, LEZ3;->h(ZLjava/lang/String;J)V

    iget-object p2, p0, LM0;->d:LJd3;

    long-to-int v0, v3

    invoke-virtual {p2, v2, v0}, LJd3;->y(II)V

    iget-wide v0, p0, LM0;->e:J

    add-long/2addr v0, v5

    iput-wide v0, p0, LM0;->e:J

    return p1
.end method

.method public final P0(Ljava/lang/Object;II)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;II)Z"
        }
    .end annotation

    const-string v0, "oldCount"

    invoke-static {p2, v0}, Ldm0;->b(ILjava/lang/String;)I

    const-string v0, "newCount"

    invoke-static {p3, v0}, Ldm0;->b(ILjava/lang/String;)I

    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0, p1}, LJd3;->j(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    if-eqz p2, :cond_0

    return v3

    :cond_0
    if-lez p3, :cond_1

    iget-object p2, p0, LM0;->d:LJd3;

    invoke-virtual {p2, p1, p3}, LJd3;->r(Ljava/lang/Object;I)I

    iget-wide p1, p0, LM0;->e:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, LM0;->e:J

    :cond_1
    return v2

    :cond_2
    iget-object p1, p0, LM0;->d:LJd3;

    invoke-virtual {p1, v0}, LJd3;->h(I)I

    move-result p1

    if-eq p1, p2, :cond_3

    return v3

    :cond_3
    if-nez p3, :cond_4

    iget-object p1, p0, LM0;->d:LJd3;

    invoke-virtual {p1, v0}, LJd3;->u(I)I

    iget-wide v0, p0, LM0;->e:J

    int-to-long p1, p2

    sub-long/2addr v0, p1

    iput-wide v0, p0, LM0;->e:J

    goto :goto_0

    :cond_4
    iget-object p1, p0, LM0;->d:LJd3;

    invoke-virtual {p1, v0, p3}, LJd3;->y(II)V

    iget-wide v0, p0, LM0;->e:J

    sub-int/2addr p3, p2

    int-to-long p1, p3

    add-long/2addr v0, p1

    iput-wide v0, p0, LM0;->e:J

    :goto_0
    return v2
.end method

.method public final Q1(Ljava/lang/Object;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;I)I"
        }
    .end annotation

    const-string v0, "count"

    invoke-static {p2, v0}, Ldm0;->b(ILjava/lang/String;)I

    iget-object v0, p0, LM0;->d:LJd3;

    if-nez p2, :cond_0

    invoke-virtual {v0, p1}, LJd3;->s(Ljava/lang/Object;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LJd3;->r(Ljava/lang/Object;I)I

    move-result p1

    :goto_0
    iget-wide v0, p0, LM0;->e:J

    sub-int/2addr p2, p1

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p0, LM0;->e:J

    return p1
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0}, LJd3;->z()I

    move-result v0

    return v0
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0}, LJd3;->a()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LM0;->e:J

    return-void
.end method

.method public final d3(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0, p1}, LJd3;->c(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final e()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LM0$a;

    invoke-direct {v0, p0}, LM0$a;-><init>(LM0;)V

    return-object v0
.end method

.method public final f()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LmX2$a<",
            "TE;>;>;"
        }
    .end annotation

    new-instance v0, LM0$b;

    invoke-direct {v0, p0}, LM0$b;-><init>(LM0;)V

    return-object v0
.end method

.method public h(LmX2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LmX2<",
            "-TE;>;)V"
        }
    .end annotation

    invoke-static {p1}, LEZ3;->n(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LM0;->d:LJd3;

    invoke-virtual {v0}, LJd3;->b()I

    move-result v0

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, LM0;->d:LJd3;

    invoke-virtual {v1, v0}, LJd3;->f(I)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LM0;->d:LJd3;

    invoke-virtual {v2, v0}, LJd3;->h(I)I

    move-result v2

    invoke-interface {p1, v1, v2}, LmX2;->H0(Ljava/lang/Object;I)I

    iget-object v1, p0, LM0;->d:LJd3;

    invoke-virtual {v1, v0}, LJd3;->p(I)I

    move-result v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, LoX2;->h(LmX2;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public abstract j(I)LJd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "LJd3<",
            "TE;>;"
        }
    .end annotation
.end method

.method public final size()I
    .locals 2

    iget-wide v0, p0, LM0;->e:J

    invoke-static {v0, v1}, Lg72;->b(J)I

    move-result v0

    return v0
.end method
