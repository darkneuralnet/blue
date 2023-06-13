package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: uK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49769uK6 implements InterfaceC40920fP6 {

    /* renamed from: f */
    public static final C42061hK6 f112213f = new C42061hK6("AssetPackServiceImpl");

    /* renamed from: g */
    public static final Intent f112214g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f112215a;

    /* renamed from: b */
    public final C51556xL6 f112216b;
    @Nullable

    /* renamed from: c */
    public C52733zK6<InterfaceC40327eP6> f112217c;
    @Nullable

    /* renamed from: d */
    public C52733zK6<InterfaceC40327eP6> f112218d;

    /* renamed from: e */
    public final AtomicBoolean f112219e = new AtomicBoolean();

    public C49769uK6(Context context, C51556xL6 c51556xL6) {
        this.f112215a = context.getPackageName();
        this.f112216b = c51556xL6;
        if (C52149yL6.m3582a(context)) {
            Context m86776c = RO6.m86776c(context);
            C42061hK6 c42061hK6 = f112213f;
            Intent intent = f112214g;
            this.f112217c = new C52733zK6<>(m86776c, c42061hK6, "AssetPackService", intent, C42106hP6.f85165c);
            this.f112218d = new C52733zK6<>(RO6.m86776c(context), c42061hK6, "AssetPackService-keepAlive", intent, C42106hP6.f85164b);
        }
        f112213f.m36538a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: g */
    public static Bundle m10444g(int i, String str) {
        Bundle m10443h = m10443h(i);
        m10443h.putString("module_name", str);
        return m10443h;
    }

    /* renamed from: h */
    public static Bundle m10443h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(AnalyticsFields.SESSION_ID, i);
        return bundle;
    }

    /* renamed from: i */
    public static Bundle m10442i() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11000);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    /* renamed from: k */
    public static /* synthetic */ ArrayList m10440k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: m */
    public static /* synthetic */ Bundle m10438m(Map map) {
        Bundle m10442i = m10442i();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        m10442i.putParcelableArrayList("installed_asset_module", arrayList);
        return m10442i;
    }

    /* renamed from: q */
    public static /* synthetic */ Bundle m10434q(int i, String str, String str2, int i2) {
        Bundle m10444g = m10444g(i, str);
        m10444g.putString("slice_id", str2);
        m10444g.putInt("chunk_number", i2);
        return m10444g;
    }

    /* renamed from: u */
    public static /* synthetic */ List m10430u(C49769uK6 c49769uK6, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7546So next = AbstractC7923To.m82974b((Bundle) it.next(), c49769uK6.f112216b).mo43013e().values().iterator().next();
            if (next == null) {
                f112213f.m36537b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (BM6.m114069d(next.mo84816h())) {
                arrayList.add(next.mo84817g());
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public static <T> XY5<T> m10426y() {
        f112213f.m36537b("onError(%d)", -11);
        return CZ5.m112112c(new AssetPackException(-11));
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: a */
    public final void mo10450a(int i) {
        if (this.f112217c == null) {
            throw new C49185tL6("The Play Store app is not installed or is an unofficial version.", i);
        }
        f112213f.m36535d("notifySessionFailed", new Object[0]);
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112217c.m1533a(new C39690dK6(this, c37929aO6, i, c37929aO6));
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: b */
    public final void mo10449b(int i, String str, String str2, int i2) {
        if (this.f112217c == null) {
            throw new C49185tL6("The Play Store app is not installed or is an unofficial version.", i);
        }
        f112213f.m36535d("notifyChunkTransferred", new Object[0]);
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112217c.m1533a(new ZJ6(this, c37929aO6, i, str, str2, i2, c37929aO6));
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: c */
    public final void mo10448c(int i, String str) {
        m10427x(i, str, 10);
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: d */
    public final XY5<List<String>> mo10447d(Map<String, Long> map) {
        if (this.f112217c == null) {
            return m10426y();
        }
        f112213f.m36535d("syncPacks", new Object[0]);
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112217c.m1533a(new CP6(this, c37929aO6, map, c37929aO6));
        return c37929aO6.m71487c();
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: e */
    public final XY5<ParcelFileDescriptor> mo10446e(int i, String str, String str2, int i2) {
        if (this.f112217c == null) {
            return m10426y();
        }
        f112213f.m36535d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112217c.m1533a(new C40875fK6(this, c37929aO6, i, str, str2, i2, c37929aO6));
        return c37929aO6.m71487c();
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: f */
    public final void mo10445f(List<String> list) {
        if (this.f112217c == null) {
            return;
        }
        f112213f.m36535d("cancelDownloads(%s)", list);
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112217c.m1533a(new C45071mP6(this, c37929aO6, list, c37929aO6));
    }

    @Override // p000.InterfaceC40920fP6
    /* renamed from: j */
    public final synchronized void mo10441j() {
        if (this.f112218d == null) {
            f112213f.m36534e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C42061hK6 c42061hK6 = f112213f;
        c42061hK6.m36535d("keepAlive", new Object[0]);
        if (!this.f112219e.compareAndSet(false, true)) {
            c42061hK6.m36535d("Service is already kept alive.", new Object[0]);
            return;
        }
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112218d.m1533a(new C41468gK6(this, c37929aO6, c37929aO6));
    }

    /* renamed from: x */
    public final void m10427x(int i, String str, int i2) {
        if (this.f112217c == null) {
            throw new C49185tL6("The Play Store app is not installed or is an unofficial version.", i);
        }
        f112213f.m36535d("notifyModuleCompleted", new Object[0]);
        C37929aO6 c37929aO6 = new C37929aO6();
        this.f112217c.m1533a(new C38486bK6(this, c37929aO6, i, str, c37929aO6, i2));
    }
}
