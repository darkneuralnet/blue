.class public LaC1;
.super LTz5;
.source "SourceFile"


# instance fields
.field public b:LEB0;

.field public c:Lsf1;

.field public d:Z


# direct methods
.method public constructor <init>(LCX3;)V
    .locals 1

    invoke-direct {p0}, LTz5;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LaC1;->d:Z

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    invoke-virtual {v0}, LBr2;->M0()LEB0;

    move-result-object v0

    iput-object v0, p0, LaC1;->b:LEB0;

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    iput-object p1, p0, LaC1;->c:Lsf1;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, LaC1;->d:Z

    return v0
.end method

.method public c(LWB1;)V
    .locals 4

    instance-of v0, p1, LCX3;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    iget-object v1, p0, LaC1;->c:Lsf1;

    invoke-virtual {v1, v0}, Lsf1;->K(Lsf1;)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    new-instance v1, LyB0;

    invoke-direct {v1}, LyB0;-><init>()V

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v2, v3, :cond_4

    iget-object v3, p0, LaC1;->b:LEB0;

    invoke-interface {v3, v2, v1}, LEB0;->T(ILyB0;)V

    invoke-virtual {v0, v1}, Lsf1;->a(LyB0;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, p1

    check-cast v3, LCX3;

    invoke-static {v1, v3}, LSA5;->b(LyB0;LCX3;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, LaC1;->d:Z

    return-void

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LaC1;->d:Z

    return v0
.end method
