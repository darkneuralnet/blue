.class final Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentMainContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,558:1\n76#2:559\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1\n*L\n176#1:559\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $onCloseClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

.field final synthetic $scrollState:LXp5;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LXp5;Lkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            "LXp5;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$scrollState:LXp5;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$onCloseClick:Lkotlin/jvm/functions/Function0;

    iput p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.financialconnections.features.consent.ConsentMainContent.<anonymous> (ConsentScreen.kt:171)"

    const v2, 0x554de62e

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const p2, -0xe189f0d

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getShouldShowMerchantLogos()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_1

    :cond_3
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalReducedBranding()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :goto_1
    move v0, p2

    invoke-interface {p1}, LEt0;->Q()V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$scrollState:LXp5;

    invoke-static {p2}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt;->getElevation(LXp5;)F

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$onCloseClick:Lkotlin/jvm/functions/Function0;

    iget p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;->$$dirty:I

    shr-int/lit8 p2, p2, 0x3

    and-int/lit16 v5, p2, 0x1c00

    const/4 v6, 0x4

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt;->FinancialConnectionsTopAppBar-DzVHIIc(ZFZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method
