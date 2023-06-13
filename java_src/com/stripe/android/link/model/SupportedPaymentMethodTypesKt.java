package com.stripe.android.link.model;

import com.stripe.android.link.p042ui.paymentmethod.SupportedPaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m28432d2 = {"supportedPaymentMethodTypes", "", "", "Lcom/stripe/android/model/StripeIntent;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nSupportedPaymentMethodTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodTypes.kt\ncom/stripe/android/link/model/SupportedPaymentMethodTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n766#2:25\n857#2,2:26\n1#3:28\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodTypes.kt\ncom/stripe/android/link/model/SupportedPaymentMethodTypesKt\n*L\n20#1:25\n20#1:26,2\n*E\n"})
/* loaded from: classes7.dex */
public final class SupportedPaymentMethodTypesKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        r4 = kotlin.collections.CollectionsKt___CollectionsKt.toSet(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Set<String> supportedPaymentMethodTypes(StripeIntent stripeIntent, LinkAccount linkAccount) {
        Set<String> of;
        Set<String> set;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        ArrayList arrayList = null;
        if (!stripeIntent.isLiveMode()) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) linkAccount.getEmail(), (CharSequence) "+multiple_funding_sources@", false, 2, (Object) null);
            if (contains$default) {
                return SupportedPaymentMethod.Companion.getAllTypes();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : stripeIntent.getLinkFundingSources()) {
            if (SupportedPaymentMethod.Companion.getAllTypes().contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        if (arrayList == null || set == null) {
            of = SetsKt__SetsJVMKt.setOf("card");
            return of;
        }
        return set;
    }
}
