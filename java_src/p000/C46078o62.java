package p000;

import android.content.Context;
import java.io.File;
import p000.G41;
/* renamed from: o62  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46078o62 extends G41 {

    /* renamed from: o62$a */
    /* loaded from: classes5.dex */
    public class C26818a implements G41.InterfaceC2625a {

        /* renamed from: a */
        public final /* synthetic */ Context f101375a;

        /* renamed from: b */
        public final /* synthetic */ String f101376b;

        public C26818a(Context context, String str) {
            this.f101375a = context;
            this.f101376b = str;
        }

        @Override // p000.G41.InterfaceC2625a
        /* renamed from: a */
        public File mo21782a() {
            File cacheDir = this.f101375a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f101376b != null) {
                return new File(cacheDir, this.f101376b);
            }
            return cacheDir;
        }
    }

    public C46078o62(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C46078o62(Context context, String str, long j) {
        super(new C26818a(context, str), j);
    }
}
