package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m28432d2 = {"LH73;", "LZy0;", "LP73;", "LHG6;", "workSpec", "", "b", "value", "i", "Ldz0;", "tracker", "<init>", "(Ldz0;)V", "f", C17296a.f69688o, "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: H73 */
/* loaded from: classes.dex */
public final class H73 extends AbstractC37679Zy0<P73> {

    /* renamed from: f */
    public static final C3025a f12869f = new C3025a(null);

    /* renamed from: g */
    public static final String f12870g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LH73$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: H73$a */
    /* loaded from: classes.dex */
    public static final class C3025a {
        public /* synthetic */ C3025a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3025a() {
        }
    }

    static {
        String m113270i = AbstractC32056Bx2.m113270i("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(m113270i, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f12870g = m113270i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H73(AbstractC40077dz0<P73> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // p000.AbstractC37679Zy0
    /* renamed from: b */
    public boolean mo42880b(HG6 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (workSpec.f13200j.m26580d() == S73.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC37679Zy0
    /* renamed from: i */
    public boolean mo42879c(P73 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.m90733a() && value.m90731c()) {
            return false;
        }
        return true;
    }
}