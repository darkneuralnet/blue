package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17544k;
import java.io.IOException;
import p000.AbstractC41371g99;
/* renamed from: com.google.android.gms.internal.places.k */
/* loaded from: classes5.dex */
public abstract class AbstractC17544k<MessageType extends AbstractC17544k<MessageType, BuilderType>, BuilderType extends AbstractC41371g99<MessageType, BuilderType>> implements InterfaceC52815zT7 {
    private static boolean zzdu = false;
    protected int zzdt = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51140a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo51139b() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC52815zT7
    public final AbstractC43604jv9 zzv() {
        try {
            C45261mj7 m29755C = AbstractC43604jv9.m29755C(mo1329g());
            mo1328h(m29755C.m25133b());
            return m29755C.m25134a();
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
