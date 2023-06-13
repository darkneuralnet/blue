package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Wa0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36761Wa0 {

    /* renamed from: a */
    public final Map<CameraCharacteristics.Key<?>, Object> f41309a = new HashMap();

    /* renamed from: b */
    public final InterfaceC9103a f41310b;

    /* renamed from: c */
    public final String f41311c;

    /* renamed from: Wa0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC9103a {
        /* renamed from: a */
        <T> T mo78172a(CameraCharacteristics.Key<T> key);
    }

    public C36761Wa0(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f41310b = new C36293Ua0(cameraCharacteristics);
        } else {
            this.f41310b = new C36527Va0(cameraCharacteristics);
        }
        this.f41311c = str;
    }

    /* renamed from: d */
    public static C36761Wa0 m78173d(CameraCharacteristics cameraCharacteristics, String str) {
        return new C36761Wa0(cameraCharacteristics, str);
    }

    /* renamed from: a */
    public <T> T m78176a(CameraCharacteristics.Key<T> key) {
        if (m78174c(key)) {
            return (T) this.f41310b.mo78172a(key);
        }
        synchronized (this) {
            T t = (T) this.f41309a.get(key);
            if (t != null) {
                return t;
            }
            T t2 = (T) this.f41310b.mo78172a(key);
            if (t2 != null) {
                this.f41309a.put(key, t2);
            }
            return t2;
        }
    }

    /* renamed from: b */
    public C46867pR5 m78175b() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m78176a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return C46867pR5.m19303d(streamConfigurationMap, new C41375gA3(this.f41311c, this));
        }
        throw new IllegalArgumentException("StreamConfigurationMap is null!");
    }

    /* renamed from: c */
    public final boolean m78174c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }
}
