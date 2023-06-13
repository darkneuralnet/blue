package p000;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import co.bird.android.widget.InterfaceC16662d;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C32451Dp1;
import p000.InterfaceC32919Fp1;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002B\u001bB\u0007¢\u0006\u0004\b?\u0010@J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0016R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010<\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u00140\u0014088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010>\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u00160\u0016088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;¨\u0006C"}, m28432d2 = {"LDp1;", "Landroidx/fragment/app/Fragment;", "Lgq1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Llq1;", TransferTable.COLUMN_STATE, "G9", "Lio/reactivex/h;", "T0", "Lio/reactivex/Observable;", "", "d5", "Lco/bird/android/model/constant/FleetReportPage;", "e4", "Lco/bird/android/model/persistence/FleetReportPeriod;", "k2", "Laq1;", "b", "Laq1;", "B9", "()Laq1;", "setPresenter", "(Laq1;)V", "presenter", "Ley1;", "c", "Ley1;", "t8", "()Ley1;", "I9", "(Ley1;)V", "binding", "Lxp1;", DateTokenConverter.CONVERTER_KEY, "Lxp1;", "converter", "Lrp1;", "e", "Lrp1;", "adapter", "Lsx4;", "f", "Lkotlin/Lazy;", "A9", "()Lsx4;", "delegate", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "fleetIdSubject", "h", "fleetPageSubject", "<init>", "()V", "i", C17296a.f69688o, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportFragment.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,150:1\n1#2:151\n1#2:153\n6#3:152\n13#4,2:154\n15#4,2:158\n1109#5,2:156\n64#6:160\n*S KotlinDebug\n*F\n+ 1 FleetReportFragment.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportFragment\n*L\n89#1:153\n89#1:152\n89#1:154,2\n89#1:158,2\n89#1:156,2\n102#1:160\n*E\n"})
/* renamed from: Dp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32451Dp1 extends Fragment implements InterfaceC41767gq1 {

    /* renamed from: i */
    public static final C1621a f6383i = new C1621a(null);
    @SuppressLint({"ConstantLocale"})

    /* renamed from: j */
    public static final SimpleDateFormat f6384j = new SimpleDateFormat("MMM dd", Locale.getDefault());

    /* renamed from: b */
    public C38192aq1 f6385b;

    /* renamed from: c */
    public C40661ey1 f6386c;

    /* renamed from: d */
    public final C51836xp1 f6387d = new C51836xp1();

    /* renamed from: e */
    public final C48280rp1 f6388e = new C48280rp1();

    /* renamed from: f */
    public final Lazy f6389f;

    /* renamed from: g */
    public final C24558d<String> f6390g;

    /* renamed from: h */
    public final C24558d<FleetReportPage> f6391h;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"LDp1$a;", "", "", "fleetId", "Lco/bird/android/model/constant/FleetReportPage;", "page", "LDp1;", C17296a.f69688o, "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "PAGE", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dp1$a */
    /* loaded from: classes3.dex */
    public static final class C1621a {
        public /* synthetic */ C1621a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32451Dp1 m109885a(String fleetId, FleetReportPage page) {
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            Intrinsics.checkNotNullParameter(page, "page");
            C32451Dp1 c32451Dp1 = new C32451Dp1();
            Bundle bundle = new Bundle();
            bundle.putString("fleet_id", fleetId);
            C40749f70.m42020a(bundle, "page", page);
            c32451Dp1.setArguments(bundle);
            return c32451Dp1;
        }

        private C1621a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LDp1$b;", "Lco/bird/android/widget/d;", "", "textString", "subtitleStr", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "f", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "g", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/FleetReportPeriod;", "j", "()Lco/bird/android/model/persistence/FleetReportPeriod;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/FleetReportPeriod;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dp1$b */
    /* loaded from: classes3.dex */
    public static final class C1622b implements InterfaceC16662d {

        /* renamed from: b */
        public final String f6392b;

        /* renamed from: c */
        public final String f6393c;

        /* renamed from: d */
        public final FleetReportPeriod f6394d;

        public C1622b(String textString, String str, FleetReportPeriod period) {
            Intrinsics.checkNotNullParameter(textString, "textString");
            Intrinsics.checkNotNullParameter(period, "period");
            this.f6392b = textString;
            this.f6393c = str;
            this.f6394d = period;
        }

        public static /* synthetic */ C1622b copy$default(C1622b c1622b, String str, String str2, FleetReportPeriod fleetReportPeriod, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c1622b.f6392b;
            }
            if ((i & 2) != 0) {
                str2 = c1622b.f6393c;
            }
            if ((i & 4) != 0) {
                fleetReportPeriod = c1622b.f6394d;
            }
            return c1622b.m109884f(str, str2, fleetReportPeriod);
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
            return this.f6392b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1622b) {
                C1622b c1622b = (C1622b) obj;
                return Intrinsics.areEqual(this.f6392b, c1622b.f6392b) && Intrinsics.areEqual(this.f6393c, c1622b.f6393c) && Intrinsics.areEqual(this.f6394d, c1622b.f6394d);
            }
            return false;
        }

        /* renamed from: f */
        public final C1622b m109884f(String textString, String str, FleetReportPeriod period) {
            Intrinsics.checkNotNullParameter(textString, "textString");
            Intrinsics.checkNotNullParameter(period, "period");
            return new C1622b(textString, str, period);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: g */
        public String mo13230g() {
            return this.f6393c;
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

        public int hashCode() {
            int hashCode = this.f6392b.hashCode() * 31;
            String str = this.f6393c;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f6394d.hashCode();
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: i */
        public Integer mo13228i() {
            return InterfaceC16662d.C16663a.m54046g(this);
        }

        /* renamed from: j */
        public final FleetReportPeriod m109883j() {
            return this.f6394d;
        }

        public String toString() {
            String str = this.f6392b;
            String str2 = this.f6393c;
            FleetReportPeriod fleetReportPeriod = this.f6394d;
            return "ReportingPeriodSelection(textString=" + str + ", subtitleStr=" + str2 + ", period=" + fleetReportPeriod + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dp1$c */
    /* loaded from: classes3.dex */
    public static final class C1623c extends Lambda implements Function0<C48955sx4> {
        public C1623c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            FragmentActivity activity = C32451Dp1.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return new C48955sx4((AppCompatActivity) activity);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "<anonymous parameter 0>", "Llq1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lkotlin/Unit;Llq1;)Llq1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dp1$d */
    /* loaded from: classes3.dex */
    public static final class C1624d extends Lambda implements Function2<Unit, C44732lq1, C44732lq1> {

        /* renamed from: g */
        public static final C1624d f6396g = new C1624d();

        public C1624d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final C44732lq1 invoke(Unit unit, C44732lq1 state) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(state, "state");
            return state;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Llq1;", TransferTable.COLUMN_STATE, "Lio/reactivex/u;", "Lco/bird/android/model/persistence/FleetReportPeriod;", "kotlin.jvm.PlatformType", "b", "(Llq1;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportFragment.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportFragment$periodSelected$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,150:1\n1549#2:151\n1620#2,3:152\n819#2:164\n847#2:165\n848#2:167\n64#3,9:155\n73#3,4:168\n66#4:166\n*S KotlinDebug\n*F\n+ 1 FleetReportFragment.kt\nco/bird/android/feature/fleetstatus/kpi/core/FleetReportFragment$periodSelected$2\n*L\n111#1:151\n111#1:152,3\n122#1:164\n122#1:165\n122#1:167\n122#1:155,9\n122#1:168,4\n122#1:166\n*E\n"})
    /* renamed from: Dp1$e */
    /* loaded from: classes3.dex */
    public static final class C1625e extends Lambda implements Function1<C44732lq1, InterfaceC24574u<? extends FleetReportPeriod>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LDp1$b;", "option", "Lco/bird/android/model/persistence/FleetReportPeriod;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LDp1$b;)Lco/bird/android/model/persistence/FleetReportPeriod;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Dp1$e$a */
        /* loaded from: classes3.dex */
        public static final class C1626a extends Lambda implements Function1<C1622b, FleetReportPeriod> {

            /* renamed from: g */
            public static final C1626a f6398g = new C1626a();

            public C1626a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final FleetReportPeriod invoke(C1622b option) {
                Intrinsics.checkNotNullParameter(option, "option");
                return option.m109883j();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lco/bird/android/widget/d;", "co/bird/android/widget/a$n"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$2$1\n*L\n1#1,108:1\n*E\n"})
        /* renamed from: Dp1$e$b */
        /* loaded from: classes3.dex */
        public static final class C1627b extends Lambda implements Function1<Integer, C1622b> {

            /* renamed from: g */
            public final /* synthetic */ List f6399g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1627b(List list) {
                super(1);
                this.f6399g = list;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [Dp1$b, co.bird.android.widget.d] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C1622b invoke(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (InterfaceC16662d) this.f6399g.get(it.intValue());
            }
        }

        public C1625e() {
            super(1);
        }

        /* renamed from: c */
        public static final FleetReportPeriod m109878c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (FleetReportPeriod) tmp0.invoke(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            if (r9 == null) goto L20;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC24574u<? extends FleetReportPeriod> invoke(C44732lq1 state) {
            int collectionSizeOrDefault;
            AppCompatActivity appCompatActivity;
            AbstractC24507p m32024u;
            Intrinsics.checkNotNullParameter(state, "state");
            List<FleetReportPeriod> m26750d = state.m26750d();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m26750d, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (FleetReportPeriod fleetReportPeriod : m26750d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s - %s", Arrays.copyOf(new Object[]{C32451Dp1.f6384j.format(fleetReportPeriod.getStartDate().toDate()), C32451Dp1.f6384j.format(fleetReportPeriod.getEndDate().toDate())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                arrayList.add(new C1622b(format, null, fleetReportPeriod));
            }
            FragmentActivity activity = C32451Dp1.this.getActivity();
            if (activity instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) activity;
            } else {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.NORMAL;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    InterfaceC16662d interfaceC16662d = (InterfaceC16662d) obj;
                    arrayList2.add(obj);
                }
                C16664e c16664e = new C16664e();
                c16664e.setArguments(C16597a.m54345a(enumC16469a, null, null, 8388611, arrayList2));
                c16664e.show(appCompatActivity.getSupportFragmentManager(), "BottomSheetOptionFragment");
                m32024u = c16664e.m54040D9().m32067H(new C16597a.C16600c(new C1627b(arrayList2)));
                Intrinsics.checkNotNullExpressionValue(m32024u, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
            }
            m32024u = AbstractC24507p.m32024u();
            final C1626a c1626a = C1626a.f6398g;
            return m32024u.m32067H(new InterfaceC23492o() { // from class: Ep1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    FleetReportPeriod m109878c;
                    m109878c = C32451Dp1.C1625e.m109878c(Function1.this, obj2);
                    return m109878c;
                }
            });
        }
    }

    public C32451Dp1() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C1623c());
        this.f6389f = lazy;
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f6390g = m31902e;
        C24558d<FleetReportPage> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<FleetReportPage>()");
        this.f6391h = m31902e2;
    }

    /* renamed from: D9 */
    public static final C44732lq1 m109892D9(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C44732lq1) tmp0.invoke(obj, obj2);
    }

    /* renamed from: E9 */
    public static final InterfaceC24574u m109891E9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: A9 */
    public final C48955sx4 m109894A9() {
        return (C48955sx4) this.f6389f.getValue();
    }

    /* renamed from: B9 */
    public final C38192aq1 m109893B9() {
        C38192aq1 c38192aq1 = this.f6385b;
        if (c38192aq1 != null) {
            return c38192aq1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: G9 */
    public void render(C44732lq1 state) {
        boolean z;
        List<C3023H6> m4592a;
        Intrinsics.checkNotNullParameter(state, "state");
        FleetReport m26749e = state.m26749e();
        if (m26749e != null && (m4592a = this.f6387d.m4592a(m26749e)) != null) {
            this.f6388e.mo24871u(m4592a);
        }
        C48955sx4 m109894A9 = m109894A9();
        if (state.m26751c() > 0) {
            z = true;
        } else {
            z = false;
        }
        S74.C7343a.showProgress$default(m109894A9, z, 0, 2, null);
        Throwable m26752b = state.m26752b();
        if (m26752b != null) {
            C38689bg5.m64178c(m109894A9(), m26752b);
        }
    }

    /* renamed from: I9 */
    public final void m109889I9(C40661ey1 c40661ey1) {
        Intrinsics.checkNotNullParameter(c40661ey1, "<set-?>");
        this.f6386c = c40661ey1;
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

    @Override // p000.InterfaceC41767gq1
    /* renamed from: d5 */
    public Observable<String> mo37426d5() {
        Observable<String> hide = this.f6390g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "fleetIdSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC41767gq1
    /* renamed from: e4 */
    public Observable<FleetReportPage> mo37425e4() {
        Observable<FleetReportPage> hide = this.f6391h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "fleetPageSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC41767gq1
    /* renamed from: k2 */
    public Observable<FleetReportPeriod> mo37424k2() {
        Observable<Unit> m15318v = this.f6388e.m15318v();
        Observable<C44732lq1> m42276l = m109893B9().m42276l();
        final C1624d c1624d = C1624d.f6396g;
        Observable<R> withLatestFrom = m15318v.withLatestFrom(m42276l, new InterfaceC23480c() { // from class: Bp1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                C44732lq1 m109892D9;
                m109892D9 = C32451Dp1.m109892D9(Function2.this, obj, obj2);
                return m109892D9;
            }
        });
        final C1625e c1625e = new C1625e();
        Observable<FleetReportPeriod> flatMapMaybe = withLatestFrom.flatMapMaybe(new InterfaceC23492o() { // from class: Cp1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m109891E9;
                m109891E9 = C32451Dp1.m109891E9(Function1.this, obj);
                return m109891E9;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun periodSelec…tion.period }\n      }\n  }");
        return flatMapMaybe;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C40661ey1 binding = C40661ey1.m42338c(inflater);
        Intrinsics.checkNotNullExpressionValue(binding, "binding");
        m109889I9(binding);
        return binding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        boolean equals;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentActivity activity = getActivity();
        Enum r2 = null;
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC32919Fp1.InterfaceC2483a m19538a = C46790pJ0.m19538a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        m19538a.mo19537a(c46172oG2.m21419a(application)).mo19536a(this);
        m109886t8().getRoot().setAdapter(this.f6388e);
        m109886t8().getRoot().setLayoutManager(new LinearLayoutManager(baseActivity));
        m109886t8().getRoot().setItemAnimator(new C11894g());
        m109893B9().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("fleet_id")) != null) {
            this.f6390g.onNext(string);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string2 = arguments2.getString("page");
            if (string2 != null) {
                try {
                    Object[] enumConstants = FleetReportPage.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                    for (Object obj : enumConstants) {
                        equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string2, true);
                        if (equals) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                            r2 = (Enum) obj;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (Exception unused) {
                    Object[] enumConstants2 = FleetReportPage.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj2 : enumConstants2) {
                        Enum r3 = (Enum) obj2;
                        if (Intrinsics.areEqual(r3.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                            r2 = r3;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            FleetReportPage fleetReportPage = (FleetReportPage) r2;
            if (fleetReportPage != null) {
                this.f6391h.onNext(fleetReportPage);
            }
        }
    }

    /* renamed from: t8 */
    public final C40661ey1 m109886t8() {
        C40661ey1 c40661ey1 = this.f6386c;
        if (c40661ey1 != null) {
            return c40661ey1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}
