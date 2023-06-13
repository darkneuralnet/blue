package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.response.ReloadOption;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ]\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0016H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LY04;", "", "", "currency", "", "Lco/bird/api/response/ReloadOption;", "preloadV2Options", "", "includePayPerRidePlan", "includeAutoReloadSection", "autoReloadMandatory", "optionIdSelected", "Lkotlin/Pair;", "LH6;", C17296a.f69688o, "(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/String;)Lkotlin/Pair;", "LG6;", "e", "selected", DateTokenConverter.CONVERTER_KEY, "b", "(Ljava/lang/Boolean;)LG6;", "", "disclaimerOptionMap", "c", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2OptionsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsConverter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n1559#2:120\n1590#2,4:121\n125#3:125\n152#3,3:126\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsConverter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsConverter\n*L\n32#1:120\n32#1:121,4\n114#1:125\n114#1:126,3\n*E\n"})
/* renamed from: Y04 */
/* loaded from: classes3.dex */
public final class Y04 {

    /* renamed from: b */
    public static final C9592a f44424b = new C9592a(null);

    /* renamed from: a */
    public final Context f44425a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LY04$a;", "", "", "PAY_PER_RIDE_OPTION_ID", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Y04$a */
    /* loaded from: classes3.dex */
    public static final class C9592a {
        public /* synthetic */ C9592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9592a() {
        }
    }

    public Y04(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44425a = context;
    }

    /* renamed from: a */
    public final Pair<List<C3023H6>, List<String>> m75864a(String currency, List<ReloadOption> preloadV2Options, boolean z, boolean z2, Boolean bool, String optionIdSelected) {
        int collectionSizeOrDefault;
        List mutableListOf;
        List listOf;
        int size;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(preloadV2Options, "preloadV2Options");
        Intrinsics.checkNotNullParameter(optionIdSelected, "optionIdSelected");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ReloadOption> list = preloadV2Options;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ReloadOption reloadOption = (ReloadOption) obj;
            StringBuilder sb = new StringBuilder();
            String incentiveSubtext = reloadOption.getIncentiveSubtext();
            if (incentiveSubtext != null) {
                String str = linkedHashMap.get(incentiveSubtext);
                if (str != null) {
                    size = str.length();
                } else {
                    size = 1 + linkedHashMap.size();
                }
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append("*");
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "postFixStringBuilder.toString()");
                linkedHashMap.put(incentiveSubtext, sb2);
            }
            String incentiveText = reloadOption.getIncentiveText();
            if (incentiveText == null) {
                incentiveText = "";
            }
            String str2 = incentiveText + ((Object) sb);
            int i4 = C31932Bj4.item_preload_v2_option;
            String id = reloadOption.getId();
            if (id != null) {
                arrayList.add(new C2637G6(new S04(id, Long.valueOf(reloadOption.getAmount()), C51916xx1.currency$default(C51916xx1.f118396a, reloadOption.getAmount(), C45097mS5.m25591o(currency), null, 4, null), str2, Intrinsics.areEqual(reloadOption.getId(), optionIdSelected), reloadOption.getIncentiveTag(), reloadOption.getIncentiveTagColor()), i4, false, 4, null));
                i = i2;
            } else {
                throw new IllegalStateException("Preload V2 plan missing id");
            }
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(m75860e());
        mutableListOf.addAll(arrayList);
        boolean areEqual = Intrinsics.areEqual(optionIdSelected, "_included_pay_per_ride");
        if (z) {
            mutableListOf.add(m75861d(areEqual));
        }
        if (z2 && !areEqual) {
            mutableListOf.add(m75863b(bool));
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableListOf, null, null, 6, null));
        return TuplesKt.m28425to(listOf, m75862c(linkedHashMap));
    }

    /* renamed from: b */
    public final C2637G6 m75863b(Boolean bool) {
        int i = C31932Bj4.item_preload_v2_autoreload_section;
        String string = this.f44425a.getString(C45871nl4.auto_reload_off_description);
        String string2 = this.f44425a.getString(C45871nl4.auto_reload_on_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.auto_reload_on_description)");
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.auto_reload_off_description)");
        return new C2637G6(new C0292As(bool, string2, string), i, false, 4, null);
    }

    /* renamed from: c */
    public final List<String> m75862c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getValue() + entry.getKey());
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C2637G6 m75861d(boolean z) {
        int i = C31932Bj4.item_preload_v2_option;
        String string = this.f44425a.getString(C45871nl4.pay_after_ride_option);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.pay_after_ride_option)");
        return new C2637G6(new S04("_included_pay_per_ride", null, string, null, z, null, null, 96, null), i, false, 4, null);
    }

    /* renamed from: e */
    public final C2637G6 m75860e() {
        return new C2637G6(null, C31932Bj4.item_preload_v2_title, false, 4, null);
    }
}
