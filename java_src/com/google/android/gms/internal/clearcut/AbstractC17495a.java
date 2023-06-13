package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC17495a;
import java.io.IOException;
import p000.AbstractC41833gw7;
/* renamed from: com.google.android.gms.internal.clearcut.a */
/* loaded from: classes5.dex */
public abstract class AbstractC17495a<MessageType extends AbstractC17495a<MessageType, BuilderType>, BuilderType extends AbstractC41833gw7<MessageType, BuilderType>> implements H28 {
    private static boolean zzey = false;
    protected int zzex = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51565a(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo51564b() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.H28
    /* renamed from: k */
    public final TD7 mo51573k() {
        try {
            OH7 m84179u = TD7.m84179u(mo51553o());
            mo51554n(m84179u.m92562b());
            return m84179u.m92563a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
