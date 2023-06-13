.class public final Lif$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lif;->a(LgV2;Ltm1;Lkotlin/jvm/functions/Function2;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "a",
        "(LgV2;LEt0;I)LgV2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,162:1\n473#2,4:163\n477#2,2:171\n481#2:177\n25#3:167\n36#3:178\n1057#4,3:168\n1060#4,3:174\n1057#4,6:179\n473#5:173\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt$animateContentSize$2\n*L\n79#1:163,4\n79#1:171,2\n79#1:177\n79#1:167\n80#1:178\n79#1:168,3\n79#1:174,3\n80#1:179,6\n79#1:173\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LG52;",
            "LG52;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Ltm1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltm1<",
            "LG52;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Ltm1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LG52;",
            "-",
            "LG52;",
            "Lkotlin/Unit;",
            ">;",
            "Ltm1<",
            "LG52;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lif$b;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lif$b;->h:Ltm1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 4

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3241ea3f

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p3, 0x2e20b340

    invoke-interface {p2, p3}, LEt0;->F(I)V

    const p3, -0x1d58f75c

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_1

    sget-object p3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {p3, p2}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object p3

    new-instance v1, Liu0;

    invoke-direct {v1, p3}, Liu0;-><init>(LZC0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    move-object p3, v1

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p3, Liu0;

    invoke-virtual {p3}, Liu0;->a()LZC0;

    move-result-object p3

    invoke-interface {p2}, LEt0;->Q()V

    iget-object v1, p0, Lif$b;->h:Ltm1;

    const v2, 0x44faf204

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_3

    :cond_2
    new-instance v3, LyB5;

    invoke-direct {v3, v1, p3}, LyB5;-><init>(Llf;LZC0;)V

    invoke-interface {p2, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v3, LyB5;

    iget-object p3, p0, Lif$b;->g:Lkotlin/jvm/functions/Function2;

    invoke-virtual {v3, p3}, LyB5;->k(Lkotlin/jvm/functions/Function2;)V

    invoke-static {p1}, LQk0;->b(LgV2;)LgV2;

    move-result-object p1

    invoke-interface {p1, v3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lif$b;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
