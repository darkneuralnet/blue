package p000;

import ch.qos.logback.core.CoreConstants;
import com.polidea.rxandroidble2.exceptions.BleGattException;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.Observable;
import java.util.UUID;
/* renamed from: ke5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC44023ke5 {

    /* renamed from: ke5$a */
    /* loaded from: classes6.dex */
    public enum EnumC25197a {
        CONNECTING("CONNECTING"),
        CONNECTED("CONNECTED"),
        DISCONNECTED("DISCONNECTED"),
        DISCONNECTING("DISCONNECTING");
        

        /* renamed from: b */
        public final String f94706b;

        EnumC25197a(String str) {
            this.f94706b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "RxBleConnectionState{" + this.f94706b + CoreConstants.CURLY_RIGHT;
        }
    }

    /* renamed from: ke5$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC25198b extends InterfaceC23435C<Boolean, Boolean> {
    }

    /* renamed from: ke5$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC25199c extends InterfaceC23435C<C25200a, C25200a> {

        /* renamed from: ke5$c$a */
        /* loaded from: classes6.dex */
        public static class C25200a {

            /* renamed from: a */
            public final BleGattException f94707a;

            /* renamed from: a */
            public BleGattException m28704a() {
                return this.f94707a;
            }
        }
    }

    /* renamed from: a */
    AbstractC23442F<C49952ue5> mo27058a();

    /* renamed from: b */
    Observable<Observable<byte[]>> mo27057b(UUID uuid, EnumC41046fd3 enumC41046fd3);

    /* renamed from: c */
    AbstractC23442F<byte[]> mo27056c(UUID uuid, byte[] bArr);

    /* renamed from: d */
    Observable<Observable<byte[]>> mo27055d(UUID uuid);
}
