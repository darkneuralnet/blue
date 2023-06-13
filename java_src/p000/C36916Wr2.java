package p000;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.C36916Wr2;
/* renamed from: Wr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36916Wr2 {

    /* renamed from: a */
    public static final String[] f42201a = new String[0];

    /* renamed from: b */
    public static final Comparator<C9188a> f42202b = new Comparator() { // from class: Vr2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m77786i;
            m77786i = C36916Wr2.m77786i((C36916Wr2.C9188a) obj, (C36916Wr2.C9188a) obj2);
            return m77786i;
        }
    };

    /* renamed from: Wr2$a */
    /* loaded from: classes.dex */
    public static class C9188a {

        /* renamed from: a */
        public URLSpan f42203a;

        /* renamed from: b */
        public String f42204b;

        /* renamed from: c */
        public int f42205c;

        /* renamed from: d */
        public int f42206d;
    }

    private C36916Wr2() {
    }

    /* renamed from: b */
    public static void m77793b(TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: c */
    public static boolean m77792c(Spannable spannable, int i) {
        if (m77783l()) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m77788g(arrayList, spannable, ZK3.f48257h, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            m77788g(arrayList, spannable, ZK3.f48258i, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            m77787h(arrayList, spannable);
        }
        m77784k(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9188a c9188a = (C9188a) it.next();
            if (c9188a.f42203a == null) {
                m77790e(c9188a.f42204b, c9188a.f42205c, c9188a.f42206d, spannable);
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m77791d(TextView textView, int i) {
        if (m77783l()) {
            return Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            if (m77792c((Spannable) text, i)) {
                m77793b(textView);
                return true;
            }
        } else {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (m77792c(valueOf, i)) {
                m77793b(textView);
                textView.setText(valueOf);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m77790e(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* renamed from: f */
    public static String m77789f(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.findAddress(str);
        }
        return C44099km1.m28472c(str);
    }

    /* renamed from: g */
    public static void m77788g(ArrayList<C9188a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    C9188a c9188a = new C9188a();
                    c9188a.f42204b = m77785j(group, strArr, matcher, transformFilter);
                    c9188a.f42205c = start;
                    c9188a.f42206d = end;
                    arrayList.add(c9188a);
                }
            }
        }
    }

    /* renamed from: h */
    public static void m77787h(ArrayList<C9188a> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String m77789f = m77789f(obj);
                if (m77789f != null && (indexOf = obj.indexOf(m77789f)) >= 0) {
                    C9188a c9188a = new C9188a();
                    int length = m77789f.length() + indexOf;
                    c9188a.f42205c = indexOf + i;
                    i += length;
                    c9188a.f42206d = i;
                    obj = obj.substring(length);
                    try {
                        String encode = URLEncoder.encode(m77789f, Constants.DEFAULT_ENCODING);
                        c9188a.f42204b = "geo:0,0?q=" + encode;
                        arrayList.add(c9188a);
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return;
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    /* renamed from: i */
    public static /* synthetic */ int m77786i(C9188a c9188a, C9188a c9188a2) {
        int i = c9188a.f42205c;
        int i2 = c9188a2.f42205c;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return Integer.compare(c9188a2.f42206d, c9188a.f42206d);
    }

    /* renamed from: j */
    public static String m77785j(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str2 = strArr[i];
                if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                    z = true;
                    if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                        str = str2 + str.substring(str2.length());
                    }
                } else {
                    i++;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && strArr.length > 0) {
            return strArr[0] + str;
        }
        return str;
    }

    /* renamed from: k */
    public static void m77784k(ArrayList<C9188a> arrayList, Spannable spannable) {
        URLSpan[] uRLSpanArr;
        int i;
        int i2;
        int i3 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            C9188a c9188a = new C9188a();
            c9188a.f42203a = uRLSpan;
            c9188a.f42205c = spannable.getSpanStart(uRLSpan);
            c9188a.f42206d = spannable.getSpanEnd(uRLSpan);
            arrayList.add(c9188a);
        }
        Collections.sort(arrayList, f42202b);
        int size = arrayList.size();
        while (i3 < size - 1) {
            C9188a c9188a2 = arrayList.get(i3);
            int i4 = i3 + 1;
            C9188a c9188a3 = arrayList.get(i4);
            int i5 = c9188a2.f42205c;
            int i6 = c9188a3.f42205c;
            if (i5 <= i6 && (i = c9188a2.f42206d) > i6) {
                int i7 = c9188a3.f42206d;
                if (i7 <= i || i - i5 > i7 - i6) {
                    i2 = i4;
                } else if (i - i5 < i7 - i6) {
                    i2 = i3;
                } else {
                    i2 = -1;
                }
                if (i2 != -1) {
                    Object obj = arrayList.get(i2).f42203a;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i2);
                    size--;
                }
            }
            i3 = i4;
        }
    }

    /* renamed from: l */
    public static boolean m77783l() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
