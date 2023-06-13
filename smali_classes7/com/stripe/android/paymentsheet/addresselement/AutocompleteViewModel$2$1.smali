.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"
    }
    d2 = {
        "",
        "it",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAutocompleteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,247:1\n230#2,5:248\n230#2,5:253\n*S KotlinDebug\n*F\n+ 1 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1\n*L\n95#1:248,5\n99#1:253,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->access$getConfig$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;->getTrailingIcon()LGX2;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/elements/TextFieldIcon;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->access$getConfig$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;->getTrailingIcon()LGX2;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;

    :cond_3
    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/elements/TextFieldIcon;

    new-instance v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    sget v3, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_clear:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    new-instance v6, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1$emit$3$1;

    invoke-direct {v6, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2$1$emit$3$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
