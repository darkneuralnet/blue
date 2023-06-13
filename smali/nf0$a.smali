.class public final Lnf0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDi1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnf0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LDi1<",
        "Lnf0;",
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

    iput-object v0, p0, Lnf0$a;->a:Landroidx/camera/core/impl/m;

    return-void
.end method

.method public static synthetic a(Lnf0$a;Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f$a;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lnf0$a;->f(Lnf0$a;Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f$a;)Z

    move-result p0

    return p0
.end method

.method public static e(Landroidx/camera/core/impl/f;)Lnf0$a;
    .locals 3

    new-instance v0, Lnf0$a;

    invoke-direct {v0}, Lnf0$a;-><init>()V

    new-instance v1, Lmf0;

    invoke-direct {v1, v0, p0}, Lmf0;-><init>(Lnf0$a;Landroidx/camera/core/impl/f;)V

    const-string v2, "camera2.captureRequest.option."

    invoke-interface {p0, v2, v1}, Landroidx/camera/core/impl/f;->b(Ljava/lang/String;Landroidx/camera/core/impl/f$b;)V

    return-object v0
.end method

.method public static synthetic f(Lnf0$a;Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f$a;)Z
    .locals 1

    invoke-virtual {p0}, Lnf0$a;->b()Landroidx/camera/core/impl/l;

    move-result-object p0

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/f;->h(Landroidx/camera/core/impl/f$a;)Landroidx/camera/core/impl/f$c;

    move-result-object v0

    invoke-interface {p1, p2}, Landroidx/camera/core/impl/f;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p2, v0, p1}, Landroidx/camera/core/impl/l;->n(Landroidx/camera/core/impl/f$a;Landroidx/camera/core/impl/f$c;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public b()Landroidx/camera/core/impl/l;
    .locals 1

    iget-object v0, p0, Lnf0$a;->a:Landroidx/camera/core/impl/m;

    return-object v0
.end method

.method public c()Lnf0;
    .locals 2

    new-instance v0, Lnf0;

    iget-object v1, p0, Lnf0$a;->a:Landroidx/camera/core/impl/m;

    invoke-static {v1}, Landroidx/camera/core/impl/n;->T(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/n;

    move-result-object v1

    invoke-direct {v0, v1}, Lnf0;-><init>(Landroidx/camera/core/impl/f;)V

    return-object v0
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lnf0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Lnf0$a;"
        }
    .end annotation

    invoke-static {p1}, Lja0;->R(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/f$a;

    move-result-object p1

    iget-object v0, p0, Lnf0$a;->a:Landroidx/camera/core/impl/m;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/m;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-object p0
.end method
