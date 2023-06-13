package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.constant.Permission;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006\u001b"}, m28432d2 = {"LuQ3;", "", "Lco/bird/android/model/constant/Permission;", "permission", "Lco/bird/android/model/PermissionStatus;", "j", "", "n", "()Z", "fineLocationPermissionGranted", "h", "locationEnabled", "k", "hasCamera", "m", "cameraPermissionGranted", DateTokenConverter.CONVERTER_KEY, "notificationsEnabled", "l", "bluetoothEnabled", "LuQ3$a;", "o", "()LuQ3$a;", "dataSaverState", "f", "accessWifiStatePermissionGranted", C17296a.f69688o, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uQ3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC49820uQ3 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"LuQ3$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uQ3$a */
    /* loaded from: classes2.dex */
    public enum EnumC29192a {
        ENABLED,
        WHITELISTED,
        DISABLED
    }

    /* renamed from: d */
    boolean mo10339d();

    /* renamed from: f */
    boolean mo10338f();

    /* renamed from: h */
    boolean mo10337h();

    /* renamed from: j */
    PermissionStatus mo10336j(Permission permission);

    /* renamed from: k */
    boolean mo10335k();

    /* renamed from: l */
    boolean mo10334l();

    /* renamed from: m */
    boolean mo10333m();

    /* renamed from: n */
    boolean mo10332n();

    /* renamed from: o */
    EnumC29192a mo10331o();
}
