.class public LYs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LGe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LGe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lqe;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LGe;LGe;Lqe;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lqe;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYs4;->a:Ljava/lang/String;

    iput-object p2, p0, LYs4;->b:LGe;

    iput-object p3, p0, LYs4;->c:LGe;

    iput-object p4, p0, LYs4;->d:Lqe;

    iput-boolean p5, p0, LYs4;->e:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, LUs4;

    invoke-direct {p2, p1, p3, p0}, LUs4;-><init>(LRD2;LqB;LYs4;)V

    return-object p2
.end method

.method public b()Lqe;
    .locals 1

    iget-object v0, p0, LYs4;->d:Lqe;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYs4;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()LGe;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYs4;->b:LGe;

    return-object v0
.end method

.method public e()LGe;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYs4;->c:LGe;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, LYs4;->e:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RectangleShape{position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYs4;->b:LGe;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYs4;->c:LGe;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
