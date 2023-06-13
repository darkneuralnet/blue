package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@KeepForSdk
/* renamed from: com.google.mlkit.vision.common.internal.a */
/* loaded from: classes6.dex */
public class C18452a {

    /* renamed from: a */
    public final Map f74675a = new HashMap();

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18453a<DetectorT extends InterfaceC18455c, OptionsT extends InterfaceC18454b<DetectorT>> {
        @KeepForSdk
        /* renamed from: a */
        DetectorT mo25204a(OptionsT optionst);
    }

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18454b<DetectorT> {
    }

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC18455c {
    }

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$d */
    /* loaded from: classes6.dex */
    public static class C18456d {

        /* renamed from: a */
        public final Class f74676a;

        /* renamed from: b */
        public final X94 f74677b;

        /* renamed from: c */
        public final int f74678c;

        @KeepForSdk
        public <DetectorT extends InterfaceC18455c, OptionsT extends InterfaceC18454b<DetectorT>> C18456d(Class<? extends OptionsT> cls, X94<? extends InterfaceC18453a<DetectorT, OptionsT>> x94, int i) {
            this.f74676a = cls;
            this.f74677b = x94;
            this.f74678c = i;
        }

        /* renamed from: a */
        public final int m46756a() {
            return this.f74678c;
        }

        /* renamed from: b */
        public final X94 m46755b() {
            return this.f74677b;
        }

        /* renamed from: c */
        public final Class m46754c() {
            return this.f74676a;
        }

        @KeepForSdk
        public <DetectorT extends InterfaceC18455c, OptionsT extends InterfaceC18454b<DetectorT>> C18456d(Class<? extends OptionsT> cls, X94<? extends InterfaceC18453a<DetectorT, OptionsT>> x94) {
            this(cls, x94, 100);
        }
    }

    public C18452a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C18456d c18456d = (C18456d) it.next();
            Class m46754c = c18456d.m46754c();
            if (!this.f74675a.containsKey(m46754c) || c18456d.m46756a() >= ((Integer) Preconditions.checkNotNull((Integer) hashMap.get(m46754c))).intValue()) {
                this.f74675a.put(m46754c, c18456d.m46755b());
                hashMap.put(m46754c, Integer.valueOf(c18456d.m46756a()));
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public static synchronized C18452a m46757b() {
        C18452a c18452a;
        synchronized (C18452a.class) {
            c18452a = (C18452a) C52226yU2.m3451c().m3453a(C18452a.class);
        }
        return c18452a;
    }

    @KeepForSdk
    /* renamed from: a */
    public <DetectorT extends InterfaceC18455c, OptionsT extends InterfaceC18454b<DetectorT>> DetectorT m46758a(OptionsT optionst) {
        return (DetectorT) ((InterfaceC18453a) ((X94) Preconditions.checkNotNull((X94) this.f74675a.get(optionst.getClass()))).get()).mo25204a(optionst);
    }
}
