package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.OrderItemType;
import co.bird.android.model.wire.WireTransferOrderFilter;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import co.bird.android.widget.OperatorMapFilterButtonView;
import com.facebook.share.internal.C17296a;
import com.google.android.material.datepicker.C17780c;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24516r;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.InterfaceC36740Vx6;
import p000.K86;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018B\u0019\b\u0007\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b5\u00106J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0003J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bJ\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00070\u0013J \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000e0\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00069"}, m28432d2 = {"LK86;", "LxE;", "LVx6;", "Lio/reactivex/Observable;", "", "Pl", "e1", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/OrderItemType;", "Ql", "", "enable", "Rl", "", "LH6;", "sections", "b", "h", "Lio/reactivex/p;", "Sl", "show", "Ul", "Lorg/joda/time/DateTime;", "Tl", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "enabledFilters", "Lio/reactivex/F;", "Vl", "", "numEnabled", "Z2", "Ln6;", "Ln6;", "binding", "LVl2;", "c", "LVl2;", "adapter", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ln6;)V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K86 */
/* loaded from: classes3.dex */
public final class K86 extends AbstractC30071xE implements InterfaceC36740Vx6 {

    /* renamed from: d */
    public static final C4357a f19162d = new C4357a(null);

    /* renamed from: b */
    public final C26359n6 f19163b;

    /* renamed from: c */
    public final C36628Vl2 f19164c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LK86$a;", "", "", "MATERIAL_DATE_PICKER_TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: K86$a */
    /* loaded from: classes3.dex */
    public static final class C4357a {
        public /* synthetic */ C4357a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4357a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/r;", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "emitter", "", "invoke", "(Lio/reactivex/r;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K86$b */
    /* loaded from: classes3.dex */
    public static final class C4358b extends Lambda implements Function1<InterfaceC24516r<Pair<? extends DateTime, ? extends DateTime>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042F\u0010\u0003\u001aB\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002* \u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LsE3;", "", "kotlin.jvm.PlatformType", "pair", "", C17296a.f69688o, "(LsE3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: K86$b$a */
        /* loaded from: classes3.dex */
        public static final class C4359a extends Lambda implements Function1<C48526sE3<Long, Long>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC24516r<Pair<DateTime, DateTime>> f19166g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4359a(InterfaceC24516r<Pair<DateTime, DateTime>> interfaceC24516r) {
                super(1);
                this.f19166g = interfaceC24516r;
            }

            /* renamed from: a */
            public final void m99151a(C48526sE3<Long, Long> c48526sE3) {
                long longValue;
                DateTimeZone dateTimeZone = DateTimeZone.getDefault();
                Long l = c48526sE3.f108491a;
                long j = 0;
                if (l == null) {
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                Long l2 = c48526sE3.f108491a;
                Intrinsics.checkNotNullExpressionValue(l2, "pair.first");
                DateTime plusMillis = new DateTime(l2.longValue(), DateTimeZone.getDefault()).plusMillis(-dateTimeZone.getOffset(longValue));
                DateTimeZone dateTimeZone2 = DateTimeZone.getDefault();
                Long l3 = c48526sE3.f108492b;
                if (l3 != null) {
                    j = l3.longValue();
                }
                Long l4 = c48526sE3.f108492b;
                Intrinsics.checkNotNullExpressionValue(l4, "pair.second");
                this.f19166g.onSuccess(TuplesKt.m28425to(plusMillis, new DateTime(l4.longValue(), DateTimeZone.getDefault()).plusMillis(-dateTimeZone2.getOffset(j))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C48526sE3<Long, Long> c48526sE3) {
                m99151a(c48526sE3);
                return Unit.INSTANCE;
            }
        }

        public C4358b() {
            super(1);
        }

        /* renamed from: d */
        public static final void m99154d(InterfaceC24516r emitter, DialogInterface dialogInterface) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onComplete();
        }

        /* renamed from: e */
        public static final void m99153e(InterfaceC24516r emitter, View view) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onComplete();
        }

        /* renamed from: f */
        public static final void m99152f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24516r<Pair<? extends DateTime, ? extends DateTime>> interfaceC24516r) {
            invoke2((InterfaceC24516r<Pair<DateTime, DateTime>>) interfaceC24516r);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC24516r<Pair<DateTime, DateTime>> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C17780c<C48526sE3<Long, Long>> m49620a = C17780c.C17787g.m49617d().m49615f(K86.this.getActivity().getString(C45871nl4.transfer_order_select_date_label)).m49620a();
            Intrinsics.checkNotNullExpressionValue(m49620a, "dateRangePicker()\n      …_label))\n        .build()");
            m49620a.m49640G9(new DialogInterface.OnCancelListener() { // from class: L86
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    K86.C4358b.m99154d(InterfaceC24516r.this, dialogInterface);
                }
            });
            m49620a.m49639I9(new View.OnClickListener() { // from class: M86
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    K86.C4358b.m99153e(InterfaceC24516r.this, view);
                }
            });
            final C4359a c4359a = new C4359a(emitter);
            m49620a.m49638J9(new MM2() { // from class: N86
                @Override // p000.MM2
                /* renamed from: a */
                public final void mo28922a(Object obj) {
                    K86.C4358b.m99152f(Function1.this, obj);
                }
            });
            m49620a.show(K86.this.getActivity().getSupportFragmentManager(), "MaterialDatePicker");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K86(BaseActivity activity, C26359n6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f19163b = binding;
        C36628Vl2 c36628Vl2 = new C36628Vl2();
        this.f19164c = c36628Vl2;
        binding.f99359i.setAdapter(c36628Vl2);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC36740Vx6.C8882a.m79075a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC36740Vx6.C8882a.m79073c(this, user);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC36740Vx6.C8882a.m79067i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC36740Vx6.C8882a.m79070f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        BlockingEnterLocationView blockingEnterLocationView = this.f19163b.f99352b;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        return blockingEnterLocationView;
    }

