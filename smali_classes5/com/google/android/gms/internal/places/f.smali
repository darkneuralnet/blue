.class public final Lcom/google/android/gms/internal/places/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLY7;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LLY7<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:LzT7;

.field public final b:LI38;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LI38<",
            "**>;"
        }
    .end annotation
.end field

.field public final c:Z

.field public final d:Ltu7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltu7<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LI38;Ltu7;LzT7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LI38<",
            "**>;",
            "Ltu7<",
            "*>;",
            "LzT7;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {p2, p3}, Ltu7;->g(LzT7;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/places/f;->c:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    iput-object p3, p0, Lcom/google/android/gms/internal/places/f;->a:LzT7;

    return-void
.end method

.method public static i(LI38;Ltu7;LzT7;)Lcom/google/android/gms/internal/places/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LI38<",
            "**>;",
            "Ltu7<",
            "*>;",
            "LzT7;",
            ")",
            "Lcom/google/android/gms/internal/places/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/places/f;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/places/f;-><init>(LI38;Ltu7;LzT7;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {v0, p1}, LI38;->d(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v0, p1}, Ltu7;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {v0, p1}, LI38;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {v1, p2}, LI38;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/places/f;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v0, p1}, Ltu7;->c(Ljava/lang/Object;)LGx7;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v0, p2}, Ltu7;->c(Ljava/lang/Object;)LGx7;

    move-result-object p2

    invoke-virtual {p1, p2}, LGx7;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final c(Ljava/lang/Object;[BIILtl9;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[BII",
            "Ltl9;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    iget-object v1, v0, Lcom/google/android/gms/internal/places/c;->zzih:Lu38;

    invoke-static {}, Lu38;->i()Lu38;

    move-result-object v2

    if-ne v1, v2, :cond_0

    invoke-static {}, Lu38;->j()Lu38;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/places/c;->zzih:Lu38;

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/places/c$b;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/places/c$b;->s()LGx7;

    const/4 p1, 0x0

    move-object v0, p1

    :goto_0
    if-ge p3, p4, :cond_a

    invoke-static {p2, p3, p5}, Lcom/google/android/gms/internal/places/l;->j([BILtl9;)I

    move-result v4

    iget v2, p5, Ltl9;->a:I

    const/16 p3, 0xb

    const/4 v3, 0x2

    if-eq v2, p3, :cond_3

    and-int/lit8 p3, v2, 0x7

    if-ne p3, v3, :cond_2

    iget-object p3, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    iget-object v0, p5, Ltl9;->d:Lcom/google/android/gms/internal/places/a;

    iget-object v3, p0, Lcom/google/android/gms/internal/places/f;->a:LzT7;

    ushr-int/lit8 v5, v2, 0x3

    invoke-virtual {p3, v0, v3, v5}, Ltu7;->b(Lcom/google/android/gms/internal/places/a;LzT7;I)Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/google/android/gms/internal/places/c$e;

    if-nez v0, :cond_1

    move-object v3, p2

    move v5, p4

    move-object v6, v1

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/places/l;->b(I[BIILu38;Ltl9;)I

    move-result p3

    goto :goto_0

    :cond_1
    invoke-static {}, LsW7;->a()LsW7;

    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1

    :cond_2
    invoke-static {v2, p2, v4, p4, p5}, Lcom/google/android/gms/internal/places/l;->c(I[BIILtl9;)I

    move-result p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    move-object v2, p1

    :goto_1
    if-ge v4, p4, :cond_8

    invoke-static {p2, v4, p5}, Lcom/google/android/gms/internal/places/l;->j([BILtl9;)I

    move-result v4

    iget v5, p5, Ltl9;->a:I

    ushr-int/lit8 v6, v5, 0x3

    and-int/lit8 v7, v5, 0x7

    if-eq v6, v3, :cond_6

    const/4 v8, 0x3

    if-eq v6, v8, :cond_4

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    if-ne v7, v3, :cond_7

    invoke-static {p2, v4, p5}, Lcom/google/android/gms/internal/places/l;->q([BILtl9;)I

    move-result v4

    iget-object v2, p5, Ltl9;->c:Ljava/lang/Object;

    check-cast v2, Ljv9;

    goto :goto_1

    :cond_5
    invoke-static {}, LsW7;->a()LsW7;

    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1

    :cond_6
    if-nez v7, :cond_7

    invoke-static {p2, v4, p5}, Lcom/google/android/gms/internal/places/l;->j([BILtl9;)I

    move-result v4

    iget p3, p5, Ltl9;->a:I

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    iget-object v5, p5, Ltl9;->d:Lcom/google/android/gms/internal/places/a;

    iget-object v6, p0, Lcom/google/android/gms/internal/places/f;->a:LzT7;

    invoke-virtual {v0, v5, v6, p3}, Ltu7;->b(Lcom/google/android/gms/internal/places/a;LzT7;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c$e;

    goto :goto_1

    :cond_7
    :goto_2
    const/16 v6, 0xc

    if-eq v5, v6, :cond_8

    invoke-static {v5, p2, v4, p4, p5}, Lcom/google/android/gms/internal/places/l;->c(I[BIILtl9;)I

    move-result v4

    goto :goto_1

    :cond_8
    if-eqz v2, :cond_9

    shl-int/lit8 p3, p3, 0x3

    or-int/2addr p3, v3

    invoke-virtual {v1, p3, v2}, Lu38;->f(ILjava/lang/Object;)V

    :cond_9
    move p3, v4

    goto/16 :goto_0

    :cond_a
    if-ne p3, p4, :cond_b

    return-void

    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/places/zzbk;->e()Lcom/google/android/gms/internal/places/zzbk;

    move-result-object p1

    throw p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->a:LzT7;

    invoke-interface {v0}, LzT7;->f()LlT7;

    move-result-object v0

    invoke-interface {v0}, LlT7;->v()LzT7;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {v0, p1}, LI38;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/places/f;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v1, p1}, Ltu7;->c(Ljava/lang/Object;)LGx7;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, LGx7;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v0, p1}, Ltu7;->c(Ljava/lang/Object;)LGx7;

    move-result-object p1

    invoke-virtual {p1}, LGx7;->c()Z

    move-result p1

    return p1
.end method

.method public final g(Ljava/lang/Object;Lja8;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lja8;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v0, p1}, Ltu7;->c(Ljava/lang/Object;)LGx7;

    move-result-object v0

    invoke-virtual {v0}, LGx7;->d()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llz7;

    invoke-interface {v2}, Llz7;->C()Lya8;

    move-result-object v3

    sget-object v4, Lya8;->k:Lya8;

    if-ne v3, v4, :cond_1

    invoke-interface {v2}, Llz7;->O()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v2}, Llz7;->Z0()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v1, LyL7;

    if-eqz v3, :cond_0

    invoke-interface {v2}, Llz7;->z()I

    move-result v2

    check-cast v1, LyL7;

    invoke-virtual {v1}, LyL7;->a()LTK7;

    move-result-object v1

    invoke-virtual {v1}, LeM7;->d()Ljv9;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lja8;->J(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Llz7;->z()I

    move-result v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Lja8;->J(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Found invalid MessageSet item."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {v0, p1}, LI38;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LI38;->e(Ljava/lang/Object;Lja8;)V

    return-void
.end method

.method public final h(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-virtual {v0, p1}, LI38;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, LI38;->l(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/places/f;->c:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-virtual {v1, p1}, Ltu7;->c(Ljava/lang/Object;)LGx7;

    move-result-object p1

    invoke-virtual {p1}, LGx7;->g()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final zzd(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->b:LI38;

    invoke-static {v0, p1, p2}, LoZ7;->h(LI38;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/places/f;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/places/f;->d:Ltu7;

    invoke-static {v0, p1, p2}, LoZ7;->f(Ltu7;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
