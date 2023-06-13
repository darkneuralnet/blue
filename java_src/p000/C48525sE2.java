package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
/* renamed from: sE2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48525sE2 implements InterfaceC37777a80 {

    /* renamed from: a */
    public final LruCache<String, C28247b> f108487a;

    /* renamed from: sE2$a */
    /* loaded from: classes6.dex */
    public class C28246a extends LruCache<String, C28247b> {
        public C28246a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, C28247b c28247b) {
            return c28247b.f108490b;
        }
    }

    /* renamed from: sE2$b */
    /* loaded from: classes6.dex */
    public static final class C28247b {

        /* renamed from: a */
        public final Bitmap f108489a;

        /* renamed from: b */
        public final int f108490b;

        public C28247b(Bitmap bitmap, int i) {
            this.f108489a = bitmap;
            this.f108490b = i;
        }
    }

    public C48525sE2(Context context) {
        this(C32861Fi6.m106710b(context));
    }

    @Override // p000.InterfaceC37777a80
    /* renamed from: a */
    public int mo14517a() {
        return this.f108487a.maxSize();
    }

    @Override // p000.InterfaceC37777a80
    public Bitmap get(String str) {
        C28247b c28247b = this.f108487a.get(str);
        if (c28247b != null) {
            return c28247b.f108489a;
        }
        return null;
    }

    @Override // p000.InterfaceC37777a80
    public void set(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int m106703i = C32861Fi6.m106703i(bitmap);
            if (m106703i > mo14517a()) {
                this.f108487a.remove(str);
                return;
            } else {
                this.f108487a.put(str, new C28247b(bitmap, m106703i));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // p000.InterfaceC37777a80
    public int size() {
        return this.f108487a.size();
    }

    public C48525sE2(int i) {
        this.f108487a = new C28246a(i);
    }
}
