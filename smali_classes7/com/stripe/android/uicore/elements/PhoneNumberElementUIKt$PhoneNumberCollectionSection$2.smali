.class final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;
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
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $enabled:Z

.field final synthetic $imeAction:I

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requestFocusWhenShown:Z

.field final synthetic $sectionTitle:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZIII)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$sectionTitle:Ljava/lang/Integer;

    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$requestFocusWhenShown:Z

    iput p5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$imeAction:I

    iput p6, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$$changed:I

    iput p7, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 8

    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$enabled:Z

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$sectionTitle:Ljava/lang/Integer;

    iget-boolean v3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$requestFocusWhenShown:Z

    iget v4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$imeAction:I

    iget p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$$changed:I

    or-int/lit8 v6, p2, 0x1

    iget v7, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;->$$default:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-a7tNSiQ(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V

    return-void
.end method
