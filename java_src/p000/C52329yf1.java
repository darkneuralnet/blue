package p000;

import com.facebook.share.internal.C17296a;
import com.github.kittinunf.fuel.android.util.AndroidEnvironment;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, m28432d2 = {"Lvf1;", C17296a.f69688o, "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: yf1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52329yf1 {
    /* renamed from: a */
    public static final InterfaceC50550vf1 m3013a() {
        try {
            Object newInstance = AndroidEnvironment.class.newInstance();
            if (newInstance != null) {
                return (InterfaceC50550vf1) newInstance;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.github.kittinunf.fuel.core.Environment");
        } catch (ClassNotFoundException unused) {
            return new YW0();
        }
    }
}
