.class final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
        "Lkotlin/jvm/functions/Function1<",
        "LWv1;",
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
.field final synthetic $controller:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $hasFocus$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;->$controller:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;->$hasFocus$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWv1;

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;->invoke(LWv1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LWv1;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;->$hasFocus$delegate:LEX2;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->access$PhoneNumberElementUI_rvJmuoc$lambda$10(LEX2;)Z

    move-result v0

    invoke-interface {p1}, LWv1;->a()Z

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;->$controller:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-interface {p1}, LWv1;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->onFocusChange(Z)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;->$hasFocus$delegate:LEX2;

    invoke-interface {p1}, LWv1;->a()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->access$PhoneNumberElementUI_rvJmuoc$lambda$11(LEX2;Z)V

    return-void
.end method
