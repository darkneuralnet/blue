package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C11581c;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements E22<Boolean> {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes.dex */
    public static class C11571a extends C11581c.AbstractC11585c {
        public C11571a(Context context) {
            super(new C11572b(context));
            m67500b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes.dex */
    public static class C11572b implements C11581c.InterfaceC11590h {

        /* renamed from: a */
        public final Context f54402a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        /* loaded from: classes.dex */
        public class C11573a extends C11581c.AbstractC11591i {

            /* renamed from: a */
            public final /* synthetic */ C11581c.AbstractC11591i f54403a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f54404b;

            public C11573a(C11581c.AbstractC11591i abstractC11591i, ThreadPoolExecutor threadPoolExecutor) {
                this.f54403a = abstractC11591i;
                this.f54404b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C11581c.AbstractC11591i
            /* renamed from: a */
            public void mo67498a(Throwable th) {
                try {
                    this.f54403a.mo67498a(th);
                } finally {
                    this.f54404b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C11581c.AbstractC11591i
            /* renamed from: b */
            public void mo67497b(C11605f c11605f) {
                try {
                    this.f54403a.mo67497b(c11605f);
                } finally {
                    this.f54404b.shutdown();
                }
            }
        }

        public C11572b(Context context) {
            this.f54402a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C11581c.InterfaceC11590h
        /* renamed from: a */
        public void mo67464a(final C11581c.AbstractC11591i abstractC11591i) {
            final ThreadPoolExecutor m2313b = C52478yu0.m2313b("EmojiCompatInitializer");
            m2313b.execute(new Runnable() { // from class: wa1
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C11572b.this.m67545d(abstractC11591i, m2313b);
                }
            });
        }

        /* renamed from: c */
        public void m67545d(C11581c.AbstractC11591i abstractC11591i, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C11600e m67544a = C11575a.m67544a(this.f54402a);
                if (m67544a != null) {
                    m67544a.m67469c(threadPoolExecutor);
                    m67544a.m67501a().mo67464a(new C11573a(abstractC11591i, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                abstractC11591i.mo67498a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes.dex */
    public static class RunnableC11574c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                C40152e66.m43277a("EmojiCompat.EmojiCompatInitializer.run");
                if (C11581c.m67521k()) {
                    C11581c.m67529c().m67518n();
                }
            } finally {
                C40152e66.m43276b();
            }
        }
    }

    @Override // p000.E22
    /* renamed from: a */
    public Boolean create(Context context) {
        C11581c.m67522j(new C11571a(context));
        m67549b(context);
        return Boolean.TRUE;
    }

    /* renamed from: b */
    public void m67549b(Context context) {
        final AbstractC11719f lifecycle = ((LifecycleOwner) C19846dj.m43856e(context).m43855f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo67008a(new VX0() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.VX0
            public void onResume(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.m67548c();
                lifecycle.mo67006d(this);
            }
        });
    }

    /* renamed from: c */
    public void m67548c() {
        C52478yu0.m2311d().postDelayed(new RunnableC11574c(), 500L);
    }

    @Override // p000.E22
    public List<Class<? extends E22<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
