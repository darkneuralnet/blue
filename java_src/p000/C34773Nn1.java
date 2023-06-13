package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.C18378b;
import com.google.firebase.remoteconfig.internal.C18381c;
import com.google.firebase.remoteconfig.internal.C18384d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Nn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34773Nn1 {

    /* renamed from: m */
    public static final byte[] f25165m = new byte[0];

    /* renamed from: a */
    public final Context f25166a;

    /* renamed from: b */
    public final C31722Am1 f25167b;

    /* renamed from: c */
    public final C50620vm1 f25168c;

    /* renamed from: d */
    public final Executor f25169d;

    /* renamed from: e */
    public final C34601Mu0 f25170e;

    /* renamed from: f */
    public final C34601Mu0 f25171f;

    /* renamed from: g */
    public final C34601Mu0 f25172g;

    /* renamed from: h */
    public final C18381c f25173h;

    /* renamed from: i */
    public final C45967nv0 f25174i;

    /* renamed from: j */
    public final C18384d f25175j;

    /* renamed from: k */
    public final InterfaceC35934Sm1 f25176k;

    /* renamed from: l */
    public final C53081zv0 f25177l;

    public C34773Nn1(Context context, C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, C50620vm1 c50620vm1, Executor executor, C34601Mu0 c34601Mu0, C34601Mu0 c34601Mu02, C34601Mu0 c34601Mu03, C18381c c18381c, C45967nv0 c45967nv0, C18384d c18384d, C53081zv0 c53081zv0) {
        this.f25166a = context;
        this.f25167b = c31722Am1;
        this.f25176k = interfaceC35934Sm1;
        this.f25168c = c50620vm1;
        this.f25169d = executor;
        this.f25170e = c34601Mu0;
        this.f25171f = c34601Mu02;
        this.f25172g = c34601Mu03;
        this.f25173h = c18381c;
        this.f25174i = c45967nv0;
        this.f25175j = c18384d;
        this.f25177l = c53081zv0;
    }

    /* renamed from: j */
    public static boolean m93425j(C18378b c18378b, C18378b c18378b2) {
        return c18378b2 == null || !c18378b.m46993g().equals(c18378b2.m46993g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Task m93424k(Task task, Task task2, Task task3) throws Exception {
        if (task.isSuccessful() && task.getResult() != null) {
            C18378b c18378b = (C18378b) task.getResult();
            if (task2.isSuccessful() && !m93425j(c18378b, (C18378b) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return this.f25171f.m94597k(c18378b).continueWith(this.f25169d, new Continuation() { // from class: Mn1
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    boolean m93421n;
                    m93421n = C34773Nn1.this.m93421n(task4);
                    return Boolean.valueOf(m93421n);
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Task m93422m(Void r1) throws Exception {
        return m93430e();
    }

    /* renamed from: q */
    public static List<Map<String, String>> m93418q(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* renamed from: e */
    public Task<Boolean> m93430e() {
        final Task<C18378b> m94603e = this.f25170e.m94603e();
        final Task<C18378b> m94603e2 = this.f25171f.m94603e();
        return Tasks.whenAllComplete(m94603e, m94603e2).continueWithTask(this.f25169d, new Continuation() { // from class: Ln1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m93424k;
                m93424k = C34773Nn1.this.m93424k(m94603e, m94603e2, task);
                return m93424k;
            }
        });
    }

    /* renamed from: f */
    public Task<Void> m93429f() {
        return this.f25173h.m46972i().onSuccessTask(C34530Mm1.m94883a(), new SuccessContinuation() { // from class: Kn1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task forResult;
                C18381c.C18382a c18382a = (C18381c.C18382a) obj;
                forResult = Tasks.forResult(null);
                return forResult;
            }
        });
    }

    /* renamed from: g */
    public Task<Boolean> m93428g() {
        return m93429f().onSuccessTask(this.f25169d, new SuccessContinuation() { // from class: Jn1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m93422m;
                m93422m = C34773Nn1.this.m93422m((Void) obj);
                return m93422m;
            }
        });
    }

    /* renamed from: h */
    public Map<String, InterfaceC35475Qn1> m93427h() {
        return this.f25174i.m22187d();
    }

    /* renamed from: i */
    public InterfaceC35007On1 m93426i() {
        return this.f25175j.m46945c();
    }

    /* renamed from: n */
    public final boolean m93421n(Task<C18378b> task) {
        if (task.isSuccessful()) {
            this.f25170e.m94604d();
            if (task.getResult() != null) {
                m93417r(task.getResult().m46996d());
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void m93420o(boolean z) {
        this.f25177l.m117b(z);
    }

    /* renamed from: p */
    public void m93419p() {
        this.f25171f.m94603e();
        this.f25172g.m94603e();
        this.f25170e.m94603e();
    }

    /* renamed from: r */
    public void m93417r(JSONArray jSONArray) {
        if (this.f25168c == null) {
            return;
        }
        try {
            this.f25168c.m8160m(m93418q(jSONArray));
        } catch (AbtException e) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
        }
    }
}
