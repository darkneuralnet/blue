package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzhk extends zzhn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhk(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    public final int hashCode() {
        return ~this.zza.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 2);
        sb.append("/");
        sb.append(obj);
        sb.append("\\");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    public final void zzc(StringBuilder sb) {
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb.append(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    public final void zzd(StringBuilder sb) {
        sb.append(this.zza);
        sb.append(']');
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    public final boolean zze(Comparable comparable) {
        return zzie.zza(this.zza, comparable) < 0;
    }
}
