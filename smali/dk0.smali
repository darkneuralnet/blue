.class public final Ldk0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u000c\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u000c8@X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\"\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\u000c8@X\u0080\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000e\"\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\u000c8BX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "d",
        "(LEt0;I)Lkotlin/jvm/functions/Function0;",
        "Landroid/view/View;",
        "f",
        "",
        "a",
        "J",
        "b",
        "()J",
        "TapIndicationDelay",
        "Lik2;",
        "g",
        "(Landroid/view/KeyEvent;)Z",
        "isPress",
        "c",
        "isClick",
        "e",
        "isEnter",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nClickable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,74:1\n76#2:75\n*S KotlinDebug\n*F\n+ 1 Clickable.android.kt\nandroidx/compose/foundation/Clickable_androidKt\n*L\n36#1:75\n*E\n"
    }
.end annotation


# static fields
.field public static final a:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Ldk0;->a:J

    return-void
.end method

.method public static final synthetic a(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Ldk0;->f(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final b()J
    .locals 2

    sget-wide v0, Ldk0;->a:J

    return-wide v0
.end method

.method public static final c(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "$this$isClick"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmk2;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Llk2;->a:Llk2$a;

    invoke-virtual {v1}, Llk2$a;->b()I

    move-result v1

    invoke-static {v0, v1}, Llk2;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ldk0;->e(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(LEt0;I)Lkotlin/jvm/functions/Function0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEt0;",
            "I)",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const v0, -0x76a4c0a8

    invoke-interface {p0, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object p1

    invoke-interface {p0, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance v0, Ldk0$a;

    invoke-direct {v0, p1}, Ldk0$a;-><init>(Landroid/view/View;)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p0}, LEt0;->Q()V

    return-object v0
.end method

.method public static final e(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-static {p0}, Lmk2;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-static {v0, v1}, LWk2;->b(J)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_0

    const/16 v0, 0x42

    if-eq p0, v0, :cond_0

    const/16 v0, 0xa0

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static final f(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final g(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "$this$isPress"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmk2;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Llk2;->a:Llk2$a;

    invoke-virtual {v1}, Llk2$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Llk2;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ldk0;->e(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
