package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: jt2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43577jt2 {

    /* renamed from: c */
    public static final C42984it2<?, ?, ?> f93502c = new C42984it2<>(Object.class, Object.class, Object.class, Collections.singletonList(new C48676sV0(Object.class, Object.class, Object.class, Collections.emptyList(), new C41652ge6(), null)), null);

    /* renamed from: a */
    public final C28385so<C48687sW2, C42984it2<?, ?, ?>> f93503a = new C28385so<>();

    /* renamed from: b */
    public final AtomicReference<C48687sW2> f93504b = new AtomicReference<>();

    /* renamed from: a */
    public <Data, TResource, Transcode> C42984it2<Data, TResource, Transcode> m29786a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C42984it2<Data, TResource, Transcode> c42984it2;
        C48687sW2 m29785b = m29785b(cls, cls2, cls3);
        synchronized (this.f93503a) {
            c42984it2 = (C42984it2<Data, TResource, Transcode>) this.f93503a.get(m29785b);
        }
        this.f93504b.set(m29785b);
        return c42984it2;
    }

    /* renamed from: b */
    public final C48687sW2 m29785b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C48687sW2 andSet = this.f93504b.getAndSet(null);
        if (andSet == null) {
            andSet = new C48687sW2();
        }
        andSet.m14120a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: c */
    public boolean m29784c(C42984it2<?, ?, ?> c42984it2) {
        return f93502c.equals(c42984it2);
    }

    /* renamed from: d */
    public void m29783d(Class<?> cls, Class<?> cls2, Class<?> cls3, C42984it2<?, ?, ?> c42984it2) {
        synchronized (this.f93503a) {
            C28385so<C48687sW2, C42984it2<?, ?, ?>> c28385so = this.f93503a;
            C48687sW2 c48687sW2 = new C48687sW2(cls, cls2, cls3);
            if (c42984it2 == null) {
                c42984it2 = f93502c;
            }
            c28385so.put(c48687sW2, c42984it2);
        }
    }
}
