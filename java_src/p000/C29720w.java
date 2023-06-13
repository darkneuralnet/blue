package p000;

import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C46068o52;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lw;", "", "", C17296a.f69688o, "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: w */
/* loaded from: classes5.dex */
public final class C29720w {

    /* renamed from: b */
    public static final C29720w f115104b = new C29720w();

    /* renamed from: a */
    public static final AtomicBoolean f115103a = new AtomicBoolean(false);

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: w$a */
    /* loaded from: classes5.dex */
    public static final class C29721a implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ List f115105a;

        public C29721a(List list) {
            this.f115105a = list;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            JSONObject m78702d;
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.m78704b() == null && (m78702d = response.m78702d()) != null && m78702d.getBoolean("success")) {
                    for (C46068o52 c46068o52 : this.f115105a) {
                        c46068o52.m21827a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lo52;", "kotlin.jvm.PlatformType", "o1", "o2", "", C17296a.f69688o, "(Lo52;Lo52;)I"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: w$b */
    /* loaded from: classes5.dex */
    public static final class C29722b<T> implements Comparator<C46068o52> {

        /* renamed from: b */
        public static final C29722b f115106b = new C29722b();

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C46068o52 c46068o52, C46068o52 o2) {
            Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return c46068o52.m21826b(o2);
        }
    }

    private C29720w() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m7611a() {
        synchronized (C29720w.class) {
            if (TD0.m84203d(C29720w.class)) {
                return;
            }
            if (f115103a.getAndSet(true)) {
                return;
            }
            if (C17216a.m52736j()) {
                m7610b();
            }
            C29348v.m9409b();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m7610b() {
        List sortedWith;
        IntRange until;
        if (TD0.m84203d(C29720w.class)) {
            return;
        }
        try {
            if (C52364yi6.m2862P()) {
                return;
            }
            File[] m13145h = C49032t52.m13145h();
            ArrayList arrayList = new ArrayList(m13145h.length);
            for (File file : m13145h) {
                arrayList.add(C46068o52.C26813a.m21817d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C46068o52) obj).m21822f()) {
                    arrayList2.add(obj);
                }
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, C29722b.f115106b);
            JSONArray jSONArray = new JSONArray();
            until = RangesKt___RangesKt.until(0, Math.min(sortedWith.size(), 5));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it).nextInt()));
            }
            C49032t52.m13141l("anr_reports", jSONArray, new C29721a(sortedWith));
        } catch (Throwable th) {
            TD0.m84205b(th, C29720w.class);
        }
    }
}
