package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0005H\u0002J!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "customerId", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "getKey", "getSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayAvailable", "", "isLinkAvailable", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentSelection", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "write", "value", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDefaultPrefsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPrefsRepository.kt\ncom/stripe/android/paymentsheet/DefaultPrefsRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultPrefsRepository implements PrefsRepository {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String PREF_FILE = "DefaultPrefsRepository";
    private final Context context;
    private final String customerId;
    private final Lazy prefs$delegate;
    private final CoroutineContext workContext;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$Companion;", "", "()V", "PREF_FILE", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultPrefsRepository(Context context, String str, CoroutineContext workContext) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.context = context;
        this.customerId = str;
        this.workContext = workContext;
        lazy = LazyKt__LazyJVMKt.lazy(new DefaultPrefsRepository$prefs$2(this));
        this.prefs$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getKey() {
        String str = this.customerId;
        if (str != null) {
            String str2 = "customer[" + str + "]";
            if (str2 != null) {
                return str2;
            }
        }
        return "guest";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        Object value = this.prefs$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }

    private final void write(String str) {
        getPrefs().edit().putString(getKey(), str).apply();
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public Object getSavedSelection(boolean z, boolean z2, Continuation<? super SavedSelection> continuation) {
        return X30.m77504g(this.workContext, new DefaultPrefsRepository$getSavedSelection$2(this, z, z2, null), continuation);
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public void savePaymentSelection(PaymentSelection paymentSelection) {
        String str;
        if (Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            str = "google_pay";
        } else if (Intrinsics.areEqual(paymentSelection, PaymentSelection.Link.INSTANCE)) {
            str = "link";
        } else if (paymentSelection instanceof PaymentSelection.Saved) {
            String str2 = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().f75358id;
            if (str2 == null) {
                str2 = "";
            }
            str = "payment_method:" + str2;
        } else {
            str = null;
        }
        if (str != null) {
            write(str);
        }
    }
}
