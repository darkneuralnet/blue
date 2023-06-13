package p000;

import co.bird.android.model.constant.BirdStatus;
import co.bird.android.model.wire.WireBirdEvent;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC29169uL;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, m28432d2 = {"LuL;", "", "Lco/bird/android/model/wire/WireBirdEvent;", "event", "", C17296a.f69688o, "Lio/reactivex/Observable;", "b", "()Lio/reactivex/Observable;", "eventStream", "c", "ackLockEvents", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uL */
/* loaded from: classes2.dex */
public interface InterfaceC29169uL {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: uL$a */
    /* loaded from: classes2.dex */
    public static final class C29170a {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdEvent;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBirdEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: uL$a$a */
        /* loaded from: classes2.dex */
        public static final class C29171a extends Lambda implements Function1<WireBirdEvent, Boolean> {

            /* renamed from: g */
            public static final C29171a f112220g = new C29171a();

            public C29171a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(WireBirdEvent it) {
                boolean z;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getStatus() == BirdStatus.ACK_LOCKED) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: b */
        public static boolean m10424b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: c */
        public static Observable<WireBirdEvent> m10423c(InterfaceC29169uL interfaceC29169uL) {
            Observable<WireBirdEvent> mo6981b = interfaceC29169uL.mo6981b();
            final C29171a c29171a = C29171a.f112220g;
            Observable<WireBirdEvent> filter = mo6981b.filter(new InterfaceC23494q() { // from class: tL
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m10424b;
                    m10424b = InterfaceC29169uL.C29170a.m10424b(Function1.this, obj);
                    return m10424b;
                }
            });
            Intrinsics.checkNotNullExpressionValue(filter, "eventStream.filter { it.status == ACK_LOCKED }");
            return filter;
        }
    }

    /* renamed from: a */
    void mo6982a(WireBirdEvent wireBirdEvent);

    /* renamed from: b */
    Observable<WireBirdEvent> mo6981b();

    /* renamed from: c */
    Observable<WireBirdEvent> mo6980c();
}
