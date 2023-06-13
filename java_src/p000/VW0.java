package p000;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LVW0;", "LRn2;", "", "index", "", "f", "(ILEt0;I)V", "", "c", C17296a.f69688o, "LsP5;", "LsP5;", "delegate", "getItemCount", "()I", "itemCount", "", "b", "()Ljava/util/Map;", "keyToIndexMap", "<init>", "(LsP5;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VW0 */
/* loaded from: classes.dex */
public final class VW0 implements InterfaceC35710Rn2 {

    /* renamed from: a */
    public final InterfaceC48627sP5<InterfaceC35710Rn2> f39177a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VW0$a */
    /* loaded from: classes.dex */
    public static final class C8662a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f39179h;

        /* renamed from: i */
        public final /* synthetic */ int f39180i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8662a(int i, int i2) {
            super(2);
            this.f39179h = i;
            this.f39180i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            VW0.this.mo15367f(this.f39179h, interfaceC32720Et0, C47127ps4.m18626a(this.f39180i | 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VW0(InterfaceC48627sP5<? extends InterfaceC35710Rn2> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f39177a = delegate;
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: a */
    public Object mo15371a(int i) {
        return this.f39177a.getValue().mo15371a(i);
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: b */
    public Map<Object, Integer> mo15370b() {
        return this.f39177a.getValue().mo15370b();
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: c */
    public Object mo15369c(int i) {
        return this.f39177a.getValue().mo15369c(i);
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: f */
    public void mo15367f(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1633511187);
        if ((i2 & 14) == 0) {
            if (mo89518u.mo89527r(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (mo89518u.mo89539n(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1633511187, i3, -1, "androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item (LazyLayoutItemProvider.kt:194)");
            }
            this.f39177a.getValue().mo15367f(i, mo89518u, i3 & 14);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C8662a(i, i2));
        }
    }

    @Override // p000.InterfaceC35710Rn2
    public int getItemCount() {
        return this.f39177a.getValue().getItemCount();
    }
}
