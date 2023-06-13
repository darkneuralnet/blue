package p000;

import android.os.Bundle;
/* renamed from: v81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50246v81 {

    /* renamed from: a */
    public final Bundle f113581a;

    /* renamed from: v81$a */
    /* loaded from: classes6.dex */
    public static final class C29424a {

        /* renamed from: a */
        public final Bundle f113582a;

        public C29424a(String str) {
            Bundle bundle = new Bundle();
            this.f113582a = bundle;
            bundle.putString("ibi", str);
        }

        /* renamed from: a */
        public C50246v81 m9144a() {
            return new C50246v81(this.f113582a);
        }

        /* renamed from: b */
        public C29424a m9143b(String str) {
            this.f113582a.putString("isi", str);
            return this;
        }
    }

    public C50246v81(Bundle bundle) {
        this.f113581a = bundle;
    }
}
