package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
/* renamed from: JU8 */
/* loaded from: classes6.dex */
public final class JU8 {

    /* renamed from: a */
    public C32206Cn8 f17696a;

    /* renamed from: b */
    public List f17697b;

    /* renamed from: c */
    public List f17698c;

    /* renamed from: d */
    public long f17699d;

    /* renamed from: e */
    public final /* synthetic */ C42162hV8 f17700e;

    public /* synthetic */ JU8(C42162hV8 c42162hV8, C47490qU8 c47490qU8) {
        this.f17700e = c42162hV8;
    }

    /* renamed from: b */
    public static final long m100320b(C47051pk8 c47051pk8) {
        return ((c47051pk8.m18862E() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m100321a(long j, C47051pk8 c47051pk8) {
        Preconditions.checkNotNull(c47051pk8);
        if (this.f17698c == null) {
            this.f17698c = new ArrayList();
        }
        if (this.f17697b == null) {
            this.f17697b = new ArrayList();
        }
        if (!this.f17698c.isEmpty() && m100320b((C47051pk8) this.f17698c.get(0)) != m100320b(c47051pk8)) {
            return false;
        }
        long mo16625m = this.f17699d + c47051pk8.mo16625m();
        this.f17700e.m36302U();
        if (mo16625m >= Math.max(0, ((Integer) C37795a98.f49979k.m97658a(null)).intValue())) {
            return false;
        }
        this.f17699d = mo16625m;
        this.f17698c.add(c47051pk8);
        this.f17697b.add(Long.valueOf(j));
        int size = this.f17698c.size();
        this.f17700e.m36302U();
        if (size >= Math.max(1, ((Integer) C37795a98.f49981l.m97658a(null)).intValue())) {
            return false;
        }
        return true;
    }
}
