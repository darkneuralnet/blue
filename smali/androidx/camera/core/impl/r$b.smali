.class public final Landroidx/camera/core/impl/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroidx/camera/core/impl/q;

.field public final b:Landroidx/camera/core/impl/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/q;",
            "Landroidx/camera/core/impl/s<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/impl/r$b;->c:Z

    iput-boolean v0, p0, Landroidx/camera/core/impl/r$b;->d:Z

    iput-object p1, p0, Landroidx/camera/core/impl/r$b;->a:Landroidx/camera/core/impl/q;

    iput-object p2, p0, Landroidx/camera/core/impl/r$b;->b:Landroidx/camera/core/impl/s;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/r$b;->d:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/r$b;->c:Z

    return v0
.end method

.method public c()Landroidx/camera/core/impl/q;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/r$b;->a:Landroidx/camera/core/impl/q;

    return-object v0
.end method

.method public d()Landroidx/camera/core/impl/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/r$b;->b:Landroidx/camera/core/impl/s;

    return-object v0
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/impl/r$b;->d:Z

    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/impl/r$b;->c:Z

    return-void
.end method
