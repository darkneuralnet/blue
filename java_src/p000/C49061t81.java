package p000;

import android.os.Bundle;
/* renamed from: t81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49061t81 {

    /* renamed from: a */
    public final Bundle f109913a;

    /* renamed from: t81$a */
    /* loaded from: classes6.dex */
    public static final class C28534a {

        /* renamed from: a */
        public final Bundle f109914a;

        public C28534a() {
            if (C31722Am1.m115292k() != null) {
                Bundle bundle = new Bundle();
                this.f109914a = bundle;
                bundle.putString("apn", C31722Am1.m115292k().m115293j().getPackageName());
                return;
            }
            throw new IllegalStateException("FirebaseApp not initialized.");
        }

        /* renamed from: a */
        public C49061t81 m13015a() {
            return new C49061t81(this.f109914a);
        }

        /* renamed from: b */
        public C28534a m13014b(int i) {
            this.f109914a.putInt("amv", i);
            return this;
        }
    }

    public C49061t81(Bundle bundle) {
        this.f109913a = bundle;
    }
}
