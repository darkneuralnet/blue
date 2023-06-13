.class public LXs4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsr2;

.field public b:Lsf1;

.field public c:LyB0;

.field public d:LyB0;

.field public e:LyB0;

.field public f:LyB0;


# direct methods
.method public constructor <init>(Lsf1;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LBb5;

    invoke-direct {v0}, LBb5;-><init>()V

    iput-object v0, p0, LXs4;->a:Lsr2;

    iput-object p1, p0, LXs4;->b:Lsf1;

    new-instance v0, LyB0;

    invoke-virtual {p1}, Lsf1;->p()D

    move-result-wide v1

    invoke-virtual {p1}, Lsf1;->q()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LyB0;-><init>(DD)V

    iput-object v0, p0, LXs4;->c:LyB0;

    new-instance v0, LyB0;

    invoke-virtual {p1}, Lsf1;->n()D

    move-result-wide v1

    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LyB0;-><init>(DD)V

    iput-object v0, p0, LXs4;->d:LyB0;

    new-instance v0, LyB0;

    invoke-virtual {p1}, Lsf1;->p()D

    move-result-wide v1

    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LyB0;-><init>(DD)V

    iput-object v0, p0, LXs4;->e:LyB0;

    new-instance v0, LyB0;

    invoke-virtual {p1}, Lsf1;->n()D

    move-result-wide v1

    invoke-virtual {p1}, Lsf1;->q()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, LyB0;-><init>(DD)V

    iput-object v0, p0, LXs4;->f:LyB0;

    return-void
.end method


# virtual methods
.method public a(LyB0;LyB0;)Z
    .locals 8

    new-instance v0, Lsf1;

    invoke-direct {v0, p1, p2}, Lsf1;-><init>(LyB0;LyB0;)V

    iget-object v1, p0, LXs4;->b:Lsf1;

    invoke-virtual {v1, v0}, Lsf1;->K(Lsf1;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LXs4;->b:Lsf1;

    invoke-virtual {v0, p1}, Lsf1;->E(LyB0;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, LXs4;->b:Lsf1;

    invoke-virtual {v0, p2}, Lsf1;->E(LyB0;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1, p2}, LyB0;->d(LyB0;)I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_0

    :cond_3
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_0
    iget-wide v3, p1, LyB0;->c:D

    iget-wide v5, p2, LyB0;->c:D

    cmpl-double v0, v3, v5

    if-lez v0, :cond_4

    move v0, v2

    goto :goto_1

    :cond_4
    move v0, v1

    :goto_1
    if-eqz v0, :cond_5

    iget-object v0, p0, LXs4;->a:Lsr2;

    iget-object v3, p0, LXs4;->e:LyB0;

    iget-object v4, p0, LXs4;->f:LyB0;

    invoke-virtual {v0, p2, p1, v3, v4}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, LXs4;->a:Lsr2;

    iget-object v3, p0, LXs4;->c:LyB0;

    iget-object v4, p0, LXs4;->d:LyB0;

    invoke-virtual {v0, p2, p1, v3, v4}, Lsr2;->d(LyB0;LyB0;LyB0;LyB0;)V

    :goto_2
    iget-object p1, p0, LXs4;->a:Lsr2;

    invoke-virtual {p1}, Lsr2;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v1
.end method
