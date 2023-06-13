.class final Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LPm0;",
        "",
        "invoke",
        "(LPm0;LEt0;I)V",
        "<anonymous>"
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
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,276:1\n154#2:277\n67#3,6:278\n73#3:310\n77#3:315\n75#4:284\n76#4,11:286\n89#4:314\n76#5:285\n460#6,13:297\n473#6,3:311\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1\n*L\n98#1:277\n98#1:278,6\n98#1:310\n98#1:315\n98#1:284\n98#1:286,11\n98#1:314\n98#1:285\n98#1:297,13\n98#1:311,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-1$1;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 7

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.link.ComposableSingletons$LinkActivityKt.lambda-1.<anonymous> (LinkActivity.kt:94)"

    const v1, 0x85bf267

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object p1, LgV2;->b0:LgV2$a;

    const/4 p3, 0x1

    int-to-float v0, p3

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, p3, v1}, LBB5;->h(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object p1

    const p3, 0x2bb5b5d7

    invoke-interface {p2, p3}, LEt0;->F(I)V

    sget-object p3, LK9;->a:LK9$a;

    invoke-virtual {p3}, LK9$a;->n()LK9;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p3, v0, p2, v0}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object p3

    const v1, -0x4ee9b9da

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v1

    invoke-interface {p2, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v3

    invoke-interface {p2, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJq6;

    sget-object v4, LBt0;->M:LBt0$a;

    invoke-virtual {v4}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static {p1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object p1

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p2, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p2}, LEt0;->e()V

    :goto_1
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual {v4}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, p3, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {v5, v1, p3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {v5, v2, p3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {v5, v3, p3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object p3

    invoke-static {p3}, LMB5;->a(LEt0;)LMB5;

    move-result-object p3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p3, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p1, 0x7ab4aae9

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const p1, -0x7f65a980

    invoke-interface {p2, p1}, LEt0;->F(I)V

    sget-object p1, Lf10;->a:Lf10;

    const p1, 0x171f5a21

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method
