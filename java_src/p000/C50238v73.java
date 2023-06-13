package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\r"}, m28432d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "", "c", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", C17296a.f69688o, "", "capability", "", "b", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "NetworkApi21")
/* renamed from: v73  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50238v73 {
    /* renamed from: a */
    public static final NetworkCapabilities m9167a(ConnectivityManager connectivityManager, Network network) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    /* renamed from: b */
    public static final boolean m9166b(NetworkCapabilities networkCapabilities, int i) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    /* renamed from: c */
    public static final void m9165c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
