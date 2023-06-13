.class public final Lgc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LBY5;


# direct methods
.method public constructor <init>(Ljava/util/List;LBY5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;",
            "LBY5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc0;->a:Ljava/util/List;

    iput-object p2, p0, Lgc0;->b:LBY5;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgc0;->a:Ljava/util/List;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lgc0;->b:LBY5;

    invoke-interface {v0}, LBY5;->c()Z

    move-result v0

    return v0
.end method
