package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.Area;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/persistence/Area;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", C17296a.f69688o, "", "c", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Pj6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35210Pj6 {
    /* renamed from: a */
    public static final String m89886a(Area area, Context context) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String label = area.getLabel();
        if (label == null) {
            String notes = area.getNotes();
            if (notes == null) {
                String string = context.getString(C45871nl4.variable_fee_area_bottom_sheet_default_description);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…heet_default_description)");
                return string;
            }
            return notes;
        }
        return label;
    }

    /* renamed from: b */
    public static final String m89885b(Area area, Context context) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String title = area.getTitle();
        if (title == null) {
            String label = area.getLabel();
            if (label == null) {
                String string = context.getString(C45871nl4.variable_fee_area_bottom_sheet_default_title);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ttom_sheet_default_title)");
                return string;
            }
            return label;
        }
        return title;
    }

    /* renamed from: c */
    public static final int m89884c(Area area) {
        Intrinsics.checkNotNullParameter(area, "<this>");
        return area.getBorderColor();
    }
}
