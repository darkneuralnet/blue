package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@InterfaceC36928Ws5(with = C35665Ri2.class)
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LPi2;", "LYi2;", "LKj2;", "serializer", "", "b", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "content", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pi2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35197Pi2 extends AbstractC37303Yi2 {
    public static final C35197Pi2 INSTANCE = new C35197Pi2();

    /* renamed from: b */
    public static final String f28934b = "null";

    /* renamed from: c */
    public static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> f28935c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pi2$a */
    /* loaded from: classes8.dex */
    public static final class C6453a extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {

        /* renamed from: g */
        public static final C6453a f28936g = new C6453a();

        public C6453a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC34036Kj2<Object> invoke() {
            return C35665Ri2.f32455a;
        }
    }

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) C6453a.f28936g);
        f28935c = lazy;
    }

    private C35197Pi2() {
        super(null);
    }

    /* renamed from: b */
    private final /* synthetic */ Lazy m89904b() {
        return f28935c;
    }

    @Override // p000.AbstractC37303Yi2
    /* renamed from: a */
    public String mo74434a() {
        return f28934b;
    }

    public final InterfaceC34036Kj2<C35197Pi2> serializer() {
        return (InterfaceC34036Kj2) m89904b().getValue();
    }
}
