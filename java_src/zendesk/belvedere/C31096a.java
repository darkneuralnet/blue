package zendesk.belvedere;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.stripe.android.financialconnections.domain.Entry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C31129i;
import zendesk.belvedere.MediaIntent;
/* renamed from: zendesk.belvedere.a */
/* loaded from: classes8.dex */
public class C31096a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    public static C31096a f121804e;

    /* renamed from: a */
    public final Context f121805a;

    /* renamed from: b */
    public ZQ5 f121806b;

    /* renamed from: c */
    public Y52 f121807c;

    /* renamed from: d */
    public EP2 f121808d;

    /* renamed from: zendesk.belvedere.a$a */
    /* loaded from: classes8.dex */
    public static class C31097a {

        /* renamed from: a */
        public Context f121809a;

        /* renamed from: b */
        public C31129i.InterfaceC31131b f121810b = new C31129i.C31130a();

        /* renamed from: c */
        public boolean f121811c = false;

        public C31097a(Context context) {
            this.f121809a = context.getApplicationContext();
        }

        /* renamed from: a */
        public C31096a m758a() {
            return new C31096a(this);
        }
    }

    public C31096a(C31097a c31097a) {
        Context context = c31097a.f121809a;
        this.f121805a = context;
        c31097a.f121810b.mo663d(c31097a.f121811c);
        C31129i.m668d(c31097a.f121810b);
        this.f121807c = new Y52();
        ZQ5 zq5 = new ZQ5();
        this.f121806b = zq5;
        this.f121808d = new EP2(context, zq5, this.f121807c);
        C31129i.m671a("Belvedere", "Belvedere initialized");
    }

    /* renamed from: c */
    public static C31096a m764c(Context context) {
        synchronized (C31096a.class) {
            if (f121804e == null) {
                if (context != null && context.getApplicationContext() != null) {
                    f121804e = new C31097a(context.getApplicationContext()).m758a();
                } else {
                    throw new IllegalArgumentException("Invalid context provided");
                }
            }
        }
        return f121804e;
    }

    /* renamed from: a */
    public MediaIntent.C31090b m766a() {
        return new MediaIntent.C31090b(this.f121807c.m75757d(), this.f121808d, this.f121807c);
    }

    /* renamed from: b */
    public MediaIntent.C31091c m765b() {
        return new MediaIntent.C31091c(this.f121807c.m75757d(), this.f121808d);
    }

    /* renamed from: d */
    public MediaResult m763d(String str, String str2) {
        Uri m73114i;
        long j;
        long j2;
        File m73119d = this.f121806b.m73119d(this.f121805a, str, str2);
        C31129i.m671a("Belvedere", String.format(Locale.US, "Get internal File: %s", m73119d));
        if (m73119d != null && (m73114i = this.f121806b.m73114i(this.f121805a, m73119d)) != null) {
            MediaResult m73113j = ZQ5.m73113j(this.f121805a, m73114i);
            if (m73113j.m783e().contains(Entry.TYPE_IMAGE)) {
                Pair<Integer, Integer> m25540a = C26104mU.m25540a(m73119d);
                j2 = ((Integer) m25540a.second).intValue();
                j = ((Integer) m25540a.first).intValue();
            } else {
                j = -1;
                j2 = -1;
            }
            return new MediaResult(m73119d, m73114i, m73114i, str2, m73113j.m783e(), m73113j.m780i(), j, j2);
        }
        return null;
    }

    /* renamed from: e */
    public void m762e(int i, int i2, Intent intent, G80<List<MediaResult>> g80, boolean z) {
        this.f121808d.m109041e(this.f121805a, i, i2, intent, g80, z);
    }

    /* renamed from: f */
    public Intent m761f(Uri uri, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent.setDataAndType(uri, str);
        }
        m760g(intent, uri);
        return intent;
    }

    /* renamed from: g */
    public void m760g(Intent intent, Uri uri) {
        C31129i.m671a("Belvedere", String.format(Locale.US, "Grant Permission - Intent: %s - Uri: %s", intent, uri));
        this.f121806b.m73111l(this.f121805a, intent, uri, 3);
    }

    /* renamed from: h */
    public void m759h(List<Uri> list, String str, G80<List<MediaResult>> g80) {
        if (list != null && list.size() > 0) {
            OL4.m92398d(this.f121805a, this.f121806b, g80, list, str);
        } else {
            g80.internalSuccess(new ArrayList(0));
        }
    }
}
