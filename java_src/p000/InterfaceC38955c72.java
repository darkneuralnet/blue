package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m28432d2 = {"Lc72;", "LBm2;", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "g0", "(LzO2;LvO2;J)J", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "LZ62;", "LX62;", "", "height", "c", "width", "e", "i", DateTokenConverter.CONVERTER_KEY, "", "Y0", "()Z", "enforceIncoming", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC38955c72 extends InterfaceC31957Bm2 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: c72$a */
    /* loaded from: classes.dex */
    public static final class C13409a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f60134g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13409a(OU3 ou3) {
            super(1);
            this.f60134g = ou3;
        }

        /* renamed from: a */
        public final void m61920a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92203t(layout, this.f60134g, A52.f130b.m116106a(), 0.0f, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m61920a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: Y0 */
    default boolean m61921Y0() {
        return true;
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: c */
    default int mo44975c(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.mo77399p0(i);
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: d */
    default int mo44974d(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.mo77402B(i);
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: e */
    default int mo44973e(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.mo77400g0(i);
    }

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: f */
    default InterfaceC52172yO2 mo3871f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long mo21012g0 = mo21012g0(measure, measurable, j);
        if (m61921Y0()) {
            mo21012g0 = C46007nz0.m22039e(j, mo21012g0);
        }
        OU3 mo8763P0 = measurable.mo8763P0(mo21012g0);
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C13409a(mo8763P0), 4, null);
    }

    /* renamed from: g0 */
    long mo21012g0(InterfaceC52765zO2 interfaceC52765zO2, InterfaceC50393vO2 interfaceC50393vO2, long j);

    @Override // p000.InterfaceC31957Bm2
    /* renamed from: i */
    default int mo21011i(Z62 z62, X62 measurable, int i) {
        Intrinsics.checkNotNullParameter(z62, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.mo77398t0(i);
    }
}
