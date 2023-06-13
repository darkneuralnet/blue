package com.google.android.libraries.places.internal;

import com.google.gson.JsonSyntaxException;
/* loaded from: classes6.dex */
public final class zzde {
    private final C46153oE1 zza = new C46746pE1().m19801i(EnumC36618Vk1.f39679f).m19808b();

    public final Object zza(String str, Class cls) throws zzcc {
        try {
            return this.zza.m21555n(str, cls);
        } catch (JsonSyntaxException unused) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 55);
            sb.append("Could not convert JSON string to ");
            sb.append(name);
            sb.append(" due to syntax errors.");
            throw new zzcc(sb.toString());
        }
    }
}
