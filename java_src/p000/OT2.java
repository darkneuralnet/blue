package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: OT2 */
/* loaded from: classes5.dex */
public final class OT2 {
    /* renamed from: a */
    public static List<String> m92251a(View view) {
        if (TD0.m84203d(OT2.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup m22282j = C45933nr6.m22282j(view);
            if (m22282j != null) {
                for (View view2 : C45933nr6.m22290b(m22282j)) {
                    if (view != view2) {
                        arrayList.addAll(m92249c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, OT2.class);
            return null;
        }
    }

    /* renamed from: b */
    public static List<String> m92250b(View view) {
        if (TD0.m84203d(OT2.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C45933nr6.m22283i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] split = view.getResources().getResourceName(view.getId()).split("/");
                    if (split.length == 2) {
                        arrayList.add(split[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            TD0.m84205b(th, OT2.class);
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m92249c(View view) {
        if (TD0.m84203d(OT2.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View view2 : C45933nr6.m22290b(view)) {
                arrayList.addAll(m92249c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, OT2.class);
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m92248d(String str, List<String> list) {
        if (TD0.m84203d(OT2.class)) {
            return false;
        }
        try {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, OT2.class);
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m92247e(List<String> list, List<String> list2) {
        if (TD0.m84203d(OT2.class)) {
            return false;
        }
        try {
            for (String str : list) {
                if (m92248d(str, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TD0.m84205b(th, OT2.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m92246f(String str, String str2) {
        if (TD0.m84203d(OT2.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            TD0.m84205b(th, OT2.class);
            return false;
        }
    }
}
