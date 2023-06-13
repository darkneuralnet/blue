.class public final Landroidx/compose/ui/platform/ViewLayer;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements LiD3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/ViewLayer$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B;\u0012\u0006\u0010O\u001a\u00020K\u0012\u0006\u0010T\u001a\u00020P\u0012\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040G\u0012\u000c\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00040I\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u00af\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0008\u0010%\u001a\u00020\u0016H\u0016J\u001d\u0010(\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020&H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001d\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001d\u0010/\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020.H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008/\u0010-J\u0010\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u000203H\u0014J\u0008\u00105\u001a\u00020\u0004H\u0016J0\u0010<\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00162\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u0002072\u0006\u0010;\u001a\u000207H\u0014J\u0008\u0010=\u001a\u00020\u0004H\u0016J\u0008\u0010>\u001a\u00020\u0004H\u0016J\u0008\u0010?\u001a\u00020\u0004H\u0016J%\u0010B\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020\u0016H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008B\u0010CJ\u0018\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020D2\u0006\u0010A\u001a\u00020\u0016H\u0016J*\u0010;\u001a\u00020\u00042\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040G2\u000c\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00040IH\u0016R\u0017\u0010O\u001a\u00020K8\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010L\u001a\u0004\u0008M\u0010NR\u0017\u0010T\u001a\u00020P8\u0006\u00a2\u0006\u000c\n\u0004\u00082\u0010Q\u001a\u0004\u0008R\u0010SR$\u0010H\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010UR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010VR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010XR\u0016\u0010[\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010]R*\u0010c\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u00168\u0006@BX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010Z\u001a\u0004\u00089\u0010`\"\u0004\u0008a\u0010bR\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008d\u0010ZR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010hR\u001a\u0010l\u001a\u0008\u0012\u0004\u0012\u00020\u00010j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u0010kR\u001f\u0010o\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u0016\u0010q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008p\u0010ZR\u001a\u0010v\u001a\u00020r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008s\u0010n\u001a\u0004\u0008t\u0010uR\u0016\u0010z\u001a\u0004\u0018\u00010w8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008x\u0010yR$\u0010\u007f\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/platform/ViewLayer;",
        "Landroid/view/View;",
        "LiD3;",
        "",
        "",
        "w",
        "u",
        "",
        "scaleX",
        "scaleY",
        "alpha",
        "translationX",
        "translationY",
        "shadowElevation",
        "rotationX",
        "rotationY",
        "rotationZ",
        "cameraDistance",
        "Landroidx/compose/ui/graphics/f;",
        "transformOrigin",
        "Lhy5;",
        "shape",
        "",
        "clip",
        "Low4;",
        "renderEffect",
        "Lpm0;",
        "ambientShadowColor",
        "spotShadowColor",
        "Landroidx/compose/ui/graphics/a;",
        "compositingStrategy",
        "Lpm2;",
        "layoutDirection",
        "Lg01;",
        "density",
        "d",
        "(FFFFFFFFFFJLhy5;ZLow4;JJILpm2;Lg01;)V",
        "hasOverlappingRendering",
        "LCe3;",
        "position",
        "g",
        "(J)Z",
        "LG52;",
        "size",
        "f",
        "(J)V",
        "LA52;",
        "h",
        "Lme0;",
        "canvas",
        "c",
        "Landroid/graphics/Canvas;",
        "dispatchDraw",
        "invalidate",
        "changed",
        "",
        "l",
        "t",
        "r",
        "b",
        "onLayout",
        "destroy",
        "i",
        "forceLayout",
        "point",
        "inverse",
        "e",
        "(JZ)J",
        "LyX2;",
        "rect",
        "a",
        "Lkotlin/Function1;",
        "drawBlock",
        "Lkotlin/Function0;",
        "invalidateParentLayer",
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "getOwnerView",
        "()Landroidx/compose/ui/platform/AndroidComposeView;",
        "ownerView",
        "Landroidx/compose/ui/platform/DrawChildContainer;",
        "Landroidx/compose/ui/platform/DrawChildContainer;",
        "getContainer",
        "()Landroidx/compose/ui/platform/DrawChildContainer;",
        "container",
        "Lkotlin/jvm/functions/Function1;",
        "Lkotlin/jvm/functions/Function0;",
        "LOz3;",
        "LOz3;",
        "outlineResolver",
        "Z",
        "clipToBounds",
        "Landroid/graphics/Rect;",
        "Landroid/graphics/Rect;",
        "clipBoundsCache",
        "value",
        "()Z",
        "v",
        "(Z)V",
        "isInvalidated",
        "j",
        "drawnWithZ",
        "Lqe0;",
        "k",
        "Lqe0;",
        "canvasHolder",
        "Lhm2;",
        "Lhm2;",
        "matrixCache",
        "m",
        "J",
        "mTransformOrigin",
        "n",
        "mHasOverlappingRendering",
        "",
        "o",
        "getLayerId",
        "()J",
        "layerId",
        "LcJ3;",
        "s",
        "()LcJ3;",
        "manualClipPath",
        "getCameraDistancePx",
        "()F",
        "setCameraDistancePx",
        "(F)V",
        "cameraDistancePx",
        "<init>",
        "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V",
        "p",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"
    }
.end annotation


# static fields
.field public static final p:Landroidx/compose/ui/platform/ViewLayer$c;

.field public static final q:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroid/view/View;",
            "Landroid/graphics/Matrix;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Landroid/view/ViewOutlineProvider;

.field public static s:Ljava/lang/reflect/Method;

.field public static t:Ljava/lang/reflect/Field;

.field public static u:Z

.field public static v:Z


# instance fields
.field public final b:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final c:Landroidx/compose/ui/platform/DrawChildContainer;

.field public d:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lme0;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LOz3;

.field public g:Z

.field public h:Landroid/graphics/Rect;

.field public i:Z

.field public j:Z

.field public final k:Lqe0;

.field public final l:Lhm2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhm2<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public m:J

.field public n:Z

.field public final o:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/ViewLayer$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/ViewLayer$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->p:Landroidx/compose/ui/platform/ViewLayer$c;

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer$b;->g:Landroidx/compose/ui/platform/ViewLayer$b;

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->q:Lkotlin/jvm/functions/Function2;

    new-instance v0, Landroidx/compose/ui/platform/ViewLayer$a;

    invoke-direct {v0}, Landroidx/compose/ui/platform/ViewLayer$a;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->r:Landroid/view/ViewOutlineProvider;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/AndroidComposeView;",
            "Landroidx/compose/ui/platform/DrawChildContainer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lme0;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ownerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawBlock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invalidateParentLayer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->c:Landroidx/compose/ui/platform/DrawChildContainer;

    iput-object p3, p0, Landroidx/compose/ui/platform/ViewLayer;->d:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Landroidx/compose/ui/platform/ViewLayer;->e:Lkotlin/jvm/functions/Function0;

    new-instance p3, LOz3;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->b()Lg01;

    move-result-object p1

    invoke-direct {p3, p1}, LOz3;-><init>(Lg01;)V

    iput-object p3, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    new-instance p1, Lqe0;

    invoke-direct {p1}, Lqe0;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->k:Lqe0;

    new-instance p1, Lhm2;

    sget-object p3, Landroidx/compose/ui/platform/ViewLayer;->q:Lkotlin/jvm/functions/Function2;

    invoke-direct {p1, p3}, Lhm2;-><init>(Lkotlin/jvm/functions/Function2;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    sget-object p1, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/ViewLayer;->n:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Landroidx/compose/ui/platform/ViewLayer;->o:J

    return-void
.end method

.method public static final synthetic j()Z
    .locals 1

    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->u:Z

    return v0
.end method

.method public static final synthetic k(Landroidx/compose/ui/platform/ViewLayer;)LOz3;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    return-object p0
.end method

.method public static final synthetic l()Ljava/lang/reflect/Field;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->t:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public static final synthetic m()Z
    .locals 1

    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->v:Z

    return v0
.end method

.method public static final synthetic n()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->s:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public static final synthetic o(Z)V
    .locals 0

    sput-boolean p0, Landroidx/compose/ui/platform/ViewLayer;->u:Z

    return-void
.end method

.method public static final synthetic p(Ljava/lang/reflect/Field;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/ViewLayer;->t:Ljava/lang/reflect/Field;

    return-void
.end method

.method public static final synthetic q(Z)V
    .locals 0

    sput-boolean p0, Landroidx/compose/ui/platform/ViewLayer;->v:Z

    return-void
.end method

.method public static final synthetic r(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/ViewLayer;->s:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public a(LyX2;Z)V
    .locals 1

    const-string v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {p2, p0}, Lhm2;->a(Ljava/lang/Object;)[F

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, LhN2;->g([FLyX2;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p2, p2}, LyX2;->g(FFFF)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {p2, p0}, Lhm2;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-static {p2, p1}, LhN2;->g([FLyX2;)V

    :goto_0
    return-void
.end method

.method public b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lme0;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "drawBlock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "invalidateParentLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->c:Landroidx/compose/ui/platform/DrawChildContainer;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->g:Z

    iput-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->j:Z

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    iput-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->d:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->e:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public c(Lme0;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->j:Z

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lme0;->r()V

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->c:Landroidx/compose/ui/platform/DrawChildContainer;

    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v1

    invoke-virtual {v0, p1, p0, v1, v2}, Landroidx/compose/ui/platform/DrawChildContainer;->a(Lme0;Landroid/view/View;J)V

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->j:Z

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lme0;->i()V

    :cond_2
    return-void
.end method

.method public d(FFFFFFFFFFJLhy5;ZLow4;JJILpm2;Lg01;)V
    .locals 12

    move-object v0, p0

    move-object/from16 v1, p13

    move/from16 v2, p20

    const-string v3, "shape"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "layoutDirection"

    move-object/from16 v4, p21

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "density"

    move-object/from16 v5, p22

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-wide/from16 v6, p11

    iput-wide v6, v0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    move v3, p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setScaleY(F)V

    move v3, p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setAlpha(F)V

    move/from16 v3, p4

    invoke-virtual {p0, v3}, Landroid/view/View;->setTranslationX(F)V

    move/from16 v3, p5

    invoke-virtual {p0, v3}, Landroid/view/View;->setTranslationY(F)V

    move/from16 v3, p6

    invoke-virtual {p0, v3}, Landroid/view/View;->setElevation(F)V

    move/from16 v3, p9

    invoke-virtual {p0, v3}, Landroid/view/View;->setRotation(F)V

    move/from16 v3, p7

    invoke-virtual {p0, v3}, Landroid/view/View;->setRotationX(F)V

    move/from16 v3, p8

    invoke-virtual {p0, v3}, Landroid/view/View;->setRotationY(F)V

    iget-wide v6, v0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-virtual {p0, v3}, Landroid/view/View;->setPivotX(F)V

    iget-wide v6, v0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-virtual {p0, v3}, Landroid/view/View;->setPivotY(F)V

    move/from16 v3, p10

    invoke-virtual {p0, v3}, Landroidx/compose/ui/platform/ViewLayer;->setCameraDistancePx(F)V

    const/4 v3, 0x1

    const/4 v6, 0x0

    if-eqz p14, :cond_0

    invoke-static {}, LZs4;->a()Lhy5;

    move-result-object v7

    if-ne v1, v7, :cond_0

    move v7, v3

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    iput-boolean v7, v0, Landroidx/compose/ui/platform/ViewLayer;->g:Z

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->u()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->s()LcJ3;

    move-result-object v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    if-eqz p14, :cond_2

    invoke-static {}, LZs4;->a()Lhy5;

    move-result-object v8

    if-eq v1, v8, :cond_2

    move v8, v3

    goto :goto_2

    :cond_2
    move v8, v6

    :goto_2
    invoke-virtual {p0, v8}, Landroid/view/View;->setClipToOutline(Z)V

    iget-object v8, v0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v9

    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    move-result v10

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v11

    move-object p1, v8

    move-object/from16 p2, p13

    move p3, v9

    move/from16 p4, v10

    move/from16 p5, v11

    move-object/from16 p6, p21

    move-object/from16 p7, p22

    invoke-virtual/range {p1 .. p7}, LOz3;->g(Lhy5;FZFLpm2;Lg01;)Z

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->w()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->s()LcJ3;

    move-result-object v4

    if-eqz v4, :cond_3

    move v4, v3

    goto :goto_3

    :cond_3
    move v4, v6

    :goto_3
    if-ne v7, v4, :cond_4

    if-eqz v4, :cond_5

    if-eqz v1, :cond_5

    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->invalidate()V

    :cond_5
    iget-boolean v1, v0, Landroidx/compose/ui/platform/ViewLayer;->j:Z

    if-nez v1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v1

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-lez v1, :cond_6

    iget-object v1, v0, Landroidx/compose/ui/platform/ViewLayer;->e:Lkotlin/jvm/functions/Function0;

    if-eqz v1, :cond_6

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_6
    iget-object v1, v0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {v1}, Lhm2;->c()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v1, v4, :cond_7

    sget-object v4, LGr6;->a:LGr6;

    invoke-static/range {p16 .. p17}, Lvm0;->h(J)I

    move-result v5

    invoke-virtual {v4, p0, v5}, LGr6;->a(Landroid/view/View;I)V

    invoke-static/range {p18 .. p19}, Lvm0;->h(J)I

    move-result v5

    invoke-virtual {v4, p0, v5}, LGr6;->b(Landroid/view/View;I)V

    :cond_7
    const/16 v4, 0x1f

    if-lt v1, v4, :cond_8

    sget-object v1, LIr6;->a:LIr6;

    move-object/from16 v4, p15

    invoke-virtual {v1, p0, v4}, LIr6;->a(Landroid/view/View;Low4;)V

    :cond_8
    sget-object v1, Landroidx/compose/ui/graphics/a;->a:Landroidx/compose/ui/graphics/a$a;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/a$a;->c()I

    move-result v4

    invoke-static {v2, v4}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/a$a;->b()I

    move-result v1

    invoke-static {v2, v1}, Landroidx/compose/ui/graphics/a;->e(II)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p0, v6, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move v3, v6

    goto :goto_4

    :cond_a
    invoke-virtual {p0, v6, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_4
    iput-boolean v3, v0, Landroidx/compose/ui/platform/ViewLayer;->n:Z

    return-void
.end method

.method public destroy()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->v(Z)V

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->U0()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->d:Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->e:Lkotlin/jvm/functions/Function0;

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/AndroidComposeView;->S0(LiD3;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->c:Landroidx/compose/ui/platform/DrawChildContainer;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 5

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->v(Z)V

    iget-object v1, p0, Landroidx/compose/ui/platform/ViewLayer;->k:Lqe0;

    invoke-virtual {v1}, Lqe0;->a()Lac;

    move-result-object v2

    invoke-virtual {v2}, Lac;->y()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v1}, Lqe0;->a()Lac;

    move-result-object v3

    invoke-virtual {v3, p1}, Lac;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v1}, Lqe0;->a()Lac;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->s()LcJ3;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    invoke-interface {v3}, Lme0;->v()V

    iget-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-virtual {p1, v3}, LOz3;->a(Lme0;)V

    const/4 v0, 0x1

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->d:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_2

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz v0, :cond_3

    invoke-interface {v3}, Lme0;->p()V

    :cond_3
    invoke-virtual {v1}, Lqe0;->a()Lac;

    move-result-object p1

    invoke-virtual {p1, v2}, Lac;->z(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public e(JZ)J
    .locals 0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {p3, p0}, Lhm2;->a(Ljava/lang/Object;)[F

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3, p1, p2}, LhN2;->f([FJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, LCe3;->b:LCe3$a;

    invoke-virtual {p1}, LCe3$a;->a()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    iget-object p3, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {p3, p0}, Lhm2;->b(Ljava/lang/Object;)[F

    move-result-object p3

    invoke-static {p3, p1, p2}, LhN2;->f([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public f(J)V
    .locals 4

    invoke-static {p1, p2}, LG52;->g(J)I

    move-result v0

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    if-ne v0, p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    if-eq p1, p2, :cond_1

    :cond_0
    iget-wide v1, p0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->f(J)F

    move-result p2

    int-to-float v1, v0

    mul-float/2addr p2, v1

    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotX(F)V

    iget-wide v2, p0, Landroidx/compose/ui/platform/ViewLayer;->m:J

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/f;->g(J)F

    move-result p2

    int-to-float v2, p1

    mul-float/2addr p2, v2

    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotY(F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-static {v1, v2}, LCB5;->a(FF)J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, LOz3;->h(J)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->w()V

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p2, v1, v2, v0}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/ViewLayer;->u()V

    iget-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {p1}, Lhm2;->c()V

    :cond_1
    return-void
.end method

.method public forceLayout()V
    .locals 0

    return-void
.end method

.method public g(J)Z
    .locals 4

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v0

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result v1

    iget-boolean v2, p0, Landroidx/compose/ui/platform/ViewLayer;->g:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    cmpg-float p2, p1, v0

    if-gtz p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v1, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-virtual {v0, p1, p2}, LOz3;->e(J)Z

    move-result p1

    return p1

    :cond_2
    return v3
.end method

.method public h(J)V
    .locals 2

    invoke-static {p1, p2}, LA52;->j(J)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {v0}, Lhm2;->c()V

    :cond_0
    invoke-static {p1, p2}, LA52;->k(J)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p2

    if-eq p1, p2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    iget-object p1, p0, Landroidx/compose/ui/platform/ViewLayer;->l:Lhm2;

    invoke-virtual {p1}, Lhm2;->c()V

    :cond_1
    return-void
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->n:Z

    return v0
.end method

.method public i()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->i:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->v:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->v(Z)V

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->p:Landroidx/compose/ui/platform/ViewLayer$c;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/ViewLayer$c;->d(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public invalidate()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->v(Z)V

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final s()LcJ3;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-virtual {v0}, LOz3;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-virtual {v0}, LOz3;->b()LcJ3;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final setCameraDistancePx(F)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->i:Z

    return v0
.end method

.method public final u()V
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->h:Landroid/graphics/Rect;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->h:Landroid/graphics/Rect;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->h:Landroid/graphics/Rect;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final v(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->i:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/ViewLayer;->i:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->O0(LiD3;Z)V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/ViewLayer;->f:LOz3;

    invoke-virtual {v0}, LOz3;->c()Landroid/graphics/Outline;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->r:Landroid/view/ViewOutlineProvider;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    return-void
.end method
