package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RepairIssue;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003JE\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m28432d2 = {"LDA4;", "", "Lco/bird/android/model/RepairIssue;", C17296a.f69688o, "issue", "", "LH6;", "sections", "Landroid/graphics/drawable/Drawable;", "icon", "Landroid/content/res/ColorStateList;", "backgroundTint", "", "textColor", "b", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/RepairIssue;", "e", "()Lco/bird/android/model/RepairIssue;", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Landroid/graphics/drawable/Drawable;", DateTokenConverter.CONVERTER_KEY, "()Landroid/graphics/drawable/Drawable;", "Landroid/content/res/ColorStateList;", "()Landroid/content/res/ColorStateList;", "I", "g", "()I", "<init>", "(Lco/bird/android/model/RepairIssue;Ljava/util/List;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;I)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DA4 */
/* loaded from: classes3.dex */
public final class DA4 {

    /* renamed from: a */
    public final RepairIssue f5321a;

    /* renamed from: b */
    public final List<C3023H6> f5322b;

    /* renamed from: c */
    public final Drawable f5323c;

    /* renamed from: d */
    public final ColorStateList f5324d;

    /* renamed from: e */
    public final int f5325e;

    public DA4(RepairIssue issue, List<C3023H6> sections, Drawable drawable, ColorStateList colorStateList, int i) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f5321a = issue;
        this.f5322b = sections;
        this.f5323c = drawable;
        this.f5324d = colorStateList;
        this.f5325e = i;
    }

    public static /* synthetic */ DA4 copy$default(DA4 da4, RepairIssue repairIssue, List list, Drawable drawable, ColorStateList colorStateList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            repairIssue = da4.f5321a;
        }
        List<C3023H6> list2 = list;
        if ((i2 & 2) != 0) {
            list2 = da4.f5322b;
        }
        List list3 = list2;
        if ((i2 & 4) != 0) {
            drawable = da4.f5323c;
        }
        Drawable drawable2 = drawable;
        if ((i2 & 8) != 0) {
            colorStateList = da4.f5324d;
        }
        ColorStateList colorStateList2 = colorStateList;
        if ((i2 & 16) != 0) {
            i = da4.f5325e;
        }
        return da4.m110814b(repairIssue, list3, drawable2, colorStateList2, i);
    }

    /* renamed from: a */
    public final RepairIssue m110815a() {
        return this.f5321a;
    }

    /* renamed from: b */
    public final DA4 m110814b(RepairIssue issue, List<C3023H6> sections, Drawable drawable, ColorStateList colorStateList, int i) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new DA4(issue, sections, drawable, colorStateList, i);
    }

    /* renamed from: c */
    public final ColorStateList m110813c() {
        return this.f5324d;
    }

    /* renamed from: d */
    public final Drawable m110812d() {
        return this.f5323c;
    }

    /* renamed from: e */
    public final RepairIssue m110811e() {
        return this.f5321a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DA4) {
            DA4 da4 = (DA4) obj;
            return Intrinsics.areEqual(this.f5321a, da4.f5321a) && Intrinsics.areEqual(this.f5322b, da4.f5322b) && Intrinsics.areEqual(this.f5323c, da4.f5323c) && Intrinsics.areEqual(this.f5324d, da4.f5324d) && this.f5325e == da4.f5325e;
        }
        return false;
    }

    /* renamed from: f */
    public final List<C3023H6> m110810f() {
        return this.f5322b;
    }

    /* renamed from: g */
    public final int m110809g() {
        return this.f5325e;
    }

    public int hashCode() {
        int hashCode = ((this.f5321a.hashCode() * 31) + this.f5322b.hashCode()) * 31;
        Drawable drawable = this.f5323c;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        ColorStateList colorStateList = this.f5324d;
        return ((hashCode2 + (colorStateList != null ? colorStateList.hashCode() : 0)) * 31) + Integer.hashCode(this.f5325e);
    }

    public String toString() {
        RepairIssue repairIssue = this.f5321a;
        List<C3023H6> list = this.f5322b;
        Drawable drawable = this.f5323c;
        ColorStateList colorStateList = this.f5324d;
        int i = this.f5325e;
        return "RepairIssueViewModel(issue=" + repairIssue + ", sections=" + list + ", icon=" + drawable + ", backgroundTint=" + colorStateList + ", textColor=" + i + ")";
    }
}
