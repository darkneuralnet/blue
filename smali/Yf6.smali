.class public final LYf6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYf6$a;
    }
.end annotation


# instance fields
.field public final a:LEs6;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lyb0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEs6;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEs6;",
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;",
            "Ljava/util/List<",
            "Lyb0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYf6;->a:LEs6;

    iput-object p2, p0, LYf6;->b:Ljava/util/List;

    iput-object p3, p0, LYf6;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lyb0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYf6;->c:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYf6;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()LEs6;
    .locals 1

    iget-object v0, p0, LYf6;->a:LEs6;

    return-object v0
.end method
