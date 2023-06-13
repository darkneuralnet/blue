package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;
@KeepForSdk
/* renamed from: Ih1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33549Ih1 {

    /* renamed from: a */
    public final X94 f16053a;

    public C33549Ih1(X94 x94) {
        this.f16053a = x94;
    }

    @KeepForSdk
    /* renamed from: a */
    public Executor m101805a(Executor executor) {
        return executor != null ? executor : (Executor) this.f16053a.get();
    }
}
