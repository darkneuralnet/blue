.class public final Landroidx/camera/view/PreviewView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/PreviewView$d;,
        Landroidx/camera/view/PreviewView$h;,
        Landroidx/camera/view/PreviewView$c;,
        Landroidx/camera/view/PreviewView$g;,
        Landroidx/camera/view/PreviewView$f;,
        Landroidx/camera/view/PreviewView$e;
    }
.end annotation


# static fields
.field public static final q:Landroidx/camera/view/PreviewView$d;


# instance fields
.field public b:Landroidx/camera/view/PreviewView$d;

.field public c:Landroidx/camera/view/c;

.field public final d:Landroidx/camera/view/b;

.field public e:Z

.field public final f:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Landroidx/camera/view/PreviewView$h;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/camera/view/a;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljb0;

.field public i:Ljava/util/concurrent/Executor;

.field public j:Lm24;

.field public final k:Landroid/view/ScaleGestureDetector;

.field public l:LKb0;

.field public m:Landroid/view/MotionEvent;

.field public final n:Landroidx/camera/view/PreviewView$c;

.field public final o:Landroid/view/View$OnLayoutChangeListener;

.field public final p:Landroidx/camera/core/l$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/camera/view/PreviewView$d;->c:Landroidx/camera/view/PreviewView$d;

    sput-object v0, Landroidx/camera/view/PreviewView;->q:Landroidx/camera/view/PreviewView$d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 10

    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    sget-object v0, Landroidx/camera/view/PreviewView;->q:Landroidx/camera/view/PreviewView$d;

    iput-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/PreviewView$d;

    new-instance v1, Landroidx/camera/view/b;

    invoke-direct {v1}, Landroidx/camera/view/b;-><init>()V

    iput-object v1, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    const/4 v2, 0x1

    iput-boolean v2, p0, Landroidx/camera/view/PreviewView;->e:Z

    new-instance v2, LuX2;

    sget-object v3, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    invoke-direct {v2, v3}, LuX2;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->f:LuX2;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lm24;

    invoke-direct {v2, v1}, Lm24;-><init>(Landroidx/camera/view/b;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->j:Lm24;

    new-instance v2, Landroidx/camera/view/PreviewView$c;

    invoke-direct {v2, p0}, Landroidx/camera/view/PreviewView$c;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->n:Landroidx/camera/view/PreviewView$c;

    new-instance v2, Lh24;

    invoke-direct {v2, p0}, Lh24;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->o:Landroid/view/View$OnLayoutChangeListener;

    new-instance v2, Landroidx/camera/view/PreviewView$a;

    invoke-direct {v2, p0}, Landroidx/camera/view/PreviewView$a;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/core/l$c;

    invoke-static {}, LO36;->a()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v5, LTl4;->PreviewView:[I

    invoke-virtual {v2, p2, v5, p3, p4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move-object v7, v2

    move v8, p3

    move v9, p4

    invoke-static/range {v3 .. v9}, Lbq6;->t0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :try_start_0
    sget p2, LTl4;->PreviewView_scaleType:I

    invoke-virtual {v1}, Landroidx/camera/view/b;->f()Landroidx/camera/view/PreviewView$g;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/camera/view/PreviewView$g;->c()I

    move-result p3

    invoke-virtual {v2, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Landroidx/camera/view/PreviewView$g;->b(I)Landroidx/camera/view/PreviewView$g;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/camera/view/PreviewView;->setScaleType(Landroidx/camera/view/PreviewView$g;)V

    sget p2, LTl4;->PreviewView_implementationMode:I

    invoke-virtual {v0}, Landroidx/camera/view/PreviewView$d;->c()I

    move-result p3

    invoke-virtual {v2, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Landroidx/camera/view/PreviewView$d;->b(I)Landroidx/camera/view/PreviewView$d;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/camera/view/PreviewView;->setImplementationMode(Landroidx/camera/view/PreviewView$d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p2, Landroid/view/ScaleGestureDetector;

    new-instance p3, Landroidx/camera/view/PreviewView$f;

    invoke-direct {p3, p0}, Landroidx/camera/view/PreviewView$f;-><init>(Landroidx/camera/view/PreviewView;)V

    invoke-direct {p2, p1, p3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p2, p0, Landroidx/camera/view/PreviewView;->k:Landroid/view/ScaleGestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x106000c

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public static synthetic a(Landroidx/camera/view/PreviewView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Landroidx/camera/view/PreviewView;->k(Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method private synthetic k(Landroid/view/View;IIIIIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p8, p6

    const/4 p1, 0x1

    if-ne p4, p8, :cond_1

    sub-int/2addr p5, p3

    sub-int/2addr p9, p7

    if-eq p5, p9, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p2, p1

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->l()V

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->b(Z)V

    :cond_2
    return-void
.end method

.method public static m(Landroidx/camera/view/c;Landroidx/camera/core/o;Landroidx/camera/view/PreviewView$d;)Z
    .locals 0

    instance-of p0, p0, Landroidx/camera/view/d;

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Landroidx/camera/view/PreviewView;->n(Landroidx/camera/core/o;Landroidx/camera/view/PreviewView$d;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(Landroidx/camera/core/o;Landroidx/camera/view/PreviewView$d;)Z
    .locals 5

    invoke-virtual {p0}, Landroidx/camera/core/o;->k()LLb0;

    move-result-object p0

    invoke-interface {p0}, LLb0;->d()LKb0;

    move-result-object p0

    invoke-interface {p0}, LJb0;->o()Ljava/lang/String;

    move-result-object p0

    const-string v0, "androidx.camera.camera2.legacy"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const-class v0, LsW5;

    invoke-static {v0}, LR21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const-class v0, LrW5;

    invoke-static {v0}, LR21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-le v3, v4, :cond_4

    if-nez p0, :cond_4

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget-object p0, Landroidx/camera/view/PreviewView$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p0, p0, v0

    if-eq p0, v2, :cond_4

    const/4 v0, 0x2

    if-ne p0, v0, :cond_3

    return v1

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid implementation mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    return v2
.end method


# virtual methods
.method public final b(Z)V
    .locals 3

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->h()LEs6;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->g()Landroidx/camera/core/l$c;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljb0;->d(Landroidx/camera/core/l$c;LEs6;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    if-eqz p1, :cond_0

    const-string p1, "PreviewView"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, LJx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()Landroid/hardware/display/DisplayManager;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    return-object v0
.end method

.method public d()LST2;
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->j:Lm24;

    return-object v0
.end method

.method public e()LjA3;
    .locals 5

    invoke-static {}, LO36;->a()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    new-instance v2, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroidx/camera/view/b;->h(Landroid/util/Size;I)Landroid/graphics/Matrix;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v2}, Landroidx/camera/view/b;->g()Landroid/graphics/Rect;

    move-result-object v2

    const-string v3, "PreviewView"

    if-eqz v1, :cond_3

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {v2}, Lp96;->a(Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    instance-of v0, v0, Landroidx/camera/view/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly."

    invoke-static {v3, v0}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    new-instance v0, LjA3;

    new-instance v3, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-direct {v3, v4, v2}, Landroid/util/Size;-><init>(II)V

    invoke-direct {v0, v1, v3}, LjA3;-><init>(Landroid/graphics/Matrix;Landroid/util/Size;)V

    return-object v0

    :cond_3
    :goto_2
    const-string v1, "Transform info is not ready"

    invoke-static {v3, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Landroidx/camera/view/PreviewView$g;
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v0}, Landroidx/camera/view/b;->f()Landroidx/camera/view/PreviewView$g;

    move-result-object v0

    return-object v0
.end method

.method public g()Landroidx/camera/core/l$c;
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/core/l$c;

    return-object v0
.end method

.method public h()LEs6;
    .locals 1

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/camera/view/PreviewView;->i(I)LEs6;

    move-result-object v0

    return-object v0
.end method

.method public i(I)LEs6;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-static {}, LO36;->a()V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LEs6$a;

    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    invoke-direct {v0, v1, p1}, LEs6$a;-><init>(Landroid/util/Rational;I)V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->j()I

    move-result p1

    invoke-virtual {v0, p1}, LEs6$a;->c(I)LEs6$a;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, LEs6$a;->b(I)LEs6$a;

    move-result-object p1

    invoke-virtual {p1}, LEs6$a;->a()LEs6;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final j()I
    .locals 3

    sget-object v0, Landroidx/camera/view/PreviewView$b;->a:[I

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->f()Landroidx/camera/view/PreviewView$g;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected scale type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->f()Landroidx/camera/view/PreviewView$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x3

    return v0

    :pswitch_1
    const/4 v0, 0x0

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    :pswitch_3
    const/4 v0, 0x2

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 4

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->q()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    invoke-virtual {v0}, Landroidx/camera/view/c;->f()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->j:Lm24;

    new-instance v1, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lm24;->e(Landroid/util/Size;I)V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->e()LjA3;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb0;->S(LjA3;)V

    :cond_1
    return-void
.end method

.method public final o()V
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->c()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->n:Landroidx/camera/view/PreviewView$c;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v1, v2}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->o()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/view/c;->b()V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/camera/view/PreviewView;->b(Z)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/view/c;->c()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljb0;->e()V

    :cond_1
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->p()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v2, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v6

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-gez v4, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v1

    :goto_2
    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    iput-object p1, p0, Landroidx/camera/view/PreviewView;->m:Landroid/view/MotionEvent;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->performClick()Z

    return v2

    :cond_4
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->k:Landroid/view/ScaleGestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    return v1
.end method

.method public final p()V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->c()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->n:Landroidx/camera/view/PreviewView$c;

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    return-void
.end method

.method public performClick()Z
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->m:Landroid/view/MotionEvent;

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    :goto_0
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->m:Landroid/view/MotionEvent;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v1, v2, v1

    :goto_1
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    iget-object v3, p0, Landroidx/camera/view/PreviewView;->j:Lm24;

    invoke-virtual {v2, v3, v0, v1}, Ljb0;->z(LST2;FF)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/view/PreviewView;->m:Landroid/view/MotionEvent;

    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0
.end method

.method public q()V
    .locals 4

    iget-boolean v0, p0, Landroidx/camera/view/PreviewView;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/camera/view/PreviewView;->l:LKb0;

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v3

    invoke-interface {v1, v3}, LJb0;->e(I)I

    move-result v1

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {v2, v1, v0}, Landroidx/camera/view/b;->m(II)V

    :cond_0
    return-void
.end method

.method public setController(Ljb0;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    invoke-virtual {v0}, Ljb0;->e()V

    :cond_0
    iput-object p1, p0, Landroidx/camera/view/PreviewView;->h:Ljb0;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->b(Z)V

    return-void
.end method

.method public setFrameUpdateListener(Ljava/util/concurrent/Executor;Landroidx/camera/view/PreviewView$e;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/PreviewView$d;

    sget-object v1, Landroidx/camera/view/PreviewView$d;->c:Landroidx/camera/view/PreviewView$d;

    if-eq v0, v1, :cond_1

    iput-object p1, p0, Landroidx/camera/view/PreviewView;->i:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Landroidx/camera/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/camera/view/c;->g(Ljava/util/concurrent/Executor;Landroidx/camera/view/PreviewView$e;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "PERFORMANCE mode doesn\'t support frame update listener"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setImplementationMode(Landroidx/camera/view/PreviewView$d;)V
    .locals 0

    invoke-static {}, LO36;->a()V

    iput-object p1, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/PreviewView$d;

    sget-object p1, Landroidx/camera/view/PreviewView$d;->c:Landroidx/camera/view/PreviewView$d;

    return-void
.end method

.method public setScaleType(Landroidx/camera/view/PreviewView$g;)V
    .locals 1

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v0, p1}, Landroidx/camera/view/b;->o(Landroidx/camera/view/PreviewView$g;)V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->l()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->b(Z)V

    return-void
.end method
