.class public final Lcom/stripe/android/view/CardMultilineWidget;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/view/CardWidget;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;,
        Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;,
        Lcom/stripe/android/view/CardMultilineWidget$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f9\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008%*\u00017\u0008\u0007\u0018\u0000 \u00d2\u00012\u00020\u00012\u00020\u0002:\u0006\u00d0\u0001\u00d1\u0001\u00d2\u0001B/\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u009a\u0001\u001a\u00030\u0098\u0001H\u0016J\n\u0010\u009b\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u009c\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u009d\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u009e\u0001\u001a\u00030\u0098\u0001H\u0002J\u0008\u0010a\u001a\u00020\nH\u0016J\t\u0010\u009f\u0001\u001a\u00020\nH\u0002J\n\u0010\u00a0\u0001\u001a\u00030\u0098\u0001H\u0014J\u0013\u0010\u00a1\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00a2\u0001\u001a\u00020\nH\u0016J\u0015\u0010\u00a3\u0001\u001a\u00030\u0098\u00012\t\u0010\u00a4\u0001\u001a\u0004\u0018\u00010kH\u0007J\u0013\u0010\u00a5\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00a6\u0001\u001a\u00020:H\u0016J\u0015\u0010\u00a7\u0001\u001a\u00030\u0098\u00012\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010 H\u0016J\u0015\u0010\u00a9\u0001\u001a\u00030\u0098\u00012\t\u0010\u00aa\u0001\u001a\u0004\u0018\u00010:H\u0016J\u0013\u0010\u00ab\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00a8\u0001\u001a\u00020%H\u0007J\u0016\u0010\u00ac\u0001\u001a\u00030\u0098\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0016J\u0015\u0010\u00af\u0001\u001a\u00030\u0098\u00012\t\u0010\u00b0\u0001\u001a\u0004\u0018\u000105H\u0016J\u0015\u0010\u00b1\u0001\u001a\u00030\u0098\u00012\t\u0010\u00b2\u0001\u001a\u0004\u0018\u00010:H\u0016J\u0013\u0010\u00b3\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00a8\u0001\u001a\u00020%H\u0007J\u001a\u0010\u00b4\u0001\u001a\u00030\u0098\u00012\t\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0002\u0010TJ\u0013\u0010\u00b6\u0001\u001a\u00030\u0098\u00012\t\u0010\u00b7\u0001\u001a\u0004\u0018\u00010:J\u0016\u0010\u00b8\u0001\u001a\u00030\u0098\u00012\n\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0016J\u0015\u0010\u00ba\u0001\u001a\u00030\u0098\u00012\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010:H\u0007J\u0013\u0010\u00bc\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00bd\u0001\u001a\u00020\nH\u0016J\u0013\u0010\u00be\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00a8\u0001\u001a\u00020%H\u0007J\u001c\u0010\u00bf\u0001\u001a\u00030\u0098\u00012\u000b\u0008\u0001\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0008H\u0007\u00a2\u0006\u0002\u0010TJ \u0010\u00c0\u0001\u001a\u00030\u0098\u00012\t\u0008\u0001\u0010\u00c1\u0001\u001a\u00020\u00082\t\u0008\u0001\u0010\u00c2\u0001\u001a\u00020\u0008H\u0016J\u0016\u0010\u00c3\u0001\u001a\u00030\u0098\u00012\n\u0010\u00c4\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0016J\u0015\u0010\u00c5\u0001\u001a\u00030\u0098\u00012\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010%H\u0007J\u0016\u0010\u00c6\u0001\u001a\u00030\u0098\u00012\n\u0010\u00c7\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0016J\u0010\u0010\u00c8\u0001\u001a\u00030\u0098\u00012\u0006\u0010\t\u001a\u00020\nJ\n\u0010\u00c9\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010\u00ca\u0001\u001a\u00030\u0098\u0001H\u0002J\u001e\u0010\u00cb\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u00cc\u0001\u001a\u00020\u000e2\t\u0008\u0001\u0010\u00cd\u0001\u001a\u00020\u0008H\u0002J\u0007\u0010\u00ce\u0001\u001a\u00020\nJ\u0007\u0010\u00cf\u0001\u001a\u00020\nR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R+\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008+\u0010\u001e\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\u0016\u0010,\u001a\u00020-8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00108R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010<\u001a\u00020=8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R+\u0010@\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008C\u0010\u001e\u001a\u0004\u0008A\u0010(\"\u0004\u0008B\u0010*R\u0016\u0010D\u001a\u00020E8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u0004\u0018\u00010I8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010KR+\u0010L\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008O\u0010\u001e\u001a\u0004\u0008M\u0010(\"\u0004\u0008N\u0010*R/\u0010P\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00088@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008U\u0010\u001e\u001a\u0004\u0008Q\u0010R\"\u0004\u0008S\u0010TR\u0016\u0010V\u001a\u00020W8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u0016\u0010Z\u001a\u00020E8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008[\u0010GR\u001a\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020^0]8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008_\u0010`R\u000e\u0010a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010b\u001a\u0004\u0018\u00010c8F\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010eR\u0013\u0010f\u001a\u0004\u0018\u00010g8F\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010iR\u0016\u0010j\u001a\u0004\u0018\u00010k8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010mR\u0016\u0010n\u001a\u0004\u0018\u00010o8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010qR\u0016\u0010r\u001a\u00020s8\u0000X\u0081\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008t\u0010uR/\u0010v\u001a\u0004\u0018\u00010%2\u0008\u0010\u0016\u001a\u0004\u0018\u00010%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008y\u0010\u001e\u001a\u0004\u0008w\u0010(\"\u0004\u0008x\u0010*R\u001a\u0010z\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R\u0015\u0010\u007f\u001a\u00020EX\u0080\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u0080\u0001\u0010GR\u0019\u0010\u0081\u0001\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001R2\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\n8\u0000@@X\u0081\u000e\u00a2\u0006\u0018\n\u0000\u0012\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u001a\u0005\u0008\u0088\u0001\u0010|\"\u0005\u0008\u0089\u0001\u0010~R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020E0\u008c\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u0090\u0001\u0010\u001e\u001a\u0005\u0008\u008e\u0001\u0010|\"\u0005\u0008\u008f\u0001\u0010~R\u001a\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0010\u0010\u0095\u0001\u001a\u00030\u0096\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00d3\u0001"
    }
    d2 = {
        "Lcom/stripe/android/view/CardMultilineWidget;",
        "Landroid/widget/LinearLayout;",
        "Lcom/stripe/android/view/CardWidget;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "shouldShowPostalCode",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V",
        "allFields",
        "",
        "Lcom/stripe/android/view/StripeEditText;",
        "getAllFields",
        "()Ljava/util/Collection;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "cardBrand",
        "<set-?>",
        "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;",
        "cardBrandIconSupplier",
        "getCardBrandIconSupplier$payments_core_release",
        "()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;",
        "setCardBrandIconSupplier$payments_core_release",
        "(Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;)V",
        "cardBrandIconSupplier$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "cardInputListener",
        "Lcom/stripe/android/view/CardInputListener;",
        "cardNumberEditText",
        "Lcom/stripe/android/view/CardNumberEditText;",
        "getCardNumberEditText",
        "()Lcom/stripe/android/view/CardNumberEditText;",
        "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;",
        "cardNumberErrorListener",
        "getCardNumberErrorListener$payments_core_release",
        "()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;",
        "setCardNumberErrorListener$payments_core_release",
        "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V",
        "cardNumberErrorListener$delegate",
        "cardNumberTextInputLayout",
        "Lcom/stripe/android/view/CardNumberTextInputLayout;",
        "getCardNumberTextInputLayout",
        "()Lcom/stripe/android/view/CardNumberTextInputLayout;",
        "cardParams",
        "Lcom/stripe/android/model/CardParams;",
        "getCardParams",
        "()Lcom/stripe/android/model/CardParams;",
        "cardValidCallback",
        "Lcom/stripe/android/view/CardValidCallback;",
        "cardValidTextWatcher",
        "com/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1",
        "Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;",
        "customCvcLabel",
        "",
        "customCvcPlaceholderText",
        "cvcEditText",
        "Lcom/stripe/android/view/CvcEditText;",
        "getCvcEditText",
        "()Lcom/stripe/android/view/CvcEditText;",
        "cvcErrorListener",
        "getCvcErrorListener$payments_core_release",
        "setCvcErrorListener$payments_core_release",
        "cvcErrorListener$delegate",
        "cvcInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "getCvcInputLayout",
        "()Lcom/google/android/material/textfield/TextInputLayout;",
        "expirationDate",
        "Lcom/stripe/android/model/ExpirationDate$Validated;",
        "getExpirationDate",
        "()Lcom/stripe/android/model/ExpirationDate$Validated;",
        "expirationDateErrorListener",
        "getExpirationDateErrorListener$payments_core_release",
        "setExpirationDateErrorListener$payments_core_release",
        "expirationDateErrorListener$delegate",
        "expirationDatePlaceholderRes",
        "getExpirationDatePlaceholderRes$payments_core_release",
        "()Ljava/lang/Integer;",
        "setExpirationDatePlaceholderRes$payments_core_release",
        "(Ljava/lang/Integer;)V",
        "expirationDatePlaceholderRes$delegate",
        "expiryDateEditText",
        "Lcom/stripe/android/view/ExpiryDateEditText;",
        "getExpiryDateEditText",
        "()Lcom/stripe/android/view/ExpiryDateEditText;",
        "expiryTextInputLayout",
        "getExpiryTextInputLayout",
        "invalidFields",
        "",
        "Lcom/stripe/android/view/CardValidCallback$Fields;",
        "getInvalidFields$payments_core_release",
        "()Ljava/util/Set;",
        "isEnabled",
        "paymentMethodBillingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "getPaymentMethodBillingDetails",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "paymentMethodBillingDetailsBuilder",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;",
        "getPaymentMethodBillingDetailsBuilder",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;",
        "paymentMethodCard",
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "getPaymentMethodCard",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodCreateParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "postalCodeEditText",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "getPostalCodeEditText$payments_core_release",
        "()Lcom/stripe/android/view/PostalCodeEditText;",
        "postalCodeErrorListener",
        "getPostalCodeErrorListener$payments_core_release",
        "setPostalCodeErrorListener$payments_core_release",
        "postalCodeErrorListener$delegate",
        "postalCodeRequired",
        "getPostalCodeRequired",
        "()Z",
        "setPostalCodeRequired",
        "(Z)V",
        "postalInputLayout",
        "getPostalInputLayout$payments_core_release",
        "secondRowLayout",
        "getSecondRowLayout",
        "()Landroid/widget/LinearLayout;",
        "value",
        "shouldShowErrorIcon",
        "getShouldShowErrorIcon$payments_core_release$annotations",
        "()V",
        "getShouldShowErrorIcon$payments_core_release",
        "setShouldShowErrorIcon$payments_core_release",
        "showCvcIconInCvcField",
        "textInputLayouts",
        "",
        "usZipCodeRequired",
        "getUsZipCodeRequired",
        "setUsZipCodeRequired",
        "usZipCodeRequired$delegate",
        "validatedCardNumber",
        "Lcom/stripe/android/cards/CardNumber$Validated;",
        "getValidatedCardNumber$payments_core_release",
        "()Lcom/stripe/android/cards/CardNumber$Validated;",
        "viewBinding",
        "Lcom/stripe/android/databinding/CardMultilineWidgetBinding;",
        "adjustViewForPostalCodeAttribute",
        "",
        "checkAttributeSet",
        "clear",
        "flipToCvcIconIfNotFinished",
        "initDeleteEmptyListeners",
        "initFocusChangeListeners",
        "initTextInputLayoutErrorHandlers",
        "isPostalRequired",
        "onAttachedToWindow",
        "onWindowFocusChanged",
        "hasWindowFocus",
        "populate",
        "card",
        "setCardHint",
        "cardHint",
        "setCardInputListener",
        "listener",
        "setCardNumber",
        "cardNumber",
        "setCardNumberErrorListener",
        "setCardNumberTextWatcher",
        "cardNumberTextWatcher",
        "Landroid/text/TextWatcher;",
        "setCardValidCallback",
        "callback",
        "setCvcCode",
        "cvcCode",
        "setCvcErrorListener",
        "setCvcIcon",
        "resId",
        "setCvcLabel",
        "cvcLabel",
        "setCvcNumberTextWatcher",
        "cvcNumberTextWatcher",
        "setCvcPlaceholderText",
        "cvcPlaceholderText",
        "setEnabled",
        "enabled",
        "setExpirationDateErrorListener",
        "setExpirationDatePlaceholderRes",
        "setExpiryDate",
        "month",
        "year",
        "setExpiryDateTextWatcher",
        "expiryDateTextWatcher",
        "setPostalCodeErrorListener",
        "setPostalCodeTextWatcher",
        "postalCodeTextWatcher",
        "setShouldShowPostalCode",
        "updateBrandUi",
        "updateCvc",
        "updateEndIcon",
        "editText",
        "iconResourceId",
        "validateAllFields",
        "validateCardNumber",
        "CardBrandIcon",
        "CardBrandIconSupplier",
        "Companion",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardMultilineWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardMultilineWidget.kt\ncom/stripe/android/view/CardMultilineWidget\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,778:1\n33#2,3:779\n33#2,3:782\n33#2,3:785\n33#2,3:788\n33#2,3:791\n33#2,3:794\n33#2,3:797\n1855#3,2:800\n1855#3:802\n1856#3:829\n1855#3,2:831\n1855#3,2:833\n288#3,2:835\n1855#3,2:837\n58#4,23:803\n93#4,3:826\n1#5:830\n329#6,4:839\n52#7,9:843\n*S KotlinDebug\n*F\n+ 1 CardMultilineWidget.kt\ncom/stripe/android/view/CardMultilineWidget\n*L\n142#1:779,3\n268#1:782,3\n283#1:785,3\n289#1:788,3\n300#1:791,3\n311#1:794,3\n322#1:797,3\n336#1:800,2\n389#1:802\n389#1:829\n435#1:831,2\n439#1:833,2\n478#1:835,2\n592#1:837,2\n390#1:803,23\n390#1:826,3\n629#1:839,4\n639#1:843,9\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field private static final CARD_MULTILINE_TOKEN:Ljava/lang/String; = "CardMultilineView"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/view/CardMultilineWidget$Companion;

.field private static final DEFAULT_CARD_BRAND_ICON_SUPPLIER:Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private cardBrand:Lcom/stripe/android/model/CardBrand;

.field private final cardBrandIconSupplier$delegate:Lkotlin/properties/ReadWriteProperty;

.field private cardInputListener:Lcom/stripe/android/view/CardInputListener;

.field private final cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

.field private final cardNumberErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final cardNumberTextInputLayout:Lcom/stripe/android/view/CardNumberTextInputLayout;

.field private cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

.field private final cardValidTextWatcher:Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;

.field private customCvcLabel:Ljava/lang/String;

.field private customCvcPlaceholderText:Ljava/lang/String;

.field private final cvcEditText:Lcom/stripe/android/view/CvcEditText;

.field private final cvcErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final cvcInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final expirationDateErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final expirationDatePlaceholderRes$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

.field private final expiryTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private isEnabled:Z

.field private final postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

.field private final postalCodeErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

.field private postalCodeRequired:Z

.field private final postalInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final secondRowLayout:Landroid/widget/LinearLayout;

.field private shouldShowErrorIcon:Z

.field private shouldShowPostalCode:Z

.field private showCvcIconInCvcField:Z

.field private final textInputLayouts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/material/textfield/TextInputLayout;",
            ">;"
        }
    .end annotation
