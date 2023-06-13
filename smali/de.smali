.class public final Lde;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u000f\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0008\u0012\u0013\u0012\u00110\t\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00028\u00000\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0019\u0008\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0008\u0010H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00072\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0002\u00a8\u0006\u0019"
    }
    d2 = {
        "LKp6;",
        "T",
        "Lkotlin/Function3;",
        "Landroid/view/LayoutInflater;",
        "Lkotlin/ParameterName;",
        "name",
        "inflater",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "attachToParent",
        "factory",
        "LgV2;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "update",
        "a",
        "(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "viewGroup",
        "",
        "Landroidx/fragment/app/FragmentContainerView;",
        "list",
        "c",
        "ui-viewbinding_release"
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
        "SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,137:1\n25#2:138\n36#2:146\n25#2:153\n36#2:160\n1114#3,6:139\n1114#3,6:147\n1114#3,6:154\n1114#3,6:161\n76#4:145\n76#4:167\n33#5,6:168\n55#6,4:174\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n*L\n64#1:138\n69#1:146\n77#1:153\n78#1:160\n64#1:139,6\n69#1:147,6\n77#1:154,6\n78#1:161,6\n65#1:145\n102#1:167\n103#1:168,6\n130#1:174,4\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "LKp6;",
            ">(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroid/view/LayoutInflater;",
            "-",
            "Landroid/view/ViewGroup;",
            "-",
            "Ljava/lang/Boolean;",
            "+TT;>;",
            "LgV2;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7655255a

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_2

    invoke-interface {p3, p0}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_2
    move v1, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x70

    if-nez v3, :cond_5

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, p4, 0x380

    if-nez v4, :cond_8

    invoke-interface {p3, p2}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit16 v4, v1, 0x2db

    const/16 v5, 0x92

    if-ne v4, v5, :cond_b

    invoke-interface {p3}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LEt0;->k()V

    :cond_a
    :goto_6
    move-object v3, p1

    move-object v4, p2

    goto/16 :goto_b

    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    sget-object p1, LgV2;->b0:LgV2$a;

    :cond_c
    if-eqz v3, :cond_d

    sget-object p2, Lde$a;->g:Lde$a;

    :cond_d
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:58)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_e
    const v0, -0x1d58f75c

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_f

    new-instance v2, Lkt4;

    invoke-direct {v2}, Lkt4;-><init>()V

    invoke-interface {p3, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_f
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v2, Lkt4;

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v4

    invoke-interface {p3, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    const v5, 0x44faf204

    invoke-interface {p3, v5}, LEt0;->F(I)V

    invoke-interface {p3, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_10

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_11

    :cond_10
    :try_start_0
    invoke-static {v4}, LAr6;->a(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_8
    move-object v7, v3

    goto :goto_9

    :catch_0
    const/4 v3, 0x0

    goto :goto_8

    :goto_9
    invoke-interface {p3, v7}, LEt0;->z(Ljava/lang/Object;)V

    :cond_11
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v7, Landroidx/fragment/app/Fragment;

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_12

    invoke-static {}, LGM5;->d()LMM5;

    move-result-object v0

    invoke-interface {p3, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_12
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v0, LMM5;

    invoke-interface {p3, v5}, LEt0;->F(I)V

    invoke-interface {p3, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_13

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_14

    :cond_13
    new-instance v5, Lde$e;

    invoke-direct {v5, v7, p0, v2, v0}, Lde$e;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function3;Lkt4;LMM5;)V

    invoke-interface {p3, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_14
    invoke-interface {p3}, LEt0;->Q()V

    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function1;

    new-instance v4, Lde$b;

    invoke-direct {v4, v2, p2}, Lde$b;-><init>(Lkt4;Lkotlin/jvm/functions/Function1;)V

    and-int/lit8 v5, v1, 0x70

    const/4 v6, 0x0

    move-object v1, v3

    move-object v2, p1

    move-object v3, v4

    move-object v4, p3

    invoke-static/range {v1 .. v6}, Lje;->a(Lkotlin/jvm/functions/Function1;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v1

    invoke-interface {p3, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_a
    if-ge v3, v2, :cond_15

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/FragmentContainerView;

    new-instance v5, Lde$c;

    invoke-direct {v5, v7, v1, v4}, Lde$c;-><init>(Landroidx/fragment/app/Fragment;Landroid/content/Context;Landroidx/fragment/app/FragmentContainerView;)V

    const/16 v6, 0x48

    invoke-static {v1, v4, v5, p3, v6}, LY91;->b(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_15
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    goto/16 :goto_6

    :goto_b
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_16

    goto :goto_c

    :cond_16
    new-instance p2, Lde$d;

    move-object v1, p2

    move-object v2, p0

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lde$d;-><init>(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {p1, p2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_c
    return-void
.end method

.method public static final synthetic b(Landroid/view/ViewGroup;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lde;->c(Landroid/view/ViewGroup;Ljava/util/List;)V

    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/FragmentContainerView;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "getChildAt(index)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lde;->c(Landroid/view/ViewGroup;Ljava/util/List;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
