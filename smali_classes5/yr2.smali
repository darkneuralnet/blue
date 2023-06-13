.class public abstract Lyr2;
.super Lzx;
.source "SourceFile"

# interfaces
.implements LOO1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/github/mikephil/charting/data/Entry;",
        ">",
        "Lzx<",
        "TT;>;",
        "LOO1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public A:F

.field public B:Landroid/graphics/DashPathEffect;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lzx;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lyr2;->y:Z

    iput-boolean p1, p0, Lyr2;->z:Z

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lyr2;->A:F

    const/4 p2, 0x0

    iput-object p2, p0, Lyr2;->B:Landroid/graphics/DashPathEffect;

    invoke-static {p1}, LOi6;->e(F)F

    move-result p1

    iput p1, p0, Lyr2;->A:F

    return-void
.end method


# virtual methods
.method public E0()Landroid/graphics/DashPathEffect;
    .locals 1

    iget-object v0, p0, Lyr2;->B:Landroid/graphics/DashPathEffect;

    return-object v0
.end method

.method public O0()Z
    .locals 1

    iget-boolean v0, p0, Lyr2;->z:Z

    return v0
.end method

.method public r0()F
    .locals 1

    iget v0, p0, Lyr2;->A:F

    return v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lyr2;->y:Z

    return v0
.end method
