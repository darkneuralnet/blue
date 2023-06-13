package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.VehicleSpeedMode;
import co.bird.android.widget.actions.BirdActionsView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010<\u001a\u00020:¢\u0006\u0004\bf\u0010gJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aJ\u0016\u0010 \u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010!\u001a\u00020\u0003J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aJ\u000e\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0014\u0010*\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'J\u000e\u0010+\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010,\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\nJ\u000e\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u000200J\u000e\u00104\u001a\u00020\u00032\u0006\u00103\u001a\u00020\nJ\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aJ\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aJ\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0002J\u0006\u00109\u001a\u00020\u0003R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010GR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010SR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010SR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010SR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b^\u0010Q\u001a\u0004\b_\u0010SR\u0011\u0010c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006h"}, m28432d2 = {"LUC3;", "LxE;", "Lio/reactivex/Observable;", "", "Tl", "Vl", "Am", "Hm", "fm", "Bm", "", "Em", "Dm", "jm", "im", "hm", "Jm", "Wl", "locked", "mm", "show", "nm", "on", "km", "", "currentName", "Lio/reactivex/F;", "LH31$b;", "qm", "Lco/bird/android/model/DialogResponse;", "rm", "allowStopUpdate", "sm", "um", "xm", "", "progress", "tm", "vm", "", "LH6;", "sections", "b", "om", "wm", "ym", "sleep", "lm", "", "totalDelay", "pm", "enable", "Ul", "zm", "Im", "Lco/bird/android/model/constant/VehicleSpeedMode;", "Cm", "gm", "LF4;", "LF4;", "binding", "LHA3;", "c", "LHA3;", "adapter", "Lar6;", DateTokenConverter.CONVERTER_KEY, "Lar6;", "firmwareUpdateBinding", "Lma4;", "e", "Lma4;", "_chirpClicks", "f", "_lightOnClicks", "g", "_lightOffClicks", "LkE5;", "h", "lockStateChanges", "i", "Lio/reactivex/Observable;", "Xl", "()Lio/reactivex/Observable;", "chirpClicks", "j", "Zl", "lightOnClicks", "k", "Yl", "lightOffClicks", "l", "am", "lockRequests", "m", "bm", "unlockRequests", "cm", "()Z", "isDistanceDisplayedInMetric", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LF4;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UC3 */
/* loaded from: classes3.dex */
public final class UC3 extends AbstractC30071xE {

    /* renamed from: b */
    public final C2126F4 f36950b;

    /* renamed from: c */
    public final HA3 f36951c;

    /* renamed from: d */
    public final C38207ar6 f36952d;

    /* renamed from: e */
    public final C45168ma4<Unit> f36953e;

    /* renamed from: f */
    public final C45168ma4<Unit> f36954f;

    /* renamed from: g */
    public final C45168ma4<Unit> f36955g;

    /* renamed from: h */
    public final C45168ma4<EnumC43785kE5> f36956h;

    /* renamed from: i */
    public final Observable<Unit> f36957i;

    /* renamed from: j */
    public final Observable<Unit> f36958j;

    /* renamed from: k */
    public final Observable<Unit> f36959k;

    /* renamed from: l */
    public final Observable<Unit> f36960l;

