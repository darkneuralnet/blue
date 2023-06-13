package p000;

import android.content.Context;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import io.reactivex.Observable;
/* renamed from: de5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC39873de5 {

    /* renamed from: de5$a */
    /* loaded from: classes6.dex */
    public enum EnumC19828a {
        BLUETOOTH_NOT_AVAILABLE,
        LOCATION_PERMISSION_NOT_GRANTED,
        BLUETOOTH_NOT_ENABLED,
        LOCATION_SERVICES_NOT_ENABLED,
        READY
    }

    /* renamed from: a */
    public static AbstractC39873de5 m43954a(Context context) {
        return IH0.m102660a().mo37861a(context.getApplicationContext()).build().mo37862g();
    }

    /* renamed from: b */
    public abstract InterfaceC45802ne5 mo33642b(String str);

    /* renamed from: c */
    public abstract EnumC19828a mo33641c();

    /* renamed from: d */
    public abstract Observable<EnumC19828a> mo33640d();

    /* renamed from: e */
    public abstract Observable<C36154Tk5> mo33639e(ScanSettings scanSettings, ScanFilter... scanFilterArr);
}
