.class final Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt;->ResetContent(Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPD3;",
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


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldp;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$payload:Ldp;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPD3;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 6

    const-string v0, "it"

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

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.reset.ResetContent.<anonymous> (ResetScreen.kt:45)"

    const v1, -0xa5df2a0

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$payload:Ldp;

    sget-object p3, LMd6;->e:LMd6;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 p3, 0x1

    goto :goto_1

    :cond_3
    instance-of p3, p1, LAt2;

    :goto_1
    if-eqz p3, :cond_4

    const p1, 0x3309f191

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_4
    instance-of p3, p1, LwT5;

    if-eqz p3, :cond_5

    const p1, 0x3309f1bc

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_5
    instance-of p1, p1, LCj1;

    if-eqz p1, :cond_6

    const p1, 0x3309f1e4

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$payload:Ldp;

    check-cast p1, LCj1;

    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object p1

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iget v0, p0, Lcom/stripe/android/financialconnections/features/reset/ResetScreenKt$ResetContent$2;->$$dirty:I

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x8

    invoke-static {p1, p3, p2, v0}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->UnclassifiedErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_6
    const p1, 0x3309f27a

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->Q()V

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_3
    return-void
.end method
