.class final Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ContentWithConnectedAccountLogosPreview(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
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
.field final synthetic $state:Lcom/stripe/android/financialconnections/features/consent/ConsentState;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1;->$state:Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.consent.ContentWithConnectedAccountLogosPreview.<anonymous> (ConsentScreen.kt:489)"

    const v2, -0x2498d5b8

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1;->$state:Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    sget-object v4, LHU2;->b:LHU2;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/16 v9, 0x186

    const/16 v10, 0xa

    move-object v8, p1

    invoke-static/range {v4 .. v10}, LFU2;->p(LHU2;Llf;ZLkotlin/jvm/functions/Function1;LEt0;II)LGU2;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$1;

    sget-object v6, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$2;

    sget-object v7, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$3;

    sget-object v8, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1$4;

    const v10, 0x36d88

    move-object v9, p1

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->access$ConsentContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
