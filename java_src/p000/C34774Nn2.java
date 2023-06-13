package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p000.C42341ho2;
import p000.InterfaceC0587BG;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u000e2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001\u0016B/\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b/\u00100J@\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0002\b\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u0010*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m28432d2 = {"LNn2;", "LoV2;", "LBG;", "T", "LBG$b;", "direction", "Lkotlin/Function1;", "LBG$a;", "Lkotlin/ExtensionFunctionType;", "block", C17296a.f69688o, "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lho2$a;", "currentInterval", "g", "(Lho2$a;I)Lho2$a;", "", "j", "(Lho2$a;I)Z", "m", "(I)Z", "LDG;", "b", "LDG;", TransferTable.COLUMN_STATE, "Lho2;", "c", "Lho2;", "beyondBoundsInfo", DateTokenConverter.CONVERTER_KEY, "Z", "reverseLayout", "Lpm2;", "e", "Lpm2;", "layoutDirection", "LEy3;", "f", "LEy3;", "orientation", "LV94;", "getKey", "()LV94;", "key", "h", "()LBG;", "value", "<init>", "(LDG;Lho2;ZLpm2;LEy3;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34774Nn2 implements InterfaceC46307oV2<InterfaceC0587BG>, InterfaceC0587BG {

    /* renamed from: g */
    public static final C5693b f25178g = new C5693b(null);

    /* renamed from: h */
    public static final C5692a f25179h = new C5692a();

    /* renamed from: b */
    public final InterfaceC1438DG f25180b;

    /* renamed from: c */
    public final C42341ho2 f25181c;

    /* renamed from: d */
    public final boolean f25182d;

    /* renamed from: e */
    public final EnumC47065pm2 f25183e;

    /* renamed from: f */
    public final EnumC32768Ey3 f25184f;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Nn2$a", "LBG$a;", "", C17296a.f69688o, "Z", "()Z", "hasMoreContent", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nn2$a */
    /* loaded from: classes.dex */
    public static final class C5692a implements InterfaceC0587BG.InterfaceC0588a {

        /* renamed from: a */
        public final boolean f25185a;

        @Override // p000.InterfaceC0587BG.InterfaceC0588a
        /* renamed from: a */
        public boolean mo93408a() {
            return this.f25185a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LNn2$b;", "", "Nn2$a", "emptyBeyondBoundsScope", "LNn2$a;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nn2$b */
    /* loaded from: classes.dex */
    public static final class C5693b {
        public /* synthetic */ C5693b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5693b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nn2$c */
    /* loaded from: classes.dex */
    public /* synthetic */ class C5694c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC47065pm2.values().length];
            try {
                iArr[EnumC47065pm2.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC47065pm2.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"Nn2$d", "LBG$a;", "", C17296a.f69688o, "()Z", "hasMoreContent", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nn2$d */
    /* loaded from: classes.dex */
    public static final class C5695d implements InterfaceC0587BG.InterfaceC0588a {

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<C42341ho2.C22728a> f25187b;

        /* renamed from: c */
        public final /* synthetic */ int f25188c;

        public C5695d(Ref.ObjectRef<C42341ho2.C22728a> objectRef, int i) {
            this.f25187b = objectRef;
            this.f25188c = i;
        }

        @Override // p000.InterfaceC0587BG.InterfaceC0588a
        /* renamed from: a */
        public boolean mo93408a() {
            return C34774Nn2.this.m93412j(this.f25187b.element, this.f25188c);
        }
    }

    public C34774Nn2(InterfaceC1438DG state, C42341ho2 beyondBoundsInfo, boolean z, EnumC47065pm2 layoutDirection, EnumC32768Ey3 orientation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f25180b = state;
        this.f25181c = beyondBoundsInfo;
        this.f25182d = z;
        this.f25183e = layoutDirection;
        this.f25184f = orientation;
    }

    /* renamed from: k */
    public static final boolean m93411k(C42341ho2.C22728a c22728a, C34774Nn2 c34774Nn2) {
        return c22728a.m35848a() < c34774Nn2.f25180b.getItemCount() - 1;
    }

    /* renamed from: l */
    public static final boolean m93410l(C42341ho2.C22728a c22728a) {
        return c22728a.m35847b() > 0;
    }

    @Override // p000.InterfaceC0587BG
    /* renamed from: a */
    public <T> T mo93416a(int i, Function1<? super InterfaceC0587BG.InterfaceC0588a, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.f25180b.getItemCount() > 0 && this.f25180b.mo29899b()) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) this.f25181c.m35853a(this.f25180b.mo29898c(), this.f25180b.mo29897d());
            T t = null;
            while (t == null && m93412j((C42341ho2.C22728a) objectRef.element, i)) {
                this.f25181c.m35849e((C42341ho2.C22728a) objectRef.element);
                objectRef.element = (T) m93414g((C42341ho2.C22728a) objectRef.element, i);
                this.f25180b.mo29900a();
                t = block.invoke(new C5695d(objectRef, i));
            }
            this.f25181c.m35849e((C42341ho2.C22728a) objectRef.element);
            this.f25180b.mo29900a();
            return t;
        }
        return block.invoke(f25179h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r5.f25182d != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5.f25182d != false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r5.f25182d != false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r5.f25182d != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r5.f25182d != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
        if (r5.f25182d != false) goto L3;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C42341ho2.C22728a m93414g(C42341ho2.C22728a c22728a, int i) {
        int m35847b = c22728a.m35847b();
        int m35848a = c22728a.m35848a();
        InterfaceC0587BG.C0589b.C0590a c0590a = InterfaceC0587BG.C0589b.f2153a;
        if (!InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114152c())) {
            if (!InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114153b())) {
                if (!InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114154a())) {
                    if (!InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114151d())) {
                        if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114150e())) {
                            int i2 = C5694c.$EnumSwitchMapping$0[this.f25183e.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                }
                            }
                        } else if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114149f())) {
                            int i3 = C5694c.$EnumSwitchMapping$0[this.f25183e.ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2) {
                                }
                            }
                        } else {
                            C35008On2.m91397b();
                            throw new KotlinNothingValueException();
                        }
                    }
                }
                return this.f25181c.m35853a(m35847b, m35848a);
            }
            m35848a++;
            return this.f25181c.m35853a(m35847b, m35848a);
        }
        m35847b--;
        return this.f25181c.m35853a(m35847b, m35848a);
    }

    @Override // p000.InterfaceC46307oV2
    public V94<InterfaceC0587BG> getKey() {
        return C0970CG.m112497a();
    }

    @Override // p000.InterfaceC46307oV2
    /* renamed from: h */
    public InterfaceC0587BG getValue() {
        return this;
    }

    /* renamed from: j */
    public final boolean m93412j(C42341ho2.C22728a c22728a, int i) {
        if (m93409m(i)) {
            return false;
        }
        InterfaceC0587BG.C0589b.C0590a c0590a = InterfaceC0587BG.C0589b.f2153a;
        if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114152c())) {
            return m93410l(c22728a);
        }
        if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114153b())) {
            return m93411k(c22728a, this);
        }
        if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114154a())) {
            if (this.f25182d) {
                return m93411k(c22728a, this);
            }
            return m93410l(c22728a);
        } else if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114151d())) {
            if (this.f25182d) {
                return m93410l(c22728a);
            }
            return m93411k(c22728a, this);
        } else if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114150e())) {
            int i2 = C5694c.$EnumSwitchMapping$0[this.f25183e.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (this.f25182d) {
                        return m93410l(c22728a);
                    }
                    return m93411k(c22728a, this);
                }
                throw new NoWhenBranchMatchedException();
            } else if (this.f25182d) {
                return m93411k(c22728a, this);
            } else {
                return m93410l(c22728a);
            }
        } else if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114149f())) {
            int i3 = C5694c.$EnumSwitchMapping$0[this.f25183e.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (this.f25182d) {
                        return m93411k(c22728a, this);
                    }
                    return m93410l(c22728a);
                }
                throw new NoWhenBranchMatchedException();
            } else if (this.f25182d) {
                return m93410l(c22728a);
            } else {
                return m93411k(c22728a, this);
            }
        } else {
            C35008On2.m91397b();
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: m */
    public final boolean m93409m(int i) {
        boolean m114155h;
        boolean m114155h2;
        InterfaceC0587BG.C0589b.C0590a c0590a = InterfaceC0587BG.C0589b.f2153a;
        boolean z = true;
        if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114154a())) {
            m114155h = true;
        } else {
            m114155h = InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114151d());
        }
        if (m114155h) {
            if (this.f25184f == EnumC32768Ey3.Horizontal) {
                return true;
            }
        } else {
            if (InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114150e())) {
                m114155h2 = true;
            } else {
                m114155h2 = InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114149f());
            }
            if (m114155h2) {
                if (this.f25184f == EnumC32768Ey3.Vertical) {
                    return true;
                }
            } else {
                if (!InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114152c())) {
                    z = InterfaceC0587BG.C0589b.m114155h(i, c0590a.m114153b());
                }
                if (!z) {
                    C35008On2.m91397b();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return false;
    }
}
