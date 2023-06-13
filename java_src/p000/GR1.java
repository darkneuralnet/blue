package p000;

import co.bird.android.feature.servicecenter.idtools.identify.IdAction;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import p000.C45672nQ5;
import p000.FQ5;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0014H&J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0014H&J\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u001f\u0010 J7\u0010(\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H&J!\u0010-\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u00100\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u00101\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0014H&J\b\u00103\u001a\u00020\u0006H&J\u0010\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0011H&¨\u00066"}, m28432d2 = {"LGR1;", "LH31;", "LS74;", "LaM5;", "LFQ5;", "Lio/reactivex/Observable;", "", "h", "n", "d0", "Hk", "Q9", "ak", "of", "f", "Xh", "Lkotlin/Pair;", "Lco/bird/android/model/constant/PartKind;", "", "Bd", "", "visible", "Ni", "status", "A4", "", "Lco/bird/android/model/wire/WirePart;", "parts", "W2", "enabled", "M4", "C8", "(Ljava/lang/Boolean;)V", "Lco/bird/android/feature/servicecenter/idtools/identify/IdAction;", "action", "Lco/bird/android/model/IdToolOption;", "option", "id", "", "timeoutMin", "Ac", "(Lco/bird/android/feature/servicecenter/idtools/identify/IdAction;Lco/bird/android/model/IdToolOption;Ljava/lang/String;Ljava/lang/Integer;)V", "Db", "Lorg/joda/time/DateTime;", "startedAt", "c3", "(Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V", "se", "Ri", "ac", "b2", "Nj", "kind", "Qk", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GR1 */
/* loaded from: classes3.dex */
public interface GR1 extends H31, S74, InterfaceC37910aM5, FQ5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GR1$a */
    /* loaded from: classes3.dex */
    public static final class C2848a {
        /* renamed from: a */
        public static void m105124a(GR1 gr1, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107149c(gr1, sections);
        }

        /* renamed from: b */
        public static void m105123b(GR1 gr1, List<C3023H6> sections) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            FQ5.C2274a.m107148d(gr1, sections);
        }

        /* renamed from: c */
        public static Observable<C45672nQ5.EnumC26504b> m105122c(GR1 gr1, ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
            Intrinsics.checkNotNullParameter(viewHolderSupplier, "viewHolderSupplier");
            return FQ5.C2274a.m107147e(gr1, viewHolderSupplier);
        }

        public static /* synthetic */ void setStepTwoDescription$default(GR1 gr1, IdAction idAction, IdToolOption idToolOption, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStepTwoDescription");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            gr1.mo103897Ac(idAction, idToolOption, str, num);
        }
    }

    /* renamed from: A4 */
    void mo103898A4(boolean z);

    /* renamed from: Ac */
    void mo103897Ac(IdAction idAction, IdToolOption idToolOption, String str, Integer num);

    /* renamed from: Bd */
    Observable<Pair<PartKind, String>> mo103896Bd();

    /* renamed from: C8 */
    void mo103895C8(Boolean bool);

    /* renamed from: Db */
    void mo103894Db(IdToolOption idToolOption);

    /* renamed from: Hk */
    Observable<Unit> mo103893Hk();

    /* renamed from: M4 */
    void mo103892M4(boolean z);

    /* renamed from: Ni */
    void mo103891Ni(boolean z);

    /* renamed from: Nj */
    void mo103890Nj();

    /* renamed from: Q9 */
    Observable<Unit> mo103888Q9();

    /* renamed from: Qk */
    void mo103887Qk(PartKind partKind);

    /* renamed from: Ri */
    void mo103885Ri(boolean z);

    /* renamed from: W2 */
    void mo103881W2(List<WirePart> list);

    /* renamed from: Xh */
    Observable<Unit> mo103880Xh();

    /* renamed from: ac */
    void mo103879ac(boolean z);

    /* renamed from: ak */
    Observable<Unit> mo103878ak();

    /* renamed from: b2 */
    void mo103877b2(boolean z);

    /* renamed from: c3 */
    void mo103876c3(Boolean bool, DateTime dateTime);

    /* renamed from: d0 */
    Observable<Unit> mo103875d0();

    /* renamed from: f */
    Observable<Unit> mo103874f();

    /* renamed from: h */
    Observable<Unit> mo103873h();

    /* renamed from: n */
    Observable<Unit> mo103872n();

    /* renamed from: of */
    Observable<Unit> mo103871of();

    /* renamed from: se */
    void mo103870se(boolean z);
}
