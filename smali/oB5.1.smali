.class public final LoB5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aU\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aK\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00022\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000e8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000f\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpm0;",
        "targetValue",
        "Llf;",
        "animationSpec",
        "",
        "label",
        "Lkotlin/Function1;",
        "",
        "finishedListener",
        "LsP5;",
        "b",
        "(JLlf;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;",
        "a",
        "(JLlf;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;",
        "LjO5;",
        "LjO5;",
        "colorDefaultSpring",
        "animation_release"
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
        "SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n36#2:111\n1057#3,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:111\n63#1:112,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LjO5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LjO5<",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1, v0}, Lmf;->i(FFLjava/lang/Object;ILjava/lang/Object;)LjO5;

    move-result-object v0

    sput-object v0, LoB5;->a:LjO5;

    return-void
.end method

.method public static final synthetic a(JLlf;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;
    .locals 9
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "animate*AsState APIs now have a new label parameter added."
    .end annotation

    const v0, -0x73c751a7

    invoke-interface {p4, v0}, LEt0;->F(I)V

    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_0

    sget-object p2, LoB5;->a:LjO5;

    :cond_0
    move-object v3, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v5, p3

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, -0x1

    const-string p3, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:75)"

    invoke-static {v0, p5, p2, p3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v4, 0x0

    and-int/lit8 p2, p5, 0xe

    or-int/lit8 p2, p2, 0x40

    shl-int/lit8 p3, p5, 0x3

    and-int/lit16 p3, p3, 0x1c00

    or-int v7, p2, p3

    const/4 v8, 0x4

    move-wide v1, p0

    move-object v6, p4

    invoke-static/range {v1 .. v8}, LoB5;->b(JLlf;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object p0

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p4}, LEt0;->Q()V

    return-object p0
.end method

.method public static final b(JLlf;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Llf<",
            "Lpm0;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpm0;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)",
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation

    move-object v9, p5

    move/from16 v0, p6

    const v1, -0x1aef6ee4

    invoke-interface {p5, v1}, LEt0;->F(I)V

    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_0

    sget-object v2, LoB5;->a:LjO5;

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_1

    const-string v3, "ColorAnimation"

    move-object v4, v3

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    move-object v5, v3

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, -0x1

    const-string v6, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)"

    invoke-static {v1, v0, v3, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p0, p1}, Lpm0;->r(J)LBm0;

    move-result-object v1

    const v3, 0x44faf204

    invoke-interface {p5, v3}, LEt0;->F(I)V

    invoke-interface {p5, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p5}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_5

    :cond_4
    sget-object v1, Lpm0;->b:Lpm0$a;

    invoke-static {v1}, LKm0;->d(Lpm0$a;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {p0, p1}, Lpm0;->r(J)LBm0;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lwb6;

    invoke-interface {p5, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p5}, LEt0;->Q()V

    move-object v1, v3

    check-cast v1, Lwb6;

    invoke-static {p0, p1}, Lpm0;->i(J)Lpm0;

    move-result-object v3

    const/4 v6, 0x0

    and-int/lit8 v7, v0, 0xe

    or-int/lit16 v7, v7, 0x240

    shl-int/lit8 v0, v0, 0x6

    const v8, 0xe000

    and-int/2addr v8, v0

    or-int/2addr v7, v8

    const/high16 v8, 0x70000

    and-int/2addr v0, v8

    or-int/2addr v7, v0

    const/16 v8, 0x8

    move-object v0, v3

    move-object v3, v6

    move-object v6, p5

    invoke-static/range {v0 .. v8}, LJe;->g(Ljava/lang/Object;Lwb6;Llf;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v0

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p5}, LEt0;->Q()V

    return-object v0
.end method
