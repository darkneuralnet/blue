.class public LBx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBx$a;
    }
.end annotation


# instance fields
.field public final a:Lxy;

.field public final b:Landroid/graphics/Rect;

.field public final c:[Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Lxy;Landroid/graphics/Matrix;)V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxy;

    iput-object v0, p0, LBx;->a:Lxy;

    invoke-interface {p1}, Lxy;->d()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-static {v0, p2}, Lsp0;->e(Landroid/graphics/Rect;Landroid/graphics/Matrix;)V

    :cond_0
    iput-object v0, p0, LBx;->b:Landroid/graphics/Rect;

    invoke-interface {p1}, Lxy;->f()[Landroid/graphics/Point;

    move-result-object p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lsp0;->b([Landroid/graphics/Point;Landroid/graphics/Matrix;)V

    :cond_1
    iput-object p1, p0, LBx;->c:[Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, LBx;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBx;->a:Lxy;

    invoke-interface {v0}, Lxy;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()LBx$a;
    .locals 1

    iget-object v0, p0, LBx;->a:Lxy;

    invoke-interface {v0}, Lxy;->c()LBx$a;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    iget-object v0, p0, LBx;->a:Lxy;

    invoke-interface {v0}, Lxy;->getFormat()I

    move-result v0

    const/16 v1, 0x1000

    const/4 v2, -0x1

    if-gt v0, v1, :cond_0

    if-nez v0, :cond_1

    return v2

    :cond_0
    move v0, v2

    :cond_1
    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LBx;->a:Lxy;

    invoke-interface {v0}, Lxy;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, LBx;->a:Lxy;

    invoke-interface {v0}, Lxy;->b()I

    move-result v0

    return v0
.end method
