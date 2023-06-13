.class final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->PartnerAuthScreenMainContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
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

.field final synthetic $onClickableTextClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

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

.field final synthetic $onContinueClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onEnterDetailsManually:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSelectAnotherBank:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$state:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onSelectAnotherBank:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onEnterDetailsManually:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$$dirty:I

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onContinueClick:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 7

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

    const-string v0, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenMainContent.<anonymous> (PartnerAuthScreen.kt:201)"

    const v1, -0x51ce937e

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$state:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->getPayload()Ldp;

    move-result-object p1

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

    const p1, -0x2e301a69

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const/4 v0, 0x0

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_partnerauth_loading_title:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    sget p1, Lcom/stripe/android/financialconnections/R$string;->stripe_partnerauth_loading_desc:I

    invoke-static {p1, p2, p3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    goto/16 :goto_2

    :cond_4
    instance-of p3, p1, LCj1;

    if-eqz p3, :cond_5

    const p3, -0x2e301983

    invoke-interface {p2, p3}, LEt0;->F(I)V

    check-cast p1, LCj1;

    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onSelectAnotherBank:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onEnterDetailsManually:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$$dirty:I

    shr-int/lit8 p3, p1, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/lit8 p3, p3, 0x8

    shr-int/lit8 v4, p1, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr p3, v4

    shr-int/lit8 p1, p1, 0x3

    and-int/lit16 p1, p1, 0x1c00

    or-int v5, p3, p1

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_5
    instance-of p3, p1, LwT5;

    if-eqz p3, :cond_6

    const p3, -0x2e30186b

    invoke-interface {p2, p3}, LEt0;->F(I)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$state:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->getAuthenticationStatus()Ldp;

    move-result-object v0

    check-cast p1, LwT5;

    invoke-virtual {p1}, LwT5;->a()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onContinueClick:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onSelectAnotherBank:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;->$$dirty:I

    shr-int/lit8 p3, p1, 0x9

    and-int/lit16 p3, p3, 0x380

    or-int/lit8 p3, p3, 0x48

    shl-int/lit8 v5, p1, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr p3, v5

    shr-int/lit8 p1, p1, 0x6

    const v5, 0xe000

    and-int/2addr p1, v5

    or-int v6, p3, p1

    move-object v5, p2

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->access$LoadedContent(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_6
    const p1, -0x2e301732

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
