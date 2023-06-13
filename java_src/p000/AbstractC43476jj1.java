package p000;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.C17216a;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;
/* renamed from: jj1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43476jj1<CONTENT, RESULT> {

    /* renamed from: e */
    public static final Object f93244e = new Object();

    /* renamed from: a */
    public final Activity f93245a;

    /* renamed from: b */
    public final C33702Iy1 f93246b;

    /* renamed from: c */
    public List<AbstractC43476jj1<CONTENT, RESULT>.AbstractC24996a> f93247c;

    /* renamed from: d */
    public int f93248d;

    /* renamed from: jj1$a */
    /* loaded from: classes5.dex */
    public abstract class AbstractC24996a {
        public AbstractC24996a() {
        }

        /* renamed from: a */
        public abstract boolean mo23643a(CONTENT content, boolean z);

        /* renamed from: b */
        public abstract C7501Sh mo23642b(CONTENT content);

        /* renamed from: c */
        public Object mo30026c() {
            return AbstractC43476jj1.f93244e;
        }
    }

    public AbstractC43476jj1(Activity activity, int i) {
        C48817sj6.m13765m(activity, "activity");
        this.f93245a = activity;
        this.f93246b = null;
        this.f93248d = i;
    }

    /* renamed from: a */
    public final List<AbstractC43476jj1<CONTENT, RESULT>.AbstractC24996a> m30035a() {
        if (this.f93247c == null) {
            this.f93247c = mo23651g();
        }
        return this.f93247c;
    }

    /* renamed from: b */
    public boolean m30034b(CONTENT content) {
        return mo30033c(content, f93244e);
    }

    /* renamed from: c */
    public boolean mo30033c(CONTENT content, Object obj) {
        boolean z;
        if (obj == f93244e) {
            z = true;
        } else {
            z = false;
        }
        for (AbstractC43476jj1<CONTENT, RESULT>.AbstractC24996a abstractC24996a : m30035a()) {
            if (z || C52364yi6.m2851a(abstractC24996a.mo30026c(), obj)) {
                if (abstractC24996a.mo23643a(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final C7501Sh m30032d(CONTENT content, Object obj) {
        boolean z;
        C7501Sh c7501Sh;
        if (obj == f93244e) {
            z = true;
        } else {
            z = false;
        }
        Iterator<AbstractC43476jj1<CONTENT, RESULT>.AbstractC24996a> it = m30035a().iterator();
        while (true) {
            if (it.hasNext()) {
                AbstractC43476jj1<CONTENT, RESULT>.AbstractC24996a next = it.next();
                if (z || C52364yi6.m2851a(next.mo30026c(), obj)) {
                    if (next.mo23643a(content, true)) {
                        try {
                            c7501Sh = next.mo23642b(content);
                            break;
                        } catch (FacebookException e) {
                            C7501Sh mo23652e = mo23652e();
                            C31.m112933j(mo23652e, e);
                            c7501Sh = mo23652e;
                        }
                    }
                }
            } else {
                c7501Sh = null;
                break;
            }
        }
        if (c7501Sh == null) {
            C7501Sh mo23652e2 = mo23652e();
            C31.m112936g(mo23652e2);
            return mo23652e2;
        }
        return c7501Sh;
    }

    /* renamed from: e */
    public abstract C7501Sh mo23652e();

    /* renamed from: f */
    public Activity m30031f() {
        Activity activity = this.f93245a;
        if (activity != null) {
            return activity;
        }
        C33702Iy1 c33702Iy1 = this.f93246b;
        if (c33702Iy1 != null) {
            return c33702Iy1.m101440a();
        }
        return null;
    }

    /* renamed from: g */
    public abstract List<AbstractC43476jj1<CONTENT, RESULT>.AbstractC24996a> mo23651g();

    /* renamed from: h */
    public int m30030h() {
        return this.f93248d;
    }

    /* renamed from: i */
    public void mo30029i(CONTENT content) {
        mo30028j(content, f93244e);
    }

    /* renamed from: j */
    public void mo30028j(CONTENT content, Object obj) {
        C7501Sh m30032d = m30032d(content, obj);
        if (m30032d != null) {
            C33702Iy1 c33702Iy1 = this.f93246b;
            if (c33702Iy1 != null) {
                C31.m112938e(m30032d, c33702Iy1);
                return;
            } else {
                C31.m112937f(m30032d, this.f93245a);
                return;
            }
        }
        Log.e("FacebookDialog", "No code path should ever result in a null appCall");
        if (!C17216a.m52724v()) {
            return;
        }
        throw new IllegalStateException("No code path should ever result in a null appCall");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m30027k(Intent intent, int i) {
        String str;
        Activity activity = this.f93245a;
        if (activity != null) {
            activity.startActivityForResult(intent, i);
        } else {
            C33702Iy1 c33702Iy1 = this.f93246b;
            str = "Failed to find Activity or Fragment to startActivityForResult ";
            if (c33702Iy1 != null) {
                if (c33702Iy1.m101439b() != null) {
                    this.f93246b.m101439b().startActivityForResult(intent, i);
                } else if (this.f93246b.m101438c() != null) {
                    this.f93246b.m101438c().startActivityForResult(intent, i);
                }
            }
            if (str == null) {
                C32992Fx2.m106221f(EnumC36034Sx2.DEVELOPER_ERRORS, 6, getClass().getName(), str);
                return;
            }
            return;
        }
        str = null;
        if (str == null) {
        }
    }

    public AbstractC43476jj1(C33702Iy1 c33702Iy1, int i) {
        C48817sj6.m13765m(c33702Iy1, "fragmentWrapper");
        this.f93246b = c33702Iy1;
        this.f93245a = null;
        this.f93248d = i;
        if (c33702Iy1.m101440a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
