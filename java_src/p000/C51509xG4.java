package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.physicallock.ChoosePhysicalLockTypeActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WirePhysicalLockReplacementType;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.ReplacePhysicalLockBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C51509xG4;
import p000.H31;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB/\b\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LxG4;", "LnG4;", "Landroid/content/Intent;", "intent", "", "b", "", "requestCode", "resultCode", "onActivityResult", "onBackPressed", "k", "o", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "LzG4;", "c", "LzG4;", "ui", "LJy4;", DateTokenConverter.CONVERTER_KEY, "LJy4;", "repairClient", "", "e", "Ljava/lang/String;", "birdId", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "f", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "selectedLockType", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LzG4;LJy4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReplacePhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplacePhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/ReplacePhysicalLockPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,164:1\n180#2:165\n180#2:166\n180#2:167\n180#2:168\n*S KotlinDebug\n*F\n+ 1 ReplacePhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/ReplacePhysicalLockPresenterImpl\n*L\n60#1:165\n77#1:166\n90#1:167\n152#1:168\n*E\n"})
/* renamed from: xG4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51509xG4 implements InterfaceC45581nG4 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f117272a;

    /* renamed from: b */
    public final InterfaceC40099e13 f117273b;

    /* renamed from: c */
    public final InterfaceC52695zG4 f117274c;

    /* renamed from: d */
    public final InterfaceC33939Jy4 f117275d;

    /* renamed from: e */
    public String f117276e;

    /* renamed from: f */
    public WirePhysicalLockReplacementType f117277f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"LxG4$a;", "", "", "b", "I", C17296a.f69688o, "()I", "saveExceptionMessage", "<init>", "(I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xG4$a */
    /* loaded from: classes2.dex */
    public static final class C30080a extends Throwable {

        /* renamed from: b */
        public final int f117278b;

        public C30080a(int i) {
            this.f117278b = i;
        }

        /* renamed from: a */
        public final int m5581a() {
            return this.f117278b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG4$b */
    /* loaded from: classes2.dex */
    public static final class C30081b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends HM4<List<? extends WirePhysicalLockReplacementType>>>> {
        public C30081b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends HM4<List<WirePhysicalLockReplacementType>>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC33939Jy4 interfaceC33939Jy4 = C51509xG4.this.f117275d;
            String str = C51509xG4.this.f117276e;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("birdId");
                str = null;
            }
            return interfaceC33939Jy4.m99486b(str).m33142Y(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReplacePhysicalLockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplacePhysicalLockPresenter.kt\nco/bird/android/app/feature/physicallock/ReplacePhysicalLockPresenterImpl$observeLockTypeClicks$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
    /* renamed from: xG4$c */
    /* loaded from: classes2.dex */
    public static final class C30082c extends Lambda implements Function1<HM4<List<? extends WirePhysicalLockReplacementType>>, Unit> {
        public C30082c() {
            super(1);
        }

        /* renamed from: a */
        public final void m5580a(HM4<List<WirePhysicalLockReplacementType>> hm4) {
            List<WirePhysicalLockReplacementType> m103944a = hm4.m103944a();
            Unit unit = null;
            String str = null;
            if (m103944a != null) {
                C51509xG4 c51509xG4 = C51509xG4.this;
                InterfaceC40099e13 interfaceC40099e13 = c51509xG4.f117273b;
                String str2 = c51509xG4.f117276e;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("birdId");
                } else {
                    str = str2;
                }
                interfaceC40099e13.mo37200A3(str, m103944a);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C51509xG4.this.f117274c.error(C45871nl4.physical_lock_unable_to_get_lock_types);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<List<? extends WirePhysicalLockReplacementType>> hm4) {
            m5580a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xG4$d */
    /* loaded from: classes2.dex */
    public static final class C30083d extends Lambda implements Function1<Throwable, Unit> {
        public C30083d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51509xG4.this.f117274c.error(C45871nl4.physical_lock_unable_to_get_lock_types);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG4$e */
    /* loaded from: classes2.dex */
    public static final class C30084e extends Lambda implements Function1<Triple<? extends Unit, ? extends String, ? extends String>, InterfaceC24574u<? extends HM4<WirePhysicalLock>>> {
        public C30084e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<WirePhysicalLock>> invoke(Triple<Unit, String, String> triple) {
            boolean isBlank;
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component2 = triple.component2();
            if (Intrinsics.areEqual(component2, triple.component3())) {
                isBlank = StringsKt__StringsJVMKt.isBlank(component2);
                if (!isBlank) {
                    WirePhysicalLockReplacementType wirePhysicalLockReplacementType = C51509xG4.this.f117277f;
                    if (new Regex((wirePhysicalLockReplacementType == null || (r0 = wirePhysicalLockReplacementType.getValidationRegex()) == null) ? ".+" : ".+").matches(component2)) {
                        InterfaceC33939Jy4 interfaceC33939Jy4 = C51509xG4.this.f117275d;
                        String str3 = C51509xG4.this.f117276e;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("birdId");
                            str = null;
                        } else {
                            str = str3;
                        }
                        WirePhysicalLockReplacementType wirePhysicalLockReplacementType2 = C51509xG4.this.f117277f;
                        if (wirePhysicalLockReplacementType2 != null) {
                            str2 = wirePhysicalLockReplacementType2.getKind();
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            return interfaceC33939Jy4.m99482f(new ReplacePhysicalLockBody(str, str2, component2, null, null, null, 56, null)).m33142Y(C24542a.m31932c()).m33125j0();
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    return AbstractC24507p.m32023v(new C30080a(C45871nl4.physical_lock_replace_lock_regex_error_message));
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/wire/WirePhysicalLock;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "c", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG4$f */
    /* loaded from: classes2.dex */
    public static final class C30085f extends Lambda implements Function1<HM4<WirePhysicalLock>, InterfaceC23447K<? extends DialogResponse>> {
        public C30085f() {
            super(1);
        }

        /* renamed from: d */
        public static final Throwable m5576d() {
            return new C30080a(C45871nl4.physical_lock_replace_lock_error_message);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends DialogResponse> invoke(HM4<WirePhysicalLock> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m103939f()) {
                return H31.C3014a.dialog$default(C51509xG4.this.f117274c, C44988mG4.f97738d, false, false, 4, null);
            }
            AbstractC23442F m33099y = AbstractC23442F.m33099y(new Callable() { // from class: yG4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Throwable m5576d;
                    m5576d = C51509xG4.C30085f.m5576d();
                    return m5576d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33099y, "{\n          Single.error…rror_message) }\n        }");
            return m33099y;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "error", "", C17296a.f69688o, "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG4$g */
    /* loaded from: classes2.dex */
    public static final class C30086g extends Lambda implements Function1<Throwable, Boolean> {
        public C30086g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Throwable error) {
            boolean z;
            Intrinsics.checkNotNullParameter(error, "error");
            boolean z2 = true;
            if (error instanceof C30080a) {
                C51509xG4.this.f117274c.error(((C30080a) error).m5581a());
            } else {
                if (error instanceof RetrofitException) {
                    z = true;
                } else {
                    z = error instanceof IOException;
                }
                if (z) {
                    C51509xG4.this.f117274c.error(C45871nl4.error_network);
                } else {
                    z2 = false;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xG4$h */
    /* loaded from: classes2.dex */
    public static final class C30087h extends Lambda implements Function1<DialogResponse, Unit> {
        public C30087h() {
            super(1);
        }

        /* renamed from: a */
        public final void m5574a(DialogResponse dialogResponse) {
            InterfaceC40099e13 interfaceC40099e13 = C51509xG4.this.f117273b;
            Intent putExtra = new Intent().putExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE, C51509xG4.this.f117274c.mo1577yg());
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent().putExtra(Extras…i.enterCombinationText())");
            interfaceC40099e13.mo37029e4(-1, putExtra);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m5574a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "combination", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xG4$i */
    /* loaded from: classes2.dex */
    public static final class C30088i extends Lambda implements Function1<String, Unit> {
        public C30088i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String combination) {
            boolean isBlank;
            Intrinsics.checkNotNullExpressionValue(combination, "combination");
            isBlank = StringsKt__StringsJVMKt.isBlank(combination);
            boolean z = !isBlank;
            C51509xG4.this.f117274c.mo1584P2(z);
            C51509xG4.this.f117274c.mo1578qb(z);
            if (z) {
                return;
            }
            C51509xG4.this.f117274c.mo1579hb();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xG4$j */
    /* loaded from: classes2.dex */
    public static final class C30089j extends Lambda implements Function1<Pair<? extends String, ? extends String>, Unit> {
        public C30089j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends String> pair) {
            invoke2((Pair<String, String>) pair);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
            if ((!r3) != false) goto L5;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Pair<String, String> pair) {
            boolean z;
            boolean isBlank;
            String component2 = pair.component2();
            InterfaceC52695zG4 interfaceC52695zG4 = C51509xG4.this.f117274c;
            if (Intrinsics.areEqual(pair.component1(), component2)) {
                isBlank = StringsKt__StringsJVMKt.isBlank(component2);
                z = true;
            }
            z = false;
            interfaceC52695zG4.mo1583Pe(z);
        }
    }

    public C51509xG4(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40099e13 navigator, InterfaceC52695zG4 ui, InterfaceC33939Jy4 repairClient) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(repairClient, "repairClient");
        this.f117272a = scopeProvider;
        this.f117273b = navigator;
        this.f117274c = ui;
        this.f117275d = repairClient;
    }

    /* renamed from: l */
    public static final InterfaceC23447K m5591l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m5590m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m5589n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC24574u m5587p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m5586q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final boolean m5585r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: s */
    public static final void m5584s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m5583t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m5582u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC45581nG4
    /* renamed from: b */
    public void mo5601b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("bird_id");
        Intrinsics.checkNotNull(stringExtra);
        this.f117276e = stringExtra;
        m5592k();
    }

    /* renamed from: k */
    public final void m5592k() {
        Observable<Unit> mo1580b8 = this.f117274c.mo1580b8();
        final C30081b c30081b = new C30081b();
        Observable observeOn = mo1580b8.flatMapSingle(new InterfaceC23492o() { // from class: qG4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5591l;
                m5591l = C51509xG4.m5591l(Function1.this, obj);
                return m5591l;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun observeLockT…to_get_lock_types) })\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f117272a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30082c c30082c = new C30082c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: rG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51509xG4.m5590m(Function1.this, obj);
            }
        };
        final C30083d c30083d = new C30083d();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: sG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51509xG4.m5589n(Function1.this, obj);
            }
        });
    }

    /* renamed from: o */
    public final void m5588o() {
        Observable m31955b = C24523e.f91168a.m31955b(this.f117274c.mo1586Ne(), this.f117274c.mo1582U7(), this.f117274c.mo1585O8());
        final C30084e c30084e = new C30084e();
        Observable observeOn = m31955b.flatMapMaybe(new InterfaceC23492o() { // from class: tG4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m5587p;
                m5587p = C51509xG4.m5587p(Function1.this, obj);
                return m5587p;
            }
        }).observeOn(C23454a.m33087a());
        final C30085f c30085f = new C30085f();
        Observable flatMapSingle = observeOn.flatMapSingle(new InterfaceC23492o() { // from class: uG4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5586q;
                m5586q = C51509xG4.m5586q(Function1.this, obj);
                return m5586q;
            }
        });
        final C30086g c30086g = new C30086g();
        Observable retry = flatMapSingle.retry(new InterfaceC23494q() { // from class: vG4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m5585r;
                m5585r = C51509xG4.m5585r(Function1.this, obj);
                return m5585r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(retry, "private fun observeSaveB…ationText()))\n      }\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f117272a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30087h c30087h = new C30087h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: wG4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51509xG4.m5584s(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC45581nG4
    public void onActivityResult(int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(ChoosePhysicalLockTypeActivity.class)) && i2 == -1) {
            WirePhysicalLockReplacementType wirePhysicalLockReplacementType = (WirePhysicalLockReplacementType) intent.getParcelableExtra("physical_lock_type");
            this.f117277f = wirePhysicalLockReplacementType;
            if (wirePhysicalLockReplacementType != null) {
                this.f117274c.mo1581Z7(wirePhysicalLockReplacementType);
                m5588o();
                Observable<String> subscribeOn = this.f117274c.mo1582U7().observeOn(C23454a.m33087a()).subscribeOn(C24542a.m31932c());
                Intrinsics.checkNotNullExpressionValue(subscribeOn, "ui.enterCombinationTextC…scribeOn(Schedulers.io())");
                Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(this.f117272a));
                Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C30088i c30088i = new C30088i();
                ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: oG4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C51509xG4.m5583t(Function1.this, obj);
                    }
                });
                Observable subscribeOn2 = C24523e.f91168a.m31956a(this.f117274c.mo1585O8(), this.f117274c.mo1582U7()).observeOn(C23454a.m33087a()).subscribeOn(C24542a.m31932c());
                Intrinsics.checkNotNullExpressionValue(subscribeOn2, "Observables.combineLates…scribeOn(Schedulers.io())");
                Object m33094as2 = subscribeOn2.m33094as(AutoDispose.m45239a(this.f117272a));
                Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C30089j c30089j = new C30089j();
                ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: pG4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C51509xG4.m5582u(Function1.this, obj);
                    }
                });
            }
        }
    }

    @Override // p000.InterfaceC45581nG4
    public void onBackPressed() {
        this.f117273b.mo37029e4(0, new Intent());
    }
}
