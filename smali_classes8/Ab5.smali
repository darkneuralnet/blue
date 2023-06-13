.class public LAb5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsf1;

.field public b:Lsf1;


# direct methods
.method public constructor <init>(Lsf1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAb5;->a:Lsf1;

    invoke-virtual {p1}, Lsf1;->c()Lsf1;

    move-result-object p1

    iput-object p1, p0, LAb5;->b:Lsf1;

    return-void
.end method

.method public static g(LWB1;LWB1;Lsf1;)Lsf1;
    .locals 1

    new-instance v0, LAb5;

    invoke-direct {v0, p2}, LAb5;-><init>(Lsf1;)V

    invoke-virtual {v0, p0}, LAb5;->a(LWB1;)V

    invoke-virtual {v0, p1}, LAb5;->a(LWB1;)V

    invoke-virtual {v0}, LAb5;->f()Lsf1;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lsf1;LyB0;LyB0;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsf1;->F(LyB0;LyB0;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(LWB1;)V
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LWB1;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LCX3;

    if-eqz v0, :cond_1

    check-cast p1, LCX3;

    invoke-virtual {p0, p1}, LAb5;->c(LCX3;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, LXB1;

    if-eqz v0, :cond_2

    check-cast p1, LXB1;

    invoke-virtual {p0, p1}, LAb5;->b(LXB1;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(LXB1;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LXB1;->f0()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, LXB1;->d0(I)LWB1;

    move-result-object v1

    invoke-virtual {p0, v1}, LAb5;->a(LWB1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(LCX3;)V
    .locals 2

    invoke-virtual {p1}, LCX3;->L0()LKr2;

    move-result-object v0

    invoke-virtual {p0, v0}, LAb5;->d(LKr2;)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LCX3;->O0()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, LCX3;->M0(I)LKr2;

    move-result-object v1

    invoke-virtual {p0, v1}, LAb5;->d(LKr2;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(LKr2;)V
    .locals 3

    invoke-virtual {p1}, LBr2;->r0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LBr2;->M0()LEB0;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1}, LEB0;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    add-int/lit8 v1, v0, -0x1

    invoke-interface {p1, v1}, LEB0;->u(I)LyB0;

    move-result-object v1

    invoke-interface {p1, v0}, LEB0;->u(I)LyB0;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, LAb5;->e(LyB0;LyB0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(LyB0;LyB0;)V
    .locals 1

    iget-object v0, p0, LAb5;->a:Lsf1;

    invoke-static {v0, p1, p2}, LAb5;->h(Lsf1;LyB0;LyB0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LAb5;->b:Lsf1;

    invoke-virtual {v0, p1}, Lsf1;->k(LyB0;)V

    iget-object p1, p0, LAb5;->b:Lsf1;

    invoke-virtual {p1, p2}, Lsf1;->k(LyB0;)V

    :cond_0
    return-void
.end method

.method public f()Lsf1;
    .locals 1

    iget-object v0, p0, LAb5;->b:Lsf1;

    return-object v0
.end method
