.class public LUt4;
.super LD83;
.source "SourceFile"


# direct methods
.method public constructor <init>(LyB0;Lz91;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LD83;-><init>(LyB0;Lz91;)V

    return-void
.end method


# virtual methods
.method public a(LP62;)V
    .locals 4

    iget-object v0, p0, LSD1;->a:LSl2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LSl2;->d(I)I

    move-result v0

    iget-object v2, p0, LSD1;->a:LSl2;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LSl2;->d(I)I

    move-result v2

    invoke-virtual {p1, v0, v2, v1}, LP62;->q(III)V

    return-void
.end method

.method public p(LP62;)V
    .locals 1

    iget-object v0, p0, LD83;->g:Lz91;

    check-cast v0, Ly91;

    invoke-virtual {v0, p1}, Ly91;->k(LP62;)V

    return-void
.end method
