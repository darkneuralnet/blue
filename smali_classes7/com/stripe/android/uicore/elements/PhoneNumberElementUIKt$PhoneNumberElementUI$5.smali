.class final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-rvJmuoc(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V
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
        "SMAP\nPhoneNumberElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n154#2:147\n*S KotlinDebug\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5\n*L\n120#1:147\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $controller:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $enabled:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;ZI)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->$controller:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->$enabled:Z

    iput p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

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

    const-string v1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:115)"

    const v2, -0x2136fb61

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->$controller:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v0

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->$enabled:Z

    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 p2, 0x10

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result v3

    const/4 v4, 0x0

    const/16 p2, 0x8

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result v5

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    iget p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;->$$dirty:I

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/lit16 v4, p2, 0x188

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/DropdownFieldUIKt;->DropDown(Lcom/stripe/android/uicore/elements/DropdownFieldController;ZLgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method
