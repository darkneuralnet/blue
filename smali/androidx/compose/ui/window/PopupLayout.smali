.class public final Landroidx/compose/ui/window/PopupLayout;
.super Landroidx/compose/ui/platform/AbstractComposeView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/window/PopupLayout$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002BX\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010H\u001a\u00020E\u0012\u0008\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\u0007\u0010\u0089\u0001\u001a\u00020W\u0012\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\u0008\u0008\u0002\u0010L\u001a\u00020I\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0008\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J#\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0017\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u000cH\u0010\u00a2\u0006\u0004\u0008\u001f\u0010 J7\u0010)\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020\u000cH\u0010\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J.\u00102\u001a\u00020\u00052\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203J\u0006\u00106\u001a\u00020\u0005J\u000f\u00107\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u00087\u00108J\u0006\u00109\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u0005J\u0012\u0010<\u001a\u00020\u00032\u0008\u0010+\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000cH\u0016R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010>R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010?R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR \u0010V\u001a\u00020\u00128\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008Q\u0010R\u0012\u0004\u0008U\u00108\u001a\u0004\u0008S\u0010TR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010Y\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u0010]R\"\u0010e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008_\u0010`\u001a\u0004\u0008a\u0010b\"\u0004\u0008c\u0010dR8\u0010l\u001a\u0004\u0018\u00010f2\u0008\u0010g\u001a\u0004\u0018\u00010f8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0012\n\u0004\u00086\u0010h\u001a\u0004\u0008_\u0010i\"\u0004\u0008j\u0010kR/\u00104\u001a\u0004\u0018\u0001032\u0008\u0010g\u001a\u0004\u0018\u0001038B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010h\u001a\u0004\u0008X\u0010m\"\u0004\u0008n\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010qR\u001b\u0010u\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008n\u0010s\u001a\u0004\u0008F\u0010tR\u001d\u0010x\u001a\u00020v8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\t\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010zR7\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00172\u000c\u0010g\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010h\u001a\u0004\u0008J\u0010|\"\u0004\u0008\u0019\u0010}R%\u0010\u0080\u0001\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00038\u0014@RX\u0094\u000e\u00a2\u0006\u000c\n\u0004\u00082\u0010~\u001a\u0004\u0008\u007f\u0010tR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u00087\u0010\u0082\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008Q\u0010\u0084\u0001R\u0016\u0010\u0086\u0001\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008N\u0010\u0084\u0001\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u008e\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/window/PopupLayout;",
        "Landroidx/compose/ui/platform/AbstractComposeView;",
        "",
        "",
        "isFocusable",
        "",
        "m",
        "LOq5;",
        "securePolicy",
        "o",
        "clippingEnabled",
        "l",
        "",
        "flags",
        "b",
        "Lpm2;",
        "layoutDirection",
        "q",
        "Landroid/view/WindowManager$LayoutParams;",
        "c",
        "p",
        "LYt0;",
        "parent",
        "Lkotlin/Function0;",
        "content",
        "setContent",
        "(LYt0;Lkotlin/jvm/functions/Function2;)V",
        "Content",
        "(LEt0;I)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "internalOnMeasure$ui_release",
        "(II)V",
        "internalOnMeasure",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "internalOnLayout$ui_release",
        "(ZIIII)V",
        "internalOnLayout",
        "Landroid/view/KeyEvent;",
        "event",
        "dispatchKeyEvent",
        "onDismissRequest",
        "LAY3;",
        "properties",
        "",
        "testTag",
        "r",
        "Lnm2;",
        "parentLayoutCoordinates",
        "t",
        "k",
        "s",
        "()V",
        "u",
        "d",
        "Landroid/view/MotionEvent;",
        "onTouchEvent",
        "setLayoutDirection",
        "Lkotlin/jvm/functions/Function0;",
        "LAY3;",
        "Ljava/lang/String;",
        "getTestTag",
        "()Ljava/lang/String;",
        "setTestTag",
        "(Ljava/lang/String;)V",
        "Landroid/view/View;",
        "e",
        "Landroid/view/View;",
        "composeView",
        "LtY3;",
        "f",
        "LtY3;",
        "popupLayoutHelper",
        "Landroid/view/WindowManager;",
        "g",
        "Landroid/view/WindowManager;",
        "windowManager",
        "h",
        "Landroid/view/WindowManager$LayoutParams;",
        "getParams$ui_release",
        "()Landroid/view/WindowManager$LayoutParams;",
        "getParams$ui_release$annotations",
        "params",
        "LzY3;",
        "i",
        "LzY3;",
        "getPositionProvider",
        "()LzY3;",
        "setPositionProvider",
        "(LzY3;)V",
        "positionProvider",
        "j",
        "Lpm2;",
        "getParentLayoutDirection",
        "()Lpm2;",
        "setParentLayoutDirection",
        "(Lpm2;)V",
        "parentLayoutDirection",
        "LG52;",
        "<set-?>",
        "LEX2;",
        "()LG52;",
        "setPopupContentSize-fhxjrPA",
        "(LG52;)V",
        "popupContentSize",
        "()Lnm2;",
        "n",
        "(Lnm2;)V",
        "LD52;",
        "LD52;",
        "parentBounds",
        "LsP5;",
        "()Z",
        "canCalculatePosition",
        "Lk61;",
        "F",
        "maxSupportedElevation",
        "Landroid/graphics/Rect;",
        "Landroid/graphics/Rect;",
        "previousWindowVisibleFrame",
        "()Lkotlin/jvm/functions/Function2;",
        "(Lkotlin/jvm/functions/Function2;)V",
        "Z",
        "getShouldCreateCompositionOnAttachedToWindow",
        "shouldCreateCompositionOnAttachedToWindow",
        "",
        "[I",
        "locationOnScreen",
        "()I",
        "displayWidth",
        "displayHeight",
        "Lg01;",
        "density",
        "initialPositionProvider",
        "Ljava/util/UUID;",
        "popupId",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Landroid/view/View;Lg01;LzY3;Ljava/util/UUID;LtY3;)V",
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
        "SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n154#2:825\n1#3:826\n76#4:827\n102#4,2:828\n76#4:830\n102#4,2:831\n76#4:833\n76#4:834\n102#4,2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:825\n402#1:827\n402#1:828,2\n403#1:830\n403#1:831,2\n407#1:833\n447#1:834\n447#1:835,2\n*E\n"
    }
