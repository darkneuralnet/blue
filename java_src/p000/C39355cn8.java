package p000;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* renamed from: cn8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39355cn8 {

    /* renamed from: a */
    public final Map<Uri, C45875nl8<?>> f61236a = new HashMap();

    /* renamed from: b */
    public final Map<Uri, AbstractC34996Ol8<?>> f61237b = new HashMap();

    /* renamed from: c */
    public final Executor f61238c;

    /* renamed from: d */
    public final P78 f61239d;

    /* renamed from: e */
    public final InterfaceC43713k69<Uri, String> f61240e;

    /* renamed from: f */
    public final Map<String, AbstractC32503Du8> f61241f;

    /* renamed from: g */
    public final C32746Ev8 f61242g;

    /* JADX WARN: Multi-variable type inference failed */
    public C39355cn8(Executor executor, Executor executor2, P78 p78, C32746Ev8 c32746Ev8, Map<String, AbstractC32503Du8> map, InterfaceC49542tw8 interfaceC49542tw8) {
        executor.getClass();
        this.f61238c = executor;
        executor2.getClass();
        this.f61239d = executor2;
        this.f61242g = p78;
        this.f61241f = c32746Ev8;
        C52142yK8.m3660e(!c32746Ev8.isEmpty());
        this.f61240e = C35239Pm8.f29029a;
    }

    /* renamed from: a */
    public final <T extends Np9> C45875nl8<T> m60868a(AbstractC34996Ol8<T> abstractC34996Ol8) {
        return m60867b(abstractC34996Ol8);
    }

    /* renamed from: b */
    public final synchronized <T extends Np9> C45875nl8<T> m60867b(AbstractC34996Ol8<T> abstractC34996Ol8) {
        C45875nl8<T> c45875nl8;
        String substring;
        Uri mo74359a = abstractC34996Ol8.mo74359a();
        c45875nl8 = (C45875nl8<T>) this.f61236a.get(mo74359a);
        if (c45875nl8 == null) {
            Uri mo74359a2 = abstractC34996Ol8.mo74359a();
            C52142yK8.m3658g(mo74359a2.isHierarchical(), "Uri must be hierarchical: %s", mo74359a2);
            String m42991c = C40302eM8.m42991c(mo74359a2.getLastPathSegment());
            int lastIndexOf = m42991c.lastIndexOf(46);
            boolean z = true;
            if (lastIndexOf == -1) {
                substring = "";
            } else {
                substring = m42991c.substring(lastIndexOf + 1);
            }
            C52142yK8.m3658g(substring.equals("pb"), "Uri extension must be .pb: %s", mo74359a2);
            AbstractC32503Du8 abstractC32503Du8 = this.f61241f.get("singleproc");
            if (abstractC32503Du8 == null) {
                z = false;
            }
            C52142yK8.m3658g(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String m42991c2 = C40302eM8.m42991c(abstractC34996Ol8.mo74359a().getLastPathSegment());
            int lastIndexOf2 = m42991c2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                m42991c2 = m42991c2.substring(0, lastIndexOf2);
            }
            c45875nl8 = new C45875nl8<>(abstractC32503Du8.mo79379a(abstractC34996Ol8, m42991c2, this.f61238c, this.f61239d, 1), this.f61242g, C50508va9.m8425k(C50508va9.m8430f(abstractC34996Ol8.mo74359a()), this.f61240e, Hc9.m103649b()), abstractC34996Ol8.mo74354f(), abstractC34996Ol8.mo74355e(), null);
            ZP8<InterfaceC34744Nj8<T>> mo74357c = abstractC34996Ol8.mo74357c();
            if (!mo74357c.isEmpty()) {
                c45875nl8.m91221n(C38149al8.m70777a(mo74357c, this.f61238c));
            }
            this.f61236a.put(mo74359a, c45875nl8);
            this.f61237b.put(mo74359a, abstractC34996Ol8);
        } else {
            C52142yK8.m3658g(abstractC34996Ol8.equals(this.f61237b.get(mo74359a)), "Arguments must match previous call for Uri: %s", mo74359a);
        }
        return c45875nl8;
    }
}
