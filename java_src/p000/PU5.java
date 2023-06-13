package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: PU5 */
/* loaded from: classes5.dex */
public class PU5 {

    /* renamed from: a */
    public static final List<Class<? extends View>> f28579a = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    /* renamed from: a */
    public static List<View> m90188a(View view) {
        if (TD0.m84203d(PU5.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f28579a) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View view2 : C45933nr6.m22290b(view)) {
                arrayList.addAll(m90188a(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, PU5.class);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m90187b(View view, View view2) {
        if (TD0.m84203d(PU5.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m90184e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            for (View view3 : C45933nr6.m22290b(view)) {
                jSONArray.put(m90187b(view3, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            TD0.m84205b(th, PU5.class);
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m90186c(View view) {
        if (TD0.m84203d(PU5.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C45933nr6.m22290b(view)) {
                String m22281k = C45933nr6.m22281k(view2);
                if (!m22281k.isEmpty()) {
                    arrayList.add(m22281k);
                }
                arrayList.addAll(m90186c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, PU5.class);
            return null;
        }
    }

    /* renamed from: d */
    public static String m90185d(View view) {
        if (TD0.m84203d(PU5.class)) {
            return null;
        }
        try {
            String m22281k = C45933nr6.m22281k(view);
            if (!m22281k.isEmpty()) {
                return m22281k;
            }
            return TextUtils.join(" ", m90186c(view));
        } catch (Throwable th) {
            TD0.m84205b(th, PU5.class);
            return null;
        }
    }

    /* renamed from: e */
    public static void m90184e(View view, JSONObject jSONObject) {
        if (TD0.m84203d(PU5.class)) {
            return;
        }
        try {
            String m22281k = C45933nr6.m22281k(view);
            String m22283i = C45933nr6.m22283i(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", C45933nr6.m22289c(view));
            if (!m22281k.isEmpty()) {
                jSONObject.put(Entry.TYPE_TEXT, m22281k);
            }
            if (!m22283i.isEmpty()) {
                jSONObject.put("hint", m22283i);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, PU5.class);
        }
    }
}
