.class public final Lvb1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:LyX5;

.field public c:LX31;

.field public d:LX31;

.field public final e:Ljava/lang/StringBuilder;

.field public f:I

.field public g:I

.field public h:LwX5;

.field public i:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-byte v4, v0, v3

    and-int/lit16 v4, v4, 0xff

    int-to-char v4, v4

    const/16 v5, 0x3f

    if-ne v4, v5, :cond_1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message contains characters outside ISO-8859-1 encoding."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lvb1;->a:Ljava/lang/String;

    sget-object v0, LyX5;->b:LyX5;

    iput-object v0, p0, Lvb1;->b:LyX5;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Lvb1;->e:Ljava/lang/StringBuilder;

    const/4 p1, -0x1

    iput p1, p0, Lvb1;->g:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lvb1;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/StringBuilder;
    .locals 1

    iget-object v0, p0, Lvb1;->e:Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public c()C
    .locals 2

    iget-object v0, p0, Lvb1;->a:Ljava/lang/String;

    iget v1, p0, Lvb1;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvb1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lvb1;->g:I

    return v0
.end method

.method public f()I
    .locals 2

    invoke-virtual {p0}, Lvb1;->h()I

    move-result v0

    iget v1, p0, Lvb1;->f:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public g()LwX5;
    .locals 1

    iget-object v0, p0, Lvb1;->h:LwX5;

    return-object v0
.end method

.method public final h()I
    .locals 2

    iget-object v0, p0, Lvb1;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Lvb1;->i:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public i()Z
    .locals 2

    iget v0, p0, Lvb1;->f:I

    invoke-virtual {p0}, Lvb1;->h()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lvb1;->g:I

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lvb1;->h:LwX5;

    return-void
.end method

.method public l(LX31;LX31;)V
    .locals 0

    iput-object p1, p0, Lvb1;->c:LX31;

    iput-object p2, p0, Lvb1;->d:LX31;

    return-void
.end method

.method public m(I)V
    .locals 0

    iput p1, p0, Lvb1;->i:I

    return-void
.end method

.method public n(LyX5;)V
    .locals 0

    iput-object p1, p0, Lvb1;->b:LyX5;

    return-void
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, Lvb1;->g:I

    return-void
.end method

.method public p()V
    .locals 1

    invoke-virtual {p0}, Lvb1;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lvb1;->q(I)V

    return-void
.end method

.method public q(I)V
    .locals 4

    iget-object v0, p0, Lvb1;->h:LwX5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LwX5;->a()I

    move-result v0

    if-le p1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lvb1;->b:LyX5;

    iget-object v1, p0, Lvb1;->c:LX31;

    iget-object v2, p0, Lvb1;->d:LX31;

    const/4 v3, 0x1

    invoke-static {p1, v0, v1, v2, v3}, LwX5;->l(ILyX5;LX31;LX31;Z)LwX5;

    move-result-object p1

    iput-object p1, p0, Lvb1;->h:LwX5;

    :cond_1
    return-void
.end method

.method public r(C)V
    .locals 1

    iget-object v0, p0, Lvb1;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lvb1;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
