.class final Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1;->invoke(Lh10;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "La30;",
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
        "SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,558:1\n154#2:559\n154#2:560\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1\n*L\n287#1:559\n288#1:560\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $this_StripeImage:Lh10;


# direct methods
.method public constructor <init>(Lh10;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1;->$this_StripeImage:Lh10;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La30;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1;->invoke(La30;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(La30;LEt0;I)V
    .locals 7

    const-string v0, "shimmer"

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

    const-string v1, "com.stripe.android.financialconnections.features.consent.ComposableSingletons$ConsentScreenKt.lambda-1.<anonymous>.<anonymous> (ConsentScreen.kt:282)"

    const v2, -0x39d5971a

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt$lambda-1$1$1;->$this_StripeImage:Lh10;

    sget-object v0, LgV2;->b0:LgV2$a;

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->e()LK9;

    move-result-object v1

    invoke-interface {p3, v0, v1}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object p3

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {p3, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object p3

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lcc5;->d(F)Lbc5;

    move-result-object v0

    invoke-static {p3, v0}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object p3

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {p3, v0}, LBB5;->m(LgV2;F)LgV2;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lbw;->b(LgV2;La30;Lhy5;FILjava/lang/Object;)LgV2;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LDN5;->a(LgV2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    return-void
.end method
