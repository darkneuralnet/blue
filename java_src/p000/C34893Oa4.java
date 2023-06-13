package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import androidx.work.C12124b;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.bluetooth.BluetoothDiscoveryReceiver;
import co.bird.android.app.feature.bluetooth.job.HeadlessSweepWorker;
import co.bird.api.request.BLEScanTrigger;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C32849Fh3;
import p000.C44821lz0;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\b"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LZC6;", "workManager", "", "c", "b", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Oa4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34893Oa4 {
    /* renamed from: a */
    public static final void m92008a(Context context) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        context.registerReceiver(new BluetoothDiscoveryReceiver(), intentFilter);
        if (defaultAdapter.isDiscovering()) {
            if (defaultAdapter.cancelDiscovery()) {
                defaultAdapter.startDiscovery();
                return;
            }
            return;
        }
        defaultAdapter.startDiscovery();
    }

    /* renamed from: b */
    public static final void m92007b(ZC6 zc6) {
        C44821lz0 m26574a = new C44821lz0.C25841a().m26573b(S73.CONNECTED).m26574a();
        C12124b m65581a = new C12124b.C12125a().m65577e("co.bird.android.app.feature.bluetooth.job.trigger", BLEScanTrigger.REMOTE_NOTIFICATION.name()).m65581a();
        Intrinsics.checkNotNullExpressionValue(m65581a, "Builder().putString(TRIG…OTIFICATION.name).build()");
        zc6.m73615f("triggered_headless_sweep", EnumC41094fi1.REPLACE, new C32849Fh3.C2399a(HeadlessSweepWorker.class).m109252h(m26574a).m109249k(m65581a).m109257a());
    }

    /* renamed from: c */
    public static final void m92006c(Context context, ZC6 workManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        if (C40788fB0.m41759w(context) && C40788fB0.m41760v(context)) {
            m92007b(workManager);
        } else {
            m92008a(context);
        }
    }
}
