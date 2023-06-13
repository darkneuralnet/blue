.class final Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;
.super Lcom/stripe/android/view/StripeTextWatcher;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardNumberEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CardNumberTextWatcher"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u000c\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004H\u0002J*\u0010\"\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0008\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;",
        "Lcom/stripe/android/view/StripeTextWatcher;",
        "(Lcom/stripe/android/view/CardNumberEditText;)V",
        "beforeCardNumber",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "digitsAdded",
        "",
        "getDigitsAdded",
        "()Z",
        "formattedNumber",
        "",
        "isPastedPan",
        "latestChangeStart",
        "",
        "latestInsertionSize",
        "newCursorPosition",
        "Ljava/lang/Integer;",
        "shouldUpdateAfterChange",
        "getShouldUpdateAfterChange",
        "afterTextChanged",
        "",
        "s",
        "Landroid/text/Editable;",
        "beforeTextChanged",
        "",
        "start",
        "count",
        "after",
        "isComplete",
        "wasCardNumberValid",
        "startPosition",
        "previousCount",
        "currentCount",
        "cardNumber",
        "onTextChanged",
        "before",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

.field private formattedNumber:Ljava/lang/String;

.field private isPastedPan:Z

.field private latestChangeStart:I

.field private latestInsertionSize:I

.field private newCursorPosition:Ljava/lang/Integer;

.field final synthetic this$0:Lcom/stripe/android/view/CardNumberEditText;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CardNumberEditText;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0}, Lcom/stripe/android/view/StripeTextWatcher;-><init>()V

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    return-void
.end method

.method private final getDigitsAdded()Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    invoke-virtual {v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final getShouldUpdateAfterChange()Z
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->getDigitsAdded()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->isLastKeyDelete$payments_core_release()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final isComplete(Z)Z
    .locals 0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isMaxLength()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final isPastedPan(IIILcom/stripe/android/cards/CardNumber$Unvalidated;)Z
    .locals 0

    if-le p3, p2, :cond_0

    if-nez p1, :cond_0

    invoke-virtual {p4}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getNormalized()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0xe

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->getShouldUpdateAfterChange()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setTextSilent$payments_core_release(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->newCursorPosition:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v0, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->newCursorPosition:Ljava/lang/Integer;

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result p1

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    const/4 v2, 0x1

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result p1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardAccountRangeService;->getAccountRange()Lcom/stripe/android/model/AccountRange;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isValidLuhn()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->onCardMetadataLoadedTooSlow$payments_core_release()V

    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isComplete(Z)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getCompletionCallback$payments_core_release()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isPartialEntry(I)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->isPossibleCardBrand()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v0

    invoke-static {p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, v2}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$isValid(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    invoke-static {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->access$setCardNumberValid$p(Lcom/stripe/android/view/CardNumberEditText;Z)V

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_4
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan:Z

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$getUnvalidatedCardNumber(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/cards/CardNumber$Unvalidated;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->beforeCardNumber:Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iput p2, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestChangeStart:I

    iput p4, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestInsertionSize:I

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-direct {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getAccountRangeService()Lcom/stripe/android/cards/CardAccountRangeService;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/stripe/android/cards/CardAccountRangeService;->onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    invoke-direct {p0, p2, p3, p4, v0}, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan(IIILcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getFormatted(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter$payments_core_release(I)V

    :cond_2
    iget-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->isPastedPan:Z

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getLength()I

    move-result p1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result p1

    :goto_1
    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getFormatted(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p4

    iget v0, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestChangeStart:I

    iget v1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->latestInsertionSize:I

    invoke-virtual {p2, p4, v0, v1, p1}, Lcom/stripe/android/view/CardNumberEditText;->calculateCursorPosition$payments_core_release(IIII)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->newCursorPosition:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;->formattedNumber:Ljava/lang/String;

    return-void
.end method
