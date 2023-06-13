.class public final Lco/bird/android/widget/actions/SlideToCheckView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/actions/SlideToCheckView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010Q\u001a\u00020P\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010R\u001a\u00020\u0005\u00a2\u0006\u0004\u0008S\u0010TJ\u001e\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u0008\u0010\t\u001a\u00020\u0007H\u0002J\u0008\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0008\u0010\u0014\u001a\u00020\u0007H\u0002J\u0016\u0010\u0016\u001a\u00020\r*\u00020\u000b2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0005H\u0002J\u000c\u0010\u0017\u001a\u00020\r*\u00020\u000bH\u0002J\u000c\u0010\u0018\u001a\u00020\r*\u00020\u000bH\u0002J\u0016\u0010\u001c\u001a\u00020\r*\u00020\u00192\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001d\u001a\u00020\r*\u00020\u00192\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eJ\u0008\u0010!\u001a\u00020\rH\u0016J\u0008\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\rH\u0016R\u0014\u0010\'\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010\u0013R\u0014\u00103\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010\u0013R?\u0010>\u001a\u001f\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\u000c\u00085\u0012\u0008\u00086\u0012\u0004\u0008\u0008(7\u0012\u0004\u0012\u00020\u0007\u0018\u0001048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0016\u0010C\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010AR\u0016\u0010E\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010AR\u0016\u0010G\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010AR$\u0010L\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u001e8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010I\"\u0004\u0008J\u0010KR\u0014\u0010N\u001a\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010MR\u0011\u00107\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010O\u00a8\u0006U"
    }
    d2 = {
        "Lco/bird/android/widget/actions/SlideToCheckView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/widget/Checkable;",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyle",
        "",
        "i",
        "D",
        "A",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "B",
        "l",
        "m",
        "o",
        "n",
        "F",
        "y",
        "padding",
        "v",
        "x",
        "p",
        "Lco/bird/android/widget/actions/SlideToCheckThumbView;",
        "",
        "buffer",
        "r",
        "t",
        "LgE5;",
        "newState",
        "setState",
        "isChecked",
        "toggle",
        "checked",
        "setChecked",
        "b",
        "Lco/bird/android/widget/actions/SlideToCheckThumbView;",
        "thumbView",
        "Lco/bird/android/widget/actions/SlideToCheckBackgroundView;",
        "c",
        "Lco/bird/android/widget/actions/SlideToCheckBackgroundView;",
        "backgroundView",
        "Landroid/widget/TextView;",
        "d",
        "Landroid/widget/TextView;",
        "labelView",
        "e",
        "thumbMargin",
        "f",
        "uncheckedThumbPositionX",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "state",
        "g",
        "Lkotlin/jvm/functions/Function1;",
        "getListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "listener",
        "",
        "h",
        "Ljava/lang/String;",
        "uncheckedText",
        "requestedCheckText",
        "j",
        "checkedText",
        "k",
        "requestedUncheckText",
        "value",
        "LgE5;",
        "E",
        "(LgE5;)V",
        "_state",
        "()F",
        "checkedThumbPositionX",
        "()LgE5;",
        "Landroid/content/Context;",
        "context",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
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
        "SMAP\nSlideToCheckView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideToCheckView.kt\nco/bird/android/widget/actions/SlideToCheckView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

.field public final c:Lco/bird/android/widget/actions/SlideToCheckBackgroundView;

.field public final d:Landroid/widget/TextView;

.field public final e:F

.field public final f:F

.field public g:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LgE5;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:LgE5;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/actions/SlideToCheckView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/widget/actions/SlideToCheckView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget v0, LYf4;->slide_to_check_thumb_margin:I

    invoke-static {p0, v0}, Ltu6;->k(Landroid/view/View;I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->e:F

    iput v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->f:F

    sget v0, Lnl4;->slide_to_unlock:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.string.slide_to_unlock)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->h:Ljava/lang/String;

    sget v0, Lnl4;->unlocking:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.string.unlocking)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->i:Ljava/lang/String;

    sget v0, Lnl4;->slide_to_lock:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.string.slide_to_lock)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->j:Ljava/lang/String;

    sget v0, Lnl4;->locking:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.string.locking)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->k:Ljava/lang/String;

    sget-object v0, LgE5;->b:LgE5;

    iput-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->l:LgE5;

    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    sget v2, LYf4;->slide_to_check_height:I

    invoke-static {p0, v2}, Ltu6;->k(Landroid/view/View;I)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v1, Lmk4;->view_slide_to_check:I

    invoke-static {p1, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, Lzi4;->thumbView:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v1, "findViewById(R.id.thumbView)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/widget/actions/SlideToCheckThumbView;

    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    sget p1, Lzi4;->backgroundView:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v1, "findViewById(R.id.backgroundView)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/widget/actions/SlideToCheckBackgroundView;

    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->c:Lco/bird/android/widget/actions/SlideToCheckBackgroundView;

    sget p1, Lzi4;->label:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v1, "findViewById(R.id.label)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->d:Landroid/widget/TextView;

    new-instance p1, LiE5;

    invoke-direct {p1, p0}, LiE5;-><init>(Lco/bird/android/widget/actions/SlideToCheckView;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p0, p2, p3}, Lco/bird/android/widget/actions/SlideToCheckView;->i(Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    if-ne p1, v0, :cond_0

    sget-object p1, LgE5;->e:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/widget/actions/SlideToCheckView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final C(Lco/bird/android/widget/actions/SlideToCheckView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->A()V

    return-void
.end method

.method public static synthetic e(Lco/bird/android/widget/actions/SlideToCheckView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->z(Lco/bird/android/widget/actions/SlideToCheckView;)V

    return-void
.end method

.method public static synthetic f(Lco/bird/android/widget/actions/SlideToCheckView;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->C(Lco/bird/android/widget/actions/SlideToCheckView;)V

    return-void
.end method

.method public static synthetic g(Lco/bird/android/widget/actions/SlideToCheckView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/widget/actions/SlideToCheckView;->h(Lco/bird/android/widget/actions/SlideToCheckView;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final h(Lco/bird/android/widget/actions/SlideToCheckView;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lco/bird/android/widget/actions/SlideToCheckView;->B(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(Lco/bird/android/widget/actions/SlideToCheckView;Lco/bird/android/widget/actions/SlideToCheckThumbView;FILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x3fc00000    # 1.5f

    mul-float/2addr p2, p3

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/actions/SlideToCheckView;->r(Lco/bird/android/widget/actions/SlideToCheckThumbView;F)Z

    move-result p0

    return p0
.end method

.method public static synthetic u(Lco/bird/android/widget/actions/SlideToCheckView;Lco/bird/android/widget/actions/SlideToCheckThumbView;FILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x3fc00000    # 1.5f

    mul-float/2addr p2, p3

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/actions/SlideToCheckView;->t(Lco/bird/android/widget/actions/SlideToCheckThumbView;F)Z

    move-result p0

    return p0
.end method

.method public static synthetic w(Lco/bird/android/widget/actions/SlideToCheckView;Landroid/view/MotionEvent;IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/actions/SlideToCheckView;->v(Landroid/view/MotionEvent;I)Z

    move-result p0

    return p0
.end method

.method public static final z(Lco/bird/android/widget/actions/SlideToCheckView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LgE5;->e:LgE5;

    goto :goto_0

    :cond_0
    sget-object v0, LgE5;->g:LgE5;

    :goto_0
    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->g:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final B(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->l(Landroid/view/MotionEvent;)Z

    move-result p1

    const-string v0, "Action Outside"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->l(Landroid/view/MotionEvent;)Z

    move-result p1

    const-string v0, "Action Cancel"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->n(Landroid/view/MotionEvent;)Z

    move-result p1

    const-string v0, "Action Move"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->o(Landroid/view/MotionEvent;)Z

    move-result p1

    const-string v0, "Action Up"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->m(Landroid/view/MotionEvent;)Z

    move-result p1

    const-string v0, "Action Down"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    move v1, p1

    :goto_1
    return v1
.end method

.method public final D()V
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    sget-object v1, Lco/bird/android/widget/actions/SlideToCheckView$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LgE5;->d:LgE5;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_1
    sget-object v0, LgE5;->c:LgE5;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    :goto_0
    return-void
.end method

.method public final E(LgE5;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->l:LgE5;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->l:LgE5;

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->c()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->d:Landroid/widget/TextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->d:Landroid/widget/TextView;

    sget-object v1, Lco/bird/android/widget/actions/SlideToCheckView$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->h:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->k:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->j:Ljava/lang/String;

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->i:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->h:Ljava/lang/String;

    goto :goto_0

    :cond_5
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    return-void
.end method

.method public final F(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->x(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    iget v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->e:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setX(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->p(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->e:F

    sub-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setX(F)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->e:F

    iget-object v2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    add-float/2addr v1, v2

    sub-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setX(F)V

    :goto_0
    return-void
.end method

.method public final i(Landroid/util/AttributeSet;I)V
    .locals 3

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LLl4;->SlideToCheckView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, LLl4;->SlideToCheckView_text:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "it"

    if-eqz p2, :cond_0

    :try_start_1
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->h:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->i:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->j:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->k:Ljava/lang/String;

    :cond_0
    sget p2, LLl4;->SlideToCheckView_text_unchecked:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->h:Ljava/lang/String;

    :cond_1
    sget p2, LLl4;->SlideToCheckView_text_requested_to_check:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->i:Ljava/lang/String;

    :cond_2
    sget p2, LLl4;->SlideToCheckView_text_checked:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->j:Ljava/lang/String;

    :cond_3
    sget p2, LLl4;->SlideToCheckView_text_requested_to_uncheck:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/widget/actions/SlideToCheckView;->k:Ljava/lang/String;

    :cond_4
    sget p2, LLl4;->SlideToCheckView_checked:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    sget-object p2, LgE5;->g:LgE5;

    goto :goto_0

    :cond_5
    sget-object p2, LgE5;->e:LgE5;

    :goto_0
    invoke-virtual {p0, p2}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2

    :cond_6
    :goto_1
    return-void
.end method

.method public isChecked()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->b()Z

    move-result v0

    return v0
.end method

.method public final j()F
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->e:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public final k()LgE5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->l:LgE5;

    return-object v0
.end method

.method public final l(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    invoke-virtual {p1}, LgE5;->c()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    invoke-virtual {p1}, LgE5;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, LgE5;->e:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    invoke-virtual {p1}, LgE5;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, LgE5;->g:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_2
    sget-object p1, LgE5;->e:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    :goto_0
    invoke-static {p0}, Landroidx/transition/c;->a(Landroid/view/ViewGroup;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    const/4 p1, 0x1

    return p1
.end method

.method public final m(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    const/4 v0, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->w(Lco/bird/android/widget/actions/SlideToCheckView;Landroid/view/MotionEvent;IILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string v0, "Within bounds to start drag"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    invoke-static {p0}, Landroidx/transition/c;->a(Landroid/view/ViewGroup;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    const/4 v1, 0x2

    invoke-static {p0, v1}, Ltu6;->d(Landroid/view/View;I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->D()V

    goto :goto_0

    :cond_1
    const-string v0, "Not within bounds to start drag"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return p1
.end method

.method public final n(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->F(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v1

    div-float/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float v1, v0, p1

    if-ltz v1, :cond_0

    :goto_0
    move v0, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    cmpg-float v1, v0, p1

    if-gtz v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1
.end method

.method public final o(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    invoke-virtual {p1}, LgE5;->g()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-static {p0, p1, v2, v1, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->s(Lco/bird/android/widget/actions/SlideToCheckView;Lco/bird/android/widget/actions/SlideToCheckThumbView;FILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LgE5;->f:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    invoke-virtual {p1}, LgE5;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-static {p0, p1, v2, v1, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->u(Lco/bird/android/widget/actions/SlideToCheckView;Lco/bird/android/widget/actions/SlideToCheckThumbView;FILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, LgE5;->h:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->y()V

    :goto_0
    invoke-static {p0}, Landroidx/transition/c;->a(Landroid/view/ViewGroup;)V

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p1, v2}, Lcom/google/android/material/card/MaterialCardView;->setCardElevation(F)V

    return v1
.end method

.method public final p(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result p1

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final r(Lco/bird/android/widget/actions/SlideToCheckThumbView;F)Z
    .locals 1

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result p1

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->j()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setChecked(Z)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    sget-object v1, LgE5;->e:LgE5;

    if-ne v0, v1, :cond_0

    sget-object p1, LgE5;->f:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object p1

    sget-object v0, LgE5;->g:LgE5;

    if-ne p1, v0, :cond_1

    sget-object p1, LgE5;->h:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LgE5;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setState(LgE5;)V
    .locals 3

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->l:LgE5;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setState: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->l:LgE5;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/actions/SlideToCheckView;->E(LgE5;)V

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lco/bird/android/widget/actions/SlideToCheckThumbView;->setState(LgE5;Z)V

    invoke-virtual {p1}, LgE5;->c()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, LgE5;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->f:F

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->j()F

    move-result p1

    :goto_0
    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, LhE5;

    invoke-direct {v0, p0}, LhE5;-><init>(Lco/bird/android/widget/actions/SlideToCheckView;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->A()V

    :goto_1
    return-void
.end method

.method public final t(Lco/bird/android/widget/actions/SlideToCheckThumbView;F)Z
    .locals 1

    iget-object p1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result p1

    iget v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->f:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toggle()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LgE5;->f:LgE5;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LgE5;->h:LgE5;

    invoke-virtual {p0, v0}, Lco/bird/android/widget/actions/SlideToCheckView;->setState(LgE5;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v0

    invoke-virtual {v0}, LgE5;->c()Z

    :goto_0
    return-void
.end method

.method public final v(Landroid/view/MotionEvent;I)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v1}, Landroid/view/View;->getX()F

    move-result v1

    int-to-float p2, p2

    sub-float/2addr v1, p2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    add-float/2addr v0, p2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final x(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->e:F

    iget-object v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    add-float/2addr v0, v1

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final y()V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/actions/SlideToCheckView;->b:Lco/bird/android/widget/actions/SlideToCheckThumbView;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->k()LgE5;

    move-result-object v1

    invoke-virtual {v1}, LgE5;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->f:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/actions/SlideToCheckView;->j()F

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-string v1, "thumbView.animate()\n    \u2026sitionX\n        }\n      )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/widget/actions/SlideToCheckView;->d:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v2, "labelView.animate()\n    \u2026lator())\n      .alpha(1f)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v0, LjE5;

    invoke-direct {v0, p0}, LjE5;-><init>(Lco/bird/android/widget/actions/SlideToCheckView;)V

    invoke-virtual {v1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void
.end method
