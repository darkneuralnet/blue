package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;
/* loaded from: classes6.dex */
public class zzgv {
    private final String zza;

    public static zzgv zzc(String str) {
        return new zzgv(str);
    }

    public CharSequence zza(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public Appendable zzb(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(zza(it.next()));
            while (it.hasNext()) {
                appendable.append(this.zza);
                appendable.append(zza(it.next()));
            }
        }
        return appendable;
    }

    public final zzgv zzd() {
        return new zzgt(this, this);
    }

    public final String zzf(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            zzb(sb, it);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private zzgv(String str) {
        this.zza = str;
    }
}
