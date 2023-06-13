.class public LrO2;
.super LoO2;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:I

.field public f:LPA1;

.field public g:LTX3;

.field public h:LOA1;

.field public i:LhR3;

.field public j:LhR3;

.field public k:LOA1;

.field public l:[LTX3;


# direct methods
.method public constructor <init>(IILPA1;LTX3;LhR3;LhR3;LOA1;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LoO2;-><init>(ZLpO2;)V

    iput p2, p0, LrO2;->e:I

    iput p1, p0, LrO2;->d:I

    iput-object p3, p0, LrO2;->f:LPA1;

    iput-object p4, p0, LrO2;->g:LTX3;

    iput-object p7, p0, LrO2;->h:LOA1;

    iput-object p5, p0, LrO2;->i:LhR3;

    iput-object p6, p0, LrO2;->j:LhR3;

    invoke-static {p3, p4}, LFD1;->a(LPA1;LTX3;)LOA1;

    move-result-object p1

    iput-object p1, p0, LrO2;->k:LOA1;

    new-instance p1, LVX3;

    invoke-direct {p1, p3, p4}, LVX3;-><init>(LPA1;LTX3;)V

    invoke-virtual {p1}, LVX3;->c()[LTX3;

    move-result-object p1

    iput-object p1, p0, LrO2;->l:[LTX3;

    return-void
.end method


# virtual methods
.method public a()LPA1;
    .locals 1

    iget-object v0, p0, LrO2;->f:LPA1;

    return-object v0
.end method

.method public b()LTX3;
    .locals 1

    iget-object v0, p0, LrO2;->g:LTX3;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LrO2;->e:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LrO2;->d:I

    return v0
.end method

.method public e()LhR3;
    .locals 1

    iget-object v0, p0, LrO2;->i:LhR3;

    return-object v0
.end method

.method public f()LhR3;
    .locals 1

    iget-object v0, p0, LrO2;->j:LhR3;

    return-object v0
.end method

.method public g()LOA1;
    .locals 1

    iget-object v0, p0, LrO2;->h:LOA1;

    return-object v0
.end method
