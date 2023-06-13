package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireRide;
import co.bird.api.response.DisputeRideFinalizeResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.A51;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u000e\u0012\u0016\u001aB]\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\b\b\u0001\u0010,\u001a\u00020*\u0012\b\b\u0001\u0010-\u001a\u00020*¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+¨\u00060"}, m28432d2 = {"LA51;", "", "", "h", "i", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "g", "f", "j", "LE51;", C17296a.f69688o, "LE51;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "Lgl;", DateTokenConverter.CONVERTER_KEY, "Lgl;", "appPreference", "LTq4;", "e", "LTq4;", "reactiveConfig", "LEa;", "LEa;", "analyticsManager", "LYR4;", "LYR4;", "rideManager", "Lco/bird/android/model/wire/WireRide;", "Lco/bird/android/model/wire/WireRide;", "ride", "", "Ljava/lang/String;", "title", "description", "<init>", "(LE51;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LTq4;LEa;LYR4;Lco/bird/android/model/wire/WireRide;Ljava/lang/String;Ljava/lang/String;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDisputeChargePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisputeChargePresenter.kt\nco/bird/android/feature/selfservepayment/dispute/DisputeChargePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,117:1\n180#2:118\n180#2:119\n*S KotlinDebug\n*F\n+ 1 DisputeChargePresenter.kt\nco/bird/android/feature/selfservepayment/dispute/DisputeChargePresenter\n*L\n73#1:118\n99#1:119\n*E\n"})
/* renamed from: A51 */
/* loaded from: classes3.dex */
public final class A51 {

    /* renamed from: a */
    public final E51 f108a;

    /* renamed from: b */
    public final ScopeProvider f109b;

    /* renamed from: c */
    public final InterfaceC40099e13 f110c;

    /* renamed from: d */
    public final C22454gl f111d;

    /* renamed from: e */
    public final C36207Tq4 f112e;

    /* renamed from: f */
    public final InterfaceC1880Ea f113f;

    /* renamed from: g */
    public final YR4 f114g;

    /* renamed from: h */
    public final WireRide f115h;

    /* renamed from: i */
    public final String f116i;

    /* renamed from: j */
    public final String f117j;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LA51$a;", "LA51$d;", "", "amount", "", "currency", C17296a.f69688o, "(Ljava/lang/Long;Ljava/lang/String;)LA51$a;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: A51$a */
    /* loaded from: classes3.dex */
    public static final class C0015a implements InterfaceC0018d {

        /* renamed from: a */
        public final Long f118a;

        /* renamed from: b */
        public final String f119b;

        public C0015a(Long l, String str) {
            this.f118a = l;
            this.f119b = str;
        }

        public static /* synthetic */ C0015a copy$default(C0015a c0015a, Long l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                l = c0015a.f118a;
            }
            if ((i & 2) != 0) {
                str = c0015a.f119b;
            }
            return c0015a.m116132a(l, str);
        }

        /* renamed from: a */
        public final C0015a m116132a(Long l, String str) {
            return new C0015a(l, str);
        }

        /* renamed from: b */
        public final Long m116131b() {
            return this.f118a;
        }

