package p000;

import android.net.Uri;
import android.os.Bundle;
/* renamed from: w81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50839w81 {

    /* renamed from: a */
    public final Bundle f115402a;

    /* renamed from: w81$a */
    /* loaded from: classes6.dex */
    public static final class C29785a {

        /* renamed from: a */
        public final Bundle f115403a = new Bundle();

        /* renamed from: a */
        public C50839w81 m7365a() {
            return new C50839w81(this.f115403a);
        }

        /* renamed from: b */
        public C29785a m7364b(String str) {
            this.f115403a.putString("sd", str);
            return this;
        }

        /* renamed from: c */
        public C29785a m7363c(Uri uri) {
            this.f115403a.putParcelable("si", uri);
            return this;
        }

        /* renamed from: d */
        public C29785a m7362d(String str) {
            this.f115403a.putString("st", str);
            return this;
        }
    }

    public C50839w81(Bundle bundle) {
        this.f115402a = bundle;
    }
}
