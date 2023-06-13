package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, m28432d2 = {"LFb5;", "", "", "hash", C17296a.f69688o, "<init>", "()V", "room-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Fb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32797Fb5 {

    /* renamed from: a */
    public static final C32797Fb5 f9750a = new C32797Fb5();

    private C32797Fb5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m106916a(String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
