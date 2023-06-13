.class public LkW2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LkW2$a;,
        LkW2$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0017\u0008\u0017\u0018\u00002\u00020\u0001:\u0002\u0005\u0008B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0008\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000fR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u0015\u001a\u0004\u0008\u001c\u0010\u0017\"\u0004\u0008\u001d\u0010\u0019R(\u0010$\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R(\u0010\'\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008%\u0010!\u001a\u0004\u0008&\u0010#\u00a8\u0006*"
    }
    d2 = {
        "LkW2;",
        "",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "a",
        "",
        "c",
        "b",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LkW2$a;",
        "LkW2$a;",
        "listener",
        "Z",
        "gestureInProgress",
        "d",
        "detectionInProgress",
        "",
        "e",
        "Ljava/lang/Float;",
        "getLastDistanceX",
        "()Ljava/lang/Float;",
        "setLastDistanceX",
        "(Ljava/lang/Float;)V",
        "lastDistanceX",
        "f",
        "getLastDistanceY",
        "setLastDistanceY",
        "lastDistanceY",
        "<set-?>",
        "g",
        "Landroid/view/MotionEvent;",
        "getFirstMotionEvent",
        "()Landroid/view/MotionEvent;",
        "firstMotionEvent",
        "h",
        "getCurrentMotionEvent",
        "currentMotionEvent",
        "<init>",
        "(Landroid/content/Context;LkW2$a;)V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LkW2$a;

.field public c:Z

.field public d:Z

.field public e:Ljava/lang/Float;

.field public f:Ljava/lang/Float;

.field public g:Landroid/view/MotionEvent;

.field public h:Landroid/view/MotionEvent;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LkW2$a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkW2;->a:Landroid/content/Context;

    iput-object p2, p0, LkW2;->b:LkW2$a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Z
    .locals 9

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_2

    iget-boolean v0, p0, LkW2;->c:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LkW2;->d:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, LkW2;->b:LkW2$a;

    invoke-interface {v0, p0, p1}, LkW2$a;->b(LkW2;Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, LkW2;->b()V

    return v2

    :cond_2
    iget-boolean v0, p0, LkW2;->c:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, LkW2;->d:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p0, p1}, LkW2;->c(Landroid/view/MotionEvent;)V

    iput-boolean v2, p0, LkW2;->d:Z

    goto :goto_5

    :cond_4
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eq v0, v2, :cond_a

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_a

    const/4 v3, 0x5

    if-eq v0, v3, :cond_a

    goto :goto_5

    :cond_5
    invoke-virtual {p0, p1}, LkW2;->c(Landroid/view/MotionEvent;)V

    iget-boolean v0, p0, LkW2;->d:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, LkW2;->e:Ljava/lang/Float;

    const/4 v4, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_2

    :cond_6
    move v0, v4

    :goto_2
    float-to-double v5, v0

    int-to-double v7, v3

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float v0, v5

    iget-object v3, p0, LkW2;->f:Ljava/lang/Float;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v4

    :cond_7
    float-to-double v3, v4

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    add-float/2addr v0, v3

    const/high16 v3, 0x447a0000    # 1000.0f

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_8

    iput-boolean v1, p0, LkW2;->d:Z

    iput-boolean v2, p0, LkW2;->c:Z

    iget-object v0, p0, LkW2;->b:LkW2$a;

    invoke-interface {v0, p0, p1}, LkW2$a;->c(LkW2;Landroid/view/MotionEvent;)Z

    goto :goto_3

    :cond_8
    return v1

    :cond_9
    :goto_3
    iget-object v0, p0, LkW2;->b:LkW2$a;

    invoke-interface {v0, p0, p1}, LkW2$a;->a(LkW2;Landroid/view/MotionEvent;)Z

    goto :goto_4

    :cond_a
    invoke-virtual {p0}, LkW2;->b()V

    iget-object v0, p0, LkW2;->b:LkW2$a;

    invoke-interface {v0, p0, p1}, LkW2$a;->b(LkW2;Landroid/view/MotionEvent;)V

    :goto_4
    move v1, v2

    :cond_b
    :goto_5
    return v1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LkW2;->h:Landroid/view/MotionEvent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LkW2;->h:Landroid/view/MotionEvent;

    iget-object v1, p0, LkW2;->g:Landroid/view/MotionEvent;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_1
    iput-object v0, p0, LkW2;->g:Landroid/view/MotionEvent;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, LkW2;->e:Ljava/lang/Float;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, LkW2;->f:Ljava/lang/Float;

    const/4 v0, 0x0

    iput-boolean v0, p0, LkW2;->c:Z

    iput-boolean v0, p0, LkW2;->d:Z

    return-void
.end method

.method public final c(Landroid/view/MotionEvent;)V
    .locals 3

    iget-object v0, p0, LkW2;->g:Landroid/view/MotionEvent;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, LkW2;->g:Landroid/view/MotionEvent;

    :cond_0
    iget-object v0, p0, LkW2;->h:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_1
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, LkW2;->h:Landroid/view/MotionEvent;

    iget-object v0, p0, LkW2;->g:Landroid/view/MotionEvent;

    if-nez v0, :cond_2

    return-void

    :cond_2
    if-nez p1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, p0, LkW2;->e:Ljava/lang/Float;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, LkW2;->f:Ljava/lang/Float;

    return-void
.end method
