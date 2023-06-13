package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"Lng1;", "", "", "msg", "", "c", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "", "Ljava/io/File;", "b", "()[Ljava/io/File;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: ng1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45818ng1 {

    /* renamed from: a */
    public static final C45818ng1 f100301a = new C45818ng1();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "dir", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: ng1$a */
    /* loaded from: classes5.dex */
    public static final class C26568a implements FilenameFilter {

        /* renamed from: a */
        public static final C26568a f100302a = new C26568a();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String name) {
            Intrinsics.checkNotNullExpressionValue(name, "name");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return new Regex(format).matches(name);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lmg1;", "kotlin.jvm.PlatformType", "o1", "o2", "", C17296a.f69688o, "(Lmg1;Lmg1;)I"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: ng1$b */
    /* loaded from: classes5.dex */
    public static final class C26569b<T> implements Comparator<C45225mg1> {

        /* renamed from: b */
        public static final C26569b f100303b = new C26569b();

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(C45225mg1 c45225mg1, C45225mg1 o2) {
            Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return c45225mg1.m25186b(o2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: ng1$c */
    /* loaded from: classes5.dex */
    public static final class C26570c implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f100304a;

        public C26570c(ArrayList arrayList) {
            this.f100304a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            JSONObject m78702d;
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.m78704b() == null && (m78702d = response.m78702d()) != null && m78702d.getBoolean("success")) {
                    for (C45225mg1 c45225mg1 : this.f100304a) {
                        c45225mg1.m25187a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C45818ng1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m23338a() {
        if (C17216a.m52736j()) {
            m23335d();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final File[] m23337b() {
        File m13150c = C49032t52.m13150c();
        if (m13150c != null) {
            File[] listFiles = m13150c.listFiles(C26568a.f100302a);
            Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
            return listFiles;
        }
        return new File[0];
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m23336c(String str) {
        try {
            new C45225mg1(str).m25183e();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m23335d() {
        if (C52364yi6.m2862P()) {
            return;
        }
        File[] m23337b = m23337b();
        ArrayList arrayList = new ArrayList();
        for (File file : m23337b) {
            C45225mg1 c45225mg1 = new C45225mg1(file);
            if (c45225mg1.m25184d()) {
                arrayList.add(c45225mg1);
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, C26569b.f100303b);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        C49032t52.m13141l("error_reports", jSONArray, new C26570c(arrayList));
    }
}
