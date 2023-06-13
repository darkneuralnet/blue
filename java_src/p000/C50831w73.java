package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, m28432d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/Network;", C17296a.f69688o, "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
@JvmName(name = "NetworkApi23")
/* renamed from: w73  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50831w73 {
    /* renamed from: a */
    public static final Network m7390a(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
