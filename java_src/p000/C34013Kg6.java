package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AcceptedAgreementPayload;
import co.bird.android.model.Agreement;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.UserKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C34013Kg6;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Be\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010/\u001a\u00020*\u0012\b\b\u0001\u00105\u001a\u000200\u0012\b\b\u0001\u0010;\u001a\u000206\u0012\b\b\u0001\u0010@\u001a\u00020<\u0012\b\b\u0001\u0010F\u001a\u00020A\u0012\n\b\u0003\u0010K\u001a\u0004\u0018\u00010G¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010;\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010F\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010K\u001a\u0004\u0018\u00010G8\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010JR*\u0010R\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006U"}, m28432d2 = {"LKg6;", "LCg6;", "", "q", "", "onBackPressed", "", "payload", "Lco/bird/android/model/AcceptedAgreementPayload;", "z", "Lio/reactivex/Observable;", "Lco/bird/android/model/Agreement;", "h", "Lio/reactivex/p;", "Ltg1;", "retryOnCancel", "Lio/reactivex/c;", "v", "LEa;", C17296a.f69688o, "LEa;", "j", "()LEa;", "analyticsManager", "Llg6;", "b", "Llg6;", "o", "()Llg6;", "userAgreementManager", "LWg6;", "c", "LWg6;", "p", "()LWg6;", "userGuestManager", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "l", "()Lgl;", "preference", "Lwi2;", "e", "Lwi2;", "getDeserializer", "()Lwi2;", "deserializer", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LRg6;", "g", "LRg6;", "n", "()LRg6;", "ui", "Lg9;", "Lg9;", "k", "()Lg9;", "config", "Le13;", "i", "Le13;", "getNavigator", "()Le13;", "navigator", "", "Ljava/lang/Integer;", "m", "()Ljava/lang/Integer;", "title", "", "Ljava/util/List;", "getAgreementList", "()Ljava/util/List;", "setAgreementList", "(Ljava/util/List;)V", "agreementList", "<init>", "(LEa;Llg6;LWg6;Lgl;Lwi2;Lcom/uber/autodispose/ScopeProvider;LRg6;Lg9;Le13;Ljava/lang/Integer;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserAgreementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementPresenter.kt\nco/bird/android/app/feature/useragreement/UserAgreementPresenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1#2:181\n237#3:182\n467#4,7:183\n1655#5,8:190\n1549#5:198\n1620#5,3:199\n288#5,2:202\n*S KotlinDebug\n*F\n+ 1 UserAgreementPresenter.kt\nco/bird/android/app/feature/useragreement/UserAgreementPresenterImpl\n*L\n117#1:182\n138#1:183,7\n146#1:190,8\n111#1:198\n111#1:199,3\n112#1:202,2\n*E\n"})
/* renamed from: Kg6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34013Kg6 implements InterfaceC32141Cg6 {

    /* renamed from: a */
    public final InterfaceC1880Ea f20019a;

    /* renamed from: b */
    public final InterfaceC44637lg6 f20020b;

    /* renamed from: c */
    public final InterfaceC36821Wg6 f20021c;

    /* renamed from: d */
    public final C22454gl f20022d;

    /* renamed from: e */
    public final C51174wi2 f20023e;

    /* renamed from: f */
    public final ScopeProvider f20024f;

    /* renamed from: g */
    public final InterfaceC35651Rg6 f20025g;

    /* renamed from: h */
    public final AbstractC20762g9 f20026h;

    /* renamed from: i */
    public final InterfaceC40099e13 f20027i;

    /* renamed from: j */
    public final Integer f20028j;

    /* renamed from: k */
    public List<Agreement> f20029k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserAgreementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementPresenter.kt\nco/bird/android/app/feature/useragreement/UserAgreementPresenterImpl$agreementsObservable$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1549#2:181\n1620#2,3:182\n288#2,2:185\n*S KotlinDebug\n*F\n+ 1 UserAgreementPresenter.kt\nco/bird/android/app/feature/useragreement/UserAgreementPresenterImpl$agreementsObservable$3\n*L\n151#1:181\n151#1:182,3\n152#1:185,2\n*E\n"})
    /* renamed from: Kg6$a */
    /* loaded from: classes2.dex */
    public static final class C4539a extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ List<Agreement> f20031h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4539a(List<Agreement> list) {
            super(1);
            this.f20031h = list;
        }

        /* renamed from: a */
        public final void m98537a(InterfaceC23465c interfaceC23465c) {
            ArrayList arrayList;
            String str;
            Object obj;
            AgreementRole role;
            String str2;
            boolean z;
            int collectionSizeOrDefault;
            InterfaceC1880Ea m98554j = C34013Kg6.this.m98554j();
            Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(C34013Kg6.this.m98552l().m37750B0()));
            List<Agreement> list = this.f20031h;
            if (list != null) {
                List<Agreement> list2 = list;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                for (Agreement agreement : list2) {
                    arrayList.add(agreement.getId());
                }
            } else {
                arrayList = null;
            }
            List<Agreement> list3 = this.f20031h;
            if (list3 != null) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        AgreementRole role2 = ((Agreement) obj).getRole();
                        if (role2 != null) {
                            str2 = role2.name();
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Agreement agreement2 = (Agreement) obj;
                if (agreement2 != null && (role = agreement2.getRole()) != null) {
                    str = role.name();
                    m98554j.mo55905y(new C46097o81(null, null, null, valueOf, arrayList, str, 7, null));
                }
            }
            str = null;
            m98554j.mo55905y(new C46097o81(null, null, null, valueOf, arrayList, str, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m98537a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Agreement;", "agreement", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/Agreement;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kg6$b */
    /* loaded from: classes2.dex */
    public static final class C4540b extends Lambda implements Function1<Agreement, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kg6$b$a */
        /* loaded from: classes2.dex */
        public static final class C4541a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34013Kg6 f20033g;

            /* renamed from: h */
            public final /* synthetic */ Agreement f20034h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4541a(C34013Kg6 c34013Kg6, Agreement agreement) {
                super(1);
                this.f20033g = c34013Kg6;
                this.f20034h = agreement;
            }

            /* renamed from: a */
            public final void m98533a(InterfaceC23465c interfaceC23465c) {
                if (this.f20033g.m98551m() == null) {
                    InterfaceC35651Rg6 m98550n = this.f20033g.m98550n();
                    AgreementRole role = this.f20034h.getRole();
                    if (role == null) {
                        role = AgreementRole.UNKNOWN;
                    }
                    m98550n.setTitle(role.getTitle());
                }
                this.f20033g.m98550n().mo85139Ad(this.f20034h.getContent());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m98533a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "payload", "Lio/reactivex/u;", "Ltg1;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nUserAgreementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementPresenter.kt\nco/bird/android/app/feature/useragreement/UserAgreementPresenterImpl$onCreate$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
        /* renamed from: Kg6$b$b */
        /* loaded from: classes2.dex */
        public static final class C4542b extends Lambda implements Function1<String, InterfaceC24574u<? extends C49375tg1>> {

            /* renamed from: g */
            public final /* synthetic */ C34013Kg6 f20035g;

            /* renamed from: h */
            public final /* synthetic */ Agreement f20036h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4542b(C34013Kg6 c34013Kg6, Agreement agreement) {
                super(1);
                this.f20035g = c34013Kg6;
                this.f20036h = agreement;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends C49375tg1> invoke(String payload) {
                boolean z;
                String str;
                Intrinsics.checkNotNullParameter(payload, "payload");
                AcceptedAgreementPayload m98538z = this.f20035g.m98538z(payload);
                String m39972e = this.f20035g.m98553k().m39972e();
                if (m39972e != null) {
                    if (this.f20036h.getRole() == AgreementRole.MULTI_RIDE_GUEST) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        m39972e = null;
                    }
                    if (m39972e != null) {
                        C34013Kg6 c34013Kg6 = this.f20035g;
                        Agreement agreement = this.f20036h;
                        InterfaceC36821Wg6 m98548p = c34013Kg6.m98548p();
                        if (m98538z != null) {
                            str = m98538z.getEmail();
                        } else {
                            str = null;
                        }
                        m98548p.mo64135d(m39972e, str);
                        InterfaceC44637lg6 m98549o = c34013Kg6.m98549o();
                        C50302vE1[] c50302vE1Arr = new C50302vE1[1];
                        c50302vE1Arr[0] = new C50302vE1(agreement.getId(), m39972e, (m98538z == null || (r9 = m98538z.getEmail()) == null) ? "" : "");
                        AbstractC24507p<C49375tg1> mo2956e = m98549o.mo2956e(c50302vE1Arr);
                        if (mo2956e != null) {
                            return mo2956e;
                        }
                    }
                }
                AbstractC24507p<C49375tg1> m32066I = this.f20035g.m98549o().mo2953h(this.f20036h.getId()).m32066I(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m32066I, "run {\n                us…dSchedulers.mainThread())");
                return C28237sD.progress$default(m32066I, this.f20035g.m98550n(), 0, 2, (Object) null);
            }
        }

        public C4540b() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(Agreement agreement) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            C34013Kg6.this.m98550n().setCancelable(!C34013Kg6.this.m98553k().m39971f());
            C34013Kg6 c34013Kg6 = C34013Kg6.this;
            Observable<String> mo85138M0 = c34013Kg6.m98550n().mo85138M0();
            final C4541a c4541a = new C4541a(C34013Kg6.this, agreement);
            AbstractC24507p<String> firstElement = mo85138M0.doOnSubscribe(new InterfaceC23484g() { // from class: Lg6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C34013Kg6.C4540b.invoke$lambda$0(Function1.this, obj);
                }
            }).firstElement();
            final C4542b c4542b = new C4542b(C34013Kg6.this, agreement);
            AbstractC24507p<R> m32021x = firstElement.m32021x(new InterfaceC23492o() { // from class: Mg6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u invoke$lambda$1;
                    invoke$lambda$1 = C34013Kg6.C4540b.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32021x, "override fun onCreate() …r)\n      .subscribe()\n  }");
            return c34013Kg6.m98542v(m32021x, true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kg6$c */
    /* loaded from: classes2.dex */
    public static final class C4543c extends Lambda implements Function1<String, InterfaceC23496h> {
        public C4543c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34013Kg6.this.m98553k().mo39976a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "errorResponse", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kg6$d */
    /* loaded from: classes2.dex */
    public static final class C4544d extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C4544d f20038g = new C4544d();

        public C4544d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 errorResponse) {
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            return AbstractC23461c.m33080F(new C23130i9(errorResponse));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "error", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/Throwable;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Kg6$e */
    /* loaded from: classes2.dex */
    public static final class C4545e extends Lambda implements Function1<Throwable, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ boolean f20040h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Kg6$e$a */
        /* loaded from: classes2.dex */
        public static final class C4546a extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f20041g;

            /* renamed from: h */
            public final /* synthetic */ boolean f20042h;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Kg6$e$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C4547a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DialogResponse.values().length];
                    try {
                        iArr[DialogResponse.OK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4546a(Throwable th, boolean z) {
                super(1);
                this.f20041g = th;
                this.f20042h = z;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(DialogResponse dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (C4547a.$EnumSwitchMapping$0[dialogResponse.ordinal()] == 1) {
                    return AbstractC23461c.m33080F(this.f20041g);
                }
                if (this.f20042h) {
                    return AbstractC23461c.m33080F(this.f20041g);
                }
                return AbstractC23461c.m33071O();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4545e(boolean z) {
            super(1);
            this.f20040h = z;
        }

        /* renamed from: c */
        public static final InterfaceC23496h m98527c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            AbstractC23442F dialog$default = H31.C3014a.dialog$default(C34013Kg6.this.m98550n(), C48497sB1.f108424d, false, false, 6, null);
            final C4546a c4546a = new C4546a(error, this.f20040h);
            return dialog$default.m33164B(new InterfaceC23492o() { // from class: Ng6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m98527c;
                    m98527c = C34013Kg6.C4545e.m98527c(Function1.this, obj);
                    return m98527c;
                }
            });
        }
    }

    public C34013Kg6(InterfaceC1880Ea analyticsManager, InterfaceC44637lg6 userAgreementManager, InterfaceC36821Wg6 userGuestManager, C22454gl preference, C51174wi2 deserializer, ScopeProvider scopeProvider, InterfaceC35651Rg6 ui, AbstractC20762g9 config, InterfaceC40099e13 navigator, Integer num) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userAgreementManager, "userAgreementManager");
        Intrinsics.checkNotNullParameter(userGuestManager, "userGuestManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f20019a = analyticsManager;
        this.f20020b = userAgreementManager;
        this.f20021c = userGuestManager;
        this.f20022d = preference;
        this.f20023e = deserializer;
        this.f20024f = scopeProvider;
        this.f20025g = ui;
        this.f20026h = config;
        this.f20027i = navigator;
        this.f20028j = num;
    }

    /* renamed from: i */
    public static final void m98555i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23434B m98546r(C34013Kg6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m98556h();
    }

    /* renamed from: s */
    public static final InterfaceC23496h m98545s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m98544t(C34013Kg6 this$0) {
        int collectionSizeOrDefault;
        String str;
        Object obj;
        AgreementRole role;
        String str2;
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1880Ea interfaceC1880Ea = this$0.f20019a;
        Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(this$0.f20022d.m37750B0()));
        List<Agreement> list = this$0.f20029k;
        Intrinsics.checkNotNull(list);
        List<Agreement> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Agreement agreement : list2) {
            arrayList.add(agreement.getId());
        }
        List<Agreement> list3 = this$0.f20029k;
        if (list3 != null) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    AgreementRole role2 = ((Agreement) obj).getRole();
                    if (role2 != null) {
                        str2 = role2.name();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Agreement agreement2 = (Agreement) obj;
            if (agreement2 != null && (role = agreement2.getRole()) != null) {
                str = role.name();
                interfaceC1880Ea.mo55905y(new C44911m81(null, null, null, valueOf, arrayList, str, 7, null));
            }
        }
        str = null;
        interfaceC1880Ea.mo55905y(new C44911m81(null, null, null, valueOf, arrayList, str, 7, null));
    }

    /* renamed from: u */
    public static final InterfaceC23496h m98543u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static /* synthetic */ AbstractC23461c m98541w(C34013Kg6 c34013Kg6, AbstractC24507p abstractC24507p, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c34013Kg6.m98542v(abstractC24507p, z);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m98540x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23496h m98539y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public final Observable<Agreement> m98556h() {
        List flatten;
        boolean contains;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<AgreementKey, List<Agreement>> entry : this.f20020b.mo2957d().getValue().entrySet()) {
            AgreementKey key = entry.getKey();
            contains = ArraysKt___ArraysKt.contains(this.f20026h.m39973d(), key.getAgreementRole());
            if (contains && Intrinsics.areEqual(key.getPartnerId(), this.f20026h.m39975b()) && (Intrinsics.areEqual(key.getUserGuestId(), this.f20026h.m39972e()) || key.getAgreementRole() == AgreementRole.MULTI_RIDE_HOST)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        flatten = CollectionsKt__IterablesKt.flatten(linkedHashMap.values());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : flatten) {
            if (hashSet.add(((Agreement) obj).getId())) {
                arrayList.add(obj);
            }
        }
        this.f20029k = arrayList;
        Observable fromIterable = Observable.fromIterable(arrayList);
        final C4539a c4539a = new C4539a(arrayList);
        Observable<Agreement> doOnSubscribe = fromIterable.doOnSubscribe(new InterfaceC23484g() { // from class: Jg6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj2) {
                C34013Kg6.m98555i(Function1.this, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun agreementsOb…?.name\n      ))\n    }\n  }");
        return doOnSubscribe;
    }

    /* renamed from: j */
    public final InterfaceC1880Ea m98554j() {
        return this.f20019a;
    }

    /* renamed from: k */
    public final AbstractC20762g9 m98553k() {
        return this.f20026h;
    }

    /* renamed from: l */
    public final C22454gl m98552l() {
        return this.f20022d;
    }

    /* renamed from: m */
    public final Integer m98551m() {
        return this.f20028j;
    }

    /* renamed from: n */
    public final InterfaceC35651Rg6 m98550n() {
        return this.f20025g;
    }

    /* renamed from: o */
    public final InterfaceC44637lg6 m98549o() {
        return this.f20020b;
    }

    @Override // p000.InterfaceC32141Cg6
    public boolean onBackPressed() {
        return this.f20026h.m39971f();
    }

    /* renamed from: p */
    public final InterfaceC36821Wg6 m98548p() {
        return this.f20021c;
    }

    /* renamed from: q */
    public void m98547q() {
        Observable<Agreement> m98556h;
        Integer num = this.f20028j;
        if (num != null) {
            this.f20025g.setTitle(num.intValue());
        }
        if (this.f20026h.m39974c()) {
            InterfaceC44637lg6 interfaceC44637lg6 = this.f20020b;
            AgreementRole[] m39973d = this.f20026h.m39973d();
            m98556h = m98541w(this, C28237sD.progress$default(interfaceC44637lg6.mo2955f((AgreementRole[]) Arrays.copyOf(m39973d, m39973d.length), this.f20026h.m39975b(), this.f20026h.m39972e()), this.f20025g, 0, 2, (Object) null), false, 1, null).m33043l(Observable.defer(new Callable() { // from class: Dg6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23434B m98546r;
                    m98546r = C34013Kg6.m98546r(C34013Kg6.this);
                    return m98546r;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(m98556h, "{\n      userAgreementMan…entsObservable() })\n    }");
        } else {
            m98556h = m98556h();
        }
        final C4540b c4540b = new C4540b();
        AbstractC23461c m33049i = m98556h.concatMapCompletable(new InterfaceC23492o() { // from class: Eg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m98545s;
                m98545s = C34013Kg6.m98545s(Function1.this, obj);
                return m98545s;
            }
        }).m33029z(new InterfaceC23478a() { // from class: Fg6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C34013Kg6.m98544t(C34013Kg6.this);
            }
        }).m33049i(this.f20026h.mo39976a());
        Observable<String> mo85138M0 = this.f20025g.mo85138M0();
        final C4543c c4543c = new C4543c();
        AbstractC23461c m33049i2 = m33049i.m33049i(mo85138M0.concatMapCompletable(new InterfaceC23492o() { // from class: Gg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m98543u;
                m98543u = C34013Kg6.m98543u(Function1.this, obj);
                return m98543u;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i2, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n = m33049i2.m33041n(AutoDispose.m45239a(this.f20024f));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: v */
    public final AbstractC23461c m98542v(AbstractC24507p<C49375tg1> abstractC24507p, boolean z) {
        final C4544d c4544d = C4544d.f20038g;
        AbstractC23461c m33070P = abstractC24507p.m32074A(new InterfaceC23492o() { // from class: Hg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m98540x;
                m98540x = C34013Kg6.m98540x(Function1.this, obj);
                return m98540x;
            }
        }).m33070P(C23454a.m33087a());
        final C4545e c4545e = new C4545e(z);
        AbstractC23461c m33066T = m33070P.m33067S(new InterfaceC23492o() { // from class: Ig6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m98539y;
                m98539y = C34013Kg6.m98539y(Function1.this, obj);
                return m98539y;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "private fun Maybe<ErrorR…     }\n      .retry()\n  }");
        return m33066T;
    }

    /* renamed from: z */
    public final AcceptedAgreementPayload m98538z(String str) {
        try {
            return (AcceptedAgreementPayload) this.f20023e.m6459c(str, Reflection.getOrCreateKotlinClass(AcceptedAgreementPayload.class));
        } catch (Exception e) {
            C41318g46.m40159e(e);
            return null;
        }
    }

    public /* synthetic */ C34013Kg6(InterfaceC1880Ea interfaceC1880Ea, InterfaceC44637lg6 interfaceC44637lg6, InterfaceC36821Wg6 interfaceC36821Wg6, C22454gl c22454gl, C51174wi2 c51174wi2, ScopeProvider scopeProvider, InterfaceC35651Rg6 interfaceC35651Rg6, AbstractC20762g9 abstractC20762g9, InterfaceC40099e13 interfaceC40099e13, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1880Ea, interfaceC44637lg6, interfaceC36821Wg6, c22454gl, c51174wi2, scopeProvider, interfaceC35651Rg6, abstractC20762g9, interfaceC40099e13, (i & 512) != 0 ? null : num);
    }
}
