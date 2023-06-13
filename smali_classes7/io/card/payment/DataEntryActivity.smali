.class public final Lio/card/payment/DataEntryActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final TAG:Ljava/lang/String; = "DataEntryActivity"


# instance fields
.field private activityTitleTextView:Landroid/widget/TextView;

.field private autoAcceptDone:Z

.field private cancelBtn:Landroid/widget/Button;

.field private capture:Lio/card/payment/CreditCard;

.field private cardView:Landroid/widget/ImageView;

.field private cardholderNameEdit:Landroid/widget/EditText;

.field private cardholderNameValidator:Lio/card/payment/Validator;

.field private cvvEdit:Landroid/widget/EditText;

.field private cvvValidator:Lio/card/payment/Validator;

.field private defaultTextColor:I

.field private doneBtn:Landroid/widget/Button;

.field private editTextIdCounter:I

.field private expiryEdit:Landroid/widget/EditText;

.field private expiryValidator:Lio/card/payment/Validator;

.field private labelLeftPadding:Ljava/lang/String;

.field private numberEdit:Landroid/widget/EditText;

.field private numberValidator:Lio/card/payment/Validator;

.field private postalCodeEdit:Landroid/widget/EditText;

.field private postalCodeValidator:Lio/card/payment/Validator;

.field private useApplicationTheme:Z

.field private viewIdCounter:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lio/card/payment/DataEntryActivity;->viewIdCounter:I

    const/16 v0, 0x64

    iput v0, p0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    return-void
.end method

.method public static synthetic access$000(Lio/card/payment/DataEntryActivity;)V
    .locals 0

    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->completed()V

    return-void
.end method

