.class public LsO2;
.super LM;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:I

.field public final d:LOA1;


# direct methods
.method public constructor <init>(IILOA1;)V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    iput p1, p0, LsO2;->b:I

    iput p2, p0, LsO2;->c:I

    new-instance p1, LOA1;

    invoke-direct {p1, p3}, LOA1;-><init>(LOA1;)V

    iput-object p1, p0, LsO2;->d:LOA1;

    return-void
.end method

.method public constructor <init>(LU;)V
    .locals 2

    invoke-direct {p0}, LM;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LK;

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    iput v0, p0, LsO2;->b:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LU;->A(I)LE;

    move-result-object v0

    check-cast v0, LK;

    invoke-virtual {v0}, LK;->F()I

    move-result v0

    iput v0, p0, LsO2;->c:I

    new-instance v0, LOA1;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, LU;->A(I)LE;

    move-result-object p1

    check-cast p1, LO;

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    invoke-direct {v0, p1}, LOA1;-><init>([B)V

    iput-object v0, p0, LsO2;->d:LOA1;

    return-void
.end method

.method public static o(Ljava/lang/Object;)LsO2;
    .locals 1

    instance-of v0, p0, LsO2;

    if-eqz v0, :cond_0

    check-cast p0, LsO2;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    new-instance v0, LsO2;

    invoke-static {p0}, LU;->z(Ljava/lang/Object;)LU;

    move-result-object p0

    invoke-direct {v0, p0}, LsO2;-><init>(LU;)V

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

    new-instance v1, LK;

    iget v2, p0, LsO2;->b:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LK;

    iget v2, p0, LsO2;->c:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, LK;-><init>(J)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LVF0;

    iget-object v2, p0, LsO2;->d:LOA1;

    invoke-virtual {v2}, LOA1;->c()[B

    move-result-object v2

    invoke-direct {v1, v2}, LVF0;-><init>([B)V

    invoke-virtual {v0, v1}, LF;->a(LE;)V

    new-instance v1, LZF0;

    invoke-direct {v1, v0}, LZF0;-><init>(LF;)V

    return-object v1
.end method

.method public j()LOA1;
    .locals 2

    new-instance v0, LOA1;

    iget-object v1, p0, LsO2;->d:LOA1;

    invoke-direct {v0, v1}, LOA1;-><init>(LOA1;)V

    return-object v0
.end method

.method public s()I
    .locals 1

    iget v0, p0, LsO2;->b:I

    return v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, LsO2;->c:I

    return v0
.end method