.end field

.field private final usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final viewBinding:Lcom/stripe/android/databinding/CardMultilineWidgetBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x7

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "usZipCodeRequired"

    const-string v3, "getUsZipCodeRequired()Z"

    const-class v4, Lcom/stripe/android/view/CardMultilineWidget;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "expirationDatePlaceholderRes"

    const-string v3, "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "cardBrandIconSupplier"

    const-string v3, "getCardBrandIconSupplier$payments_core_release()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "cardNumberErrorListener"

    const-string v3, "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "expirationDateErrorListener"

    const-string v3, "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "cvcErrorListener"

    const-string v3, "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "postalCodeErrorListener"

    const-string v3, "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/view/CardMultilineWidget$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardMultilineWidget;->Companion:Lcom/stripe/android/view/CardMultilineWidget$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CardMultilineWidget;->$stable:I

    sget-object v0, Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;->INSTANCE:Lcom/stripe/android/view/CardMultilineWidget$Companion$DEFAULT_CARD_BRAND_ICON_SUPPLIER$1;

    sput-object v0, Lcom/stripe/android/view/CardMultilineWidget;->DEFAULT_CARD_BRAND_ICON_SUPPLIER:Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/CardMultilineWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/CardMultilineWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/view/CardMultilineWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V
    .locals 6
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-boolean p4, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/CardMultilineWidgetBinding;

    move-result-object p1

    const-string p3, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->viewBinding:Lcom/stripe/android/databinding/CardMultilineWidgetBinding;

    iget-object p3, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->etCardNumber:Lcom/stripe/android/view/CardNumberEditText;

    const-string p4, "viewBinding.etCardNumber"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    iget-object p3, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->etExpiry:Lcom/stripe/android/view/ExpiryDateEditText;

    const-string p4, "viewBinding.etExpiry"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    iget-object p3, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->etCvc:Lcom/stripe/android/view/CvcEditText;

    const-string p4, "viewBinding.etCvc"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    iget-object p3, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->etPostalCode:Lcom/stripe/android/view/PostalCodeEditText;

    const-string p4, "viewBinding.etPostalCode"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    iget-object p3, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->secondRowLayout:Landroid/widget/LinearLayout;

    const-string p4, "viewBinding.secondRowLayout"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->secondRowLayout:Landroid/widget/LinearLayout;

    iget-object p3, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->tlCardNumber:Lcom/stripe/android/view/CardNumberTextInputLayout;

    const-string p4, "viewBinding.tlCardNumber"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberTextInputLayout:Lcom/stripe/android/view/CardNumberTextInputLayout;

    iget-object p4, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->tlExpiry:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v0, "viewBinding.tlExpiry"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->tlCvc:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "viewBinding.tlCvc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object p1, p1, Lcom/stripe/android/databinding/CardMultilineWidgetBinding;->tlPostalCode:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v1, "viewBinding.tlPostalCode"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x4

    new-array v1, v1, [Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    const/4 v3, 0x1

    aput-object p4, v1, v3

    const/4 v4, 0x2

    aput-object v0, v1, v4

    const/4 v4, 0x3

    aput-object p1, v1, v4

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->textInputLayouts:Ljava/util/List;

    new-instance v4, Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;

    invoke-direct {v4, p0}, Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;

    sget-object v4, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    sget-object v4, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v5, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$1;

    invoke-direct {v5, v4, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget v4, Lcom/stripe/android/R$string;->expiry_date_hint:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$2;

    invoke-direct {v5, v4, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->expirationDatePlaceholderRes$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v4, Lcom/stripe/android/view/CardMultilineWidget;->DEFAULT_CARD_BRAND_ICON_SUPPLIER:Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;

    new-instance v5, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$3;

    invoke-direct {v5, v4, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrandIconSupplier$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance v4, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {v4, p3}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance p3, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$4;

    invoke-direct {p3, v4, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$4;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object p3, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {p3, p4}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance p4, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$5;

    invoke-direct {p4, p3, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$5;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object p4, p0, Lcom/stripe/android/view/CardMultilineWidget;->expirationDateErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {p3, v0}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance p4, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$6;

    invoke-direct {p4, p3, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$6;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object p4, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance p3, Lcom/stripe/android/view/ErrorListener;

    invoke-direct {p3, p1}, Lcom/stripe/android/view/ErrorListener;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    new-instance p1, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$7;

    invoke-direct {p1, p3, p0}, Lcom/stripe/android/view/CardMultilineWidget$special$$inlined$observable$7;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardMultilineWidget;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getHintTextColors()Landroid/content/res/ColorStateList;

    move-result-object p4

    :cond_0
    invoke-virtual {p3, p4}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2}, Lcom/stripe/android/view/CardMultilineWidget;->checkAttributeSet(Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->initTextInputLayoutErrorHandlers()V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners()V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->initDeleteEmptyListeners()V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Lcom/stripe/android/view/CardMultilineWidget$2;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/CardMultilineWidget$2;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Lcom/stripe/android/view/CardMultilineWidget$3;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/CardMultilineWidget$3;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance p2, Lcom/stripe/android/view/CardMultilineWidget$4;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/CardMultilineWidget$4;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/ExpiryDateEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance p2, Lcom/stripe/android/view/CardMultilineWidget$5;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/CardMultilineWidget$5;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance p2, Lcom/stripe/android/view/CardMultilineWidget$6;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/CardMultilineWidget$6;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    iget-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->adjustViewForPostalCodeAttribute(Z)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1, v2, v3, p4}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter$payments_core_release$default(Lcom/stripe/android/view/CardNumberEditText;IILjava/lang/Object;)V

    sget-object p1, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrandUi()V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/view/StripeEditText;

    new-instance p3, Lcom/stripe/android/view/CardMultilineWidget$_init_$lambda$18$$inlined$doAfterTextChanged$1;

    invoke-direct {p3, p0}, Lcom/stripe/android/view/CardMultilineWidget$_init_$lambda$18$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance p2, Lcom/stripe/android/view/CardMultilineWidget$8;

    invoke-direct {p2, p0}, Lcom/stripe/android/view/CardMultilineWidget$8;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setLoadingCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object p2, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    iput-boolean v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->isEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x1

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/CardMultilineWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners$lambda$26(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static final synthetic access$flipToCvcIconIfNotFinished(Lcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->flipToCvcIconIfNotFinished()V

    return-void
.end method

.method public static final synthetic access$getCardBrand$p(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/model/CardBrand;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object p0
.end method

.method public static final synthetic access$getCardInputListener$p(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-object p0
.end method

.method public static final synthetic access$getCardValidCallback$p(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardValidCallback;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    return-object p0
.end method

.method public static final synthetic access$getShouldShowPostalCode$p(Lcom/stripe/android/view/CardMultilineWidget;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    return p0
.end method

.method public static final synthetic access$getShowCvcIconInCvcField$p(Lcom/stripe/android/view/CardMultilineWidget;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->showCvcIconInCvcField:Z

    return p0
.end method

.method public static final synthetic access$isPostalRequired(Lcom/stripe/android/view/CardMultilineWidget;)Z
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->isPostalRequired()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setCardBrand$p(Lcom/stripe/android/view/CardMultilineWidget;Lcom/stripe/android/model/CardBrand;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-void
.end method

.method public static final synthetic access$updateBrandUi(Lcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrandUi()V

    return-void
.end method

.method private final adjustViewForPostalCodeAttribute(Z)V
    .locals 4

    if-eqz p1, :cond_0

    sget v0, Lcom/stripe/android/R$string;->expiry_label_short:I

    goto :goto_0

    :cond_0
    sget v0, Lcom/stripe/android/R$string;->acc_label_expiry_date:I

    :goto_0
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_1

    sget v0, Lcom/stripe/android/R$id;->et_postal_code:I

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    :goto_1
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusForwardId(I)V

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1, v0}, Landroid/view/View;->setNextFocusDownId(I)V

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    if-ne v2, v1, :cond_3

    const/4 v1, 0x6

    goto :goto_3

    :cond_3
    const/4 v1, 0x5

    :goto_3
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setImeOptions(I)V

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/stripe/android/R$dimen;->stripe_add_card_expiry_middle_margin:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    :cond_4
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners$lambda$29(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic c(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners$lambda$28(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V

    return-void
.end method

.method private final checkAttributeSet(Landroid/util/AttributeSet;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/R$styleable;->CardElement:[I

    const-string v2, "CardElement"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldShowPostalCode:I

    iget-boolean v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldRequirePostalCode:I

    iget-boolean v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeRequired:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeRequired:Z

    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldRequireUsZipCode:I

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardMultilineWidget;->setUsZipCodeRequired(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic d(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners$lambda$27(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V

    return-void
.end method

.method private final flipToCvcIconIfNotFinished()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getFieldText$payments_core_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/CardBrand;->isMaxCvc(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowErrorIcon:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v0}, Lcom/stripe/android/model/CardBrand;->getErrorIcon()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v0}, Lcom/stripe/android/view/CardMultilineWidget;->updateEndIcon(Lcom/stripe/android/view/StripeEditText;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v0}, Lcom/stripe/android/model/CardBrand;->getCvcIcon()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v0}, Lcom/stripe/android/view/CardMultilineWidget;->updateEndIcon(Lcom/stripe/android/view/StripeEditText;I)V

    :goto_0
    return-void
.end method

.method private final getAllFields()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/view/StripeEditText;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final getExpirationDate()Lcom/stripe/android/model/ExpirationDate$Validated;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getShouldShowErrorIcon$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final initDeleteEmptyListeners()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    return-void
.end method

.method private final initFocusChangeListeners()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v0

    new-instance v1, LQf0;

    invoke-direct {v1, p0}, LQf0;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v0

    new-instance v1, LRf0;

    invoke-direct {v1, p0}, LRf0;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v0

    new-instance v1, LSf0;

    invoke-direct {v1, p0}, LSf0;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v0

    new-instance v1, LTf0;

    invoke-direct {v1, p0}, LTf0;-><init>(Lcom/stripe/android/view/CardMultilineWidget;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final initFocusChangeListeners$lambda$26(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->CardNumber:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initFocusChangeListeners$lambda$27(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->ExpiryDate:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initFocusChangeListeners$lambda$28(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    iget-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->showCvcIconInCvcField:Z

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->flipToCvcIconIfNotFinished()V

    :cond_0
    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_2

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->Cvc:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrandUi()V

    :cond_2
    :goto_0
    return-void
.end method

.method private static final initFocusChangeListeners$lambda$29(Lcom/stripe/android/view/CardMultilineWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->PostalCode:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private final initTextInputLayoutErrorHandlers()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorMessageListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method private final isPostalRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeRequired:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final updateBrandUi()V
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateCvc()V

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowErrorIcon:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v0}, Lcom/stripe/android/model/CardBrand;->getErrorIcon()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v0}, Lcom/stripe/android/view/CardMultilineWidget;->updateEndIcon(Lcom/stripe/android/view/StripeEditText;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardBrandIconSupplier$payments_core_release()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-interface {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;->get(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;->getIconResourceId()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v0}, Lcom/stripe/android/view/CardMultilineWidget;->updateEndIcon(Lcom/stripe/android/view/StripeEditText;I)V

    :goto_0
    return-void
.end method

.method private final updateCvc()V
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->customCvcLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/view/CardMultilineWidget;->customCvcPlaceholderText:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/stripe/android/view/CvcEditText;->updateBrand$payments_core_release(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void
.end method

.method private final updateEndIcon(Lcom/stripe/android/view/StripeEditText;I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p2, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    sget-object v0, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    iput-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrandUi()V

    return-void
.end method

.method public final synthetic getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getCardBrandIconSupplier$payments_core_release()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrandIconSupplier$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;

    return-object v0
.end method

.method public final getCardNumberEditText()Lcom/stripe/android/view/CardNumberEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    return-object v0
.end method

.method public final getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-object v0
.end method

.method public final getCardNumberTextInputLayout()Lcom/stripe/android/view/CardNumberTextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberTextInputLayout:Lcom/stripe/android/view/CardNumberTextInputLayout;

    return-object v0
.end method

.method public getCardParams()Lcom/stripe/android/model/CardParams;
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardMultilineWidget;->validateAllFields()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    return-object v3

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->setShouldShowErrorIcon$payments_core_release(Z)V

    iget-object v4, v0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v4}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v4

    if-eqz v4, :cond_9

    iget-object v5, v0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v12, v5

    goto :goto_0

    :cond_1
    move-object v12, v3

    :goto_0
    iget-object v5, v0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v3

    :goto_1
    iget-boolean v6, v0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    move-object v5, v3

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardMultilineWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v7

    const-string v6, "CardMultilineView"

    invoke-static {v6}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/stripe/android/cards/CardNumber$Validated;->getValue()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_4
    move-object v6, v3

    :goto_3
    if-nez v6, :cond_5

    const-string v6, ""

    :cond_5
    move-object v9, v6

    invoke-virtual {v4}, Lcom/stripe/android/model/ExpirationDate$Validated;->getMonth()I

    move-result v10

    invoke-virtual {v4}, Lcom/stripe/android/model/ExpirationDate$Validated;->getYear()I

    move-result v11

    const/4 v13, 0x0

    new-instance v4, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v4}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    if-eqz v5, :cond_7

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :cond_7
    :goto_4
    if-nez v2, :cond_8

    move-object v3, v5

    :cond_8
    invoke-virtual {v4, v3}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x340

    const/16 v18, 0x0

    new-instance v1, Lcom/stripe/android/model/CardParams;

    move-object v6, v1

    invoke-direct/range {v6 .. v18}, Lcom/stripe/android/model/CardParams;-><init>(Lcom/stripe/android/model/CardBrand;Ljava/util/Set;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getCvcEditText()Lcom/stripe/android/view/CvcEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    return-object v0
.end method

.method public final getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-object v0
.end method

.method public final getCvcInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expirationDateErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-object v0
.end method

.method public final getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expirationDatePlaceholderRes$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final getExpiryDateEditText()Lcom/stripe/android/view/ExpiryDateEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object v0
.end method

.method public final getExpiryTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getInvalidFields$payments_core_release()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/CardValidCallback$Fields;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/view/CardValidCallback$Fields;

    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Number:Lcom/stripe/android/view/CardValidCallback$Fields;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const/4 v5, 0x0

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v5

    :goto_1
    aput-object v1, v0, v4

    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Expiry:Lcom/stripe/android/view/CardValidCallback$Fields;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpirationDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v2

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v5

    :goto_3
    aput-object v1, v0, v3

    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Cvc:Lcom/stripe/android/view/CardValidCallback$Fields;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/CvcEditText;->getCvc$payments_core_release()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v2

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    move v2, v4

    :goto_4
    if-eqz v2, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v5

    :goto_5
    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/view/CardValidCallback$Fields;->Postal:Lcom/stripe/android/view/CardValidCallback$Fields;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->isPostalRequired()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_6

    :cond_6
    move v2, v4

    goto :goto_7

    :cond_7
    :goto_6
    move v2, v3

    :goto_7
    if-eqz v2, :cond_8

    goto :goto_8

    :cond_8
    move v3, v4

    :goto_8
    if-eqz v3, :cond_9

    move-object v5, v1

    :cond_9
    const/4 v1, 0x3

    aput-object v5, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getPaymentMethodBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPaymentMethodBillingDetailsBuilder()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;->build()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getPaymentMethodBillingDetailsBuilder()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->validateAllFields()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;-><init>()V

    new-instance v1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;->setAddress(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;
    .locals 11

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getCardParams()Lcom/stripe/android/model/CardParams;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getNumber$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getCvc$payments_core_release()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getExpMonth$payments_core_release()I

    move-result v1

    invoke-virtual {v0}, Lcom/stripe/android/model/CardParams;->getExpYear$payments_core_release()I

    move-result v3

    invoke-virtual {v0}, Lcom/stripe/android/model/TokenParams;->getAttribution()Ljava/util/Set;

    move-result-object v7

    new-instance v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v9, 0x10

    const/4 v10, 0x0

    move-object v1, v0

    move-object v3, v4

    move-object v4, v6

    move-object v6, v8

    move v8, v9

    move-object v9, v10

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 6

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getPaymentMethodBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->create$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    return-object v0
.end method

.method public final getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;

    return-object v0
.end method

.method public final getPostalCodeRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeRequired:Z

    return v0
.end method

.method public final getPostalInputLayout$payments_core_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getSecondRowLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->secondRowLayout:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getShouldShowErrorIcon$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowErrorIcon:Z

    return v0
.end method

.method public final getUsZipCodeRequired()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v0

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->isEnabled:Z

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrandUi()V

    :cond_0
    return-void
.end method

.method public final populate(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;)V
    .locals 3

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;->getNumber$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;->getCvc$payments_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;->getExpiryMonth$payments_core_release()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;->getExpiryYear$payments_core_release()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setText$payments_core_release(Ljava/lang/Integer;Ljava/lang/Integer;)V

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setCardBrandIconSupplier$payments_core_release(Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardBrandIconSupplier$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public setCardHint(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cardHint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberTextInputLayout:Lcom/stripe/android/view/CardNumberTextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCardInputListener(Lcom/stripe/android/view/CardInputListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCardNumberErrorListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setCardNumberErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method public final setCardNumberErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public setCardNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setCardValidCallback(Lcom/stripe/android/view/CardValidCallback;)V
    .locals 3

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    iget-object v2, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getInvalidFields$payments_core_release()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getInvalidFields$payments_core_release()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/stripe/android/view/CardValidCallback;->onInputChanged(ZLjava/util/Set;)V

    :cond_2
    return-void
.end method

.method public setCvcCode(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCvcErrorListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setCvcErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method public final setCvcErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic setCvcIcon(Ljava/lang/Integer;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardMultilineWidget;->updateEndIcon(Lcom/stripe/android/view/StripeEditText;I)V

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->showCvcIconInCvcField:Z

    return-void
.end method

.method public final setCvcLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->customCvcLabel:Ljava/lang/String;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateCvc()V

    return-void
.end method

.method public setCvcNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setCvcPlaceholderText(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->customCvcPlaceholderText:Ljava/lang/String;

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateCvc()V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->textInputLayouts:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->isEnabled:Z

    return-void
.end method

.method public final setExpirationDateErrorListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDateErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method public final setExpirationDateErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expirationDateErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setExpirationDatePlaceholderRes(Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setExpirationDatePlaceholderRes$payments_core_release(Ljava/lang/Integer;)V

    return-void
.end method

.method public final setExpirationDatePlaceholderRes$payments_core_release(Ljava/lang/Integer;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expirationDatePlaceholderRes$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public setExpiryDate(II)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-direct {v1, p1, p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;-><init>(II)V

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getDisplayString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setExpiryDateTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setPostalCodeErrorListener(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->setPostalCodeErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V

    return-void
.end method

.method public final setPostalCodeErrorListener$payments_core_release(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeErrorListener$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setPostalCodeRequired(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeRequired:Z

    return-void
.end method

.method public setPostalCodeTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setShouldShowErrorIcon$payments_core_release(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowErrorIcon:Z

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowErrorIcon:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->updateBrandUi()V

    :cond_1
    return-void
.end method

.method public final setShouldShowPostalCode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardMultilineWidget;->shouldShowPostalCode:Z

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardMultilineWidget;->adjustViewForPostalCodeAttribute(Z)V

    return-void
.end method

.method public final setUsZipCodeRequired(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardMultilineWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final validateAllFields()Z
    .locals 8

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getExpirationDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    iget-object v4, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v4}, Lcom/stripe/android/view/CvcEditText;->getCvc$payments_core_release()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    xor-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    xor-int/lit8 v6, v3, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    xor-int/lit8 v6, v4, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v5, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    iget-boolean v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeRequired:Z

    if-nez v6, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getUsZipCodeRequired()Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_3
    iget-object v6, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v6}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    move v6, v1

    goto :goto_4

    :cond_5
    :goto_3
    move v6, v2

    :goto_4
    if-eqz v6, :cond_6

    move v6, v2

    goto :goto_5

    :cond_6
    move v6, v1

    :goto_5
    invoke-virtual {v5, v6}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-direct {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getAllFields()Ljava/util/Collection;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_6

    :cond_8
    const/4 v6, 0x0

    :goto_6
    check-cast v6, Lcom/stripe/android/view/StripeEditText;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Landroid/view/View;->requestFocus()Z

    :cond_9
    if-eqz v0, :cond_a

    if-eqz v3, :cond_a

    if-eqz v4, :cond_a

    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v0

    if-nez v0, :cond_a

    move v1, v2

    :cond_a
    return v1
.end method

.method public final validateCardNumber()Z
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardMultilineWidget;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/stripe/android/view/CardMultilineWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    xor-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return v0
.end method
