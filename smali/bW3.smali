.class public final LbW3;
.super Lob5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0015"
    }
    d2 = {
        "LbW3;",
        "Lob5;",
        "Le62;",
        "interactionSource",
        "",
        "bounded",
        "Lk61;",
        "radius",
        "LsP5;",
        "Lpm0;",
        "color",
        "Lpb5;",
        "rippleAlpha",
        "Lvb5;",
        "b",
        "(Le62;ZFLsP5;LsP5;LEt0;I)Lvb5;",
        "Landroid/view/ViewGroup;",
        "c",
        "(LEt0;I)Landroid/view/ViewGroup;",
        "<init>",
        "(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "material-ripple_release"
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
        "SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,253:1\n50#2:254\n49#2:255\n67#2,3:262\n66#2:265\n1057#3,6:256\n1057#3,6:266\n76#4:272\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n68#1:254\n68#1:255\n91#1:262,3\n91#1:265\n68#1:256,6\n91#1:266,6\n106#1:272\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>(ZFLsP5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "LsP5<",
            "Lpm0;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lob5;-><init>(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LbW3;-><init>(ZFLsP5;)V

    return-void
.end method


# virtual methods
.method public b(Le62;ZFLsP5;LsP5;LEt0;I)Lvb5;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le62;",
            "ZF",
            "LsP5<",
            "Lpm0;",
            ">;",
            "LsP5<",
            "Lpb5;",
            ">;",
            "LEt0;",
            "I)",
            "Lvb5;"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p6

    move/from16 v3, p7

    const-string v4, "interactionSource"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "color"

    move-object/from16 v8, p4

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "rippleAlpha"

    move-object/from16 v9, p5

    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x13be9e37

    invoke-interface {v2, v4}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, -0x1

    const-string v6, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)"

    invoke-static {v4, v3, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 v3, v3, 0xf

    and-int/lit8 v3, v3, 0xe

    invoke-virtual {p0, v2, v3}, LbW3;->c(LEt0;I)Landroid/view/ViewGroup;

    move-result-object v3

    const v4, 0x61f244d6

    invoke-interface {v2, v4}, LEt0;->F(I)V

    invoke-virtual {v3}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    if-eqz v4, :cond_4

    const v3, 0x1e7b2b64

    invoke-interface {v2, v3}, LEt0;->F(I)V

    invoke-interface {v2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface/range {p6 .. p6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_2

    :cond_1
    new-instance v3, LAp0;

    const/4 v10, 0x0

    move-object v5, v3

    move v6, p2

    move v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v5 .. v10}, LAp0;-><init>(ZFLsP5;LsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    check-cast v3, LAp0;

    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    return-object v3

    :cond_4
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_6

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    instance-of v7, v6, Landroidx/compose/material/ripple/RippleContainer;

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_7

    new-instance v6, Landroidx/compose/material/ripple/RippleContainer;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "view.context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v4}, Landroidx/compose/material/ripple/RippleContainer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_7
    const v3, 0x607fb4c4

    invoke-interface {v2, v3}, LEt0;->F(I)V

    invoke-interface {v2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface {v2, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-interface/range {p6 .. p6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_9

    :cond_8
    new-instance v3, LFd;

    move-object v10, v6

    check-cast v10, Landroidx/compose/material/ripple/RippleContainer;

    const/4 v11, 0x0

    move-object v5, v3

    move v6, p2

    move v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v5 .. v11}, LFd;-><init>(ZFLsP5;LsP5;Landroidx/compose/material/ripple/RippleContainer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    check-cast v3, LFd;

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    invoke-interface/range {p6 .. p6}, LEt0;->Q()V

    return-object v3
.end method

.method public final c(LEt0;I)Landroid/view/ViewGroup;
    .locals 3

    const v0, -0x67961d31

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    :goto_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-nez v0, :cond_2

    move-object v0, p2

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1

    const-string p2, "parent"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p2, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Couldn\'t find a valid parent for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    check-cast p2, Landroid/view/ViewGroup;

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method
