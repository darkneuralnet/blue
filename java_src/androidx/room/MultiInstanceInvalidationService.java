package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.UO1;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "b", "I", "c", "()I", DateTokenConverter.CONVERTER_KEY, "(I)V", "maxClientId", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "LTO1;", "Landroid/os/RemoteCallbackList;", C17296a.f69688o, "()Landroid/os/RemoteCallbackList;", "callbackList", "LUO1$a;", "e", "LUO1$a;", "binder", "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b */
    public int f55607b;

    /* renamed from: c */
    public final Map<Integer, String> f55608c = new LinkedHashMap();

    /* renamed from: d */
    public final RemoteCallbackList<TO1> f55609d = new RemoteCallbackListC11963b();

    /* renamed from: e */
    public final UO1.AbstractBinderC8272a f55610e = new BinderC11962a();

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016J'\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"androidx/room/MultiInstanceInvalidationService$a", "LUO1$a;", "LTO1;", "callback", "", "name", "", "r2", "clientId", "", "Q4", "", "tables", "x3", "(I[Ljava/lang/String;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: classes.dex */
    public static final class BinderC11962a extends UO1.AbstractBinderC8272a {
        public BinderC11962a() {
        }

        @Override // p000.UO1
        /* renamed from: Q4 */
        public void mo66083Q4(TO1 callback, int i) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList<TO1> m66087a = MultiInstanceInvalidationService.this.m66087a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (m66087a) {
                multiInstanceInvalidationService.m66087a().unregister(callback);
                multiInstanceInvalidationService.m66086b().remove(Integer.valueOf(i));
            }
        }

        @Override // p000.UO1
        /* renamed from: r2 */
        public int mo66082r2(TO1 callback, String str) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<TO1> m66087a = MultiInstanceInvalidationService.this.m66087a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (m66087a) {
                multiInstanceInvalidationService.m66084d(multiInstanceInvalidationService.m66085c() + 1);
                int m66085c = multiInstanceInvalidationService.m66085c();
                if (multiInstanceInvalidationService.m66087a().register(callback, Integer.valueOf(m66085c))) {
                    multiInstanceInvalidationService.m66086b().put(Integer.valueOf(m66085c), str);
                    i = m66085c;
                } else {
                    multiInstanceInvalidationService.m66084d(multiInstanceInvalidationService.m66085c() - 1);
                    multiInstanceInvalidationService.m66085c();
                }
            }
            return i;
        }

        @Override // p000.UO1
        /* renamed from: x3 */
        public void mo66081x3(int i, String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList<TO1> m66087a = MultiInstanceInvalidationService.this.m66087a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (m66087a) {
                String str = multiInstanceInvalidationService.m66086b().get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.m66087a().beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    Object broadcastCookie = multiInstanceInvalidationService.m66087a().getBroadcastCookie(i2);
                    Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = multiInstanceInvalidationService.m66086b().get(Integer.valueOf(intValue));
                    if (i != intValue && Intrinsics.areEqual(str, str2)) {
                        try {
                            multiInstanceInvalidationService.m66087a().getBroadcastItem(i2).mo83702G(tables);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                multiInstanceInvalidationService.m66087a().finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "LTO1;", "callback", "", "cookie", "", C17296a.f69688o, "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: classes.dex */
    public static final class RemoteCallbackListC11963b extends RemoteCallbackList<TO1> {
        public RemoteCallbackListC11963b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(TO1 callback, Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.m66086b().remove((Integer) cookie);
        }
    }

    /* renamed from: a */
    public final RemoteCallbackList<TO1> m66087a() {
        return this.f55609d;
    }

    /* renamed from: b */
    public final Map<Integer, String> m66086b() {
        return this.f55608c;
    }

    /* renamed from: c */
    public final int m66085c() {
        return this.f55607b;
    }

    /* renamed from: d */
    public final void m66084d(int i) {
        this.f55607b = i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f55610e;
    }
}
