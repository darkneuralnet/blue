.class public LkO2;
.super LiO2;
.source "SourceFile"


# instance fields
.field public d:I

.field public e:I

.field public f:LPA1;

.field public g:LTX3;

.field public h:LhR3;

.field public i:LOA1;

.field public j:[LTX3;


# direct methods
.method public constructor <init>(IILPA1;LTX3;LOA1;LhR3;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p7}, LiO2;-><init>(ZLjava/lang/String;)V

    iput p1, p0, LkO2;->d:I

    iput p2, p0, LkO2;->e:I

    iput-object p3, p0, LkO2;->f:LPA1;

    iput-object p4, p0, LkO2;->g:LTX3;

    iput-object p5, p0, LkO2;->i:LOA1;

    iput-object p6, p0, LkO2;->h:LhR3;

    new-instance p1, LVX3;

    invoke-direct {p1, p3, p4}, LVX3;-><init>(LPA1;LTX3;)V

    invoke-virtual {p1}, LVX3;->c()[LTX3;

    move-result-object p1

    iput-object p1, p0, LkO2;->j:[LTX3;

    return-void
.end method

.method public constructor <init>(IILPA1;LTX3;LhR3;Ljava/lang/String;)V
    .locals 8

    invoke-static {p3, p4}, LFD1;->a(LPA1;LTX3;)LOA1;

    move-result-object v5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LkO2;-><init>(IILPA1;LTX3;LOA1;LhR3;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()LPA1;
    .locals 1

    iget-object v0, p0, LkO2;->f:LPA1;

    return-object v0
.end method

.method public c()LTX3;
    .locals 1

    iget-object v0, p0, LkO2;->g:LTX3;

    return-object v0
.end method

.method public d()LOA1;
    .locals 1

    iget-object v0, p0, LkO2;->i:LOA1;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LkO2;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, LkO2;->d:I

    return v0
.end method

.method public g()LhR3;
    .locals 1

    iget-object v0, p0, LkO2;->h:LhR3;

    return-object v0
.end method
