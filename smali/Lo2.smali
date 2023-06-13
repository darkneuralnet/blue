.class public final LLo2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "LGn2;",
        "state",
        "",
        "reverseScrolling",
        "Ldo2;",
        "a",
        "(LGn2;ZLEt0;I)Ldo2;",
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
        "SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n50#2:53\n49#2:54\n1114#3,6:55\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:53\n32#1:54\n32#1:55,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LGn2;ZLEt0;I)Ldo2;
    .locals 3

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4a53d505

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:27)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const p3, 0x1e7b2b64

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p1, p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_1

    sget-object p1, LEt0;->a:LEt0$a;

    invoke-virtual {p1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p3, p1, :cond_2

    :cond_1
    new-instance p3, LLo2$a;

    invoke-direct {p3, p0}, LLo2$a;-><init>(LGn2;)V

    invoke-interface {p2, p3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p3, LLo2$a;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    return-object p3
.end method