.method private addCardholderNameIfNeeded(Landroid/view/ViewGroup;)V
    .locals 6

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "io.card.payment.requireCardholderName"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v1, "4dip"

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2, v2}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-boolean v4, p0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v4, :cond_0

    sget v4, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LABEL:I

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    iget-object v4, p0, Lio/card/payment/DataEntryActivity;->labelLeftPadding:Ljava/lang/String;

    invoke-static {v3, v4, v2, v2, v2}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lio/card/payment/i18n/StringKey;->ENTRY_CARDHOLDER_NAME:Lio/card/payment/i18n/StringKey;

    invoke-static {v2}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, -0x2

    invoke-virtual {v0, v3, v2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v3, Landroid/widget/EditText;

    invoke-direct {v3, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    iget v4, p0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    iget-object v3, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v3, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    const/4 v4, 0x6

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v3, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x1010040

    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v3, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setInputType(I)V

    iget-boolean v1, p0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    const v3, -0x333334

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    :cond_1
    new-instance v1, Lio/card/payment/MaxLengthValidator;

    const/16 v3, 0xaf

    invoke-direct {v1, v3}, Lio/card/payment/MaxLengthValidator;-><init>(I)V

    iput-object v1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    iget-object v3, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {p1, v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    goto :goto_0

    :cond_2
    new-instance p1, Lio/card/payment/AlwaysValid;

    invoke-direct {p1}, Lio/card/payment/AlwaysValid;-><init>()V

    iput-object p1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    :goto_0
    return-void
.end method

.method private advanceToNextEmptyField()Landroid/widget/EditText;
    .locals 3

    const/16 v0, 0x64

    :goto_0
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private completed()V
    .locals 9

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    if-nez v0, :cond_0

    new-instance v0, Lio/card/payment/CreditCard;

    invoke-direct {v0}, Lio/card/payment/CreditCard;-><init>()V

    iput-object v0, p0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    :cond_0
    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    move-object v2, v1

    check-cast v2, Lio/card/payment/ExpiryValidator;

    iget v2, v2, Lio/card/payment/ExpiryValidator;->month:I

    iput v2, v0, Lio/card/payment/CreditCard;->expiryMonth:I

    check-cast v1, Lio/card/payment/ExpiryValidator;

    iget v1, v1, Lio/card/payment/ExpiryValidator;->year:I

    iput v1, v0, Lio/card/payment/CreditCard;->expiryYear:I

    :cond_1
    new-instance v0, Lio/card/payment/CreditCard;

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    iget v4, v1, Lio/card/payment/CreditCard;->expiryMonth:I

    iget v5, v1, Lio/card/payment/CreditCard;->expiryYear:I

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object v8

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lio/card/payment/CreditCard;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "io.card.payment.scanResult"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "io.card.payment.capturedCardImage"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    :cond_2
    sget v0, Lio/card/payment/CardIOActivity;->RESULT_CARD_INFO:I

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private setDefaultColor(Landroid/widget/EditText;)V
    .locals 1

    iget-boolean v0, p0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lio/card/payment/DataEntryActivity;->defaultTextColor:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    const v0, -0xbbbbbc

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method

.method private validateAndEnableDoneButtonIfValid()V
    .locals 2

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-boolean v0, p0, Lio/card/payment/DataEntryActivity;->autoAcceptDone:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {v0}, Lio/card/payment/Validator;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {v0}, Lio/card/payment/Validator;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    invoke-interface {v0}, Lio/card/payment/Validator;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    invoke-interface {v0}, Lio/card/payment/Validator;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    invoke-interface {v0}, Lio/card/payment/Validator;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->completed()V

    :cond_1
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->hasFullLength()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->isValid()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    sget v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_ERROR:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->advanceToNextEmptyField()Landroid/widget/EditText;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    :goto_0
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    if-eqz p1, :cond_f

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/card/payment/CardType;->fromCardNumber(Ljava/lang/String;)Lio/card/payment/CardType;

    move-result-object p1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    check-cast v0, Lio/card/payment/FixedLengthValidator;

    invoke-virtual {p1}, Lio/card/payment/CardType;->cvvLength()I

    move-result p1

    iput p1, v0, Lio/card/payment/FixedLengthValidator;->requiredLength:I

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const/4 v1, 0x4

    if-ne p1, v1, :cond_2

    const-string p1, "1234"

    goto :goto_1

    :cond_2
    const-string p1, "123"

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_3
    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->hasFullLength()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->isValid()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    sget v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_ERROR:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_2

    :cond_4
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->advanceToNextEmptyField()Landroid/widget/EditText;

    goto/16 :goto_2

    :cond_5
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    goto/16 :goto_2

    :cond_6
    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_9

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->hasFullLength()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->isValid()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    sget v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_ERROR:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_2

    :cond_7
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->advanceToNextEmptyField()Landroid/widget/EditText;

    goto :goto_2

    :cond_8
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    goto :goto_2

    :cond_9
    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_c

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->hasFullLength()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->isValid()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    sget v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_ERROR:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    :cond_a
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    goto :goto_2

    :cond_b
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    goto :goto_2

    :cond_c
    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_f

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->hasFullLength()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameValidator:Lio/card/payment/Validator;

    invoke-interface {p1}, Lio/card/payment/Validator;->isValid()Z

    move-result p1

    if-nez p1, :cond_d

    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    sget v0, Lio/card/payment/ui/Appearance;->TEXT_COLOR_ERROR:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    :cond_d
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    goto :goto_2

    :cond_e
    iget-object p1, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lio/card/payment/DataEntryActivity;->setDefaultColor(Landroid/widget/EditText;)V

    :cond_f
    :goto_2
    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->validateAndEnableDoneButtonIfValid()V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    sget v0, Lio/card/payment/CardIOActivity;->RESULT_ENTRY_CANCELED:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 21

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lio/card/payment/DataEntryActivity;->onBackPressed()V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "io.card.payment.keepApplicationTheme"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    invoke-static {v0, v1}, Lio/card/payment/ui/ActivityHelper;->setActivityTheme(Landroid/app/Activity;Z)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    iput v1, v0, Lio/card/payment/DataEntryActivity;->defaultTextColor:I

    invoke-static {}, Lio/card/payment/ui/ActivityHelper;->holoSupported()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "12dip"

    goto :goto_0

    :cond_1
    const-string v1, "2dip"

    :goto_0
    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->labelLeftPadding:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-static {v1}, Lio/card/payment/i18n/LocalizedStrings;->setLanguage(Landroid/content/Intent;)V

    const-string v1, "4dip"

    invoke-static {v1, v0}, Lio/card/payment/ui/ViewUtil;->typedDimensionValueToPixelsInt(Ljava/lang/String;Landroid/content/Context;)I

    move-result v2

    new-instance v4, Landroid/widget/RelativeLayout;

    invoke-direct {v4, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iget-boolean v5, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v5, :cond_2

    sget v5, Lio/card/payment/ui/Appearance;->DEFAULT_BACKGROUND_COLOR:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_2
    new-instance v5, Landroid/widget/ScrollView;

    invoke-direct {v5, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iget v6, v0, Lio/card/payment/DataEntryActivity;->viewIdCounter:I

    add-int/lit8 v7, v6, 0x1

    iput v7, v0, Lio/card/payment/DataEntryActivity;->viewIdCounter:I

    invoke-virtual {v5, v6}, Landroid/view/View;->setId(I)V

    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v7, -0x1

    const/4 v8, -0x2

    invoke-direct {v6, v7, v8}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v9, 0xa

    invoke-virtual {v6, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v4, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v5, v9, v7, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v11, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v12

    const-string v13, "io.card.payment.scanResult"

    invoke-virtual {v12, v13}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v12

    check-cast v12, Lio/card/payment/CreditCard;

    iput-object v12, v0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v12

    const-string v13, "debug_autoAcceptResult"

    invoke-virtual {v12, v13, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v12

    iput-boolean v12, v0, Lio/card/payment/DataEntryActivity;->autoAcceptDone:Z

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    const/high16 v15, 0x3f800000    # 1.0f

    const-string v14, "8dip"

    const/4 v13, 0x0

    if-eqz v12, :cond_3

    new-instance v12, Lio/card/payment/CardNumberValidator;

    iget-object v10, v0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    iget-object v10, v10, Lio/card/payment/CreditCard;->cardNumber:Ljava/lang/String;

    invoke-direct {v12, v10}, Lio/card/payment/CardNumberValidator;-><init>(Ljava/lang/String;)V

    iput-object v12, v0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    new-instance v10, Landroid/widget/ImageView;

    invoke-direct {v10, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v10, v0, Lio/card/payment/DataEntryActivity;->cardView:Landroid/widget/ImageView;

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v10, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->cardView:Landroid/widget/ImageView;

    invoke-virtual {v12, v3, v3, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    iput v15, v10, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->cardView:Landroid/widget/ImageView;

    sget-object v15, Lio/card/payment/CardIOActivity;->markedCardImage:Landroid/graphics/Bitmap;

    invoke-virtual {v12, v15}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->cardView:Landroid/widget/ImageView;

    invoke-virtual {v5, v12, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v10, v0, Lio/card/payment/DataEntryActivity;->cardView:Landroid/widget/ImageView;

    invoke-static {v10, v13, v13, v13, v14}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_3
    new-instance v10, Landroid/widget/TextView;

    invoke-direct {v10, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v10, v0, Lio/card/payment/DataEntryActivity;->activityTitleTextView:Landroid/widget/TextView;

    const/high16 v12, 0x41c00000    # 24.0f

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextSize(F)V

    iget-boolean v10, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v10, :cond_4

    iget-object v10, v0, Lio/card/payment/DataEntryActivity;->activityTitleTextView:Landroid/widget/TextView;

    sget v12, Lio/card/payment/ui/Appearance;->PAY_BLUE_COLOR:I

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_4
    iget-object v10, v0, Lio/card/payment/DataEntryActivity;->activityTitleTextView:Landroid/widget/TextView;

    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v10, v0, Lio/card/payment/DataEntryActivity;->activityTitleTextView:Landroid/widget/TextView;

    invoke-static {v10, v13, v13, v13, v14}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v10, v0, Lio/card/payment/DataEntryActivity;->activityTitleTextView:Landroid/widget/TextView;

    invoke-static {v10, v8, v8}, Lio/card/payment/ui/ViewUtil;->setDimensions(Landroid/view/View;II)V

    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-static {v10, v13, v1, v13, v1}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v15, v0, Lio/card/payment/DataEntryActivity;->labelLeftPadding:Ljava/lang/String;

    invoke-static {v12, v15, v13, v13, v13}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v15, Lio/card/payment/i18n/StringKey;->ENTRY_CARD_NUMBER:Lio/card/payment/i18n/StringKey;

    invoke-static {v15}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v15, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v15, :cond_5

    sget v15, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LABEL:I

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_5
    invoke-virtual {v10, v12, v8, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v12, Landroid/widget/EditText;

    invoke-direct {v12, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    iget v15, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    add-int/lit8 v13, v15, 0x1

    iput v13, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    invoke-virtual {v12, v15}, Landroid/view/View;->setId(I)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    const/4 v13, 0x6

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    const v15, 0x1010040

    invoke-virtual {v12, v13, v15}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    const/4 v13, 0x3

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    const-string v13, "1234 5678 1234 5678"

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-boolean v12, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v12, :cond_6

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    const v13, -0x333334

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setHintTextColor(I)V

    :cond_6
    new-instance v12, Lio/card/payment/CardNumberValidator;

    invoke-direct {v12}, Lio/card/payment/CardNumberValidator;-><init>()V

    iput-object v12, v0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    iget-object v13, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    invoke-virtual {v13, v12}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    const/4 v13, 0x2

    new-array v15, v13, [Landroid/text/InputFilter;

    new-instance v13, Landroid/text/method/DigitsKeyListener;

    invoke-direct {v13}, Landroid/text/method/DigitsKeyListener;-><init>()V

    aput-object v13, v15, v3

    iget-object v13, v0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    const/16 v16, 0x1

    aput-object v13, v15, v16

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v12, v0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    invoke-virtual {v10, v12, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {v5, v10, v7, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :goto_1
    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v12, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v13, 0x0

    invoke-static {v10, v13, v1, v13, v1}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v13

    const-string v15, "io.card.payment.requireExpiry"

    invoke-virtual {v13, v15, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v15

    const-string v8, "io.card.payment.requireCVV"

    invoke-virtual {v15, v8, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v15

    const-string v7, "io.card.payment.requirePostalCode"

    invoke-virtual {v15, v7, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v13, :cond_d

    new-instance v15, Landroid/widget/LinearLayout;

    invoke-direct {v15, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object/from16 v17, v4

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    move-object/from16 v18, v1

    move-object/from16 v19, v14

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v14, -0x1

    invoke-direct {v4, v3, v14, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-boolean v14, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v14, :cond_7

    sget v14, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LABEL:I

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_7
    sget-object v14, Lio/card/payment/i18n/StringKey;->ENTRY_EXPIRES:Lio/card/payment/i18n/StringKey;

    invoke-static {v14}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v14, v0, Lio/card/payment/DataEntryActivity;->labelLeftPadding:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v1, v14, v3, v3, v3}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, -0x2

    invoke-virtual {v15, v1, v3, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v1, Landroid/widget/EditText;

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    iget v3, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    add-int/lit8 v14, v3, 0x1

    iput v14, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    const/4 v3, 0x6

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const v14, 0x1010040

    invoke-virtual {v1, v3, v14}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    sget-object v3, Lio/card/payment/i18n/StringKey;->EXPIRES_PLACEHOLDER:Lio/card/payment/i18n/StringKey;

    invoke-static {v3}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-boolean v1, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v1, :cond_8

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    const v3, -0x333334

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHintTextColor(I)V

    :cond_8
    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    if-eqz v1, :cond_9

    new-instance v1, Lio/card/payment/ExpiryValidator;

    iget-object v3, v0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    iget v14, v3, Lio/card/payment/CreditCard;->expiryMonth:I

    iget v3, v3, Lio/card/payment/CreditCard;->expiryYear:I

    invoke-direct {v1, v14, v3}, Lio/card/payment/ExpiryValidator;-><init>(II)V

    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    goto :goto_2

    :cond_9
    new-instance v1, Lio/card/payment/ExpiryValidator;

    invoke-direct {v1}, Lio/card/payment/ExpiryValidator;-><init>()V

    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    :goto_2
    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {v1}, Lio/card/payment/Validator;->hasFullLength()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    iget-object v3, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {v3}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    iget-object v3, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    const/4 v3, 0x2

    new-array v14, v3, [Landroid/text/InputFilter;

    new-instance v3, Landroid/text/method/DateKeyListener;

    invoke-direct {v3}, Landroid/text/method/DateKeyListener;-><init>()V

    const/16 v20, 0x0

    aput-object v3, v14, v20

    iget-object v3, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    const/16 v16, 0x1

    aput-object v3, v14, v16

    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    const/4 v3, -0x1

    const/4 v14, -0x2

    invoke-virtual {v15, v1, v3, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {v10, v15, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v8, :cond_c

    if-eqz v7, :cond_b

    goto :goto_3

    :cond_b
    const/4 v1, 0x0

    goto :goto_4

    :cond_c
    :goto_3
    move-object/from16 v1, v18

    :goto_4
    const/4 v3, 0x0

    invoke-static {v15, v3, v3, v1, v3}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_d
    move-object/from16 v18, v1

    move-object/from16 v17, v4

    move-object/from16 v19, v14

    new-instance v1, Lio/card/payment/AlwaysValid;

    invoke-direct {v1}, Lio/card/payment/AlwaysValid;-><init>()V

    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    :goto_5
    if-eqz v8, :cond_13

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v14, -0x1

    const/4 v15, 0x0

    invoke-direct {v3, v15, v14, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-boolean v14, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v14, :cond_e

    sget v14, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LABEL:I

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_e
    iget-object v14, v0, Lio/card/payment/DataEntryActivity;->labelLeftPadding:Ljava/lang/String;

    const/4 v15, 0x0

    invoke-static {v4, v14, v15, v15, v15}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v14, Lio/card/payment/i18n/StringKey;->ENTRY_CVV:Lio/card/payment/i18n/StringKey;

    invoke-static {v14}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v14, -0x2

    invoke-virtual {v1, v4, v14, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    new-instance v4, Landroid/widget/EditText;

    invoke-direct {v4, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    iget v14, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    add-int/lit8 v15, v14, 0x1

    iput v15, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    invoke-virtual {v4, v14}, Landroid/view/View;->setId(I)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const/4 v14, 0x6

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v14

    const v15, 0x1010040

    invoke-virtual {v4, v14, v15}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const/4 v14, 0x3

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const-string v14, "123"

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-boolean v4, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v4, :cond_f

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const v14, -0x333334

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setHintTextColor(I)V

    :cond_f
    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->capture:Lio/card/payment/CreditCard;

    if-eqz v4, :cond_10

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->numberValidator:Lio/card/payment/Validator;

    invoke-interface {v4}, Lio/card/payment/Validator;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lio/card/payment/CardType;->fromCardNumber(Ljava/lang/String;)Lio/card/payment/CardType;

    move-result-object v4

    invoke-virtual {v4}, Lio/card/payment/CardType;->cvvLength()I

    move-result v4

    goto :goto_6

    :cond_10
    const/4 v4, 0x4

    :goto_6
    new-instance v14, Lio/card/payment/FixedLengthValidator;

    invoke-direct {v14, v4}, Lio/card/payment/FixedLengthValidator;-><init>(I)V

    iput-object v14, v0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const/4 v14, 0x2

    new-array v15, v14, [Landroid/text/InputFilter;

    new-instance v14, Landroid/text/method/DigitsKeyListener;

    invoke-direct {v14}, Landroid/text/method/DigitsKeyListener;-><init>()V

    const/16 v20, 0x0

    aput-object v14, v15, v20

    iget-object v14, v0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    const/16 v16, 0x1

    aput-object v14, v15, v16

    invoke-virtual {v4, v15}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    iget-object v14, v0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    invoke-virtual {v4, v14}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    const/4 v14, -0x1

    const/4 v15, -0x2

    invoke-virtual {v1, v4, v14, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {v10, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v13, :cond_11

    move-object/from16 v3, v18

    goto :goto_7

    :cond_11
    const/4 v3, 0x0

    :goto_7
    if-eqz v7, :cond_12

    move-object/from16 v4, v18

    goto :goto_8

    :cond_12
    const/4 v4, 0x0

    :goto_8
    const/4 v14, 0x0

    invoke-static {v1, v3, v14, v4, v14}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_13
    new-instance v1, Lio/card/payment/AlwaysValid;

    invoke-direct {v1}, Lio/card/payment/AlwaysValid;-><init>()V

    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->cvvValidator:Lio/card/payment/Validator;

    :goto_9
    if-eqz v7, :cond_19

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v7, -0x1

    const/4 v14, 0x0

    invoke-direct {v3, v14, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-boolean v7, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v7, :cond_14

    sget v7, Lio/card/payment/ui/Appearance;->TEXT_COLOR_LABEL:I

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_14
    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->labelLeftPadding:Ljava/lang/String;

    const/4 v14, 0x0

    invoke-static {v4, v7, v14, v14, v14}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v7, Lio/card/payment/i18n/StringKey;->ENTRY_POSTAL_CODE:Lio/card/payment/i18n/StringKey;

    invoke-static {v7}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v7, -0x2

    invoke-virtual {v1, v4, v7, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v7, "io.card.payment.restrictPostalCodeToNumericOnly"

    const/4 v14, 0x0

    invoke-virtual {v4, v7, v14}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    new-instance v7, Landroid/widget/EditText;

    invoke-direct {v7, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v7, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    iget v14, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    add-int/lit8 v15, v14, 0x1

    iput v15, v0, Lio/card/payment/DataEntryActivity;->editTextIdCounter:I

    invoke-virtual {v7, v14}, Landroid/view/View;->setId(I)V

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    const/4 v14, 0x1

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    const/4 v15, 0x6

    invoke-virtual {v7, v15}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    const v14, 0x1010040

    invoke-virtual {v7, v15, v14}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    if-eqz v4, :cond_15

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    const/4 v7, 0x3

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setInputType(I)V

    goto :goto_a

    :cond_15
    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setInputType(I)V

    :goto_a
    iget-boolean v4, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v4, :cond_16

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    const v7, -0x333334

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setHintTextColor(I)V

    :cond_16
    new-instance v4, Lio/card/payment/MaxLengthValidator;

    const/16 v7, 0x14

    invoke-direct {v4, v7}, Lio/card/payment/MaxLengthValidator;-><init>(I)V

    iput-object v4, v0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    const/4 v7, -0x1

    const/4 v14, -0x2

    invoke-virtual {v1, v4, v7, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    invoke-virtual {v10, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v13, :cond_18

    if-eqz v8, :cond_17

    goto :goto_b

    :cond_17
    const/4 v3, 0x0

    goto :goto_c

    :cond_18
    :goto_b
    move-object/from16 v3, v18

    :goto_c
    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v4, v4}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    :cond_19
    new-instance v1, Lio/card/payment/AlwaysValid;

    invoke-direct {v1}, Lio/card/payment/AlwaysValid;-><init>()V

    iput-object v1, v0, Lio/card/payment/DataEntryActivity;->postalCodeValidator:Lio/card/payment/Validator;

    :goto_d
    invoke-virtual {v5, v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {v0, v5}, Lio/card/payment/DataEntryActivity;->addCardholderNameIfNeeded(Landroid/view/ViewGroup;)V

    invoke-virtual {v9, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v1, "16dip"

    const-string v3, "20dip"

    invoke-static {v5, v1, v3, v1, v3}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iget v3, v0, Lio/card/payment/DataEntryActivity;->viewIdCounter:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Lio/card/payment/DataEntryActivity;->viewIdCounter:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0xc

    invoke-virtual {v3, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/4 v7, 0x0

    invoke-virtual {v1, v7, v2, v7, v7}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v2

    const/4 v7, 0x2

    invoke-virtual {v6, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    new-instance v2, Landroid/widget/Button;

    invoke-direct {v2, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v2, v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    sget-object v5, Lio/card/payment/i18n/StringKey;->DONE:Lio/card/payment/i18n/StringKey;

    invoke-static {v5}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    new-instance v5, Lio/card/payment/DataEntryActivity$1;

    invoke-direct {v5, v0}, Lio/card/payment/DataEntryActivity$1;-><init>(Lio/card/payment/DataEntryActivity;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setEnabled(Z)V

    iget-object v4, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    invoke-virtual {v1, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    iget-boolean v4, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    const/4 v5, 0x1

    invoke-static {v2, v5, v0, v4}, Lio/card/payment/ui/ViewUtil;->styleAsButton(Landroid/widget/Button;ZLandroid/content/Context;Z)V

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    const-string v4, "5dip"

    const/4 v5, 0x0

    invoke-static {v2, v4, v5, v4, v5}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    move-object/from16 v5, v19

    invoke-static {v2, v5, v5, v5, v5}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    const/high16 v6, 0x41800000    # 16.0f

    if-nez v2, :cond_1a

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->doneBtn:Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_1a
    new-instance v2, Landroid/widget/Button;

    invoke-direct {v2, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    iput-object v2, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, -0x1

    const/4 v9, -0x2

    invoke-direct {v2, v8, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    sget-object v8, Lio/card/payment/i18n/StringKey;->CANCEL:Lio/card/payment/i18n/StringKey;

    invoke-static {v8}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    new-instance v8, Lio/card/payment/DataEntryActivity$2;

    invoke-direct {v8, v0}, Lio/card/payment/DataEntryActivity$2;-><init>(Lio/card/payment/DataEntryActivity;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v7, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    invoke-virtual {v1, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    iget-boolean v7, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    const/4 v8, 0x0

    invoke-static {v2, v8, v0, v7}, Lio/card/payment/ui/ViewUtil;->styleAsButton(Landroid/widget/Button;ZLandroid/content/Context;Z)V

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    const/4 v7, 0x0

    invoke-static {v2, v4, v7, v4, v7}, Lio/card/payment/ui/ViewUtil;->setPadding(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    move-object/from16 v4, v18

    invoke-static {v2, v4, v5, v5, v5}, Lio/card/payment/ui/ViewUtil;->setMargins(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, v0, Lio/card/payment/DataEntryActivity;->useApplicationTheme:Z

    if-nez v2, :cond_1b

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->cancelBtn:Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_1b
    move-object/from16 v2, v17

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static/range {p0 .. p0}, Lio/card/payment/ui/ActivityHelper;->addActionBarIfSupported(Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "io.card.payment.intentSenderIsPayPal"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lio/card/payment/R$drawable;->cio_ic_paypal_monogram:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_e

    :cond_1c
    move-object v1, v7

    :goto_e
    if-eqz v13, :cond_1d

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {v2}, Lio/card/payment/Validator;->isValid()Z

    move-result v2

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/card/payment/DataEntryActivity;->afterTextChanged(Landroid/text/Editable;)V

    :cond_1d
    iget-object v2, v0, Lio/card/payment/DataEntryActivity;->activityTitleTextView:Landroid/widget/TextView;

    sget-object v3, Lio/card/payment/i18n/StringKey;->MANUAL_ENTRY_TITLE:Lio/card/payment/i18n/StringKey;

    invoke-static {v3}, Lio/card/payment/i18n/LocalizedStrings;->getString(Lio/card/payment/i18n/StringKey;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "card.io - "

    invoke-static {v0, v2, v3, v4, v1}, Lio/card/payment/ui/ActivityHelper;->setupActionBarIfSupported(Landroid/app/Activity;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    invoke-static {p0}, Lio/card/payment/ui/ActivityHelper;->setFlagSecure(Landroid/app/Activity;)V

    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->validateAndEnableDoneButtonIfValid()V

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryValidator:Lio/card/payment/Validator;

    invoke-interface {v0}, Lio/card/payment/Validator;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/card/payment/DataEntryActivity;->advanceToNextEmptyField()Landroid/widget/EditText;

    :goto_0
    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->numberEdit:Landroid/widget/EditText;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->expiryEdit:Landroid/widget/EditText;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cvvEdit:Landroid/widget/EditText;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->postalCodeEdit:Landroid/widget/EditText;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/card/payment/DataEntryActivity;->cardholderNameEdit:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_2
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
