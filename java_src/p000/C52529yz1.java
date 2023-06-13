package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Link;
import co.bird.android.model.wire.configs.RideConfig;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"Lyz1;", "Ljz1;", "", C17296a.f69688o, "", "link", "D", "(Ljava/lang/String;)V", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lzz1;", "b", "Lzz1;", "ui", "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LV74;", "e", "LV74;", "promoManager", "LEa;", "f", "LEa;", "analyticsManager", "LAG;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Link;", "g", "LAG;", "linkSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;Lzz1;Landroid/content/Context;LTq4;LV74;LEa;)V", "freeride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFreeRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeRidePresenter.kt\nco/bird/android/library/freeride/FreeRidePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,116:1\n180#2:117\n199#2:118\n180#2:119\n180#2:120\n*S KotlinDebug\n*F\n+ 1 FreeRidePresenter.kt\nco/bird/android/library/freeride/FreeRidePresenterImpl\n*L\n53#1:117\n64#1:118\n71#1:119\n86#1:120\n*E\n"})
/* renamed from: yz1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52529yz1 implements InterfaceC43636jz1 {

    /* renamed from: a */
    public final ScopeProvider f120491a;

    /* renamed from: b */
    public final InterfaceC53122zz1 f120492b;

    /* renamed from: c */
    public final Context f120493c;

    /* renamed from: d */
    public final C36207Tq4 f120494d;

    /* renamed from: e */
    public final V74 f120495e;

    /* renamed from: f */
    public final InterfaceC1880Ea f120496f;

    /* renamed from: g */
    public final C0058AG<Optional<Link>> f120497g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Link;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$a */
    /* loaded from: classes3.dex */
    public static final class C30794a extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Optional<Link>>> {
        public C30794a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Optional<Link>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52529yz1.this.f120497g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Link;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$b */
    /* loaded from: classes3.dex */
    public static final class C30795b extends Lambda implements Function1<Optional<Link>, Boolean> {

        /* renamed from: g */
        public static final C30795b f120499g = new C30795b();

        public C30795b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<Link> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Link;", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$c */
    /* loaded from: classes3.dex */
    public static final class C30796c extends Lambda implements Function1<Optional<Link>, InterfaceC23447K<? extends String>> {
        public C30796c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends String> invoke(Optional<Link> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52529yz1.this.f120495e.mo27769v();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "shareUrl", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yz1$d */
    /* loaded from: classes3.dex */
    public static final class C30797d extends Lambda implements Function1<String, Unit> {
        public C30797d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ClipboardManager clipboardManager = (ClipboardManager) C52529yz1.this.f120493c.getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText(C52529yz1.this.f120493c.getString(C45871nl4.g1g1_clipboard_title), str);
            Intrinsics.checkNotNull(clipboardManager);
            clipboardManager.setPrimaryClip(newPlainText);
            C52529yz1.this.f120492b.success(C45871nl4.g1g1_copied);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yz1$e */
    /* loaded from: classes3.dex */
    public static final class C30798e extends Lambda implements Function1<Throwable, Unit> {
        public C30798e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C52529yz1.this.f120492b.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Link;", "kotlin.jvm.PlatformType", "link", "", C17296a.f69688o, "(Lco/bird/android/model/Link;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$f */
    /* loaded from: classes3.dex */
    public static final class C30799f extends Lambda implements Function1<Link, Unit> {
        public C30799f() {
            super(1);
        }

        /* renamed from: a */
        public final void m2145a(Link link) {
            C52529yz1.this.f120492b.mo25Wj(link.getCode());
            C52529yz1.this.f120492b.mo23p0(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Link link) {
            m2145a(link);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Link;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Link;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$g */
    /* loaded from: classes3.dex */
    public static final class C30800g extends Lambda implements Function1<Link, Optional<Link>> {

        /* renamed from: g */
        public static final C30800g f120504g = new C30800g();

        public C30800g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Link> invoke(Link it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Optional.f63040c.m59032c(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Link;", "kotlin.jvm.PlatformType", "linkOption", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$h */
    /* loaded from: classes3.dex */
    public static final class C30801h extends Lambda implements Function1<Optional<Link>, Unit> {
        public C30801h() {
            super(1);
        }

        /* renamed from: a */
        public final void m2143a(Optional<Link> optional) {
            C52529yz1.this.f120497g.accept(optional);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Link> optional) {
            m2143a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yz1$i */
    /* loaded from: classes3.dex */
    public static final class C30802i extends Lambda implements Function1<Unit, Unit> {
        public C30802i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52529yz1.this.f120496f.mo55905y(new C34642My5(null, null, null, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yz1$j */
    /* loaded from: classes3.dex */
    public static final class C30803j extends Lambda implements Function1<Unit, InterfaceC23447K<? extends String>> {
        public C30803j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C52529yz1.this.f120495e.mo27769v();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "link", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yz1$k */
    /* loaded from: classes3.dex */
    public static final class C30804k extends Lambda implements Function1<String, Unit> {
        public C30804k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String link) {
            C52529yz1 c52529yz1 = C52529yz1.this;
            Intrinsics.checkNotNullExpressionValue(link, "link");
            c52529yz1.m2174D(link);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yz1$l */
    /* loaded from: classes3.dex */
    public static final class C30805l extends Lambda implements Function1<Throwable, Unit> {
        public C30805l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            C52529yz1.this.f120492b.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yz1$m */
    /* loaded from: classes3.dex */
    public static final class C30806m extends Lambda implements Function1<Unit, Unit> {
        public C30806m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C52529yz1.this.f120496f.mo55905y(new C35110Oy5(null, null, null, 7, null));
        }
    }

    public C52529yz1(ScopeProvider scopeProvider, InterfaceC53122zz1 ui, Context context, C36207Tq4 reactiveConfig, V74 promoManager, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f120491a = scopeProvider;
        this.f120492b = ui;
        this.f120493c = context;
        this.f120494d = reactiveConfig;
        this.f120495e = promoManager;
        this.f120496f = analyticsManager;
        C0058AG<Optional<Link>> m115950h = C0058AG.m115950h(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(Optional.absent())");
        this.f120497g = m115950h;
    }

    /* renamed from: A */
    public static final void m2177A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m2176B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23434B m2175C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m2158p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final Optional m2157q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m2156r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final InterfaceC23447K m2155s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m2154t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m2153u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final Optional m2152v(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Optional.f63040c.m59034a();
    }

    /* renamed from: w */
    public static final void m2151w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m2150x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m2149y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m2148z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final void m2174D(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Context context = this.f120493c;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", link);
        intent.setType("text/plain");
        Intent createChooser = Intent.createChooser(intent, this.f120493c.getString(C45871nl4.free_rides_share_text));
        createChooser.addFlags(268435456);
        context.startActivity(createChooser);
        this.f120496f.mo55905y(new C35578Qy5(null, null, null, "share_screen", 7, null));
    }

    @Override // p000.InterfaceC43636jz1
    /* renamed from: a */
    public void mo2173a() {
        RideConfig rideConfig = this.f120494d.m82623f8().m73665a().getRideConfig();
        this.f120492b.mo26Ij(rideConfig.getMaximumFreeRideAmount(), C45097mS5.m25591o(rideConfig.getCurrency()));
        this.f120496f.mo55905y(new C35344Py5(null, null, null, "free_rides", 7, null));
        this.f120492b.mo23p0(false);
        Observable observeOn = C37279Yf5.m74576S(this.f120497g).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "linkSubject\n      .mapNo…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f120491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30799f c30799f = new C30799f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2158p(Function1.this, obj);
            }
        });
        AbstractC23442F<Link> m33146T = this.f120495e.mo27765x().m33146T(3L);
        final C30800g c30800g = C30800g.f120504g;
        AbstractC23442F m33152N = m33146T.m33157I(new InterfaceC23492o() { // from class: tz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m2157q;
                m2157q = C52529yz1.m2157q(Function1.this, obj);
                return m2157q;
            }
        }).m33149Q(new InterfaceC23492o() { // from class: uz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m2152v;
                m2152v = C52529yz1.m2152v((Throwable) obj);
                return m2152v;
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "promoManager.getFreeRide…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f120491a));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30801h c30801h = new C30801h();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: vz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2151w(Function1.this, obj);
            }
        });
        Observable<Unit> mo24h3 = this.f120492b.mo24h3();
        final C30802i c30802i = new C30802i();
        Observable<Unit> doOnNext = mo24h3.doOnNext(new InterfaceC23484g() { // from class: wz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2150x(Function1.this, obj);
            }
        });
        final C30803j c30803j = new C30803j();
        Observable observeOn2 = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: xz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m2149y;
                m2149y = C52529yz1.m2149y(Function1.this, obj);
                return m2149y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate() …eneric_body)\n      })\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f120491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30804k c30804k = new C30804k();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: lz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2148z(Function1.this, obj);
            }
        };
        final C30805l c30805l = new C30805l();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: mz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2177A(Function1.this, obj);
            }
        });
        Observable<Unit> mo27Eg = this.f120492b.mo27Eg();
        final C30806m c30806m = new C30806m();
        Observable<Unit> doOnNext2 = mo27Eg.doOnNext(new InterfaceC23484g() { // from class: nz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2176B(Function1.this, obj);
            }
        });
        final C30794a c30794a = new C30794a();
        Observable<R> flatMap = doOnNext2.flatMap(new InterfaceC23492o() { // from class: oz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m2175C;
                m2175C = C52529yz1.m2175C(Function1.this, obj);
                return m2175C;
            }
        });
        final C30795b c30795b = C30795b.f120499g;
        Observable filter = flatMap.filter(new InterfaceC23494q() { // from class: pz1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m2156r;
                m2156r = C52529yz1.m2156r(Function1.this, obj);
                return m2156r;
            }
        });
        final C30796c c30796c = new C30796c();
        Observable observeOn3 = filter.flatMapSingle(new InterfaceC23492o() { // from class: qz1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m2155s;
                m2155s = C52529yz1.m2155s(Function1.this, obj);
                return m2155s;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onCreate() …eneric_body)\n      })\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f120491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30797d c30797d = new C30797d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: rz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2154t(Function1.this, obj);
            }
        };
        final C30798e c30798e = new C30798e();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: sz1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52529yz1.m2153u(Function1.this, obj);
            }
        });
    }
}
