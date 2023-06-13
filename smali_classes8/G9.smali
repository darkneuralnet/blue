.class public LG9;
.super LM;
.source "SourceFile"


# instance fields
.field public b:LN;

.field public c:LE;


# direct methods
.method public constructor <init>(LN;)V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    iput-object p1, p0, LG9;->b:LN;

    return-void
.end method

.method public constructor <init>(LN;LE;)V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    iput-object p1, p0, LG9;->b:LN;

    iput-object p2, p0, LG9;->c:LE;

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 3

    invoke-direct {p0}, LM;-><init>()V

    invoke-virtual {p1}, LU;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, LU;->size()I

    move-result v0

    const/4 v2, 0x2

    if-gt v0, v2, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    invoke-static {v0}, LN;->F(Ljava/lang/Object;)LN;

    move-result-object v0

    iput-object v0, p0, LG9;->b:LN;

    invoke-virtual {p1}, LU;->size()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1, v1}, LU;->A(I)LE;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LG9;->c:LE;

    return-void

    :cond_1
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

.method public static o(Ljava/lang/Object;)LG9;
    .locals 1

    instance-of v0, p0, LG9;

    if-eqz v0, :cond_0

    check-cast p0, LG9;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LG9;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LG9;-><init>(LU;)V

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

    iget-object v1, p0, LG9;->b:LN;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, LG9;->c:LE;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    :cond_0
    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()LN;
    .locals 1

    iget-object v0, p0, LG9;->b:LN;

    return-object v0
.end method

.method public s()LE;
    .locals 1

    iget-object v0, p0, LG9;->c:LE;

    return-object v0
.end method
