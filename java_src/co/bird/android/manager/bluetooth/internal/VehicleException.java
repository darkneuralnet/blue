package co.bird.android.manager.bluetooth.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/VehicleException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lco/bird/android/manager/bluetooth/internal/VehicleException$a;", "error", "Lco/bird/android/manager/bluetooth/internal/c;", "gatt", "", "extra", "<init>", "(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;)V", C17296a.f69688o, "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VehicleException extends RuntimeException {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/manager/bluetooth/internal/VehicleException$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "bluetooth_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.bluetooth.internal.VehicleException$a */
    /* loaded from: classes4.dex */
    public enum EnumC16097a {
        ON_READ_LOCK,
        ON_READ_AUTH,
        ON_READ_UNKNOWN,
        READ,
        WRITE,
        DISCOVERY,
        CONNECTION
    }

    public /* synthetic */ VehicleException(EnumC16097a enumC16097a, EnumC16110c enumC16110c, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16097a, (i & 2) != 0 ? null : enumC16110c, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VehicleException(EnumC16097a error, EnumC16110c enumC16110c, String str) {
        super(r2 + ": " + r3 + ", extra=" + str);
        Intrinsics.checkNotNullParameter(error, "error");
        String name = error.name();
        String str2 = (enumC16110c == null || (str2 = enumC16110c.name()) == null) ? "" : "";
    }
}
