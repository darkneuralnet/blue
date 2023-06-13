package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public class C11581c {

    /* renamed from: o */
    public static final Object f54409o = new Object();

    /* renamed from: p */
    public static final Object f54410p = new Object();

    /* renamed from: q */
    public static volatile C11581c f54411q;

    /* renamed from: b */
    public final Set<AbstractC11588f> f54413b;

    /* renamed from: e */
    public final C11584b f54416e;

    /* renamed from: f */
    public final InterfaceC11590h f54417f;

    /* renamed from: g */
    public final InterfaceC11592j f54418g;

    /* renamed from: h */
    public final boolean f54419h;

    /* renamed from: i */
    public final boolean f54420i;

    /* renamed from: j */
    public final int[] f54421j;

    /* renamed from: k */
    public final boolean f54422k;

    /* renamed from: l */
    public final int f54423l;

    /* renamed from: m */
    public final int f54424m;

    /* renamed from: n */
    public final InterfaceC11587e f54425n;

    /* renamed from: a */
    public final ReadWriteLock f54412a = new ReentrantReadWriteLock();

    /* renamed from: c */
    public volatile int f54414c = 3;

    /* renamed from: d */
    public final Handler f54415d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.c$a */
    /* loaded from: classes.dex */
    public static final class C11582a extends C11584b {

        /* renamed from: b */
        public volatile C11593d f54426b;

        /* renamed from: c */
        public volatile C11605f f54427c;

        /* renamed from: androidx.emoji2.text.c$a$a */
        /* loaded from: classes.dex */
        public class C11583a extends AbstractC11591i {
            public C11583a() {
            }

            @Override // androidx.emoji2.text.C11581c.AbstractC11591i
            /* renamed from: a */
            public void mo67498a(Throwable th) {
                C11582a.this.f54429a.m67516p(th);
            }

            @Override // androidx.emoji2.text.C11581c.AbstractC11591i
            /* renamed from: b */
            public void mo67497b(C11605f c11605f) {
                C11582a.this.m67507f(c11605f);
            }
        }

        public C11582a(C11581c c11581c) {
            super(c11581c);
        }

        @Override // androidx.emoji2.text.C11581c.C11584b
        /* renamed from: a */
        public int mo67506a(CharSequence charSequence, int i) {
            return this.f54426b.m67494b(charSequence, i);
        }

        @Override // androidx.emoji2.text.C11581c.C11584b
        /* renamed from: b */
        public int mo67505b(CharSequence charSequence, int i) {
            return this.f54426b.m67493c(charSequence, i);
        }

        @Override // androidx.emoji2.text.C11581c.C11584b
        /* renamed from: c */
        public void mo67504c() {
            try {
                this.f54429a.f54417f.mo67464a(new C11583a());
            } catch (Throwable th) {
                this.f54429a.m67516p(th);
            }
        }

        @Override // androidx.emoji2.text.C11581c.C11584b
        /* renamed from: d */
        public CharSequence mo67503d(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f54426b.m67486j(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.C11581c.C11584b
        /* renamed from: e */
        public void mo67502e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f54427c.m67452e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f54429a.f54419h);
        }

        /* renamed from: f */
        public void m67507f(C11605f c11605f) {
            if (c11605f == null) {
                this.f54429a.m67516p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f54427c = c11605f;
            C11605f c11605f2 = this.f54427c;
            InterfaceC11592j interfaceC11592j = this.f54429a.f54418g;
            InterfaceC11587e interfaceC11587e = this.f54429a.f54425n;
            C11581c c11581c = this.f54429a;
            this.f54426b = new C11593d(c11605f2, interfaceC11592j, interfaceC11587e, c11581c.f54420i, c11581c.f54421j, C32082Ca1.m112105a());
            this.f54429a.m67515q();
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    /* loaded from: classes.dex */
    public static class C11584b {

        /* renamed from: a */
        public final C11581c f54429a;

        public C11584b(C11581c c11581c) {
            this.f54429a = c11581c;
        }

        /* renamed from: a */
        public int mo67506a(CharSequence charSequence, int i) {
            throw null;
        }

        /* renamed from: b */
        public int mo67505b(CharSequence charSequence, int i) {
            throw null;
        }

        /* renamed from: c */
        public void mo67504c() {
            throw null;
        }

        /* renamed from: d */
        public CharSequence mo67503d(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        /* renamed from: e */
        public void mo67502e(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11585c {

        /* renamed from: a */
        public final InterfaceC11590h f54430a;

        /* renamed from: b */
        public InterfaceC11592j f54431b;

        /* renamed from: c */
        public boolean f54432c;

        /* renamed from: d */
        public boolean f54433d;

        /* renamed from: e */
        public int[] f54434e;

        /* renamed from: f */
        public Set<AbstractC11588f> f54435f;

        /* renamed from: g */
        public boolean f54436g;

        /* renamed from: h */
        public int f54437h = -16711936;

        /* renamed from: i */
        public int f54438i = 0;

        /* renamed from: j */
        public InterfaceC11587e f54439j = new C11580b();

        public AbstractC11585c(InterfaceC11590h interfaceC11590h) {
            HZ3.m103730h(interfaceC11590h, "metadataLoader cannot be null.");
            this.f54430a = interfaceC11590h;
        }

        /* renamed from: a */
        public final InterfaceC11590h m67501a() {
            return this.f54430a;
        }

        /* renamed from: b */
        public AbstractC11585c m67500b(int i) {
            this.f54438i = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    /* loaded from: classes.dex */
    public static class C11586d implements InterfaceC11592j {
        @Override // androidx.emoji2.text.C11581c.InterfaceC11592j
        /* renamed from: a */
        public AbstractC33018Ga1 mo67496a(C51711xc6 c51711xc6) {
            return new C52304yc6(c51711xc6);
        }
    }

    /* renamed from: androidx.emoji2.text.c$e */
    /* loaded from: classes.dex */
    public interface InterfaceC11587e {
        /* renamed from: a */
        boolean mo67499a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.c$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11588f {
        /* renamed from: a */
        public void mo6704a(Throwable th) {
        }

        /* renamed from: b */
        public void mo6703b() {
        }
    }

    /* renamed from: androidx.emoji2.text.c$g */
    /* loaded from: classes.dex */
    public static class RunnableC11589g implements Runnable {

        /* renamed from: b */
        public final List<AbstractC11588f> f54440b;

        /* renamed from: c */
        public final Throwable f54441c;

        /* renamed from: d */
        public final int f54442d;

        public RunnableC11589g(AbstractC11588f abstractC11588f, int i) {
            this(Arrays.asList((AbstractC11588f) HZ3.m103730h(abstractC11588f, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f54440b.size();
            int i = 0;
            if (this.f54442d != 1) {
                while (i < size) {
                    this.f54440b.get(i).mo6704a(this.f54441c);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f54440b.get(i).mo6703b();
                i++;
            }
        }

        public RunnableC11589g(Collection<AbstractC11588f> collection, int i) {
            this(collection, i, null);
        }

        public RunnableC11589g(Collection<AbstractC11588f> collection, int i, Throwable th) {
            HZ3.m103730h(collection, "initCallbacks cannot be null");
            this.f54440b = new ArrayList(collection);
            this.f54442d = i;
            this.f54441c = th;
        }
    }

    /* renamed from: androidx.emoji2.text.c$h */
    /* loaded from: classes.dex */
    public interface InterfaceC11590h {
        /* renamed from: a */
        void mo67464a(AbstractC11591i abstractC11591i);
    }

    /* renamed from: androidx.emoji2.text.c$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11591i {
        /* renamed from: a */
        public abstract void mo67498a(Throwable th);

        /* renamed from: b */
        public abstract void mo67497b(C11605f c11605f);
    }

    /* renamed from: androidx.emoji2.text.c$j */
    /* loaded from: classes.dex */
    public interface InterfaceC11592j {
        /* renamed from: a */
        AbstractC33018Ga1 mo67496a(C51711xc6 c51711xc6);
    }

    public C11581c(AbstractC11585c abstractC11585c) {
        this.f54419h = abstractC11585c.f54432c;
        this.f54420i = abstractC11585c.f54433d;
        this.f54421j = abstractC11585c.f54434e;
        this.f54422k = abstractC11585c.f54436g;
        this.f54423l = abstractC11585c.f54437h;
        this.f54417f = abstractC11585c.f54430a;
        this.f54424m = abstractC11585c.f54438i;
        this.f54425n = abstractC11585c.f54439j;
        C30704yo c30704yo = new C30704yo();
        this.f54413b = c30704yo;
        InterfaceC11592j interfaceC11592j = abstractC11585c.f54431b;
        this.f54418g = interfaceC11592j == null ? new C11586d() : interfaceC11592j;
        Set<AbstractC11588f> set = abstractC11585c.f54435f;
        if (set != null && !set.isEmpty()) {
            c30704yo.addAll(abstractC11585c.f54435f);
        }
        this.f54416e = new C11582a(this);
        m67517o();
    }

    /* renamed from: c */
    public static C11581c m67529c() {
        C11581c c11581c;
        boolean z;
        synchronized (f54409o) {
            c11581c = f54411q;
            if (c11581c != null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c11581c;
    }

    /* renamed from: h */
    public static boolean m67524h(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        return C11593d.m67492d(inputConnection, editable, i, i2, z);
    }

    /* renamed from: i */
    public static boolean m67523i(Editable editable, int i, KeyEvent keyEvent) {
        return C11593d.m67491e(editable, i, keyEvent);
    }

    /* renamed from: j */
    public static C11581c m67522j(AbstractC11585c abstractC11585c) {
        C11581c c11581c = f54411q;
        if (c11581c == null) {
            synchronized (f54409o) {
                c11581c = f54411q;
                if (c11581c == null) {
                    c11581c = new C11581c(abstractC11585c);
                    f54411q = c11581c;
                }
            }
        }
        return c11581c;
    }

    /* renamed from: k */
    public static boolean m67521k() {
        return f54411q != null;
    }

    /* renamed from: d */
    public int m67528d(CharSequence charSequence, int i) {
        return this.f54416e.mo67506a(charSequence, i);
    }

    /* renamed from: e */
    public int m67527e() {
        return this.f54423l;
    }

    /* renamed from: f */
    public int m67526f(CharSequence charSequence, int i) {
        return this.f54416e.mo67505b(charSequence, i);
    }

    /* renamed from: g */
    public int m67525g() {
        this.f54412a.readLock().lock();
        try {
            return this.f54414c;
        } finally {
            this.f54412a.readLock().unlock();
        }
    }

    /* renamed from: l */
    public boolean m67520l() {
        return this.f54422k;
    }

    /* renamed from: m */
    public final boolean m67519m() {
        return m67525g() == 1;
    }

    /* renamed from: n */
    public void m67518n() {
        boolean z = true;
        if (this.f54424m != 1) {
            z = false;
        }
        HZ3.m103728j(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m67519m()) {
            return;
        }
        this.f54412a.writeLock().lock();
        try {
            if (this.f54414c == 0) {
                return;
            }
            this.f54414c = 0;
            this.f54412a.writeLock().unlock();
            this.f54416e.mo67504c();
        } finally {
            this.f54412a.writeLock().unlock();
        }
    }

    /* renamed from: o */
    public final void m67517o() {
        this.f54412a.writeLock().lock();
        try {
            if (this.f54424m == 0) {
                this.f54414c = 0;
            }
            this.f54412a.writeLock().unlock();
            if (m67525g() == 0) {
                this.f54416e.mo67504c();
            }
        } catch (Throwable th) {
            this.f54412a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public void m67516p(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f54412a.writeLock().lock();
        try {
            this.f54414c = 2;
            arrayList.addAll(this.f54413b);
            this.f54413b.clear();
            this.f54412a.writeLock().unlock();
            this.f54415d.post(new RunnableC11589g(arrayList, this.f54414c, th));
        } catch (Throwable th2) {
            this.f54412a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: q */
    public void m67515q() {
        ArrayList arrayList = new ArrayList();
        this.f54412a.writeLock().lock();
        try {
            this.f54414c = 1;
            arrayList.addAll(this.f54413b);
            this.f54413b.clear();
            this.f54412a.writeLock().unlock();
            this.f54415d.post(new RunnableC11589g(arrayList, this.f54414c));
        } catch (Throwable th) {
            this.f54412a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: r */
    public CharSequence m67514r(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return m67513s(charSequence, 0, length);
    }

    /* renamed from: s */
    public CharSequence m67513s(CharSequence charSequence, int i, int i2) {
        return m67512t(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: t */
    public CharSequence m67512t(CharSequence charSequence, int i, int i2, int i3) {
        return m67511u(charSequence, i, i2, i3, 0);
    }

    /* renamed from: u */
    public CharSequence m67511u(CharSequence charSequence, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        HZ3.m103728j(m67519m(), "Not initialized yet");
        HZ3.m103733e(i, "start cannot be negative");
        HZ3.m103733e(i2, "end cannot be negative");
        HZ3.m103733e(i3, "maxEmojiCount cannot be negative");
        boolean z5 = false;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        HZ3.m103736b(z2, "start should be < than charSequence length");
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        HZ3.m103736b(z3, "end should be < than charSequence length");
        if (charSequence.length() != 0 && i != i2) {
            if (i4 != 1) {
                if (i4 != 2) {
                    z5 = this.f54419h;
                }
                z4 = z5;
            } else {
                z4 = true;
            }
            return this.f54416e.mo67503d(charSequence, i, i2, i3, z4);
        }
        return charSequence;
    }

    /* renamed from: v */
    public void m67510v(AbstractC11588f abstractC11588f) {
        HZ3.m103730h(abstractC11588f, "initCallback cannot be null");
        this.f54412a.writeLock().lock();
        try {
            if (this.f54414c != 1 && this.f54414c != 2) {
                this.f54413b.add(abstractC11588f);
            }
            this.f54415d.post(new RunnableC11589g(abstractC11588f, this.f54414c));
        } finally {
            this.f54412a.writeLock().unlock();
        }
    }

    /* renamed from: w */
    public void m67509w(AbstractC11588f abstractC11588f) {
        HZ3.m103730h(abstractC11588f, "initCallback cannot be null");
        this.f54412a.writeLock().lock();
        try {
            this.f54413b.remove(abstractC11588f);
        } finally {
            this.f54412a.writeLock().unlock();
        }
    }

    /* renamed from: x */
    public void m67508x(EditorInfo editorInfo) {
        if (m67519m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f54416e.mo67502e(editorInfo);
        }
    }
}
