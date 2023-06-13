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
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LGs;", "", "", "autoReloadToggled", "", "currency", "", "Lco/bird/api/response/ReloadOption;", "autoReloadOptions", "optionIdSelected", "Lkotlin/Pair;", "LH6;", C17296a.f69688o, "LG6;", DateTokenConverter.CONVERTER_KEY, "b", "", "disclaimerOptionMap", "c", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoReloadV2OptionsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsConverter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n125#3:98\n152#3,3:99\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2OptionsConverter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsConverter\n*L\n36#1:94\n36#1:95,3\n88#1:98\n88#1:99,3\n*E\n"})
/* renamed from: Gs */
/* loaded from: classes3.dex */
public final class C2966Gs {

    /* renamed from: b */
    public static final C2967a f12562b = new C2967a(null);

    /* renamed from: a */
    public final Context f12563a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LGs$a;", "", "", "AUTO_PAY_PLAN_WITHOUT_OPTION_ID", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Gs$a */
    /* loaded from: classes3.dex */
    public static final class C2967a {
        public /* synthetic */ C2967a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2967a() {
        }
    }

    public C2966Gs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12563a = context;
    }

    /* renamed from: a */
    public final Pair<List<C3023H6>, List<String>> m104655a(boolean z, String currency, List<ReloadOption> autoReloadOptions, String optionIdSelected) {
        List listOf;
        int collectionSizeOrDefault;
        int size;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoReloadOptions, "autoReloadOptions");
        Intrinsics.checkNotNullParameter(optionIdSelected, "optionIdSelected");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(m104654b(z));
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            List<ReloadOption> list = autoReloadOptions;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (ReloadOption reloadOption : list) {
                StringBuilder sb = new StringBuilder();
                String incentiveSubtext = reloadOption.getIncentiveSubtext();
                if (incentiveSubtext != null) {
                    String str = linkedHashMap.get(incentiveSubtext);
                    if (str != null) {
                        size = str.length();
                    } else {
                        size = linkedHashMap.size() + 1;
                    }
                    for (int i = 0; i < size; i++) {
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
                int i2 = C31932Bj4.item_preload_v2_option;
                String id = reloadOption.getId();
                if (id == null) {
                    id = "[auto_pay_plan_in_auto_reload_v2]";
                }
                arrayList3.add(new C2637G6(new C1630Ds(id, Long.valueOf(reloadOption.getAmount()), C51916xx1.currency$default(C51916xx1.f118396a, reloadOption.getAmount(), C45097mS5.m25591o(currency), null, 4, null), str2, Intrinsics.areEqual(reloadOption.getId(), optionIdSelected), reloadOption.getIncentiveTag(), reloadOption.getIncentiveTagColor()), i2, false, 4, null));
            }
            arrayList2.addAll(arrayList3);
            arrayList.add(m104652d());
            arrayList.addAll(arrayList2);
        }
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(arrayList, null, null, 6, null));
        return TuplesKt.m28425to(listOf, m104653c(linkedHashMap));
    }

    /* renamed from: b */
    public final C2637G6 m104654b(boolean z) {
        int i = C31932Bj4.item_preload_v2_autoreload_section;
        String string = this.f12563a.getString(C45871nl4.auto_reload_off_description);
        String string2 = this.f12563a.getString(C45871nl4.auto_reload_on_description);
        Boolean valueOf = Boolean.valueOf(z);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.auto_reload_on_description)");
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.auto_reload_off_description)");
        return new C2637G6(new C0292As(valueOf, string2, string), i, false, 4, null);
    }

    /* renamed from: c */
    public final List<String> m104653c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getValue() + entry.getKey());
        }
        return arrayList;
    }

    /* renamed from: d */
    public final C2637G6 m104652d() {
        return new C2637G6(null, C31932Bj4.item_autoreload_v2_title, false, 4, null);
    }
}
