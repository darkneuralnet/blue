package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000b\u0010\fR.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LY10;", "", "LlO1;", "value", C17296a.f69688o, "LlO1;", "b", "()LlO1;", "setContentCardsActionListener", "(LlO1;)V", "contentCardsActionListener", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Y10 */
/* loaded from: classes5.dex */
public class Y10 {

    /* renamed from: b */
    public static final C9601b f44439b = new C9601b(null);

    /* renamed from: c */
    public static final Lazy<Y10> f44440c;

    /* renamed from: a */
    public InterfaceC44464lO1 f44441a = new NW0();

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LY10;", "b", "()LY10;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Y10$a */
    /* loaded from: classes5.dex */
    public static final class C9600a extends Lambda implements Function0<Y10> {

        /* renamed from: g */
        public static final C9600a f44442g = new C9600a();

        public C9600a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Y10 invoke() {
            return new Y10();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"LY10$b;", "", "LY10;", "instance$delegate", "Lkotlin/Lazy;", C17296a.f69688o, "()LY10;", "getInstance$annotations", "()V", "instance", "<init>", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Y10$b */
    /* loaded from: classes5.dex */
    public static final class C9601b {
        public /* synthetic */ C9601b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Y10 m75848a() {
            return (Y10) Y10.f44440c.getValue();
        }

        private C9601b() {
        }
    }

    static {
        Lazy<Y10> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C9600a.f44442g);
        f44440c = lazy;
    }

    /* renamed from: b */
    public final InterfaceC44464lO1 m75850b() {
        return this.f44441a;
    }
}
