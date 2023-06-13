.class public final Landroidx/camera/core/impl/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/d$a;,
        Landroidx/camera/core/impl/d$b;
    }
.end annotation


# static fields
.field public static final i:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroidx/camera/core/impl/f;

.field public final c:I

.field public final d:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Z

.field public final g:LxY5;

.field public final h:Lxa0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.captureConfig.rotation"

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/d;->i:Landroidx/camera/core/impl/f$a;

    const-string v0, "camerax.core.captureConfig.jpegQuality"

    const-class v1, Ljava/lang/Integer;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/d;->j:Landroidx/camera/core/impl/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Landroidx/camera/core/impl/f;ILandroid/util/Range;Ljava/util/List;ZLxY5;Lxa0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;",
            "Landroidx/camera/core/impl/f;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Lpa0;",
            ">;Z",
            "LxY5;",
            "Lxa0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/d;->a:Ljava/util/List;

    iput-object p2, p0, Landroidx/camera/core/impl/d;->b:Landroidx/camera/core/impl/f;

    iput p3, p0, Landroidx/camera/core/impl/d;->c:I

    iput-object p4, p0, Landroidx/camera/core/impl/d;->d:Landroid/util/Range;

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/d;->e:Ljava/util/List;

    iput-boolean p6, p0, Landroidx/camera/core/impl/d;->f:Z

    iput-object p7, p0, Landroidx/camera/core/impl/d;->g:LxY5;

    iput-object p8, p0, Landroidx/camera/core/impl/d;->h:Lxa0;

    return-void
.end method

.method public static a()Landroidx/camera/core/impl/d;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/d$a;

    invoke-direct {v0}, Landroidx/camera/core/impl/d$a;-><init>()V

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpa0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/d;->e:Ljava/util/List;

    return-object v0
.end method

.method public c()Lxa0;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d;->h:Lxa0;

    return-object v0
.end method

.method public d()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/d;->d:Landroid/util/Range;

    return-object v0
.end method

.method public e()Landroidx/camera/core/impl/f;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d;->b:Landroidx/camera/core/impl/f;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/d;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public g()LxY5;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/d;->g:LxY5;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/impl/d;->c:I

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/d;->f:Z

    return v0
.end method
