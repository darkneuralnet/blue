package p000;

import android.content.Context;
import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* renamed from: kT0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43915kT0 {
    private C43915kT0() {
    }

    /* renamed from: a */
    public static C48526sE3<String, String> m28951a(Long l, Long l2) {
        return m28950b(l, l2, null);
    }

    /* renamed from: b */
    public static C48526sE3<String, String> m28950b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C48526sE3.m14515a(null, null);
        }
        if (l == null) {
            return C48526sE3.m14515a(null, m28948d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C48526sE3.m14515a(m28948d(l.longValue(), simpleDateFormat), null);
        }
        Calendar m30051j = C43471ji6.m30051j();
        Calendar m30049l = C43471ji6.m30049l();
        m30049l.setTimeInMillis(l.longValue());
        Calendar m30049l2 = C43471ji6.m30049l();
        m30049l2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C48526sE3.m14515a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (m30049l.get(1) == m30049l2.get(1)) {
            if (m30049l.get(1) == m30051j.get(1)) {
                return C48526sE3.m14515a(m28945g(l.longValue(), Locale.getDefault()), m28945g(l2.longValue(), Locale.getDefault()));
            }
            return C48526sE3.m14515a(m28945g(l.longValue(), Locale.getDefault()), m28938n(l2.longValue(), Locale.getDefault()));
        } else {
            return C48526sE3.m14515a(m28938n(l.longValue(), Locale.getDefault()), m28938n(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    public static String m28949c(long j) {
        return m28948d(j, null);
    }

    /* renamed from: d */
    public static String m28948d(long j, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (m28935q(j)) {
            return m28946f(j);
        }
        return m28939m(j);
    }

    /* renamed from: e */
    public static String m28947e(Context context, long j, boolean z, boolean z2, boolean z3) {
        String m28942j = m28942j(j);
        if (z) {
            m28942j = String.format(context.getString(C40534el4.mtrl_picker_today_description), m28942j);
        }
        if (z2) {
            return String.format(context.getString(C40534el4.mtrl_picker_start_date_description), m28942j);
        }
        if (z3) {
            return String.format(context.getString(C40534el4.mtrl_picker_end_date_description), m28942j);
        }
        return m28942j;
    }

    /* renamed from: f */
    public static String m28946f(long j) {
        return m28945g(j, Locale.getDefault());
    }

    /* renamed from: g */
    public static String m28945g(long j, Locale locale) {
        return C43471ji6.m30059b(locale).format(new Date(j));
    }

    /* renamed from: h */
    public static String m28944h(long j) {
        return m28943i(j, Locale.getDefault());
    }

    /* renamed from: i */
    public static String m28943i(long j, Locale locale) {
        return C43471ji6.m30058c(locale).format(new Date(j));
    }

    /* renamed from: j */
    public static String m28942j(long j) {
        if (m28935q(j)) {
            return m28944h(j);
        }
        return m28937o(j);
    }

    /* renamed from: k */
    public static String m28941k(Context context, int i) {
        if (C43471ji6.m30051j().get(1) == i) {
            return String.format(context.getString(C40534el4.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i));
        }
        return String.format(context.getString(C40534el4.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    /* renamed from: l */
    public static String m28940l(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* renamed from: m */
    public static String m28939m(long j) {
        return m28938n(j, Locale.getDefault());
    }

    /* renamed from: n */
    public static String m28938n(long j, Locale locale) {
        return C43471ji6.m30047n(locale).format(new Date(j));
    }

    /* renamed from: o */
    public static String m28937o(long j) {
        return m28936p(j, Locale.getDefault());
    }

    /* renamed from: p */
    public static String m28936p(long j, Locale locale) {
        return C43471ji6.m30046o(locale).format(new Date(j));
    }

    /* renamed from: q */
    public static boolean m28935q(long j) {
        Calendar m30051j = C43471ji6.m30051j();
        Calendar m30049l = C43471ji6.m30049l();
        m30049l.setTimeInMillis(j);
        if (m30051j.get(1) == m30049l.get(1)) {
            return true;
        }
        return false;
    }
}
