.class public abstract LAx;
.super LRS0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LAx$a;
    }
.end annotation


# instance fields
.field public g:LAx$a;


# direct methods
.method public constructor <init>(Lhi0;LFs6;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRS0;-><init>(Lhi0;LFs6;)V

    new-instance p1, LAx$a;

    invoke-direct {p1, p0}, LAx$a;-><init>(LAx;)V

    iput-object p1, p0, LAx;->g:LAx$a;

    return-void
.end method


# virtual methods
.method public h(Lcom/github/mikephil/charting/data/Entry;LYN1;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p2, p1}, LoO1;->b(Lcom/github/mikephil/charting/data/Entry;)I

    move-result p1

    int-to-float p1, p1

    invoke-interface {p2}, LoO1;->L0()I

    move-result p2

    int-to-float p2, p2

    iget-object v1, p0, LRS0;->b:Lhi0;

    invoke-virtual {v1}, Lhi0;->a()F

    move-result v1

    mul-float/2addr p2, v1

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public i(LoO1;)Z
    .locals 1

    invoke-interface {p1}, LoO1;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LoO1;->i0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LoO1;->D()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
