.class public final LFd3;
.super LCH6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFd3$b;
    }
.end annotation


# instance fields
.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(LFd3$b;)V
    .locals 1

    invoke-direct {p0, p1}, LCH6;-><init>(LCH6$a;)V

    invoke-static {p1}, LFd3$b;->i(LFd3$b;)I

    move-result v0

    iput v0, p0, LFd3;->e:I

    invoke-static {p1}, LFd3$b;->j(LFd3$b;)I

    move-result v0

    iput v0, p0, LFd3;->f:I

    invoke-static {p1}, LFd3$b;->k(LFd3$b;)I

    move-result p1

    iput p1, p0, LFd3;->g:I

    return-void
.end method

.method public synthetic constructor <init>(LFd3$b;LFd3$a;)V
    .locals 0

    invoke-direct {p0, p1}, LFd3;-><init>(LFd3$b;)V

    return-void
.end method


# virtual methods
.method public d()[B
    .locals 3

    invoke-super {p0}, LCH6;->d()[B

    move-result-object v0

    iget v1, p0, LFd3;->e:I

    const/16 v2, 0x10

    invoke-static {v1, v0, v2}, LDD3;->d(I[BI)V

    iget v1, p0, LFd3;->f:I

    const/16 v2, 0x14

    invoke-static {v1, v0, v2}, LDD3;->d(I[BI)V

    iget v1, p0, LFd3;->g:I

    const/16 v2, 0x18

    invoke-static {v1, v0, v2}, LDD3;->d(I[BI)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LFd3;->f:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, LFd3;->g:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LFd3;->e:I

    return v0
.end method
