.class public final Lcom/skydoves/balloon/Balloon;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/skydoves/balloon/Balloon$a;,
        Lcom/skydoves/balloon/Balloon$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001:\u0002\u0091\u0001B\u001b\u0008\u0002\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0008\u001a\u00020\u0007H\u0002J\u0008\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0008\u0010\u001e\u001a\u00020\u0002H\u0002J\u0008\u0010\u001f\u001a\u00020\u0002H\u0002J\u0008\u0010 \u001a\u00020\u0002H\u0002J\u0008\u0010!\u001a\u00020\u0002H\u0002J\u0008\u0010\"\u001a\u00020\u0002H\u0002J\u0008\u0010#\u001a\u00020\u0002H\u0002J\u0008\u0010$\u001a\u00020\u0002H\u0002J\u0008\u0010%\u001a\u00020\u0002H\u0002J\u0008\u0010\'\u001a\u00020&H\u0002J\u0008\u0010(\u001a\u00020\u0002H\u0002J\u0008\u0010)\u001a\u00020\u0002H\u0002J\u0008\u0010*\u001a\u00020\u0002H\u0002J\u0008\u0010+\u001a\u00020\u0002H\u0002J\n\u0010-\u001a\u0004\u0018\u00010,H\u0002J\u0008\u0010.\u001a\u00020\u0002H\u0002J\u0008\u0010/\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J#\u00103\u001a\u00020\u00022\u0012\u00102\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u000b01\"\u00020\u000bH\u0002\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0002J\u0018\u00109\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000bH\u0002J\u0010\u0010:\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000bH\u0002J$\u0010?\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010=\u001a\u00020\t2\u0008\u0008\u0002\u0010>\u001a\u00020\tH\u0007J\u0006\u0010@\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020&2\u0006\u0010B\u001a\u00020AJ\u0010\u0010F\u001a\u00020\u00022\u0008\u0010E\u001a\u0004\u0018\u00010DJ\u0010\u0010I\u001a\u00020\u00022\u0008\u0010H\u001a\u0004\u0018\u00010GJ\u0010\u0010L\u001a\u00020\u00022\u0008\u0010K\u001a\u0004\u0018\u00010JJ\u0010\u0010O\u001a\u00020\u00022\u0008\u0010N\u001a\u0004\u0018\u00010MJ\u0010\u0010P\u001a\u00020\u00022\u0008\u0010N\u001a\u0004\u0018\u00010MJ \u0010T\u001a\u00020\u00022\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020&0QJ\u0010\u0010W\u001a\u00020\u00022\u0008\u0010V\u001a\u0004\u0018\u00010UJ\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020&J\u0006\u0010Z\u001a\u00020\tJ\u0006\u0010[\u001a\u00020\tJ\u0010\u0010^\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0016J\u0010\u0010_\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0016R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008m\u0010nR\u0017\u0010u\u001a\u00020p8\u0006\u00a2\u0006\u000c\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010tR\u0017\u0010x\u001a\u00020p8\u0006\u00a2\u0006\u000c\n\u0004\u0008v\u0010r\u001a\u0004\u0008w\u0010tR$\u0010|\u001a\u00020&2\u0006\u0010y\u001a\u00020&8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008z\u0010{\u001a\u0004\u0008|\u0010}R\u0016\u0010\u007f\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010{R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u001a\u0005\u0008{\u0010\u0083\u0001R!\u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0086\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001R!\u0010\u008e\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u008b\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u00a8\u0006\u0092\u0001"
    }
    d2 = {
        "Lcom/skydoves/balloon/Balloon;",
        "LVX0;",
        "",
        "N",
        "Landroid/view/ViewGroup;",
        "parent",
        "J",
        "",
        "d0",
        "",
        "Y",
        "Landroid/view/View;",
        "anchor",
        "g0",
        "Landroid/widget/ImageView;",
        "imageView",
        "x",
        "y",
        "Landroid/graphics/Bitmap;",
        "G",
        "Lkotlin/Pair;",
        "X",
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "width",
        "height",
        "Q",
        "H",
        "R",
        "S",
        "i0",
        "o0",
        "l0",
        "n0",
        "j0",
        "q0",
        "r0",
        "k0",
        "",
        "f0",
        "p0",
        "m0",
        "K",
        "L",
        "Landroid/view/animation/Animation;",
        "U",
        "J0",
        "M0",
        "M",
        "",
        "anchors",
        "I0",
        "([Landroid/view/View;)V",
        "t0",
        "Landroid/widget/TextView;",
        "textView",
        "rootView",
        "s0",
        "N0",
        "measuredWidth",
        "b0",
        "xOff",
        "yOff",
        "G0",
        "O",
        "",
        "delay",
        "P",
        "Ldf3;",
        "onBalloonClickListener",
        "v0",
        "Lef3;",
        "onBalloonDismissListener",
        "x0",
        "Lgf3;",
        "onBalloonOutsideTouchListener",
        "z0",
        "Landroid/view/View$OnTouchListener;",
        "onTouchListener",
        "F0",
        "C0",
        "Lkotlin/Function2;",
        "Landroid/view/MotionEvent;",
        "block",
        "D0",
        "Lhf3;",
        "onBalloonOverlayClickListener",
        "A0",
        "value",
        "u0",
        "c0",
        "a0",
        "LLifecycleOwner;",
        "owner",
        "onPause",
        "onDestroy",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/Context;",
        "context",
        "Lcom/skydoves/balloon/Balloon$a;",
        "c",
        "Lcom/skydoves/balloon/Balloon$a;",
        "builder",
        "LZw;",
        "d",
        "LZw;",
        "binding",
        "Lax;",
        "e",
        "Lax;",
        "overlayBinding",
        "Landroid/widget/PopupWindow;",
        "f",
        "Landroid/widget/PopupWindow;",
        "W",
        "()Landroid/widget/PopupWindow;",
        "bodyWindow",
        "g",
        "e0",
        "overlayWindow",
        "<set-?>",
        "h",
        "Z",
        "isShowing",
        "()Z",
        "i",
        "destroyed",
        "Landroid/os/Handler;",
        "j",
        "Lkotlin/Lazy;",
        "()Landroid/os/Handler;",
        "handler",
        "LLq;",
        "k",
        "T",
        "()LLq;",
        "autoDismissRunnable",
        "Lix;",
        "l",
        "V",
        "()Lix;",
        "balloonPersistence",
        "<init>",
        "(Landroid/content/Context;Lcom/skydoves/balloon/Balloon$a;)V",
        "a",
        "balloon_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lcom/skydoves/balloon/Balloon$a;

.field public final d:LZw;

.field public final e:Lax;

.field public final f:Landroid/widget/PopupWindow;

.field public final g:Landroid/widget/PopupWindow;

.field public h:Z

.field public i:Z

.field public final j:Lkotlin/Lazy;

.field public final k:Lkotlin/Lazy;

.field public final l:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/skydoves/balloon/Balloon$a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, LZw;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LZw;

    move-result-object v0

    const-string v3, "inflate(LayoutInflater.from(context), null, false)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, v1, v2}, Lax;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lax;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/skydoves/balloon/Balloon;->e:Lax;

    new-instance v1, Landroid/widget/PopupWindow;

    invoke-virtual {v0}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v2, -0x2

    invoke-direct {v1, v0, v2, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v1, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    new-instance v0, Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Lax;->b()Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    move-result-object p1

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->h0()Lff3;

    sget-object p1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    sget-object p2, Lcom/skydoves/balloon/Balloon$g;->g:Lcom/skydoves/balloon/Balloon$g;

    invoke-static {p1, p2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/skydoves/balloon/Balloon;->j:Lkotlin/Lazy;

    new-instance p2, Lcom/skydoves/balloon/Balloon$c;

    invoke-direct {p2, p0}, Lcom/skydoves/balloon/Balloon$c;-><init>(Lcom/skydoves/balloon/Balloon;)V

    invoke-static {p1, p2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lcom/skydoves/balloon/Balloon;->k:Lkotlin/Lazy;

    new-instance p2, Lcom/skydoves/balloon/Balloon$d;

    invoke-direct {p2, p0}, Lcom/skydoves/balloon/Balloon$d;-><init>(Lcom/skydoves/balloon/Balloon;)V

    invoke-static {p1, p2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/skydoves/balloon/Balloon;->l:Lkotlin/Lazy;

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->N()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/skydoves/balloon/Balloon$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/skydoves/balloon/Balloon;-><init>(Landroid/content/Context;Lcom/skydoves/balloon/Balloon$a;)V

    return-void
.end method

.method public static final synthetic A(Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->t0(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic B(Lcom/skydoves/balloon/Balloon;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/skydoves/balloon/Balloon;->h:Z

    return-void
.end method

.method public static final B0(Lhf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lhf3;->a()V

    :cond_0
    iget-object p0, p1, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon$a;->G()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon;->O()V

    :cond_1
    return-void
.end method

.method public static final varargs synthetic C(Lcom/skydoves/balloon/Balloon;[Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->I0([Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic D(Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->J0()V

    return-void
.end method

.method public static final synthetic E(Lcom/skydoves/balloon/Balloon;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->N0(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static final E0(Lkotlin/jvm/functions/Function2;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic H0(Lcom/skydoves/balloon/Balloon;Landroid/view/View;IIILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/skydoves/balloon/Balloon;->G0(Landroid/view/View;II)V

    return-void
.end method

.method public static final K0(Lcom/skydoves/balloon/Balloon;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LTw;

    invoke-direct {v1, p0}, LTw;-><init>(Lcom/skydoves/balloon/Balloon;)V

    iget-object p0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon$a;->x()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static final L0(Lcom/skydoves/balloon/Balloon;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->U()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object p0, p0, LZw;->b:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Ldf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/skydoves/balloon/Balloon;->w0(Ldf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/skydoves/balloon/Balloon;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/skydoves/balloon/Balloon;->h0(Lcom/skydoves/balloon/Balloon;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;)V

    return-void
.end method

.method public static synthetic d(Lcom/skydoves/balloon/Balloon;Lef3;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/skydoves/balloon/Balloon;->y0(Lcom/skydoves/balloon/Balloon;Lef3;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function2;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/skydoves/balloon/Balloon;->E0(Lkotlin/jvm/functions/Function2;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Lhf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/skydoves/balloon/Balloon;->B0(Lhf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V

    return-void
.end method

.method public static final h0(Lcom/skydoves/balloon/Balloon;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_with"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->H(Landroid/view/View;)V

    sget-object v0, LDo;->b:LDo$a;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->N0()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, LDo$a;->a(LDo;Z)LDo;

    move-result-object v0

    sget-object v1, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {p2, v0}, Landroid/view/View;->setRotation(F)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v2, v2, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-virtual {p2, v0}, Landroid/view/View;->setX(F)V

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->S(Landroid/view/View;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setY(F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LPC1;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {p0, p2, v1, v2}, Lcom/skydoves/balloon/Balloon;->G(Landroid/widget/ImageView;FF)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    :cond_1
    const/high16 v0, -0x3d4c0000    # -90.0f

    invoke-virtual {p2, v0}, Landroid/view/View;->setRotation(F)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-virtual {p2, v0}, Landroid/view/View;->setX(F)V

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->S(Landroid/view/View;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setY(F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LPC1;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getY()F

    move-result v1

    invoke-virtual {p0, p2, v3, v1}, Lcom/skydoves/balloon/Balloon;->G(Landroid/widget/ImageView;FF)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p2, v3}, Landroid/view/View;->setRotation(F)V

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->R(Landroid/view/View;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setX(F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object p1, p1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    int-to-float v0, v1

    add-float/2addr p1, v0

    invoke-virtual {p2, p1}, Landroid/view/View;->setY(F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LPC1;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p0, p2, v1, v3}, Lcom/skydoves/balloon/Balloon;->G(Landroid/widget/ImageView;FF)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_3
    const/high16 v0, 0x43340000    # 180.0f

    invoke-virtual {p2, v0}, Landroid/view/View;->setRotation(F)V

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->R(Landroid/view/View;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/View;->setX(F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object p1, p1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    int-to-float v0, v1

    sub-float/2addr p1, v0

    invoke-virtual {p2, p1}, Landroid/view/View;->setY(F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->i()F

    move-result p1

    invoke-static {p2, p1}, Lbq6;->E0(Landroid/view/View;F)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LPC1;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/View;->getX()F

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v2, v2, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0, p2, v1, v2}, Lcom/skydoves/balloon/Balloon;->G(Landroid/widget/ImageView;FF)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    :goto_0
    iget-object p0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon$a;->P0()Z

    move-result p0

    invoke-static {p2, p0}, LXq6;->f(Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic j(Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->K0(Lcom/skydoves/balloon/Balloon;)V

    return-void
.end method

.method public static synthetic k(Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->L0(Lcom/skydoves/balloon/Balloon;)V

    return-void
.end method

.method public static final synthetic l(Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->K()V

    return-void
.end method

.method public static final synthetic n(Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->L()V

    return-void
.end method

.method public static final synthetic o(Lcom/skydoves/balloon/Balloon;Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->M(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic p(Lcom/skydoves/balloon/Balloon;)LLq;
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->T()LLq;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/skydoves/balloon/Balloon;)Lix;
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->V()Lix;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/skydoves/balloon/Balloon;)LZw;
    .locals 0

    iget-object p0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    return-object p0
.end method

.method public static final synthetic t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;
    .locals 0

    iget-object p0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    return-object p0
.end method

.method public static final synthetic u(Lcom/skydoves/balloon/Balloon;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic v(Lcom/skydoves/balloon/Balloon;)Landroid/os/Handler;
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->Z()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lcom/skydoves/balloon/Balloon;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->f0()Z

    move-result p0

    return p0
.end method

.method public static final w0(Ldf3;Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p2}, Ldf3;->a(Landroid/view/View;)V

    :cond_0
    iget-object p0, p1, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon$a;->E()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon;->O()V

    :cond_1
    return-void
.end method

.method public static final synthetic x(Lcom/skydoves/balloon/Balloon;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->g0(Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic y(Lcom/skydoves/balloon/Balloon;)V
    .locals 0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->j0()V

    return-void
.end method

.method public static final y0(Lcom/skydoves/balloon/Balloon;Lef3;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->M0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->O()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lef3;->a()V

    :cond_0
    return-void
.end method

.method public static final synthetic z(Lcom/skydoves/balloon/Balloon;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/skydoves/balloon/Balloon;->s0(Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final A0(Lhf3;)V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->e:Lax;

    invoke-virtual {v0}, Lax;->b()Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    move-result-object v0

    new-instance v1, LPw;

    invoke-direct {v1, p1, p0}, LPw;-><init>(Lhf3;Lcom/skydoves/balloon/Balloon;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final C0(Landroid/view/View$OnTouchListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public final D0(Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroid/view/View;",
            "-",
            "Landroid/view/MotionEvent;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSw;

    invoke-direct {v0, p1}, LSw;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->C0(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final F0(Landroid/view/View$OnTouchListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public final G(Landroid/widget/ImageView;FF)Landroid/graphics/Bitmap;
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->s()I

    move-result v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v2, v3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const-string v3, "imageView.drawable"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, Lcom/skydoves/balloon/Balloon;->Q(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;

    move-result-object v2

    move/from16 v3, p2

    move/from16 v4, p3

    :try_start_0
    invoke-virtual {p0, v3, v4}, Lcom/skydoves/balloon/Balloon;->X(FF)Lkotlin/Pair;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v4, v2, v6, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    new-instance v13, Landroid/graphics/Paint;

    invoke-direct {v13}, Landroid/graphics/Paint;-><init>()V

    iget-object v5, v0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v5}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v5

    sget-object v6, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v8, 0x2

    if-eq v5, v6, :cond_2

    if-eq v5, v8, :cond_1

    const/4 v6, 0x3

    if-eq v5, v6, :cond_2

    const/4 v6, 0x4

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1
    :goto_0
    new-instance v14, Landroid/graphics/LinearGradient;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    int-to-float v6, v8

    div-float/2addr v5, v6

    iget-object v6, v0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v6}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v7

    add-float/2addr v6, v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v5, v14

    invoke-direct/range {v5 .. v12}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    goto :goto_1

    :cond_2
    new-instance v14, Landroid/graphics/LinearGradient;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    int-to-float v6, v8

    div-float/2addr v5, v6

    iget-object v6, v0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v6}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v7

    sub-float v6, v5, v6

    const/4 v7, 0x0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v8, v5

    const/4 v9, 0x0

    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v5, v14

    invoke-direct/range {v5 .. v12}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    :goto_1
    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    new-instance v5, Landroid/graphics/PorterDuffXfermode;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v13, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v8, v2

    move-object v9, v13

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v2, 0x0

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v1, v2, v4}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    const-string v1, "updatedBitmap"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    :catch_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Arrow attached outside balloon. Could not get a matching color."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final G0(Landroid/view/View;II)V
    .locals 9
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v4, v0, [Landroid/view/View;

    const/4 v0, 0x0

    aput-object p1, v4, v0

    invoke-virtual {p0, p1}, Lcom/skydoves/balloon/Balloon;->M(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/skydoves/balloon/Balloon$j;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v1 .. v8}, Lcom/skydoves/balloon/Balloon$j;-><init>(Lcom/skydoves/balloon/Balloon;Landroid/view/View;[Landroid/view/View;Lcom/skydoves/balloon/Balloon;Landroid/view/View;II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->O()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final H(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->l()LEo;

    move-result-object v0

    sget-object v1, LEo;->c:LEo;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    const/4 p1, 0x2

    new-array p1, p1, [I

    fill-array-data p1, :array_0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v1

    sget-object v2, LDo;->d:LDo;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    aget v1, p1, v3

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    if-ge v1, v4, :cond_1

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    sget-object v0, LDo;->c:LDo;

    invoke-virtual {p1, v0}, Lcom/skydoves/balloon/Balloon$a;->R0(LDo;)Lcom/skydoves/balloon/Balloon$a;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v1

    sget-object v4, LDo;->c:LDo;

    if-ne v1, v4, :cond_2

    aget p1, p1, v3

    iget v0, v0, Landroid/graphics/Rect;->top:I

    if-le p1, v0, :cond_2

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1, v2}, Lcom/skydoves/balloon/Balloon$a;->R0(LDo;)Lcom/skydoves/balloon/Balloon$a;

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->j0()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public final varargs I0([Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->Q0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    aget-object v1, p1, v0

    array-length v2, p1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->e:Lax;

    iget-object p1, p1, Lax;->b:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    invoke-virtual {p1, v1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setAnchorView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->e:Lax;

    iget-object v2, v2, Lax;->b:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setAnchorViewList(Ljava/util/List;)V

    :goto_0
    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->n0()I

    move-result v2

    invoke-virtual {p1, v1, v2, v0, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :cond_1
    return-void
.end method

.method public final J(Landroid/view/ViewGroup;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setFitsSystemWindows(Z)V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Lkotlin/collections/IntIterator;

    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setFitsSystemWindows(Z)V

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {p0, v1}, Lcom/skydoves/balloon/Balloon;->J(Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final J0()V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->b:Landroid/widget/FrameLayout;

    new-instance v1, LRw;

    invoke-direct {v1, p0}, LRw;-><init>(Lcom/skydoves/balloon/Balloon;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final K()V
    .locals 3

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->v()I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->u()LVw;

    move-result-object v0

    sget-object v1, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$2:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Normal_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Overshoot_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Fade_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    const-string v1, "bodyWindow.contentView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->C()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LXq6;->b(Landroid/view/View;J)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Normal_Dispose_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Elastic_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->v()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :goto_0
    return-void
.end method

.method public final L()V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->A()I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->z()Lbx;

    move-result-object v0

    sget-object v1, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$3:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Fade_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    sget v1, Lwl4;->Balloon_Normal_Anim:I

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->v()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :goto_0
    return-void
.end method

.method public final M(Landroid/view/View;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/skydoves/balloon/Balloon;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/skydoves/balloon/Balloon;->i:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    instance-of v2, v0, Landroid/app/Activity;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lbq6;->Y(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v1, v3

    :cond_1
    return v1
.end method

.method public final M0()V
    .locals 3

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "animation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/animation/Animation;->cancel()V

    invoke-virtual {v1}, Landroid/view/animation/Animation;->reset()V

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    return-void
.end method

.method public final N()V
    .locals 2

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->i0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->n0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->o0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->k0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->j0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->m0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->l0()V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    invoke-virtual {v0}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->J(Landroid/view/ViewGroup;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->V()LLifecycleOwner;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    instance-of v1, v0, LLifecycleOwner;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    check-cast v0, LLifecycleOwner;

    invoke-virtual {v1, v0}, Lcom/skydoves/balloon/Balloon$a;->a1(LLifecycleOwner;)Lcom/skydoves/balloon/Balloon$a;

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    check-cast v0, LLifecycleOwner;

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->U()LFq2;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, p0

    :cond_0
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->V()LLifecycleOwner;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->U()LFq2;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v1, p0

    :cond_2
    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final N0(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "getChildAt(index)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v2, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {p0, v2, p1}, Lcom/skydoves/balloon/Balloon;->s0(Landroid/widget/TextView;Landroid/view/View;)V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {p0, v2}, Lcom/skydoves/balloon/Balloon;->N0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final O()V
    .locals 5

    iget-boolean v0, p0, Lcom/skydoves/balloon/Balloon;->h:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/skydoves/balloon/Balloon$f;

    invoke-direct {v0, p0}, Lcom/skydoves/balloon/Balloon$f;-><init>(Lcom/skydoves/balloon/Balloon;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->u()LVw;

    move-result-object v1

    sget-object v2, LVw;->e:LVw;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v1

    const-string v2, "this.bodyWindow.contentView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->C()J

    move-result-wide v2

    new-instance v4, Lcom/skydoves/balloon/Balloon$e;

    invoke-direct {v4, v1, v2, v3, v0}, Lcom/skydoves/balloon/Balloon$e;-><init>(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public final P(J)Z
    .locals 2

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->Z()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->T()LLq;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    return p1
.end method

.method public final Q(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;
    .locals 3

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    new-instance p3, Landroid/graphics/Canvas;

    invoke-direct {p3, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {p3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    const-string p1, "bitmap"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method public final R(Landroid/view/View;)F
    .locals 7

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->e:Landroid/widget/FrameLayout;

    const-string v1, "binding.balloonContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LXq6;->e(Landroid/view/View;)Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->x:I

    invoke-static {p1}, LXq6;->e(Landroid/view/View;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->d0()F

    move-result v2

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->c0()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v2

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->Y()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->X()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->n()LFo;

    move-result-object v4

    sget-object v5, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$1:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_5

    const/4 v5, 0x2

    if-ne v4, v5, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v4, v1

    if-ge v4, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->c0()I

    move-result v4

    add-int/2addr v4, v0

    if-ge v4, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->m()F

    move-result v4

    mul-float/2addr p1, v4

    int-to-float v1, v1

    add-float/2addr p1, v1

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v6

    sub-float/2addr p1, v0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->Y()I

    move-result v0

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->c0()I

    move-result v0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->Y()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_3
    move v2, p1

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object p1, p1, LZw;->g:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->m()F

    move-result v0

    mul-float/2addr p1, v0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v6

    sub-float v2, p1, v0

    :goto_1
    return v2
.end method

.method public final S(Landroid/view/View;)F
    .locals 8

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->O0()Z

    move-result v0

    invoke-static {p1, v0}, LXq6;->d(Landroid/view/View;Z)I

    move-result v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->e:Landroid/widget/FrameLayout;

    const-string v2, "binding.balloonContent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LXq6;->e(Landroid/view/View;)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->y:I

    sub-int/2addr v1, v0

    invoke-static {p1}, LXq6;->e(Landroid/view/View;)Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    sub-int/2addr v2, v0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->d0()F

    move-result v0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->a0()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->Z()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->W()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v4

    const/4 v5, 0x2

    div-int/2addr v4, v5

    iget-object v6, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v6}, Lcom/skydoves/balloon/Balloon$a;->n()LFo;

    move-result-object v6

    sget-object v7, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$1:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_5

    if-ne v6, v5, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v5, v2

    if-ge v5, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->a0()I

    move-result v5

    add-int/2addr v5, v1

    if-ge v5, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v5, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v5}, Lcom/skydoves/balloon/Balloon$a;->m()F

    move-result v5

    mul-float/2addr p1, v5

    int-to-float v2, v2

    add-float/2addr p1, v2

    int-to-float v1, v1

    sub-float/2addr p1, v1

    int-to-float v1, v4

    sub-float/2addr p1, v1

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->Y()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->a0()I

    move-result v0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->Y()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_3
    move v0, p1

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object p1, p1, LZw;->g:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->m()F

    move-result v0

    mul-float/2addr p1, v0

    int-to-float v0, v4

    sub-float v0, p1, v0

    :goto_1
    return v0
.end method

.method public final T()LLq;
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->k:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LLq;

    return-object v0
.end method

.method public final U()Landroid/view/animation/Animation;
    .locals 6

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->y()I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_d

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->w()LXw;

    move-result-object v0

    sget-object v1, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$4:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v0, v4, :cond_7

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->B()Ljx;

    return-object v2

    :cond_1
    sget v0, Lbf4;->balloon_fade:I

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v0

    sget-object v5, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    if-eq v0, v4, :cond_6

    if-eq v0, v3, :cond_5

    if-eq v0, v2, :cond_4

    if-ne v0, v1, :cond_3

    sget v0, Lbf4;->balloon_shake_left:I

    goto :goto_0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    sget v0, Lbf4;->balloon_shake_right:I

    goto :goto_0

    :cond_5
    sget v0, Lbf4;->balloon_shake_bottom:I

    goto :goto_0

    :cond_6
    sget v0, Lbf4;->balloon_shake_top:I

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->P0()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v0

    sget-object v5, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    if-eq v0, v4, :cond_b

    if-eq v0, v3, :cond_a

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    sget v0, Lbf4;->balloon_heartbeat_left:I

    goto :goto_0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    sget v0, Lbf4;->balloon_heartbeat_right:I

    goto :goto_0

    :cond_a
    sget v0, Lbf4;->balloon_heartbeat_bottom:I

    goto :goto_0

    :cond_b
    sget v0, Lbf4;->balloon_heartbeat_top:I

    goto :goto_0

    :cond_c
    sget v0, Lbf4;->balloon_heartbeat_center:I

    goto :goto_0

    :cond_d
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->y()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    return-object v0
.end method

.method public final V()Lix;
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lix;

    return-object v0
.end method

.method public final W()Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public final X(FF)Lkotlin/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v1, "binding.balloonCard.background"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v3, v3, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p0, v0, v1, v3}, Lcom/skydoves/balloon/Balloon;->Q(Landroid/graphics/drawable/Drawable;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v1

    sget-object v3, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    float-to-int p1, p1

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v3

    add-float/2addr v1, p2

    float-to-int v1, v1

    invoke-virtual {v0, p1, v1}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v3

    sub-float/2addr p2, v2

    float-to-int p2, p2

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result p1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v3

    add-float/2addr v1, p1

    float-to-int v1, v1

    float-to-int p2, p2

    invoke-virtual {v0, v1, p2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v3

    sub-float/2addr p1, v2

    float-to-int p1, p1

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result p1

    :goto_1
    new-instance p2, Lkotlin/Pair;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public final Y()I
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final Z()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->j:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method public final a0()I
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->K()I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->K()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    invoke-virtual {v0}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method public final b0(ILandroid/view/View;)I
    .locals 6

    new-instance v0, Landroid/graphics/Point;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iget v0, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    add-int/2addr v1, p2

    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->M()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->R()I

    move-result p2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->Q()I

    move-result v3

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->Y()I

    move-result p2

    add-int/2addr p2, v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->X()I

    move-result v3

    add-int/2addr p2, v3

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    :goto_0
    add-int/2addr p2, v3

    add-int/2addr v1, p2

    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->a0()I

    move-result p2

    sub-int/2addr p2, v1

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->K0()F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    const/4 v5, 0x1

    if-nez v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-nez v3, :cond_2

    int-to-float p1, v0

    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->K0()F

    move-result p2

    mul-float/2addr p1, p2

    float-to-int p1, p1

    :goto_2
    sub-int/2addr p1, v1

    goto :goto_7

    :cond_2
    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->d0()F

    move-result v3

    cmpg-float v3, v3, v4

    if-nez v3, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    move v3, v2

    :goto_3
    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->b0()F

    move-result v3

    cmpg-float v3, v3, v4

    if-nez v3, :cond_4

    move v3, v5

    goto :goto_4

    :cond_4
    move v3, v2

    :goto_4
    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->J0()I

    move-result v2

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_6

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->J0()I

    move-result v2

    if-gt v2, v0, :cond_6

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->J0()I

    move-result p1

    goto :goto_2

    :cond_6
    invoke-static {p1, p2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result p1

    goto :goto_7

    :cond_7
    :goto_5
    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->b0()F

    move-result p2

    cmpg-float p2, p2, v4

    if-nez p2, :cond_8

    move v2, v5

    :cond_8
    if-nez v2, :cond_9

    iget-object p2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p2}, Lcom/skydoves/balloon/Balloon$a;->b0()F

    move-result p2

    goto :goto_6

    :cond_9
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_6
    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int p2, v0

    sub-int/2addr p2, v1

    invoke-static {p1, p2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result p1

    :goto_7
    return p1
.end method

.method public final c0()I
    .locals 5

    new-instance v0, Landroid/graphics/Point;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->K0()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    if-nez v1, :cond_1

    int-to-float v0, v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->K0()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto/16 :goto_6

    :cond_1
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->d0()F

    move-result v1

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    move v1, v4

    :goto_1
    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->b0()F

    move-result v1

    cmpg-float v1, v1, v2

    if-nez v1, :cond_3

    move v1, v3

    goto :goto_2

    :cond_3
    move v1, v4

    :goto_2
    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->J0()I

    move-result v1

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_5

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->J0()I

    move-result v1

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    goto :goto_6

    :cond_5
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    invoke-virtual {v0}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->c0()I

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->a0()I

    move-result v2

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    goto :goto_6

    :cond_6
    :goto_3
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->b0()F

    move-result v1

    cmpg-float v1, v1, v2

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    move v3, v4

    :goto_4
    if-nez v3, :cond_8

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->b0()F

    move-result v1

    goto :goto_5

    :cond_8
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_5
    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    invoke-virtual {v2}, LZw;->b()Landroid/widget/FrameLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v0, v0

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->d0()F

    move-result v3

    mul-float/2addr v3, v0

    float-to-int v3, v3

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v2, v3, v0}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    :goto_6
    return v0
.end method

.method public final d0()F
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->d()F

    move-result v1

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->c()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method public final e0()Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method public final f0()Z
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->T()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->S()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final g0(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->c:Landroidx/appcompat/widget/AppCompatImageView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->b()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->h()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->j()I

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->q()I

    move-result v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->o()I

    move-result v3

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->e()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->f()I

    move-result v1

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->f()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {v0, v1}, LxY1;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->s()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {v0, v1}, LxY1;->c(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    :goto_0
    sget-object v1, Landroid/view/ViewOutlineProvider;->BOUNDS:Landroid/view/ViewOutlineProvider;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    new-instance v2, LOw;

    invoke-direct {v2, p0, p1, v0}, LOw;-><init>(Lcom/skydoves/balloon/Balloon;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final i0()V
    .locals 5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->b()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->D()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/radius/RadiusLayout;->setRadius(F)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->J()F

    move-result v1

    invoke-static {v0, v1}, Lbq6;->E0(Landroid/view/View;F)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->t()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->s()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->D()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->t0()I

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->v0()I

    move-result v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->u0()I

    move-result v3

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->s0()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public final j0()V
    .locals 6

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->p()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->J()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v3, v3, LZw;->e:Landroid/widget/FrameLayout;

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->k()LDo;

    move-result-object v4

    sget-object v5, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v1, :cond_3

    const/4 v1, 0x2

    if-eq v4, v1, :cond_2

    const/4 v1, 0x3

    if-eq v4, v1, :cond_1

    const/4 v1, 0x4

    if-eq v4, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0, v2, v0, v2}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    :cond_1
    invoke-virtual {v3, v0, v2, v0, v2}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    :cond_2
    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    invoke-virtual {v3, v2, v0, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    :cond_3
    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    invoke-virtual {v3, v2, v0, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    :goto_0
    return-void
.end method

.method public final k0()V
    .locals 1

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->p0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->q0()V

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->r0()V

    :goto_0
    return-void
.end method

.method public final l0()V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->f0()Ldf3;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->v0(Ldf3;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->g0()Lef3;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->x0(Lef3;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->i0()Lgf3;

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->z0(Lgf3;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->l0()Landroid/view/View$OnTouchListener;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/skydoves/balloon/Balloon;->F0(Landroid/view/View$OnTouchListener;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->j0()Lhf3;

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->A0(Lhf3;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->k0()Landroid/view/View$OnTouchListener;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->C0(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final m0()V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->Q0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->e:Lax;

    iget-object v0, v0, Lax;->b:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->m0()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setOverlayColor(I)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->o0()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setOverlayPadding(F)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->q0()Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setOverlayPosition(Landroid/graphics/Point;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->r0()Lhx;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setBalloonOverlayShape(Lhx;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->p0()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;->setOverlayPaddingColor(I)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    :cond_0
    return-void
.end method

.method public final n0()V
    .locals 5

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->X()I

    move-result v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v2}, Lcom/skydoves/balloon/Balloon$a;->Z()I

    move-result v2

    iget-object v3, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v3}, Lcom/skydoves/balloon/Balloon$a;->Y()I

    move-result v3

    iget-object v4, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v4}, Lcom/skydoves/balloon/Balloon$a;->W()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    return-void
.end method

.method public final o0()V
    .locals 3

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->M0()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->J()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setElevation(F)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->L0()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->u0(Z)Lcom/skydoves/balloon/Balloon;

    return-void
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/skydoves/balloon/Balloon;->i:Z

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->g:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->V()LLifecycleOwner;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->d(LFq2;)V

    :cond_0
    return-void
.end method

.method public onPause(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onPause(LLifecycleOwner;)V

    iget-object p1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {p1}, Lcom/skydoves/balloon/Balloon$a;->F()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/skydoves/balloon/Balloon;->O()V

    :cond_0
    return-void
.end method

.method public final p0()V
    .locals 4

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->T()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v2, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v2, v2, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->S()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_2

    check-cast v1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    const-string v1, "binding.balloonCard"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->N0(Landroid/view/ViewGroup;)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The custom layout is null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final q0()V
    .locals 3

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->f:Lcom/skydoves/balloon/vectortext/VectorTextView;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->N()LzP1;

    move-result-object v1

    const-string v2, ""

    if-eqz v1, :cond_0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LV26;->b(Lcom/skydoves/balloon/vectortext/VectorTextView;LzP1;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LzP1$a;

    invoke-direct {v2, v1}, LzP1$a;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->M()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, LzP1$a;->i(Landroid/graphics/drawable/Drawable;)LzP1$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->R()I

    move-result v1

    invoke-virtual {v2, v1}, LzP1$a;->n(I)LzP1$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->P()I

    move-result v1

    invoke-virtual {v2, v1}, LzP1$a;->l(I)LzP1$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->L()I

    move-result v1

    invoke-virtual {v2, v1}, LzP1$a;->k(I)LzP1$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->Q()I

    move-result v1

    invoke-virtual {v2, v1}, LzP1$a;->m(I)LzP1$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->O()LBP1;

    move-result-object v1

    invoke-virtual {v2, v1}, LzP1$a;->j(LBP1;)LzP1$a;

    invoke-virtual {v2}, LzP1$a;->a()LzP1;

    move-result-object v1

    invoke-static {v0, v1}, LV26;->b(Lcom/skydoves/balloon/vectortext/VectorTextView;LzP1;)V

    :cond_1
    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->N0()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/skydoves/balloon/vectortext/VectorTextView;->g(Z)V

    return-void
.end method

.method public final r0()V
    .locals 3

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->f:Lcom/skydoves/balloon/vectortext/VectorTextView;

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->D0()LI16;

    move-result-object v1

    const-string v2, ""

    if-eqz v1, :cond_0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LV26;->c(Landroid/widget/TextView;LI16;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LI16$a;

    invoke-direct {v2, v1}, LI16$a;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->B0()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v2, v1}, LI16$a;->j(Ljava/lang/CharSequence;)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->G0()F

    move-result v1

    invoke-virtual {v2, v1}, LI16$a;->n(F)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->C0()I

    move-result v1

    invoke-virtual {v2, v1}, LI16$a;->k(I)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->F0()Z

    move-result v1

    invoke-virtual {v2, v1}, LI16$a;->m(Z)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->E0()I

    move-result v1

    invoke-virtual {v2, v1}, LI16$a;->l(I)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->H0()I

    move-result v1

    invoke-virtual {v2, v1}, LI16$a;->o(I)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->I0()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v2, v1}, LI16$a;->p(Landroid/graphics/Typeface;)LI16$a;

    invoke-static {p0}, Lcom/skydoves/balloon/Balloon;->t(Lcom/skydoves/balloon/Balloon;)Lcom/skydoves/balloon/Balloon$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/skydoves/balloon/Balloon$a;->e0()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    invoke-virtual {v2}, LI16$a;->a()LI16;

    move-result-object v1

    invoke-static {v0, v1}, LV26;->c(Landroid/widget/TextView;LI16;)V

    :cond_1
    const-string v1, "this"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v1, v1, LZw;->d:Lcom/skydoves/balloon/radius/RadiusLayout;

    const-string v2, "binding.balloonCard"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/skydoves/balloon/Balloon;->s0(Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method

.method public final s0(Landroid/widget/TextView;Landroid/view/View;)V
    .locals 4

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "compoundDrawablesRelative"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LT61;->e([Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LT61;->b([Landroid/graphics/drawable/Drawable;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LT61;->c([Landroid/graphics/drawable/Drawable;)I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundPaddingStart()I

    move-result v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundPaddingEnd()I

    move-result v3

    :goto_0
    add-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "compoundDrawables"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LT61;->e([Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LT61;->b([Landroid/graphics/drawable/Drawable;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LT61;->c([Landroid/graphics/drawable/Drawable;)I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundPaddingStart()I

    move-result v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundPaddingEnd()I

    move-result v3

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0, v0, p2}, Lcom/skydoves/balloon/Balloon;->b0(ILandroid/view/View;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setMaxWidth(I)V

    return-void
.end method

.method public final t0(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->c:Lcom/skydoves/balloon/Balloon$a;

    invoke-virtual {v0}, Lcom/skydoves/balloon/Balloon$a;->w0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/skydoves/balloon/Balloon$h;

    invoke-direct {v0, p1}, Lcom/skydoves/balloon/Balloon$h;-><init>(Landroid/view/View;)V

    invoke-virtual {p0, v0}, Lcom/skydoves/balloon/Balloon;->D0(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final u0(Z)Lcom/skydoves/balloon/Balloon;
    .locals 1

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAttachedInDecor(Z)V

    return-object p0
.end method

.method public final v0(Ldf3;)V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->d:LZw;

    iget-object v0, v0, LZw;->g:Landroid/widget/FrameLayout;

    new-instance v1, LNw;

    invoke-direct {v1, p1, p0}, LNw;-><init>(Ldf3;Lcom/skydoves/balloon/Balloon;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final x0(Lef3;)V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    new-instance v1, LQw;

    invoke-direct {v1, p0, p1}, LQw;-><init>(Lcom/skydoves/balloon/Balloon;Lef3;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method

.method public final z0(Lgf3;)V
    .locals 2

    iget-object v0, p0, Lcom/skydoves/balloon/Balloon;->f:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/skydoves/balloon/Balloon$i;

    invoke-direct {v1, p0, p1}, Lcom/skydoves/balloon/Balloon$i;-><init>(Lcom/skydoves/balloon/Balloon;Lgf3;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    return-void
.end method
