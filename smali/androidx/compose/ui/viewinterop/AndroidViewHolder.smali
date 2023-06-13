.class public Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements LL43;
.implements LAt0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\'\u0012\u0008\u0010\u009e\u0001\u001a\u00030\u009d\u0001\u0012\n\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u009f\u0001\u0012\u0006\u0010C\u001a\u00020A\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001J \u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0008\u0010\n\u001a\u00020\tH\u0016J\u0008\u0010\u000b\u001a\u00020\tH\u0016J\u0008\u0010\u000c\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0014J\u0006\u0010\u0010\u001a\u00020\tJ0\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0014J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0008\u0010\u001a\u001a\u00020\tH\u0014J\u0008\u0010\u001b\u001a\u00020\tH\u0014J\u001e\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J\u0010\u0010\'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0004H\u0014J\u0012\u0010*\u001a\u00020\u00112\u0008\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u0008\u0010+\u001a\u00020\u0011H\u0016J(\u0010.\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0008\u0010/\u001a\u00020\u0004H\u0016J(\u00100\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0016J\u0018\u00101\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u0004H\u0016J@\u00107\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u001cH\u0016J8\u00107\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0016J0\u0010:\u001a\u00020\t2\u0006\u0010$\u001a\u00020\"2\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u0004H\u0016J(\u0010>\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u00106\u001a\u00020\u0011H\u0016J \u0010?\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;H\u0016J\u0008\u0010@\u001a\u00020\u0011H\u0016R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010BR.\u0010K\u001a\u0004\u0018\u00010\"2\u0008\u0010D\u001a\u0004\u0018\u00010\"8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR6\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\t0L2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\t0L8\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR\u0016\u0010V\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR6\u0010[\u001a\u0008\u0012\u0004\u0012\u00020\t0L2\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\t0L8\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010N\u001a\u0004\u0008Y\u0010P\"\u0004\u0008Z\u0010RR6\u0010_\u001a\u0008\u0012\u0004\u0012\u00020\t0L2\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020\t0L8\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010N\u001a\u0004\u0008]\u0010P\"\u0004\u0008^\u0010RR*\u0010g\u001a\u00020`2\u0006\u0010D\u001a\u00020`8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR0\u0010n\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\t\u0018\u00010h8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR*\u0010u\u001a\u00020o2\u0006\u0010D\u001a\u00020o8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010p\u001a\u0004\u0008q\u0010r\"\u0004\u0008s\u0010tR0\u0010x\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\t\u0018\u00010h8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010i\u001a\u0004\u0008v\u0010k\"\u0004\u0008w\u0010mR.\u0010\u007f\u001a\u0004\u0018\u00010y2\u0008\u0010D\u001a\u0004\u0018\u00010y8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010z\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R6\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0080\u00012\t\u0010D\u001a\u0005\u0018\u00010\u0080\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008\u0008\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0010\u0010\u0088\u0001R!\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010iR\u001b\u0010\u008b\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t0L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010NR3\u0010\u008e\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010h8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0014\n\u0004\u0008Q\u0010i\u001a\u0005\u0008\u008c\u0001\u0010k\"\u0005\u0008\u008d\u0001\u0010mR\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u008f\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0013\u0010\u0091\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009c\u0001\u001a\u00030\u0098\u00018\u0006\u00a2\u0006\u000f\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001\u001a\u0005\u0008a\u0010\u009b\u0001\u00a8\u0006\u00a3\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
        "Landroid/view/ViewGroup;",
        "LL43;",
        "LAt0;",
        "",
        "min",
        "max",
        "preferred",
        "m",
        "",
        "l",
        "j",
        "b",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "n",
        "",
        "changed",
        "t",
        "r",
        "onLayout",
        "Landroid/view/ViewGroup$LayoutParams;",
        "getLayoutParams",
        "disallowIntercept",
        "requestDisallowInterceptTouchEvent",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "",
        "location",
        "Landroid/graphics/Rect;",
        "dirty",
        "Landroid/view/ViewParent;",
        "invalidateChildInParent",
        "Landroid/view/View;",
        "child",
        "target",
        "onDescendantInvalidated",
        "visibility",
        "onWindowVisibilityChanged",
        "Landroid/graphics/Region;",
        "region",
        "gatherTransparentRegion",
        "shouldDelayChildPressedState",
        "axes",
        "type",
        "onStartNestedScroll",
        "getNestedScrollAxes",
        "onNestedScrollAccepted",
        "onStopNestedScroll",
        "dxConsumed",
        "dyConsumed",
        "dxUnconsumed",
        "dyUnconsumed",
        "consumed",
        "onNestedScroll",
        "dx",
        "dy",
        "onNestedPreScroll",
        "",
        "velocityX",
        "velocityY",
        "onNestedFling",
        "onNestedPreFling",
        "isNestedScrollingEnabled",
        "LC43;",
        "LC43;",
        "dispatcher",
        "value",
        "c",
        "Landroid/view/View;",
        "k",
        "()Landroid/view/View;",
        "setView$ui_release",
        "(Landroid/view/View;)V",
        "view",
        "Lkotlin/Function0;",
        "d",
        "Lkotlin/jvm/functions/Function0;",
        "i",
        "()Lkotlin/jvm/functions/Function0;",
        "q",
        "(Lkotlin/jvm/functions/Function0;)V",
        "update",
        "e",
        "Z",
        "hasUpdateBlock",
        "<set-?>",
        "f",
        "getReset",
        "p",
        "reset",
        "g",
        "getRelease",
        "o",
        "release",
        "LgV2;",
        "h",
        "LgV2;",
        "getModifier",
        "()LgV2;",
        "setModifier",
        "(LgV2;)V",
        "modifier",
        "Lkotlin/Function1;",
        "Lkotlin/jvm/functions/Function1;",
        "getOnModifierChanged$ui_release",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnModifierChanged$ui_release",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onModifierChanged",
        "Lg01;",
        "Lg01;",
        "getDensity",
        "()Lg01;",
        "setDensity",
        "(Lg01;)V",
        "density",
        "getOnDensityChanged$ui_release",
        "setOnDensityChanged$ui_release",
        "onDensityChanged",
        "LLifecycleOwner;",
        "LLifecycleOwner;",
        "getLifecycleOwner",
        "()LLifecycleOwner;",
        "setLifecycleOwner",
        "(LLifecycleOwner;)V",
        "lifecycleOwner",
        "LPi5;",
        "LPi5;",
        "getSavedStateRegistryOwner",
        "()LPi5;",
        "setSavedStateRegistryOwner",
        "(LPi5;)V",
        "savedStateRegistryOwner",
        "LQM5;",
        "LQM5;",
        "snapshotObserver",
        "onCommitAffectingUpdate",
        "runUpdate",
        "getOnRequestDisallowInterceptTouchEvent$ui_release",
        "setOnRequestDisallowInterceptTouchEvent$ui_release",
        "onRequestDisallowInterceptTouchEvent",
        "[I",
        "s",
        "I",
        "lastWidthMeasureSpec",
        "lastHeightMeasureSpec",
        "LM43;",
        "u",
        "LM43;",
        "nestedScrollingParentHelper",
        "LJm2;",
        "v",
        "LJm2;",
        "()LJm2;",
        "layoutNode",
        "Landroid/content/Context;",
        "context",
        "LYt0;",
        "parentContext",
        "<init>",
        "(Landroid/content/Context;LYt0;LC43;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LC43;

