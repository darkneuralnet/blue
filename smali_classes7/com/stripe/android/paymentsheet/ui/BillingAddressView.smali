.class public final Lcom/stripe/android/paymentsheet/ui/BillingAddressView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;,
        Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;,
        Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;,
        Lcom/stripe/android/paymentsheet/ui/BillingAddressView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001:\u0006\u008e\u0001\u008f\u0001\u0090\u0001B/\u0008\u0007\u0012\u0008\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\u000c\u0008\u0002\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\n\u0008\u0002\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\n\u001a\u00020\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0008\u0010\u000c\u001a\u00020\tH\u0002J\u0008\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\tJ\u0019\u0010\u0016\u001a\u00020\t2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R1\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178@@@X\u0081\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR(\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\"8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u00103\u001a\u0004\u00084\u00105R \u00107\u001a\u0002068\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u00087\u00108\u0012\u0004\u0008;\u0010 \u001a\u0004\u00089\u0010:R \u0010=\u001a\u00020<8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u0012\u0004\u0008A\u0010 \u001a\u0004\u0008?\u0010@R \u0010C\u001a\u00020B8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u0012\u0004\u0008G\u0010 \u001a\u0004\u0008E\u0010FR \u0010I\u001a\u00020H8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008I\u0010J\u0012\u0004\u0008M\u0010 \u001a\u0004\u0008K\u0010LR \u0010O\u001a\u00020N8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008O\u0010P\u0012\u0004\u0008S\u0010 \u001a\u0004\u0008Q\u0010RR \u0010U\u001a\u00020T8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008U\u0010V\u0012\u0004\u0008Y\u0010 \u001a\u0004\u0008W\u0010XR \u0010Z\u001a\u00020T8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008Z\u0010V\u0012\u0004\u0008\\\u0010 \u001a\u0004\u0008[\u0010XR \u0010]\u001a\u00020N8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008]\u0010P\u0012\u0004\u0008_\u0010 \u001a\u0004\u0008^\u0010RR \u0010`\u001a\u00020T8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008`\u0010V\u0012\u0004\u0008b\u0010 \u001a\u0004\u0008a\u0010XR \u0010c\u001a\u00020T8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008c\u0010V\u0012\u0004\u0008e\u0010 \u001a\u0004\u0008d\u0010XR \u0010f\u001a\u00020N8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008f\u0010P\u0012\u0004\u0008h\u0010 \u001a\u0004\u0008g\u0010RR*\u0010j\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008j\u0010k\u0012\u0004\u0008p\u0010 \u001a\u0004\u0008l\u0010m\"\u0004\u0008n\u0010oR+\u0010w\u001a\u00020q2\u0006\u0010\u0018\u001a\u00020q8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008r\u0010\u001a\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR \u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u001a\u0010}\u001a\u0008\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001c\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u007f0{8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010~R\u0017\u0010\u0081\u0001\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006*\u00020\u007f8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u00a8\u0006\u0091\u0001"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/stripe/android/model/Address;",
        "createAddress",
        "Lcom/stripe/android/core/model/CountryCode;",
        "countryCode",
        "",
        "postalCode",
        "createRequiredAddress",
        "",
        "updateStateView",
        "updatePostalCodeView",
        "configureForLevel",
        "Ljava/util/Locale;",
        "getLocale",
        "",
        "enabled",
        "setEnabled",
        "focusFirstField",
        "address",
        "populate$paymentsheet_release",
        "(Lcom/stripe/android/model/Address;)V",
        "populate",
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;",
        "<set-?>",
        "level$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "getLevel$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;",
        "setLevel$paymentsheet_release",
        "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;)V",
        "getLevel$paymentsheet_release$annotations",
        "()V",
        "level",
        "Lkotlin/Function0;",
        "onFocus",
        "Lkotlin/jvm/functions/Function0;",
        "getOnFocus$paymentsheet_release",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnFocus$paymentsheet_release",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;",
        "viewBinding",
        "Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;",
        "Lcom/stripe/android/view/PostalCodeValidator;",
        "postalCodeValidator",
        "Lcom/stripe/android/view/PostalCodeValidator;",
        "LuX2;",
        "_address",
        "LuX2;",
        "Landroidx/lifecycle/LiveData;",
        "Landroidx/lifecycle/LiveData;",
        "getAddress$paymentsheet_release",
        "()Landroidx/lifecycle/LiveData;",
        "Lcom/stripe/android/view/CountryTextInputLayout;",
        "countryLayout",
        "Lcom/stripe/android/view/CountryTextInputLayout;",
        "getCountryLayout$paymentsheet_release",
        "()Lcom/stripe/android/view/CountryTextInputLayout;",
        "getCountryLayout$paymentsheet_release$annotations",
        "Landroid/widget/AutoCompleteTextView;",
        "countryView",
        "Landroid/widget/AutoCompleteTextView;",
        "getCountryView$paymentsheet_release",
        "()Landroid/widget/AutoCompleteTextView;",
        "getCountryView$paymentsheet_release$annotations",
        "Landroid/widget/LinearLayout;",
        "cityPostalContainer",
        "Landroid/widget/LinearLayout;",
        "getCityPostalContainer$paymentsheet_release",
        "()Landroid/widget/LinearLayout;",
        "getCityPostalContainer$paymentsheet_release$annotations",
        "Lcom/stripe/android/view/StripeEditText;",
        "postalCodeView",
        "Lcom/stripe/android/view/StripeEditText;",
        "getPostalCodeView$paymentsheet_release",
        "()Lcom/stripe/android/view/StripeEditText;",
        "getPostalCodeView$paymentsheet_release$annotations",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "postalCodeLayout",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "getPostalCodeLayout$paymentsheet_release",
        "()Lcom/google/android/material/textfield/TextInputLayout;",
        "getPostalCodeLayout$paymentsheet_release$annotations",
        "Lcom/google/android/material/textfield/TextInputEditText;",
        "address1View",
        "Lcom/google/android/material/textfield/TextInputEditText;",
        "getAddress1View$paymentsheet_release",
        "()Lcom/google/android/material/textfield/TextInputEditText;",
        "getAddress1View$paymentsheet_release$annotations",
        "address2View",
        "getAddress2View$paymentsheet_release",
        "getAddress2View$paymentsheet_release$annotations",
        "cityLayout",
        "getCityLayout$paymentsheet_release",
        "getCityLayout$paymentsheet_release$annotations",
        "cityView",
        "getCityView$paymentsheet_release",
        "getCityView$paymentsheet_release$annotations",
        "stateView",
        "getStateView$paymentsheet_release",
        "getStateView$paymentsheet_release$annotations",
        "stateLayout",
        "getStateLayout$paymentsheet_release",
        "getStateLayout$paymentsheet_release$annotations",
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;",
        "postalCodeViewListener",
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;",
        "getPostalCodeViewListener$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;",
        "setPostalCodeViewListener$paymentsheet_release",
        "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;)V",
        "getPostalCodeViewListener$paymentsheet_release$annotations",
        "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;",
        "postalCodeConfig$delegate",
        "getPostalCodeConfig",
        "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;",
        "setPostalCodeConfig",
        "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;)V",
        "postalCodeConfig",
        "Lkotlin/Function1;",
        "newCountryCodeCallback",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "Landroid/view/View;",
        "requiredViews",
        "Ljava/util/Set;",
        "Landroid/widget/EditText;",
        "allFields",
        "isUnitedStates",
        "()Z",
        "getValue",
        "(Landroid/widget/EditText;)Ljava/lang/String;",
        "value",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "BillingAddressCollectionLevel",
        "PostalCodeConfig",
        "PostalCodeViewListener",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBillingAddressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingAddressView.kt\ncom/stripe/android/paymentsheet/ui/BillingAddressView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n33#2,3:428\n33#2,3:431\n1855#3:434\n1856#3:461\n1855#3,2:468\n1855#3:470\n1856#3:473\n1855#3:474\n1856#3:477\n58#4,23:435\n93#4,3:458\n262#5,2:462\n262#5,2:464\n262#5,2:466\n262#5,2:471\n262#5,2:475\n260#5:479\n1#6:478\n*S KotlinDebug\n*F\n+ 1 BillingAddressView.kt\ncom/stripe/android/paymentsheet/ui/BillingAddressView\n*L\n47#1:428,3\n105#1:431,3\n173#1:434\n173#1:461\n333#1:468,2\n341#1:470\n341#1:473\n344#1:474\n344#1:477\n174#1:435,23\n174#1:458,3\n301#1:462,2\n305#1:464,2\n306#1:466,2\n341#1:471,2\n344#1:475,2\n381#1:479\n*E\n"
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


# instance fields
.field private final _address:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lcom/stripe/android/model/Address;",
            ">;"
        }
    .end annotation
