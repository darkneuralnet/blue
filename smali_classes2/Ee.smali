.class public LEe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# instance fields
.field public final a:Lve;

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

.field public final c:Lye;

.field public final d:Lqe;

.field public final e:Lse;

.field public final f:Lqe;

.field public final g:Lqe;

.field public final h:Lqe;

.field public final i:Lqe;


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, LEe;-><init>(Lve;LGe;Lye;Lqe;Lse;Lqe;Lqe;Lqe;Lqe;)V

    return-void
.end method

.method public constructor <init>(Lve;LGe;Lye;Lqe;Lse;Lqe;Lqe;Lqe;Lqe;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve;",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lye;",
            "Lqe;",
            "Lse;",
            "Lqe;",
            "Lqe;",
            "Lqe;",
            "Lqe;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEe;->a:Lve;

    iput-object p2, p0, LEe;->b:LGe;

    iput-object p3, p0, LEe;->c:Lye;

    iput-object p4, p0, LEe;->d:Lqe;

    iput-object p5, p0, LEe;->e:Lse;

    iput-object p6, p0, LEe;->h:Lqe;

    iput-object p7, p0, LEe;->i:Lqe;

    iput-object p8, p0, LEe;->f:Lqe;

    iput-object p9, p0, LEe;->g:Lqe;

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lm96;
    .locals 1

    new-instance v0, Lm96;

    invoke-direct {v0, p0}, Lm96;-><init>(LEe;)V

    return-object v0
.end method

.method public c()Lve;
    .locals 1

    iget-object v0, p0, LEe;->a:Lve;

    return-object v0
.end method

.method public d()Lqe;
    .locals 1

    iget-object v0, p0, LEe;->i:Lqe;

    return-object v0
.end method

.method public e()Lse;
    .locals 1

    iget-object v0, p0, LEe;->e:Lse;

    return-object v0
.end method

.method public f()LGe;
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

    iget-object v0, p0, LEe;->b:LGe;

    return-object v0
.end method

.method public g()Lqe;
    .locals 1

    iget-object v0, p0, LEe;->d:Lqe;

    return-object v0
.end method

.method public h()Lye;
    .locals 1

    iget-object v0, p0, LEe;->c:Lye;

    return-object v0
.end method

.method public i()Lqe;
    .locals 1

    iget-object v0, p0, LEe;->f:Lqe;

    return-object v0
.end method

.method public j()Lqe;
    .locals 1

    iget-object v0, p0, LEe;->g:Lqe;

    return-object v0
.end method

.method public k()Lqe;
    .locals 1

    iget-object v0, p0, LEe;->h:Lqe;

    return-object v0
.end method
