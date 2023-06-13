.class public Lzj0;
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

.field public final c:Lxe;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;LGe;Lxe;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LGe<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lxe;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzj0;->a:Ljava/lang/String;

    iput-object p2, p0, Lzj0;->b:LGe;

    iput-object p3, p0, Lzj0;->c:Lxe;

    iput-boolean p4, p0, Lzj0;->d:Z

    iput-boolean p5, p0, Lzj0;->e:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, Lpa1;

    invoke-direct {p2, p1, p3, p0}, Lpa1;-><init>(LRD2;LqB;Lzj0;)V

    return-object p2
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()LGe;
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

    iget-object v0, p0, Lzj0;->b:LGe;

    return-object v0
.end method

.method public d()Lxe;
    .locals 1

    iget-object v0, p0, Lzj0;->c:Lxe;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lzj0;->e:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lzj0;->d:Z

    return v0
.end method
