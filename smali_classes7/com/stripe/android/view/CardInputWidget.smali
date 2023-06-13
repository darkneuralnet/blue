.class public final Lcom/stripe/android/view/CardInputWidget;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/view/CardWidget;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;,
        Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;,
        Lcom/stripe/android/view/CardInputWidget$Field;,
        Lcom/stripe/android/view/CardInputWidget$WhenMappings;,
        Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;,
        Lcom/stripe/android/view/CardInputWidget$Companion;,
        Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009f\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010#\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0014*\u0001(\u0008\u0007\u0018\u0000 \u00dd\u00012\u00020\u00012\u00020\u0002:\u001c\u00d9\u0001\u00da\u0001\u00db\u0001\u00dc\u0001\u00dd\u0001\u00de\u0001\u00df\u0001\u00e0\u0001\u00e1\u0001\u00e2\u0001\u00e3\u0001\u00e4\u0001\u00e5\u0001\u00e6\u0001B%\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0016J\u0018\u0010\u0095\u0001\u001a\u0002032\u0007\u0010\u0096\u0001\u001a\u00020\u0008H\u0001\u00a2\u0006\u0003\u0008\u0097\u0001J\u001b\u0010\u0098\u0001\u001a\u00020\u00082\u0007\u0010\u0099\u0001\u001a\u0002032\u0007\u0010\u009a\u0001\u001a\u00020\u000cH\u0002J\u001d\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u00082\u0006\u0010E\u001a\u00020\u0008H\u0002J\u0014\u0010\u009e\u0001\u001a\u00030\u0093\u00012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\t\u0010\u009f\u0001\u001a\u00020VH\u0016J\t\u0010\u00a0\u0001\u001a\u00020VH\u0002J\n\u0010\u00a1\u0001\u001a\u00030\u0093\u0001H\u0014J\u0013\u0010\u00a2\u0001\u001a\u00020V2\u0008\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u0016J7\u0010\u00a5\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u00a6\u0001\u001a\u00020V2\u0007\u0010\u00a7\u0001\u001a\u00020\u00082\u0007\u0010\u00a8\u0001\u001a\u00020\u00082\u0007\u0010\u00a9\u0001\u001a\u00020\u00082\u0007\u0010\u00aa\u0001\u001a\u00020\u0008H\u0014J\u0014\u0010\u00ab\u0001\u001a\u00030\u0093\u00012\u0008\u0010\u00ac\u0001\u001a\u00030\u00ad\u0001H\u0014J\n\u0010\u00ae\u0001\u001a\u00030\u00ad\u0001H\u0014J\n\u0010\u00af\u0001\u001a\u00030\u0093\u0001H\u0002J\n\u0010\u00b0\u0001\u001a\u00030\u0093\u0001H\u0002J\u0013\u0010\u00b1\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u00b2\u0001\u001a\u000203H\u0016J\u0015\u0010\u00b3\u0001\u001a\u00030\u0093\u00012\t\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u001aH\u0016J\u0015\u0010\u00b5\u0001\u001a\u00030\u0093\u00012\t\u0010\u00b6\u0001\u001a\u0004\u0018\u000103H\u0016J\u0016\u0010\u00b7\u0001\u001a\u00030\u0093\u00012\n\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00b9\u0001H\u0016J\u0015\u0010\u00ba\u0001\u001a\u00030\u0093\u00012\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010&H\u0016J\u0015\u0010\u00bc\u0001\u001a\u00030\u0093\u00012\t\u0010\u00bd\u0001\u001a\u0004\u0018\u000103H\u0016J\u0013\u0010\u00be\u0001\u001a\u00030\u0093\u00012\t\u0010\u00bf\u0001\u001a\u0004\u0018\u000103J\u0016\u0010\u00c0\u0001\u001a\u00030\u0093\u00012\n\u0010\u00c1\u0001\u001a\u0005\u0018\u00010\u00b9\u0001H\u0016J\u0013\u0010\u00c2\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u009f\u0001\u001a\u00020VH\u0016J \u0010\u00c3\u0001\u001a\u00030\u0093\u00012\t\u0008\u0001\u0010\u00c4\u0001\u001a\u00020\u00082\t\u0008\u0001\u0010\u00c5\u0001\u001a\u00020\u0008H\u0016J\u0016\u0010\u00c6\u0001\u001a\u00030\u0093\u00012\n\u0010\u00c7\u0001\u001a\u0005\u0018\u00010\u00b9\u0001H\u0016J\u001b\u0010\u00c8\u0001\u001a\u00030\u0093\u00012\t\u0010\u00c9\u0001\u001a\u0004\u0018\u000103H\u0000\u00a2\u0006\u0003\u0008\u00ca\u0001J\u0016\u0010\u00cb\u0001\u001a\u00030\u0093\u00012\n\u0010\u00cc\u0001\u001a\u0005\u0018\u00010\u00b9\u0001H\u0016J\u001a\u0010\u00cd\u0001\u001a\u00030\u0093\u00012\u000e\u0010\u00ce\u0001\u001a\t\u0012\u0005\u0012\u00030\u00cf\u00010-H\u0002J\n\u0010\u00d0\u0001\u001a\u00030\u0093\u0001H\u0002J&\u0010\u00d1\u0001\u001a\u00030\u0093\u00012\u0008\u0010\u00d2\u0001\u001a\u00030\u00d3\u00012\u0007\u0010\u00d4\u0001\u001a\u00020\u00082\u0007\u0010\u00d5\u0001\u001a\u00020\u0008H\u0002J\n\u0010\u00d6\u0001\u001a\u00030\u0093\u0001H\u0002J,\u0010\u00d7\u0001\u001a\u00030\u0093\u00012\u0006\u0010U\u001a\u00020V2\u0008\u0008\u0002\u0010H\u001a\u00020\u00082\u0008\u0008\u0002\u0010E\u001a\u00020\u0008H\u0001\u00a2\u0006\u0003\u0008\u00d8\u0001R\u0014\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000c0-8@X\u0081\u0004\u00a2\u0006\u000c\u0012\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00104\u001a\u0004\u0018\u0001058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107R\u0014\u00108\u001a\u000209X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u000e\u0010<\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010=\u001a\u0002038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?R\u0014\u0010@\u001a\u00020AX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010CR\u000e\u0010D\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0014\u0010H\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010GR \u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00080KX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010OR\u000e\u0010P\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020R0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008S\u0010TR\u001a\u0010U\u001a\u00020VX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR\u000e\u0010[\u001a\u00020VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\\\u001a\u00020]X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010aR\u0016\u0010b\u001a\u0004\u0018\u00010c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010g8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010iR\u0014\u0010j\u001a\u0002038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008k\u0010?R\u0014\u0010l\u001a\u00020mX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008n\u0010oR\u0014\u0010p\u001a\u00020qX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008r\u0010sR+\u0010u\u001a\u00020V2\u0006\u0010t\u001a\u00020V8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008x\u0010y\u001a\u0004\u0008v\u0010X\"\u0004\u0008w\u0010ZR+\u0010z\u001a\u00020V2\u0006\u0010t\u001a\u00020V8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008}\u0010y\u001a\u0004\u0008{\u0010X\"\u0004\u0008|\u0010ZR\u0015\u0010~\u001a\u00020 X\u0080\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\u0008\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u0001038BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u0082\u0001\u0010?R&\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u000c0\u0084\u00018\u0000X\u0081\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\u0008\u0085\u0001\u0010/\u001a\u0005\u0008\u0086\u0001\u0010TR1\u0010\u0088\u0001\u001a\u00020V2\u0007\u0010\u0087\u0001\u001a\u00020V8\u0000@BX\u0081\u000e\u00a2\u0006\u0017\n\u0000\u0012\u0005\u0008\u0089\u0001\u0010/\u001a\u0005\u0008\u008a\u0001\u0010X\"\u0005\u0008\u008b\u0001\u0010ZR/\u0010\u008c\u0001\u001a\u00020V2\u0006\u0010t\u001a\u00020V8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u008f\u0001\u0010y\u001a\u0005\u0008\u008d\u0001\u0010X\"\u0005\u0008\u008e\u0001\u0010ZR\u0010\u0010\u0090\u0001\u001a\u00030\u0091\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e7\u0001"
    }
    d2 = {
        "Lcom/stripe/android/view/CardInputWidget;",
        "Landroid/widget/LinearLayout;",
        "Lcom/stripe/android/view/CardWidget;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "allFields",
        "",
        "Lcom/stripe/android/view/StripeEditText;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "getBillingDetails",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "cardBrandView",
        "Lcom/stripe/android/view/CardBrandView;",
        "getCardBrandView$payments_core_release",
        "()Lcom/stripe/android/view/CardBrandView;",
        "cardInputListener",
        "Lcom/stripe/android/view/CardInputListener;",
        "cardNumberEditText",
        "Lcom/stripe/android/view/CardNumberEditText;",
        "getCardNumberEditText$payments_core_release",
        "()Lcom/stripe/android/view/CardNumberEditText;",
        "cardNumberTextInputLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "cardParams",
        "Lcom/stripe/android/model/CardParams;",
        "getCardParams",
        "()Lcom/stripe/android/model/CardParams;",
        "cardValidCallback",
        "Lcom/stripe/android/view/CardValidCallback;",
        "cardValidTextWatcher",
        "com/stripe/android/view/CardInputWidget$cardValidTextWatcher$1",
        "Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;",
        "containerLayout",
        "Landroid/widget/FrameLayout;",
        "currentFields",
        "",
        "getCurrentFields$payments_core_release$annotations",
        "()V",
        "getCurrentFields$payments_core_release",
        "()Ljava/util/List;",
        "customCvcLabel",
        "",
        "cvc",
        "Lcom/stripe/android/cards/Cvc$Validated;",
        "getCvc",
        "()Lcom/stripe/android/cards/Cvc$Validated;",
        "cvcEditText",
        "Lcom/stripe/android/view/CvcEditText;",
        "getCvcEditText$payments_core_release",
        "()Lcom/stripe/android/view/CvcEditText;",
        "cvcNumberTextInputLayout",
        "cvcPlaceHolder",
        "getCvcPlaceHolder",
        "()Ljava/lang/String;",
        "expiryDateEditText",
        "Lcom/stripe/android/view/ExpiryDateEditText;",
        "getExpiryDateEditText$payments_core_release",
        "()Lcom/stripe/android/view/ExpiryDateEditText;",
        "expiryDateTextInputLayout",
        "frameStart",
        "getFrameStart",
        "()I",
        "frameWidth",
        "getFrameWidth",
        "frameWidthSupplier",
        "Lkotlin/Function0;",
        "getFrameWidthSupplier$payments_core_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setFrameWidthSupplier$payments_core_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "hiddenCardText",
        "invalidFields",
        "Lcom/stripe/android/view/CardValidCallback$Fields;",
        "getInvalidFields",
        "()Ljava/util/Set;",
        "isShowingFullCard",
        "",
        "isShowingFullCard$payments_core_release",
        "()Z",
        "setShowingFullCard$payments_core_release",
        "(Z)V",
        "isViewInitialized",
        "layoutWidthCalculator",
        "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;",
        "getLayoutWidthCalculator$payments_core_release",
        "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;",
        "setLayoutWidthCalculator$payments_core_release",
        "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V",
        "paymentMethodCard",
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "getPaymentMethodCard",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "paymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "getPaymentMethodCreateParams",
        "()Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "peekCardText",
        "getPeekCardText",
        "placement",
        "Lcom/stripe/android/view/CardInputWidgetPlacement;",
        "getPlacement$payments_core_release",
        "()Lcom/stripe/android/view/CardInputWidgetPlacement;",
        "postalCodeEditText",
        "Lcom/stripe/android/view/PostalCodeEditText;",
        "getPostalCodeEditText$payments_core_release",
        "()Lcom/stripe/android/view/PostalCodeEditText;",
        "<set-?>",
        "postalCodeEnabled",
        "getPostalCodeEnabled",
        "setPostalCodeEnabled",
        "postalCodeEnabled$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "postalCodeRequired",
        "getPostalCodeRequired",
        "setPostalCodeRequired",
        "postalCodeRequired$delegate",
        "postalCodeTextInputLayout",
        "getPostalCodeTextInputLayout$payments_core_release",
        "()Lcom/google/android/material/textfield/TextInputLayout;",
        "postalCodeValue",
        "getPostalCodeValue",
        "requiredFields",
        "",
        "getRequiredFields$payments_core_release$annotations",
        "getRequiredFields$payments_core_release",
        "value",
        "shouldShowErrorIcon",
        "getShouldShowErrorIcon$payments_core_release$annotations",
        "getShouldShowErrorIcon$payments_core_release",
        "setShouldShowErrorIcon",
        "usZipCodeRequired",
        "getUsZipCodeRequired",
        "setUsZipCodeRequired",
        "usZipCodeRequired$delegate",
        "viewBinding",
        "Lcom/stripe/android/databinding/CardInputWidgetBinding;",
        "applyCardElementAttributes",
        "",
        "clear",
        "createHiddenCardText",
        "panLength",
        "createHiddenCardText$payments_core_release",
        "getDesiredWidthInPixels",
        "text",
        "editText",
        "getFocusField",
        "Lcom/stripe/android/view/CardInputWidget$Field;",
        "touchX",
        "initView",
        "isEnabled",
        "isPostalRequired",
        "onFinishInflate",
        "onInterceptTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "onLayout",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onRestoreInstanceState",
        "state",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "scrollEnd",
        "scrollStart",
        "setCardHint",
        "cardHint",
        "setCardInputListener",
        "listener",
        "setCardNumber",
        "cardNumber",
        "setCardNumberTextWatcher",
        "cardNumberTextWatcher",
        "Landroid/text/TextWatcher;",
        "setCardValidCallback",
        "callback",
        "setCvcCode",
        "cvcCode",
        "setCvcLabel",
        "cvcLabel",
        "setCvcNumberTextWatcher",
        "cvcNumberTextWatcher",
        "setEnabled",
        "setExpiryDate",
        "month",
        "year",
        "setExpiryDateTextWatcher",
        "expiryDateTextWatcher",
        "setPostalCode",
        "postalCode",
        "setPostalCode$payments_core_release",
        "setPostalCodeTextWatcher",
        "postalCodeTextWatcher",
        "startSlideAnimation",
        "animations",
        "Landroid/view/animation/Animation;",
        "updateCvc",
        "updateFieldLayout",
        "view",
        "Landroid/view/View;",
        "newWidth",
        "newMarginStart",
        "updatePostalRequired",
        "updateSpaceSizes",
        "updateSpaceSizes$payments_core_release",
        "AnimationEndListener",
        "CardFieldAnimation",
        "CardNumberSlideEndAnimation",
        "CardNumberSlideStartAnimation",
        "Companion",
        "CvcSlideEndAnimation",
        "CvcSlideStartAnimation",
        "DefaultLayoutWidthCalculator",
        "ExpiryDateSlideEndAnimation",
        "ExpiryDateSlideStartAnimation",
        "Field",
        "LayoutWidthCalculator",
        "PostalCodeSlideEndAnimation",
        "PostalCodeSlideStartAnimation",
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
        "SMAP\nCardInputWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 Context.kt\nandroidx/core/content/ContextKt\n+ 7 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,1266:1\n33#2,3:1267\n33#2,3:1270\n33#2,3:1273\n1#3:1276\n766#4:1277\n857#4,2:1278\n1855#4,2:1280\n1855#4,2:1282\n1855#4,2:1284\n1747#4,3:1286\n1855#4,2:1289\n1855#4,2:1291\n1726#4,3:1293\n1855#4,2:1309\n1855#4:1311\n1856#4:1338\n1855#4,2:1348\n329#5,4:1296\n52#6,9:1300\n52#6,9:1339\n58#7,23:1312\n93#7,3:1335\n*S KotlinDebug\n*F\n+ 1 CardInputWidget.kt\ncom/stripe/android/view/CardInputWidget\n*L\n286#1:1267,3\n318#1:1270,3\n330#1:1273,3\n234#1:1277\n234#1:1278,2\n235#1:1280,2\n391#1:1282,2\n395#1:1284,2\n465#1:1286,3\n469#1:1289,2\n478#1:1291,2\n517#1:1293,3\n718#1:1309,2\n788#1:1311\n788#1:1338\n976#1:1348,2\n659#1:1296,4\n694#1:1300,9\n843#1:1339,9\n789#1:1312,23\n789#1:1335,3\n*E\n"
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

.field private static final CVC_PLACEHOLDER_AMEX:Ljava/lang/String; = "2345"

.field private static final CVC_PLACEHOLDER_COMMON:Ljava/lang/String; = "CVC"

.field public static final Companion:Lcom/stripe/android/view/CardInputWidget$Companion;

.field private static final DEFAULT_READER_ID:I

.field private static final FULL_SIZING_CARD_TEXT:Ljava/lang/String; = "4242 4242 4242 4242 424"

.field private static final FULL_SIZING_DATE_TEXT:Ljava/lang/String; = "MM/MM"

.field private static final FULL_SIZING_POSTAL_CODE_TEXT:Ljava/lang/String; = "1234567890"

.field public static final LOGGING_TOKEN:Ljava/lang/String; = "CardInputView"

.field private static final STATE_CARD_VIEWED:Ljava/lang/String; = "state_card_viewed"

.field private static final STATE_POSTAL_CODE_ENABLED:Ljava/lang/String; = "state_postal_code_enabled"

.field private static final STATE_SUPER_STATE:Ljava/lang/String; = "state_super_state"


# instance fields
.field private final allFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic cardBrandView:Lcom/stripe/android/view/CardBrandView;

.field private cardInputListener:Lcom/stripe/android/view/CardInputListener;

.field private final synthetic cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

.field private final cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

.field private final cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

.field private final containerLayout:Landroid/widget/FrameLayout;

.field private customCvcLabel:Ljava/lang/String;

.field private final synthetic cvcEditText:Lcom/stripe/android/view/CvcEditText;

.field private final cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final synthetic expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

.field private final expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private synthetic frameWidthSupplier:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private hiddenCardText:Ljava/lang/String;

.field private synthetic isShowingFullCard:Z

.field private isViewInitialized:Z

.field private synthetic layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

.field private final placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

.field private final synthetic postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

.field private final postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final synthetic requiredFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation
.end field

.field private shouldShowErrorIcon:Z

.field private final usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final viewBinding:Lcom/stripe/android/databinding/CardInputWidgetBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "postalCodeEnabled"

    const-string v3, "getPostalCodeEnabled()Z"

    const-class v4, Lcom/stripe/android/view/CardInputWidget;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "postalCodeRequired"

    const-string v3, "getPostalCodeRequired()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "usZipCodeRequired"

    const-string v3, "getUsZipCodeRequired()Z"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lcom/stripe/android/view/CardInputWidget$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardInputWidget$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardInputWidget;->Companion:Lcom/stripe/android/view/CardInputWidget$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CardInputWidget;->$stable:I

    sget v0, Lcom/stripe/android/R$id;->stripe_default_reader_id:I

    sput v0, Lcom/stripe/android/view/CardInputWidget;->DEFAULT_READER_ID:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 26
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/stripe/android/databinding/CardInputWidgetBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/CardInputWidgetBinding;

    move-result-object v1

    const-string v2, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->viewBinding:Lcom/stripe/android/databinding/CardInputWidgetBinding;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->container:Landroid/widget/FrameLayout;

    const-string v3, "viewBinding.container"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    const-string v3, "viewBinding.cardBrandView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "viewBinding.cardNumberTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "viewBinding.expiryDateTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->cvcTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "viewBinding.cvcTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "viewBinding.postalCodeTextInputLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    const-string v3, "viewBinding.cardNumberEditText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    iget-object v3, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v4, "viewBinding.expiryDateEditText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    iget-object v4, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    const-string v5, "viewBinding.cvcEditText"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    iget-object v1, v1, Lcom/stripe/android/databinding/CardInputWidgetBinding;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    const-string v5, "viewBinding.postalCodeEditText"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v5, Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    invoke-direct {v5, v0}, Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v5, v0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    new-instance v6, Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;

    invoke-direct {v6}, Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;-><init>()V

    iput-object v6, v0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    new-instance v6, Lcom/stripe/android/view/CardInputWidgetPlacement;

    move-object v7, v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v24, 0xffff

    const/16 v25, 0x0

    invoke-direct/range {v7 .. v25}, Lcom/stripe/android/view/CardInputWidgetPlacement;-><init>(IIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, v0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    sget-object v6, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v7, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;

    invoke-direct {v7, v6, v0}, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v7, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$2;

    invoke-direct {v7, v6, v0}, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance v7, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$3;

    invoke-direct {v7, v6, v0}, Lcom/stripe/android/view/CardInputWidget$special$$inlined$observable$3;-><init>(Ljava/lang/Object;Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    sget v6, Lcom/stripe/android/view/CardInputWidget;->DEFAULT_READER_ID:I

    invoke-virtual {v0, v6}, Landroid/view/View;->setId(I)V

    :cond_0
    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Lcom/stripe/android/R$dimen;->stripe_card_widget_min_width:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/view/View;->setMinimumWidth(I)V

    new-instance v7, Lcom/stripe/android/view/CardInputWidget$1;

    invoke-direct {v7, v0}, Lcom/stripe/android/view/CardInputWidget$1;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    iput-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    const/4 v7, 0x3

    new-array v7, v7, [Lcom/stripe/android/view/StripeEditText;

    aput-object v2, v7, v6

    aput-object v4, v7, v5

    const/4 v4, 0x2

    aput-object v3, v7, v4

    invoke-static {v7}, Lkotlin/collections/SetsKt;->mutableSetOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    invoke-static {v3, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->allFields:Ljava/util/Set;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardInputWidget;->initView(Landroid/util/AttributeSet;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidget;->createHiddenCardText$payments_core_release(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$29(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static final synthetic access$getCardInputListener$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardInputListener;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-object p0
.end method

.method public static final synthetic access$getCardValidCallback$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardValidCallback;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    return-object p0
.end method

.method public static final synthetic access$getCardValidTextWatcher$p(Lcom/stripe/android/view/CardInputWidget;)Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    return-object p0
.end method

.method public static final synthetic access$getContainerLayout$p(Lcom/stripe/android/view/CardInputWidget;)Landroid/widget/FrameLayout;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    return-object p0
.end method

.method public static final synthetic access$getInvalidFields(Lcom/stripe/android/view/CardInputWidget;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getInvalidFields()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$scrollEnd(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    return-void
.end method

.method public static final synthetic access$setHiddenCardText$p(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$setShouldShowErrorIcon(Lcom/stripe/android/view/CardInputWidget;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->setShouldShowErrorIcon(Z)V

    return-void
.end method

.method public static final synthetic access$updateCvc(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->updateCvc()V

    return-void
.end method

.method public static final synthetic access$updatePostalRequired(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->updatePostalRequired()V

    return-void
.end method

.method private final applyCardElementAttributes(Landroid/util/AttributeSet;)V
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

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setPostalCodeEnabled(Z)V

    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldRequirePostalCode:I

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeRequired()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setPostalCodeRequired(Z)V

    sget v0, Lcom/stripe/android/R$styleable;->CardElement_shouldRequireUsZipCode:I

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getUsZipCodeRequired()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setUsZipCodeRequired(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic b(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$27(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic c(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$26(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic d(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/CardInputWidget;->initView$lambda$28(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V

    return-void
.end method

.method private final getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 14

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeValue()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v13, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    new-instance v9, Lcom/stripe/android/model/Address;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x2f

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    move-object v6, v13

    move-object v7, v9

    move-object v9, v0

    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    return-object v13
.end method

.method public static synthetic getCurrentFields$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getCvc()Lcom/stripe/android/cards/Cvc$Validated;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CvcEditText;->getCvc$payments_core_release()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v0

    return-object v0
.end method

.method private final getCvcPlaceHolder()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const-string v0, "2345"

    goto :goto_0

    :cond_0
    const-string v0, "CVC"

    :goto_0
    return-object v0
.end method

.method private final getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    const-string v1, "editText.paint"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1, p2}, Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;->calculate(Ljava/lang/String;Landroid/text/TextPaint;)I

    move-result p1

    return p1
.end method

.method private final getFocusField(II)Lcom/stripe/android/view/CardInputWidget$Field;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v2

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getFocusField$payments_core_release(IIZZ)Lcom/stripe/android/view/CardInputWidget$Field;

    move-result-object p1

    return-object p1
.end method

.method private final getFrameStart()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    :goto_1
    return v0
.end method

.method private final getFrameWidth()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private final getInvalidFields()Ljava/util/Set;
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

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

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

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

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

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getCvc()Lcom/stripe/android/cards/Cvc$Validated;

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

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->isPostalRequired()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

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

.method private final getPeekCardText()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_2

    const/16 v1, 0xf

    if-eq v0, v1, :cond_1

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const-string v1, "0"

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getPostalCodeValue()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static synthetic getRequiredFields$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShouldShowErrorIcon$payments_core_release$annotations()V
    .locals 0

    return-void
.end method

.method private final initView(Landroid/util/AttributeSet;)V
    .locals 5

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardInputWidget;->applyCardElementAttributes(Landroid/util/AttributeSet;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$1;

    invoke-direct {v1}, Lcom/stripe/android/view/CardInputWidget$initView$1;-><init>()V

    invoke-static {v0, v1}, Lbq6;->v0(Landroid/view/View;LM1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getDefaultErrorColorInt()I

    move-result v1

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v3}, Landroid/widget/TextView;->getHintTextColors()Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/view/CardBrandView;->setTintColorInt$payments_core_release(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/stripe/android/R$styleable;->CardInputView:[I

    const-string v4, "CardInputView"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v3, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v2, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    sget v3, Lcom/stripe/android/R$styleable;->CardInputView_cardTint:I

    invoke-virtual {v2}, Lcom/stripe/android/view/CardBrandView;->getTintColorInt$payments_core_release()I

    move-result v4

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/view/CardBrandView;->setTintColorInt$payments_core_release(I)V

    sget v2, Lcom/stripe/android/R$styleable;->CardInputView_cardTextErrorColor:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    sget v2, Lcom/stripe/android/R$styleable;->CardInputView_cardHintText:I

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/stripe/android/R$styleable;->CardInputView_android_focusedByDefault:I

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v2, v1}, Lcom/stripe/android/view/StripeEditText;->setErrorColor(I)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, LIf0;

    invoke-direct {v1, p0}, LIf0;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, LJf0;

    invoke-direct {v1, p0}, LJf0;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, LKf0;

    invoke-direct {v1, p0}, LKf0;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/BackUpFieldDeleteListener;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-direct {v1, v2}, Lcom/stripe/android/view/BackUpFieldDeleteListener;-><init>(Lcom/stripe/android/view/StripeEditText;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setDeleteEmptyListener(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object p1

    new-instance v1, LLf0;

    invoke-direct {v1, p0}, LLf0;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$9;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$9;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$10;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$10;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/StripeEditText;->setAfterTextChangedListener(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$11;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$11;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$12;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$12;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setBrandChangeCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$13;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$13;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/ExpiryDateEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    new-instance v1, Lcom/stripe/android/view/CardInputWidget$initView$14;

    invoke-direct {v1, p0}, Lcom/stripe/android/view/CardInputWidget$initView$14;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CvcEditText;->setCompletionCallback$payments_core_release(Lkotlin/jvm/functions/Function0;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->allFields:Ljava/util/Set;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    new-instance v2, Lcom/stripe/android/view/CardInputWidget$initView$lambda$31$$inlined$doAfterTextChanged$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/view/CardInputWidget$initView$lambda$31$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    new-instance v0, Lcom/stripe/android/view/CardInputWidget$initView$16;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/CardInputWidget$initView$16;-><init>(Lcom/stripe/android/view/CardInputWidget;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/CardNumberEditText;->setLoadingCallback$payments_core_release(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final initView$lambda$26(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollStart()V

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->CardNumber:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$27(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->ExpiryDate:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$28(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->PostalCode:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$29(Lcom/stripe/android/view/CardInputWidget;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardBrandView;->setShouldShowCvc(Z)V

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->scrollEnd()V

    iget-object p0, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    if-eqz p0, :cond_0

    sget-object p1, Lcom/stripe/android/view/CardInputListener$FocusField;->Cvc:Lcom/stripe/android/view/CardInputListener$FocusField;

    invoke-interface {p0, p1}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Lcom/stripe/android/view/CardInputListener$FocusField;)V

    :cond_0
    return-void
.end method

.method private final isPostalRequired()Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeRequired()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getUsZipCodeRequired()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final scrollEnd()V
    .locals 10

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    new-instance v2, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getHiddenCardWidth$payments_core_release()I

    move-result v4

    iget-object v5, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {v2, v3, v4, v5}, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;-><init>(Landroid/view/View;ILandroid/view/View;)V

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v3

    new-instance v5, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;

    iget-object v6, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v5, v6, v0, v3}, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;-><init>(Landroid/view/View;II)V

    iget-object v6, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v6, v4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result v6

    sub-int/2addr v0, v3

    add-int/2addr v0, v6

    new-instance v3, Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;

    iget-object v7, p0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v8, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v8}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result v8

    invoke-direct {v3, v7, v0, v6, v8}, Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;-><init>(Landroid/view/View;III)V

    iget-object v7, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v7, v4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result v7

    sub-int/2addr v0, v6

    add-int/2addr v0, v7

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v6

    if-eqz v6, :cond_1

    new-instance v6, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;

    iget-object v8, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v9, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v9}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result v9

    invoke-direct {v6, v8, v0, v7, v9}, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;-><init>(Landroid/view/View;III)V

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;

    aput-object v2, v0, v4

    aput-object v5, v0, v1

    const/4 v1, 0x2

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v6, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->startSlideAnimation(Ljava/util/List;)V

    iput-boolean v4, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    :cond_2
    :goto_1
    return-void
.end method

.method private final scrollStart()V
    .locals 10

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v2, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result v2

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v3, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    new-instance v4, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;

    iget-object v5, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v4, v5}, Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;-><init>(Landroid/view/View;)V

    iget-object v5, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v5

    new-instance v7, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;

    iget-object v8, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-direct {v7, v8, v0, v5}, Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;-><init>(Landroid/view/View;II)V

    sub-int/2addr v5, v0

    add-int/2addr v5, v2

    new-instance v0, Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;

    iget-object v8, p0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v9, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v9}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result v9

    invoke-direct {v0, v8, v2, v5, v9}, Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;-><init>(Landroid/view/View;III)V

    sub-int/2addr v5, v2

    add-int/2addr v5, v3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;

    iget-object v8, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v9, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v9}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result v9

    invoke-direct {v2, v8, v3, v5, v9}, Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;-><init>(Landroid/view/View;III)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    new-array v3, v3, [Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;

    aput-object v4, v3, v1

    aput-object v7, v3, v6

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const/4 v0, 0x3

    aput-object v2, v3, v0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->startSlideAnimation(Ljava/util/List;)V

    iput-boolean v6, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    :cond_2
    :goto_1
    return-void
.end method

.method private final setShouldShowErrorIcon(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setShouldShowErrorIcon(Z)V

    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->shouldShowErrorIcon:Z

    return-void
.end method

.method private final startSlideAnimation(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/view/animation/Animation;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->containerLayout:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private final updateCvc()V
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardBrandView;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->customCvcLabel:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/view/CvcEditText;->updateBrand$payments_core_release$default(Lcom/stripe/android/view/CvcEditText;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;ILjava/lang/Object;)V

    return-void
.end method

.method private final updateFieldLayout(Landroid/view/View;II)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    invoke-virtual {v0, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final updatePostalRequired()V
    .locals 2

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->isPostalRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public static synthetic updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameStart()I

    move-result p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release(ZII)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_2
    :goto_0
    if-nez v2, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final createHiddenCardText$payments_core_release(I)Ljava/lang/String;
    .locals 8

    new-instance v0, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    const-string v1, "0"

    invoke-static {v1, p1}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getFormatted(I)Ljava/lang/String;

    move-result-object p1

    const/16 v3, 0x20

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->lastIndexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getCardBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    return-object v0
.end method

.method public final getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardBrandView:Lcom/stripe/android/view/CardBrandView;

    return-object v0
.end method

.method public final getCardNumberEditText$payments_core_release()Lcom/stripe/android/view/CardNumberEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    return-object v0
.end method

.method public getCardParams()Lcom/stripe/android/model/CardParams;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getValidatedCardNumber$payments_core_release()Lcom/stripe/android/cards/CardNumber$Validated;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->getValidatedDate()Lcom/stripe/android/model/ExpirationDate$Validated;

    move-result-object v2

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/view/CardInputWidget;->getCvc()Lcom/stripe/android/cards/Cvc$Validated;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v1, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    if-nez v2, :cond_1

    move v7, v5

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    if-nez v3, :cond_2

    move v7, v5

    goto :goto_2

    :cond_2
    move v7, v6

    :goto_2
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    iget-object v4, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeRequired()Z

    move-result v7

    if-nez v7, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardInputWidget;->getUsZipCodeRequired()Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_3
    iget-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/PostalCodeEditText;->getPostalCode$payments_core_release()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    move v7, v6

    goto :goto_4

    :cond_5
    :goto_3
    move v7, v5

    :goto_4
    if-eqz v7, :cond_6

    move v7, v5

    goto :goto_5

    :cond_6
    move v7, v6

    :goto_5
    invoke-virtual {v4, v7}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v9}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/StripeEditText;->getErrorMessage$payments_core_release()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v7, v8}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    if-nez v1, :cond_b

    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    goto :goto_8

    :cond_b
    if-nez v2, :cond_c

    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    goto :goto_8

    :cond_c
    if-nez v3, :cond_d

    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    goto :goto_8

    :cond_d
    iget-object v7, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v7}, Lcom/stripe/android/view/StripeEditText;->getShouldShowError()Z

    move-result v7

    if-eqz v7, :cond_e

    iget-object v1, v0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    :goto_8
    invoke-direct {v0, v5}, Lcom/stripe/android/view/CardInputWidget;->setShouldShowErrorIcon(Z)V

    return-object v4

    :cond_e
    invoke-direct {v0, v6}, Lcom/stripe/android/view/CardInputWidget;->setShouldShowErrorIcon(Z)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/view/CardInputWidget;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v7

    const-string v8, "CardInputView"

    invoke-static {v8}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-virtual {v1}, Lcom/stripe/android/cards/CardNumber$Validated;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/stripe/android/model/ExpirationDate$Validated;->getMonth()I

    move-result v10

    invoke-virtual {v2}, Lcom/stripe/android/model/ExpirationDate$Validated;->getYear()I

    move-result v11

    invoke-virtual {v3}, Lcom/stripe/android/cards/Cvc$Validated;->getValue$payments_core_release()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    new-instance v1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeValue()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_9

    :cond_f
    move v5, v6

    :cond_10
    :goto_9
    if-nez v5, :cond_11

    move-object v4, v2

    :cond_11
    invoke-virtual {v1, v4}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

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
.end method

.method public final synthetic getCurrentFields$payments_core_release()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getCvcEditText$payments_core_release()Lcom/stripe/android/view/CvcEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    return-object v0
.end method

.method public final getExpiryDateEditText$payments_core_release()Lcom/stripe/android/view/ExpiryDateEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    return-object v0
.end method

.method public final getFrameWidthSupplier$payments_core_release()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getLayoutWidthCalculator$payments_core_release()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    return-object v0
.end method

.method public getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;
    .locals 11

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCardParams()Lcom/stripe/android/model/CardParams;

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

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPaymentMethodCard()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

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

.method public final getPlacement$payments_core_release()Lcom/stripe/android/view/CardInputWidgetPlacement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    return-object v0
.end method

.method public final getPostalCodeEditText$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    return-object v0
.end method

.method public final getPostalCodeEnabled()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getPostalCodeRequired()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getPostalCodeTextInputLayout$payments_core_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getRequiredFields$payments_core_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/view/StripeEditText;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    return-object v0
.end method

.method public final getShouldShowErrorIcon$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->shouldShowErrorIcon:Z

    return v0
.end method

.method public final getUsZipCodeRequired()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isEnabled()Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2
.end method

.method public final isShowingFullCard$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return v0
.end method

.method public onFinishInflate()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    sget-object v1, Lcom/stripe/android/view/PostalCodeEditText$Config;->Global:Lcom/stripe/android/view/PostalCodeEditText$Config;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PostalCodeEditText;->setConfig$payments_core_release(Lcom/stripe/android/view/PostalCodeEditText$Config;)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameStart()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/view/CardInputWidget;->getFocusField(II)Lcom/stripe/android/view/CardInputWidget$Field;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object p1, Lcom/stripe/android/view/CardInputWidget$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    goto :goto_1

    :cond_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_1
    return v0
.end method

.method public onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    iget-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->isViewInitialized:Z

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setTotalLengthInPixels$payments_core_release(I)V

    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardWidth$payments_core_release()I

    move-result p2

    iget-boolean p3, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p3}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getHiddenCardWidth$payments_core_release()I

    move-result p3

    mul-int/lit8 p3, p3, -0x1

    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateWidth$payments_core_release()I

    move-result p2

    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean p4, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result p3

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result p2

    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean p4, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result p3

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object p2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result p2

    iget-object p3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-boolean p4, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result p3

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    :cond_1
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "state_postal_code_enabled"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardInputWidget;->setPostalCodeEnabled(Z)V

    const-string v0, "state_card_viewed"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/view/CardInputWidget;->updateSpaceSizes$payments_core_release$default(Lcom/stripe/android/view/CardInputWidget;ZIIILjava/lang/Object;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getFrameWidth()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setTotalLengthInPixels$payments_core_release(I)V

    iget-boolean v0, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v0

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v3, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result v3

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v4, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result v1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getHiddenCardWidth$payments_core_release()I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateStartMargin$payments_core_release(Z)I

    move-result v1

    iget-object v3, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v3, v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcStartMargin$payments_core_release(Z)I

    move-result v3

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v4, v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeStartMargin$payments_core_release(Z)I

    move-result v2

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getTotalLengthInPixels$payments_core_release()I

    move-result v2

    :goto_0
    move v8, v2

    move v2, v0

    move v0, v1

    move v1, v8

    :goto_1
    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v5, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v5}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCardWidth$payments_core_release()I

    move-result v5

    invoke-direct {p0, v4, v5, v2}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v4, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v4}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getDateWidth$payments_core_release()I

    move-result v4

    invoke-direct {p0, v2, v4, v0}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcNumberTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getCvcWidth$payments_core_release()I

    move-result v2

    invoke-direct {p0, v0, v2, v3}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeTextInputLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {v2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->getPostalCodeWidth$payments_core_release()I

    move-result v2

    invoke-direct {p0, v0, v2, v1}, Lcom/stripe/android/view/CardInputWidget;->updateFieldLayout(Landroid/view/View;II)V

    const-string v0, "state_super_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_2

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_2
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "state_super_state"

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "state_card_viewed"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "state_postal_code_enabled"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public setCardHint(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cardHint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setCardInputListener(Lcom/stripe/android/view/CardInputListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardInputListener:Lcom/stripe/android/view/CardInputListener;

    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->isCardNumberValid()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return-void
.end method

.method public setCardNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setCardValidCallback(Lcom/stripe/android/view/CardValidCallback;)V
    .locals 3

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/StripeEditText;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    invoke-virtual {v1, v2}, Lcom/stripe/android/view/StripeEditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->requiredFields:Ljava/util/Set;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidTextWatcher:Lcom/stripe/android/view/CardInputWidget$cardValidTextWatcher$1;

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->cardValidCallback:Lcom/stripe/android/view/CardValidCallback;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getInvalidFields()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getInvalidFields()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/stripe/android/view/CardValidCallback;->onInputChanged(ZLjava/util/Set;)V

    :cond_2
    return-void
.end method

.method public setCvcCode(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCvcLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->customCvcLabel:Ljava/lang/String;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->updateCvc()V

    return-void
.end method

.method public setCvcNumberTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getCurrentFields$payments_core_release()Ljava/util/List;

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

    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setExpiryDate(II)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    new-instance v1, Lcom/stripe/android/model/ExpirationDate$Unvalidated;

    invoke-direct {v1, p1, p2}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;-><init>(II)V

    invoke-virtual {v1}, Lcom/stripe/android/model/ExpirationDate$Unvalidated;->getDisplayString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setExpiryDateTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setFrameWidthSupplier$payments_core_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->frameWidthSupplier:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setLayoutWidthCalculator$payments_core_release(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget;->layoutWidthCalculator:Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;

    return-void
.end method

.method public final synthetic setPostalCode$payments_core_release(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setPostalCodeEnabled(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEnabled$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setPostalCodeRequired(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public setPostalCodeTextWatcher(Landroid/text/TextWatcher;)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/StripeEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public final setShowingFullCard$payments_core_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/CardInputWidget;->isShowingFullCard:Z

    return-void
.end method

.method public final setUsZipCodeRequired(Z)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->usZipCodeRequired$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/view/CardInputWidget;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final updateSpaceSizes$payments_core_release(ZII)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const-string v1, "4242 4242 4242 4242 424"

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setCardWidth$payments_core_release(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const-string v1, "MM/MM"

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->expiryDateEditText:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setDateWidth$payments_core_release(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    iget-object v1, p0, Lcom/stripe/android/view/CardInputWidget;->hiddenCardText:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setHiddenCardWidth$payments_core_release(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getCvcPlaceHolder()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cvcEditText:Lcom/stripe/android/view/CvcEditText;

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setCvcWidth$payments_core_release(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    const-string v1, "1234567890"

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->postalCodeEditText:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setPostalCodeWidth$payments_core_release(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-direct {p0}, Lcom/stripe/android/view/CardInputWidget;->getPeekCardText()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/view/CardInputWidget;->cardNumberEditText:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0, v1, v2}, Lcom/stripe/android/view/CardInputWidget;->getDesiredWidthInPixels(Ljava/lang/String;Lcom/stripe/android/view/StripeEditText;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/CardInputWidgetPlacement;->setPeekCardWidth$payments_core_release(I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget;->placement:Lcom/stripe/android/view/CardInputWidgetPlacement;

    invoke-virtual {p0}, Lcom/stripe/android/view/CardInputWidget;->getPostalCodeEnabled()Z

    move-result v1

    invoke-virtual {v0, p1, v1, p3, p2}, Lcom/stripe/android/view/CardInputWidgetPlacement;->updateSpacing$payments_core_release(ZZII)V

    return-void
.end method