.field public c:Landroid/view/View;

.field public d:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public h:LgV2;

.field public i:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LgV2;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lg01;

.field public k:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public l:LLifecycleOwner;

.field public m:LPi5;

.field public final n:LQM5;

.field public final o:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/viewinterop/AndroidViewHolder;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final r:[I

.field public s:I

.field public t:I

.field public final u:LM43;

.field public final v:LJm2;


# direct methods
.method public constructor <init>(Landroid/content/Context;LYt0;LC43;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    if-eqz p2, :cond_0

    invoke-static {p0, p2}, Landroidx/compose/ui/platform/WindowRecomposer_androidKt;->i(Landroid/view/View;LYt0;)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    sget-object p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$p;->g:Landroidx/compose/ui/viewinterop/AndroidViewHolder$p;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->d:Lkotlin/jvm/functions/Function0;

    sget-object p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$m;->g:Landroidx/compose/ui/viewinterop/AndroidViewHolder$m;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->f:Lkotlin/jvm/functions/Function0;

    sget-object p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$l;->g:Landroidx/compose/ui/viewinterop/AndroidViewHolder$l;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->g:Lkotlin/jvm/functions/Function0;

    sget-object p2, LgV2;->b0:LgV2$a;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->h:LgV2;

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p3, v0, v1, v2}, Li01;->b(FFILjava/lang/Object;)Lg01;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->j:Lg01;

    new-instance p3, LQM5;

    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$o;

    invoke-direct {v0, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$o;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    invoke-direct {p3, v0}, LQM5;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->n:LQM5;

    new-instance p3, Landroidx/compose/ui/viewinterop/AndroidViewHolder$i;

    invoke-direct {p3, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$i;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->o:Lkotlin/jvm/functions/Function1;

    new-instance p3, Landroidx/compose/ui/viewinterop/AndroidViewHolder$n;

    invoke-direct {p3, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$n;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->p:Lkotlin/jvm/functions/Function0;

    new-array p3, v1, [I

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->r:[I

    const/high16 p3, -0x80000000

    iput p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->s:I

    iput p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->t:I

    new-instance p3, LM43;

    invoke-direct {p3, p0}, LM43;-><init>(Landroid/view/ViewGroup;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->u:LM43;

    new-instance p3, LJm2;

    const/4 v0, 0x3

    invoke-direct {p3, p1, p1, v0, v2}, LJm2;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3, p0}, LJm2;->t1(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    const/4 p1, 0x1

    sget-object v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$f;->g:Landroidx/compose/ui/viewinterop/AndroidViewHolder$f;

    invoke-static {p2, p1, v0}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p1

    invoke-static {p1, p0}, LvX3;->a(LgV2;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)LgV2;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$g;

    invoke-direct {p2, p3, p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$g;-><init>(LJm2;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V

    invoke-static {p1, p2}, Landroidx/compose/ui/draw/a;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$h;

    invoke-direct {p2, p0, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$h;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;LJm2;)V

    invoke-static {p1, p2}, LTg3;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object p1

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->h:LgV2;

    invoke-interface {p2, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p2

    invoke-virtual {p3, p2}, LJm2;->p(LgV2;)V

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$a;

    invoke-direct {p2, p3, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$a;-><init>(LJm2;LgV2;)V

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->i:Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->j:Lg01;

    invoke-virtual {p3, p1}, LJm2;->k(Lg01;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$b;

    invoke-direct {p1, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$b;-><init>(LJm2;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->k:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$c;

    invoke-direct {p2, p0, p3, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$c;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;LJm2;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p3, p2}, LJm2;->z1(Lkotlin/jvm/functions/Function1;)V

    new-instance p2, Landroidx/compose/ui/viewinterop/AndroidViewHolder$d;

    invoke-direct {p2, p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$d;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p3, p2}, LJm2;->A1(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/AndroidViewHolder$e;

    invoke-direct {p1, p0, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$e;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;LJm2;)V

    invoke-virtual {p3, p1}, LJm2;->o(LxO2;)V

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->v:LJm2;

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)LC43;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->e:Z

    return p0
.end method

.method public static final synthetic d(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->o:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic e(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->p:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public static final synthetic f(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)LQM5;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->n:LQM5;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/viewinterop/AndroidViewHolder;III)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->m(III)I

    move-result p0

    return p0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->g:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->r:[I

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->r:[I

    const/4 v2, 0x0

    aget v4, v1, v2

    aget v5, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int v6, v4, v1

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->r:[I

    aget v1, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int v7, v1, v2

    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    return v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_1
    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->u:LM43;

    invoke-virtual {v0}, LM43;->a()I

    move-result v0

    return v0
.end method

.method public final h()LJm2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->v:LJm2;

    return-object v0
.end method

.method public final i()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->d:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->v:LJm2;

    invoke-virtual {p1}, LJm2;->E0()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->f:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method public final k()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    return-object v0
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->f:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final m(III)I
    .locals 2

    const/high16 v0, 0x40000000    # 2.0f

    if-gez p3, :cond_3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x2

    const v1, 0x7fffffff

    if-ne p3, p1, :cond_1

    if-eq p2, v1, :cond_1

    const/high16 p1, -0x80000000

    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    if-ne p3, p1, :cond_2

    if-eq p2, v1, :cond_2

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :goto_1
    return p1
.end method

.method public final n()V
    .locals 3

    iget v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->s:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    iget v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->t:I

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->measure(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final o(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->g:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->n:LQM5;

    invoke-virtual {v0}, LQM5;->s()V

    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->v:LJm2;

    invoke-virtual {p1}, LJm2;->E0()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->n:LQM5;

    invoke-virtual {v0}, LQM5;->t()V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->n:LQM5;

    invoke-virtual {v0}, LQM5;->k()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eqz p1, :cond_0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eq v0, p0, :cond_1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    :cond_4
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    iput p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->s:I

    iput p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->t:I

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 14

    const-string v0, "target"

    move-object v1, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static/range {p2 .. p2}, Lhe;->c(F)F

    move-result v0

    invoke-static/range {p3 .. p3}, Lhe;->c(F)F

    move-result v2

    invoke-static {v0, v2}, Lso6;->a(FF)J

    move-result-wide v6

    move-object v0, p0

    iget-object v2, v0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    invoke-virtual {v2}, LC43;->e()LZC0;

    move-result-object v2

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Landroidx/compose/ui/viewinterop/AndroidViewHolder$j;

    const/4 v8, 0x0

    move-object v3, v11

    move/from16 v4, p4

    move-object v5, p0

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$j;-><init>(ZLandroidx/compose/ui/viewinterop/AndroidViewHolder;JLkotlin/coroutines/Continuation;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    move-object v8, v2

    invoke-static/range {v8 .. v13}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return v1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Lhe;->c(F)F

    move-result p1

    invoke-static {p3}, Lhe;->c(F)F

    move-result p2

    invoke-static {p1, p2}, Lso6;->a(FF)J

    move-result-wide p1

    iget-object p3, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    invoke-virtual {p3}, LC43;->e()LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Landroidx/compose/ui/viewinterop/AndroidViewHolder$k;

    const/4 p3, 0x0

    invoke-direct {v4, p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$k;-><init>(Landroidx/compose/ui/viewinterop/AndroidViewHolder;JLkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return v0
.end method

.method public onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 1

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "consumed"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    invoke-static {p2}, Lhe;->b(I)F

    move-result p2

    invoke-static {p3}, Lhe;->b(I)F

    move-result p3

    invoke-static {p2, p3}, LGe3;->a(FF)J

    move-result-wide p2

    invoke-static {p5}, Lhe;->d(I)I

    move-result p5

    invoke-virtual {p1, p2, p3, p5}, LC43;->d(JI)J

    move-result-wide p1

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p3

    invoke-static {p3}, LD43;->b(F)I

    move-result p3

    const/4 p5, 0x0

    aput p3, p4, p5

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-static {p1}, LD43;->b(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p4, p2

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII)V
    .locals 6

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    invoke-static {p2}, Lhe;->b(I)F

    move-result p1

    invoke-static {p3}, Lhe;->b(I)F

    move-result p2

    invoke-static {p1, p2}, LGe3;->a(FF)J

    move-result-wide v1

    invoke-static {p4}, Lhe;->b(I)F

    move-result p1

    invoke-static {p5}, Lhe;->b(I)F

    move-result p2

    invoke-static {p1, p2}, LGe3;->a(FF)J

    move-result-wide v3

    invoke-static {p6}, Lhe;->d(I)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, LC43;->b(JJI)J

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 6

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "consumed"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->b:LC43;

    invoke-static {p2}, Lhe;->b(I)F

    move-result p1

    invoke-static {p3}, Lhe;->b(I)F

    move-result p2

    invoke-static {p1, p2}, LGe3;->a(FF)J

    move-result-wide v1

    invoke-static {p4}, Lhe;->b(I)F

    move-result p1

    invoke-static {p5}, Lhe;->b(I)F

    move-result p2

    invoke-static {p1, p2}, LGe3;->a(FF)J

    move-result-wide v3

    invoke-static {p6}, Lhe;->d(I)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, LC43;->b(JJI)J

    move-result-wide p1

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p3

    invoke-static {p3}, LD43;->b(F)I

    move-result p3

    const/4 p4, 0x0

    aput p3, p7, p4

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-static {p1}, LD43;->b(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p7, p2

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->u:LM43;

    invoke-virtual {v0, p1, p2, p3, p4}, LM43;->c(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    const-string p4, "child"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x2

    const/4 p2, 0x1

    if-nez p1, :cond_1

    and-int/lit8 p1, p3, 0x1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    return p2
.end method

.method public onStopNestedScroll(Landroid/view/View;I)V
    .locals 1

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->u:LM43;

    invoke-virtual {v0, p1, p2}, LM43;->e(Landroid/view/View;I)V

    return-void
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public final p(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->f:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final q(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->d:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->e:Z

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->p:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->q:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final setDensity(Lg01;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->j:Lg01;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->j:Lg01;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->k:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(LLifecycleOwner;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->l:LLifecycleOwner;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->l:LLifecycleOwner;

    invoke-static {p0, p1}, LQt6;->b(Landroid/view/View;LLifecycleOwner;)V

    :cond_0
    return-void
.end method

.method public final setModifier(LgV2;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->h:LgV2;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->h:LgV2;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->i:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg01;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->k:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnModifierChanged$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LgV2;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->i:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->q:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setSavedStateRegistryOwner(LPi5;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->m:LPi5;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->m:LPi5;

    invoke-static {p0, p1}, LTt6;->b(Landroid/view/View;LPi5;)V

    :cond_0
    return-void
.end method

.method public final setView$ui_release(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->c:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->p:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
