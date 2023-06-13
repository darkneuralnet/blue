package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC29414v5;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000b2%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0016"}, m28432d2 = {"Lx5;", "Lv5;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", C17296a.f69688o, "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lv5$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lv5$a;", "", "resultCode", "intent", "c", "<init>", "()V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
/* renamed from: x5 */
/* loaded from: classes.dex */
public final class C30036x5 extends AbstractC29414v5<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C30037a f117081a = new C30037a(null);

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, m28432d2 = {"Lx5$a;", "", "", "", "input", "Landroid/content/Intent;", C17296a.f69688o, "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: x5$a */
    /* loaded from: classes.dex */
    public static final class C30037a {
        public /* synthetic */ C30037a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m5869a(String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private C30037a() {
        }
    }

    @Override // p000.AbstractC29414v5
    /* renamed from: a */
    public Intent createIntent(Context context, String[] input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return f117081a.m5869a(input);
    }

    @Override // p000.AbstractC29414v5
    /* renamed from: b */
    public AbstractC29414v5.C29415a<Map<String, Boolean>> getSynchronousResult(Context context, String[] input) {
        boolean z;
        int mapCapacity;
        int coerceAtLeast;
        boolean z2;
        Map emptyMap;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z3 = true;
        if (input.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            return new AbstractC29414v5.C29415a<>(emptyMap);
        }
        int length = input.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (NA0.m94303a(context, input[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (z3) {
            mapCapacity = MapsKt__MapsJVMKt.mapCapacity(input.length);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
            for (String str : input) {
                Pair m28425to = TuplesKt.m28425to(str, Boolean.TRUE);
                linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
            }
            return new AbstractC29414v5.C29415a<>(linkedHashMap);
        }
        return null;
    }

    @Override // p000.AbstractC29414v5
    /* renamed from: c */
    public Map<String, Boolean> parseResult(int i, Intent intent) {
        Map<String, Boolean> emptyMap;
        List filterNotNull;
        List zip;
        Map<String, Boolean> map;
        boolean z;
        Map<String, Boolean> emptyMap2;
        Map<String, Boolean> emptyMap3;
        if (i != -1) {
            emptyMap3 = MapsKt__MapsKt.emptyMap();
            return emptyMap3;
        } else if (intent == null) {
            emptyMap2 = MapsKt__MapsKt.emptyMap();
            return emptyMap2;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                filterNotNull = ArraysKt___ArraysKt.filterNotNull(stringArrayExtra);
                zip = CollectionsKt___CollectionsKt.zip(filterNotNull, arrayList);
                map = MapsKt__MapsKt.toMap(zip);
                return map;
            }
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
    }
}
