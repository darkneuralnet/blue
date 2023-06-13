package p000;

import androidx.compose.p003ui.layout.C11335a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0010\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J8\u0010\u0016\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0014H\u0002J<\u0010\u0017\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0014H\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lr16;", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "width", DateTokenConverter.CONVERTER_KEY, "e", "height", "b", "c", "Lkotlin/Function2;", "intrinsicMeasurer", "j", "i", "", "Z", "singleLine", "", "F", "animationProgress", "LPD3;", "LPD3;", "paddingValues", "<init>", "(ZFLPD3;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,929:1\n1#2:930\n223#3,2:931\n223#3,2:933\n223#3,2:935\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n599#1:931,2\n704#1:933,2\n733#1:935,2\n*E\n"})
/* renamed from: r16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47811r16 implements InterfaceC51579xO2 {

    /* renamed from: a */
    public final boolean f106215a;

    /* renamed from: b */
    public final float f106216b;

    /* renamed from: c */
    public final PD3 f106217c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "w", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: r16$a */
    /* loaded from: classes.dex */
    public static final class C27752a extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C27752a f106218g = new C27752a();

        public C27752a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m16661a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77402B(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m16661a(x62, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "h", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: r16$b */
    /* loaded from: classes.dex */
    public static final class C27753b extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C27753b f106219g = new C27753b();

        public C27753b() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m16660a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77398t0(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m16660a(x62, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: r16$c */
    /* loaded from: classes.dex */
    public static final class C27754c extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f106220g;

        /* renamed from: h */
        public final /* synthetic */ int f106221h;

        /* renamed from: i */
        public final /* synthetic */ int f106222i;

        /* renamed from: j */
        public final /* synthetic */ int f106223j;

        /* renamed from: k */
        public final /* synthetic */ int f106224k;

        /* renamed from: l */
        public final /* synthetic */ OU3 f106225l;

        /* renamed from: m */
        public final /* synthetic */ OU3 f106226m;

        /* renamed from: n */
        public final /* synthetic */ OU3 f106227n;

        /* renamed from: o */
        public final /* synthetic */ OU3 f106228o;

        /* renamed from: p */
        public final /* synthetic */ C47811r16 f106229p;

        /* renamed from: q */
        public final /* synthetic */ int f106230q;

        /* renamed from: r */
        public final /* synthetic */ int f106231r;

        /* renamed from: s */
        public final /* synthetic */ InterfaceC52765zO2 f106232s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27754c(OU3 ou3, int i, int i2, int i3, int i4, OU3 ou32, OU3 ou33, OU3 ou34, OU3 ou35, C47811r16 c47811r16, int i5, int i6, InterfaceC52765zO2 interfaceC52765zO2) {
            super(1);
            this.f106220g = ou3;
            this.f106221h = i;
            this.f106222i = i2;
            this.f106223j = i3;
            this.f106224k = i4;
            this.f106225l = ou32;
            this.f106226m = ou33;
            this.f106227n = ou34;
            this.f106228o = ou35;
            this.f106229p = c47811r16;
            this.f106230q = i5;
            this.f106231r = i6;
            this.f106232s = interfaceC52765zO2;
        }

        /* renamed from: a */
        public final void m16659a(OU3.AbstractC6015a layout) {
            int coerceAtLeast;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            if (this.f106220g != null) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.f106221h - this.f106222i, 0);
                C47218q16.m18291n(layout, this.f106223j, this.f106224k, this.f106225l, this.f106220g, this.f106226m, this.f106227n, this.f106228o, this.f106229p.f106215a, coerceAtLeast, this.f106231r + this.f106230q, this.f106229p.f106216b, this.f106232s.mo3408b());
                return;
            }
            C47218q16.m18290o(layout, this.f106223j, this.f106224k, this.f106225l, this.f106226m, this.f106227n, this.f106228o, this.f106229p.f106215a, this.f106232s.mo3408b(), this.f106229p.f106217c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m16659a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "w", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: r16$d */
    /* loaded from: classes.dex */
    public static final class C27755d extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C27755d f106233g = new C27755d();

        public C27755d() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m16658a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77400g0(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m16658a(x62, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "h", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: r16$e */
    /* loaded from: classes.dex */
    public static final class C27756e extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C27756e f106234g = new C27756e();

        public C27756e() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m16657a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77399p0(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m16657a(x62, num.intValue());
        }
    }

    public C47811r16(boolean z, float f, PD3 paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f106215a = z;
        this.f106216b = f;
        this.f106217c = paddingValues;
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: a */
    public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
        Object obj;
        OU3 ou3;
        Object obj2;
        OU3 ou32;
        Object obj3;
        OU3 ou33;
        int i;
        int i2;
        Object obj4;
        OU3 ou34;
        int m18296i;
        boolean z;
        int m18297h;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo3416F0 = measure.mo3416F0(this.f106217c.mo88732d());
        int mo3416F02 = measure.mo3416F0(this.f106217c.mo88735a());
        int mo3416F03 = measure.mo3416F0(C47218q16.m18292m());
        long m28072e = C44228kz0.m28072e(j, 0, 0, 0, 0, 10, null);
        List<? extends InterfaceC50393vO2> list = measurables;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(C11335a.m68615a((InterfaceC50393vO2) obj), "Leading")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC50393vO2 interfaceC50393vO2 = (InterfaceC50393vO2) obj;
        if (interfaceC50393vO2 != null) {
            ou3 = interfaceC50393vO2.mo8763P0(m28072e);
        } else {
            ou3 = null;
        }
        int m26473i = C44846m16.m26473i(ou3) + 0;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (Intrinsics.areEqual(C11335a.m68615a((InterfaceC50393vO2) obj2), "Trailing")) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        InterfaceC50393vO2 interfaceC50393vO22 = (InterfaceC50393vO2) obj2;
        if (interfaceC50393vO22 != null) {
            ou32 = interfaceC50393vO22.mo8763P0(C46007nz0.m22035i(m28072e, -m26473i, 0, 2, null));
        } else {
            ou32 = null;
        }
        int i3 = -mo3416F02;
        int i4 = -(m26473i + C44846m16.m26473i(ou32));
        long m22036h = C46007nz0.m22036h(m28072e, i4, i3);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (Intrinsics.areEqual(C11335a.m68615a((InterfaceC50393vO2) obj3), "Label")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        InterfaceC50393vO2 interfaceC50393vO23 = (InterfaceC50393vO2) obj3;
        if (interfaceC50393vO23 != null) {
            ou33 = interfaceC50393vO23.mo8763P0(m22036h);
        } else {
            ou33 = null;
        }
        if (ou33 != null) {
            i = ou33.mo35854v(C5482N9.m94313b());
            if (i == Integer.MIN_VALUE) {
                i = ou33.m92229d1();
            }
        } else {
            i = 0;
        }
        int max = Math.max(i, mo3416F0);
        if (ou33 != null) {
            i2 = (i3 - mo3416F03) - max;
        } else {
            i2 = (-mo3416F0) - mo3416F02;
        }
        long m22036h2 = C46007nz0.m22036h(C44228kz0.m28072e(j, 0, 0, 0, 0, 11, null), i4, i2);
        for (InterfaceC50393vO2 interfaceC50393vO24 : list) {
            if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO24), "TextField")) {
                OU3 mo8763P0 = interfaceC50393vO24.mo8763P0(m22036h2);
                long m28072e2 = C44228kz0.m28072e(m22036h2, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (Intrinsics.areEqual(C11335a.m68615a((InterfaceC50393vO2) obj4), "Hint")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                InterfaceC50393vO2 interfaceC50393vO25 = (InterfaceC50393vO2) obj4;
                if (interfaceC50393vO25 != null) {
                    ou34 = interfaceC50393vO25.mo8763P0(m28072e2);
                } else {
                    ou34 = null;
                }
                m18296i = C47218q16.m18296i(C44846m16.m26473i(ou3), C44846m16.m26473i(ou32), mo8763P0.m92226i1(), C44846m16.m26473i(ou33), C44846m16.m26473i(ou34), j);
                int m92229d1 = mo8763P0.m92229d1();
                if (ou33 != null) {
                    z = true;
                } else {
                    z = false;
                }
                m18297h = C47218q16.m18297h(m92229d1, z, max, C44846m16.m26474h(ou3), C44846m16.m26474h(ou32), C44846m16.m26474h(ou34), j, measure.mo3408b(), this.f106217c);
                return InterfaceC52765zO2.m1430Y(measure, m18296i, m18297h, null, new C27754c(ou33, mo3416F0, i, m18296i, m18297h, mo8763P0, ou34, ou3, ou32, this, max, mo3416F03, measure), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: b */
    public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m16662j(measurables, i, C27753b.f106219g);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: c */
    public int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m16662j(measurables, i, C27756e.f106234g);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: d */
    public int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m16663i(z62, measurables, i, C27752a.f106218g);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: e */
    public int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m16663i(z62, measurables, i, C27755d.f106233g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final int m16663i(Z62 z62, List<? extends X62> list, int i, Function2<? super X62, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        boolean z;
        int m18297h;
        List<? extends X62> list2 = list;
        for (Object obj5 : list2) {
            if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj5), "TextField")) {
                int intValue = function2.invoke(obj5, Integer.valueOf(i)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                X62 x62 = (X62) obj2;
                if (x62 != null) {
                    i2 = function2.invoke(x62, Integer.valueOf(i)).intValue();
                } else {
                    i2 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                X62 x622 = (X62) obj3;
                if (x622 != null) {
                    i3 = function2.invoke(x622, Integer.valueOf(i)).intValue();
                } else {
                    i3 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                X62 x623 = (X62) obj4;
                if (x623 != null) {
                    i4 = function2.invoke(x623, Integer.valueOf(i)).intValue();
                } else {
                    i4 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.areEqual(C44846m16.m26477e((X62) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                X62 x624 = (X62) obj;
                if (x624 != null) {
                    i5 = function2.invoke(x624, Integer.valueOf(i)).intValue();
                } else {
                    i5 = 0;
                }
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                m18297h = C47218q16.m18297h(intValue, z, i2, i4, i3, i5, C44846m16.m26475g(), z62.mo3408b(), this.f106217c);
                return m18297h;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final int m16662j(List<? extends X62> list, int i, Function2<? super X62, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        int m18296i;
        List<? extends X62> list2 = list;
        for (Object obj5 : list2) {
            if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj5), "TextField")) {
                int intValue = function2.invoke(obj5, Integer.valueOf(i)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj2), "Label")) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                X62 x62 = (X62) obj2;
                if (x62 != null) {
                    i2 = function2.invoke(x62, Integer.valueOf(i)).intValue();
                } else {
                    i2 = 0;
                }
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj3), "Trailing")) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                X62 x622 = (X62) obj3;
                if (x622 != null) {
                    i3 = function2.invoke(x622, Integer.valueOf(i)).intValue();
                } else {
                    i3 = 0;
                }
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (Intrinsics.areEqual(C44846m16.m26477e((X62) obj4), "Leading")) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                X62 x623 = (X62) obj4;
                if (x623 != null) {
                    i4 = function2.invoke(x623, Integer.valueOf(i)).intValue();
                } else {
                    i4 = 0;
                }
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.areEqual(C44846m16.m26477e((X62) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                X62 x624 = (X62) obj;
                if (x624 != null) {
                    i5 = function2.invoke(x624, Integer.valueOf(i)).intValue();
                } else {
                    i5 = 0;
                }
                m18296i = C47218q16.m18296i(i4, i3, intValue, i2, i5, C44846m16.m26475g());
                return m18296i;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
