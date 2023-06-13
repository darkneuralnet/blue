package androidx.work;

import android.content.Context;
import androidx.work.C12120a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements E22<ZC6> {

    /* renamed from: a */
    public static final String f56166a = AbstractC32056Bx2.m113270i("WrkMgrInitializer");

    @Override // p000.E22
    /* renamed from: a */
    public ZC6 create(Context context) {
        AbstractC32056Bx2.m113272e().mo113269a(f56166a, "Initializing WorkManager with default configuration.");
        ZC6.m73613i(context, new C12120a.C12122b().m65595a());
        return ZC6.m73614h(context);
    }

    @Override // p000.E22
    public List<Class<? extends E22<?>>> dependencies() {
        return Collections.emptyList();
    }
}
