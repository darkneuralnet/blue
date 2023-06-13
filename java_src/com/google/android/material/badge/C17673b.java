package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
/* renamed from: com.google.android.material.badge.b */
/* loaded from: classes6.dex */
public class C17673b {

    /* renamed from: a */
    public static final boolean f72259a = false;

    private C17673b() {
    }

    /* renamed from: a */
    public static void m50262a(C17671a c17671a, View view, FrameLayout frameLayout) {
        m50258e(c17671a, view, frameLayout);
        if (c17671a.m50282g() != null) {
            c17671a.m50282g().setForeground(c17671a);
        } else if (!f72259a) {
            view.getOverlay().add(c17671a);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray<C17671a> m50261b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<C17671a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state != null) {
                sparseArray.put(keyAt, C17671a.m50286c(context, state));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m50260c(SparseArray<C17671a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            C17671a valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.m50278k());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m50259d(C17671a c17671a, View view) {
        if (c17671a == null) {
            return;
        }
        if (!f72259a && c17671a.m50282g() == null) {
            view.getOverlay().remove(c17671a);
        } else {
            c17671a.m50282g().setForeground(null);
        }
    }

    /* renamed from: e */
    public static void m50258e(C17671a c17671a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c17671a.setBounds(rect);
        c17671a.m50290A(view, frameLayout);
    }

    /* renamed from: f */
    public static void m50257f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
