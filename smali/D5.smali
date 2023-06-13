.class public final LD5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aO\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "I",
        "O",
        "Lv5;",
        "contract",
        "Lkotlin/Function1;",
        "",
        "onResult",
        "LTH2;",
        "a",
        "(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;",
        "activity-compose_release"
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
        "SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lv5<",
            "TI;TO;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TO;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)",
            "LTH2<",
            "TI;TO;>;"
        }
    .end annotation

    move-object v6, p0

    move-object/from16 v0, p1

    move-object/from16 v14, p2

    const-string v1, "contract"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onResult"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x53f413f7

    invoke-interface {v14, v1}, LEt0;->F(I)V

    const/16 v1, 0x8

    invoke-static {p0, v14, v1}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v1

    shr-int/lit8 v2, p3, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v0, v14, v2}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v5

    const/4 v0, 0x0

    new-array v7, v0, [Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, LD5$b;->g:LD5$b;

    const/16 v12, 0xc08

    const/4 v13, 0x6

    move-object/from16 v11, p2

    invoke-static/range {v7 .. v13}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "rememberSaveable { UUID.randomUUID().toString() }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    sget-object v0, LOt2;->a:LOt2;

    const/4 v2, 0x6

    invoke-virtual {v0, v14, v2}, LOt2;->a(LEt0;I)LE5;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LE5;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v8

    const v0, -0x384349

    invoke-interface {v14, v0}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_0

    new-instance v2, LC5;

    invoke-direct {v2}, LC5;-><init>()V

    invoke-interface {v14, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    check-cast v2, LC5;

    invoke-interface {v14, v0}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_1

    new-instance v0, LTH2;

    invoke-direct {v0, v2, v1}, LTH2;-><init>(LC5;LsP5;)V

    invoke-interface {v14, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    move-object v9, v0

    check-cast v9, LTH2;

    new-instance v10, LD5$a;

    move-object v0, v10

    move-object v1, v2

    move-object v2, v8

    move-object v3, v7

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, LD5$a;-><init>(LC5;Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;Lv5;LsP5;)V

    const/16 v5, 0x208

    move-object v0, v8

    move-object v1, v7

    move-object v2, p0

    move-object v3, v10

    move-object/from16 v4, p2

    invoke-static/range {v0 .. v5}, LY91;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    return-object v9

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
