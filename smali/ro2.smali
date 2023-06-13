.class public final Lro2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a0\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\u0008\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "LCo2;",
        "state",
        "Lkotlin/Function1;",
        "Lyo2;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "Lpo2;",
        "a",
        "(LCo2;Lkotlin/jvm/functions/Function1;LEt0;I)Lpo2;",
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
        "SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n1114#3,6:105\n1114#3,6:113\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:104\n51#1:111\n51#1:112\n46#1:105,6\n51#1:113,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LCo2;Lkotlin/jvm/functions/Function1;LEt0;I)Lpo2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCo2;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lyo2;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)",
            "Lpo2;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x739a4a8b

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.rememberLazyListItemProvider (LazyListItemProvider.kt:39)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, p2, p3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p1

    const p3, 0x44faf204

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_1

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    new-instance v0, Lro2$c;

    invoke-direct {v0, p0}, Lro2$c;-><init>(LCo2;)V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    sget-object p3, Lro2$d;->g:Lro2$d;

    sget-object v1, Lro2$e;->g:Lro2$e;

    const/16 v2, 0x1b0

    invoke-static {v0, p3, v1, p2, v2}, LIo2;->c(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;

    move-result-object p3

    const v0, 0x1e7b2b64

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    :cond_3
    new-instance v0, LMn2;

    invoke-direct {v0}, LMn2;-><init>()V

    new-instance v1, Lro2$b;

    invoke-direct {v1, p1, p3, v0, p0}, Lro2$b;-><init>(LsP5;LsP5;LMn2;LCo2;)V

    invoke-static {v1}, LGM5;->c(Lkotlin/jvm/functions/Function0;)LsP5;

    move-result-object p0

    new-instance v1, Lro2$a;

    invoke-direct {v1, p0}, Lro2$a;-><init>(LsP5;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v1, Lro2$a;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {p2}, LEt0;->Q()V

    return-object v1
.end method