    /* renamed from: m */
    public final Observable<Unit> f36961m;

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, m28432d2 = {"UC3$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UC3$a */
    /* loaded from: classes3.dex */
    public static final class C8208a extends RecyclerView.AbstractC11863t {
        public C8208a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() / 250.0f;
            if (computeVerticalScrollOffset > 1.0f) {
                computeVerticalScrollOffset = 1.0f;
            }
            float f = 1.0f - computeVerticalScrollOffset;
            UC3.this.f36950b.f8598f.setAlpha(f);
            UC3.this.f36950b.f8597e.setAlpha(f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, m28432d2 = {"UC3$b", "Lco/bird/android/widget/actions/BirdActionsView$d;", "", C17296a.f69688o, "LkE5;", TransferTable.COLUMN_STATE, "b", "", "on", "c", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UC3$b */
    /* loaded from: classes3.dex */
    public static final class C8209b implements BirdActionsView.InterfaceC16615d {
        public C8209b() {
        }

        @Override // co.bird.android.widget.actions.BirdActionsView.InterfaceC16615d
        /* renamed from: a */
        public void mo54326a() {
            UC3.this.f36953e.accept(Unit.INSTANCE);
        }

        @Override // co.bird.android.widget.actions.BirdActionsView.InterfaceC16615d
        /* renamed from: b */
        public void mo54325b(EnumC43785kE5 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            UC3.this.f36956h.accept(state);
        }

        @Override // co.bird.android.widget.actions.BirdActionsView.InterfaceC16615d
        /* renamed from: c */
        public void mo54324c(boolean z) {
            if (z) {
                UC3.this.f36954f.accept(Unit.INSTANCE);
            } else {
                UC3.this.f36955g.accept(Unit.INSTANCE);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LkE5;", "it", "", C17296a.f69688o, "(LkE5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: UC3$c */
    /* loaded from: classes3.dex */
    public static final class C8210c extends Lambda implements Function1<EnumC43785kE5, Boolean> {

        /* renamed from: g */
        public static final C8210c f36964g = new C8210c();

        public C8210c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC43785kE5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == EnumC43785kE5.REQUESTED_LOCK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LkE5;", "it", "", C17296a.f69688o, "(LkE5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: UC3$d */
    /* loaded from: classes3.dex */
    public static final class C8211d extends Lambda implements Function1<EnumC43785kE5, Unit> {

        /* renamed from: g */
        public static final C8211d f36965g = new C8211d();

        public C8211d() {
            super(1);
        }

        /* renamed from: a */
        public final void m81829a(EnumC43785kE5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC43785kE5 enumC43785kE5) {
            m81829a(enumC43785kE5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LkE5;", "it", "", C17296a.f69688o, "(LkE5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: UC3$e */
    /* loaded from: classes3.dex */
    public static final class C8212e extends Lambda implements Function1<EnumC43785kE5, Boolean> {

        /* renamed from: g */
        public static final C8212e f36966g = new C8212e();

        public C8212e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(EnumC43785kE5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == EnumC43785kE5.REQUESTED_UNLOCK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LkE5;", "it", "", C17296a.f69688o, "(LkE5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: UC3$f */
    /* loaded from: classes3.dex */
    public static final class C8213f extends Lambda implements Function1<EnumC43785kE5, Unit> {

        /* renamed from: g */
        public static final C8213f f36967g = new C8213f();

        public C8213f() {
            super(1);
        }

        /* renamed from: a */
        public final void m81827a(EnumC43785kE5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EnumC43785kE5 enumC43785kE5) {
            m81827a(enumC43785kE5);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UC3(BaseActivity activity, C2126F4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f36950b = binding;
        HA3 ha3 = new HA3();
        this.f36951c = ha3;
        C38207ar6 m65377a = C38207ar6.m65377a(binding.f8596d.getRoot());
        Intrinsics.checkNotNullExpressionValue(m65377a, "bind(binding.firmwareUpdate.root)");
        this.f36952d = m65377a;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create()");
        this.f36953e = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create()");
        this.f36954f = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create()");
        this.f36955g = m25409g3;
        C45168ma4<EnumC43785kE5> m25409g4 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g4, "create()");
        this.f36956h = m25409g4;
        this.f36957i = m25409g;
        this.f36958j = m25409g2;
        this.f36959k = m25409g3;
        final C8210c c8210c = C8210c.f36964g;
        Observable<EnumC43785kE5> filter = m25409g4.filter(new InterfaceC23494q() { // from class: QC3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m81853dm;
                m81853dm = UC3.m81853dm(Function1.this, obj);
                return m81853dm;
            }
        });
        final C8211d c8211d = C8211d.f36965g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: RC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m81852em;
                m81852em = UC3.m81852em(Function1.this, obj);
                return m81852em;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "lockStateChanges.filter …ESTED_LOCK }.map { Unit }");
        this.f36960l = map;
        final C8212e c8212e = C8212e.f36966g;
        Observable<EnumC43785kE5> filter2 = m25409g4.filter(new InterfaceC23494q() { // from class: SC3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m81873Fm;
                m81873Fm = UC3.m81873Fm(Function1.this, obj);
                return m81873Fm;
            }
        });
        final C8213f c8213f = C8213f.f36967g;
        Observable map2 = filter2.map(new InterfaceC23492o() { // from class: TC3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m81872Gm;
                m81872Gm = UC3.m81872Gm(Function1.this, obj);
                return m81872Gm;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "lockStateChanges.filter …TED_UNLOCK }.map { Unit }");
        this.f36961m = map2;
        RecyclerView recyclerView = binding.f8599g;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(ha3);
        recyclerView.addOnScrollListener(new C8208a());
        binding.f8594b.setListener(new C8209b());
    }

    /* renamed from: Fm */
    public static final boolean m81873Fm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Gm */
    public static final Unit m81872Gm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: dm */
    public static final boolean m81853dm(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: em */
    public static final Unit m81852em(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: Am */
    public final Observable<Unit> m81878Am() {
        Observable<Unit> merge = Observable.merge(this.f36951c.m104221E(), this.f36950b.f8594b.m54337E());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n    adapter.sleep…ctionsView.wakeClicks\n  )");
        return merge;
    }

    /* renamed from: Bm */
    public final Observable<Unit> m81877Bm() {
        return this.f36951c.m104220F();
    }

    /* renamed from: Cm */
    public final Observable<VehicleSpeedMode> m81876Cm() {
        return this.f36950b.f8594b.m54329M();
    }

    /* renamed from: Dm */
    public final Observable<Unit> m81875Dm() {
        return this.f36951c.m104219H();
    }

    /* renamed from: Em */
    public final Observable<Boolean> m81874Em() {
        return this.f36951c.m104218J();
    }

    /* renamed from: Hm */
    public final Observable<Unit> m81871Hm() {
        return this.f36951c.m104217K();
    }

    /* renamed from: Im */
    public final AbstractC23442F<DialogResponse> m81870Im() {
        return H31.C3014a.dialog$default(this, C31698Aj4.dialog_confirm_unpair, Integer.valueOf(C34722Nh4.continueButton), Integer.valueOf(C34722Nh4.cancelButton), null, null, null, null, null, null, null, null, false, false, false, null, 32760, null);
    }

    /* renamed from: Jm */
    public final Observable<Unit> m81869Jm() {
        Observable<Unit> m104214x = this.f36951c.m104214x();
        Intrinsics.checkNotNullExpressionValue(m104214x, "adapter.nicknameRenameClicks()");
        return m104214x;
    }

    /* renamed from: Tl */
    public final Observable<Unit> m81864Tl() {
        Button button = this.f36952d.f56431b;
        Intrinsics.checkNotNullExpressionValue(button, "firmwareUpdateBinding.cancelUpdate");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ul */
    public final void m81863Ul(boolean z) {
        this.f36951c.m104222D(z);
        this.f36950b.f8594b.m54340B(z);
    }

    /* renamed from: Vl */
    public final Observable<Unit> m81862Vl() {
        Observable<Unit> throttleFirst = this.f36951c.m104216v().throttleFirst(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "adapter.firmwareUpdateCl…irst(1, TimeUnit.SECONDS)");
        return throttleFirst;
    }

    /* renamed from: Wl */
    public final boolean m81861Wl() {
        return this.f36952d.getRoot().isShown();
    }

    /* renamed from: Xl */
    public final Observable<Unit> m81860Xl() {
        return this.f36957i;
    }

    /* renamed from: Yl */
    public final Observable<Unit> m81859Yl() {
        return this.f36959k;
    }

    /* renamed from: Zl */
    public final Observable<Unit> m81858Zl() {
        return this.f36958j;
    }

    /* renamed from: am */
    public final Observable<Unit> m81857am() {
        return this.f36960l;
    }

    /* renamed from: b */
    public final void m81856b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f36951c.mo24871u(sections);
    }

    /* renamed from: bm */
    public final Observable<Unit> m81855bm() {
        return this.f36961m;
    }

    /* renamed from: cm */
    public final boolean m81854cm() {
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return !c51916xx1.m4389w(locale);
    }

    /* renamed from: fm */
    public final Observable<Unit> m81851fm() {
        return this.f36951c.m104213y();
    }

    /* renamed from: gm */
    public final void m81850gm() {
        getActivity().recreate();
    }

    /* renamed from: hm */
    public final Observable<Unit> m81849hm() {
        return this.f36951c.m104225A();
    }

    /* renamed from: im */
    public final Observable<Unit> m81848im() {
        return this.f36951c.m104224B();
    }

    /* renamed from: jm */
    public final Observable<Unit> m81847jm() {
        return this.f36951c.m104223C();
    }

    /* renamed from: km */
    public final void m81846km(boolean z) {
        this.f36950b.f8594b.setLightState(z);
    }

    /* renamed from: lm */
    public final void m81845lm(boolean z) {
        this.f36950b.f8594b.setSleeping(z);
    }

    /* renamed from: mm */
    public final void m81844mm(boolean z) {
        this.f36950b.f8594b.setLocked(z);
    }

    /* renamed from: nm */
    public final void m81843nm(boolean z) {
        BirdActionsView birdActionsView = this.f36950b.f8594b;
        Intrinsics.checkNotNullExpressionValue(birdActionsView, "binding.actionsView");
        C49520tu6.show$default(birdActionsView, z, 0, 2, null);
        TextView textView = this.f36950b.f8598f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.moreText");
        C49520tu6.show$default(textView, z, 0, 2, null);
        ImageView imageView = this.f36950b.f8597e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.moreIcon");
        C49520tu6.show$default(imageView, z, 0, 2, null);
    }

    /* renamed from: om */
    public final void m81842om(boolean z) {
        this.f36950b.f8594b.m54334H(z);
    }

    /* renamed from: pm */
    public final void m81841pm(int i) {
        this.f36950b.f8594b.m54330L(i);
    }

    /* renamed from: qm */
    public final AbstractC23442F<H31.AbstractC3016b> m81840qm(String currentName) {
        Intrinsics.checkNotNullParameter(currentName, "currentName");
        return H31.C3014a.dialogWithInput$default(this, getString(C45871nl4.retail_rename_bird_air_title, new Object[0]), getString(C45871nl4.retail_rename_bird_air_content, new Object[0]), "", currentName, null, getString(C45871nl4.destination_selection_set_button, new Object[0]), getString(C45871nl4.dialog_id_tools_confirm_cancel, new Object[0]), true, true, true, 16, null);
    }

    /* renamed from: rm */
    public final AbstractC23442F<DialogResponse> m81839rm() {
        return H31.C3014a.dialog$default(this, C45051mN4.f97931d, false, false, 6, null);
    }

    /* renamed from: sm */
    public final void m81838sm(boolean z, boolean z2) {
        RelativeLayout root = this.f36952d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "firmwareUpdateBinding.root");
        C49520tu6.show$default(root, z, 0, 2, null);
        Button button = this.f36952d.f56431b;
        Intrinsics.checkNotNullExpressionValue(button, "firmwareUpdateBinding.cancelUpdate");
        C49520tu6.show$default(button, z2, 0, 2, null);
        Button button2 = this.f36952d.f56432c;
        Intrinsics.checkNotNullExpressionValue(button2, "firmwareUpdateBinding.continueUpdate");
        C49520tu6.m11239l(button2);
        this.f36952d.f56435f.setText(getActivity().getString(C45871nl4.retail_firmware_updating_title));
    }

    /* renamed from: tm */
    public final void m81837tm(float f) {
        this.f36952d.f56436g.setProgress(f);
    }

    /* renamed from: um */
    public final void m81836um() {
        RelativeLayout root = this.f36952d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "firmwareUpdateBinding.root");
        C49520tu6.show$default(root, true, 0, 2, null);
        Button button = this.f36952d.f56431b;
        Intrinsics.checkNotNullExpressionValue(button, "firmwareUpdateBinding.cancelUpdate");
        C49520tu6.m11239l(button);
        Button button2 = this.f36952d.f56432c;
        Intrinsics.checkNotNullExpressionValue(button2, "firmwareUpdateBinding.continueUpdate");
        C49520tu6.m11239l(button2);
        this.f36952d.f56435f.setText(getActivity().getString(C45871nl4.retail_firmware_success_body));
    }

    /* renamed from: vm */
    public final AbstractC23442F<H31.AbstractC3016b> m81835vm() {
        return H31.C3014a.dialogWithInput$default(this, getString(C45871nl4.retail_firmware_bird_air_input_passcode, new Object[0]), null, "00", "", 2, getString(C45871nl4.general_next_button, new Object[0]), null, false, true, true, 66, null);
    }

    /* renamed from: wm */
    public final void m81834wm(boolean z) {
        this.f36950b.f8594b.m54333I(z);
    }

    /* renamed from: xm */
    public final AbstractC23442F<DialogResponse> m81833xm() {
        RelativeLayout root = this.f36952d.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "firmwareUpdateBinding.root");
        C49520tu6.show$default(root, true, 0, 2, null);
        Button button = this.f36952d.f56431b;
        Intrinsics.checkNotNullExpressionValue(button, "firmwareUpdateBinding.cancelUpdate");
        C49520tu6.m11239l(button);
        Button button2 = this.f36952d.f56432c;
        Intrinsics.checkNotNullExpressionValue(button2, "firmwareUpdateBinding.continueUpdate");
        C49520tu6.m11239l(button2);
        return dialog(C6758QI.f30186d, false, true);
    }

    /* renamed from: ym */
    public final void m81832ym(boolean z) {
        this.f36950b.f8594b.m54332J(z);
    }

    /* renamed from: zm */
    public final AbstractC23442F<DialogResponse> m81831zm() {
        return H31.C3014a.dialog$default(this, C31698Aj4.dialog_confirm_sleep, Integer.valueOf(C34722Nh4.continueButton), Integer.valueOf(C34722Nh4.cancelButton), null, null, null, null, null, null, null, null, false, false, false, null, 32760, null);
    }
}
