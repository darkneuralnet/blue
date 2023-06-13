.class public LcT5;
.super LM;
.source "SourceFile"


# instance fields
.field public b:LG9;

.field public c:LMF0;


# direct methods
.method public constructor <init>(LG9;LE;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-direct {p0}, LM;-><init>()V

    new-instance v0, LMF0;

    invoke-direct {v0, p2}, LMF0;-><init>(LE;)V

    iput-object v0, p0, LcT5;->c:LMF0;

    iput-object p1, p0, LcT5;->b:LG9;

    return-void
.end method

.method public constructor <init>(LG9;[B)V
    .locals 1

    invoke-direct {p0}, LM;-><init>()V

    new-instance v0, LMF0;

    invoke-direct {v0, p2}, LMF0;-><init>([B)V

    iput-object v0, p0, LcT5;->c:LMF0;

    iput-object p1, p0, LcT5;->b:LG9;

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 3

    invoke-direct {p0}, LM;-><init>()V

    invoke-virtual {p1}, LU;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LU;->C()Ljava/util/Enumeration;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LG9;->o(Ljava/lang/Object;)LG9;

    move-result-object v0

    iput-object v0, p0, LcT5;->b:LG9;

    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LMF0;->G(Ljava/lang/Object;)LMF0;

    move-result-object p1

    iput-object p1, p0, LcT5;->c:LMF0;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bad sequence size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LU;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static o(Ljava/lang/Object;)LcT5;
    .locals 1

    instance-of v0, p0, LcT5;

    if-eqz v0, :cond_0

    check-cast p0, LcT5;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LcT5;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LcT5;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LS;
    .locals 2

    new-instance v0, LF;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, LF;-><init>(I)V

    iget-object v1, p0, LcT5;->b:LG9;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, LcT5;->c:LMF0;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()LG9;
    .locals 1

    iget-object v0, p0, LcT5;->b:LG9;

    return-object v0
.end method

.method public s()LMF0;
    .locals 1

    iget-object v0, p0, LcT5;->c:LMF0;

    return-object v0
.end method

.method public u()LS;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LcT5;->c:LMF0;

    invoke-virtual {v0}, LC;->C()[B

    move-result-object v0

    invoke-static {v0}, LS;->v([B)LS;

    move-result-object v0

    return-object v0
.end method
