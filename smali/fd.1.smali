.class public final Lfd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "LDA3;",
        "b",
        "(LEt0;I)LDA3;",
        "LgV2;",
        "a",
        "LgV2;",
        "StretchOverscrollNonClippingLayer",
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
        "SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,589:1\n76#2:590\n76#2:591\n50#3:592\n49#3:593\n1114#4,6:594\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt\n*L\n64#1:590\n65#1:591\n67#1:592\n67#1:593\n67#1:594,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LgV2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, LgV2;->b0:LgV2$a;

    sget-object v1, Lfd$a;->g:Lfd$a;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/b;->a(LgV2;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object v0

    sget-object v1, Lfd$b;->g:Lfd$b;

    invoke-static {v0, v1}, Landroidx/compose/ui/layout/b;->a(LgV2;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    :goto_0
    sput-object v0, Lfd;->a:LgV2;

    return-void
.end method

.method public static final synthetic a()LgV2;
    .locals 1

    sget-object v0, Lfd;->a:LgV2;

    return-object v0
.end method

.method public static final b(LEt0;I)LDA3;
    .locals 3

    const v0, -0x4d61273

    invoke-interface {p0, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object p1

    invoke-interface {p0, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {}, LCA3;->a()LU94;

    move-result-object v0

    invoke-interface {p0, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBA3;

    if-eqz v0, :cond_3

    const v1, 0x1e7b2b64

    invoke-interface {p0, v1}, LEt0;->F(I)V

    invoke-interface {p0, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p0, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p0}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, LEc;

    invoke-direct {v2, p1, v0}, LEc;-><init>(Landroid/content/Context;LBA3;)V

    invoke-interface {p0, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p0}, LEt0;->Q()V

    check-cast v2, LDA3;

    goto :goto_0

    :cond_3
    sget-object v2, Lw83;->a:Lw83;

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p0}, LEt0;->Q()V

    return-object v2
.end method
