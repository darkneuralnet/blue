package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¨\u0006\r"}, m28432d2 = {"LvI3;", "LxE;", "Lio/reactivex/Observable;", "", "Sl", "Lco/bird/android/model/wire/WirePart;", "Ql", "Lio/reactivex/p;", "Tl", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vI3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC50340vI3 extends AbstractC30071xE {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vI3$a */
    /* loaded from: classes3.dex */
    public static final class C29475a extends Lambda implements Function1<Unit, InterfaceC24574u<? extends WirePart>> {
        public C29475a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WirePart> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC50340vI3.this.m8922Tl();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC50340vI3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* renamed from: Rl */
    public static final InterfaceC24574u m8923Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Ql */
    public final Observable<WirePart> m8924Ql() {
        Observable<Unit> observeOn = mo5780Sl().observeOn(C23454a.m33087a());
        final C29475a c29475a = new C29475a();
        Observable flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: uI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m8923Rl;
                m8923Rl = AbstractC50340vI3.m8923Rl(Function1.this, obj);
                return m8923Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "fun partScan(): Observab…ybe { scanForPart() }\n  }");
        return flatMapMaybe;
    }

    /* renamed from: Sl */
    public abstract Observable<Unit> mo5780Sl();

    /* renamed from: Tl */
    public final AbstractC24507p<WirePart> m8922Tl() {
        String string = getActivity().getString(C45871nl4.operator_inventory_qr_scan_instruction);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…tory_qr_scan_instruction)");
        C43226jI3 m30813a = C43226jI3.f92490g.m30813a(PartKind.UNKNOWN, string, true);
        m30813a.show(getActivity().getSupportFragmentManager(), "PartScanBottomSheet");
        return m30813a.m30816N6();
    }
}
