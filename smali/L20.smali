.class public final LL20;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000c\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "LC20;",
        "b",
        "(LEt0;I)LC20;",
        "LOs4;",
        "Landroid/graphics/Rect;",
        "c",
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
        "SMAP\nBringIntoViewResponder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,48:1\n76#2:49\n36#3:50\n1114#4,6:51\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.android.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponder_androidKt\n*L\n30#1:49\n31#1:50\n31#1:51,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(LOs4;)Landroid/graphics/Rect;
    .locals 0

    invoke-static {p0}, LL20;->c(LOs4;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LEt0;I)LC20;
    .locals 3

    const v0, -0x3d7a14e4

    invoke-interface {p0, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.relocation.rememberDefaultBringIntoViewParent (BringIntoViewResponder.android.kt:28)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object p1

    invoke-interface {p0, p1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    const v0, 0x44faf204

    invoke-interface {p0, v0}, LEt0;->F(I)V

    invoke-interface {p0, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p0}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, LZb;

    invoke-direct {v1, p1}, LZb;-><init>(Landroid/view/View;)V

    invoke-interface {p0, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p0}, LEt0;->Q()V

    check-cast v1, LZb;

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p0}, LEt0;->Q()V

    return-object v1
.end method

.method public static final c(LOs4;)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, LOs4;->i()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0}, LOs4;->l()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, LOs4;->j()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0}, LOs4;->e()F

    move-result p0

    float-to-int p0, p0

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method