    /* renamed from: Pl */
    public final Observable<Unit> m99168Pl() {
        return this.f19164c.m79453w();
    }

    /* renamed from: Ql */
    public final Observable<Pair<String, OrderItemType>> m99167Ql() {
        return this.f19164c.m79452x();
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f19163b.f99352b.m54752a();
    }

    /* renamed from: Rl */
    public final void m99166Rl(boolean z) {
        this.f19163b.f99356f.setEnabled(z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC36740Vx6.C8882a.m79072d(this, warehouse);
    }

    /* renamed from: Sl */
    public final AbstractC24507p<String> m99165Sl() {
        String string = getActivity().getString(C45871nl4.transfer_order_scan_instructions);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…_order_scan_instructions)");
        X86 m77287a = X86.f42725g.m77287a(string);
        m77287a.show(getActivity().getSupportFragmentManager(), "TransferOrderScanBottomSheet");
        return m77287a.m77289a5();
    }

    /* renamed from: Tl */
    public final AbstractC24507p<Pair<DateTime, DateTime>> m99164Tl() {
        return C45832nh5.m23309g(new C4358b());
    }

    /* renamed from: Ul */
    public final void m99163Ul(boolean z) {
        Group group = this.f19163b.f99353c;
        Intrinsics.checkNotNullExpressionValue(group, "binding.containerOrderScanGroup");
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    /* renamed from: Vl */
    public final AbstractC23442F<List<WireTransferOrderFilter>> m99162Vl(List<WireTransferOrderFilter> enabledFilters) {
        Intrinsics.checkNotNullParameter(enabledFilters, "enabledFilters");
        C44323l86 m27747a = C44323l86.f95626k.m27747a(enabledFilters);
        m27747a.show(getActivity().getSupportFragmentManager(), "TransferOrderLandingFiltersBottomSheet");
        return m27747a.m27749a5();
    }

    /* renamed from: Z2 */
    public final void m99161Z2(int i) {
        this.f19163b.f99355e.setNumFiltersApplied(i);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC36740Vx6.C8882a.m79068h(this, z);
    }

    /* renamed from: b */
    public final void m99160b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f19164c.mo24871u(sections);
    }

    /* renamed from: e1 */
    public final Observable<Unit> m99159e1() {
        OperatorMapFilterButtonView operatorMapFilterButtonView = this.f19163b.f99355e;
        Intrinsics.checkNotNullExpressionValue(operatorMapFilterButtonView, "binding.filters");
        return C44626lf5.clicksThrottle$default(operatorMapFilterButtonView, 0L, 1, null);
    }

    /* renamed from: h */
    public final Observable<Unit> m99158h() {
        Button button = this.f19163b.f99356f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.footerButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        OperatorInfoCard operatorInfoCard = this.f19163b.f99358h;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        return operatorInfoCard;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC36740Vx6.C8882a.m79069g(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return InterfaceC36740Vx6.C8882a.m79074b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC36740Vx6.C8882a.m79071e(this, str);
    }
}
