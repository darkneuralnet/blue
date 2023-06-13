.class public LIH6;
.super LM;
.source "SourceFile"


# instance fields
.field public final b:LK;

.field public final c:I

.field public final d:I

.field public final e:LG9;


# direct methods
.method public constructor <init>(IILG9;)V
    .locals 3

    invoke-direct {p0}, LM;-><init>()V

    new-instance v0, LK;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, LK;-><init>(J)V

    iput-object v0, p0, LIH6;->b:LK;

    iput p1, p0, LIH6;->c:I

    iput p2, p0, LIH6;->d:I

    iput-object p3, p0, LIH6;->e:LG9;

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 1

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    invoke-static {v0}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v0

    iput-object v0, p0, LIH6;->b:LK;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    invoke-static {v0}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v0

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    iput v0, p0, LIH6;->c:I

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    invoke-static {v0}, LK;->A(Ljava/lang/Object;)LK;

    move-result-object v0

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    iput v0, p0, LIH6;->d:I

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object p1

    invoke-static {p1}, LG9;->o(Ljava/lang/Object;)LG9;

    move-result-object p1

    iput-object p1, p0, LIH6;->e:LG9;

    return-void
.end method

.method public static o(Ljava/lang/Object;)LIH6;
    .locals 1

    instance-of v0, p0, LIH6;

    if-eqz v0, :cond_0

    check-cast p0, LIH6;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LIH6;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LIH6;-><init>(LU;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()LS;
    .locals 4

    new-instance v0, LF;

    invoke-direct {v0}, LF;-><init>()V

    iget-object v1, p0, LIH6;->b:LK;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LK;

    iget v2, p0, LIH6;->c:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LK;

    iget v2, p0, LIH6;->d:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    iget-object v1, p0, LIH6;->e:LG9;

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()I
    .locals 1

    iget v0, p0, LIH6;->c:I

    return v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, LIH6;->d:I

    return v0
.end method

.method public u()LG9;
    .locals 1

    iget-object v0, p0, LIH6;->e:LG9;

    return-object v0
.end method
