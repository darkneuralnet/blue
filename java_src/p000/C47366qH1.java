package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b/\u00100J~\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b&\u0010+R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b#\u0010-R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b.\u0010)¨\u00061"}, m28432d2 = {"LqH1;", "T", "", "", "title", "details", "Landroid/graphics/drawable/Drawable;", "scooter", "", MessageExtension.FIELD_DATA, "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "category", "", "showGreenCheck", "", "iconTint", "detailsTextColor", "showScanSerialNumber", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;ZLjava/lang/Integer;IZ)LqH1;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Landroid/graphics/drawable/Drawable;", "g", "()Landroid/graphics/drawable/Drawable;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "e", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "()Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "f", "Z", "h", "()Z", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "I", "()I", "i", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;ZLjava/lang/Integer;IZ)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qH1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47366qH1<T> {

    /* renamed from: a */
    public final String f105020a;

    /* renamed from: b */
    public final String f105021b;

    /* renamed from: c */
    public final Drawable f105022c;

    /* renamed from: d */
    public final Collection<T> f105023d;

    /* renamed from: e */
    public final InventoryScanningIdentifierCategory f105024e;

    /* renamed from: f */
    public final boolean f105025f;

    /* renamed from: g */
    public final Integer f105026g;

    /* renamed from: h */
    public final int f105027h;

    /* renamed from: i */
    public final boolean f105028i;

    /* JADX WARN: Multi-variable type inference failed */
    public C47366qH1(String title, String details, Drawable drawable, Collection<? extends T> collection, InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, boolean z, Integer num, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f105020a = title;
        this.f105021b = details;
        this.f105022c = drawable;
        this.f105023d = collection;
        this.f105024e = inventoryScanningIdentifierCategory;
        this.f105025f = z;
        this.f105026g = num;
        this.f105027h = i;
        this.f105028i = z2;
    }

    /* renamed from: a */
    public final C47366qH1<T> m17706a(String title, String details, Drawable drawable, Collection<? extends T> collection, InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, boolean z, Integer num, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        return new C47366qH1<>(title, details, drawable, collection, inventoryScanningIdentifierCategory, z, num, i, z2);
    }

    /* renamed from: b */
    public final InventoryScanningIdentifierCategory m17705b() {
        return this.f105024e;
    }

    /* renamed from: c */
    public final Collection<T> m17704c() {
        return this.f105023d;
    }

    /* renamed from: d */
    public final String m17703d() {
        return this.f105021b;
    }

    /* renamed from: e */
    public final int m17702e() {
        return this.f105027h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C47366qH1) {
            C47366qH1 c47366qH1 = (C47366qH1) obj;
            return Intrinsics.areEqual(this.f105020a, c47366qH1.f105020a) && Intrinsics.areEqual(this.f105021b, c47366qH1.f105021b) && Intrinsics.areEqual(this.f105022c, c47366qH1.f105022c) && Intrinsics.areEqual(this.f105023d, c47366qH1.f105023d) && this.f105024e == c47366qH1.f105024e && this.f105025f == c47366qH1.f105025f && Intrinsics.areEqual(this.f105026g, c47366qH1.f105026g) && this.f105027h == c47366qH1.f105027h && this.f105028i == c47366qH1.f105028i;
        }
        return false;
    }

    /* renamed from: f */
    public final Integer m17701f() {
        return this.f105026g;
    }

    /* renamed from: g */
    public final Drawable m17700g() {
        return this.f105022c;
    }

    /* renamed from: h */
    public final boolean m17699h() {
        return this.f105025f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f105020a.hashCode() * 31) + this.f105021b.hashCode()) * 31;
        Drawable drawable = this.f105022c;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Collection<T> collection = this.f105023d;
        int hashCode3 = (hashCode2 + (collection == null ? 0 : collection.hashCode())) * 31;
        InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory = this.f105024e;
        int hashCode4 = (hashCode3 + (inventoryScanningIdentifierCategory == null ? 0 : inventoryScanningIdentifierCategory.hashCode())) * 31;
        boolean z = this.f105025f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        Integer num = this.f105026g;
        int hashCode5 = (((i2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.f105027h)) * 31;
        boolean z2 = this.f105028i;
        return hashCode5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m17698i() {
        return this.f105028i;
    }

    /* renamed from: j */
    public final String m17697j() {
        return this.f105020a;
    }

    public String toString() {
        String str = this.f105020a;
        String str2 = this.f105021b;
        Drawable drawable = this.f105022c;
        Collection<T> collection = this.f105023d;
        InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory = this.f105024e;
        boolean z = this.f105025f;
        Integer num = this.f105026g;
        int i = this.f105027h;
        boolean z2 = this.f105028i;
        return "HardCountViewModel(title=" + str + ", details=" + str2 + ", scooter=" + drawable + ", data=" + collection + ", category=" + inventoryScanningIdentifierCategory + ", showGreenCheck=" + z + ", iconTint=" + num + ", detailsTextColor=" + i + ", showScanSerialNumber=" + z2 + ")";
    }

    public /* synthetic */ C47366qH1(String str, String str2, Drawable drawable, Collection collection, InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory, boolean z, Integer num, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, drawable, (i2 & 8) != 0 ? null : collection, (i2 & 16) != 0 ? null : inventoryScanningIdentifierCategory, (i2 & 32) != 0 ? true : z, (i2 & 64) != 0 ? null : num, i, (i2 & 256) != 0 ? false : z2);
    }
}
