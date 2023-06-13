package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.emoji2.text.C11581c;
import androidx.emoji2.text.C11600e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p000.C34386Lw1;
/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public class C11600e extends C11581c.AbstractC11585c {

    /* renamed from: k */
    public static final C11601a f54462k = new C11601a();

    /* renamed from: androidx.emoji2.text.e$a */
    /* loaded from: classes.dex */
    public static class C11601a {
        /* renamed from: a */
        public Typeface m67468a(Context context, C34386Lw1.C5132b c5132b) throws PackageManager.NameNotFoundException {
            return C34386Lw1.m96117a(context, null, new C34386Lw1.C5132b[]{c5132b});
        }

        /* renamed from: b */
        public C34386Lw1.C5131a m67467b(Context context, C53092zw1 c53092zw1) throws PackageManager.NameNotFoundException {
            return C34386Lw1.m96116b(context, null, c53092zw1);
        }

        /* renamed from: c */
        public void m67466c(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* renamed from: d */
        public void m67465d(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    /* loaded from: classes.dex */
    public static class C11602b implements C11581c.InterfaceC11590h {

        /* renamed from: a */
        public final Context f54463a;

        /* renamed from: b */
        public final C53092zw1 f54464b;

        /* renamed from: c */
        public final C11601a f54465c;

        /* renamed from: d */
        public final Object f54466d = new Object();

        /* renamed from: e */
        public Handler f54467e;

        /* renamed from: f */
        public Executor f54468f;

        /* renamed from: g */
        public ThreadPoolExecutor f54469g;

        /* renamed from: h */
        public AbstractC11604c f54470h;

        /* renamed from: i */
        public C11581c.AbstractC11591i f54471i;

        /* renamed from: j */
        public ContentObserver f54472j;

        /* renamed from: k */
        public Runnable f54473k;

        /* renamed from: androidx.emoji2.text.e$b$a */
        /* loaded from: classes.dex */
        public class C11603a extends ContentObserver {
            public C11603a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                C11602b.this.m67461d();
            }
        }

        public C11602b(Context context, C53092zw1 c53092zw1, C11601a c11601a) {
            HZ3.m103730h(context, "Context cannot be null");
            HZ3.m103730h(c53092zw1, "FontRequest cannot be null");
            this.f54463a = context.getApplicationContext();
            this.f54464b = c53092zw1;
            this.f54465c = c11601a;
        }

        @Override // androidx.emoji2.text.C11581c.InterfaceC11590h
        /* renamed from: a */
        public void mo67464a(C11581c.AbstractC11591i abstractC11591i) {
            HZ3.m103730h(abstractC11591i, "LoaderCallback cannot be null");
            synchronized (this.f54466d) {
                this.f54471i = abstractC11591i;
            }
            m67461d();
        }

        /* renamed from: b */
        public final void m67463b() {
            synchronized (this.f54466d) {
                this.f54471i = null;
                ContentObserver contentObserver = this.f54472j;
                if (contentObserver != null) {
                    this.f54465c.m67465d(this.f54463a, contentObserver);
                    this.f54472j = null;
                }
                Handler handler = this.f54467e;
                if (handler != null) {
                    handler.removeCallbacks(this.f54473k);
                }
                this.f54467e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f54469g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f54468f = null;
                this.f54469g = null;
            }
        }

        /* renamed from: c */
        public void m67462c() {
            synchronized (this.f54466d) {
                if (this.f54471i == null) {
                    return;
                }
                try {
                    C34386Lw1.C5132b m67460e = m67460e();
                    int m96110b = m67460e.m96110b();
                    if (m96110b == 2) {
                        synchronized (this.f54466d) {
                            AbstractC11604c abstractC11604c = this.f54470h;
                            if (abstractC11604c != null) {
                                long m67457a = abstractC11604c.m67457a();
                                if (m67457a >= 0) {
                                    m67459f(m67460e.m96108d(), m67457a);
                                    return;
                                }
                            }
                        }
                    }
                    if (m96110b == 0) {
                        C40152e66.m43277a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface m67468a = this.f54465c.m67468a(this.f54463a, m67460e);
                        ByteBuffer m8368f = C50525vc6.m8368f(this.f54463a, null, m67460e.m96108d());
                        if (m8368f != null && m67468a != null) {
                            C11605f m67455b = C11605f.m67455b(m67468a, m8368f);
                            C40152e66.m43276b();
                            synchronized (this.f54466d) {
                                C11581c.AbstractC11591i abstractC11591i = this.f54471i;
                                if (abstractC11591i != null) {
                                    abstractC11591i.mo67497b(m67455b);
                                }
                            }
                            m67463b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + m96110b + ")");
                } catch (Throwable th) {
                    synchronized (this.f54466d) {
                        C11581c.AbstractC11591i abstractC11591i2 = this.f54471i;
                        if (abstractC11591i2 != null) {
                            abstractC11591i2.mo67498a(th);
                        }
                        m67463b();
                    }
                }
            }
        }

        /* renamed from: d */
        public void m67461d() {
            synchronized (this.f54466d) {
                if (this.f54471i == null) {
                    return;
                }
                if (this.f54468f == null) {
                    ThreadPoolExecutor m2313b = C52478yu0.m2313b("emojiCompat");
                    this.f54469g = m2313b;
                    this.f54468f = m2313b;
                }
                this.f54468f.execute(new Runnable() { // from class: Aw1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11600e.C11602b.this.m67462c();
                    }
                });
            }
        }

        /* renamed from: e */
        public final C34386Lw1.C5132b m67460e() {
            try {
                C34386Lw1.C5131a m67467b = this.f54465c.m67467b(this.f54463a, this.f54464b);
                if (m67467b.m96112c() == 0) {
                    C34386Lw1.C5132b[] m96113b = m67467b.m96113b();
                    if (m96113b != null && m96113b.length != 0) {
                        return m96113b[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + m67467b.m96112c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: f */
        public final void m67459f(Uri uri, long j) {
            synchronized (this.f54466d) {
                Handler handler = this.f54467e;
                if (handler == null) {
                    handler = C52478yu0.m2311d();
                    this.f54467e = handler;
                }
                if (this.f54472j == null) {
                    C11603a c11603a = new C11603a(handler);
                    this.f54472j = c11603a;
                    this.f54465c.m67466c(this.f54463a, uri, c11603a);
                }
                if (this.f54473k == null) {
                    this.f54473k = new Runnable() { // from class: Bw1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11600e.C11602b.this.m67461d();
                        }
                    };
                }
                handler.postDelayed(this.f54473k, j);
            }
        }

        /* renamed from: g */
        public void m67458g(Executor executor) {
            synchronized (this.f54466d) {
                this.f54468f = executor;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.e$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11604c {
        /* renamed from: a */
        public abstract long m67457a();
    }

    public C11600e(Context context, C53092zw1 c53092zw1) {
        super(new C11602b(context, c53092zw1, f54462k));
    }

    /* renamed from: c */
    public C11600e m67469c(Executor executor) {
        ((C11602b) m67501a()).m67458g(executor);
        return this;
    }
}
