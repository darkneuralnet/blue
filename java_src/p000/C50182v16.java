package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \b\u0001\u0018\u0000 '2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.B\t\b\u0016¢\u0006\u0004\b-\u0010/J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR+\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, m28432d2 = {"Lv16;", "", "LEy3;", "orientation", "LOs4;", "cursorRect", "", "containerSize", "textFieldSize", "", "j", "", "cursorStart", "cursorEnd", "b", "(FFI)V", "Ls26;", BaseSheetViewModel.SAVE_SELECTION, "e", "(J)I", "<set-?>", C17296a.f69688o, "LEX2;", DateTokenConverter.CONVERTER_KEY, "()F", "h", "(F)V", "offset", "c", "g", "maximum", "LOs4;", "previousCursorRect", "J", "getPreviousSelection-d9O1mEE", "()J", "i", "(J)V", "previousSelection", "f", "()LEy3;", "setOrientation", "(LEy3;)V", "initialOrientation", "initial", "<init>", "(LEy3;F)V", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n102#2,2:371\n76#2:373\n102#2,2:374\n76#2:376\n102#2,2:377\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n253#1:370\n253#1:371,2\n259#1:373\n259#1:374,2\n274#1:376\n274#1:377,2\n*E\n"})
/* renamed from: v16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50182v16 {

    /* renamed from: f */
    public static final C29356c f113347f = new C29356c(null);

    /* renamed from: g */
    public static final InterfaceC35668Ri5<C50182v16, Object> f113348g = C31777As2.m115002a(C29354a.f113354g, C29355b.f113355g);

    /* renamed from: a */
    public final EX2 f113349a;

    /* renamed from: b */
    public final EX2 f113350b;

    /* renamed from: c */
    public C35055Os4 f113351c;

    /* renamed from: d */
    public long f113352d;

    /* renamed from: e */
    public final EX2 f113353e;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTi5;", "Lv16;", "it", "", "", C17296a.f69688o, "(LTi5;Lv16;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v16$a */
    /* loaded from: classes.dex */
    public static final class C29354a extends Lambda implements Function2<InterfaceC36136Ti5, C50182v16, List<? extends Object>> {

        /* renamed from: g */
        public static final C29354a f113354g = new C29354a();

        public C29354a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<Object> invoke(InterfaceC36136Ti5 listSaver, C50182v16 it) {
            List<Object> listOf;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Float.valueOf(it.m9372d());
            if (it.m9370f() == EnumC32768Ey3.Vertical) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            listOf = CollectionsKt__CollectionsKt.listOf(objArr);
            return listOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "restored", "Lv16;", C17296a.f69688o, "(Ljava/util/List;)Lv16;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: v16$b */
    /* loaded from: classes.dex */
    public static final class C29355b extends Lambda implements Function1<List<? extends Object>, C50182v16> {

        /* renamed from: g */
        public static final C29355b f113355g = new C29355b();

        public C29355b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C50182v16 invoke(List<? extends Object> restored) {
            EnumC32768Ey3 enumC32768Ey3;
            Intrinsics.checkNotNullParameter(restored, "restored");
            Object obj = restored.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                enumC32768Ey3 = EnumC32768Ey3.Vertical;
            } else {
                enumC32768Ey3 = EnumC32768Ey3.Horizontal;
            }
            Object obj2 = restored.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C50182v16(enumC32768Ey3, ((Float) obj2).floatValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lv16$c;", "", "LRi5;", "Lv16;", "Saver", "LRi5;", C17296a.f69688o, "()LRi5;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: v16$c */
    /* loaded from: classes.dex */
    public static final class C29356c {
        public /* synthetic */ C29356c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC35668Ri5<C50182v16, Object> m9363a() {
            return C50182v16.f113348g;
        }

        private C29356c() {
        }
    }

    public C50182v16(EnumC32768Ey3 initialOrientation, float f) {
        EX2 m97025e;
        EX2 m97025e2;
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        m97025e = LM5.m97025e(Float.valueOf(f), null, 2, null);
        this.f113349a = m97025e;
        m97025e2 = LM5.m97025e(Float.valueOf(0.0f), null, 2, null);
        this.f113350b = m97025e2;
        this.f113351c = C35055Os4.f27481e.m91247a();
        this.f113352d = C48413s26.f108170b.m14827a();
        this.f113353e = GM5.m105200g(initialOrientation, GM5.m105191p());
    }

    /* renamed from: b */
    public final void m9374b(float f, float f2, int i) {
        int i2;
        float f3;
        float m9372d = m9372d();
        float f4 = i;
        float f5 = m9372d + f4;
        if (f2 > f5 || (f < m9372d && f2 - f > f4)) {
            f3 = f2 - f5;
        } else if (i2 < 0 && f2 - f <= f4) {
            f3 = f - m9372d;
        } else {
            f3 = 0.0f;
        }
        m9368h(m9372d() + f3);
    }

    /* renamed from: c */
    public final float m9373c() {
        return ((Number) this.f113350b.getValue()).floatValue();
    }

    /* renamed from: d */
    public final float m9372d() {
        return ((Number) this.f113349a.getValue()).floatValue();
    }

    /* renamed from: e */
    public final int m9371e(long j) {
        if (C48413s26.m14832n(j) != C48413s26.m14832n(this.f113352d)) {
            return C48413s26.m14832n(j);
        }
        if (C48413s26.m14837i(j) != C48413s26.m14837i(this.f113352d)) {
            return C48413s26.m14837i(j);
        }
        return C48413s26.m14834l(j);
    }

    /* renamed from: f */
    public final EnumC32768Ey3 m9370f() {
        return (EnumC32768Ey3) this.f113353e.getValue();
    }

    /* renamed from: g */
    public final void m9369g(float f) {
        this.f113350b.setValue(Float.valueOf(f));
    }

    /* renamed from: h */
    public final void m9368h(float f) {
        this.f113349a.setValue(Float.valueOf(f));
    }

    /* renamed from: i */
    public final void m9367i(long j) {
        this.f113352d = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 == false) goto L13;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9366j(EnumC32768Ey3 orientation, C35055Os4 cursorRect, int i, int i2) {
        boolean z;
        float m91258i;
        float m91257j;
        float coerceIn;
        boolean z2;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(cursorRect, "cursorRect");
        float f = i2 - i;
        m9369g(f);
        boolean z3 = true;
        if (cursorRect.m91258i() == this.f113351c.m91258i()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (cursorRect.m91255l() == this.f113351c.m91255l()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (orientation != EnumC32768Ey3.Vertical) {
            z3 = false;
        }
        if (z3) {
            m91258i = cursorRect.m91255l();
        } else {
            m91258i = cursorRect.m91258i();
        }
        if (z3) {
            m91257j = cursorRect.m91262e();
        } else {
            m91257j = cursorRect.m91257j();
        }
        m9374b(m91258i, m91257j, i);
        this.f113351c = cursorRect;
        coerceIn = RangesKt___RangesKt.coerceIn(m9372d(), 0.0f, f);
        m9368h(coerceIn);
    }

    public /* synthetic */ C50182v16(EnumC32768Ey3 enumC32768Ey3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC32768Ey3, (i & 2) != 0 ? 0.0f : f);
    }

    public C50182v16() {
        this(EnumC32768Ey3.Vertical, 0.0f, 2, null);
    }
}
