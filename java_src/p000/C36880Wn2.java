package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\bA\u0010BJH\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0096\u0001J\u001a\u0010\u0011\u001a\u00020\u0003*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u0003*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u0016*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u0016*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u00020\u0010*\u00020\u0003H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0010*\u00020\u0016H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0018J\u0019\u0010%\u001a\u00020\u0013*\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020(*\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020'*\u00020(H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R<\u00108\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e04j\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00168\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b-\u00109R\u0014\u0010<\u001a\u00020\u00168\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006C"}, m28432d2 = {"LWn2;", "LVn2;", "LzO2;", "", "width", "height", "", "LL9;", "alignmentLines", "Lkotlin/Function1;", "LOU3$a;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "LyO2;", "O0", "Lk61;", "F0", "(F)I", "LM26;", "V0", "(J)I", "", "T0", "(F)F", "I0", "(J)F", "index", "Lkz0;", "constraints", "", "LOU3;", "M", "(IJ)Ljava/util/List;", "w", "(I)F", "x", "s0", "(F)J", "Lo61;", "LxB5;", "z", "(J)J", "j", "LQn2;", "b", "LQn2;", "itemContentFactory", "LaT5;", "c", "LaT5;", "subcomposeMeasureScope", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/HashMap;", "placeablesCache", "()F", "density", "R0", "fontScale", "Lpm2;", "getLayoutDirection", "()Lpm2;", "layoutDirection", "<init>", "(LQn2;LaT5;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* renamed from: Wn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36880Wn2 implements InterfaceC36646Vn2, InterfaceC52765zO2 {

    /* renamed from: b */
    public final C35476Qn2 f42111b;

    /* renamed from: c */
    public final InterfaceC37973aT5 f42112c;

    /* renamed from: d */
    public final HashMap<Integer, List<OU3>> f42113d;

    public C36880Wn2(C35476Qn2 itemContentFactory, InterfaceC37973aT5 subcomposeMeasureScope) {
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.f42111b = itemContentFactory;
        this.f42112c = subcomposeMeasureScope;
        this.f42113d = new HashMap<>();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: F0 */
    public int mo3416F0(float f) {
        return this.f42112c.mo3416F0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: I0 */
    public float mo3415I0(long j) {
        return this.f42112c.mo3415I0(j);
    }

    @Override // p000.InterfaceC36646Vn2
    /* renamed from: M */
    public List<OU3> mo77829M(int i, long j) {
        List<OU3> list = this.f42113d.get(Integer.valueOf(i));
        if (list == null) {
            Object mo15369c = this.f42111b.m87930d().invoke().mo15369c(i);
            List<InterfaceC50393vO2> mo71334q0 = this.f42112c.mo71334q0(mo15369c, this.f42111b.m87932b(i, mo15369c));
            int size = mo71334q0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(mo71334q0.get(i2).mo8763P0(j));
            }
            this.f42113d.put(Integer.valueOf(i), arrayList);
            return arrayList;
        }
        return list;
    }

    @Override // p000.InterfaceC52765zO2
    /* renamed from: O0 */
    public InterfaceC52172yO2 mo1431O0(int i, int i2, Map<AbstractC4750L9, Integer> alignmentLines, Function1<? super OU3.AbstractC6015a, Unit> placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return this.f42112c.mo1431O0(i, i2, alignmentLines, placementBlock);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: R0 */
    public float mo3412R0() {
        return this.f42112c.mo3412R0();
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: T0 */
    public float mo3411T0(float f) {
        return this.f42112c.mo3411T0(f);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: V0 */
    public int mo3410V0(long j) {
        return this.f42112c.mo3410V0(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: b */
    public float mo3408b() {
        return this.f42112c.mo3408b();
    }

    @Override // p000.Z62
    public EnumC47065pm2 getLayoutDirection() {
        return this.f42112c.getLayoutDirection();
    }

    @Override // p000.InterfaceC36646Vn2, p000.InterfaceC41273g01
    /* renamed from: j */
    public long mo3403j(long j) {
        return this.f42112c.mo3403j(j);
    }

    @Override // p000.InterfaceC41273g01
    /* renamed from: s0 */
    public long mo3399s0(float f) {
        return this.f42112c.mo3399s0(f);
    }

    @Override // p000.InterfaceC36646Vn2, p000.InterfaceC41273g01
    /* renamed from: w */
    public float mo3398w(int i) {
        return this.f42112c.mo3398w(i);
    }

    @Override // p000.InterfaceC36646Vn2, p000.InterfaceC41273g01
    /* renamed from: x */
    public float mo3397x(float f) {
        return this.f42112c.mo3397x(f);
    }

    @Override // p000.InterfaceC36646Vn2, p000.InterfaceC41273g01
    /* renamed from: z */
    public long mo3395z(long j) {
        return this.f42112c.mo3395z(j);
    }
}
