package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0013B\u0017\b\u0000\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R.\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, m28432d2 = {"LZy0;", "T", "Lbz0;", "LHG6;", "workSpec", "", "b", "value", "c", "(Ljava/lang/Object;)Z", "", "workSpecs", "", "e", "f", "", "workSpecId", DateTokenConverter.CONVERTER_KEY, "newValue", C17296a.f69688o, "(Ljava/lang/Object;)V", "LZy0$a;", "callback", "currentValue", "h", "(LZy0$a;Ljava/lang/Object;)V", "Ldz0;", "Ldz0;", "tracker", "", "Ljava/util/List;", "matchingWorkSpecs", "matchingWorkSpecIds", "Ljava/lang/Object;", "LZy0$a;", "getCallback", "()LZy0$a;", "g", "(LZy0$a;)V", "<init>", "(Ldz0;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Zy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37679Zy0<T> implements InterfaceC38874bz0<T> {

    /* renamed from: a */
    public final AbstractC40077dz0<T> f49582a;

    /* renamed from: b */
    public final List<HG6> f49583b;

    /* renamed from: c */
    public final List<String> f49584c;

    /* renamed from: d */
    public T f49585d;

    /* renamed from: e */
    public InterfaceC10475a f49586e;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, m28432d2 = {"LZy0$a;", "", "", "LHG6;", "workSpecs", "", "b", "c", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Zy0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10475a {
        /* renamed from: b */
        void mo72185b(List<HG6> list);

        /* renamed from: c */
        void mo72184c(List<HG6> list);
    }

    public AbstractC37679Zy0(AbstractC40077dz0<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f49582a = tracker;
        this.f49583b = new ArrayList();
        this.f49584c = new ArrayList();
    }

    @Override // p000.InterfaceC38874bz0
    /* renamed from: a */
    public void mo62059a(T t) {
        this.f49585d = t;
        m72186h(this.f49586e, t);
    }

    /* renamed from: b */
    public abstract boolean mo42880b(HG6 hg6);

    /* renamed from: c */
    public abstract boolean mo42879c(T t);

    /* renamed from: d */
    public final boolean m72190d(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        T t = this.f49585d;
        if (t != null && mo42879c(t) && this.f49584c.contains(workSpecId)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m72189e(Iterable<HG6> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.f49583b.clear();
        this.f49584c.clear();
        List<HG6> list = this.f49583b;
        for (HG6 hg6 : workSpecs) {
            if (mo42880b(hg6)) {
                list.add(hg6);
            }
        }
        List<String> list2 = this.f49584c;
        for (HG6 hg62 : this.f49583b) {
            list2.add(hg62.f13191a);
        }
        if (this.f49583b.isEmpty()) {
            this.f49582a.m43450f(this);
        } else {
            this.f49582a.m43452c(this);
        }
        m72186h(this.f49586e, this.f49585d);
    }

    /* renamed from: f */
    public final void m72188f() {
        if (!this.f49583b.isEmpty()) {
            this.f49583b.clear();
            this.f49582a.m43450f(this);
        }
    }

    /* renamed from: g */
    public final void m72187g(InterfaceC10475a interfaceC10475a) {
        if (this.f49586e != interfaceC10475a) {
            this.f49586e = interfaceC10475a;
            m72186h(interfaceC10475a, this.f49585d);
        }
    }

    /* renamed from: h */
    public final void m72186h(InterfaceC10475a interfaceC10475a, T t) {
        if (!this.f49583b.isEmpty() && interfaceC10475a != null) {
            if (t != null && !mo42879c(t)) {
                interfaceC10475a.mo72185b(this.f49583b);
            } else {
                interfaceC10475a.mo72184c(this.f49583b);
            }
        }
    }
}
