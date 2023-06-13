package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver;
import co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\f"}, m28432d2 = {"LCq3;", "", "LfR3;", "impl", "LeR3;", "e", "LaR3;", "LGQ3;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: Cq3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC32228Cq3 {

    /* renamed from: a */
    public static final C1217a f4800a = new C1217a(null);

    @Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007J6\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u0018"}, m28432d2 = {"LCq3$a;", "", "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;", "receiver", "Lio/reactivex/Observable;", "", "b", "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;", C17296a.f69688o, "LG03;", "factory", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "scopeProvider", "LIq3;", "navigationDrawerUi", "Le13;", "navigator", "LDQ3;", "permissionManager", "LaZ2;", "c", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: Cq3$a */
    /* loaded from: classes2.dex */
    public static final class C1217a {
        public /* synthetic */ C1217a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @JvmStatic
        /* renamed from: a */
        public final Observable<Boolean> m111416a(BluetoothEnableChangeReceiver receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return receiver.m60330a();
        }

        @Provides
        @JvmStatic
        /* renamed from: b */
        public final Observable<Boolean> m111415b(LocationEnableChangeReceiver receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return receiver.m60328a();
        }

        @Provides
        @JvmStatic
        /* renamed from: c */
        public final InterfaceC38024aZ2 m111414c(G03 factory, LifecycleScopeProvider<EnumC7097RE> scopeProvider, C33632Iq3 navigationDrawerUi, InterfaceC40099e13 navigator, DQ3 permissionManager) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
            Intrinsics.checkNotNullParameter(navigationDrawerUi, "navigationDrawerUi");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
            return factory.mo103080a(scopeProvider, navigationDrawerUi, navigator, permissionManager);
        }

        private C1217a() {
        }
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final Observable<Boolean> m111421a(BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver) {
        return f4800a.m111416a(bluetoothEnableChangeReceiver);
    }

    @Provides
    @JvmStatic
    /* renamed from: b */
    public static final Observable<Boolean> m111420b(LocationEnableChangeReceiver locationEnableChangeReceiver) {
        return f4800a.m111415b(locationEnableChangeReceiver);
    }

    @Provides
    @JvmStatic
    /* renamed from: c */
    public static final InterfaceC38024aZ2 m111419c(G03 g03, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, C33632Iq3 c33632Iq3, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return f4800a.m111414c(g03, lifecycleScopeProvider, c33632Iq3, interfaceC40099e13, dq3);
    }

    @Binds
    /* renamed from: d */
    public abstract GQ3 m111418d(C37953aR3 c37953aR3);

    @Binds
    /* renamed from: e */
    public abstract InterfaceC40342eR3 m111417e(C40935fR3 c40935fR3);
}
