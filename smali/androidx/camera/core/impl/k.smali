.class public interface abstract Landroidx/camera/core/impl/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/k$a;
    }
.end annotation


# static fields
.field public static final l:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public static final q:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public static final s:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public static final t:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Landroidx/camera/core/m;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "camerax.core.imageOutput.targetAspectRatio"

    const-class v1, LHo;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->l:Landroidx/camera/core/impl/f$a;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.imageOutput.targetRotation"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageOutput.appTargetRotation"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v1

    sput-object v1, Landroidx/camera/core/impl/k;->n:Landroidx/camera/core/impl/f$a;

    const-string v1, "camerax.core.imageOutput.mirrorMode"

    invoke-static {v1, v0}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->o:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.imageOutput.targetResolution"

    const-class v1, Landroid/util/Size;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.imageOutput.defaultResolution"

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->q:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.imageOutput.maxResolution"

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->r:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.imageOutput.supportedResolutions"

    const-class v1, Ljava/util/List;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->s:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.imageOutput.resolutionSelector"

    const-class v2, Landroidx/camera/core/m;

    invoke-static {v0, v2}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->t:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.imageOutput.customOrderedResolutions"

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/k;->u:Landroidx/camera/core/impl/f$a;

    return-void
.end method

.method public static F(Landroidx/camera/core/impl/k;)V
    .locals 3

    invoke-interface {p0}, Landroidx/camera/core/impl/k;->G()Z

    move-result v0

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/k;->u(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot use both setTargetResolution and setTargetAspectRatio on the same config."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-interface {p0, v1}, Landroidx/camera/core/impl/k;->z(Landroidx/camera/core/m;)Landroidx/camera/core/m;

    move-result-object p0

    if-eqz p0, :cond_4

    if-nez v0, :cond_3

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public A()Landroidx/camera/core/m;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->t:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/m;

    return-object v0
.end method

.method public G()Z
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->l:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->e(Landroidx/camera/core/impl/f$a;)Z

    move-result v0

    return v0
.end method

.method public I()I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->l:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/p;->a(Landroidx/camera/core/impl/f$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public J(Landroid/util/Size;)Landroid/util/Size;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->q:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method public i(Landroid/util/Size;)Landroid/util/Size;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->r:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method public k(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/impl/k;->s:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public p(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->n:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public s(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->m:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public t(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/impl/k;->u:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public u(Landroid/util/Size;)Landroid/util/Size;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->p:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method public y(I)I
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->o:Landroidx/camera/core/impl/f$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public z(Landroidx/camera/core/m;)Landroidx/camera/core/m;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/k;->t:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/m;

    return-object p1
.end method
