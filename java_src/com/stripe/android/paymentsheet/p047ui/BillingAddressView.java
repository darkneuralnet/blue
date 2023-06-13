package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.databinding.StripeBillingAddressLayoutBinding;
import com.stripe.android.paymentsheet.p047ui.BillingAddressView;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.PostalCodeValidator;
import com.stripe.android.view.StripeEditText;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0006\u008e\u0001\u008f\u0001\u0090\u0001B/\b\u0007\u0012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\f\b\u0002\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001\u0012\n\b\u0002\u0010\u008b\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\tJ\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R1\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R \u00107\u001a\u0002068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010 \u001a\u0004\b9\u0010:R \u0010=\u001a\u00020<8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010 \u001a\u0004\b?\u0010@R \u0010C\u001a\u00020B8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010 \u001a\u0004\bE\u0010FR \u0010I\u001a\u00020H8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010 \u001a\u0004\bK\u0010LR \u0010O\u001a\u00020N8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010 \u001a\u0004\bQ\u0010RR \u0010U\u001a\u00020T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010 \u001a\u0004\bW\u0010XR \u0010Z\u001a\u00020T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bZ\u0010V\u0012\u0004\b\\\u0010 \u001a\u0004\b[\u0010XR \u0010]\u001a\u00020N8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010P\u0012\u0004\b_\u0010 \u001a\u0004\b^\u0010RR \u0010`\u001a\u00020T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010V\u0012\u0004\bb\u0010 \u001a\u0004\ba\u0010XR \u0010c\u001a\u00020T8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bc\u0010V\u0012\u0004\be\u0010 \u001a\u0004\bd\u0010XR \u0010f\u001a\u00020N8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010P\u0012\u0004\bh\u0010 \u001a\u0004\bg\u0010RR*\u0010j\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bj\u0010k\u0012\u0004\bp\u0010 \u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR+\u0010w\u001a\u00020q2\u0006\u0010\u0018\u001a\u00020q8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010\u001a\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR \u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0017\u0010\u0081\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006*\u00020\u007f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0091\u0001"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/model/Address;", "createAddress", "Lcom/stripe/android/core/model/CountryCode;", "countryCode", "", "postalCode", "createRequiredAddress", "", "updateStateView", "updatePostalCodeView", "configureForLevel", "Ljava/util/Locale;", "getLocale", "", "enabled", "setEnabled", "focusFirstField", PaymentMethod.BillingDetails.PARAM_ADDRESS, "populate$paymentsheet_release", "(Lcom/stripe/android/model/Address;)V", "populate", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "<set-?>", "level$delegate", "Lkotlin/properties/ReadWriteProperty;", "getLevel$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "setLevel$paymentsheet_release", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;)V", "getLevel$paymentsheet_release$annotations", "()V", "level", "Lkotlin/Function0;", "onFocus", "Lkotlin/jvm/functions/Function0;", "getOnFocus$paymentsheet_release", "()Lkotlin/jvm/functions/Function0;", "setOnFocus$paymentsheet_release", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "LuX2;", "_address", "LuX2;", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getAddress$paymentsheet_release", "()Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryLayout", "Lcom/stripe/android/view/CountryTextInputLayout;", "getCountryLayout$paymentsheet_release", "()Lcom/stripe/android/view/CountryTextInputLayout;", "getCountryLayout$paymentsheet_release$annotations", "Landroid/widget/AutoCompleteTextView;", "countryView", "Landroid/widget/AutoCompleteTextView;", "getCountryView$paymentsheet_release", "()Landroid/widget/AutoCompleteTextView;", "getCountryView$paymentsheet_release$annotations", "Landroid/widget/LinearLayout;", "cityPostalContainer", "Landroid/widget/LinearLayout;", "getCityPostalContainer$paymentsheet_release", "()Landroid/widget/LinearLayout;", "getCityPostalContainer$paymentsheet_release$annotations", "Lcom/stripe/android/view/StripeEditText;", "postalCodeView", "Lcom/stripe/android/view/StripeEditText;", "getPostalCodeView$paymentsheet_release", "()Lcom/stripe/android/view/StripeEditText;", "getPostalCodeView$paymentsheet_release$annotations", "Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getPostalCodeLayout$paymentsheet_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "getPostalCodeLayout$paymentsheet_release$annotations", "Lcom/google/android/material/textfield/TextInputEditText;", "address1View", "Lcom/google/android/material/textfield/TextInputEditText;", "getAddress1View$paymentsheet_release", "()Lcom/google/android/material/textfield/TextInputEditText;", "getAddress1View$paymentsheet_release$annotations", "address2View", "getAddress2View$paymentsheet_release", "getAddress2View$paymentsheet_release$annotations", "cityLayout", "getCityLayout$paymentsheet_release", "getCityLayout$paymentsheet_release$annotations", "cityView", "getCityView$paymentsheet_release", "getCityView$paymentsheet_release$annotations", "stateView", "getStateView$paymentsheet_release", "getStateView$paymentsheet_release$annotations", "stateLayout", "getStateLayout$paymentsheet_release", "getStateLayout$paymentsheet_release$annotations", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "postalCodeViewListener", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "getPostalCodeViewListener$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "setPostalCodeViewListener$paymentsheet_release", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;)V", "getPostalCodeViewListener$paymentsheet_release$annotations", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "postalCodeConfig$delegate", "getPostalCodeConfig", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "setPostalCodeConfig", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;)V", "postalCodeConfig", "Lkotlin/Function1;", "newCountryCodeCallback", "Lkotlin/jvm/functions/Function1;", "", "Landroid/view/View;", "requiredViews", "Ljava/util/Set;", "Landroid/widget/EditText;", "allFields", "isUnitedStates", "()Z", "getValue", "(Landroid/widget/EditText;)Ljava/lang/String;", "value", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "BillingAddressCollectionLevel", "PostalCodeConfig", "PostalCodeViewListener", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBillingAddressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingAddressView.kt\ncom/stripe/android/paymentsheet/ui/BillingAddressView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n33#2,3:428\n33#2,3:431\n1855#3:434\n1856#3:461\n1855#3,2:468\n1855#3:470\n1856#3:473\n1855#3:474\n1856#3:477\n58#4,23:435\n93#4,3:458\n262#5,2:462\n262#5,2:464\n262#5,2:466\n262#5,2:471\n262#5,2:475\n260#5:479\n1#6:478\n*S KotlinDebug\n*F\n+ 1 BillingAddressView.kt\ncom/stripe/android/paymentsheet/ui/BillingAddressView\n*L\n47#1:428,3\n105#1:431,3\n173#1:434\n173#1:461\n333#1:468,2\n341#1:470\n341#1:473\n344#1:474\n344#1:477\n174#1:435,23\n174#1:458,3\n301#1:462,2\n305#1:464,2\n306#1:466,2\n341#1:471,2\n344#1:475,2\n381#1:479\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView */
/* loaded from: classes7.dex */
public final class BillingAddressView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BillingAddressView.class, "level", "getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BillingAddressView.class, "postalCodeConfig", "getPostalCodeConfig()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", 0))};
    private final C49882uX2<Address> _address;
    private final LiveData<Address> address;
    private final TextInputEditText address1View;
    private final TextInputEditText address2View;
    private final Set<EditText> allFields;
    private final TextInputLayout cityLayout;
    private final LinearLayout cityPostalContainer;
    private final TextInputEditText cityView;
    private final CountryTextInputLayout countryLayout;
    private final AutoCompleteTextView countryView;
    private final ReadWriteProperty level$delegate;
    private final Function1<CountryCode, Unit> newCountryCodeCallback;
    private Function0<Unit> onFocus;
    private final ReadWriteProperty postalCodeConfig$delegate;
    private final TextInputLayout postalCodeLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText postalCodeView;
    private PostalCodeViewListener postalCodeViewListener;
    private final Set<View> requiredViews;
    private final TextInputLayout stateLayout;
    private final TextInputEditText stateView;
    private final StripeBillingAddressLayoutBinding viewBinding;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "", "(Ljava/lang/String;I)V", "Automatic", "Required", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$BillingAddressCollectionLevel */
    /* loaded from: classes7.dex */
    public enum BillingAddressCollectionLevel {
        Automatic,
        Required
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "", "()V", "inputType", "", "getInputType", "()I", "maxLength", "getMaxLength", "getKeyListener", "Landroid/text/method/KeyListener;", "Global", "UnitedStates", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeConfig */
    /* loaded from: classes7.dex */
    public static abstract class PostalCodeConfig {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "()V", "inputType", "", "getInputType", "()I", "maxLength", "getMaxLength", "getKeyListener", "Landroid/text/method/KeyListener;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeConfig$Global */
        /* loaded from: classes7.dex */
        public static final class Global extends PostalCodeConfig {
            public static final int $stable = 0;
            public static final Global INSTANCE = new Global();
            private static final int maxLength = 13;
            private static final int inputType = 112;

            private Global() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.p047ui.BillingAddressView.PostalCodeConfig
            public int getInputType() {
                return inputType;
            }

            @Override // com.stripe.android.paymentsheet.p047ui.BillingAddressView.PostalCodeConfig
            public KeyListener getKeyListener() {
                TextKeyListener textKeyListener = TextKeyListener.getInstance();
                Intrinsics.checkNotNullExpressionValue(textKeyListener, "getInstance()");
                return textKeyListener;
            }

            @Override // com.stripe.android.paymentsheet.p047ui.BillingAddressView.PostalCodeConfig
            public int getMaxLength() {
                return maxLength;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "()V", "inputType", "", "getInputType", "()I", "maxLength", "getMaxLength", "getKeyListener", "Landroid/text/method/KeyListener;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeConfig$UnitedStates */
        /* loaded from: classes7.dex */
        public static final class UnitedStates extends PostalCodeConfig {
            public static final int $stable = 0;
            public static final UnitedStates INSTANCE = new UnitedStates();
            private static final int maxLength = 5;
            private static final int inputType = 18;

            private UnitedStates() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.p047ui.BillingAddressView.PostalCodeConfig
            public int getInputType() {
                return inputType;
            }

            @Override // com.stripe.android.paymentsheet.p047ui.BillingAddressView.PostalCodeConfig
            public KeyListener getKeyListener() {
                DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance(false, true);
                Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "getInstance(false, true)");
                return digitsKeyListener;
            }

            @Override // com.stripe.android.paymentsheet.p047ui.BillingAddressView.PostalCodeConfig
            public int getMaxLength() {
                return maxLength;
            }
        }

        public /* synthetic */ PostalCodeConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getInputType();

        public abstract KeyListener getKeyListener();

        public abstract int getMaxLength();

        private PostalCodeConfig() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "", "onCountryChanged", "", "country", "Lcom/stripe/android/core/model/Country;", "isPostalValid", "", "onGainingFocus", "onLosingFocus", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeViewListener */
    /* loaded from: classes7.dex */
    public interface PostalCodeViewListener {
        void onCountryChanged(Country country, boolean z);

        void onGainingFocus(Country country, boolean z);

        void onLosingFocus(Country country, boolean z);
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.BillingAddressView$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAddressCollectionLevel.values().length];
            try {
                iArr[BillingAddressCollectionLevel.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingAddressCollectionLevel.Required.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BillingAddressView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void _init_$lambda$9(BillingAddressView this$0, View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean isBlank;
        boolean z5;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CountryCode selectedCountryCode = this$0.countryLayout.getSelectedCountryCode();
        boolean z6 = false;
        if (selectedCountryCode != null) {
            PostalCodeValidator postalCodeValidator = this$0.postalCodeValidator;
            String value = this$0.getValue(this$0.postalCodeView);
            if (value == null) {
                value = "";
            }
            z2 = postalCodeValidator.isValid(value, selectedCountryCode.getValue());
        } else {
            z2 = false;
        }
        StripeEditText stripeEditText = this$0.postalCodeView;
        if (!z) {
            String value2 = this$0.getValue(stripeEditText);
            if (value2 != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(value2);
                if (!isBlank2) {
                    z5 = false;
                    if (!z5 && !z2) {
                        z3 = true;
                        stripeEditText.setShouldShowError(z3);
                        Country country = null;
                        if (z) {
                            PostalCodeViewListener postalCodeViewListener = this$0.postalCodeViewListener;
                            if (postalCodeViewListener != null) {
                                CountryCode selectedCountryCode2 = this$0.countryLayout.getSelectedCountryCode();
                                if (selectedCountryCode2 != null) {
                                    country = CountryUtils.INSTANCE.getCountryByCode(selectedCountryCode2, this$0.getLocale());
                                }
                                postalCodeViewListener.onGainingFocus(country, z2);
                                return;
                            }
                            return;
                        }
                        PostalCodeViewListener postalCodeViewListener2 = this$0.postalCodeViewListener;
                        if (postalCodeViewListener2 != null) {
                            CountryCode selectedCountryCode3 = this$0.countryLayout.getSelectedCountryCode();
                            if (selectedCountryCode3 != null) {
                                country = CountryUtils.INSTANCE.getCountryByCode(selectedCountryCode3, this$0.getLocale());
                            }
                            postalCodeViewListener2.onLosingFocus(country, z2);
                        }
                        StripeEditText stripeEditText2 = this$0.postalCodeView;
                        String value3 = this$0.getValue(stripeEditText2);
                        if (value3 != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(value3);
                            if (!isBlank) {
                                z4 = false;
                                if (!z4 && !z2) {
                                    z6 = true;
                                }
                                stripeEditText2.setShouldShowError(z6);
                                return;
                            }
                        }
                        z4 = true;
                        if (!z4) {
                            z6 = true;
                        }
                        stripeEditText2.setShouldShowError(z6);
                        return;
                    }
                }
            }
            z5 = true;
            if (!z5) {
                z3 = true;
                stripeEditText.setShouldShowError(z3);
                Country country2 = null;
                if (z) {
                }
            }
        }
        z3 = false;
        stripeEditText.setShouldShowError(z3);
        Country country22 = null;
        if (z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureForLevel() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLevel$paymentsheet_release().ordinal()];
        if (i != 1) {
            if (i == 2) {
                for (View it : this.requiredViews) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    it.setVisibility(0);
                }
            }
        } else {
            for (View it2 : this.requiredViews) {
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                it2.setVisibility(8);
            }
        }
        this._address.setValue(createAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Address createAddress() {
        String str;
        Address build;
        CountryCode selectedCountryCode = this.countryLayout.getSelectedCountryCode();
        if (selectedCountryCode == null) {
            return null;
        }
        String value = getValue(this.postalCodeView);
        PostalCodeValidator postalCodeValidator = this.postalCodeValidator;
        if (value == null) {
            str = "";
        } else {
            str = value;
        }
        if (!postalCodeValidator.isValid(str, selectedCountryCode.getValue())) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getLevel$paymentsheet_release().ordinal()];
        if (i != 1) {
            if (i == 2) {
                build = createRequiredAddress(selectedCountryCode, value);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            build = new Address.Builder().setCountryCode(selectedCountryCode).setPostalCode(value).build();
        }
        return build;
    }

    private final Address createRequiredAddress(CountryCode countryCode, String str) {
        String value = getValue(this.address1View);
        String value2 = getValue(this.address2View);
        String value3 = getValue(this.cityView);
        String value4 = getValue(this.stateView);
        if (value == null || value3 == null) {
            return null;
        }
        if (!isUnitedStates()) {
            return new Address.Builder().setCountryCode(countryCode).setPostalCode(str).setLine1(value).setLine2(value2).setCity(value3).build();
        }
        if (value4 == null) {
            return null;
        }
        return new Address.Builder().setCountryCode(countryCode).setPostalCode(str).setLine1(value).setLine2(value2).setCity(value3).setState(value4).build();
    }

    public static /* synthetic */ void getAddress1View$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getAddress2View$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCityLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCityPostalContainer$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCityView$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCountryLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCountryView$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getLevel$paymentsheet_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale m7771c = C50711vv2.m7770d().m7771c(0);
        Intrinsics.checkNotNull(m7771c);
        return m7771c;
    }

    private final PostalCodeConfig getPostalCodeConfig() {
        return (PostalCodeConfig) this.postalCodeConfig$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public static /* synthetic */ void getPostalCodeLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getPostalCodeView$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getPostalCodeViewListener$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getStateLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getStateView$paymentsheet_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getValue(EditText editText) {
        boolean z;
        String str;
        boolean isBlank;
        Editable text;
        boolean z2 = true;
        if (editText.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            editText = null;
        }
        if (editText != null && (text = editText.getText()) != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        return str;
    }

    private final boolean isUnitedStates() {
        return CountryCode.Companion.isUS(this.countryLayout.getSelectedCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(BillingAddressView this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.onFocus.invoke();
        }
    }

    private final void setPostalCodeConfig(PostalCodeConfig postalCodeConfig) {
        this.postalCodeConfig$delegate.setValue(this, $$delegatedProperties[1], postalCodeConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePostalCodeView(CountryCode countryCode) {
        boolean z;
        int i;
        int i2;
        PostalCodeConfig postalCodeConfig;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        if (countryCode != null && !CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode)) {
            z = false;
        } else {
            z = true;
        }
        TextInputLayout textInputLayout = this.postalCodeLayout;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textInputLayout.setVisibility(i);
        if (getLevel$paymentsheet_release() != BillingAddressCollectionLevel.Required && !z) {
            z2 = false;
        }
        View view = this.viewBinding.cityPostalDivider;
        Intrinsics.checkNotNullExpressionValue(view, "viewBinding.cityPostalDivider");
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        LinearLayout linearLayout = this.viewBinding.cityPostalContainer;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewBinding.cityPostalContainer");
        if (!z2) {
            i4 = 8;
        }
        linearLayout.setVisibility(i4);
        CountryCode.Companion companion = CountryCode.Companion;
        if (companion.isUS(countryCode)) {
            postalCodeConfig = PostalCodeConfig.UnitedStates.INSTANCE;
        } else {
            postalCodeConfig = PostalCodeConfig.Global.INSTANCE;
        }
        setPostalCodeConfig(postalCodeConfig);
        TextInputLayout textInputLayout2 = this.viewBinding.postalCodeLayout;
        Resources resources = getResources();
        if (companion.isUS(countryCode)) {
            i3 = C19159R.string.acc_label_zip_short;
        } else {
            i3 = C19159R.string.address_label_postal_code;
        }
        textInputLayout2.setHint(resources.getString(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateView(CountryCode countryCode) {
        int i;
        CountryCode.Companion companion = CountryCode.Companion;
        if (companion.isUS(countryCode)) {
            i = C19159R.string.address_label_state;
        } else if (companion.isCA(countryCode)) {
            i = C19159R.string.address_label_province;
        } else if (companion.isGB(countryCode)) {
            i = C19159R.string.address_label_county;
        } else {
            i = C19159R.string.address_label_region_generic;
        }
        this.stateLayout.setHint(getResources().getString(i));
    }

    public final void focusFirstField() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLevel$paymentsheet_release().ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.viewBinding.address1Layout.requestFocus();
                return;
            }
            return;
        }
        this.postalCodeLayout.requestFocus();
    }

    public final LiveData<Address> getAddress$paymentsheet_release() {
        return this.address;
    }

    public final TextInputEditText getAddress1View$paymentsheet_release() {
        return this.address1View;
    }

    public final TextInputEditText getAddress2View$paymentsheet_release() {
        return this.address2View;
    }

    public final TextInputLayout getCityLayout$paymentsheet_release() {
        return this.cityLayout;
    }

    public final LinearLayout getCityPostalContainer$paymentsheet_release() {
        return this.cityPostalContainer;
    }

    public final TextInputEditText getCityView$paymentsheet_release() {
        return this.cityView;
    }

    public final CountryTextInputLayout getCountryLayout$paymentsheet_release() {
        return this.countryLayout;
    }

    public final AutoCompleteTextView getCountryView$paymentsheet_release() {
        return this.countryView;
    }

    public final BillingAddressCollectionLevel getLevel$paymentsheet_release() {
        return (BillingAddressCollectionLevel) this.level$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final Function0<Unit> getOnFocus$paymentsheet_release() {
        return this.onFocus;
    }

    public final TextInputLayout getPostalCodeLayout$paymentsheet_release() {
        return this.postalCodeLayout;
    }

    public final StripeEditText getPostalCodeView$paymentsheet_release() {
        return this.postalCodeView;
    }

    public final PostalCodeViewListener getPostalCodeViewListener$paymentsheet_release() {
        return this.postalCodeViewListener;
    }

    public final TextInputLayout getStateLayout$paymentsheet_release() {
        return this.stateLayout;
    }

    public final TextInputEditText getStateView$paymentsheet_release() {
        return this.stateView;
    }

    public final void populate$paymentsheet_release(Address address) {
        if (address != null) {
            this.postalCodeView.setText(address.getPostalCode());
            CountryCode countryCode = address.getCountryCode();
            if (countryCode != null) {
                this.countryLayout.setSelectedCountryCode(countryCode);
                this.countryView.setText(CountryUtils.INSTANCE.getDisplayCountry(countryCode, getLocale()));
            }
            this.address1View.setText(address.getLine1());
            this.address2View.setText(address.getLine2());
            this.cityView.setText(address.getCity());
            this.stateView.setText(address.getState());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Set<TextInputLayout> of;
        super.setEnabled(z);
        StripeBillingAddressLayoutBinding stripeBillingAddressLayoutBinding = this.viewBinding;
        of = SetsKt__SetsKt.setOf((Object[]) new TextInputLayout[]{this.countryLayout, stripeBillingAddressLayoutBinding.address1Layout, stripeBillingAddressLayoutBinding.address2Layout, stripeBillingAddressLayoutBinding.cityLayout, this.postalCodeLayout, this.stateLayout});
        for (TextInputLayout textInputLayout : of) {
            textInputLayout.setEnabled(z);
        }
    }

    public final void setLevel$paymentsheet_release(BillingAddressCollectionLevel billingAddressCollectionLevel) {
        Intrinsics.checkNotNullParameter(billingAddressCollectionLevel, "<set-?>");
        this.level$delegate.setValue(this, $$delegatedProperties[0], billingAddressCollectionLevel);
    }

    public final void setOnFocus$paymentsheet_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onFocus = function0;
    }

    public final void setPostalCodeViewListener$paymentsheet_release(PostalCodeViewListener postalCodeViewListener) {
        this.postalCodeViewListener = postalCodeViewListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BillingAddressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BillingAddressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BillingAddressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Set<View> of;
        Set<EditText> of2;
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        final BillingAddressCollectionLevel billingAddressCollectionLevel = BillingAddressCollectionLevel.Automatic;
        this.level$delegate = new ObservableProperty<BillingAddressCollectionLevel>(billingAddressCollectionLevel) { // from class: com.stripe.android.paymentsheet.ui.BillingAddressView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, BillingAddressView.BillingAddressCollectionLevel billingAddressCollectionLevel2, BillingAddressView.BillingAddressCollectionLevel billingAddressCollectionLevel3) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (billingAddressCollectionLevel2 != billingAddressCollectionLevel3) {
                    this.configureForLevel();
                }
            }
        };
        this.onFocus = BillingAddressView$onFocus$1.INSTANCE;
        StripeBillingAddressLayoutBinding inflate = StripeBillingAddressLayoutBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        this.postalCodeValidator = new PostalCodeValidator();
        C49882uX2<Address> c49882uX2 = new C49882uX2<>(null);
        this._address = c49882uX2;
        this.address = c49882uX2;
        CountryTextInputLayout countryTextInputLayout = inflate.countryLayout;
        Intrinsics.checkNotNullExpressionValue(countryTextInputLayout, "viewBinding.countryLayout");
        this.countryLayout = countryTextInputLayout;
        AutoCompleteTextView countryAutocomplete = countryTextInputLayout.getCountryAutocomplete();
        this.countryView = countryAutocomplete;
        LinearLayout linearLayout = inflate.cityPostalContainer;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "viewBinding.cityPostalContainer");
        this.cityPostalContainer = linearLayout;
        StripeEditText stripeEditText = inflate.postalCode;
        Intrinsics.checkNotNullExpressionValue(stripeEditText, "viewBinding.postalCode");
        this.postalCodeView = stripeEditText;
        TextInputLayout textInputLayout = inflate.postalCodeLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewBinding.postalCodeLayout");
        this.postalCodeLayout = textInputLayout;
        TextInputEditText textInputEditText = inflate.address1;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "viewBinding.address1");
        this.address1View = textInputEditText;
        TextInputEditText textInputEditText2 = inflate.address2;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "viewBinding.address2");
        this.address2View = textInputEditText2;
        TextInputLayout textInputLayout2 = inflate.cityLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewBinding.cityLayout");
        this.cityLayout = textInputLayout2;
        TextInputEditText textInputEditText3 = inflate.city;
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "viewBinding.city");
        this.cityView = textInputEditText3;
        TextInputEditText textInputEditText4 = inflate.state;
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "viewBinding.state");
        this.stateView = textInputEditText4;
        TextInputLayout textInputLayout3 = inflate.stateLayout;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "viewBinding.stateLayout");
        this.stateLayout = textInputLayout3;
        final PostalCodeConfig.Global global = PostalCodeConfig.Global.INSTANCE;
        this.postalCodeConfig$delegate = new ObservableProperty<PostalCodeConfig>(global) { // from class: com.stripe.android.paymentsheet.ui.BillingAddressView$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, BillingAddressView.PostalCodeConfig postalCodeConfig, BillingAddressView.PostalCodeConfig postalCodeConfig2) {
                Intrinsics.checkNotNullParameter(property, "property");
                BillingAddressView.PostalCodeConfig postalCodeConfig3 = postalCodeConfig2;
                this.getPostalCodeView$paymentsheet_release().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(postalCodeConfig3.getMaxLength())});
                this.getPostalCodeView$paymentsheet_release().setKeyListener(postalCodeConfig3.getKeyListener());
                if (postalCodeConfig3.getInputType() == 18) {
                    this.getPostalCodeView$paymentsheet_release().setNumberOnlyInputType();
                } else {
                    this.getPostalCodeView$paymentsheet_release().setInputType(postalCodeConfig3.getInputType());
                }
            }
        };
        BillingAddressView$newCountryCodeCallback$1 billingAddressView$newCountryCodeCallback$1 = new BillingAddressView$newCountryCodeCallback$1(this);
        this.newCountryCodeCallback = billingAddressView$newCountryCodeCallback$1;
        of = SetsKt__SetsKt.setOf((Object[]) new View[]{inflate.address1Divider, inflate.address1Layout, textInputEditText, inflate.address2Divider, inflate.address2Layout, textInputEditText2, inflate.cityLayout, textInputEditText3, inflate.stateDivider, textInputLayout3, textInputEditText4});
        this.requiredViews = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new EditText[]{textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, stripeEditText, countryAutocomplete});
        this.allFields = of2;
        countryTextInputLayout.setCountryCodeChangeCallback(billingAddressView$newCountryCodeCallback$1);
        CountryCode selectedCountryCode = countryTextInputLayout.getSelectedCountryCode();
        if (selectedCountryCode != null) {
            billingAddressView$newCountryCodeCallback$1.invoke((BillingAddressView$newCountryCodeCallback$1) selectedCountryCode);
        }
        configureForLevel();
        for (EditText editText : of2) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.paymentsheet.ui.BillingAddressView$_init_$lambda$5$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    C49882uX2 c49882uX22;
                    Address createAddress;
                    c49882uX22 = BillingAddressView.this._address;
                    createAddress = BillingAddressView.this.createAddress();
                    c49882uX22.setValue(createAddress);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: LG
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    BillingAddressView.lambda$5$lambda$4(BillingAddressView.this, view, z);
                }
            });
        }
        this.postalCodeView.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: MG
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                BillingAddressView._init_$lambda$9(BillingAddressView.this, view, z);
            }
        });
    }
}
