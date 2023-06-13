.class final Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;
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
        "LAY2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LAY2;",
        "it",
        "",
        "invoke",
        "(LAY2;LEt0;I)V",
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
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,276:1\n68#2,5:277\n73#2:308\n77#2:313\n75#3:282\n76#3,11:284\n89#3:312\n76#4:283\n460#5,13:295\n473#5,3:309\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1\n*L\n143#1:277,5\n143#1:308\n143#1:313\n143#1:282\n143#1:284,11\n143#1:312\n143#1:283\n143#1:295,13\n143#1:309,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;

    invoke-direct {v0}, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;->INSTANCE:Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;

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

    check-cast p1, LAY2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt$lambda-2$1;->invoke(LAY2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LAY2;LEt0;I)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.link.ComposableSingletons$LinkActivityKt.lambda-2.<anonymous> (LinkActivity.kt:141)"

    const v1, -0x2134b44a

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, LgV2;->b0:LgV2$a;

    const/4 p3, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p3, v0, v1}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object p1

    invoke-static {p1, p3, v0, v1}, LBB5;->j(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object p1

    sget-object p3, LK9;->a:LK9$a;

    invoke-virtual {p3}, LK9$a;->e()LK9;

    move-result-object p3

    const v0, 0x2bb5b5d7

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p3, v1, p2, v0}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object p3

    const v0, -0x4ee9b9da

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg01;

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

    if-nez v6, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {p2, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->e()V

    :goto_0
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual {v4}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, p3, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p3

    invoke-static {v5, v0, p3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

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

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p3, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p1, 0x7ab4aae9

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const p1, -0x7f65a980

    invoke-interface {p2, p1}, LEt0;->F(I)V

    sget-object p1, Lf10;->a:Lf10;

    const p1, 0x5f6058f0

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    move-object v4, p2

    invoke-static/range {v0 .. v6}, LK74;->b(LgV2;JFLEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    return-void
.end method
