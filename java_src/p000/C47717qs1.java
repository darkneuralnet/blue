package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.flightsheet.common.adapters.FlightSheetGridLayoutManager;
import co.bird.android.model.FlightSheetButton;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC48310rs1;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lqs1;", "LwZ;", "Lco/bird/android/model/FlightSheetButton;", "LEa;", "c", "LEa;", "e", "()LEa;", "setAnalyticsManager", "(LEa;)V", "analyticsManager", "LYs1;", DateTokenConverter.CONVERTER_KEY, "LYs1;", "()LYs1;", "adapter", "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;", "Lw1;", "Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;", "f", "()Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;", "layoutManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qs1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47717qs1 extends AbstractC29912wZ<FlightSheetButton> {

    /* renamed from: c */
    public InterfaceC1880Ea f105943c;

    /* renamed from: d */
    public final C37392Ys1 f105944d;

    /* renamed from: e */
    public final FlightSheetGridLayoutManager<C29735w1> f105945e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/FlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/FlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: qs1$a */
    /* loaded from: classes3.dex */
    public static final class C27712a extends Lambda implements Function1<FlightSheetButton, Unit> {
        public C27712a() {
            super(1);
        }

        /* renamed from: a */
        public final void m16896a(FlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C47717qs1.this.m6672a().invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightSheetButton flightSheetButton) {
            m16896a(flightSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47717qs1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC48310rs1.InterfaceC28044a m110583a = DJ0.m110583a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        m110583a.mo15151a(c46172oG2.m21419a(applicationContext)).mo15152a(this);
        this.f105944d = new C37392Ys1(null, m16898e(), 1, null);
        getAdapter().m74080C(new C27712a());
        this.f105945e = new FlightSheetGridLayoutManager<>(context, getAdapter());
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: d */
    public C37392Ys1 getAdapter() {
        return this.f105944d;
    }

    /* renamed from: e */
    public final InterfaceC1880Ea m16898e() {
        InterfaceC1880Ea interfaceC1880Ea = this.f105943c;
        if (interfaceC1880Ea != null) {
            return interfaceC1880Ea;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsManager");
        return null;
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: f */
    public FlightSheetGridLayoutManager<C29735w1> getLayoutManager() {
        return this.f105945e;
    }
}
