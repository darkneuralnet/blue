package co.bird.android.manager.bluetooth.internal;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/c;", "", "", "b", "I", "()I", "status", "<init>", "(Ljava/lang/String;II)V", "c", C17296a.f69688o, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.manager.bluetooth.internal.c */
/* loaded from: classes4.dex */
public enum EnumC16110c {
    GATT_READ_NOT_PERMITTED(2),
    GATT_WRITE_NOT_PERMITTED(3),
    GATT_INSUFFICIENT_AUTHENTICATION(5),
    GATT_REQUEST_NOT_SUPPORTED(6),
    GATT_INSUFFICIENT_ENCRYPTION(15),
    GATT_INVALID_OFFSET(7),
    GATT_INVALID_ATTRIBUTE_LENGTH(13),
    GATT_CONNECTION_CONGESTED(143),
    GATT_FAILURE(257),
    GATT_UNKNOWN(-1);
    

    /* renamed from: c */
    public static final C16111a f66269c = new C16111a(null);

    /* renamed from: d */
    public static final EnumC16110c[] f66270d = values();

    /* renamed from: b */
    public final int f66282b;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/c$a;", "", "", "error", "Lco/bird/android/manager/bluetooth/internal/c;", C17296a.f69688o, "", "values", "[Lco/bird/android/manager/bluetooth/internal/c;", "<init>", "()V", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nGattError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GattError.kt\nco/bird/android/manager/bluetooth/internal/GattError$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,43:1\n1282#2,2:44\n*S KotlinDebug\n*F\n+ 1 GattError.kt\nco/bird/android/manager/bluetooth/internal/GattError$Companion\n*L\n39#1:44,2\n*E\n"})
    /* renamed from: co.bird.android.manager.bluetooth.internal.c$a */
    /* loaded from: classes4.dex */
    public static final class C16111a {
        public /* synthetic */ C16111a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC16110c m55818a(int i) {
            EnumC16110c enumC16110c;
            boolean z;
            EnumC16110c[] enumC16110cArr = EnumC16110c.f66270d;
            int length = enumC16110cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC16110c = enumC16110cArr[i2];
                    if (enumC16110c.m55819b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    enumC16110c = null;
                    break;
                }
            }
            if (enumC16110c == null) {
                return EnumC16110c.GATT_UNKNOWN;
            }
            return enumC16110c;
        }

        private C16111a() {
        }
    }

    EnumC16110c(int i) {
        this.f66282b = i;
    }

    /* renamed from: b */
    public final int m55819b() {
        return this.f66282b;
    }
}
