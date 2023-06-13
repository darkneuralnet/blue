package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.Collection;
import java.util.List;
/* loaded from: classes6.dex */
public final class zzi {
    public static CharSequence zzb(String str, List<zzb> list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        for (zzb zzbVar : list) {
            CharacterStyle wrap = CharacterStyle.wrap(characterStyle);
            int i = zzbVar.offset;
            spannableString.setSpan(wrap, i, zzbVar.length + i, 0);
        }
        return spannableString;
    }

    public static String zzc(Collection<String> collection) {
        if (collection != null && !collection.isEmpty()) {
            return TextUtils.join(", ", collection);
        }
        return null;
    }
}
