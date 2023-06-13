.class public Ll64;
.super LM;
.source "SourceFile"


# instance fields
.field public b:LK;

.field public c:LG9;

.field public d:LO;

.field public e:LW;

.field public f:LC;


# direct methods
.method public constructor <init>(LG9;LE;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v0}, Ll64;-><init>(LG9;LE;LW;[B)V

    return-void
.end method

.method public constructor <init>(LG9;LE;LW;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Ll64;-><init>(LG9;LE;LW;[B)V

    return-void
.end method

.method public constructor <init>(LG9;LE;LW;[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, LM;-><init>()V

    new-instance v0, LK;

    if-eqz p4, :cond_0

    sget-object v1, LKG;->b:Ljava/math/BigInteger;

    goto :goto_0

    :cond_0
    sget-object v1, LKG;->a:Ljava/math/BigInteger;

    :goto_0
    invoke-direct {v0, v1}, LK;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Ll64;->b:LK;

    iput-object p1, p0, Ll64;->c:LG9;

    new-instance p1, LVF0;

    invoke-direct {p1, p2}, LVF0;-><init>(LE;)V

    iput-object p1, p0, Ll64;->d:LO;

    iput-object p3, p0, Ll64;->e:LW;

    if-nez p4, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    new-instance p1, LMF0;

    invoke-direct {p1, p4}, LMF0;-><init>([B)V

    :goto_1
    iput-object p1, p0, Ll64;->f:LC;

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 5

    invoke-direct {p0}, LM;-><init>()V

    invoke-virtual {p1}, LU;->C()Ljava/util/Enumeration;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v0

    iput-object v0, p0, Ll64;->b:LK;

    invoke-static {v0}, Ll64;->v(LK;)I

    move-result v0

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LG9;->o(Ljava/lang/Object;)LG9;

    move-result-object v1

    iput-object v1, p0, Ll64;->c:LG9;

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object v1

    iput-object v1, p0, Ll64;->d:LO;

    const/4 v1, -0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LZ;

    invoke-virtual {v2}, LZ;->C()I

    move-result v3

    if-le v3, v1, :cond_3

    const/4 v1, 0x0

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    if-lt v0, v4, :cond_0

    invoke-static {v2, v1}, LMF0;->F(LZ;Z)LMF0;

    move-result-object v1

    iput-object v1, p0, Ll64;->f:LC;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'publicKey\' requires version v2(1) or later"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown optional field in private key info"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v2, v1}, LW;->A(LZ;Z)LW;

    move-result-object v1

    iput-object v1, p0, Ll64;->e:LW;

    :goto_1
    move v1, v3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid optional field in private key info"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public static o(Ljava/lang/Object;)Ll64;
    .locals 1

    instance-of v0, p0, Ll64;

    if-eqz v0, :cond_0

    check-cast p0, Ll64;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, Ll64;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, Ll64;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static v(LK;)I
    .locals 1

    invoke-virtual {p0}, LK;->F()I

    move-result p0

    if-ltz p0, :cond_0

    const/4 v0, 0x1

    if-gt p0, v0, :cond_0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid version for private key info"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c()LS;
    .locals 5

    new-instance v0, LF;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, LF;-><init>(I)V

    iget-object v1, p0, Ll64;->b:LK;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, Ll64;->c:LG9;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, Ll64;->d:LO;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, Ll64;->e:LW;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-instance v3, LcG0;

    invoke-direct {v3, v2, v2, v1}, LcG0;-><init>(ZILE;)V

    invoke-virtual {v0, v3}, LF;->a(LE;)V

    :cond_0
    iget-object v1, p0, Ll64;->f:LC;

    if-eqz v1, :cond_1

    new-instance v3, LcG0;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4, v1}, LcG0;-><init>(ZILE;)V

    invoke-virtual {v0, v3}, LF;->a(LE;)V

    :cond_1
    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()LW;
    .locals 1

    iget-object v0, p0, Ll64;->e:LW;

    return-object v0
.end method

.method public s()LG9;
    .locals 1

    iget-object v0, p0, Ll64;->c:LG9;

    return-object v0
.end method

.method public u()LC;
    .locals 1

    iget-object v0, p0, Ll64;->f:LC;

    return-object v0
.end method

.method public w()LE;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Ll64;->d:LO;

    invoke-virtual {v0}, LO;->C()[B

    move-result-object v0

    invoke-static {v0}, LS;->v([B)LS;

    move-result-object v0

    return-object v0
.end method
