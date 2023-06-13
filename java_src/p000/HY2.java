package p000;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import p000.FY2;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 W2\u00020\u0001:\u0002\u001a\bB\u000f\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\bS\u0010MB\u0019\b\u0016\u0012\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000T¢\u0006\u0004\bS\u0010VJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J\u0014\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0017J\u0018\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\u0013\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010!\u001a\u00020\u0012H\u0016R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R.\u0010-\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R$\u00106\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0006078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00140:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R,\u0010B\u001a\u00020\u00122\b\b\u0001\u0010B\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR.\u0010I\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\"\u001a\u0004\bK\u0010$\"\u0004\bL\u0010MR\u001d\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180N8F¢\u0006\u0006\u001a\u0004\bJ\u0010OR\u0014\u0010R\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010$¨\u0006X"}, m28432d2 = {"LHY2;", "", "", "uriPattern", "", "c", "LFY2;", "navDeepLink", "b", "LGY2;", "navDeepLinkRequest", "LHY2$b;", "x", "previousDestination", "", "f", "", "E", "", "actionId", "LxY2;", "action", "y", "argumentName", "LyY2;", "argument", C17296a.f69688o, "Landroid/os/Bundle;", "args", "e", "toString", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "navigatorName", "LJY2;", "<set-?>", "LJY2;", "v", "()LJY2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(LJY2;)V", "parent", DateTokenConverter.CONVERTER_KEY, "idName", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "A", "(Ljava/lang/CharSequence;)V", "label", "", "Ljava/util/List;", "deepLinks", "LLN5;", "g", "LLN5;", "actions", "", "h", "Ljava/util/Map;", "_arguments", "id", "i", "I", "s", "()I", "z", "(I)V", "route", "j", "w", "D", "(Ljava/lang/String;)V", "", "()Ljava/util/Map;", "arguments", "o", "displayName", "<init>", "Ld13;", "navigator", "(Ld13;)V", "k", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: HY2 */
/* loaded from: classes.dex */
public class HY2 {

    /* renamed from: k */
    public static final C3158a f13508k = new C3158a(null);

    /* renamed from: l */
    public static final Map<String, Class<?>> f13509l = new LinkedHashMap();

    /* renamed from: b */
    public final String f13510b;

    /* renamed from: c */
    public JY2 f13511c;

    /* renamed from: d */
    public String f13512d;

    /* renamed from: e */
    public CharSequence f13513e;

    /* renamed from: f */
    public final List<FY2> f13514f;

    /* renamed from: g */
    public final LN5<C51669xY2> f13515g;

    /* renamed from: h */
    public Map<String, C52262yY2> f13516h;

    /* renamed from: i */
    public int f13517i;

    /* renamed from: j */
    public String f13518j;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007R$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000b*\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LHY2$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "id", "", "b", "route", C17296a.f69688o, "LHY2;", "Lkotlin/sequences/Sequence;", "c", "(LHY2;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(LHY2;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: HY2$a */
    /* loaded from: classes.dex */
    public static final class C3158a {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHY2;", "it", C17296a.f69688o, "(LHY2;)LHY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: HY2$a$a */
        /* loaded from: classes.dex */
        public static final class C3159a extends Lambda implements Function1<HY2, HY2> {

            /* renamed from: g */
            public static final C3159a f13519g = new C3159a();

            public C3159a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final HY2 invoke(HY2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.m103772v();
            }
        }

        public /* synthetic */ C3158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m103768a(String str) {
            if (str != null) {
                return "android-app://androidx.navigation/" + str;
            }
            return "";
        }

        @JvmStatic
        /* renamed from: b */
        public final String m103767b(Context context, int i) {
            String valueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                valueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        /* renamed from: c */
        public final Sequence<HY2> m103766c(HY2 hy2) {
            Intrinsics.checkNotNullParameter(hy2, "<this>");
            return SequencesKt.generateSequence(hy2, C3159a.f13519g);
        }

        private C3158a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LHY2$b;", "", LegacyRepairType.OTHER_KEY, "", C17296a.f69688o, "LHY2;", "b", "LHY2;", "()LHY2;", "destination", "Landroid/os/Bundle;", "c", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "matchingArgs", "", DateTokenConverter.CONVERTER_KEY, "Z", "isExactDeepLink", "e", "hasMatchingAction", "f", "I", "mimeTypeMatchLevel", "<init>", "(LHY2;Landroid/os/Bundle;ZZI)V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: HY2$b */
    /* loaded from: classes.dex */
    public static final class C3160b implements Comparable<C3160b> {

        /* renamed from: b */
        public final HY2 f13520b;

        /* renamed from: c */
        public final Bundle f13521c;

        /* renamed from: d */
        public final boolean f13522d;

        /* renamed from: e */
        public final boolean f13523e;

        /* renamed from: f */
        public final int f13524f;

        public C3160b(HY2 destination, Bundle bundle, boolean z, boolean z2, int i) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f13520b = destination;
            this.f13521c = bundle;
            this.f13522d = z;
            this.f13523e = z2;
            this.f13524f = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C3160b other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f13522d;
            if (z && !other.f13522d) {
                return 1;
            }
            if (!z && other.f13522d) {
                return -1;
            }
            Bundle bundle = this.f13521c;
            if (bundle != null && other.f13521c == null) {
                return 1;
            }
            if (bundle == null && other.f13521c != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f13521c;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f13523e;
            if (z2 && !other.f13523e) {
                return 1;
            }
            if (!z2 && other.f13523e) {
                return -1;
            }
            return this.f13524f - other.f13524f;
        }

        /* renamed from: b */
        public final HY2 m103763b() {
            return this.f13520b;
        }

        /* renamed from: c */
        public final Bundle m103762c() {
            return this.f13521c;
        }
    }

    public HY2(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f13510b = navigatorName;
        this.f13514f = new ArrayList();
        this.f13515g = new LN5<>();
        this.f13516h = new LinkedHashMap();
    }

    /* renamed from: h */
    public static /* synthetic */ int[] m103776h(HY2 hy2, HY2 hy22, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                hy22 = null;
            }
            return hy2.m103777f(hy22);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    /* renamed from: A */
    public final void m103784A(CharSequence charSequence) {
        this.f13513e = charSequence;
    }

    /* renamed from: C */
    public final void m103783C(JY2 jy2) {
        this.f13511c = jy2;
    }

    /* renamed from: D */
    public final void m103782D(String str) {
        Object obj;
        if (str == null) {
            m103769z(0);
        } else if (!StringsKt.isBlank(str)) {
            String m103768a = f13508k.m103768a(str);
            m103769z(m103768a.hashCode());
            m103779c(m103768a);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List<FY2> list = this.f13514f;
        List<FY2> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((FY2) obj).m106985k(), f13508k.m103768a(this.f13518j))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(list2).remove(obj);
        this.f13518j = str;
    }

    /* renamed from: E */
    public boolean mo21859E() {
        return true;
    }

    /* renamed from: a */
    public final void m103781a(String argumentName, C52262yY2 argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f13516h.put(argumentName, argument);
    }

    /* renamed from: b */
    public final void m103780b(FY2 navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        Map<String, C52262yY2> m103775j = m103775j();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, C52262yY2>> it = m103775j.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, C52262yY2> next = it.next();
            C52262yY2 value = next.getValue();
            if ((value.m3338c() || value.m3339b()) ? false : false) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!navDeepLink.m106991e().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f13514f.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.m106985k() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    /* renamed from: c */
    public final void m103779c(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        m103780b(new FY2.C2348a().m106981b(uriPattern).m106982a());
    }

    /* renamed from: e */
    public final Bundle m103778e(Bundle bundle) {
        boolean z;
        if (bundle == null) {
            Map<String, C52262yY2> map = this.f13516h;
            if (map != null && !map.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, C52262yY2> entry : this.f13516h.entrySet()) {
            entry.getValue().m3337d(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, C52262yY2> entry2 : this.f13516h.entrySet()) {
                String key = entry2.getKey();
                C52262yY2 value = entry2.getValue();
                if (!value.m3336e(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.m3340a().mo78184b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (obj == null || !(obj instanceof HY2)) {
            return false;
        }
        HY2 hy2 = (HY2) obj;
        if (CollectionsKt.intersect(this.f13514f, hy2.f13514f).size() == this.f13514f.size()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f13515g.size() == hy2.f13515g.size()) {
            Iterator it = SequencesKt.asSequence(MN5.m95368a(this.f13515g)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!hy2.f13515g.m96985h((C51669xY2) it.next())) {
                        z8 = false;
                        break;
                    }
                } else {
                    z8 = true;
                    break;
                }
            }
            if (z8) {
                Iterator it2 = SequencesKt.asSequence(MN5.m95368a(hy2.f13515g)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!this.f13515g.m96985h((C51669xY2) it2.next())) {
                            z9 = false;
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                if (z9) {
                    z2 = true;
                    if (m103775j().size() == hy2.m103775j().size()) {
                        Iterator it3 = MapsKt.asSequence(m103775j()).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                if (hy2.m103775j().containsKey(entry.getKey()) && Intrinsics.areEqual(hy2.m103775j().get(entry.getKey()), entry.getValue())) {
                                    z7 = true;
                                    continue;
                                } else {
                                    z7 = false;
                                    continue;
                                }
                                if (!z7) {
                                    z4 = false;
                                    break;
                                }
                            } else {
                                z4 = true;
                                break;
                            }
                        }
                        if (z4) {
                            Iterator it4 = MapsKt.asSequence(hy2.m103775j()).iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it4.next();
                                    if (m103775j().containsKey(entry2.getKey()) && Intrinsics.areEqual(m103775j().get(entry2.getKey()), entry2.getValue())) {
                                        z6 = true;
                                        continue;
                                    } else {
                                        z6 = false;
                                        continue;
                                    }
                                    if (!z6) {
                                        z5 = false;
                                        break;
                                    }
                                } else {
                                    z5 = true;
                                    break;
                                }
                            }
                            if (z5) {
                                z3 = true;
                                if (this.f13517i != hy2.f13517i || !Intrinsics.areEqual(this.f13518j, hy2.f13518j) || !z || !z2 || !z3) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                    z3 = false;
                    return this.f13517i != hy2.f13517i ? false : false;
                }
            }
        }
        z2 = false;
        if (m103775j().size() == hy2.m103775j().size()) {
        }
        z3 = false;
        if (this.f13517i != hy2.f13517i) {
        }
    }

    @JvmOverloads
    /* renamed from: f */
    public final int[] m103777f(HY2 hy2) {
        JY2 jy2;
        ArrayDeque arrayDeque = new ArrayDeque();
        JY2 jy22 = this;
        while (true) {
            Intrinsics.checkNotNull(jy22);
            JY2 jy23 = jy22.f13511c;
            if (hy2 != null) {
                jy2 = hy2.f13511c;
            } else {
                jy2 = null;
            }
            if (jy2 != null) {
                JY2 jy24 = hy2.f13511c;
                Intrinsics.checkNotNull(jy24);
                if (jy24.m100259H(jy22.f13517i) == jy22) {
                    arrayDeque.addFirst(jy22);
                    break;
                }
            }
            if (jy23 == null || jy23.m100253N() != jy22.f13517i) {
                arrayDeque.addFirst(jy22);
            }
            if (Intrinsics.areEqual(jy23, hy2) || jy23 == null) {
                break;
            }
            jy22 = jy23;
        }
        List<HY2> list = CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (HY2 hy22 : list) {
            arrayList.add(Integer.valueOf(hy22.f13517i));
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Set<String> keySet;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f13517i * 31;
        String str = this.f13518j;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i8 + i;
        for (FY2 fy2 : this.f13514f) {
            int i10 = i9 * 31;
            String m106985k = fy2.m106985k();
            if (m106985k != null) {
                i5 = m106985k.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 31;
            String m106992d = fy2.m106992d();
            if (m106992d != null) {
                i6 = m106992d.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            String m106989g = fy2.m106989g();
            if (m106989g != null) {
                i7 = m106989g.hashCode();
            } else {
                i7 = 0;
            }
            i9 = i12 + i7;
        }
        Iterator m95368a = MN5.m95368a(this.f13515g);
        while (m95368a.hasNext()) {
            C51669xY2 c51669xY2 = (C51669xY2) m95368a.next();
            int m5028b = ((i9 * 31) + c51669xY2.m5028b()) * 31;
            TY2 m5027c = c51669xY2.m5027c();
            if (m5027c != null) {
                i3 = m5027c.hashCode();
            } else {
                i3 = 0;
            }
            i9 = m5028b + i3;
            Bundle m5029a = c51669xY2.m5029a();
            if (m5029a != null && (keySet = m5029a.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i13 = i9 * 31;
                    Bundle m5029a2 = c51669xY2.m5029a();
                    Intrinsics.checkNotNull(m5029a2);
                    Object obj = m5029a2.get(str2);
                    if (obj != null) {
                        i4 = obj.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i9 = i13 + i4;
                }
            }
        }
        for (String str3 : m103775j().keySet()) {
            int hashCode = ((i9 * 31) + str3.hashCode()) * 31;
            C52262yY2 c52262yY2 = m103775j().get(str3);
            if (c52262yY2 != null) {
                i2 = c52262yY2.hashCode();
            } else {
                i2 = 0;
            }
            i9 = hashCode + i2;
        }
        return i9;
    }

    /* renamed from: j */
    public final Map<String, C52262yY2> m103775j() {
        return MapsKt.toMap(this.f13516h);
    }

    /* renamed from: o */
    public String mo100247o() {
        String str = this.f13512d;
        return str == null ? String.valueOf(this.f13517i) : str;
    }

    /* renamed from: s */
    public final int m103774s() {
        return this.f13517i;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f13512d;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f13517i));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f13518j;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(" route=");
            sb.append(this.f13518j);
        }
        if (this.f13513e != null) {
            sb.append(" label=");
            sb.append(this.f13513e);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final String m103773u() {
        return this.f13510b;
    }

    /* renamed from: v */
    public final JY2 m103772v() {
        return this.f13511c;
    }

    /* renamed from: w */
    public final String m103771w() {
        return this.f13518j;
    }

    /* renamed from: x */
    public C3160b mo100246x(GY2 navDeepLinkRequest) {
        Bundle bundle;
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f13514f.isEmpty()) {
            return null;
        }
        C3160b c3160b = null;
        for (FY2 fy2 : this.f13514f) {
            Uri m105012c = navDeepLinkRequest.m105012c();
            if (m105012c != null) {
                bundle = fy2.m106990f(m105012c, m103775j());
            } else {
                bundle = null;
            }
            String m105014a = navDeepLinkRequest.m105014a();
            if (m105014a != null && Intrinsics.areEqual(m105014a, fy2.m106992d())) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            String m105013b = navDeepLinkRequest.m105013b();
            if (m105013b != null) {
                i = fy2.m106988h(m105013b);
            } else {
                i = -1;
            }
            if (bundle != null || z2 || i > -1) {
                C3160b c3160b2 = new C3160b(this, bundle, fy2.m106984l(), z2, i);
                if (c3160b == null || c3160b2.compareTo(c3160b) > 0) {
                    c3160b = c3160b2;
                }
            }
        }
        return c3160b;
    }

    /* renamed from: y */
    public final void m103770y(int i, C51669xY2 action) {
        boolean z;
        Intrinsics.checkNotNullParameter(action, "action");
        if (mo21859E()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f13515g.m96978p(i, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* renamed from: z */
    public final void m103769z(int i) {
        this.f13517i = i;
        this.f13512d = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HY2(AbstractC39507d13<? extends HY2> navigator) {
        this(C42471i13.f86281b.m35379a(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
