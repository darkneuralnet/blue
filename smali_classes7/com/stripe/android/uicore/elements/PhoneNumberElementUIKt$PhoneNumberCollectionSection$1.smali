.class final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-a7tNSiQ(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V
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
.field final synthetic $$dirty:I

.field final synthetic $enabled:Z

.field final synthetic $imeAction:I

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requestFocusWhenShown:Z


# direct methods
.method public constructor <init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZII)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$requestFocusWhenShown:Z

    iput p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$imeAction:I

    iput p5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

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

    const-string v1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection.<anonymous> (PhoneNumberElementUI.kt:62)"

    const v2, 0x151c6a62

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$enabled:Z

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-boolean v5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$requestFocusWhenShown:Z

    iget v6, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$imeAction:I

    iget p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;->$$dirty:I

    and-int/lit8 v0, p2, 0xe

    or-int/lit8 v0, v0, 0x40

    shr-int/lit8 v1, p2, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    shr-int/lit8 p2, p2, 0x3

    and-int/lit16 p2, p2, 0x1c00

    or-int v8, v0, p2

    const/4 v9, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-rvJmuoc(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
