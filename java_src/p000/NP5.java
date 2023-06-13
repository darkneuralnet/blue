package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.InterfaceC32648El0;
/* renamed from: NP5 */
/* loaded from: classes6.dex */
public class NP5<T extends InterfaceC32648El0> implements InterfaceC32414Dl0<T> {

    /* renamed from: a */
    public final LatLng f24550a;

    /* renamed from: b */
    public final List<T> f24551b = new ArrayList();

    public NP5(LatLng latLng) {
        this.f24550a = latLng;
    }

    @Override // p000.InterfaceC32414Dl0
    /* renamed from: a */
    public int mo75549a() {
        return this.f24551b.size();
    }

    @Override // p000.InterfaceC32414Dl0
    /* renamed from: b */
    public Collection<T> mo75548b() {
        return this.f24551b;
    }

    /* renamed from: c */
    public boolean m93922c(T t) {
        return this.f24551b.add(t);
    }

    /* renamed from: d */
    public boolean m93921d(T t) {
        return this.f24551b.remove(t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NP5)) {
            return false;
        }
        NP5 np5 = (NP5) obj;
        if (!np5.f24550a.equals(this.f24550a) || !np5.f24551b.equals(this.f24551b)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC32414Dl0
    public LatLng getPosition() {
        return this.f24550a;
    }

    public int hashCode() {
        return this.f24550a.hashCode() + this.f24551b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f24550a + ", mItems.size=" + this.f24551b.size() + CoreConstants.CURLY_RIGHT;
    }
}
