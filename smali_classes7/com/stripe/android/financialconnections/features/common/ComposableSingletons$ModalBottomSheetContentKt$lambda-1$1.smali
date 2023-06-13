.class final Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt;
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
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lh10;",
        "",
        "invoke",
        "(Lh10;LEt0;I)V",
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
        "SMAP\nModalBottomSheetContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,315:1\n154#2:316\n36#3:317\n1057#4,6:318\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheetContent.kt\ncom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1\n*L\n304#1:316\n306#1:317\n306#1:318,6\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;

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

    check-cast p1, Lh10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1;->invoke(Lh10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lh10;LEt0;I)V
    .locals 3

    const-string v0, "$this$StripeImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v0, v0, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$ModalBottomSheetContentKt.lambda-1.<anonymous> (ModalBottomSheetContent.kt:299)"

    const v2, -0x61d79afe

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object p3, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v0, 0x6

    invoke-virtual {p3, p2, v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v1

    sget-object p3, LgV2;->b0:LgV2$a;

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {p3, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object p3

    sget-object v0, LK9;->a:LK9$a;

    invoke-virtual {v0}, LK9$a;->e()LK9;

    move-result-object v0

    invoke-interface {p1, p3, v0}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object p1

    invoke-static {v1, v2}, Lpm0;->i(J)Lpm0;

    move-result-object p3

    const v0, 0x44faf204

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_5

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_6

    :cond_5
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1$1$1;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ModalBottomSheetContentKt$lambda-1$1$1$1;-><init>(J)V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 p3, 0x0

    invoke-static {p1, v0, p2, p3}, Lre0;->a(LgV2;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    return-void
.end method
