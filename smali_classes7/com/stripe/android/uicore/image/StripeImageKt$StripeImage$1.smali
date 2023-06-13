.class final Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lh10;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStripeImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeImage.kt\ncom/stripe/android/uicore/image/StripeImageKt$StripeImage$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,120:1\n76#2:121\n25#3:122\n1057#4,6:123\n*S KotlinDebug\n*F\n+ 1 StripeImage.kt\ncom/stripe/android/uicore/image/StripeImageKt$StripeImage$1\n*L\n55#1:121\n57#1:122\n57#1:123,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $colorFilter:Lsm0;

.field final synthetic $contentDescription:Ljava/lang/String;

.field final synthetic $contentScale:LBA0;

.field final synthetic $debugPainter:LnE3;

.field final synthetic $errorContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $loadingContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lh10;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:LgV2;

.field final synthetic $url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lcom/stripe/android/uicore/image/StripeImageLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "LgV2;",
            "LBA0;",
            "Lsm0;",
            "LnE3;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$url:Ljava/lang/String;

    iput p2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$$dirty:I

    iput-object p3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$errorContent:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$loadingContent:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentDescription:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$modifier:LgV2;

    iput-object p7, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentScale:LBA0;

    iput-object p8, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$colorFilter:Lsm0;

    iput-object p9, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$debugPainter:LnE3;

    iput-object p10, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->invoke(Lh10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lh10;LEt0;I)V
    .locals 12

    const-string v0, "$this$BoxWithConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x5b

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-interface {p2}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LEt0;->k()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v3, "com.stripe.android.uicore.image.StripeImage.<anonymous> (StripeImage.kt:53)"

    const v4, 0x1368f3d4

    invoke-static {v4, p3, v0, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, LT32;->a()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1}, Lcom/stripe/android/uicore/image/StripeImageKt;->access$calculateBoxSize(Lh10;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v9

    iget-object v3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$debugPainter:LnE3;

    const v4, -0x1d58f75c

    invoke-interface {p2, v4}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_6

    const/4 v4, 0x0

    if-eqz v0, :cond_5

    if-eqz v3, :cond_5

    new-instance v0, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    invoke-direct {v0, v3}, Lcom/stripe/android/uicore/image/StripeImageState$Success;-><init>(LnE3;)V

    invoke-static {v0, v4, v1, v4}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v0, Lcom/stripe/android/uicore/image/StripeImageState$Loading;->INSTANCE:Lcom/stripe/android/uicore/image/StripeImageState$Loading;

    invoke-static {v0, v4, v1, v4}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    :goto_2
    move-object v4, v0

    invoke-interface {p2, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v4, LEX2;

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$url:Ljava/lang/String;

    new-instance v1, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$1;

    iget-object v6, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v11, 0x0

    move-object v5, v1

    move-object v7, v0

    move-object v10, v4

    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1$1;-><init>(Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;IILEX2;Lkotlin/coroutines/Continuation;)V

    iget v3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$$dirty:I

    and-int/lit8 v3, v3, 0xe

    or-int/lit8 v3, v3, 0x40

    invoke-static {v0, v1, p2, v3}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {v4}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageState;

    sget-object v1, Lcom/stripe/android/uicore/image/StripeImageState$Error;->INSTANCE:Lcom/stripe/android/uicore/image/StripeImageState$Error;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const v0, 0x390649de

    invoke-interface {p2, v0}, LEt0;->F(I)V

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$errorContent:Lkotlin/jvm/functions/Function3;

    and-int/lit8 p3, p3, 0xe

    iget v1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$$dirty:I

    shr-int/2addr v1, v2

    and-int/lit8 v1, v1, 0x70

    or-int/2addr p3, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_3

    :cond_7
    sget-object v1, Lcom/stripe/android/uicore/image/StripeImageState$Loading;->INSTANCE:Lcom/stripe/android/uicore/image/StripeImageState$Loading;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const v0, 0x39064a04

    invoke-interface {p2, v0}, LEt0;->F(I)V

    iget-object v0, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$loadingContent:Lkotlin/jvm/functions/Function3;

    and-int/lit8 p3, p3, 0xe

    iget v1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$$dirty:I

    shr-int/lit8 v1, v1, 0x15

    and-int/lit8 v1, v1, 0x70

    or-int/2addr p3, v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_3

    :cond_8
    instance-of p1, v0, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    if-eqz p1, :cond_9

    const p1, 0x39064a2f

    invoke-interface {p2, p1}, LEt0;->F(I)V

    check-cast v0, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/image/StripeImageState$Success;->getPainter()LnE3;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentDescription:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$modifier:LgV2;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$contentScale:LBA0;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$colorFilter:Lsm0;

    iget p1, p0, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;->$$dirty:I

    shr-int/lit8 p3, p1, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/lit8 p3, p3, 0x8

    shr-int/lit8 v0, p1, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr p3, v0

    const v0, 0xe000

    and-int/2addr v0, p1

    or-int/2addr p3, v0

    const/high16 v0, 0x380000

    shl-int/lit8 p1, p1, 0x3

    and-int/2addr p1, v0

    or-int v9, p3, p1

    const/16 v10, 0x28

    move-object v8, p2

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_3

    :cond_9
    const p1, 0x39064b2c

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->Q()V

    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    :goto_4
    return-void
.end method
