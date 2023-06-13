.class public LoM5;
.super LgC1;
.source "SourceFile"


# instance fields
.field public g:D

.field public h:[LyB0;

.field public i:Z


# direct methods
.method public constructor <init>(D[LyB0;)V
    .locals 1

    invoke-direct {p0}, LgC1;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LoM5;->i:Z

    iput-wide p1, p0, LoM5;->g:D

    iput-object p3, p0, LoM5;->h:[LyB0;

    return-void
.end method


# virtual methods
.method public c(LEB0;LWB1;)LEB0;
    .locals 0

    invoke-interface {p1}, LEB0;->b2()[LyB0;

    move-result-object p1

    iget-object p2, p0, LoM5;->h:[LyB0;

    invoke-virtual {p0, p1, p2}, LoM5;->l([LyB0;[LyB0;)[LyB0;

    move-result-object p1

    iget-object p2, p0, LgC1;->b:LbC1;

    invoke-virtual {p2}, LbC1;->z()LFB0;

    move-result-object p2

    invoke-interface {p2, p1}, LFB0;->c([LyB0;)LEB0;

    move-result-object p1

    return-object p1
.end method

.method public final l([LyB0;[LyB0;)[LyB0;
    .locals 3

    new-instance v0, LCr2;

    iget-wide v1, p0, LoM5;->g:D

    invoke-direct {v0, p1, v1, v2}, LCr2;-><init>([LyB0;D)V

    iget-boolean p1, p0, LoM5;->i:Z

    invoke-virtual {v0, p1}, LCr2;->d(Z)V

    invoke-virtual {v0, p2}, LCr2;->f([LyB0;)[LyB0;

    move-result-object p1

    return-object p1
.end method