.end annotation


# instance fields
.field public b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public c:LAY3;

.field public d:Ljava/lang/String;

.field public final e:Landroid/view/View;

.field public final f:LtY3;

.field public final g:Landroid/view/WindowManager;

.field public final h:Landroid/view/WindowManager$LayoutParams;

.field public i:LzY3;

.field public j:Lpm2;

.field public final k:LEX2;

.field public final l:LEX2;

.field public m:LD52;

.field public final n:LsP5;

.field public final o:F

.field public final p:Landroid/graphics/Rect;

.field public final q:LEX2;

.field public r:Z

.field public final s:[I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Landroid/view/View;Lg01;LzY3;Ljava/util/UUID;LtY3;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LAY3;",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            "Lg01;",
            "LzY3;",
            "Ljava/util/UUID;",
            "LtY3;",
            ")V"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testTag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "composeView"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialPositionProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "popupId"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "popupLayoutHelper"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "composeView.context"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/AbstractComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->b:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->c:LAY3;

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->d:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/ui/window/PopupLayout;->e:Landroid/view/View;

    iput-object p8, p0, Landroidx/compose/ui/window/PopupLayout;->f:LtY3;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->g:Landroid/view/WindowManager;

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->c()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iput-object p6, p0, Landroidx/compose/ui/window/PopupLayout;->i:LzY3;

    sget-object p1, Lpm2;->b:Lpm2;

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->j:Lpm2;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->k:LEX2;

    invoke-static {p1, p1, p2, p1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->l:LEX2;

    new-instance p3, Landroidx/compose/ui/window/PopupLayout$d;

    invoke-direct {p3, p0}, Landroidx/compose/ui/window/PopupLayout$d;-><init>(Landroidx/compose/ui/window/PopupLayout;)V

    invoke-static {p3}, LGM5;->c(Lkotlin/jvm/functions/Function0;)LsP5;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->n:LsP5;

    const/16 p3, 0x8

    int-to-float p3, p3

    invoke-static {p3}, Lk61;->g(F)F

    move-result p3

    iput p3, p0, Landroidx/compose/ui/window/PopupLayout;->o:F

    new-instance p6, Landroid/graphics/Rect;

    invoke-direct {p6}, Landroid/graphics/Rect;-><init>()V

    iput-object p6, p0, Landroidx/compose/ui/window/PopupLayout;->p:Landroid/graphics/Rect;

    const p6, 0x1020002

    invoke-virtual {p0, p6}, Landroid/view/View;->setId(I)V

    invoke-static {p4}, LQt6;->a(Landroid/view/View;)LLifecycleOwner;

    move-result-object p6

    invoke-static {p0, p6}, LQt6;->b(Landroid/view/View;LLifecycleOwner;)V

    invoke-static {p4}, LUt6;->a(Landroid/view/View;)LXr6;

    move-result-object p6

    invoke-static {p0, p6}, LUt6;->b(Landroid/view/View;LXr6;)V

    invoke-static {p4}, LTt6;->a(Landroid/view/View;)LPi5;

    move-result-object p4

    invoke-static {p0, p4}, LTt6;->b(Landroid/view/View;LPi5;)V

    sget p4, Loh4;->compose_view_saveable_id_tag:I

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string p8, "Popup:"

    invoke-virtual {p6, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p0, p4, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p5, p3}, Lg01;->T0(F)F

    move-result p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setElevation(F)V

    new-instance p3, Landroidx/compose/ui/window/PopupLayout$a;

    invoke-direct {p3}, Landroidx/compose/ui/window/PopupLayout$a;-><init>()V

    invoke-virtual {p0, p3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    sget-object p3, Llt0;->a:Llt0;

    invoke-virtual {p3}, Llt0;->a()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {p3, p1, p2, p1}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->q:LEX2;

    new-array p1, p2, [I

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->s:[I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Landroid/view/View;Lg01;LzY3;Ljava/util/UUID;LtY3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, LvY3;

    invoke-direct {v0}, LvY3;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, LwY3;

    invoke-direct {v0}, LwY3;-><init>()V

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object/from16 v9, p8

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/window/PopupLayout;-><init>(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Landroid/view/View;Lg01;LzY3;Ljava/util/UUID;LtY3;)V

    return-void
.end method

.method public static final synthetic a(Landroidx/compose/ui/window/PopupLayout;)Lnm2;
    .locals 0

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->i()Lnm2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public Content(LEt0;I)V
    .locals 3

    const v0, -0x331e2520

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Landroidx/compose/ui/window/PopupLayout$b;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/PopupLayout$b;-><init>(Landroidx/compose/ui/window/PopupLayout;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->f:LtY3;

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->g:Landroid/view/WindowManager;

    invoke-interface {p1, v1, p0, v0}, LtY3;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final c()Landroid/view/WindowManager$LayoutParams;
    .locals 3

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const v2, -0x828019

    and-int/2addr v1, v2

    const/high16 v2, 0x40000

    or-int/2addr v1, v2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v1, 0x3ea

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    iput-object v1, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->e:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Ljl4;->default_popup_window_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LQt6;->b(Landroid/view/View;LLifecycleOwner;)V

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->g:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->c:LAY3;

    invoke-virtual {v0}, LAY3;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    :cond_1
    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->b:Lkotlin/jvm/functions/Function0;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_3
    return v1

    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->n:LsP5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final f()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->q:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final g()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    return v0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/window/PopupLayout;->r:Z

    return v0
.end method

.method public final h()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    return v0
.end method

.method public final i()Lnm2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->l:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnm2;

    return-object v0
.end method

.method public internalOnLayout$ui_release(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroidx/compose/ui/platform/AbstractComposeView;->internalOnLayout$ui_release(ZIIII)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iput p3, p2, Landroid/view/WindowManager$LayoutParams;->width:I

    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->f:LtY3;

    iget-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->g:Landroid/view/WindowManager;

    iget-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p2, p0, p3}, LtY3;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public internalOnMeasure$ui_release(II)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->c:LAY3;

    invoke-virtual {v0}, LAY3;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/AbstractComposeView;->internalOnMeasure$ui_release(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->h()I

    move-result p1

    const/high16 p2, -0x80000000

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->g()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/AbstractComposeView;->internalOnMeasure$ui_release(II)V

    :goto_0
    return-void
.end method

.method public final j()LG52;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->k:LEX2;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG52;

    return-object v0
.end method

.method public final k()V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->s:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    iget-object v5, p0, Landroidx/compose/ui/window/PopupLayout;->e:Landroid/view/View;

    invoke-virtual {v5, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->s:[I

    aget v1, v0, v1

    if-ne v2, v1, :cond_0

    aget v0, v0, v3

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->s()V

    :cond_1
    return-void
.end method

.method public final l(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p1, p1, -0x201

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 p1, p1, 0x200

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->b(I)V

    return-void
.end method

.method public final m(Z)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 p1, p1, 0x8

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit8 p1, p1, -0x9

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->b(I)V

    return-void
.end method

.method public final n(Lnm2;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->l:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(LOq5;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->e:Landroid/view/View;

    invoke-static {v0}, Lxd;->e(Landroid/view/View;)Z

    move-result v0

    invoke-static {p1, v0}, LPq5;->a(LOq5;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 p1, p1, 0x2000

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p1, p1, -0x2001

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->b(I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->c:LAY3;

    invoke-virtual {v0}, LAY3;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    cmpl-float v2, v2, v4

    if-gez v2, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_4

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->b:Lkotlin/jvm/functions/Function0;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_3
    return v0

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_5

    move v1, v0

    :cond_5
    if-eqz v1, :cond_7

    iget-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->b:Lkotlin/jvm/functions/Function0;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_6
    return v0

    :cond_7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->g:Landroid/view/WindowManager;

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final q(Lpm2;)V
    .locals 2

    sget-object v0, Landroidx/compose/ui/window/PopupLayout$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-super {p0, v0}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method public final r(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Lpm2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LAY3;",
            "Ljava/lang/String;",
            "Lpm2;",
            ")V"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testTag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->b:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Landroidx/compose/ui/window/PopupLayout;->c:LAY3;

    iput-object p3, p0, Landroidx/compose/ui/window/PopupLayout;->d:Ljava/lang/String;

    invoke-virtual {p2}, LAY3;->e()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->m(Z)V

    invoke-virtual {p2}, LAY3;->f()LOq5;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->o(LOq5;)V

    invoke-virtual {p2}, LAY3;->a()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->l(Z)V

    invoke-virtual {p0, p4}, Landroidx/compose/ui/window/PopupLayout;->q(Lpm2;)V

    return-void
.end method

.method public final s()V
    .locals 5

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->i()Lnm2;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lnm2;->a()J

    move-result-wide v1

    invoke-static {v0}, Lom2;->f(Lnm2;)J

    move-result-wide v3

    invoke-static {v3, v4}, LCe3;->o(J)F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    invoke-static {v3, v4}, LCe3;->p(J)F

    move-result v3

    invoke-static {v3}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v3

    invoke-static {v0, v3}, LB52;->a(II)J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, LE52;->a(JJ)LD52;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->m:LD52;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->m:LD52;

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->u()V

    :cond_1
    return-void
.end method

.method public final setContent(LYt0;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYt0;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->setParentCompositionContext(LYt0;)V

    invoke-virtual {p0, p2}, Landroidx/compose/ui/window/PopupLayout;->setContent(Lkotlin/jvm/functions/Function2;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/window/PopupLayout;->r:Z

    return-void
.end method

.method public final setContent(Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->q:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    return-void
.end method

.method public final setParentLayoutDirection(Lpm2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->j:Lpm2;

    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(LG52;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->k:LEX2;

    invoke-interface {v0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPositionProvider(LzY3;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->i:LzY3;

    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/compose/ui/window/PopupLayout;->d:Ljava/lang/String;

    return-void
.end method

.method public final t(Lnm2;)V
    .locals 1

    const-string v0, "parentLayoutCoordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/PopupLayout;->n(Lnm2;)V

    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->s()V

    return-void
.end method

.method public final u()V
    .locals 9

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->m:LD52;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/PopupLayout;->j()LG52;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LG52;->j()J

    move-result-wide v5

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->p:Landroid/graphics/Rect;

    iget-object v2, p0, Landroidx/compose/ui/window/PopupLayout;->f:LtY3;

    iget-object v3, p0, Landroidx/compose/ui/window/PopupLayout;->e:Landroid/view/View;

    invoke-interface {v2, v3, v0}, LtY3;->c(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v0}, Lxd;->d(Landroid/graphics/Rect;)LD52;

    move-result-object v0

    invoke-virtual {v0}, LD52;->f()I

    move-result v2

    invoke-virtual {v0}, LD52;->b()I

    move-result v0

    invoke-static {v2, v0}, LH52;->a(II)J

    move-result-wide v7

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->i:LzY3;

    iget-object v4, p0, Landroidx/compose/ui/window/PopupLayout;->j:Lpm2;

    move-wide v2, v7

    invoke-interface/range {v0 .. v6}, LzY3;->calculatePosition-llwVHH4(LD52;JLpm2;J)J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-static {v0, v1}, LA52;->j(J)I

    move-result v3

    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-static {v0, v1}, LA52;->k(J)I

    move-result v0

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->c:LAY3;

    invoke-virtual {v0}, LAY3;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->f:LtY3;

    invoke-static {v7, v8}, LG52;->g(J)I

    move-result v1

    invoke-static {v7, v8}, LG52;->f(J)I

    move-result v2

    invoke-interface {v0, p0, v1, v2}, LtY3;->b(Landroid/view/View;II)V

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/window/PopupLayout;->f:LtY3;

    iget-object v1, p0, Landroidx/compose/ui/window/PopupLayout;->g:Landroid/view/WindowManager;

    iget-object v2, p0, Landroidx/compose/ui/window/PopupLayout;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, p0, v2}, LtY3;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method
