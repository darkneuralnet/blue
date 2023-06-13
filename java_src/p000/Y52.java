package p000;

import android.util.SparseArray;
import zendesk.belvedere.C31129i;
import zendesk.belvedere.MediaResult;
/* renamed from: Y52 */
/* loaded from: classes8.dex */
public class Y52 {

    /* renamed from: a */
    public SparseArray<MediaResult> f44508a = new SparseArray<>();

    /* renamed from: a */
    public void m75760a(int i) {
        synchronized (this) {
            this.f44508a.remove(i);
        }
    }

    /* renamed from: b */
    public MediaResult m75759b(int i) {
        MediaResult mediaResult;
        synchronized (this) {
            mediaResult = this.f44508a.get(i);
        }
        return mediaResult;
    }

    /* renamed from: c */
    public final int m75758c() {
        for (int i = 1600; i < 1650; i++) {
            if (this.f44508a.get(i) == null) {
                return i;
            }
        }
        C31129i.m671a("Belvedere", "No slot free. Clearing registry.");
        this.f44508a.clear();
        return m75758c();
    }

    /* renamed from: d */
    public int m75757d() {
        int m75758c;
        synchronized (this) {
            m75758c = m75758c();
            this.f44508a.put(m75758c, MediaResult.m786b());
        }
        return m75758c;
    }

    /* renamed from: e */
    public void m75756e(int i, MediaResult mediaResult) {
        synchronized (this) {
            this.f44508a.put(i, mediaResult);
        }
    }
}