        /* renamed from: c */
        public final String m116130c() {
            return this.f119b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0015a) {
                C0015a c0015a = (C0015a) obj;
                return Intrinsics.areEqual(this.f118a, c0015a.f118a) && Intrinsics.areEqual(this.f119b, c0015a.f119b);
            }
            return false;
        }

        public int hashCode() {
            Long l = this.f118a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.f119b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            Long l = this.f118a;
            String str = this.f119b;
            return "Claimed(amount=" + l + ", currency=" + str + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LA51$b;", "LA51$d;", "<init>", "()V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: A51$b */
    /* loaded from: classes3.dex */
    public static final class C0016b implements InterfaceC0018d {

        /* renamed from: a */
        public static final C0016b f120a = new C0016b();

        private C0016b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LA51$c;", "LA51$d;", "", "viaGotItPress", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "getViaGotItPress", "()Z", "<init>", "(Z)V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: A51$c */
    /* loaded from: classes3.dex */
    public static final class C0017c implements InterfaceC0018d {

        /* renamed from: a */
        public final boolean f121a;

        public C0017c(boolean z) {
            this.f121a = z;
        }

        public static /* synthetic */ C0017c copy$default(C0017c c0017c, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c0017c.f121a;
            }
            return c0017c.m116129a(z);
        }

        /* renamed from: a */
        public final C0017c m116129a(boolean z) {
            return new C0017c(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0017c) && this.f121a == ((C0017c) obj).f121a;
        }

        public int hashCode() {
            boolean z = this.f121a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f121a;
            return "DismissedUndisputableDialog(viaGotItPress=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m28432d2 = {"LA51$d;", "", "LA51$a;", "LA51$b;", "LA51$c;", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: A51$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC0018d {
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LA51$d;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A51$e */
    /* loaded from: classes3.dex */
    public static final class C0019e extends Lambda implements Function1<Unit, InterfaceC23447K<? extends InterfaceC0018d>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/DisputeRideFinalizeResponse;", "it", "LA51$d;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/DisputeRideFinalizeResponse;)LA51$d;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: A51$e$a */
        /* loaded from: classes3.dex */
        public static final class C0020a extends Lambda implements Function1<DisputeRideFinalizeResponse, InterfaceC0018d> {

            /* renamed from: g */
            public static final C0020a f123g = new C0020a();

            public C0020a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC0018d invoke(DisputeRideFinalizeResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C0015a(it.getAmount(), it.getCurrency());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "Lio/reactivex/K;", "LA51$d;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: A51$e$b */
        /* loaded from: classes3.dex */
        public static final class C0021b extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends InterfaceC0018d>> {

            /* renamed from: g */
            public final /* synthetic */ A51 f124g;

            @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/K;", "LA51$d;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: A51$e$b$a */
            /* loaded from: classes3.dex */
            public static final class C0022a extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends InterfaceC0018d>> {

                /* renamed from: g */
                public static final C0022a f125g = new C0022a();

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: A51$e$b$a$a */
                /* loaded from: classes3.dex */
                public /* synthetic */ class C0023a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DialogResponse.values().length];
                        try {
                            iArr[DialogResponse.OK.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DialogResponse.CANCEL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public C0022a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23447K<? extends InterfaceC0018d> invoke(DialogResponse response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    int i = C0023a.$EnumSwitchMapping$0[response.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            AbstractC23442F m33158H = AbstractC23442F.m33158H(new C0017c(false));
                            Intrinsics.checkNotNullExpressionValue(m33158H, "just(DismissedUndisputableDialog(false))");
                            return m33158H;
                        }
                        AbstractC23442F m33158H2 = AbstractC23442F.m33158H(C0016b.f120a);
                        Intrinsics.checkNotNullExpressionValue(m33158H2, "just(ContactSupport)");
                        return m33158H2;
                    }
                    AbstractC23442F m33158H3 = AbstractC23442F.m33158H(new C0017c(true));
                    Intrinsics.checkNotNullExpressionValue(m33158H3, "just(DismissedUndisputableDialog(true))");
                    return m33158H3;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0021b(A51 a51) {
                super(1);
                this.f124g = a51;
            }

            public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23447K) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public final InterfaceC23447K<? extends InterfaceC0018d> invoke(Throwable th) {
                Intrinsics.checkNotNullParameter(th, "<anonymous parameter 0>");
                AbstractC23442F<DialogResponse> m109410Rl = this.f124g.f108a.m109410Rl();
                final C0022a c0022a = C0022a.f125g;
                return m109410Rl.m33165A(new InterfaceC23492o() { // from class: D51
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K invoke$lambda$0;
                        invoke$lambda$0 = A51.C0019e.C0021b.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
        }

        public C0019e() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC0018d m116126c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC0018d) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final InterfaceC23447K m116125d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends InterfaceC0018d> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F<DisputeRideFinalizeResponse> mo75063I = A51.this.f114g.mo75063I(A51.this.f115h);
            final C0020a c0020a = C0020a.f123g;
            AbstractC23442F<R> m33157I = mo75063I.m33157I(new InterfaceC23492o() { // from class: B51
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    A51.InterfaceC0018d m116126c;
                    m116126c = A51.C0019e.m116126c(Function1.this, obj);
                    return m116126c;
                }
            });
            final C0021b c0021b = new C0021b(A51.this);
            return m33157I.m33150P(new InterfaceC23492o() { // from class: C51
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m116125d;
                    m116125d = A51.C0019e.m116125d(Function1.this, obj);
                    return m116125d;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LA51$d;", "kotlin.jvm.PlatformType", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(LA51$d;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A51$f */
    /* loaded from: classes3.dex */
    public static final class C0024f extends Lambda implements Function1<InterfaceC0018d, Unit> {
        public C0024f() {
            super(1);
        }

        /* renamed from: a */
        public final void m116121a(InterfaceC0018d interfaceC0018d) {
            if (interfaceC0018d instanceof C0015a) {
                C0015a c0015a = (C0015a) interfaceC0018d;
                A51.this.f110c.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("transaction_amount", c0015a.m116131b()), TuplesKt.m28425to("transaction_currency", c0015a.m116130c()));
            } else if (interfaceC0018d instanceof C0016b) {
                A51.this.f110c.mo37003j0(MapMode.RIDER, A51.this.f112e.m82623f8().m73665a().getRideConfig().getDispute().getZendeskArticleId(), true);
            } else {
                boolean z = interfaceC0018d instanceof C0017c;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0018d interfaceC0018d) {
            m116121a(interfaceC0018d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: A51$g */
    /* loaded from: classes3.dex */
    public static final class C0025g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0025g f127g = new C0025g();

        public C0025g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling claim button click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: A51$h */
    /* loaded from: classes3.dex */
    public static final class C0026h extends Lambda implements Function1<Unit, Unit> {
        public C0026h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            A51.this.f110c.mo37003j0(MapMode.RIDER, A51.this.f112e.m82623f8().m73665a().getRideConfig().getDispute().getZendeskArticleId(), true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: A51$i */
    /* loaded from: classes3.dex */
    public static final class C0027i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0027i f129g = new C0027i();

        public C0027i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling help button click", new Object[0]);
        }
    }

    public A51(E51 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, YR4 rideManager, WireRide ride, String title, String description) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f108a = ui;
        this.f109b = scopeProvider;
        this.f110c = navigator;
        this.f111d = appPreference;
        this.f112e = reactiveConfig;
        this.f113f = analyticsManager;
        this.f114g = rideManager;
        this.f115h = ride;
        this.f116i = title;
        this.f117j = description;
    }

    /* renamed from: k */
    public static final InterfaceC23447K m116137k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m116136l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m116135m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m116134n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m116133o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public final void m116142f() {
        this.f108a.m109408t(this.f116i);
        this.f108a.m109411Ql(this.f117j);
    }

    /* renamed from: g */
    public final void m116141g(int i, int i2, Intent intent) {
    }

    /* renamed from: h */
    public final void m116140h() {
    }

    /* renamed from: i */
    public final void m116139i() {
        m116142f();
        m116138j();
    }

    /* renamed from: j */
    public final void m116138j() {
        Observable<Unit> m109412Pl = this.f108a.m109412Pl();
        final C0019e c0019e = new C0019e();
        Observable observeOn = m109412Pl.flatMapSingle(new InterfaceC23492o() { // from class: v51
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m116137k;
                m116137k = A51.m116137k(Function1.this, obj);
                return m116137k;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "private fun setupClickLi…ton click\")\n      })\n\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f109b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0024f c0024f = new C0024f();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: w51
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                A51.m116136l(Function1.this, obj);
            }
        };
        final C0025g c0025g = C0025g.f127g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: x51
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                A51.m116135m(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f108a.m109409r0().m33094as(AutoDispose.m45239a(this.f109b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0026h c0026h = new C0026h();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: y51
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                A51.m116134n(Function1.this, obj);
            }
        };
        final C0027i c0027i = C0027i.f129g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: z51
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                A51.m116133o(Function1.this, obj);
            }
        });
    }
}
