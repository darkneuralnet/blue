package p000;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m28432d2 = {"LRM4;", "LQM4;", "", "f", "Z", "h", "()Z", "presentArParkingOption", "", "g", "Lkotlin/Lazy;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Z)V", "LPZ1;", "LQZ1;", "LRZ1;", "LVZ1;", "Lco/bird/android/core/base/viewmodel/a;", "Lco/bird/android/core/base/viewmodel/b;", "LlA3;", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RM4 */
/* loaded from: classes2.dex */
public abstract class RM4 extends QM4 {

    /* renamed from: f */
    public final boolean f31956f;

    /* renamed from: g */
    public final Lazy f31957g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: RM4$a */
    /* loaded from: classes2.dex */
    public static final class C7157a extends Lambda implements Function0<Integer> {
        public C7157a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            if (RM4.this.mo27704h()) {
                return Integer.valueOf(C45871nl4.parking_dialog_optional_location_verification_title);
            }
            return null;
        }
    }

    public /* synthetic */ RM4(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    @Override // p000.QM4, p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return (Integer) this.f31957g.getValue();
    }

    /* renamed from: h */
    public boolean mo27704h() {
        return this.f31956f;
    }

    public /* synthetic */ RM4(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, null);
    }

    public RM4(boolean z) {
        super(null);
        Lazy lazy;
        this.f31956f = z;
        lazy = LazyKt__LazyJVMKt.lazy(new C7157a());
        this.f31957g = lazy;
    }
}
