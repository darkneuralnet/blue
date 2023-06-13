.class public interface abstract Landroidx/camera/core/impl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/p;


# static fields
.field public static final f:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LVf6;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "LiW1;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Lyv5;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.camera.useCaseConfigFactory"

    const-class v1, LVf6;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c;->f:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.camera.compatibilityId"

    const-class v1, LiW1;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c;->g:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.camera.useCaseCombinationRequiredRule"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c;->h:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.camera.SessionProcessor"

    const-class v1, Lyv5;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c;->i:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.camera.isZslDisabled"

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c;->j:Landroidx/camera/core/impl/f$a;

    return-void
.end method


# virtual methods
.method public E()I
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/c;->h:Landroidx/camera/core/impl/f$a;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public Q(Lyv5;)Lyv5;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c;->i:Landroidx/camera/core/impl/f$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyv5;

    return-object p1
.end method

.method public j()LVf6;
    .locals 2

    sget-object v0, Landroidx/camera/core/impl/c;->f:Landroidx/camera/core/impl/f$a;

    sget-object v1, LVf6;->a:LVf6;

    invoke-interface {p0, v0, v1}, Landroidx/camera/core/impl/p;->d(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVf6;

    return-object v0
.end method

.method public abstract v()LiW1;
.end method
