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
import p000.OU3;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B6\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020#ø\u0001\u0001¢\u0006\u0004\b&\u0010'J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0010\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016J<\u0010\u0016\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0014H\u0002J<\u0010\u0017\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0014H\u0002R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m28432d2 = {"LQz3;", "LxO2;", "LzO2;", "", "LvO2;", "measurables", "Lkz0;", "constraints", "LyO2;", C17296a.f69688o, "(LzO2;Ljava/util/List;J)LyO2;", "LZ62;", "LX62;", "", "width", DateTokenConverter.CONVERTER_KEY, "e", "height", "b", "c", "Lkotlin/Function2;", "intrinsicMeasurer", "j", "i", "Lkotlin/Function1;", "LxB5;", "", "Lkotlin/jvm/functions/Function1;", "onLabelMeasured", "", "Z", "singleLine", "", "F", "animationProgress", "LPD3;", "LPD3;", "paddingValues", "<init>", "(Lkotlin/jvm/functions/Function1;ZFLPD3;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,981:1\n1#2:982\n223#3,2:983\n223#3,2:985\n223#3,2:987\n223#3,2:989\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n622#1:983,2\n653#1:985,2\n722#1:987,2\n754#1:989,2\n*E\n"})
/* renamed from: Qz3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35585Qz3 implements InterfaceC51579xO2 {

    /* renamed from: a */
    public final Function1<C51465xB5, Unit> f31361a;

    /* renamed from: b */
    public final boolean f31362b;

    /* renamed from: c */
    public final float f31363c;

    /* renamed from: d */
    public final PD3 f31364d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "w", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz3$a */
    /* loaded from: classes.dex */
    public static final class C7044a extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C7044a f31365g = new C7044a();

        public C7044a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m87446a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77402B(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m87446a(x62, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "h", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz3$b */
    /* loaded from: classes.dex */
    public static final class C7045b extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C7045b f31366g = new C7045b();

        public C7045b() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m87445a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77398t0(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m87445a(x62, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz3$c */
    /* loaded from: classes.dex */
    public static final class C7046c extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f31367g;

        /* renamed from: h */
        public final /* synthetic */ int f31368h;

        /* renamed from: i */
        public final /* synthetic */ OU3 f31369i;

        /* renamed from: j */
        public final /* synthetic */ OU3 f31370j;

        /* renamed from: k */
        public final /* synthetic */ OU3 f31371k;

        /* renamed from: l */
        public final /* synthetic */ OU3 f31372l;

        /* renamed from: m */
        public final /* synthetic */ OU3 f31373m;

        /* renamed from: n */
        public final /* synthetic */ OU3 f31374n;

        /* renamed from: o */
        public final /* synthetic */ C35585Qz3 f31375o;

        /* renamed from: p */
        public final /* synthetic */ InterfaceC52765zO2 f31376p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7046c(int i, int i2, OU3 ou3, OU3 ou32, OU3 ou33, OU3 ou34, OU3 ou35, OU3 ou36, C35585Qz3 c35585Qz3, InterfaceC52765zO2 interfaceC52765zO2) {
            super(1);
            this.f31367g = i;
            this.f31368h = i2;
            this.f31369i = ou3;
            this.f31370j = ou32;
            this.f31371k = ou33;
            this.f31372l = ou34;
            this.f31373m = ou35;
            this.f31374n = ou36;
            this.f31375o = c35585Qz3;
            this.f31376p = interfaceC52765zO2;
        }

        /* renamed from: a */
        public final void m87444a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            C35351Pz3.m89183k(layout, this.f31367g, this.f31368h, this.f31369i, this.f31370j, this.f31371k, this.f31372l, this.f31373m, this.f31374n, this.f31375o.f31363c, this.f31375o.f31362b, this.f31376p.mo3408b(), this.f31376p.getLayoutDirection(), this.f31375o.f31364d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m87444a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "w", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz3$d */
    /* loaded from: classes.dex */
    public static final class C7047d extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C7047d f31377g = new C7047d();

        public C7047d() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m87443a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77400g0(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m87443a(x62, num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LX62;", "intrinsicMeasurable", "", "h", C17296a.f69688o, "(LX62;I)Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qz3$e */
    /* loaded from: classes.dex */
    public static final class C7048e extends Lambda implements Function2<X62, Integer, Integer> {

        /* renamed from: g */
        public static final C7048e f31378g = new C7048e();

        public C7048e() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m87442a(X62 intrinsicMeasurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.mo77399p0(i));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(X62 x62, Integer num) {
            return m87442a(x62, num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35585Qz3(Function1<? super C51465xB5, Unit> onLabelMeasured, boolean z, float f, PD3 paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f31361a = onLabelMeasured;
        this.f31362b = z;
        this.f31363c = f;
        this.f31364d = paddingValues;
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: a */
    public InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 measure, List<? extends InterfaceC50393vO2> measurables, long j) {
        Object obj;
        OU3 ou3;
        Object obj2;
        OU3 ou32;
        boolean z;
        int i;
        Object obj3;
        OU3 ou33;
        Object obj4;
        OU3 ou34;
        int m89185i;
        int m89186h;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo3416F0 = measure.mo3416F0(this.f31364d.mo88735a());
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
        int m26473i2 = m26473i + C44846m16.m26473i(ou32);
        if (this.f31363c < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        int mo3416F02 = measure.mo3416F0(this.f31364d.mo88734b(measure.getLayoutDirection())) + measure.mo3416F0(this.f31364d.mo88733c(measure.getLayoutDirection()));
        if (z) {
            i = (-m26473i2) - mo3416F02;
        } else {
            i = -mo3416F02;
        }
        int i4 = -mo3416F0;
        long m22036h = C46007nz0.m22036h(m28072e, i, i4);
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
            this.f31361a.invoke(C51465xB5.m5736c(CB5.m112663a(ou33.m92226i1(), ou33.m92229d1())));
        }
        long m28072e2 = C44228kz0.m28072e(C46007nz0.m22036h(j, -m26473i2, i4 - Math.max(C44846m16.m26474h(ou33) / 2, measure.mo3416F0(this.f31364d.mo88732d()))), 0, 0, 0, 0, 11, null);
        for (InterfaceC50393vO2 interfaceC50393vO24 : list) {
            if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO24), "TextField")) {
                OU3 mo8763P0 = interfaceC50393vO24.mo8763P0(m28072e2);
                long m28072e3 = C44228kz0.m28072e(m28072e2, 0, 0, 0, 0, 14, null);
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
                    ou34 = interfaceC50393vO25.mo8763P0(m28072e3);
                } else {
                    ou34 = null;
                }
                m89185i = C35351Pz3.m89185i(C44846m16.m26473i(ou3), C44846m16.m26473i(ou32), mo8763P0.m92226i1(), C44846m16.m26473i(ou33), C44846m16.m26473i(ou34), z, j, measure.mo3408b(), this.f31364d);
                m89186h = C35351Pz3.m89186h(C44846m16.m26474h(ou3), C44846m16.m26474h(ou32), mo8763P0.m92229d1(), C44846m16.m26474h(ou33), C44846m16.m26474h(ou34), j, measure.mo3408b(), this.f31364d);
                for (InterfaceC50393vO2 interfaceC50393vO26 : list) {
                    if (Intrinsics.areEqual(C11335a.m68615a(interfaceC50393vO26), "border")) {
                        if (m89185i != Integer.MAX_VALUE) {
                            i2 = m89185i;
                        } else {
                            i2 = 0;
                        }
                        if (m89186h != Integer.MAX_VALUE) {
                            i3 = m89186h;
                        } else {
                            i3 = 0;
                        }
                        return InterfaceC52765zO2.m1430Y(measure, m89185i, m89186h, null, new C7046c(m89186h, m89185i, ou3, ou32, mo8763P0, ou33, ou34, interfaceC50393vO26.mo8763P0(C46007nz0.m22043a(i2, m89185i, i3, m89186h)), this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: b */
    public int mo5313b(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m87447j(z62, measurables, i, C7045b.f31366g);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: c */
    public int mo5312c(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m87447j(z62, measurables, i, C7048e.f31378g);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: d */
    public int mo5311d(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m87448i(z62, measurables, i, C7044a.f31365g);
    }

    @Override // p000.InterfaceC51579xO2
    /* renamed from: e */
    public int mo5310e(Z62 z62, List<? extends X62> measurables, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return m87448i(z62, measurables, i, C7047d.f31377g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final int m87448i(Z62 z62, List<? extends X62> list, int i, Function2<? super X62, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        int m89186h;
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
                m89186h = C35351Pz3.m89186h(i4, i3, intValue, i2, i5, C44846m16.m26475g(), z62.mo3408b(), this.f31364d);
                return m89186h;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final int m87447j(Z62 z62, List<? extends X62> list, int i, Function2<? super X62, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        int i3;
        Object obj4;
        int i4;
        int i5;
        boolean z;
        int m89185i;
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
                if (this.f31363c < 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                m89185i = C35351Pz3.m89185i(i4, i3, intValue, i2, i5, z, C44846m16.m26475g(), z62.mo3408b(), this.f31364d);
                return m89185i;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
