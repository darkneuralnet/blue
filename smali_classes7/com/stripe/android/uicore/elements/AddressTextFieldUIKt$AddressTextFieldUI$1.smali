.class final Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt;->AddressTextFieldUI(Lcom/stripe/android/uicore/elements/AddressTextFieldController;Lkotlin/jvm/functions/Function0;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
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
.field final synthetic $controller:Lcom/stripe/android/uicore/elements/AddressTextFieldController;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/AddressTextFieldController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$1;->$controller:Lcom/stripe/android/uicore/elements/AddressTextFieldController;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressTextFieldUIKt$AddressTextFieldUI$1;->$controller:Lcom/stripe/android/uicore/elements/AddressTextFieldController;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AddressTextFieldController;->launchAutocompleteScreen()V

    return-void
.end method
