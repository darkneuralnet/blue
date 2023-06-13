.class public Lr64;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq64;


# instance fields
.field public final a:Landroidx/camera/lifecycle/b;


# direct methods
.method public constructor <init>(Landroidx/camera/lifecycle/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr64;->a:Landroidx/camera/lifecycle/b;

    return-void
.end method


# virtual methods
.method public a(Lic0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/CameraInfoUnavailableException;
        }
    .end annotation

    iget-object v0, p0, Lr64;->a:Landroidx/camera/lifecycle/b;

    invoke-virtual {v0, p1}, Landroidx/camera/lifecycle/b;->j(Lic0;)Z

    move-result p1

    return p1
.end method

.method public varargs b([Landroidx/camera/core/p;)V
    .locals 1

    iget-object v0, p0, Lr64;->a:Landroidx/camera/lifecycle/b;

    invoke-virtual {v0, p1}, Landroidx/camera/lifecycle/b;->q([Landroidx/camera/core/p;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lr64;->a:Landroidx/camera/lifecycle/b;

    invoke-virtual {v0}, Landroidx/camera/lifecycle/b;->r()V

    return-void
.end method

.method public d(LLifecycleOwner;Lic0;LYf6;)Lna0;
    .locals 1

    iget-object v0, p0, Lr64;->a:Landroidx/camera/lifecycle/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/camera/lifecycle/b;->d(LLifecycleOwner;Lic0;LYf6;)Lna0;

    move-result-object p1

    return-object p1
.end method
