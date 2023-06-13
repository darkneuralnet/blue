package p000;

import android.content.Context;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: gg9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41675gg9 {

    /* renamed from: k */
    public static final AbstractC37434Yw7 f84025k = AbstractC37434Yw7.m73954c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f84026a;

    /* renamed from: b */
    public final String f84027b;

    /* renamed from: c */
    public final We9 f84028c;

    /* renamed from: d */
    public final C37684Zy5 f84029d;

    /* renamed from: e */
    public final Task f84030e;

    /* renamed from: f */
    public final Task f84031f;

    /* renamed from: g */
    public final String f84032g;

    /* renamed from: h */
    public final int f84033h;

    /* renamed from: i */
    public final Map f84034i = new HashMap();

    /* renamed from: j */
    public final Map f84035j = new HashMap();

    public C41675gg9(Context context, final C37684Zy5 c37684Zy5, We9 we9, String str) {
        int i;
        this.f84026a = context.getPackageName();
        this.f84027b = C32216Cp0.m111503a(context);
        this.f84029d = c37684Zy5;
        this.f84028c = we9;
        Ki9.m98463a();
        this.f84032g = str;
        this.f84030e = ME2.m95480a().m95479b(new Callable() { // from class: Cf9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C41675gg9.this.m37909a();
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f84031f = m95480a.m95479b(new Callable() { // from class: Kf9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        AbstractC37434Yw7 abstractC37434Yw7 = f84025k;
        if (abstractC37434Yw7.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) abstractC37434Yw7.get(str));
        } else {
            i = -1;
        }
        this.f84033h = i;
    }

    /* renamed from: a */
    public final /* synthetic */ String m37909a() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f84032g);
    }
}
