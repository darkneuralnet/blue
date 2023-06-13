package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
/* renamed from: eX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40396eX3 {

    /* renamed from: a */
    public final PointerIcon f78517a;

    /* renamed from: eX3$a */
    /* loaded from: classes.dex */
    public static class C20062a {
        private C20062a() {
        }

        /* renamed from: a */
        public static PointerIcon m42805a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        /* renamed from: b */
        public static PointerIcon m42804b(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        /* renamed from: c */
        public static PointerIcon m42803c(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public C40396eX3(PointerIcon pointerIcon) {
        this.f78517a = pointerIcon;
    }

    /* renamed from: b */
    public static C40396eX3 m42806b(Context context, int i) {
        return new C40396eX3(C20062a.m42804b(context, i));
    }

    /* renamed from: a */
    public Object m42807a() {
        return this.f78517a;
    }
}
