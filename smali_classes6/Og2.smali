.class public abstract LOg2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOg2$a;
    }
.end annotation


# static fields
.field public static t:[Z

.field public static u:[Z

.field public static v:[Z

.field public static w:[Z

.field public static x:[Z


# instance fields
.field public a:C

.field public b:Lej2;

.field public c:Ljava/lang/String;

.field public final d:LOg2$a;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/String;

.field public g:I

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x7e

    new-array v1, v0, [Z

    sput-object v1, LOg2;->t:[Z

    new-array v2, v0, [Z

    sput-object v2, LOg2;->u:[Z

    new-array v3, v0, [Z

    sput-object v3, LOg2;->v:[Z

    new-array v4, v0, [Z

    sput-object v4, LOg2;->w:[Z

    new-array v0, v0, [Z

    sput-object v0, LOg2;->x:[Z

    const/16 v5, 0x1a

    const/4 v6, 0x1

    aput-boolean v6, v3, v5

    const/16 v7, 0x3a

    aput-boolean v6, v3, v7

    aput-boolean v6, v4, v5

    const/16 v3, 0x7d

    aput-boolean v6, v4, v3

    const/16 v8, 0x2c

    aput-boolean v6, v4, v8

    aput-boolean v6, v2, v5

    const/16 v4, 0x5d

    aput-boolean v6, v2, v4

    aput-boolean v6, v2, v8

    aput-boolean v6, v0, v5

    aput-boolean v6, v1, v7

    aput-boolean v6, v1, v8

    aput-boolean v6, v1, v5

    aput-boolean v6, v1, v3

    aput-boolean v6, v1, v4

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LOg2$a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, LOg2$a;-><init>(I)V

    iput-object v0, p0, LOg2;->d:LOg2$a;

    and-int/lit8 v0, p1, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, LOg2;->i:Z

    and-int/lit8 v0, p1, 0x2

    if-lez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, LOg2;->j:Z

    and-int/lit8 v0, p1, 0x1

    if-lez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, LOg2;->k:Z

    and-int/lit8 v0, p1, 0x8

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, LOg2;->o:Z

    and-int/lit8 v0, p1, 0x10

    if-lez v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    iput-boolean v0, p0, LOg2;->q:Z

    and-int/lit8 v0, p1, 0x20

    if-lez v0, :cond_5

    move v0, v2

    goto :goto_5

    :cond_5
    move v0, v1

    :goto_5
    iput-boolean v0, p0, LOg2;->h:Z

    and-int/lit8 v0, p1, 0x40

    if-lez v0, :cond_6

    move v0, v2

    goto :goto_6

    :cond_6
    move v0, v1

    :goto_6
    iput-boolean v0, p0, LOg2;->l:Z

    and-int/lit16 v0, p1, 0x80

    if-lez v0, :cond_7

    move v0, v2

    goto :goto_7

    :cond_7
    move v0, v1

    :goto_7
    iput-boolean v0, p0, LOg2;->p:Z

    and-int/lit16 v0, p1, 0x300

    const/16 v3, 0x300

    if-eq v0, v3, :cond_8

    move v0, v2

    goto :goto_8

    :cond_8
    move v0, v1

    :goto_8
    iput-boolean v0, p0, LOg2;->m:Z

    and-int/lit16 v0, p1, 0x200

    if-nez v0, :cond_9

    move v0, v2

    goto :goto_9

    :cond_9
    move v0, v1

    :goto_9
    iput-boolean v0, p0, LOg2;->n:Z

    and-int/lit16 v0, p1, 0x400

    if-lez v0, :cond_a

    move v0, v2

    goto :goto_a

    :cond_a
    move v0, v1

    :goto_a
    iput-boolean v0, p0, LOg2;->r:Z

    and-int/lit16 p1, p1, 0x800

    if-lez p1, :cond_b

    move v1, v2

    :cond_b
    iput-boolean v1, p0, LOg2;->s:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    iget-boolean v0, p0, LOg2;->o:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    iget-object v3, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v4, 0x1f

    if-le v3, v4, :cond_4

    const/16 v4, 0x7f

    if-ne v3, v4, :cond_3

    iget-boolean v4, p0, LOg2;->r:Z

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v4, p0, LOg2;->g:I

    add-int/2addr v4, v2

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v0, v4, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v4, p0, LOg2;->g:I

    add-int/2addr v4, v2

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v0, v4, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_5
    return-void
.end method

.method public b()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x2

    const/4 v3, 0x6

    if-ne v0, v2, :cond_2

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    const-string v1, "00"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v3, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-object v4, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x2d

    const/16 v5, 0x39

    const/16 v6, 0x30

    if-ne v0, v4, :cond_5

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v1, v6, :cond_4

    if-lt v0, v6, :cond_4

    if-le v0, v5, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v3, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_4
    :goto_0
    return-void

    :cond_5
    if-ne v0, v6, :cond_7

    if-lt v1, v6, :cond_7

    if-le v1, v5, :cond_6

    goto :goto_1

    :cond_6
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v3, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_7
    :goto_1
    return-void
.end method

.method public c()Ljava/lang/Number;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    iget-boolean v0, p0, LOg2;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LOg2;->b()V

    :cond_0
    :try_start_0
    iget-boolean v0, p0, LOg2;->p:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x12

    if-le v0, v1, :cond_3

    new-instance v0, Ljava/math/BigDecimal;

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, LOg2;->s:Z

    if-nez v1, :cond_2

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    const/4 v2, 0x1

    iget-object v3, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0
.end method

.method public d(Lfj2;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj2<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    const/4 v0, -0x1

    iput v0, p0, LOg2;->g:I

    :try_start_0
    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p0, p1}, LOg2;->h(Lfj2;)Ljava/lang/Object;

    move-result-object p1

    iget-boolean v0, p0, LOg2;->m:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, LOg2;->n:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LOg2;->t()V

    :cond_0
    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x1a

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-char v2, p0, LOg2;->a:C

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, LOg2;->f:Ljava/lang/String;

    iput-object v0, p0, LOg2;->e:Ljava/lang/Object;

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    invoke-direct {v0, v1, p1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/Number;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2d

    const/4 v4, 0x6

    const/16 v5, 0x30

    const/4 v6, 0x1

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, LOg2;->h:Z

    if-nez v2, :cond_1

    const/4 v2, 0x3

    if-lt v0, v2, :cond_1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    invoke-direct {v0, v1, v4, p1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    const/16 v2, 0x14

    move v3, v6

    goto :goto_2

    :cond_2
    iget-boolean v2, p0, LOg2;->h:Z

    if-nez v2, :cond_4

    const/4 v2, 0x2

    if-lt v0, v2, :cond_4

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v5, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    invoke-direct {v0, v1, v4, p1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_4
    :goto_1
    const/16 v2, 0x13

    move v3, v1

    :goto_2
    move v4, v3

    const/16 v7, 0xa

    if-ge v0, v2, :cond_5

    move v2, v1

    goto :goto_3

    :cond_5
    if-le v0, v2, :cond_6

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    return-object v0

    :cond_6
    add-int/lit8 v0, v0, -0x1

    move v2, v6

    :goto_3
    const-wide/16 v8, 0x0

    :goto_4
    const-wide/16 v10, 0xa

    if-ge v3, v0, :cond_7

    mul-long/2addr v8, v10

    add-int/lit8 v10, v3, 0x1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    rsub-int/lit8 v3, v3, 0x30

    int-to-long v11, v3

    add-long/2addr v8, v11

    move v3, v10

    goto :goto_4

    :cond_7
    if-eqz v2, :cond_d

    const-wide v12, -0xcccccccccccccccL

    cmp-long v0, v8, v12

    if-lez v0, :cond_8

    goto :goto_6

    :cond_8
    if-gez v0, :cond_9

    :goto_5
    move v1, v6

    goto :goto_6

    :cond_9
    if-eqz v4, :cond_a

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x38

    if-le v0, v2, :cond_b

    goto :goto_5

    :cond_a
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x37

    if-le v0, v2, :cond_b

    goto :goto_5

    :cond_b
    :goto_6
    if-eqz v1, :cond_c

    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1, v7}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    return-object v0

    :cond_c
    mul-long/2addr v8, v10

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result p1

    sub-int/2addr v5, p1

    int-to-long v0, v5

    add-long/2addr v8, v0

    :cond_d
    if-eqz v4, :cond_f

    iget-boolean p1, p0, LOg2;->q:Z

    if-eqz p1, :cond_e

    const-wide/32 v0, -0x80000000

    cmp-long p1, v8, v0

    if-ltz p1, :cond_e

    long-to-int p1, v8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_e
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_f
    neg-long v0, v8

    iget-boolean p1, p0, LOg2;->q:Z

    if-eqz p1, :cond_10

    const-wide/32 v2, 0x7fffffff

    cmp-long p1, v0, v2

    if-gtz p1, :cond_10

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public abstract f()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public g(Lfj2;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj2<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lfj2;->c()Ljava/lang/Object;

    move-result-object v0

    iget-char v1, p0, LOg2;->a:C

    const/16 v2, 0x5b

    if-ne v1, v2, :cond_b

    invoke-virtual {p0}, LOg2;->f()V

    iget-char v1, p0, LOg2;->a:C

    const/16 v2, 0x2c

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    iget-boolean v1, p0, LOg2;->l:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v3, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    iget-char v4, p0, LOg2;->a:C

    const/16 v5, 0x9

    if-eq v4, v5, :cond_a

    const/16 v5, 0xa

    if-eq v4, v5, :cond_a

    const/16 v5, 0xd

    if-eq v4, v5, :cond_a

    const/16 v5, 0x1a

    const/4 v6, 0x1

    if-eq v4, v5, :cond_9

    const/16 v5, 0x20

    if-eq v4, v5, :cond_a

    if-eq v4, v2, :cond_6

    const/16 v5, 0x3a

    if-eq v4, v5, :cond_5

    const/16 v5, 0x5d

    if-eq v4, v5, :cond_2

    const/16 v1, 0x7d

    if-eq v4, v1, :cond_5

    sget-object v1, LOg2;->u:[Z

    invoke-virtual {p0, p1, v1}, LOg2;->i(Lfj2;[Z)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lfj2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_4

    iget-boolean v1, p0, LOg2;->l:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v3, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_4
    :goto_2
    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v3, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_6
    if-eqz v1, :cond_8

    iget-boolean v1, p0, LOg2;->l:Z

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v3, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_8
    :goto_3
    invoke-virtual {p0}, LOg2;->f()V

    move v1, v6

    goto :goto_1

    :cond_9
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    sub-int/2addr v0, v6

    const/4 v1, 0x3

    const-string v2, "EOF"

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_a
    invoke-virtual {p0}, LOg2;->f()V

    goto/16 :goto_1

    :cond_b
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Internal Error"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Lfj2;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj2<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x9

    if-eq v0, v1, :cond_a

    const/16 v1, 0xa

    if-eq v0, v1, :cond_a

    const/4 v1, 0x1

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    sget-object v0, LOg2;->x:[Z

    invoke-virtual {p0, v0}, LOg2;->j([Z)V

    iget-boolean v0, p0, LOg2;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_0
    invoke-virtual {p0, p1}, LOg2;->m(Lfj2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :sswitch_1
    sget-object v0, LOg2;->x:[Z

    invoke-virtual {p0, v0}, LOg2;->j([Z)V

    const-string v0, "true"

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-boolean v0, p0, LOg2;->j:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_2
    sget-object v0, LOg2;->x:[Z

    invoke-virtual {p0, v0}, LOg2;->j([Z)V

    const-string v0, "null"

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    iget-boolean v0, p0, LOg2;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_3
    sget-object v0, LOg2;->x:[Z

    invoke-virtual {p0, v0}, LOg2;->j([Z)V

    const-string v0, "false"

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-boolean v0, p0, LOg2;->j:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :pswitch_0
    :sswitch_4
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_5
    invoke-virtual {p0, p1}, LOg2;->g(Lfj2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :sswitch_6
    sget-object v0, LOg2;->x:[Z

    invoke-virtual {p0, v0}, LOg2;->j([Z)V

    iget-boolean v0, p0, LOg2;->i:Z

    if-eqz v0, :cond_9

    const-string v0, "NaN"

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    iget-boolean v0, p0, LOg2;->j:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_9
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v2, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :pswitch_1
    :sswitch_7
    sget-object v0, LOg2;->x:[Z

    invoke-virtual {p0, v0}, LOg2;->l([Z)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LOg2;->e:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :sswitch_8
    invoke-virtual {p0}, LOg2;->o()V

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_a
    :sswitch_9
    invoke-virtual {p0}, LOg2;->f()V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_9
        0x20 -> :sswitch_9
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2d -> :sswitch_7
        0x4e -> :sswitch_6
        0x5b -> :sswitch_5
        0x5d -> :sswitch_4
        0x66 -> :sswitch_3
        0x6e -> :sswitch_2
        0x74 -> :sswitch_1
        0x7b -> :sswitch_0
        0x7d -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lfj2;[Z)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj2<",
            "*>;[Z)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x9

    if-eq v0, v1, :cond_a

    const/16 v1, 0xa

    if-eq v0, v1, :cond_a

    const/4 v1, 0x1

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p2}, LOg2;->j([Z)V

    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_0
    iget-object p2, p0, LOg2;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lfj2;->g(Ljava/lang/String;)Lfj2;

    move-result-object p1

    invoke-virtual {p0, p1}, LOg2;->m(Lfj2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-virtual {p0, p2}, LOg2;->j([Z)V

    const-string p1, "true"

    iget-object p2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_2
    invoke-virtual {p0, p2}, LOg2;->j([Z)V

    const-string p1, "null"

    iget-object p2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_3
    invoke-virtual {p0, p2}, LOg2;->j([Z)V

    const-string p1, "false"

    iget-object p2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_5
    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_6
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :pswitch_0
    :sswitch_4
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-char v0, p0, LOg2;->a:C

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :sswitch_5
    iget-object p2, p0, LOg2;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lfj2;->f(Ljava/lang/String;)Lfj2;

    move-result-object p1

    invoke-virtual {p0, p1}, LOg2;->g(Lfj2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :sswitch_6
    invoke-virtual {p0, p2}, LOg2;->j([Z)V

    iget-boolean p1, p0, LOg2;->i:Z

    if-eqz p1, :cond_9

    const-string p1, "NaN"

    iget-object p2, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/high16 p1, 0x7fc00000    # Float.NaN

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_7
    iget-boolean p1, p0, LOg2;->j:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_8
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_9
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget p2, p0, LOg2;->g:I

    iget-object v0, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, p2, v1, v0}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :pswitch_1
    :sswitch_7
    invoke-virtual {p0, p2}, LOg2;->l([Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :sswitch_8
    invoke-virtual {p0}, LOg2;->o()V

    iget-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-object p1

    :cond_a
    :sswitch_9
    invoke-virtual {p0}, LOg2;->f()V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_9
        0x20 -> :sswitch_9
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2d -> :sswitch_7
        0x4e -> :sswitch_6
        0x5b -> :sswitch_5
        0x5d -> :sswitch_4
        0x66 -> :sswitch_3
        0x6e -> :sswitch_2
        0x74 -> :sswitch_1
        0x7b -> :sswitch_0
        0x7d -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract j([Z)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract k()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract l([Z)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public m(Lfj2;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj2<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x7b

    if-ne v0, v1, :cond_10

    invoke-virtual {p1}, Lfj2;->d()Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-virtual {p0}, LOg2;->f()V

    iget-char v4, p0, LOg2;->a:C

    const/16 v5, 0x9

    if-eq v4, v5, :cond_0

    const/16 v5, 0xa

    if-eq v4, v5, :cond_0

    const/16 v5, 0xd

    if-eq v4, v5, :cond_0

    const/16 v5, 0x20

    if-eq v4, v5, :cond_0

    const/16 v5, 0x2c

    const/4 v6, 0x1

    if-eq v4, v5, :cond_d

    const/16 v7, 0x3a

    if-eq v4, v7, :cond_c

    const/16 v8, 0x5b

    if-eq v4, v8, :cond_c

    const/16 v8, 0x5d

    if-eq v4, v8, :cond_c

    if-eq v4, v1, :cond_c

    const/16 v8, 0x7d

    if-eq v4, v8, :cond_9

    const/16 v3, 0x22

    if-eq v4, v3, :cond_3

    const/16 v3, 0x27

    if-ne v4, v3, :cond_1

    goto :goto_1

    :cond_1
    sget-object v3, LOg2;->v:[Z

    invoke-virtual {p0, v3}, LOg2;->j([Z)V

    iget-boolean v3, p0, LOg2;->j:Z

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-object v1, p0, LOg2;->f:Ljava/lang/String;

    invoke-direct {p1, v0, v6, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {p0}, LOg2;->o()V

    :goto_2
    iget-object v3, p0, LOg2;->f:Ljava/lang/String;

    invoke-virtual {p0}, LOg2;->t()V

    iget-char v4, p0, LOg2;->a:C

    const/4 v9, 0x3

    const/16 v10, 0x1a

    const/4 v11, 0x0

    if-eq v4, v7, :cond_5

    if-ne v4, v10, :cond_4

    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    sub-int/2addr v0, v6

    invoke-direct {p1, v0, v9, v11}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    sub-int/2addr v0, v6

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v2, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_5
    invoke-virtual {p0}, LOg2;->k()V

    iput-object v3, p0, LOg2;->c:Ljava/lang/String;

    sget-object v4, LOg2;->w:[Z

    invoke-virtual {p0, p1, v4}, LOg2;->i(Lfj2;[Z)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v0, v3, v4}, Lfj2;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v11, p0, LOg2;->c:Ljava/lang/String;

    invoke-virtual {p0}, LOg2;->t()V

    iget-char v3, p0, LOg2;->a:C

    if-ne v3, v8, :cond_6

    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    if-eq v3, v10, :cond_8

    if-ne v3, v5, :cond_7

    goto :goto_4

    :cond_7
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    sub-int/2addr v0, v6

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v6, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_8
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    sub-int/2addr v0, v6

    invoke-direct {p1, v0, v9, v11}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_9
    if-eqz v3, :cond_b

    iget-boolean v1, p0, LOg2;->l:Z

    if-eqz v1, :cond_a

    goto :goto_3

    :cond_a
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v2, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_b
    :goto_3
    invoke-virtual {p0}, LOg2;->f()V

    invoke-virtual {p1, v0}, Lfj2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v2, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_d
    if-eqz v3, :cond_f

    iget-boolean v3, p0, LOg2;->l:Z

    if-eqz v3, :cond_e

    goto :goto_4

    :cond_e
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-direct {p1, v0, v2, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_f
    :goto_4
    move v3, v6

    goto/16 :goto_0

    :cond_10
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Internal Error"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract n()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract o()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public p()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    iget-char v0, p0, LOg2;->a:C

    :goto_0
    invoke-virtual {p0}, LOg2;->f()V

    iget-char v1, p0, LOg2;->a:C

    const/16 v2, 0x22

    if-eq v1, v2, :cond_10

    const/16 v3, 0x27

    if-eq v1, v3, :cond_10

    const/16 v4, 0x5c

    if-eq v1, v4, :cond_4

    const/16 v2, 0x7f

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :pswitch_1
    iget-boolean v1, p0, LOg2;->o:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    iget-char v2, p0, LOg2;->a:C

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v0, v1, v3, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_1
    iget-boolean v2, p0, LOg2;->o:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v2, p0, LOg2;->r:Z

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v2, v1}, LOg2$a;->a(C)V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    iget-char v2, p0, LOg2;->a:C

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-direct {v0, v1, v3, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, LOg2;->f()V

    iget-char v1, p0, LOg2;->a:C

    if-eq v1, v2, :cond_f

    if-eq v1, v3, :cond_e

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_d

    if-eq v1, v4, :cond_c

    const/16 v2, 0x62

    if-eq v1, v2, :cond_b

    const/16 v2, 0x66

    if-eq v1, v2, :cond_a

    const/16 v2, 0x6e

    if-eq v1, v2, :cond_9

    const/16 v2, 0x72

    if-eq v1, v2, :cond_8

    const/16 v2, 0x78

    if-eq v1, v2, :cond_7

    const/16 v2, 0x74

    if-eq v1, v2, :cond_6

    const/16 v2, 0x75

    if-eq v1, v2, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/4 v2, 0x4

    invoke-virtual {p0, v2}, LOg2;->q(I)C

    move-result v2

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_6
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_7
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, LOg2;->q(I)C

    move-result v2

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_9
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_a
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_b
    iget-object v1, p0, LOg2;->d:LOg2$a;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_c
    iget-object v1, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v1, v4}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_d
    iget-object v1, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_e
    iget-object v1, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v1, v3}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_f
    iget-object v1, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v1, v2}, LOg2$a;->a(C)V

    goto/16 :goto_0

    :cond_10
    if-ne v0, v1, :cond_11

    invoke-virtual {p0}, LOg2;->f()V

    iget-object v0, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v0}, LOg2$a;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LOg2;->f:Ljava/lang/String;

    return-void

    :cond_11
    iget-object v2, p0, LOg2;->d:LOg2$a;

    invoke-virtual {v2, v1}, LOg2$a;->a(C)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public q(I)C
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_4

    mul-int/lit8 v1, v1, 0x10

    invoke-virtual {p0}, LOg2;->f()V

    iget-char v2, p0, LOg2;->a:C

    const/16 v3, 0x39

    if-gt v2, v3, :cond_0

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    add-int/lit8 v2, v2, -0x30

    :goto_1
    add-int/2addr v1, v2

    goto :goto_3

    :cond_0
    const/16 v3, 0x46

    if-gt v2, v3, :cond_1

    const/16 v3, 0x41

    if-lt v2, v3, :cond_1

    add-int/lit8 v2, v2, -0x41

    :goto_2
    add-int/lit8 v2, v2, 0xa

    goto :goto_1

    :cond_1
    const/16 v3, 0x61

    if-lt v2, v3, :cond_2

    const/16 v3, 0x66

    if-gt v2, v3, :cond_2

    add-int/lit8 v2, v2, -0x61

    goto :goto_2

    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/16 p1, 0x1a

    if-ne v2, p1, :cond_3

    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    const/4 v1, 0x3

    const-string v2, "EOF"

    invoke-direct {p1, v0, v1, v2}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v0, p0, LOg2;->g:I

    iget-char v1, p0, LOg2;->a:C

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/4 v2, 0x4

    invoke-direct {p1, v0, v2, v1}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw p1

    :cond_4
    int-to-char p1, v1

    return p1
.end method

.method public r()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const/16 v1, 0x39

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LOg2;->n()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public s([Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_1

    if-ltz v0, :cond_0

    const/16 v1, 0x7e

    if-ge v0, v1, :cond_0

    aget-boolean v0, p1, v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LOg2;->n()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public t()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    iget-char v0, p0, LOg2;->a:C

    const/16 v1, 0x20

    if-gt v0, v1, :cond_1

    const/16 v1, 0x1a

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LOg2;->n()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
