package p000;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LMg3;", "", "", "b", "", NamedConstantsKt.APPLICATION_ID, "preferencesName", "", DateTokenConverter.CONVERTER_KEY, "LSi;", "event", "c", C17296a.f69688o, "", "Ljava/util/Set;", "ALLOWED_IMPLICIT_EVENTS", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Mg3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34478Mg3 {

    /* renamed from: a */
    public static final Set<String> f23390a;

    /* renamed from: b */
    public static final C34478Mg3 f23391b = new C34478Mg3();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Mg3$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC5342a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f23392b;

        /* renamed from: c */
        public final /* synthetic */ C7508Si f23393c;

        public RunnableC5342a(String str, C7508Si c7508Si) {
            this.f23392b = str;
            this.f23393c = c7508Si;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List listOf;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                String str = this.f23392b;
                listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f23393c);
                C43609jw4.m29719c(str, listOf);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Mg3$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC5343b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Context f23394b;

        /* renamed from: c */
        public final /* synthetic */ String f23395c;

        /* renamed from: d */
        public final /* synthetic */ String f23396d;

        public RunnableC5343b(Context context, String str, String str2) {
            this.f23394b = context;
            this.f23395c = str;
            this.f23396d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f23394b.getSharedPreferences(this.f23395c, 0);
                String str = this.f23396d + "pingForOnDevice";
                if (sharedPreferences.getLong(str, 0L) == 0) {
                    C43609jw4.m29717e(this.f23396d);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str, System.currentTimeMillis());
                    edit.apply();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});
        f23390a = of;
    }

    private C34478Mg3() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m95051b() {
        boolean z;
        if (TD0.m84203d(C34478Mg3.class)) {
            return false;
        }
        try {
            if (!C17216a.m52727s(C17216a.m52741e()) && !C52364yi6.m2862P()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (!C43609jw4.m29720b()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, C34478Mg3.class);
            return false;
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m95050c(String applicationId, C7508Si event) {
        if (TD0.m84203d(C34478Mg3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f23391b.m95052a(event)) {
                C17216a.m52731o().execute(new RunnableC5342a(applicationId, event));
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C34478Mg3.class);
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m95049d(String str, String str2) {
        if (TD0.m84203d(C34478Mg3.class)) {
            return;
        }
        try {
            Context m52741e = C17216a.m52741e();
            if (m52741e != null && str != null && str2 != null) {
                C17216a.m52731o().execute(new RunnableC5343b(m52741e, str2, str));
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C34478Mg3.class);
        }
    }

    /* renamed from: a */
    public final boolean m95052a(C7508Si c7508Si) {
        boolean z;
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            if (c7508Si.m85020g() && f23390a.contains(c7508Si.getName())) {
                z = true;
            } else {
                z = false;
            }
            if (!(!c7508Si.m85020g()) && !z) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }
}
