.class public LXX3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXX3$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LXX3$a;

.field public final c:Lqe;

.field public final d:LGe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lqe;

.field public final f:Lqe;

.field public final g:Lqe;

.field public final h:Lqe;

.field public final i:Lqe;

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LXX3$a;Lqe;LGe;Lqe;Lqe;Lqe;Lqe;Lqe;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LXX3$a;",
            "Lqe;",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lqe;",
            "Lqe;",
            "Lqe;",
            "Lqe;",
            "Lqe;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXX3;->a:Ljava/lang/String;

    iput-object p2, p0, LXX3;->b:LXX3$a;

    iput-object p3, p0, LXX3;->c:Lqe;

    iput-object p4, p0, LXX3;->d:LGe;

    iput-object p5, p0, LXX3;->e:Lqe;

    iput-object p6, p0, LXX3;->f:Lqe;

    iput-object p7, p0, LXX3;->g:Lqe;

    iput-object p8, p0, LXX3;->h:Lqe;

    iput-object p9, p0, LXX3;->i:Lqe;

    iput-boolean p10, p0, LXX3;->j:Z

    iput-boolean p11, p0, LXX3;->k:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, LWX3;

    invoke-direct {p2, p1, p3, p0}, LWX3;-><init>(LRD2;LqB;LXX3;)V

    return-object p2
.end method

.method public b()Lqe;
    .locals 1

    iget-object v0, p0, LXX3;->f:Lqe;

    return-object v0
.end method

.method public c()Lqe;
    .locals 1

    iget-object v0, p0, LXX3;->h:Lqe;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LXX3;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lqe;
    .locals 1

    iget-object v0, p0, LXX3;->g:Lqe;

    return-object v0
.end method

.method public f()Lqe;
    .locals 1

    iget-object v0, p0, LXX3;->i:Lqe;

    return-object v0
.end method

.method public g()Lqe;
    .locals 1

    iget-object v0, p0, LXX3;->c:Lqe;

    return-object v0
.end method

.method public h()LGe;
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

    iget-object v0, p0, LXX3;->d:LGe;

    return-object v0
.end method

.method public i()Lqe;
    .locals 1

    iget-object v0, p0, LXX3;->e:Lqe;

    return-object v0
.end method

.method public j()LXX3$a;
    .locals 1

    iget-object v0, p0, LXX3;->b:LXX3$a;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, LXX3;->j:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, LXX3;->k:Z

    return v0
.end method
