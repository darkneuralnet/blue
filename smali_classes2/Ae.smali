.class public LAe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGe;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGe<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lqe;

.field public final b:Lqe;


# direct methods
.method public constructor <init>(Lqe;Lqe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAe;->a:Lqe;

    iput-object p2, p0, LAe;->b:Lqe;

    return-void
.end method


# virtual methods
.method public a()LoB;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LoB<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    new-instance v0, LbO5;

    iget-object v1, p0, LAe;->a:Lqe;

    invoke-virtual {v1}, Lqe;->a()LoB;

    move-result-object v1

    iget-object v2, p0, LAe;->b:Lqe;

    invoke-virtual {v2}, Lqe;->a()LoB;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LbO5;-><init>(LoB;LoB;)V

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lfl2<",
            "Landroid/graphics/PointF;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isStatic()Z
    .locals 1

    iget-object v0, p0, LAe;->a:Lqe;

    invoke-virtual {v0}, Lqe;->isStatic()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LAe;->b:Lqe;

    invoke-virtual {v0}, Lqe;->isStatic()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
