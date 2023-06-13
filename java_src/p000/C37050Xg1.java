package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C32172Ck1;
import p000.C46068o52;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, m28432d2 = {"LXg1;", "", "", "c", "", C17296a.f69688o, "", "e", "b", DateTokenConverter.CONVERTER_KEY, "Z", "enabled", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Xg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37050Xg1 {

    /* renamed from: a */
    public static boolean f43547a;

    /* renamed from: b */
    public static final C37050Xg1 f43548b = new C37050Xg1();

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Xg1$a */
    /* loaded from: classes5.dex */
    public static final class C9438a implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ C46068o52 f43549a;

        public C9438a(C46068o52 c46068o52) {
            this.f43549a = c46068o52;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            JSONObject m78702d;
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.m78704b() == null && (m78702d = response.m78702d()) != null && m78702d.getBoolean("success")) {
                    this.f43549a.m21827a();
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C37050Xg1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m76707a() {
        f43547a = true;
        if (C17216a.m52736j()) {
            f43548b.m76704d();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m76706b(Throwable th) {
        if (f43547a && !m76705c() && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            for (StackTraceElement it : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                String className = it.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "it.className");
                C32172Ck1.EnumC1165b m111757d = C32172Ck1.m111757d(className);
                if (m111757d != C32172Ck1.EnumC1165b.Unknown) {
                    C32172Ck1.m111758c(m111757d);
                    hashSet.add(m111757d.toString());
                }
            }
            if (C17216a.m52736j() && (!hashSet.isEmpty())) {
                C46068o52.C26813a.m21818c(new JSONArray((Collection) hashSet)).m21821g();
            }
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m76705c() {
        return false;
    }

    /* renamed from: d */
    public final void m76704d() {
        if (C52364yi6.m2862P()) {
            return;
        }
        File[] m13144i = C49032t52.m13144i();
        ArrayList arrayList = new ArrayList();
        for (File file : m13144i) {
            C46068o52 m21817d = C46068o52.C26813a.m21817d(file);
            if (m21817d.m21822f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", m21817d.toString());
                    GraphRequest.C17206c c17206c = GraphRequest.f69390s;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C17216a.m52740f()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    arrayList.add(c17206c.m52780x(null, format, jSONObject, new C9438a(m21817d)));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new VD1(arrayList).m80218j();
    }
}
