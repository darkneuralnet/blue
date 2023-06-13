package co.bird.android.manager.vtbeacon;

import co.bird.android.manager.vtbeacon.C16232a;
import co.bird.android.manager.vtbeacon.VTBeaconError;
import com.facebook.share.internal.C17296a;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0004B\u0011\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/manager/vtbeacon/a;", "Laj6;", "Lio/reactivex/F;", "", C17296a.f69688o, "macAddress", "pin", "newProximityUUID", "", "newMajorNumber", "newMinorNumber", "newPin", "Lio/reactivex/c;", "b", "Lke5;", "o", "LXi6;", "command", "y", "Lde5;", "Lde5;", "rxBleClient", "<init>", "(Lde5;)V", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.manager.vtbeacon.a */
/* loaded from: classes4.dex */
public final class C16232a implements InterfaceC38127aj6 {

    /* renamed from: b */
    public static final C16233a f66541b = new C16233a(null);

    /* renamed from: a */
    public final AbstractC39873de5 f66542a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/manager/vtbeacon/a$a;", "", "", "MIN_NEARBY_RSSI", "I", "", "VT_BEACON_NAME", "Ljava/lang/String;", "<init>", "()V", "vtbeacon_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$a */
    /* loaded from: classes4.dex */
    public static final class C16233a {
        public /* synthetic */ C16233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16233a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "error", "Lio/reactivex/K;", "Lke5;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$b */
    /* loaded from: classes4.dex */
    public static final class C16234b extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC44023ke5 f66544h;

