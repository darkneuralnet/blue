package p000;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\t\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\r\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\f\b\u0002\u0010\t\u001a\u00060\u0004j\u0002`\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\t\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lrt2;", "", "Landroid/graphics/Bitmap;", C17296a.f69688o, "", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "b", "c", "bitmap", "overrideId", "contentDescription", DateTokenConverter.CONVERTER_KEY, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Ljava/lang/String;", "getOverrideId", "()Ljava/lang/String;", "getContentDescription", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rt2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48321rt2 {

    /* renamed from: a */
    public final Bitmap f107832a;

    /* renamed from: b */
    public final String f107833b;

    /* renamed from: c */
    public final String f107834c;

    public C48321rt2(Bitmap bitmap, String overrideId, String str) {
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        this.f107832a = bitmap;
        this.f107833b = overrideId;
        this.f107834c = str;
    }

    public static /* synthetic */ C48321rt2 copy$default(C48321rt2 c48321rt2, Bitmap bitmap, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = c48321rt2.f107832a;
        }
        if ((i & 2) != 0) {
            str = c48321rt2.f107833b;
        }
        if ((i & 4) != 0) {
            str2 = c48321rt2.f107834c;
        }
        return c48321rt2.m15133d(bitmap, str, str2);
    }

    /* renamed from: a */
    public final Bitmap m15136a() {
        return this.f107832a;
    }

    /* renamed from: b */
    public final String m15135b() {
        return this.f107833b;
    }

    /* renamed from: c */
    public final String m15134c() {
        return this.f107834c;
    }

    /* renamed from: d */
    public final C48321rt2 m15133d(Bitmap bitmap, String overrideId, String str) {
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        return new C48321rt2(bitmap, overrideId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48321rt2) {
            C48321rt2 c48321rt2 = (C48321rt2) obj;
            return Intrinsics.areEqual(this.f107832a, c48321rt2.f107832a) && Intrinsics.areEqual(this.f107833b, c48321rt2.f107833b) && Intrinsics.areEqual(this.f107834c, c48321rt2.f107834c);
        }
        return false;
    }

    public int hashCode() {
        Bitmap bitmap = this.f107832a;
        int hashCode = (((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.f107833b.hashCode()) * 31;
        String str = this.f107834c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Bitmap bitmap = this.f107832a;
        String str = this.f107833b;
        String str2 = this.f107834c;
        return "LoadedMarkerOverride(bitmap=" + bitmap + ", overrideId=" + str + ", contentDescription=" + str2 + ")";
    }
}
