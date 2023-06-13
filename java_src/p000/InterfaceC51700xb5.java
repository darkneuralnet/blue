package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0005\u001a\u00020\u0002H'ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m28432d2 = {"Lxb5;", "", "Lpm0;", "defaultColor-WaAFU9c", "(LEt0;I)J", "defaultColor", "Lpb5;", "rippleAlpha", "(LEt0;I)Lpb5;", C17296a.f69688o, "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC51700xb5 {

    /* renamed from: a */
    public static final C30239a f117843a = C30239a.f117844a;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lxb5$a;", "", "Lpm0;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Lpb5;", C17296a.f69688o, "(JZ)Lpb5;", "<init>", "()V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xb5$a */
    /* loaded from: classes.dex */
    public static final class C30239a {

        /* renamed from: a */
        public static final /* synthetic */ C30239a f117844a = new C30239a();

        private C30239a() {
        }

        /* renamed from: a */
        public final C46958pb5 m4962a(long j, boolean z) {
            if (z) {
                if (C50619vm0.m8175f(j) > 0.5d) {
                    return C52293yb5.m3200b();
                }
                return C52293yb5.m3199c();
            }
            return C52293yb5.m3201a();
        }

        /* renamed from: b */
        public final long m4961b(long j, boolean z) {
            float m8175f = C50619vm0.m8175f(j);
            if (!z && m8175f < 0.5d) {
                return C47063pm0.f104050b.m18725h();
            }
            return j;
        }
    }

    /* renamed from: defaultColor-WaAFU9c */
    long mo116229defaultColorWaAFU9c(InterfaceC32720Et0 interfaceC32720Et0, int i);

    C46958pb5 rippleAlpha(InterfaceC32720Et0 interfaceC32720Et0, int i);
}
