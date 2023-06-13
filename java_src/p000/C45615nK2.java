package p000;

import android.content.Intent;
import android.net.Uri;
import co.bird.android.buava.Optional;
import co.bird.android.model.GoMapDeeplinkParams;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LnK2;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "LaM;", "b", "LaM;", "birdManager", "<init>", "(Le13;LaM;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45615nK2 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f99757a;

    /* renamed from: b */
    public final InterfaceC10636aM f99758b;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireBird;", "it", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nK2$a */
    /* loaded from: classes3.dex */
    public static final class C26460a extends Lambda implements Function1<List<? extends WireBird>, Optional<WireBird>> {

        /* renamed from: g */
        public static final C26460a f99759g = new C26460a();

        public C26460a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<WireBird> invoke(List<WireBird> it) {
            Object firstOrNull;
            Intrinsics.checkNotNullParameter(it, "it");
            Optional.C14443a c14443a = Optional.f63040c;
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) it);
            return c14443a.m59033b(firstOrNull);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nK2$b */
    /* loaded from: classes3.dex */
    public static final class C26461b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C26461b f99760g = new C26461b();

        public C26461b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error encountered while attempting to fetch bird by real id, falling back to legacy behavior", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "optionalWireBird", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nK2$c */
    /* loaded from: classes3.dex */
    public static final class C26462c extends Lambda implements Function1<Optional<WireBird>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Double f99761g;

        /* renamed from: h */
        public final /* synthetic */ Double f99762h;

        /* renamed from: i */
        public final /* synthetic */ String f99763i;

        /* renamed from: j */
        public final /* synthetic */ C45615nK2 f99764j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26462c(Double d, Double d2, String str, C45615nK2 c45615nK2) {
            super(1);
            this.f99761g = d;
            this.f99762h = d2;
            this.f99763i = str;
            this.f99764j = c45615nK2;
        }

        /* renamed from: a */
        public final void m23968a(Optional<WireBird> optional) {
            InterfaceC40099e13.C19924a.goToRider$default(this.f99764j.f99757a, false, false, new GoMapDeeplinkParams(this.f99761g, this.f99762h, optional.m59035e(), this.f99763i), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireBird> optional) {
            m23968a(optional);
            return Unit.INSTANCE;
        }
    }

    public C45615nK2(InterfaceC40099e13 navigator, InterfaceC10636aM birdManager) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        this.f99757a = navigator;
        this.f99758b = birdManager;
    }

    /* renamed from: e */
    public static final Optional m23972e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m23971f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m23970g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        r4 = kotlin.text.StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
        if (r2 != null) goto L29;
     */
    @Override // p000.MV0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC23461c mo4134a(Intent intent) {
        Double d;
        Double d2;
        String queryParameter;
        String queryParameter2;
        AbstractC23442F m33158H;
        Set<String> of;
        double d3;
        String queryParameter3;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        String str = null;
        if (data != null && (queryParameter3 = data.getQueryParameter("lat")) != null) {
            d = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(queryParameter3);
        } else {
            d = null;
        }
        Uri data2 = intent.getData();
        if (data2 == null || (r4 = data2.getQueryParameter("lng")) == null || d2 == null) {
            Uri data3 = intent.getData();
            if (data3 != null && (queryParameter2 = data3.getQueryParameter("lon")) != null) {
                d2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(queryParameter2);
            } else {
                d2 = null;
            }
            if (d2 == null) {
                Uri data4 = intent.getData();
                if (data4 != null && (queryParameter = data4.getQueryParameter("long")) != null) {
                    d2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(queryParameter);
                } else {
                    d2 = null;
                }
            }
        }
        Uri data5 = intent.getData();
        if (data5 != null) {
            str = data5.getQueryParameter("birdId");
        }
        if (str != null) {
            C41318g46.m40163a("attempting to resolve bird/nearby-by-id for unresolved deeplink bird id " + str + " with lat/lon (" + d + ", " + d2 + ")", new Object[0]);
            InterfaceC10636aM interfaceC10636aM = this.f99758b;
            of = SetsKt__SetsJVMKt.setOf(str);
            double d4 = 0.0d;
            if (d != null) {
                d3 = d.doubleValue();
            } else {
                d3 = 0.0d;
            }
            if (d2 != null) {
                d4 = d2.doubleValue();
            }
            AbstractC23442F<List<WireBird>> mo71587V0 = interfaceC10636aM.mo71587V0(of, new WireLocation(d3, d4, null, null, null, null, false, null, null, 508, null).fromLocation());
            if (mo71587V0 != null) {
                final C26460a c26460a = C26460a.f99759g;
                AbstractC23442F<R> m33157I = mo71587V0.m33157I(new InterfaceC23492o() { // from class: kK2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m23972e;
                        m23972e = C45615nK2.m23972e(Function1.this, obj);
                        return m23972e;
                    }
                });
                if (m33157I != 0) {
                    final C26461b c26461b = C26461b.f99760g;
                    AbstractC23442F m33106t = m33157I.m33106t(new InterfaceC23484g() { // from class: lK2
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            C45615nK2.m23971f(Function1.this, obj);
                        }
                    });
                    if (m33106t != null) {
                        m33158H = m33106t.m33148R(Optional.f63040c.m59034a());
                    }
                }
            }
        }
        m33158H = AbstractC23442F.m33158H(Optional.f63040c.m59034a());
        final C26462c c26462c = new C26462c(d, d2, str, this);
        AbstractC23461c m33159G = m33158H.m33101w(new InterfaceC23484g() { // from class: mK2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45615nK2.m23970g(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun navigate(\n …     .ignoreElement()\n  }");
        return m33159G;
    }
}
