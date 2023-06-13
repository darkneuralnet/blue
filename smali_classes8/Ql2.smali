.class public final LQl2;
.super LCH6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQl2$b;
    }
.end annotation


# instance fields
.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(LQl2$b;)V
    .locals 1

    invoke-direct {p0, p1}, LCH6;-><init>(LCH6$a;)V

    invoke-static {p1}, LQl2$b;->i(LQl2$b;)I

    move-result v0

    iput v0, p0, LQl2;->e:I

    invoke-static {p1}, LQl2$b;->j(LQl2$b;)I

    move-result v0

    iput v0, p0, LQl2;->f:I

    invoke-static {p1}, LQl2$b;->k(LQl2$b;)I

    move-result p1

    iput p1, p0, LQl2;->g:I

    return-void
.end method

.method public synthetic constructor <init>(LQl2$b;LQl2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LQl2;-><init>(LQl2$b;)V

    return-void
.end method


# virtual methods
.method public d()[B
    .locals 3

    invoke-super {p0}, LCH6;->d()[B

    move-result-object v0

    iget v1, p0, LQl2;->e:I

    const/16 v2, 0x10

    invoke-static {v1, v0, v2}, LDD3;->d(I[BI)V

    iget v1, p0, LQl2;->f:I

    const/16 v2, 0x14

    invoke-static {v1, v0, v2}, LDD3;->d(I[BI)V

    iget v1, p0, LQl2;->g:I

    const/16 v2, 0x18

    invoke-static {v1, v0, v2}, LDD3;->d(I[BI)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LQl2;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, LQl2;->f:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LQl2;->g:I

    return v0
.end method
