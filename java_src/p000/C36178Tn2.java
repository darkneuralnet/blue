package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38566bT5;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LTn2;", "LbT5;", "LbT5$a;", "slotIds", "", C17296a.f69688o, "", "slotId", "reusableSlotId", "", "b", "LQn2;", "LQn2;", "factory", "", "", "Ljava/util/Map;", "countPerType", "<init>", "(LQn2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36178Tn2 implements InterfaceC38566bT5 {

    /* renamed from: a */
    public final C35476Qn2 f36072a;

    /* renamed from: b */
    public final Map<Object, Integer> f36073b;

    public C36178Tn2(C35476Qn2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f36072a = factory;
        this.f36073b = new LinkedHashMap();
    }

    @Override // p000.InterfaceC38566bT5
    /* renamed from: a */
    public void mo4080a(InterfaceC38566bT5.C12396a slotIds) {
        int i;
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        this.f36073b.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object m87931c = this.f36072a.m87931c(it.next());
            Integer num = this.f36073b.get(m87931c);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i == 7) {
                it.remove();
            } else {
                this.f36073b.put(m87931c, Integer.valueOf(i + 1));
            }
        }
    }

    @Override // p000.InterfaceC38566bT5
    /* renamed from: b */
    public boolean mo4079b(Object obj, Object obj2) {
        return Intrinsics.areEqual(this.f36072a.m87931c(obj), this.f36072a.m87931c(obj2));
    }
}
