.class public LWs4;
.super LTz5;
.source "SourceFile"


# instance fields
.field public b:Lsf1;

.field public c:LXs4;

.field public d:Z


# direct methods
.method public constructor <init>(LCX3;)V
    .locals 1

    invoke-direct {p0}, LTz5;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LWs4;->d:Z

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    iput-object p1, p0, LWs4;->b:Lsf1;

    new-instance v0, LXs4;

    invoke-direct {v0, p1}, LXs4;-><init>(Lsf1;)V

    iput-object v0, p0, LWs4;->c:LXs4;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, LWs4;->d:Z

    return v0
.end method

.method public c(LWB1;)V
    .locals 2

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v0

    iget-object v1, p0, LWs4;->b:Lsf1;

    invoke-virtual {v1, v0}, Lsf1;->K(Lsf1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, LDr2;->b(LWB1;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LWs4;->d(Ljava/util/List;)V

    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBr2;

    invoke-virtual {p0, v0}, LWs4;->e(LBr2;)V

    iget-boolean v0, p0, LWs4;->d:Z

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method public final e(LBr2;)V
    .locals 5

    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object p1

    invoke-interface {p1}, LEB0;->R()LyB0;

    move-result-object v0

    invoke-interface {p1}, LEB0;->R()LyB0;

    move-result-object v1

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    add-int/lit8 v4, v3, -0x1

    invoke-interface {p1, v4, v0}, LEB0;->T(ILyB0;)V

    invoke-interface {p1, v3, v1}, LEB0;->T(ILyB0;)V

    iget-object v4, p0, LWs4;->c:LXs4;

    invoke-virtual {v4, v0, v1}, LXs4;->a(LyB0;LyB0;)Z

    move-result v4

    if-eqz v4, :cond_0

    iput-boolean v2, p0, LWs4;->d:Z

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, LWs4;->d:Z

    return v0
.end method
