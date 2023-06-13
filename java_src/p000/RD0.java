package p000;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C46068o52;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0013\b\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"LRD0;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/lang/Thread;", "t", "", "e", "", "uncaughtException", C17296a.f69688o, "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: RD0 */
/* loaded from: classes5.dex */
public final class RD0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    public static RD0 f31689c;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f31691a;

    /* renamed from: d */
    public static final C7086a f31690d = new C7086a(null);

    /* renamed from: b */
    public static final String f31688b = RD0.class.getCanonicalName();

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LRD0$a;", "", "", C17296a.f69688o, "b", "", "MAX_CRASH_REPORT_NUM", "I", "", "TAG", "Ljava/lang/String;", "LRD0;", "instance", "LRD0;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: RD0$a */
    /* loaded from: classes5.dex */
    public static final class C7086a {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: RD0$a$a */
        /* loaded from: classes5.dex */
        public static final class C7087a implements GraphRequest.InterfaceC17205b {

            /* renamed from: a */
            public final /* synthetic */ List f31692a;

            public C7087a(List list) {
                this.f31692a = list;
            }

            @Override // com.facebook.GraphRequest.InterfaceC17205b
            /* renamed from: a */
            public final void mo2794a(WD1 response) {
                JSONObject m78702d;
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.m78704b() == null && (m78702d = response.m78702d()) != null && m78702d.getBoolean("success")) {
                        for (C46068o52 c46068o52 : this.f31692a) {
                            c46068o52.m21827a();
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lo52;", "kotlin.jvm.PlatformType", "o1", "o2", "", C17296a.f69688o, "(Lo52;Lo52;)I"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: RD0$a$b */
        /* loaded from: classes5.dex */
        public static final class C7088b<T> implements Comparator<C46068o52> {

            /* renamed from: b */
            public static final C7088b f31693b = new C7088b();

            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(C46068o52 c46068o52, C46068o52 o2) {
                Intrinsics.checkNotNullExpressionValue(o2, "o2");
                return c46068o52.m21826b(o2);
            }
        }

        private C7086a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final synchronized void m87146a() {
            if (C17216a.m52736j()) {
                m87145b();
            }
            if (RD0.f31689c != null) {
                Log.w(RD0.f31688b, "Already enabled!");
                return;
            }
            RD0.f31689c = new RD0(Thread.getDefaultUncaughtExceptionHandler(), null);
            Thread.setDefaultUncaughtExceptionHandler(RD0.f31689c);
        }

        /* renamed from: b */
        public final void m87145b() {
            List sortedWith;
            IntRange until;
            if (C52364yi6.m2862P()) {
                return;
            }
            File[] m13143j = C49032t52.m13143j();
            ArrayList arrayList = new ArrayList(m13143j.length);
            for (File file : m13143j) {
                arrayList.add(C46068o52.C26813a.m21817d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C46068o52) obj).m21822f()) {
                    arrayList2.add(obj);
                }
            }
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, C7088b.f31693b);
            JSONArray jSONArray = new JSONArray();
            until = RangesKt___RangesKt.until(0, Math.min(sortedWith.size(), 5));
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it).nextInt()));
            }
            C49032t52.m13141l("crash_reports", jSONArray, new C7087a(sortedWith));
        }

        public /* synthetic */ C7086a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RD0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        if (C49032t52.m13147f(e)) {
            C37050Xg1.m76706b(e);
            C46068o52.C26813a.m21819b(e, C46068o52.EnumC26815c.CrashReport).m21821g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f31691a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }

    public RD0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f31691a = uncaughtExceptionHandler;
    }
}
