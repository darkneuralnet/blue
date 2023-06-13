.class public LQg2;
.super LPg2;
.source "SourceFile"


# instance fields
.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LPg2;-><init>(I)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 2

    iget v0, p0, LOg2;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LOg2;->g:I

    iget v1, p0, LPg2;->y:I

    if-lt v0, v1, :cond_0

    const/16 v0, 0x1a

    iput-char v0, p0, LOg2;->a:C

    goto :goto_0

    :cond_0
    iget-object v1, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iput-char v0, p0, LOg2;->a:C

    :goto_0
    return-void
.end method

.method public k()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    iget v0, p0, LOg2;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LOg2;->g:I

    iget v1, p0, LPg2;->y:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iput-char v0, p0, LOg2;->a:C

    return-void

    :cond_0
    const/16 v0, 0x1a

    iput-char v0, p0, LOg2;->a:C

    new-instance v0, Lcom/nimbusds/jose/shaded/json/parser/ParseException;

    iget v1, p0, LOg2;->g:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x3

    const-string v3, "EOF"

    invoke-direct {v0, v1, v2, v3}, Lcom/nimbusds/jose/shaded/json/parser/ParseException;-><init>(IILjava/lang/Object;)V

    throw v0
.end method

.method public n()V
    .locals 2

    iget v0, p0, LOg2;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LOg2;->g:I

    iget v1, p0, LPg2;->y:I

    if-lt v0, v1, :cond_0

    const/16 v0, 0x1a

    iput-char v0, p0, LOg2;->a:C

    goto :goto_0

    :cond_0
    iget-object v1, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iput-char v0, p0, LOg2;->a:C

    :goto_0
    return-void
.end method

.method public u(II)V
    .locals 1

    iget-object v0, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LOg2;->f:Ljava/lang/String;

    return-void
.end method

.method public v(II)V
    .locals 2

    :goto_0
    add-int/lit8 v0, p2, -0x1

    if-ge p1, v0, :cond_0

    iget-object v0, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    add-int/lit8 v0, p2, -0x1

    if-le v0, p1, :cond_1

    iget-object v1, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, p2}, LQg2;->u(II)V

    return-void
.end method

.method public w(CI)I
    .locals 1

    iget-object v0, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    return p1
.end method

.method public x(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    sget-object v0, LVg2;->c:Lej2;

    iget-object v0, v0, Lej2;->b:Lfj2;

    invoke-virtual {p0, p1, v0}, LQg2;->y(Ljava/lang/String;Lfj2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/lang/String;Lfj2;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lfj2<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/shaded/json/parser/ParseException;
        }
    .end annotation

    iget-object v0, p2, Lfj2;->a:Lej2;

    iput-object v0, p0, LOg2;->b:Lej2;

    iput-object p1, p0, LQg2;->z:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, LPg2;->y:I

    invoke-virtual {p0, p2}, LOg2;->d(Lfj2;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
