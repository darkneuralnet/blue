.class public final Landroidx/camera/core/impl/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/s;
.implements Landroidx/camera/core/impl/k;
.implements LW92;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/s<",
        "Landroidx/camera/core/h;",
        ">;",
        "Landroidx/camera/core/impl/k;",
        "LW92;"
    }
.end annotation


# static fields
.field public static final F:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final H:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LZe0;",
            ">;"
        }
    .end annotation
.end field

.field public static final I:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LLX1;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final M:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final N:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Landroidx/camera/core/impl/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.imageCapture.captureMode"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->F:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.flashMode"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->G:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.captureBundle"

    const-class v2, LZe0;

    invoke-static {v1, v2}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->H:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.bufferFormat"

    const-class v2, Ljava/lang/Integer;

    invoke-static {v1, v2}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->I:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.maxCaptureStages"

    invoke-static {v1, v2}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->J:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.imageReaderProxyProvider"

    const-class v2, LLX1;

    invoke-static {v1, v2}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->K:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.useSoftwareJpegEncoder"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v2}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->L:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.flashType"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/i;->M:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageCapture.jpegCompressionQuality"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/i;->N:Landroidx/camera/core/impl/f$a;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/i;->E:Landroidx/camera/core/impl/n;

    return-void
.end method


# virtual methods
.method public B()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/i;->E:Landroidx/camera/core/impl/n;

    return-object v0
.end method

.method public R(Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->I:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public S(LZe0;)LZe0;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->H:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LZe0;

    return-object p1
.end method

.method public T()I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->F:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public U(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->G:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public V(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->M:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public W()LLX1;
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/i;->K:Landroidx/camera/core/impl/f$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLX1;

    return-object v0
.end method

.method public X(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, LW92;->a:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public Y()I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->N:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public Z()Z
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/i;->F:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    return v0
.end method

.method public a0()Z
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/i;->L:Landroidx/camera/core/impl/f$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public l()I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/j;->k:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
