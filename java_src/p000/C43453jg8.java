package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: jg8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43453jg8 {

    /* renamed from: a */
    public final String f93153a;

    /* renamed from: b */
    public final Bundle f93154b;

    /* renamed from: c */
    public Bundle f93155c;

    /* renamed from: d */
    public final /* synthetic */ C33556Ih8 f93156d;

    public C43453jg8(C33556Ih8 c33556Ih8, String str, Bundle bundle) {
        this.f93156d = c33556Ih8;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.f93153a = "default_event_parameters";
        this.f93154b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m30112a() {
        char c;
        if (this.f93155c == null) {
            String string = this.f93156d.m101802l().getString(this.f93153a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c = 0;
                                    }
                                    c = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c = 2;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (string3.equals(DateTokenConverter.CONVERTER_KEY)) {
                                    c = 1;
                                }
                                c = 65535;
                            }
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        this.f93156d.f100966a.mo22258a().m106893o().m42707b("Unrecognized persisted bundle type. Type", string3);
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString("v"));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f93156d.f100966a.mo22258a().m106893o().m42708a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f93155c = bundle;
                } catch (JSONException unused2) {
                    this.f93156d.f100966a.mo22258a().m106893o().m42708a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f93155c == null) {
                this.f93155c = this.f93154b;
            }
        }
        return this.f93155c;
    }

    /* renamed from: b */
    public final void m30111b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f93156d.m101802l().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f93153a);
        } else {
            String str = this.f93153a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", DateTokenConverter.CONVERTER_KEY);
                        } else {
                            this.f93156d.f100966a.mo22258a().m106893o().m42707b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f93156d.f100966a.mo22258a().m106893o().m42707b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f93155c = bundle;
    }
}