        /* renamed from: i */
        public final /* synthetic */ String f66545i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16234b(InterfaceC44023ke5 interfaceC44023ke5, String str) {
            super(1);
            this.f66544h = interfaceC44023ke5;
            this.f66545i = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (error instanceof VTBeaconError.CommandFailed) {
                return C16232a.this.m55452y(this.f66544h, new C37541Zi6(this.f66545i));
            }
            return AbstractC23442F.m33100x(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$c */
    /* loaded from: classes4.dex */
    public static final class C16235c extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: h */
        public final /* synthetic */ String f66547h;

        /* renamed from: i */
        public final /* synthetic */ String f66548i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16235c(String str, String str2) {
            super(1);
            this.f66547h = str;
            this.f66548i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16232a.this.m55462o(it, this.f66547h, this.f66548i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$d */
    /* loaded from: classes4.dex */
    public static final class C16236d extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: h */
        public final /* synthetic */ String f66550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16236d(String str) {
            super(1);
            this.f66550h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C16232a c16232a = C16232a.this;
            UUID fromString = UUID.fromString(this.f66550h);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(newProximityUUID)");
            return c16232a.m55452y(it, new C48225rj6(fromString));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$e */
    /* loaded from: classes4.dex */
    public static final class C16237e extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: h */
        public final /* synthetic */ short f66552h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16237e(short s) {
            super(1);
            this.f66552h = s;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16232a.this.m55452y(it, new C46446oj6(this.f66552h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$f */
    /* loaded from: classes4.dex */
    public static final class C16238f extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: h */
        public final /* synthetic */ short f66554h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16238f(short s) {
            super(1);
            this.f66554h = s;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16232a.this.m55452y(it, new C47039pj6(this.f66554h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lke5;", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lke5;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$g */
    /* loaded from: classes4.dex */
    public static final class C16239g extends Lambda implements Function1<InterfaceC44023ke5, InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: h */
        public final /* synthetic */ String f66556h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16239g(String str) {
            super(1);
            this.f66556h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(InterfaceC44023ke5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C16232a.this.m55452y(it, new C47632qj6(this.f66556h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$h */
    /* loaded from: classes4.dex */
    public static final class C16240h extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C16240h f66557g = new C16240h();

        public C16240h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(C36388Uk5.m80922c(it), "VT01M25B"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LTk5;", "it", "", C17296a.f69688o, "(LTk5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$i */
    /* loaded from: classes4.dex */
    public static final class C16241i extends Lambda implements Function1<C36154Tk5, Boolean> {

        /* renamed from: g */
        public static final C16241i f66558g = new C16241i();

        public C16241i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C36154Tk5 it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m83015b() > -50) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LTk5;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LTk5;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$j */
    /* loaded from: classes4.dex */
    public static final class C16242j extends Lambda implements Function1<C36154Tk5, String> {

        /* renamed from: g */
        public static final C16242j f66559g = new C16242j();

        public C16242j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(C36154Tk5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m83016a().mo17280e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000 \u0002*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "ackObserver", "Lio/reactivex/K;", "b", "(Lio/reactivex/Observable;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$k */
    /* loaded from: classes4.dex */
    public static final class C16243k extends Lambda implements Function1<Observable<byte[]>, InterfaceC23447K<? extends Observable<byte[]>>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC44023ke5 f66560g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC37073Xi6 f66561h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", C17296a.f69688o, "([B)Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.vtbeacon.a$k$a */
        /* loaded from: classes4.dex */
        public static final class C16244a extends Lambda implements Function1<byte[], Observable<byte[]>> {

            /* renamed from: g */
            public final /* synthetic */ Observable<byte[]> f66562g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16244a(Observable<byte[]> observable) {
                super(1);
                this.f66562g = observable;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Observable<byte[]> invoke(byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f66562g;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16243k(InterfaceC44023ke5 interfaceC44023ke5, InterfaceC37073Xi6 interfaceC37073Xi6) {
            super(1);
            this.f66560g = interfaceC44023ke5;
            this.f66561h = interfaceC37073Xi6;
        }

        /* renamed from: c */
        public static final Observable m55440c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Observable) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Observable<byte[]>> invoke(Observable<byte[]> ackObserver) {
            Intrinsics.checkNotNullParameter(ackObserver, "ackObserver");
            AbstractC23442F<byte[]> mo27056c = this.f66560g.mo27056c(EnumC36839Wi6.f41560c.m77954b(), C37307Yi6.m74360b(this.f66561h));
            final C16244a c16244a = new C16244a(ackObserver);
            return mo27056c.m33157I(new InterfaceC23492o() { // from class: nj6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Observable m55440c;
                    m55440c = C16232a.C16243k.m55440c(Function1.this, obj);
                    return m55440c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/B;", "invoke", "(Lio/reactivex/Observable;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$l */
    /* loaded from: classes4.dex */
    public static final class C16245l extends Lambda implements Function1<Observable<byte[]>, InterfaceC23434B<? extends byte[]>> {

        /* renamed from: g */
        public static final C16245l f66563g = new C16245l();

        public C16245l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends byte[]> invoke(Observable<byte[]> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/K;", "Lke5;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.vtbeacon.a$m */
    /* loaded from: classes4.dex */
    public static final class C16246m extends Lambda implements Function1<byte[], InterfaceC23447K<? extends InterfaceC44023ke5>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC44023ke5 f66564g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC37073Xi6 f66565h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16246m(InterfaceC44023ke5 interfaceC44023ke5, InterfaceC37073Xi6 interfaceC37073Xi6) {
            super(1);
            this.f66564g = interfaceC44023ke5;
            this.f66565h = interfaceC37073Xi6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
            if (r3[1] == 1) goto L5;
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC23447K<? extends InterfaceC44023ke5> invoke(byte[] result) {
            Intrinsics.checkNotNullParameter(result, "result");
            boolean z = result.length == 2;
            return z ? AbstractC23442F.m33158H(this.f66564g) : AbstractC23442F.m33100x(new VTBeaconError.CommandFailed(this.f66565h.mo15543E()));
        }
    }

    public C16232a(AbstractC39873de5 rxBleClient) {
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        this.f66542a = rxBleClient;
    }

    /* renamed from: A */
    public static final InterfaceC23447K m55478A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23447K m55477B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC23447K m55461p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m55460q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m55459r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC23447K m55458s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m55457t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23447K m55456u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final boolean m55455v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: w */
    public static final boolean m55454w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: x */
    public static final String m55453x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m55451z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC38127aj6
    /* renamed from: a */
    public AbstractC23442F<String> mo55476a() {
        Observable<C36154Tk5> mo33639e = this.f66542a.mo33639e(new ScanSettings.C18579b().m45822b(2).m45823a(), new ScanFilter.C18577b().m45844a());
        final C16240h c16240h = C16240h.f66557g;
        Observable<C36154Tk5> filter = mo33639e.filter(new InterfaceC23494q() { // from class: hj6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m55455v;
                m55455v = C16232a.m55455v(Function1.this, obj);
                return m55455v;
            }
        });
        final C16241i c16241i = C16241i.f66558g;
        Observable<C36154Tk5> filter2 = filter.filter(new InterfaceC23494q() { // from class: ij6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m55454w;
                m55454w = C16232a.m55454w(Function1.this, obj);
                return m55454w;
            }
        });
        final C16242j c16242j = C16242j.f66559g;
        AbstractC23442F<String> firstOrError = filter2.map(new InterfaceC23492o() { // from class: jj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m55453x;
                m55453x = C16232a.m55453x(Function1.this, obj);
                return m55453x;
            }
        }).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "rxBleClient.scanBleDevic…s }\n      .firstOrError()");
        return firstOrError;
    }

    @Override // p000.InterfaceC38127aj6
    /* renamed from: b */
    public AbstractC23461c mo55475b(String macAddress, String pin, String newProximityUUID, short s, short s2, String newPin) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(newProximityUUID, "newProximityUUID");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        InterfaceC45802ne5 mo33642b = this.f66542a.mo33642b(macAddress);
        if (mo33642b == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new VTBeaconError.UnknownDevice(macAddress));
            Intrinsics.checkNotNullExpressionValue(m33080F, "error(VTBeaconError.UnknownDevice(macAddress))");
            return m33080F;
        }
        Observable<InterfaceC44023ke5> mo17284a = mo33642b.mo17284a(false);
        final C16235c c16235c = new C16235c(pin, newPin);
        Observable<R> flatMapSingle = mo17284a.flatMapSingle(new InterfaceC23492o() { // from class: kj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55460q;
                m55460q = C16232a.m55460q(Function1.this, obj);
                return m55460q;
            }
        });
        final C16236d c16236d = new C16236d(newProximityUUID);
        Observable flatMapSingle2 = flatMapSingle.flatMapSingle(new InterfaceC23492o() { // from class: lj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55459r;
                m55459r = C16232a.m55459r(Function1.this, obj);
                return m55459r;
            }
        });
        final C16237e c16237e = new C16237e(s);
        Observable flatMapSingle3 = flatMapSingle2.flatMapSingle(new InterfaceC23492o() { // from class: mj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55458s;
                m55458s = C16232a.m55458s(Function1.this, obj);
                return m55458s;
            }
        });
        final C16238f c16238f = new C16238f(s2);
        Observable flatMapSingle4 = flatMapSingle3.flatMapSingle(new InterfaceC23492o() { // from class: cj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55457t;
                m55457t = C16232a.m55457t(Function1.this, obj);
                return m55457t;
            }
        });
        final C16239g c16239g = new C16239g(newPin);
        AbstractC23461c m33159G = flatMapSingle4.flatMapSingle(new InterfaceC23492o() { // from class: dj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55456u;
                m55456u = C16232a.m55456u(Function1.this, obj);
                return m55456u;
            }
        }).firstOrError().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun configureBe…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: o */
    public final AbstractC23442F<InterfaceC44023ke5> m55462o(InterfaceC44023ke5 interfaceC44023ke5, String str, String str2) {
        AbstractC23442F<InterfaceC44023ke5> m55452y = m55452y(interfaceC44023ke5, new C37541Zi6(str));
        final C16234b c16234b = new C16234b(interfaceC44023ke5, str2);
        AbstractC23442F<InterfaceC44023ke5> m33150P = m55452y.m33150P(new InterfaceC23492o() { // from class: bj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55461p;
                m55461p = C16232a.m55461p(Function1.this, obj);
                return m55461p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33150P, "private fun RxBleConnect…or)\n        }\n      }\n  }");
        return m33150P;
    }

    /* renamed from: y */
    public final AbstractC23442F<InterfaceC44023ke5> m55452y(InterfaceC44023ke5 interfaceC44023ke5, InterfaceC37073Xi6 interfaceC37073Xi6) {
        Observable<Observable<byte[]>> mo27055d = interfaceC44023ke5.mo27055d(EnumC36839Wi6.f41561d.m77954b());
        final C16243k c16243k = new C16243k(interfaceC44023ke5, interfaceC37073Xi6);
        Observable<R> flatMapSingle = mo27055d.flatMapSingle(new InterfaceC23492o() { // from class: ej6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55477B;
                m55477B = C16232a.m55477B(Function1.this, obj);
                return m55477B;
            }
        });
        final C16245l c16245l = C16245l.f66563g;
        Observable flatMap = flatMapSingle.flatMap(new InterfaceC23492o() { // from class: fj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m55451z;
                m55451z = C16232a.m55451z(Function1.this, obj);
                return m55451z;
            }
        });
        final C16246m c16246m = new C16246m(interfaceC44023ke5, interfaceC37073Xi6);
        AbstractC23442F<InterfaceC44023ke5> firstOrError = flatMap.flatMapSingle(new InterfaceC23492o() { // from class: gj6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m55478A;
                m55478A = C16232a.m55478A(Function1.this, obj);
                return m55478A;
            }
        }).timeout(10L, TimeUnit.SECONDS).firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "RxBleConnection.write(co…DS)\n      .firstOrError()");
        return firstOrError;
    }
}
