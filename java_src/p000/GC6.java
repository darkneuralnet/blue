package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC37679Zy0;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013¢\u0006\u0004\b\u001a\u0010\u001bB\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u001eJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\u0016\u0010\u000f\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001e\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"LGC6;", "LFC6;", "LZy0$a;", "", "LHG6;", "workSpecs", "", C17296a.f69688o, "reset", "", "workSpecId", "", DateTokenConverter.CONVERTER_KEY, "", "b", "c", "LEC6;", "LEC6;", "callback", "", "LZy0;", "[LZy0;", "constraintControllers", "", "Ljava/lang/Object;", "lock", "<init>", "(LEC6;[LZy0;)V", "Ll66;", "trackers", "(Ll66;LEC6;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: GC6 */
/* loaded from: classes.dex */
public final class GC6 implements FC6, AbstractC37679Zy0.InterfaceC10475a {

    /* renamed from: a */
    public final EC6 f11137a;

    /* renamed from: b */
    public final AbstractC37679Zy0<?>[] f11138b;

    /* renamed from: c */
    public final Object f11139c;

    public GC6(EC6 ec6, AbstractC37679Zy0<?>[] constraintControllers) {
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.f11137a = ec6;
        this.f11138b = constraintControllers;
        this.f11139c = new Object();
    }

    @Override // p000.FC6
    /* renamed from: a */
    public void mo105647a(Iterable<HG6> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f11139c) {
            for (AbstractC37679Zy0<?> abstractC37679Zy0 : this.f11138b) {
                abstractC37679Zy0.m72187g(null);
            }
            for (AbstractC37679Zy0<?> abstractC37679Zy02 : this.f11138b) {
                abstractC37679Zy02.m72189e(workSpecs);
            }
            for (AbstractC37679Zy0<?> abstractC37679Zy03 : this.f11138b) {
                abstractC37679Zy03.m72187g(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.AbstractC37679Zy0.InterfaceC10475a
    /* renamed from: b */
    public void mo72185b(List<HG6> workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f11139c) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (m105646d(((HG6) obj).f13191a)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                str = HC6.f13080a;
                m113272e.mo113269a(str, "Constraints met for " + ((HG6) it.next()));
            }
            EC6 ec6 = this.f11137a;
            if (ec6 != null) {
                ec6.mo64809f(arrayList);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // p000.AbstractC37679Zy0.InterfaceC10475a
    /* renamed from: c */
    public void mo72184c(List<HG6> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.f11139c) {
            EC6 ec6 = this.f11137a;
            if (ec6 != null) {
                ec6.mo64810a(workSpecs);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: d */
    public final boolean m105646d(String workSpecId) {
        boolean z;
        AbstractC37679Zy0<?> abstractC37679Zy0;
        String str;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f11139c) {
            AbstractC37679Zy0<?>[] abstractC37679Zy0Arr = this.f11138b;
            int length = abstractC37679Zy0Arr.length;
            z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    abstractC37679Zy0 = abstractC37679Zy0Arr[i];
                    if (abstractC37679Zy0.m72190d(workSpecId)) {
                        break;
                    }
                    i++;
                } else {
                    abstractC37679Zy0 = null;
                    break;
                }
            }
            if (abstractC37679Zy0 != null) {
                AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                str = HC6.f13080a;
                m113272e.mo113269a(str, "Work " + workSpecId + " constrained by " + abstractC37679Zy0.getClass().getSimpleName());
            }
            if (abstractC37679Zy0 == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // p000.FC6
    public void reset() {
        synchronized (this.f11139c) {
            for (AbstractC37679Zy0<?> abstractC37679Zy0 : this.f11138b) {
                abstractC37679Zy0.m72188f();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GC6(C44303l66 trackers, EC6 ec6) {
        this(ec6, new AbstractC37679Zy0[]{new C7103RF(trackers.m27858a()), new C8244UF(trackers.m27857b()), new C40344eR5(trackers.m27855d()), new A73(trackers.m27856c()), new T73(trackers.m27856c()), new H73(trackers.m27856c()), new G73(trackers.m27856c())});
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
