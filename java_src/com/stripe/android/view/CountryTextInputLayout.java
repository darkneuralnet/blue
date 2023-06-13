package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.C18606R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.view.CountryTextInputLayout;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002JKB%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020.H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u00100\u001a\u00020\rH\u0002J\u0012\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000103H\u0014J\n\u00104\u001a\u0004\u0018\u000103H\u0016J\u0015\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u000206H\u0001¢\u0006\u0002\b7J\u001b\u00108\u001a\u00020\u00152\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0000¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0001¢\u0006\u0002\b?J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020;H\u0001¢\u0006\u0002\b?J\u0010\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020BH\u0016J\u0012\u0010C\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u0010D\u001a\u00020\u0015H\u0002J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0007J\u0015\u0010F\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0000¢\u0006\u0002\bGJ\r\u0010H\u001a\u00020\u0015H\u0000¢\u0006\u0002\bIR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0012\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R5\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001c8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006L"}, m28432d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "countryAutoCompleteStyleRes", "countryAutocomplete", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$annotations", "()V", "getCountryAutocomplete", "()Landroid/widget/AutoCompleteTextView;", "countryChangeCallback", "Lkotlin/Function1;", "Lcom/stripe/android/core/model/Country;", "", "getCountryChangeCallback$payments_core_release$annotations", "getCountryChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setCountryChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "countryCodeChangeCallback", "Lcom/stripe/android/core/model/CountryCode;", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "itemLayoutRes", "selectedCountry", "getSelectedCountry$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "<set-?>", "selectedCountryCode", "getSelectedCountryCode$payments_core_release$annotations", "getSelectedCountryCode$payments_core_release", "()Lcom/stripe/android/core/model/CountryCode;", "setSelectedCountryCode$payments_core_release", "(Lcom/stripe/android/core/model/CountryCode;)V", "selectedCountryCode$delegate", "Lkotlin/properties/ReadWriteProperty;", "clearError", "getLocale", "Ljava/util/Locale;", "getSelectedCountryCode", "initializeCountryAutoCompleteWithStyle", "onRestoreInstanceState", TransferTable.COLUMN_STATE, "Landroid/os/Parcelable;", "onSaveInstanceState", "restoreSelectedCountry", "Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "restoreSelectedCountry$payments_core_release", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setAllowedCountryCodes$payments_core_release", "setCountrySelected", "countryCode", "setCountrySelected$payments_core_release", "setEnabled", "enabled", "", "setSelectedCountryCode", "updateInitialCountry", "updateUiForCountryEntered", "updatedSelectedCountryCode", "updatedSelectedCountryCode$payments_core_release", "validateCountry", "validateCountry$payments_core_release", "Companion", "SelectedCountryState", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCountryTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryTextInputLayout.kt\ncom/stripe/android/view/CountryTextInputLayout\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,298:1\n33#2,3:299\n52#3,9:302\n1#4:311\n40#5:312\n56#5:313\n*S KotlinDebug\n*F\n+ 1 CountryTextInputLayout.kt\ncom/stripe/android/view/CountryTextInputLayout\n*L\n59#1:299,3\n96#1:302,9\n167#1:312\n167#1:313\n*E\n"})
/* loaded from: classes7.dex */
public final class CountryTextInputLayout extends TextInputLayout {
    @Deprecated
    public static final int INVALID_COUNTRY_AUTO_COMPLETE_STYLE = 0;
    private CountryAdapter countryAdapter;
    private int countryAutoCompleteStyleRes;
    private final AutoCompleteTextView countryAutocomplete;
    private /* synthetic */ Function1<? super Country, Unit> countryChangeCallback;
    private /* synthetic */ Function1<? super CountryCode, Unit> countryCodeChangeCallback;
    private int itemLayoutRes;
    private final ReadWriteProperty selectedCountryCode$delegate;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final int DEFAULT_ITEM_LAYOUT = C18606R.C18609layout.country_text_view;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "Landroid/widget/TextView;", "it", "Landroid/view/ViewGroup;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CountryTextInputLayout$2 */
    /* loaded from: classes7.dex */
    public static final class C195162 extends Lambda implements Function1<ViewGroup, TextView> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CountryTextInputLayout this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195162(Context context, CountryTextInputLayout countryTextInputLayout) {
            super(1);
            this.$context = context;
            this.this$0 = countryTextInputLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public final TextView invoke(ViewGroup it) {
            Intrinsics.checkNotNullParameter(it, "it");
            View inflate = LayoutInflater.from(this.$context).inflate(this.this$0.itemLayoutRes, it, false);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) inflate;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "country", "Lcom/stripe/android/core/model/Country;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.view.CountryTextInputLayout$5 */
    /* loaded from: classes7.dex */
    public static final class C195175 extends Lambda implements Function1<Country, Unit> {
        final /* synthetic */ String $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195175(String str) {
            super(1);
            this.$errorMessage = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Country country) {
            invoke2(country);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Country country) {
            CountryTextInputLayout.this.setSelectedCountryCode$payments_core_release(country != null ? country.getCode() : null);
            if (country != null) {
                CountryTextInputLayout.this.clearError();
                return;
            }
            CountryTextInputLayout.this.setError(this.$errorMessage);
            CountryTextInputLayout.this.setErrorEnabled(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$Companion;", "", "()V", "DEFAULT_ITEM_LAYOUT", "", "getDEFAULT_ITEM_LAYOUT", "()I", "INVALID_COUNTRY_AUTO_COMPLETE_STYLE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_ITEM_LAYOUT() {
            return CountryTextInputLayout.DEFAULT_ITEM_LAYOUT;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "Landroid/os/Parcelable;", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "superState", "(Lcom/stripe/android/core/model/CountryCode;Landroid/os/Parcelable;)V", "getCountryCode", "()Lcom/stripe/android/core/model/CountryCode;", "getSuperState", "()Landroid/os/Parcelable;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SelectedCountryState implements Parcelable {
        public static final Parcelable.Creator<SelectedCountryState> CREATOR = new Creator();
        private final CountryCode countryCode;
        private final Parcelable superState;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<SelectedCountryState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectedCountryState((CountryCode) parcel.readParcelable(SelectedCountryState.class.getClassLoader()), parcel.readParcelable(SelectedCountryState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState[] newArray(int i) {
                return new SelectedCountryState[i];
            }
        }

        public SelectedCountryState(CountryCode countryCode, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.superState = parcelable;
        }

        public static /* synthetic */ SelectedCountryState copy$default(SelectedCountryState selectedCountryState, CountryCode countryCode, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = selectedCountryState.countryCode;
            }
            if ((i & 2) != 0) {
                parcelable = selectedCountryState.superState;
            }
            return selectedCountryState.copy(countryCode, parcelable);
        }

        public final CountryCode component1() {
            return this.countryCode;
        }

        public final Parcelable component2() {
            return this.superState;
        }

        public final SelectedCountryState copy(CountryCode countryCode, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new SelectedCountryState(countryCode, parcelable);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SelectedCountryState) {
                SelectedCountryState selectedCountryState = (SelectedCountryState) obj;
                return Intrinsics.areEqual(this.countryCode, selectedCountryState.countryCode) && Intrinsics.areEqual(this.superState, selectedCountryState.superState);
            }
            return false;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public int hashCode() {
            int hashCode = this.countryCode.hashCode() * 31;
            Parcelable parcelable = this.superState;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            CountryCode countryCode = this.countryCode;
            Parcelable parcelable = this.superState;
            return "SelectedCountryState(countryCode=" + countryCode + ", superState=" + parcelable + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.countryCode, i);
            out.writeParcelable(this.superState, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountryTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatedSelectedCountryCode$payments_core_release(this$0.countryAdapter.getItem(i).getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(CountryTextInputLayout this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.countryAutocomplete.showDropDown();
            return;
        }
        String obj = this$0.countryAutocomplete.getText().toString();
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        CountryCode countryCodeByName = countryUtils.getCountryCodeByName(obj, this$0.getLocale());
        if (countryCodeByName != null) {
            this$0.updateUiForCountryEntered(countryCodeByName);
            return;
        }
        CountryCode.Companion companion = CountryCode.Companion;
        if (countryUtils.getCountryByCode(companion.create(obj), this$0.getLocale()) != null) {
            this$0.updateUiForCountryEntered(companion.create(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearError() {
        setError(null);
        setErrorEnabled(false);
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    @Deprecated(message = "Will be removed in a future version", replaceWith = @ReplaceWith(expression = "countryCodeChangeCallback", imports = {}))
    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale m7771c = C50711vv2.m7770d().m7771c(0);
        Intrinsics.checkNotNull(m7771c);
        return m7771c;
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    private final AutoCompleteTextView initializeCountryAutoCompleteWithStyle() {
        if (this.countryAutoCompleteStyleRes == 0) {
            return new AutoCompleteTextView(getContext(), null, C18606R.attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.countryAutoCompleteStyleRes);
    }

    private final void updateInitialCountry() {
        Country firstItem$payments_core_release = this.countryAdapter.getFirstItem$payments_core_release();
        this.countryAutocomplete.setText(firstItem$payments_core_release.getName());
        setSelectedCountryCode$payments_core_release(firstItem$payments_core_release.getCode());
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    public final Function1<Country, Unit> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final Function1<CountryCode, Unit> getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final Country getSelectedCountry$payments_core_release() {
        CountryCode selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return CountryUtils.INSTANCE.getCountryByCode(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    public final CountryCode getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final CountryCode getSelectedCountryCode$payments_core_release() {
        return (CountryCode) this.selectedCountryCode$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SelectedCountryState) {
            restoreSelectedCountry$payments_core_release((SelectedCountryState) parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        Country selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new SelectedCountryState(selectedCountry$payments_core_release.getCode(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    public final void restoreSelectedCountry$payments_core_release(SelectedCountryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onRestoreInstanceState(state.getSuperState());
        CountryCode countryCode = state.getCountryCode();
        updatedSelectedCountryCode$payments_core_release(countryCode);
        updateUiForCountryEntered(countryCode);
        requestLayout();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        if (this.countryAdapter.updateUnfilteredCountries$payments_core_release(allowedCountryCodes)) {
            updateInitialCountry();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(Function1<? super Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.countryChangeCallback = function1;
    }

    public final void setCountryCodeChangeCallback(Function1<? super CountryCode, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.countryCodeChangeCallback = function1;
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        updateUiForCountryEntered(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(final boolean z) {
        super.setEnabled(z);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                CountryTextInputLayout.this.getCountryAutocomplete().setEnabled(z);
            }
        });
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void setSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        this.selectedCountryCode$delegate.setValue(this, $$delegatedProperties[0], countryCode);
    }

    public final void updateUiForCountryEntered(CountryCode countryCode) {
        String str;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        Country countryByCode = countryUtils.getCountryByCode(countryCode, getLocale());
        if (countryByCode != null) {
            updatedSelectedCountryCode$payments_core_release(countryCode);
        } else {
            countryByCode = countryUtils.getCountryByCode(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        AutoCompleteTextView autoCompleteTextView = this.countryAutocomplete;
        if (countryByCode != null) {
            str = countryByCode.getName();
        } else {
            str = null;
        }
        autoCompleteTextView.setText(str);
    }

    public final void updatedSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        clearError();
        if (!Intrinsics.areEqual(getSelectedCountryCode$payments_core_release(), countryCode)) {
            setSelectedCountryCode$payments_core_release(countryCode);
        }
    }

    public final void validateCountry$payments_core_release() {
        this.countryAutocomplete.performValidation();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Deprecated(message = "This will be removed in a future version", replaceWith = @ReplaceWith(expression = "setCountrySelected(CountryCode.create(countryCode))", imports = {"com.stripe.android.model.CountryCode"}))
    public final void setCountrySelected$payments_core_release(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        updateUiForCountryEntered(CountryCode.Companion.create(countryCode));
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C49961uf4.textInputStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountryTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = DEFAULT_ITEM_LAYOUT;
        this.itemLayoutRes = i2;
        Delegates delegates = Delegates.INSTANCE;
        this.selectedCountryCode$delegate = new ObservableProperty<CountryCode>(null) { // from class: com.stripe.android.view.CountryTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, CountryCode countryCode, CountryCode countryCode2) {
                Locale locale;
                Intrinsics.checkNotNullParameter(property, "property");
                CountryCode countryCode3 = countryCode2;
                if (countryCode3 != null) {
                    this.getCountryCodeChangeCallback().invoke(countryCode3);
                    CountryUtils countryUtils = CountryUtils.INSTANCE;
                    locale = this.getLocale();
                    Country countryByCode = countryUtils.getCountryByCode(countryCode3, locale);
                    if (countryByCode != null) {
                        this.getCountryChangeCallback$payments_core_release().invoke(countryByCode);
                    }
                }
            }
        };
        this.countryChangeCallback = CountryTextInputLayout$countryChangeCallback$1.INSTANCE;
        this.countryCodeChangeCallback = CountryTextInputLayout$countryCodeChangeCallback$1.INSTANCE;
        int[] StripeCountryAutoCompleteTextInputLayout = C18606R.styleable.StripeCountryAutoCompleteTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.countryAutoCompleteStyleRes = obtainStyledAttributes.getResourceId(C18606R.styleable.f75292x9c655edc, 0);
        this.itemLayoutRes = obtainStyledAttributes.getResourceId(C18606R.styleable.StripeCountryAutoCompleteTextInputLayout_countryItemLayout, i2);
        obtainStyledAttributes.recycle();
        AutoCompleteTextView initializeCountryAutoCompleteWithStyle = initializeCountryAutoCompleteWithStyle();
        this.countryAutocomplete = initializeCountryAutoCompleteWithStyle;
        addView(initializeCountryAutoCompleteWithStyle, new LinearLayout.LayoutParams(-1, -2));
        this.countryAdapter = new CountryAdapter(context, CountryUtils.INSTANCE.getOrderedCountries(getLocale()), this.itemLayoutRes, new C195162(context, this));
        initializeCountryAutoCompleteWithStyle.setThreshold(0);
        initializeCountryAutoCompleteWithStyle.setAdapter(this.countryAdapter);
        initializeCountryAutoCompleteWithStyle.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: yD0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                CountryTextInputLayout._init_$lambda$5(CountryTextInputLayout.this, adapterView, view, i3, j);
            }
        });
        initializeCountryAutoCompleteWithStyle.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zD0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CountryTextInputLayout._init_$lambda$8(CountryTextInputLayout.this, view, z);
            }
        });
        setSelectedCountryCode$payments_core_release(this.countryAdapter.getFirstItem$payments_core_release().getCode());
        updateInitialCountry();
        String string = getResources().getString(C18606R.string.address_country_invalid);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st….address_country_invalid)");
        initializeCountryAutoCompleteWithStyle.setValidator(new CountryAutoCompleteTextViewValidator(this.countryAdapter, new C195175(string)));
    }
}
