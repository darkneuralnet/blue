.class public abstract LPg2;
.super LOg2;
.source "SourceFile"


# instance fields
.field public y:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LOg2;-><init>(I)V

    return-void
.end method


# virtual methods
.method public j([Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LOg2;->g:I

    invoke-virtual {p0, p1}, LOg2;->s([Z)V

    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    return-void
.end method

.method public l([Z)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LOg2;->g:I

    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p0}, LOg2;->r()V

    iget-char v1, p0, LOg2;->a:C

    const/16 v2, 0x65

    const/16 v3, 0x1a

    const/16 v4, 0x7e

    const/16 v5, 0x45

    const/4 v6, 0x1

    const/16 v7, 0x2e

    if-eq v1, v7, :cond_2

    if-eq v1, v5, :cond_2

    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, LOg2;->t()V

    iget-char v1, p0, LOg2;->a:C

    if-ltz v1, :cond_1

    if-ge v1, v4, :cond_1

    aget-boolean v2, p1, v1

    if-nez v2, :cond_1

    if-eq v1, v3, :cond_1

    invoke-virtual {p0, p1}, LOg2;->s([Z)V

    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v6, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_1
    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p0, p1}, LOg2;->e(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_2
    if-ne v1, v7, :cond_3

    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p0}, LOg2;->r()V

    :cond_3
    iget-char v1, p0, LOg2;->a:C

    if-eq v1, v5, :cond_6

    if-eq v1, v2, :cond_6

    invoke-virtual {p0}, LOg2;->t()V

    iget-char v1, p0, LOg2;->a:C

    if-ltz v1, :cond_5

    if-ge v1, v4, :cond_5

    aget-boolean v2, p1, v1

    if-nez v2, :cond_5

    if-eq v1, v3, :cond_5

    invoke-virtual {p0, p1}, LOg2;->s([Z)V

    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v6, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_5
    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    invoke-virtual {p0}, LOg2;->c()Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object v1, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v1, v5}, LOg2$a;->a(C)V

    invoke-virtual {p0}, LOg2;->f()V

    iget-char v1, p0, LOg2;->a:C

    const/16 v2, 0x2b

    if-eq v1, v2, :cond_a

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_a

    const/16 v2, 0x30

    if-lt v1, v2, :cond_7

    const/16 v2, 0x39

    if-gt v1, v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {p0, p1}, LOg2;->s([Z)V

    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_9

    iget-boolean p1, p0, LOg2;->h:Z

    if-nez p1, :cond_8

    invoke-virtual {p0}, LOg2;->b()V

    :cond_8
    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_9
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v6, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_a
    :goto_0
    iget-object v2, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v2, v1}, LOg2$a;->a(C)V

    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p0}, LOg2;->r()V

    invoke-virtual {p0}, LOg2;->t()V

    iget-char v1, p0, LOg2;->a:C

    if-ltz v1, :cond_c

    if-ge v1, v4, :cond_c

    aget-boolean v2, p1, v1

    if-nez v2, :cond_c

    if-eq v1, v3, :cond_c

    invoke-virtual {p0, p1}, LOg2;->s([Z)V

    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_b

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_b
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v6, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_c
    iget p1, p0, LOg2;->g:I

    invoke-virtual {p0, v0, p1}, LPg2;->v(II)V

    invoke-virtual {p0}, LOg2;->c()Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public o()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, LOg2;->k:Z

    if-nez v0, :cond_1

    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x27

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, LOg2;->j:Z

    if-eqz v0, :cond_0

    sget-object v0, LOg2;->t:[Z

    invoke-virtual {p0, v0}, LPg2;->j([Z)V

    return-void

    :cond_0
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    iget-char v2, p0, LOg2;->a:C

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_1
    iget-char v0, p0, LOg2;->a:C

    iget v1, p0, LOg2;->g:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v0, v1}, LPg2;->w(CI)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget v2, p0, LOg2;->g:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2, v0}, LPg2;->u(II)V

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    const/16 v3, 0x5c

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v2, v1, :cond_2

    invoke-virtual {p0}, LOg2;->a()V

    iput v0, p0, LOg2;->g:I

    invoke-virtual {p0}, LOg2;->f()V

    return-void

    :cond_2
    iget-object v0, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v0}, LOg2$a;->b()V

    invoke-virtual {p0}, LOg2;->p()V

    return-void

    :cond_3
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LPg2;->y:I

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0
.end method

.method public abstract u(II)V
.end method

.method public abstract v(II)V
.end method

.method public abstract w(CI)I
.end method
