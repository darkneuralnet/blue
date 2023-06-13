.class final Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->LoadedContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1$WhenMappings;
    }
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

.field final synthetic $bottomSheetMode:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

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

.field final synthetic $onConfirmModalClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$bottomSheetMode:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 3

    const-string v0, "$this$ModalBottomSheetLayout"

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

    const/4 v0, -0x1

    if-eqz p1, :cond_2

    const p1, 0x279398a6

    const-string v1, "com.stripe.android.financialconnections.features.consent.LoadedContent.<anonymous> (ConsentScreen.kt:328)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$bottomSheetMode:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    if-nez p1, :cond_3

    move p1, v0

    goto :goto_1

    :cond_3
    sget-object p3, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    :goto_1
    if-eq p1, v0, :cond_6

    const/4 p3, 0x1

    if-eq p1, p3, :cond_5

    const/4 p3, 0x2

    if-eq p1, p3, :cond_4

    const p1, 0x28fd247

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_4
    const p1, 0x28fd12c

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object p1

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    iget v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$$dirty:I

    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/lit8 v2, v2, 0x8

    shr-int/lit8 v1, v1, 0xc

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    invoke-static {p1, p3, v0, p2, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->DataAccessBottomSheetContent(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_5
    const p1, 0x28fcffb

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$payload:Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    move-result-object p1

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    iget v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;->$$dirty:I

    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/lit8 v2, v2, 0x8

    shr-int/lit8 v1, v1, 0xc

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    invoke-static {p1, p3, v0, p2, v1}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->LegalDetailsBottomSheetContent(Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_2

    :cond_6
    const p1, 0x28fd237

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
