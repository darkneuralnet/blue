package com.stripe.android.paymentsheet;

import android.content.SharedPreferences;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2", m28418f = "DefaultPrefsRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nDefaultPrefsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPrefsRepository.kt\ncom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultPrefsRepository$getSavedSelection$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super SavedSelection>, Object> {
    final /* synthetic */ boolean $isGooglePayAvailable;
    final /* synthetic */ boolean $isLinkAvailable;
    int label;
    final /* synthetic */ DefaultPrefsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsRepository$getSavedSelection$2(DefaultPrefsRepository defaultPrefsRepository, boolean z, boolean z2, Continuation<? super DefaultPrefsRepository$getSavedSelection$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultPrefsRepository;
        this.$isGooglePayAvailable = z;
        this.$isLinkAvailable = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPrefsRepository$getSavedSelection$2(this.this$0, this.$isGooglePayAvailable, this.$isLinkAvailable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super SavedSelection> continuation) {
        return ((DefaultPrefsRepository$getSavedSelection$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r8.$isLinkAvailable != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r8.$isGooglePayAvailable != false) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SharedPreferences prefs;
        String key;
        List split$default;
        Object firstOrNull;
        Object obj2;
        Object orNull;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            prefs = this.this$0.getPrefs();
            key = this.this$0.getKey();
            SavedSelection.PaymentMethod paymentMethod = null;
            String string = prefs.getString(key, null);
            if (string == null) {
                string = "";
            }
            split$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{":"}, false, 0, 6, (Object) null);
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) split$default);
            String str = (String) firstOrNull;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1534821982) {
                    if (hashCode != -1029412550) {
                        if (hashCode == 3321850 && str.equals("link")) {
                            obj2 = SavedSelection.Link.INSTANCE;
                        }
                    } else if (str.equals("payment_method")) {
                        orNull = CollectionsKt___CollectionsKt.getOrNull(split$default, 1);
                        String str2 = (String) orNull;
                        if (str2 != null) {
                            paymentMethod = new SavedSelection.PaymentMethod(str2);
                        }
                    }
                } else if (str.equals("google_pay")) {
                    obj2 = SavedSelection.GooglePay.INSTANCE;
                }
            }
            if (paymentMethod == null) {
                return SavedSelection.None.INSTANCE;
            }
            return paymentMethod;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
