package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.api.response.WarehouseValidationResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.C43038iy6;
import p000.InterfaceC36038Sx6;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m28432d2 = {"Liy6;", "LSx6;", "LVx6;", "ui", "", "B", "onResume", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, DateTokenConverter.CONVERTER_KEY, "Llh6;", C17296a.f69688o, "Llh6;", "userManager", "LSy6;", "b", "LSy6;", "warehouseManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "e", "Le13;", "navigator", "f", "LVx6;", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "userSubject", "h", "LRx6;", "<init>", "(Llh6;LSy6;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "warehouse-checker_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseChecker.kt\nco/bird/android/warehousechecker/WarehouseChecker\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,136:1\n180#2:137\n180#2:138\n199#2:139\n*S KotlinDebug\n*F\n+ 1 WarehouseChecker.kt\nco/bird/android/warehousechecker/WarehouseChecker\n*L\n104#1:137\n115#1:138\n132#1:139\n*E\n"})
/* renamed from: iy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43038iy6 implements InterfaceC36038Sx6 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f91812a;

    /* renamed from: b */
    public final InterfaceC36047Sy6 f91813b;

    /* renamed from: c */
    public final C36207Tq4 f91814c;

    /* renamed from: d */
    public final ScopeProvider f91815d;

    /* renamed from: e */
    public final InterfaceC40099e13 f91816e;

    /* renamed from: f */
    public InterfaceC36740Vx6 f91817f;

    /* renamed from: g */
    public final C24558d<User> f91818g;

    /* renamed from: h */
    public InterfaceC35804Rx6 f91819h;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iy6$a */
    /* loaded from: classes4.dex */
    public static final class C24660a extends Lambda implements Function1<Throwable, Unit> {
        public C24660a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            InterfaceC36740Vx6 interfaceC36740Vx6 = C43038iy6.this.f91817f;
            if (interfaceC36740Vx6 != null) {
                interfaceC36740Vx6.error(C45871nl4.error_generic_body);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iy6$b */
    /* loaded from: classes4.dex */
    public static final class C24661b extends Lambda implements Function1<Pair<? extends User, ? extends Boolean>, Unit> {
        public C24661b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends User, ? extends Boolean> pair) {
            invoke2((Pair<User, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<User, Boolean> pair) {
            boolean z;
            User component1 = pair.component1();
            Boolean enableEnterLocationModal = pair.component2();
            InterfaceC36740Vx6 interfaceC36740Vx6 = C43038iy6.this.f91817f;
            if (interfaceC36740Vx6 != null) {
                if (component1.getWarehouseId() == null) {
                    Intrinsics.checkNotNullExpressionValue(enableEnterLocationModal, "enableEnterLocationModal");
                    if (enableEnterLocationModal.booleanValue()) {
                        z = true;
                        interfaceC36740Vx6.mo22199rf(z);
                    }
                }
                z = false;
                interfaceC36740Vx6.mo22199rf(z);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072r\u0010\u0006\u001an\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*6\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "LHM4;", "Lco/bird/android/model/Warehouse;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iy6$d */
    /* loaded from: classes4.dex */
    public static final class C24664d extends Lambda implements Function1<Triple<? extends User, ? extends HM4<? extends Warehouse>, ? extends Boolean>, Unit> {
        public C24664d() {
            super(1);
        }

        /* renamed from: a */
        public final void m31452a(Triple<User, HM4<? extends Warehouse>, Boolean> triple) {
            InterfaceC36740Vx6 interfaceC36740Vx6;
            String str;
            HM4<? extends Warehouse> response = triple.component2();
            if (!response.m103939f() && (interfaceC36740Vx6 = C43038iy6.this.f91817f) != null) {
                Intrinsics.checkNotNullExpressionValue(response, "response");
                C49375tg1 m94017d = NM4.m94017d(response);
                if (m94017d != null) {
                    str = m94017d.m11932c();
                } else {
                    str = null;
                }
                interfaceC36740Vx6.error(str);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends User, ? extends HM4<? extends Warehouse>, ? extends Boolean> triple) {
            m31452a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aº\u0001\u0012V\b\u0001\u0012R\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000 \u0002*\\\u0012V\b\u0001\u0012R\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00070\u000728\u0010\u0006\u001a4\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "LHM4;", "Lco/bird/android/model/Warehouse;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", C17296a.f69688o, "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iy6$e */
    /* loaded from: classes4.dex */
    public static final class C24665e extends Lambda implements Function1<Triple<? extends User, ? extends HM4<? extends Warehouse>, ? extends Boolean>, InterfaceC24574u<? extends Triple<? extends User, ? extends Warehouse, ? extends Boolean>>> {

        /* renamed from: g */
        public static final C24665e f91826g = new C24665e();

        public C24665e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Triple<User, Warehouse, Boolean>> invoke(Triple<User, HM4<? extends Warehouse>, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            User component1 = triple.component1();
            HM4<? extends Warehouse> component2 = triple.component2();
            Boolean component3 = triple.component3();
            Warehouse m103944a = component2.m103944a();
            if (!component2.m103939f()) {
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(new Triple(component1, m103944a, component3));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062V\u0010\u0005\u001aR\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Warehouse;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iy6$f */
    /* loaded from: classes4.dex */
    public static final class C24666f extends Lambda implements Function1<Triple<? extends User, ? extends Warehouse, ? extends Boolean>, Unit> {
        public C24666f() {
            super(1);
        }

        /* renamed from: a */
        public final void m31450a(Triple<User, Warehouse, Boolean> triple) {
            boolean z;
            User user = triple.component1();
            Warehouse component2 = triple.component2();
            Boolean enableEnterLocationModal = triple.component3();
            if (component2 != null) {
                InterfaceC35804Rx6 interfaceC35804Rx6 = C43038iy6.this.f91819h;
                if (interfaceC35804Rx6 != null) {
                    interfaceC35804Rx6.mo86161b();
                }
                InterfaceC36740Vx6 interfaceC36740Vx6 = C43038iy6.this.f91817f;
                if (interfaceC36740Vx6 != null) {
                    Intrinsics.checkNotNullExpressionValue(user, "user");
                    interfaceC36740Vx6.mo22209Df(user);
                }
                InterfaceC36740Vx6 interfaceC36740Vx62 = C43038iy6.this.f91817f;
                if (interfaceC36740Vx62 != null) {
                    interfaceC36740Vx62.mo22203S9(component2);
                }
            }
            InterfaceC36740Vx6 interfaceC36740Vx63 = C43038iy6.this.f91817f;
            if (interfaceC36740Vx63 != null) {
                if (component2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC36740Vx63.mo22202Zd(z);
            }
            if (component2 == null || Intrinsics.areEqual(component2.getActive(), Boolean.FALSE)) {
                InterfaceC35804Rx6 interfaceC35804Rx62 = C43038iy6.this.f91819h;
                if (interfaceC35804Rx62 != null) {
                    interfaceC35804Rx62.mo86162a();
                }
                InterfaceC36740Vx6 interfaceC36740Vx64 = C43038iy6.this.f91817f;
                if (interfaceC36740Vx64 != null) {
                    Intrinsics.checkNotNullExpressionValue(enableEnterLocationModal, "enableEnterLocationModal");
                    interfaceC36740Vx64.mo22199rf(enableEnterLocationModal.booleanValue());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends User, ? extends Warehouse, ? extends Boolean> triple) {
            m31450a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042*\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Warehouse;", "", "it", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iy6$g */
    /* loaded from: classes4.dex */
    public static final class C24667g extends Lambda implements Function1<Triple<? extends User, ? extends Warehouse, ? extends Boolean>, Boolean> {
        public C24667g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<User, Warehouse, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C43038iy6.this.f91814c.m82623f8().getValue().getServiceCenterConfig().getValidateWarehouse());
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003 \u0002*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00070\u0007 \u0002*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003 \u0002*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062*\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/Warehouse;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "b", "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iy6$h */
    /* loaded from: classes4.dex */
    public static final class C24668h extends Lambda implements Function1<Triple<? extends User, ? extends Warehouse, ? extends Boolean>, InterfaceC24574u<? extends Pair<? extends DialogResponse, ? extends Warehouse>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/api/response/WarehouseValidationResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/WarehouseValidationResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iy6$h$a */
        /* loaded from: classes4.dex */
        public static final class C24669a extends Lambda implements Function1<WarehouseValidationResponse, InterfaceC24574u<? extends Pair<? extends DialogResponse, ? extends Warehouse>>> {

            /* renamed from: g */
            public final /* synthetic */ Warehouse f91830g;

            /* renamed from: h */
            public final /* synthetic */ C43038iy6 f91831h;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Pair;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: iy6$h$a$a */
            /* loaded from: classes4.dex */
            public static final class C24670a extends Lambda implements Function1<DialogResponse, Pair<? extends DialogResponse, ? extends Warehouse>> {

                /* renamed from: g */
                public final /* synthetic */ Warehouse f91832g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C24670a(Warehouse warehouse) {
                    super(1);
                    this.f91832g = warehouse;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<DialogResponse, Warehouse> invoke(DialogResponse response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    return TuplesKt.m28425to(response, this.f91832g);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24669a(Warehouse warehouse, C43038iy6 c43038iy6) {
                super(1);
                this.f91830g = warehouse;
                this.f91831h = c43038iy6;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends Pair<DialogResponse, Warehouse>> invoke(WarehouseValidationResponse warehouseValidationResponse) {
                Observable<DialogResponse> mo22207G9;
                AbstractC24507p<DialogResponse> firstElement;
                Intrinsics.checkNotNullParameter(warehouseValidationResponse, "<name for destructuring parameter 0>");
                boolean component1 = warehouseValidationResponse.component1();
                Warehouse component2 = warehouseValidationResponse.component2();
                if (!component1 && this.f91830g != null && component2 != null) {
                    InterfaceC36740Vx6 interfaceC36740Vx6 = this.f91831h.f91817f;
                    if (interfaceC36740Vx6 != null && (mo22207G9 = interfaceC36740Vx6.mo22207G9(this.f91830g, component2)) != null && (firstElement = mo22207G9.firstElement()) != null) {
                        final C24670a c24670a = new C24670a(component2);
                        InterfaceC24574u m32067H = firstElement.m32067H(new InterfaceC23492o() { // from class: ly6
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                Pair invoke$lambda$0;
                                invoke$lambda$0 = C43038iy6.C24668h.C24669a.invoke$lambda$0(Function1.this, obj);
                                return invoke$lambda$0;
                            }
                        });
                        if (m32067H != null) {
                            return m32067H;
                        }
                    }
                    return AbstractC24507p.m32024u();
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C24668h() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m31446c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<DialogResponse, Warehouse>> invoke(Triple<User, Warehouse, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            AbstractC23442F m33152N = C38096ag5.m70883l(C43038iy6.this.f91813b.mo82207b()).m33152N(C23454a.m33087a());
            final C24669a c24669a = new C24669a(triple.component2(), C43038iy6.this);
            return m33152N.m33163C(new InterfaceC23492o() { // from class: ky6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m31446c;
                    m31446c = C43038iy6.C24668h.m31446c(Function1.this, obj);
                    return m31446c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/model/Warehouse;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iy6$i */
    /* loaded from: classes4.dex */
    public static final class C24671i extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Warehouse>, InterfaceC24574u<? extends User>> {
        public C24671i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends User> invoke(Pair<? extends DialogResponse, Warehouse> pair) {
            List split$default;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            DialogResponse component1 = pair.component1();
            Warehouse component2 = pair.component2();
            if (component1 == DialogResponse.OK) {
                InterfaceC44647lh6 interfaceC44647lh6 = C43038iy6.this.f91812a;
                String m7765i = C50711vv2.m7769e().m7765i();
                Intrinsics.checkNotNullExpressionValue(m7765i, "getDefault().toLanguageTags()");
                split$default = StringsKt__StringsKt.split$default((CharSequence) m7765i, new String[]{","}, false, 0, 6, (Object) null);
                return InterfaceC44647lh6.C25764a.updateUser$default(interfaceC44647lh6, null, null, null, null, (String) split$default.get(0), component2.getId(), 15, null).firstElement();
            }
            C43038iy6.this.f91816e.mo37005i4();
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iy6$j */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C24672j extends FunctionReferenceImpl implements Function1<User, Unit> {
        public C24672j(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m31441a(User p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m31441a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iy6$k */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C24673k extends FunctionReferenceImpl implements Function1<User, Unit> {
        public C24673k(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m31440a(User p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m31440a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iy6$l */
    /* loaded from: classes4.dex */
    public static final class C24674l extends Lambda implements Function1<Unit, Unit> {
        public C24674l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C43038iy6.this.f91816e.mo37005i4();
        }
    }

    public C43038iy6(InterfaceC44647lh6 userManager, InterfaceC36047Sy6 warehouseManager, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(warehouseManager, "warehouseManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f91812a = userManager;
        this.f91813b = warehouseManager;
        this.f91814c = reactiveConfig;
        this.f91815d = scopeProvider;
        this.f91816e = navigator;
        C24558d<User> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<User>()");
        this.f91818g = m31902e;
        Observable m31950a = C24527f.m31950a(m31902e, reactiveConfig.m82773R3());
        final C24661b c24661b = new C24661b();
        Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: Wx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31465q(Function1.this, obj);
            }
        });
        final C24662c c24662c = new C24662c();
        Observable flatMap = doOnNext.flatMap(new InterfaceC23492o() { // from class: Zx6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m31464r;
                m31464r = C43038iy6.m31464r(Function1.this, obj);
                return m31464r;
            }
        });
        final C24664d c24664d = new C24664d();
        Observable doOnNext2 = flatMap.doOnNext(new InterfaceC23484g() { // from class: ay6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31463s(Function1.this, obj);
            }
        });
        final C24665e c24665e = C24665e.f91826g;
        Observable observeOn = doOnNext2.flatMapMaybe(new InterfaceC23492o() { // from class: by6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m31462t;
                m31462t = C43038iy6.m31462t(Function1.this, obj);
                return m31462t;
            }
        }).observeOn(C23454a.m33087a());
        final C24666f c24666f = new C24666f();
        Observable doOnNext3 = observeOn.doOnNext(new InterfaceC23484g() { // from class: cy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31461u(Function1.this, obj);
            }
        });
        final C24667g c24667g = new C24667g();
        Observable filter = doOnNext3.filter(new InterfaceC23494q() { // from class: dy6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m31460v;
                m31460v = C43038iy6.m31460v(Function1.this, obj);
                return m31460v;
            }
        });
        final C24668h c24668h = new C24668h();
        Observable flatMapMaybe = filter.flatMapMaybe(new InterfaceC23492o() { // from class: ey6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m31459w;
                m31459w = C43038iy6.m31459w(Function1.this, obj);
                return m31459w;
            }
        });
        final C24671i c24671i = new C24671i();
        Observable subscribeOn = flatMapMaybe.flatMapMaybe(new InterfaceC23492o() { // from class: fy6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m31458x;
                m31458x = C43038iy6.m31458x(Function1.this, obj);
                return m31458x;
            }
        }).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "userSubject\n      .withL…scribeOn(Schedulers.io())");
        Object m33094as = subscribeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24672j c24672j = new C24672j(m31902e);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: gy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31457y(Function1.this, obj);
            }
        };
        final C24660a c24660a = new C24660a();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: hy6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31456z(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m31480A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m31478C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m31465q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23434B m31464r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m31463s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC24574u m31462t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m31461u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final boolean m31460v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: w */
    public static final InterfaceC24574u m31459w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC24574u m31458x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m31457y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m31456z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final void m31479B(InterfaceC36740Vx6 ui) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f91817f = ui;
        Observable merge = Observable.merge(ui.mo22210D0(), ui.mo22198v1());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.blocking…ui.operatorClicks()\n    )");
        Object m33094as = merge.m33094as(AutoDispose.m45239a(this.f91815d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24674l c24674l = new C24674l();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Xx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31478C(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f91819h = interfaceC35804Rx6;
        Object m33135e = this.f91812a.getUser().m33135e(AutoDispose.m45239a(this.f91815d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24673k c24673k = new C24673k(this.f91818g);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Yx6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43038iy6.m31480A(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        InterfaceC36038Sx6.C7617a.checkWarehouseInfo$default(this, null, 1, null);
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001aò\u0001\u0012r\b\u0001\u0012n\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*6\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0006 \u0002*x\u0012r\b\u0001\u0012n\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003 \u0002*6\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\b0\b0\u0007\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lkotlin/Triple;", "LHM4;", "Lco/bird/android/model/Warehouse;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseChecker.kt\nco/bird/android/warehousechecker/WarehouseChecker$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
    /* renamed from: iy6$c */
    /* loaded from: classes4.dex */
    public static final class C24662c extends Lambda implements Function1<Pair<? extends User, ? extends Boolean>, InterfaceC23434B<? extends Triple<? extends User, ? extends HM4<? extends Warehouse>, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001an\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*6\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00040\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "warehouseResponse", "Lkotlin/Triple;", "Lco/bird/android/model/User;", "", C17296a.f69688o, "(LHM4;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iy6$c$a */
        /* loaded from: classes4.dex */
        public static final class C24663a extends Lambda implements Function1<HM4<? extends Warehouse>, Triple<? extends User, ? extends HM4<? extends Warehouse>, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ User f91823g;

            /* renamed from: h */
            public final /* synthetic */ Boolean f91824h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24663a(User user, Boolean bool) {
                super(1);
                this.f91823g = user;
                this.f91824h = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<User, HM4<? extends Warehouse>, Boolean> invoke(HM4<? extends Warehouse> warehouseResponse) {
                Intrinsics.checkNotNullParameter(warehouseResponse, "warehouseResponse");
                return new Triple<>(this.f91823g, warehouseResponse, this.f91824h);
            }
        }

        public C24662c() {
            super(1);
        }

        /* renamed from: b */
        public static final Triple m31454b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Triple<User, HM4<? extends Warehouse>, Boolean>> invoke2(Pair<User, Boolean> pair) {
            Observable<HM4<Warehouse>> just;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            User component1 = pair.component1();
            Boolean component2 = pair.component2();
            String warehouseId = component1.getWarehouseId();
            if (warehouseId == null || (just = C43038iy6.this.f91813b.mo82208a(warehouseId).m33123k0()) == null) {
                just = Observable.just(HM4.m103935j(null));
            }
            final C24663a c24663a = new C24663a(component1, component2);
            return just.map(new InterfaceC23492o() { // from class: jy6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m31454b;
                    m31454b = C43038iy6.C24662c.m31454b(Function1.this, obj);
                    return m31454b;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Triple<? extends User, ? extends HM4<? extends Warehouse>, ? extends Boolean>> invoke(Pair<? extends User, ? extends Boolean> pair) {
            return invoke2((Pair<User, Boolean>) pair);
        }
    }
}
