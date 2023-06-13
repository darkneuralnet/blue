package p000;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;
@SuppressLint({"InlinedApi"})
/* renamed from: wN1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50976wN1 {

    /* renamed from: wN1$a */
    /* loaded from: classes.dex */
    public static class C29865a {
        private C29865a() {
        }

        /* renamed from: a */
        public static Spanned m6964a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        /* renamed from: b */
        public static Spanned m6963b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        /* renamed from: c */
        public static String m6962c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    private C50976wN1() {
    }

    /* renamed from: a */
    public static Spanned m6966a(String str, int i) {
        return C29865a.m6964a(str, i);
    }

    /* renamed from: b */
    public static String m6965b(Spanned spanned, int i) {
        return C29865a.m6962c(spanned, i);
    }
}
