package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"\u001c\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003\"\u001c\u0010\b\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003¨\u0006\t"}, m28432d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Ljava/util/UUID;", "SMARTLOCK_SOLEBE_SERVICE_UUID", "b", "SMARTLOCK_SOLEBE_WRITE_COMMAND_CHARACTERISTIC", "c", "SMARTLOCK_SOLEBE_NOTIFICATION_CHARACTERISTIC", "impl_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: DK5 */
/* loaded from: classes4.dex */
public final class DK5 {

    /* renamed from: a */
    public static final UUID f5528a = UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb");

    /* renamed from: b */
    public static final UUID f5529b = UUID.fromString("000036f5-0000-1000-8000-00805f9b34fb");

    /* renamed from: c */
    public static final UUID f5530c = UUID.fromString("000036f6-0000-1000-8000-00805f9b34fb");

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DK5$a */
    /* loaded from: classes4.dex */
    public static final class C1446a implements InterfaceC23492o {

        /* renamed from: b */
        public final /* synthetic */ Function1 f5531b;

        public C1446a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f5531b = function;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f5531b.invoke(obj);
        }
    }
}
