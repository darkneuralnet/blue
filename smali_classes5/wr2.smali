.class public abstract Lwr2;
.super Lyr2;
.source "SourceFile"

# interfaces
.implements LNO1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">",
        "Lyr2<",
        "TT;>;",
        "LNO1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public C:I

.field public D:Landroid/graphics/drawable/Drawable;

.field public E:I

.field public F:F

.field public G:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lyr2;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/16 p1, 0xea

    const/16 p2, 0xff

    const/16 v0, 0x8c

    invoke-static {v0, p1, p2}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iput p1, p0, Lwr2;->C:I

    const/16 p1, 0x55

    iput p1, p0, Lwr2;->E:I

    const/high16 p1, 0x40200000    # 2.5f

    iput p1, p0, Lwr2;->F:F

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwr2;->G:Z

    return-void
.end method


# virtual methods
.method public T()I
    .locals 1

    iget v0, p0, Lwr2;->E:I

    return v0
.end method

.method public W()F
    .locals 1

    iget v0, p0, Lwr2;->F:F

    return v0
.end method

.method public Z0(F)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lwr2;->F:F

    return-void
.end method

.method public f()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lwr2;->D:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public x0()Z
    .locals 1

    iget-boolean v0, p0, Lwr2;->G:Z

    return v0
.end method

.method public y()I
    .locals 1

    iget v0, p0, Lwr2;->C:I

    return v0
.end method
