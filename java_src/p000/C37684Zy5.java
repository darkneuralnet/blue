package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.UUID;
@KeepForSdk
/* renamed from: Zy5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37684Zy5 {
    @KeepForSdk

    /* renamed from: b */
    public static final C32711Es0<?> f49609b = C32711Es0.m108309e(C37684Zy5.class).m108292b(C43645k01.m29483k(C52226yU2.class)).m108292b(C43645k01.m29483k(Context.class)).m108288f(Po9.f29107a).m108290d();

    /* renamed from: a */
    public final Context f49610a;

    public C37684Zy5(Context context) {
        this.f49610a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public synchronized String m72165a() {
        String string = m72164b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m72164b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    /* renamed from: b */
    public final SharedPreferences m72164b() {
        return this.f49610a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
