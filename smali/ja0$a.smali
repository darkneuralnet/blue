.class public final Lja0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDi1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LDi1<",
        "Lja0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroidx/camera/core/impl/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/camera/core/impl/m;->V()Landroidx/camera/core/impl/m;

    move-result-object v0

    iput-object v0, p0, Lja0$a;->a:Landroidx/camera/core/impl/m;

    return-void
.end method


# virtual methods
.method public a()Lja0;
    .locals 2

    new-instance v0, Lja0;

    iget-object v1, p0, Lja0$a;->a:Landroidx/camera/core/impl/m;

    invoke-static {v1}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v1

    invoke-direct {v0, v1}, Lja0;-><init>(Landroidx/camera/core/impl/f;)V

    return-object v0
.end method

.method public b()Landroidx/camera/core/impl/l;
    .locals 1

    iget-object v0, p0, Lja0$a;->a:Landroidx/camera/core/impl/m;

    return-object v0
.end method

.method public c(Landroidx/camera/core/impl/f;)Lja0$a;
    .locals 4

    invoke-interface {p1}, Landroidx/camera/core/impl/f;->g()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/f$a;

    iget-object v2, p0, Lja0$a;->a:Landroidx/camera/core/impl/m;

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lja0$a;"
        }
    .end annotation

    invoke-static {p1}, Lja0;->R(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/f$a;

    move-result-object p1

    iget-object v0, p0, Lja0$a;->a:Landroidx/camera/core/impl/m;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method