.end field

.field private final address:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/model/Address;",
            ">;"
        }
    .end annotation
.end field

.field private final address1View:Lcom/google/android/material/textfield/TextInputEditText;

.field private final address2View:Lcom/google/android/material/textfield/TextInputEditText;

.field private final allFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/widget/EditText;",
            ">;"
        }
    .end annotation
.end field

.field private final cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final cityPostalContainer:Landroid/widget/LinearLayout;

.field private final cityView:Lcom/google/android/material/textfield/TextInputEditText;

.field private final countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

.field private final countryView:Landroid/widget/AutoCompleteTextView;

.field private final level$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final newCountryCodeCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/core/model/CountryCode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private onFocus:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final postalCodeConfig$delegate:Lkotlin/properties/ReadWriteProperty;

.field private final postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

.field private final postalCodeView:Lcom/stripe/android/view/StripeEditText;

.field private postalCodeViewListener:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;

.field private final requiredViews:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final stateView:Lcom/google/android/material/textfield/TextInputEditText;

.field private final viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "level"

    const-string v3, "getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;"

    const-class v4, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;

    const/4 v5, 0x0

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-string v2, "postalCodeConfig"

    const-string v3, "getPostalCodeConfig()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;"

    invoke-direct {v1, v4, v2, v3, v5}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 18
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object v1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;->Automatic:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$special$$inlined$observable$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$special$$inlined$observable$1;-><init>(Ljava/lang/Object;Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->level$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$onFocus$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$onFocus$1;

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->onFocus:Lkotlin/jvm/functions/Function0;

    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    move-result-object v1

    const-string v2, "inflate(\n        LayoutI\u2026text),\n        this\n    )"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    new-instance v2, Lcom/stripe/android/view/PostalCodeValidator;

    invoke-direct {v2}, Lcom/stripe/android/view/PostalCodeValidator;-><init>()V

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    new-instance v2, LuX2;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, LuX2;-><init>(Ljava/lang/Object;)V

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->_address:LuX2;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address:Landroidx/lifecycle/LiveData;

    iget-object v2, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    const-string v3, "viewBinding.countryLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v2}, Lcom/stripe/android/view/CountryTextInputLayout;->getCountryAutocomplete()Landroid/widget/AutoCompleteTextView;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryView:Landroid/widget/AutoCompleteTextView;

    iget-object v4, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityPostalContainer:Landroid/widget/LinearLayout;

    const-string v5, "viewBinding.cityPostalContainer"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityPostalContainer:Landroid/widget/LinearLayout;

    iget-object v4, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->postalCode:Lcom/stripe/android/view/StripeEditText;

    const-string v5, "viewBinding.postalCode"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    iget-object v5, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v6, "viewBinding.postalCodeLayout"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v5, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v6, "viewBinding.address1"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address1View:Lcom/google/android/material/textfield/TextInputEditText;

    iget-object v6, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v7, "viewBinding.address2"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address2View:Lcom/google/android/material/textfield/TextInputEditText;

    iget-object v7, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v8, "viewBinding.cityLayout"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v7, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->city:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v8, "viewBinding.city"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityView:Lcom/google/android/material/textfield/TextInputEditText;

    iget-object v8, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->state:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v9, "viewBinding.state"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateView:Lcom/google/android/material/textfield/TextInputEditText;

    iget-object v9, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v10, "viewBinding.stateLayout"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

    sget-object v10, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;

    new-instance v11, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$special$$inlined$observable$2;

    invoke-direct {v11, v10, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$special$$inlined$observable$2;-><init>(Ljava/lang/Object;Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V

    iput-object v11, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeConfig$delegate:Lkotlin/properties/ReadWriteProperty;

    new-instance v10, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;

    invoke-direct {v10, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$newCountryCodeCallback$1;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V

    iput-object v10, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->newCountryCodeCallback:Lkotlin/jvm/functions/Function1;

    const/16 v11, 0xb

    new-array v11, v11, [Landroid/view/View;

    iget-object v12, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1Divider:Landroid/view/View;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    iget-object v12, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1Layout:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v14, 0x1

    aput-object v12, v11, v14

    const/4 v12, 0x2

    aput-object v5, v11, v12

    iget-object v15, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2Divider:Landroid/view/View;

    const/16 v16, 0x3

    aput-object v15, v11, v16

    iget-object v15, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2Layout:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 v17, 0x4

    aput-object v15, v11, v17

    const/4 v15, 0x5

    aput-object v6, v11, v15

    iget-object v15, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v12, 0x6

    aput-object v15, v11, v12

    const/4 v15, 0x7

    aput-object v7, v11, v15

    const/16 v15, 0x8

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->stateDivider:Landroid/view/View;

    aput-object v1, v11, v15

    const/16 v1, 0x9

    aput-object v9, v11, v1

    const/16 v1, 0xa

    aput-object v8, v11, v1

    invoke-static {v11}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->requiredViews:Ljava/util/Set;

    new-array v1, v12, [Landroid/widget/EditText;

    aput-object v5, v1, v13

    aput-object v6, v1, v14

    const/4 v5, 0x2

    aput-object v7, v1, v5

    aput-object v8, v1, v16

    aput-object v4, v1, v17

    const/4 v4, 0x5

    aput-object v3, v1, v4

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->allFields:Ljava/util/Set;

    invoke-virtual {v2, v10}, Lcom/stripe/android/view/CountryTextInputLayout;->setCountryCodeChangeCallback(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v10, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->configureForLevel()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    new-instance v3, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$_init_$lambda$5$$inlined$doAfterTextChanged$1;

    invoke-direct {v3, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$_init_$lambda$5$$inlined$doAfterTextChanged$1;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v3, LLG;

    invoke-direct {v3, v0}, LLG;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v1}, Lcom/stripe/android/view/StripeEditText;->getInternalFocusChangeListeners()Ljava/util/List;

    move-result-object v1

    new-instance v2, LMG;

    invoke-direct {v2, v0}, LMG;-><init>(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private static final _init_$lambda$9(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V
    .locals 5

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/stripe/android/view/PostalCodeValidator;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    const/4 v2, 0x1

    if-nez p2, :cond_4

    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v0

    goto :goto_2

    :cond_3
    :goto_1
    move v3, v2

    :goto_2
    if-nez v3, :cond_4

    if-nez p1, :cond_4

    move v3, v2

    goto :goto_3

    :cond_4
    move v3, v0

    :goto_3
    invoke-virtual {v1, v3}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    const/4 v1, 0x0

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeViewListener:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;

    if-eqz p2, :cond_c

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v1, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-virtual {v1, v0, p0}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object v1

    :cond_5
    invoke-interface {p2, v1, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;->onGainingFocus(Lcom/stripe/android/core/model/Country;Z)V

    goto :goto_6

    :cond_6
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeViewListener:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;

    if-eqz p2, :cond_8

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v3}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v3

    if-eqz v3, :cond_7

    sget-object v1, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLocale()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/stripe/android/core/model/CountryUtils;->getCountryByCode(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object v1

    :cond_7
    invoke-interface {p2, v1, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;->onLosingFocus(Lcom/stripe/android/core/model/Country;Z)V

    :cond_8
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_9

    goto :goto_4

    :cond_9
    move p0, v0

    goto :goto_5

    :cond_a
    :goto_4
    move p0, v2

    :goto_5
    if-nez p0, :cond_b

    if-nez p1, :cond_b

    move v0, v2

    :cond_b
    invoke-virtual {p2, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    :cond_c
    :goto_6
    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->_init_$lambda$9(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V

    return-void
.end method

.method public static final synthetic access$configureForLevel(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->configureForLevel()V

    return-void
.end method

.method public static final synthetic access$createAddress(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)Lcom/stripe/android/model/Address;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->createAddress()Lcom/stripe/android/model/Address;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLocale(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)Ljava/util/Locale;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLocale()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPostalCodeValidator$p(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)Lcom/stripe/android/view/PostalCodeValidator;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    return-object p0
.end method

.method public static final synthetic access$getValue(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/widget/EditText;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get_address$p(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;)LuX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->_address:LuX2;

    return-object p0
.end method

.method public static final synthetic access$updatePostalCodeView(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Lcom/stripe/android/core/model/CountryCode;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->updatePostalCodeView(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method public static final synthetic access$updateStateView(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Lcom/stripe/android/core/model/CountryCode;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->updateStateView(Lcom/stripe/android/core/model/CountryCode;)V

    return-void
.end method

.method public static synthetic b(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->lambda$5$lambda$4(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V

    return-void
.end method

.method private final configureForLevel()V
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const-string v2, "it"

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->requiredViews:Ljava/util/Set;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->requiredViews:Ljava/util/Set;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->_address:LuX2;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->createAddress()Lcom/stripe/android/model/Address;

    move-result-object v1

    invoke-virtual {v0, v1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final createAddress()Lcom/stripe/android/model/Address;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v0}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeValidator:Lcom/stripe/android/view/PostalCodeValidator;

    if-nez v2, :cond_0

    const-string v4, ""

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/stripe/android/view/PostalCodeValidator;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    invoke-direct {p0, v0, v2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->createRequiredAddress(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)Lcom/stripe/android/model/Address;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    new-instance v1, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v1}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lcom/stripe/android/model/Address$Builder;->setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v0

    :goto_1
    move-object v1, v0

    :cond_3
    return-object v1
.end method

.method private final createRequiredAddress(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)Lcom/stripe/android/model/Address;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address1View:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address2View:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityView:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-direct {p0, v2}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateView:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-direct {p0, v3}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getValue(Landroid/widget/EditText;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->isUnitedStates()Z

    move-result v5

    if-nez v5, :cond_0

    new-instance v3, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v3}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    invoke-virtual {v3, p1}, Lcom/stripe/android/model/Address$Builder;->setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/stripe/android/model/Address$Builder;->setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/stripe/android/model/Address$Builder;->setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v4

    goto :goto_0

    :cond_0
    if-eqz v3, :cond_1

    new-instance v4, Lcom/stripe/android/model/Address$Builder;

    invoke-direct {v4}, Lcom/stripe/android/model/Address$Builder;-><init>()V

    invoke-virtual {v4, p1}, Lcom/stripe/android/model/Address$Builder;->setCountryCode(Lcom/stripe/android/core/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/stripe/android/model/Address$Builder;->setPostalCode(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/Address$Builder;->setLine1(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/stripe/android/model/Address$Builder;->setLine2(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/stripe/android/model/Address$Builder;->setCity(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/stripe/android/model/Address$Builder;->setState(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/model/Address$Builder;->build()Lcom/stripe/android/model/Address;

    move-result-object v4

    :cond_1
    :goto_0
    return-object v4
.end method

.method public static synthetic getAddress1View$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getAddress2View$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCityLayout$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCityPostalContainer$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCityView$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCountryLayout$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCountryView$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLevel$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getLocale()Ljava/util/Locale;
    .locals 2

    invoke-static {}, Lvv2;->d()Lvv2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lvv2;->c(I)Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getPostalCodeConfig()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeConfig$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;

    return-object v0
.end method

.method public static synthetic getPostalCodeLayout$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPostalCodeView$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPostalCodeViewListener$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getStateLayout$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getStateView$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getValue(Landroid/widget/EditText;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v3

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v3

    :goto_2
    if-eqz p1, :cond_4

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    :cond_4
    :goto_3
    if-nez v1, :cond_5

    move-object v3, p1

    :cond_5
    return-object v3
.end method

.method private final isUnitedStates()Z
    .locals 2

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v1}, Lcom/stripe/android/view/CountryTextInputLayout;->getSelectedCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isUS(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result v0

    return v0
.end method

.method private static final lambda$5$lambda$4(Lcom/stripe/android/paymentsheet/ui/BillingAddressView;Landroid/view/View;Z)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->onFocus:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final setPostalCodeConfig(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeConfig$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method private final updatePostalCodeView(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    sget-object v2, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-virtual {v2, p1}, Lcom/stripe/android/core/model/CountryUtils;->doesCountryUsePostalCode(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v0

    :goto_1
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 v4, 0x8

    if-eqz v2, :cond_2

    move v5, v1

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    move-result-object v3

    sget-object v5, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;->Required:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    if-eq v3, v5, :cond_4

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    move v0, v1

    :cond_4
    :goto_3
    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    iget-object v2, v2, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityPostalDivider:Landroid/view/View;

    const-string v3, "viewBinding.cityPostalDivider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_5

    move v3, v1

    goto :goto_4

    :cond_5
    move v3, v4

    :goto_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    iget-object v2, v2, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityPostalContainer:Landroid/widget/LinearLayout;

    const-string v3, "viewBinding.cityPostalContainer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    move v1, v4

    :goto_5
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isUS(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;

    goto :goto_6

    :cond_7
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;

    :goto_6
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->setPostalCodeConfig(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isUS(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result p1

    if-eqz p1, :cond_8

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->acc_label_zip_short:I

    goto :goto_7

    :cond_8
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->address_label_postal_code:I

    :goto_7
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final updateStateView(Lcom/stripe/android/core/model/CountryCode;)V
    .locals 2

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isUS(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->address_label_state:I

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isCA(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->address_label_province:I

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Lcom/stripe/android/core/model/CountryCode$Companion;->isGB(Lcom/stripe/android/core/model/CountryCode;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->address_label_county:I

    goto :goto_0

    :cond_2
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->address_label_region_generic:I

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final focusFirstField()V
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1Layout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :goto_0
    return-void
.end method

.method public final getAddress$paymentsheet_release()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/model/Address;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getAddress1View$paymentsheet_release()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address1View:Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public final getAddress2View$paymentsheet_release()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address2View:Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public final getCityLayout$paymentsheet_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getCityPostalContainer$paymentsheet_release()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityPostalContainer:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getCityView$paymentsheet_release()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityView:Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public final getCountryLayout$paymentsheet_release()Lcom/stripe/android/view/CountryTextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    return-object v0
.end method

.method public final getCountryView$paymentsheet_release()Landroid/widget/AutoCompleteTextView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryView:Landroid/widget/AutoCompleteTextView;

    return-object v0
.end method

.method public final getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->level$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;

    return-object v0
.end method

.method public final getOnFocus$paymentsheet_release()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->onFocus:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getPostalCodeLayout$paymentsheet_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getPostalCodeView$paymentsheet_release()Lcom/stripe/android/view/StripeEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    return-object v0
.end method

.method public final getPostalCodeViewListener$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeViewListener:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;

    return-object v0
.end method

.method public final getStateLayout$paymentsheet_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getStateView$paymentsheet_release()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateView:Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public final populate$paymentsheet_release(Lcom/stripe/android/model/Address;)V
    .locals 4

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeView:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/CountryTextInputLayout;->setSelectedCountryCode(Lcom/stripe/android/core/model/CountryCode;)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryView:Landroid/widget/AutoCompleteTextView;

    sget-object v2, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->getLocale()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lcom/stripe/android/core/model/CountryUtils;->getDisplayCountry(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address1View:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->address2View:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getLine2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->cityView:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getCity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateView:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, Lcom/stripe/android/model/Address;->getState()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setEnabled(Z)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    aput-object v2, v0, v1

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->viewBinding:Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    iget-object v2, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1Layout:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    iget-object v3, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2Layout:Lcom/google/android/material/textfield/TextInputLayout;

    aput-object v3, v0, v2

    const/4 v2, 0x3

    iget-object v1, v1, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

    aput-object v1, v0, v2

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

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
    return-void
.end method

.method public final setLevel$paymentsheet_release(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->level$delegate:Lkotlin/properties/ReadWriteProperty;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnFocus$paymentsheet_release(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->onFocus:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setPostalCodeViewListener$paymentsheet_release(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/BillingAddressView;->postalCodeViewListener:Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;

    return-void
.end method
