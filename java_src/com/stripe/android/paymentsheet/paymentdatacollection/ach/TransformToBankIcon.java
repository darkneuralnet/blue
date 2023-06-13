package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.C19159R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;", "", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface TransformToBankIcon {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion;", "", "()V", "invoke", "", "bankName", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransformToBankIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformToBankIcon.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n515#2:47\n500#2,6:48\n1#3:54\n*S KotlinDebug\n*F\n+ 1 TransformToBankIcon.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion\n*L\n40#1:47\n40#1:48,6\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final int invoke(String str) {
            Map mapOf;
            Integer num;
            boolean any;
            if (str == null) {
                return C19159R.C19160drawable.stripe_ic_bank;
            }
            RegexOption regexOption = RegexOption.IGNORE_CASE;
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(new Regex("Bank of America", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_boa)), TuplesKt.m28425to(new Regex("Capital One", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_capitalone)), TuplesKt.m28425to(new Regex("Citibank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_citi)), TuplesKt.m28425to(new Regex("BBVA|COMPASS", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_compass)), TuplesKt.m28425to(new Regex("MORGAN CHASE|JP MORGAN|Chase", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_morganchase)), TuplesKt.m28425to(new Regex("NAVY FEDERAL CREDIT UNION", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_nfcu)), TuplesKt.m28425to(new Regex("PNC\\s?BANK|PNC Bank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_pnc)), TuplesKt.m28425to(new Regex("SUNTRUST|SunTrust Bank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_suntrust)), TuplesKt.m28425to(new Regex("Silicon Valley Bank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_svb)), TuplesKt.m28425to(new Regex("Stripe|TestInstitution", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_stripe)), TuplesKt.m28425to(new Regex("TD Bank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_td)), TuplesKt.m28425to(new Regex("USAA FEDERAL SAVINGS BANK|USAA Bank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_usaa)), TuplesKt.m28425to(new Regex("U\\.?S\\. BANK|US Bank", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_usbank)), TuplesKt.m28425to(new Regex("Wells Fargo", regexOption), Integer.valueOf(C19159R.C19160drawable.stripe_ic_bank_wellsfargo)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = mapOf.entrySet().iterator();
            while (true) {
                num = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                any = SequencesKt___SequencesKt.any(Regex.findAll$default((Regex) entry.getKey(), str, 0, 2, null));
                if (any) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Integer num2 = (Integer) ((Map.Entry) it2.next()).getValue();
                if (num2 != null) {
                    num = num2;
                    break;
                }
            }
            if (num != null) {
                return num.intValue();
            }
            return C19159R.C19160drawable.stripe_ic_bank;
        }
    }
}
