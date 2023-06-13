package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u00020\u0002*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LeX2;", "LFr5;", "", C17296a.f69688o, "", "J", "getSelectableId", "()J", "selectableId", "Lkotlin/Function0;", "Lnm2;", "b", "Lkotlin/jvm/functions/Function0;", "coordinatesCallback", "Li26;", "c", "layoutResultCallback", DateTokenConverter.CONVERTER_KEY, "Li26;", "_previousTextLayoutResult", "e", "I", "_previousLastVisibleOffset", "(Li26;)I", "lastVisibleOffset", "<init>", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,297:1\n1#2:298\n*E\n"})
/* renamed from: eX2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40395eX2 implements InterfaceC32941Fr5 {

    /* renamed from: a */
    public final long f78512a;

    /* renamed from: b */
    public final Function0<InterfaceC45879nm2> f78513b;

    /* renamed from: c */
    public final Function0<C42484i26> f78514c;

    /* renamed from: d */
    public C42484i26 f78515d;

    /* renamed from: e */
    public int f78516e;

    /* JADX WARN: Multi-variable type inference failed */
    public C40395eX2(long j, Function0<? extends InterfaceC45879nm2> coordinatesCallback, Function0<C42484i26> layoutResultCallback) {
        Intrinsics.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
        Intrinsics.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
        this.f78512a = j;
        this.f78513b = coordinatesCallback;
        this.f78514c = layoutResultCallback;
        this.f78516e = -1;
    }

    @Override // p000.InterfaceC32941Fr5
    /* renamed from: a */
    public int mo42809a() {
        C42484i26 invoke = this.f78514c.invoke();
        if (invoke == null) {
            return 0;
        }
        return m42808b(invoke);
    }

    /* renamed from: b */
    public final synchronized int m42808b(C42484i26 c42484i26) {
        int m34595m;
        if (this.f78515d != c42484i26) {
            if (c42484i26.m34603e() && !c42484i26.m34586v().m86666e()) {
                m34595m = RangesKt___RangesKt.coerceAtMost(c42484i26.m34591q(G52.m105830f(c42484i26.m34609A())), c42484i26.m34595m() - 1);
                while (c42484i26.m34587u(m34595m) >= G52.m105830f(c42484i26.m34609A())) {
                    m34595m--;
                }
                this.f78516e = c42484i26.m34594n(m34595m, true);
                this.f78515d = c42484i26;
            }
            m34595m = c42484i26.m34595m() - 1;
            this.f78516e = c42484i26.m34594n(m34595m, true);
            this.f78515d = c42484i26;
        }
        return this.f78516e;
    }
}
