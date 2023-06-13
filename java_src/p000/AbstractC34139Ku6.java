package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import java.util.Set;
@KeepForSdk
/* renamed from: Ku6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34139Ku6 {

    @KeepForSdk
    /* renamed from: Ku6$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC4613a {
        @KeepForSdk
        /* renamed from: a */
        public abstract int mo2316a();

        @KeepForSdk
        /* renamed from: b */
        public abstract int mo2315b();
    }

    /* renamed from: e */
    public static AbstractC34139Ku6 m98184e(MlKitException mlKitException) {
        return new C30337xu(false, mlKitException, AbstractC45127mV8.m25479u());
    }

    /* renamed from: f */
    public static AbstractC34139Ku6 m98183f() {
        return new C30337xu(true, null, AbstractC45127mV8.m25479u());
    }

    @KeepForSdk
    /* renamed from: a */
    public abstract Set<AbstractC4613a> mo4502a();

    @KeepForSdk
    /* renamed from: b */
    public abstract MlKitException mo4501b();

    @KeepForSdk
    /* renamed from: c */
    public abstract boolean mo4500c();

    @KeepForSdk
    /* renamed from: d */
    public void m98185d() throws MlKitException {
        MlKitException mo4501b = mo4501b();
        if (mo4501b == null) {
            return;
        }
        throw mo4501b;
    }
}
