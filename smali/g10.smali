.class public final Lg10;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aF\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0002\u0008\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "LgV2;",
        "modifier",
        "LK9;",
        "contentAlignment",
        "",
        "propagateMinConstraints",
        "Lkotlin/Function1;",
        "Lh10;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "a",
        "(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V",
        "foundation-layout_release"
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
        "SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n50#2:125\n49#2:126\n1057#3,6:127\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n67#1:125\n67#1:126\n67#1:127,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "LK9;",
            "Z",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x6a3450fd

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p5, 0xe

    if-nez v2, :cond_2

    invoke-interface {p4, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p5

    goto :goto_1

    :cond_2
    move v2, p5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p5, 0x70

    if-nez v4, :cond_5

    invoke-interface {p4, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, p5, 0x380

    if-nez v5, :cond_8

    invoke-interface {p4, p2}, LEt0;->o(Z)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v2, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v5, p5, 0x1c00

    if-nez v5, :cond_b

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_6

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v2, v5

    :cond_b
    :goto_7
    and-int/lit16 v5, v2, 0x16db

    const/16 v6, 0x492

    if-ne v5, v6, :cond_e

    invoke-interface {p4}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {p4}, LEt0;->k()V

    :cond_d
    :goto_8
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    goto :goto_a

    :cond_e
    :goto_9
    if-eqz v1, :cond_f

    sget-object p0, LgV2;->b0:LgV2$a;

    :cond_f
    if-eqz v3, :cond_10

    sget-object p1, LK9;->a:LK9$a;

    invoke-virtual {p1}, LK9$a;->n()LK9;

    move-result-object p1

    :cond_10
    const/4 v1, 0x0

    if-eqz v4, :cond_11

    move p2, v1

    :cond_11
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)"

    invoke-static {v0, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_12
    shr-int/lit8 v0, v2, 0x3

    and-int/lit8 v3, v0, 0xe

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v3

    invoke-static {p1, p2, p4, v0}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v0

    const v3, 0x1e7b2b64

    invoke-interface {p4, v3}, LEt0;->F(I)V

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p4, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_13

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_14

    :cond_13
    new-instance v4, Lg10$a;

    invoke-direct {v4, v0, p3, v2}, Lg10$a;-><init>(LxO2;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {p4, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_14
    invoke-interface {p4}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v0, v2, 0xe

    invoke-static {p0, v4, p4, v0, v1}, LYS5;->a(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    goto :goto_8

    :goto_a
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_15

    goto :goto_b

    :cond_15
    new-instance p1, Lg10$b;

    move-object v1, p1

    move-object v5, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lg10$b;-><init>(LgV2;LK9;ZLkotlin/jvm/functions/Function3;II)V

    invoke-interface {p0, p1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method
