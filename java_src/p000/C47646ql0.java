package p000;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import co.bird.android.widget.InterfaceC16662d;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24567g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC48831sl0;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002,\u0019B\u0007¢\u0006\u0004\b)\u0010*J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00140\u00140$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, m28432d2 = {"Lql0;", "Lac5;", "Lwl0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lxl0;", TransferTable.COLUMN_STATE, "S9", "Lio/reactivex/h;", "T0", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "s", "Lio/reactivex/F;", "T9", "Lvl0;", "b", "Lvl0;", "E9", "()Lvl0;", "setPresenter", "(Lvl0;)V", "presenter", "LJZ;", "c", "LJZ;", "binding", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/g;", "reasonSingle", "<init>", "()V", "e", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCloseIncompleteBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseIncompleteBottomSheet.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/CloseIncompleteBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Rx+.kt\nco/bird/android/library/rx/Rx_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,128:1\n180#2:129\n199#2:132\n641#3,2:130\n64#4:133\n1549#5:134\n1620#5,3:135\n*S KotlinDebug\n*F\n+ 1 CloseIncompleteBottomSheet.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/CloseIncompleteBottomSheet\n*L\n67#1:129\n75#1:132\n71#1:130,2\n92#1:133\n99#1:134\n99#1:135,3\n*E\n"})
/* renamed from: ql0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47646ql0 extends AbstractC38056ac5 implements InterfaceC51202wl0 {

    /* renamed from: e */
    public static final C27667b f105721e = new C27667b(null);

    /* renamed from: b */
    public C50609vl0 f105722b;

    /* renamed from: c */
    public C4144JZ f105723c;

    /* renamed from: d */
    public final C24567g<WireTransferOrderClosedIncompleteReason> f105724d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lql0$a;", "Lco/bird/android/widget/d;", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "b", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "f", "()Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reason", "", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "textString", "<init>", "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ql0$a */
    /* loaded from: classes3.dex */
    public static final class C27666a implements InterfaceC16662d {

        /* renamed from: b */
        public final WireTransferOrderClosedIncompleteReason f105725b;

        /* renamed from: c */
        public final String f105726c;

        public C27666a(WireTransferOrderClosedIncompleteReason reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f105725b = reason;
            this.f105726c = reason.getTitle();
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: a */
        public Integer mo13236a() {
            return InterfaceC16662d.C16663a.m54044i(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: b */
        public boolean mo13235b() {
            return InterfaceC16662d.C16663a.m54052a(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: c */
        public Integer mo13234c() {
            return InterfaceC16662d.C16663a.m54048e(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: d */
        public String mo13233d() {
            return InterfaceC16662d.C16663a.m54047f(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: e */
        public String mo13232e() {
            return this.f105726c;
        }

        /* renamed from: f */
        public final WireTransferOrderClosedIncompleteReason m17150f() {
            return this.f105725b;
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: g */
        public String mo13230g() {
            return InterfaceC16662d.C16663a.m54045h(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        public Integer getColor() {
            return InterfaceC16662d.C16663a.m54051b(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        public Integer getIcon() {
            return InterfaceC16662d.C16663a.m54050c(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: h */
        public Integer mo13229h() {
            return InterfaceC16662d.C16663a.m54049d(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: i */
        public Integer mo13228i() {
            return InterfaceC16662d.C16663a.m54046g(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"Lql0$b;", "", "", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "reasons", "Lql0;", C17296a.f69688o, "", "REASONS", "Ljava/lang/String;", "TAG", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ql0$b */
    /* loaded from: classes3.dex */
    public static final class C27667b {
        public /* synthetic */ C27667b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C47646ql0 m17149a(List<WireTransferOrderClosedIncompleteReason> reasons) {
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            C47646ql0 c47646ql0 = new C47646ql0();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("reasons", C44691lm0.m26849a(reasons));
            c47646ql0.setArguments(bundle);
            return c47646ql0;
        }

        private C27667b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "", "test", "(Ljava/lang/Object;)Z", "Yf5$c", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$1\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: ql0$c */
    /* loaded from: classes3.dex */
    public static final class C27668c<T> implements InterfaceC23494q {

        /* renamed from: b */
        public static final C27668c<T> f105727b = new C27668c<>();

        @Override // io.reactivex.functions.InterfaceC23494q
        public final boolean test(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item instanceof C49489tr5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"", "K", "item", "kotlin.jvm.PlatformType", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "Yf5$d", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRx+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rx+.kt\nco/bird/android/library/rx/Rx_Kt$filterInstance$2\n*L\n1#1,644:1\n*E\n"})
    /* renamed from: ql0$d */
    /* loaded from: classes3.dex */
    public static final class C27669d<T, R> implements InterfaceC23492o {

        /* renamed from: b */
        public static final C27669d<T, R> f105728b = new C27669d<>();

        @Override // io.reactivex.functions.InterfaceC23492o
        public final C49489tr5 apply(Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return (C49489tr5) item;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ql0$e */
    /* loaded from: classes3.dex */
    public static final class C27670e extends Lambda implements Function1<Unit, Unit> {
        public C27670e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            Dialog dialog = C47646ql0.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Ltr5;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ql0$f */
    /* loaded from: classes3.dex */
    public static final class C27671f extends Lambda implements Function1<Pair<? extends Unit, ? extends C49489tr5>, WireTransferOrderClosedIncompleteReason> {

        /* renamed from: g */
        public static final C27671f f105730g = new C27671f();

        public C27671f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireTransferOrderClosedIncompleteReason invoke(Pair<Unit, C49489tr5> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return pair.component2().m11590b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ql0$g */
    /* loaded from: classes3.dex */
    public static final class C27672g extends Lambda implements Function1<WireTransferOrderClosedIncompleteReason, Unit> {
        public C27672g() {
            super(1);
        }

        /* renamed from: a */
        public final void m17147a(WireTransferOrderClosedIncompleteReason wireTransferOrderClosedIncompleteReason) {
            Dialog dialog = C47646ql0.this.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireTransferOrderClosedIncompleteReason wireTransferOrderClosedIncompleteReason) {
            m17147a(wireTransferOrderClosedIncompleteReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ql0$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C27673h extends FunctionReferenceImpl implements Function1<WireTransferOrderClosedIncompleteReason, Unit> {
        public C27673h(Object obj) {
            super(1, obj, C24567g.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m17146a(WireTransferOrderClosedIncompleteReason p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24567g) this.receiver).onSuccess(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireTransferOrderClosedIncompleteReason wireTransferOrderClosedIncompleteReason) {
            m17146a(wireTransferOrderClosedIncompleteReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lql0$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCloseIncompleteBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseIncompleteBottomSheet.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/CloseIncompleteBottomSheet$reasonSelects$1\n+ 2 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,128:1\n64#2,9:129\n73#2,4:142\n819#3:138\n847#3:139\n848#3:141\n66#4:140\n*S KotlinDebug\n*F\n+ 1 CloseIncompleteBottomSheet.kt\nco/bird/android/feature/transferorder/operatorallocationdetails/dialogs/CloseIncompleteBottomSheet$reasonSelects$1\n*L\n104#1:129,9\n104#1:142,4\n104#1:138\n104#1:139\n104#1:141\n104#1:140\n*E\n"})
    /* renamed from: ql0$i */
    /* loaded from: classes3.dex */
    public static final class C27674i extends Lambda implements Function1<Unit, InterfaceC24574u<? extends C27666a>> {

        /* renamed from: h */
        public final /* synthetic */ List<C27666a> f105733h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lco/bird/android/widget/d;", "co/bird/android/widget/a$n"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$2$1\n*L\n1#1,108:1\n*E\n"})
        /* renamed from: ql0$i$a */
        /* loaded from: classes3.dex */
        public static final class C27675a extends Lambda implements Function1<Integer, C27666a> {

            /* renamed from: g */
            public final /* synthetic */ List f105734g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27675a(List list) {
                super(1);
                this.f105734g = list;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [ql0$a, co.bird.android.widget.d] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C27666a invoke(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (InterfaceC16662d) this.f105734g.get(it.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27674i(List<C27666a> list) {
            super(1);
            this.f105733h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C27666a> invoke(Unit it) {
            AppCompatActivity appCompatActivity;
            Intrinsics.checkNotNullParameter(it, "it");
            FragmentActivity activity = C47646ql0.this.getActivity();
            if (activity instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) activity;
            } else {
                appCompatActivity = null;
            }
            if (appCompatActivity == null) {
                return null;
            }
            List<C27666a> list = this.f105733h;
            BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.NORMAL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC16662d interfaceC16662d = (InterfaceC16662d) obj;
                arrayList.add(obj);
            }
            C16664e c16664e = new C16664e();
            c16664e.setArguments(C16597a.m54345a(enumC16469a, null, null, 8388611, arrayList));
            c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
            InterfaceC24574u m32067H = c16664e.m54040D9().m32067H(new C16597a.C16598a(new C27675a(arrayList)));
            Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
            return m32067H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lql0$a;", "option", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lql0$a;)Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ql0$j */
    /* loaded from: classes3.dex */
    public static final class C27676j extends Lambda implements Function1<C27666a, WireTransferOrderClosedIncompleteReason> {

        /* renamed from: g */
        public static final C27676j f105735g = new C27676j();

        public C27676j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireTransferOrderClosedIncompleteReason invoke(C27666a option) {
            Intrinsics.checkNotNullParameter(option, "option");
            return option.m17150f();
        }
    }

    public C47646ql0() {
        C24567g<WireTransferOrderClosedIncompleteReason> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<WireTransferOrderClosedIncompleteReason>()");
        this.f105724d = m31882w0;
    }

    /* renamed from: G9 */
    public static final WireTransferOrderClosedIncompleteReason m17159G9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireTransferOrderClosedIncompleteReason) tmp0.invoke(obj);
    }

    /* renamed from: I9 */
    public static final void m17158I9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J9 */
    public static final InterfaceC24574u m17157J9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: P9 */
    public static final WireTransferOrderClosedIncompleteReason m17155P9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireTransferOrderClosedIncompleteReason) tmp0.invoke(obj);
    }

    public static final void onViewCreated$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onViewCreated$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E9 */
    public final C50609vl0 m17160E9() {
        C50609vl0 c50609vl0 = this.f105722b;
        if (c50609vl0 != null) {
            return c50609vl0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S9 */
    public void render(AbstractC51795xl0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C49489tr5) {
            C4144JZ c4144jz = this.f105723c;
            C4144JZ c4144jz2 = null;
            if (c4144jz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c4144jz = null;
            }
            c4144jz.f17792e.setText(((C49489tr5) state).m11590b().getTitle());
            C4144JZ c4144jz3 = this.f105723c;
            if (c4144jz3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c4144jz2 = c4144jz3;
            }
            c4144jz2.f17789b.setEnabled(true);
        }
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: T9 */
    public final AbstractC23442F<WireTransferOrderClosedIncompleteReason> m17153T9() {
        AbstractC23442F<WireTransferOrderClosedIncompleteReason> m33160F = this.f105724d.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "reasonSingle.hide()");
        return m33160F;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        return C4144JZ.m100221c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C4144JZ m100223a = C4144JZ.m100223a(view);
        Intrinsics.checkNotNullExpressionValue(m100223a, "bind(view)");
        this.f105723c = m100223a;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC48831sl0.InterfaceC28379a m99052a = KH0.m99052a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        m99052a.mo13715a(c46172oG2.m21419a(application)).mo13716a(this);
        C4144JZ c4144jz = this.f105723c;
        if (c4144jz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c4144jz = null;
        }
        Button button = c4144jz.f17791d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        Object m33094as = C44626lf5.clicksThrottle$default(button, 0L, 1, null).m33094as(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27670e c27670e = new C27670e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kl0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47646ql0.onViewCreated$lambda$0(Function1.this, obj);
            }
        });
        C4144JZ c4144jz2 = this.f105723c;
        if (c4144jz2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c4144jz2 = null;
        }
        Button button2 = c4144jz2.f17789b;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.accept");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button2, 0L, 1, null);
        InterfaceC23434B map = m17160E9().m42276l().filter(C27668c.f105727b).map(C27669d.f105728b);
        Intrinsics.checkNotNullExpressionValue(map, "filter { item -> item is…map { item -> item as K }");
        Observable m31950a = C24527f.m31950a(clicksThrottle$default, map);
        final C27671f c27671f = C27671f.f105730g;
        AbstractC23442F firstOrError = m31950a.map(new InterfaceC23492o() { // from class: ll0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireTransferOrderClosedIncompleteReason m17159G9;
                m17159G9 = C47646ql0.m17159G9(Function1.this, obj);
                return m17159G9;
            }
        }).firstOrError();
        final C27672g c27672g = new C27672g();
        AbstractC23442F m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: ml0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47646ql0.onViewCreated$lambda$2(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun onViewCreat…esenter.consume(this)\n  }");
        Object m33135e = m33101w.m33135e(AutoDispose.m45239a(this));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27673h c27673h = new C27673h(this.f105724d);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: nl0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47646ql0.m17158I9(Function1.this, obj);
            }
        });
        m17160E9().consume(this);
    }

    @Override // p000.InterfaceC51202wl0
    /* renamed from: s */
    public Observable<WireTransferOrderClosedIncompleteReason> mo6408s() {
        List list;
        int collectionSizeOrDefault;
        Bundle arguments = getArguments();
        if (arguments != null) {
            list = arguments.getParcelableArrayList("reasons");
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List<WireTransferOrderClosedIncompleteReason> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireTransferOrderClosedIncompleteReason reason : list2) {
            Intrinsics.checkNotNullExpressionValue(reason, "reason");
            arrayList.add(new C27666a(reason));
        }
        C4144JZ c4144jz = this.f105723c;
        if (c4144jz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c4144jz = null;
        }
        Button button = c4144jz.f17792e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.closeIncompleteReason");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C27674i c27674i = new C27674i(arrayList);
        Observable flatMapMaybe = clicksThrottle$default.flatMapMaybe(new InterfaceC23492o() { // from class: ol0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m17157J9;
                m17157J9 = C47646ql0.m17157J9(Function1.this, obj);
                return m17157J9;
            }
        });
        final C27676j c27676j = C27676j.f105735g;
        Observable<WireTransferOrderClosedIncompleteReason> map = flatMapMaybe.map(new InterfaceC23492o() { // from class: pl0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireTransferOrderClosedIncompleteReason m17155P9;
                m17155P9 = C47646ql0.m17155P9(Function1.this, obj);
                return m17155P9;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun reasonSelec…on -> option.reason }\n  }");
        return map;
    }
}
