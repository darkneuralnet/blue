package p000;

import android.location.Location;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.api.request.BluetoothTrackBody;
import co.bird.api.request.TokenBody;
import co.bird.api.request.TrackBirdBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC25136kJ;
import p000.InterfaceC8601VK;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0014\u001a\u00020\u0011*\u00020\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LoJ;", "LkJ;", "", "serialNumber", "", "distance", "Lio/reactivex/Observable;", "Y", "imei", "bleMacAddress", "Lio/reactivex/F;", "q0", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;", RequestHeadersFactory.MODEL, "battery", "Landroid/location/Location;", "location", "Lco/bird/api/request/BluetoothTrackBody;", "p1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;", "v", "", "h", "LVK;", "b", "LVK;", "birdClient", "<init>", "(LVK;)V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oJ */
/* loaded from: classes4.dex */
public final class C26900oJ implements InterfaceC25136kJ {

    /* renamed from: b */
    public final InterfaceC8601VK f101763b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/TokenBody;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/TokenBody;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oJ$a */
    /* loaded from: classes4.dex */
    public static final class C26901a extends Lambda implements Function1<TokenBody, String> {

        /* renamed from: g */
        public static final C26901a f101764g = new C26901a();

        public C26901a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(TokenBody it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getToken() != null) {
                return it.getToken();
            }
            throw new NullPointerException("Call to bird/token endpoint returned a null token response.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/TokenBody;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/TokenBody;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oJ$b */
    /* loaded from: classes4.dex */
    public static final class C26902b extends Lambda implements Function1<TokenBody, String> {

        /* renamed from: g */
        public static final C26902b f101765g = new C26902b();

        public C26902b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(TokenBody it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getToken() != null) {
                return it.getToken();
            }
            throw new NullPointerException("Call to bird/token endpoint returned a null token response.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/api/request/BluetoothTrackBody;", "trackResponse", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/BluetoothTrackBody;)Lco/bird/api/request/BluetoothTrackBody;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: oJ$c */
    /* loaded from: classes4.dex */
    public static final class C26903c extends Lambda implements Function1<BluetoothTrackBody, BluetoothTrackBody> {

        /* renamed from: h */
        public final /* synthetic */ String f101767h;

        /* renamed from: i */
        public final /* synthetic */ String f101768i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26903c(String str, String str2) {
            super(1);
            this.f101767h = str;
            this.f101768i = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BluetoothTrackBody invoke(BluetoothTrackBody trackResponse) {
            Intrinsics.checkNotNullParameter(trackResponse, "trackResponse");
            if (trackResponse.getEcuType() == null && C26900oJ.this.m21384h(this.f101767h, this.f101768i)) {
                return C26900oJ.this.m21379v(trackResponse);
            }
            return trackResponse;
        }
    }

    public C26900oJ(InterfaceC8601VK birdClient) {
        Intrinsics.checkNotNullParameter(birdClient, "birdClient");
        this.f101763b = birdClient;
    }

    /* renamed from: f */
    public static final String m21386f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final String m21385g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final BluetoothTrackBody m21380r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BluetoothTrackBody) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC25136kJ
    /* renamed from: Y */
    public Observable<String> mo21390Y(String serialNumber, int i) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Observable retry = InterfaceC8601VK.C8602a.getToken$default(this.f101763b, Integer.valueOf(i), serialNumber, null, null, 12, null).subscribeOn(C24542a.m31932c()).retry(1L);
        final C26901a c26901a = C26901a.f101764g;
        Observable<String> map = retry.map(new InterfaceC23492o() { // from class: nJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m21386f;
                m21386f = C26900oJ.m21386f(Function1.this, obj);
                return m21386f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "birdClient\n      .getTok…\n        it.token\n      }");
        return map;
    }

    /* renamed from: h */
    public final boolean m21384h(String str, String str2) {
        boolean startsWith$default;
        boolean startsWith;
        if (str2 != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str2, "bd", true);
            return startsWith;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "BD", false, 2, null);
        return startsWith$default;
    }

    /* renamed from: i */
    public <T> AbstractC23442F<T> m21383i(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC25136kJ.C25137a.m29076e(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC25136kJ.C25137a.m29079b(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC25136kJ.C25137a.m29078c(this);
    }

    @Override // p000.InterfaceC25136kJ
    /* renamed from: p1 */
    public AbstractC23442F<BluetoothTrackBody> mo21382p1(String serialNumber, String str, Integer num, Integer num2, Location location) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<BluetoothTrackBody> m79977H = this.f101763b.m79977H(new TrackBirdBody(serialNumber, num, num2, WireLocationKt.toLocation$default(location, null, 1, null)));
        final C26903c c26903c = new C26903c(serialNumber, str);
        InterfaceC23447K m33157I = m79977H.m33157I(new InterfaceC23492o() { // from class: lJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BluetoothTrackBody m21380r;
                m21380r = C26900oJ.m21380r(Function1.this, obj);
                return m21380r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun trackBird(s…}\n      .schedulers()\n  }");
        AbstractC23442F<BluetoothTrackBody> m21383i = m21383i(m33157I);
        Intrinsics.checkNotNullExpressionValue(m21383i, "override fun trackBird(s…}\n      .schedulers()\n  }");
        return m21383i;
    }

    @Override // p000.InterfaceC25136kJ
    /* renamed from: q0 */
    public AbstractC23442F<String> mo21381q0(String str, Integer num, String str2, String str3) {
        AbstractC23442F<TokenBody> m33146T = this.f101763b.m79973L(num, str, str2, str3).firstOrError().m33142Y(C24542a.m31932c()).m33146T(1L);
        final C26902b c26902b = C26902b.f101765g;
        AbstractC23442F m33157I = m33146T.m33157I(new InterfaceC23492o() { // from class: mJ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m21385g;
                m21385g = C26900oJ.m21385g(Function1.this, obj);
                return m21385g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "birdClient\n      .getTok…\n        it.token\n      }");
        return m33157I;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC25136kJ.C25137a.m29077d(this);
    }

    /* renamed from: v */
    public final BluetoothTrackBody m21379v(BluetoothTrackBody bluetoothTrackBody) {
        Integer maxSpeed = bluetoothTrackBody.getMaxSpeed();
        if (maxSpeed != null) {
            int intValue = maxSpeed.intValue();
            int i = 1;
            if (intValue == 1) {
                i = 7;
            } else if (intValue <= 8047) {
                i = 6;
            } else if (intValue <= 11265) {
                i = 5;
            } else if (intValue <= 17709) {
                i = 4;
            } else if (intValue <= 20292) {
                i = 3;
            } else if (intValue <= 24000) {
                i = 2;
            } else if (intValue > 27359) {
                i = 0;
            }
            return bluetoothTrackBody.copy(Integer.valueOf(i), 0);
        }
        return bluetoothTrackBody;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC25136kJ.C25137a.m29080a(this);
    }
}
