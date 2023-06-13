package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: hw4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42423hw4 {

    /* renamed from: a */
    public final Map f86215a = new HashMap();

    @KeepForSdk
    /* renamed from: hw4$a */
    /* loaded from: classes6.dex */
    public static class C22853a {

        /* renamed from: a */
        public final Class f86216a;

        /* renamed from: b */
        public final X94 f86217b;

        @KeepForSdk
        public <RemoteT extends AbstractC41830gw4> C22853a(Class<RemoteT> cls, X94<Object> x94) {
            this.f86216a = cls;
            this.f86217b = x94;
        }

        /* renamed from: a */
        public final X94 m35458a() {
            return this.f86217b;
        }

        /* renamed from: b */
        public final Class m35457b() {
            return this.f86216a;
        }
    }

    @KeepForSdk
    public C42423hw4(Set<C22853a> set) {
        for (C22853a c22853a : set) {
            this.f86215a.put(c22853a.m35457b(), c22853a.m35458a());
        }
    }
}
