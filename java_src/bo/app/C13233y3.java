package bo.app;

import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.y3 */
/* loaded from: classes.dex */
public class C13233y3 implements InterfaceC12546b2 {

    /* renamed from: f */
    private static final String f59450f = C43664k20.m29433n(C13233y3.class);

    /* renamed from: b */
    private final EnumC13282z3 f59451b;

    /* renamed from: c */
    private final String f59452c;

    /* renamed from: d */
    private final int f59453d;

    /* renamed from: e */
    private Object f59454e;

    /* renamed from: bo.app.y3$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C13234a {

        /* renamed from: a */
        static final /* synthetic */ int[] f59455a;

        static {
            int[] iArr = new int[EnumC13282z3.values().length];
            f59455a = iArr;
            try {
                iArr[EnumC13282z3.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59455a[EnumC13282z3.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59455a[EnumC13282z3.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59455a[EnumC13282z3.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C13233y3(EnumC13282z3 enumC13282z3, String str, int i) {
        this.f59451b = enumC13282z3;
        this.f59452c = str;
        this.f59453d = i;
    }

    /* renamed from: b */
    private boolean m62734b(Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Double)) {
            if (this.f59453d != 2) {
                return false;
            }
            return true;
        }
        double doubleValue = ((Number) obj).doubleValue();
        double doubleValue2 = ((Number) this.f59454e).doubleValue();
        int i = this.f59453d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5 || doubleValue >= doubleValue2) {
                        return false;
                    }
                    return true;
                } else if (doubleValue <= doubleValue2) {
                    return false;
                } else {
                    return true;
                }
            } else if (doubleValue == doubleValue2) {
                return false;
            } else {
                return true;
            }
        } else if (doubleValue != doubleValue2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    private boolean m62733c(Object obj) {
        if (!(obj instanceof String)) {
            int i = this.f59453d;
            if (i != 2 && i != 17) {
                return false;
            }
            return true;
        }
        int i2 = this.f59453d;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 10) {
                    if (i2 != 17) {
                        return false;
                    }
                    return !m62735a((String) this.f59454e, (String) obj);
                }
                return m62735a((String) this.f59454e, (String) obj);
            }
            return !obj.equals(this.f59454e);
        }
        return obj.equals(this.f59454e);
    }

    @Override // bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        Object opt;
        if (interfaceC13145t2 instanceof InterfaceC13175v2) {
            C48407s20 mo62875c = ((InterfaceC13175v2) interfaceC13145t2).mo62875c();
            if (mo62875c != null) {
                try {
                    opt = mo62875c.forJsonPut().opt(this.f59452c);
                } catch (Exception e) {
                    C43664k20.m29434m(f59450f, "Caught exception checking property filter condition.", e);
                    return false;
                }
            } else {
                opt = null;
            }
            if (opt == null) {
                int i = this.f59453d;
                return i == 12 || i == 17 || i == 2;
            }
            int i2 = this.f59453d;
            if (i2 == 11) {
                return true;
            }
            if (i2 == 12) {
                return false;
            }
            int i3 = C13234a.f59455a[this.f59451b.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            return false;
                        }
                        return m62734b(opt);
                    }
                    return m62736a(opt, interfaceC13145t2.mo62923b());
                }
                return m62737a(opt);
            }
            return m62733c(opt);
        }
        return false;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f59451b.equals(EnumC13282z3.UNKNOWN)) {
                jSONObject.put("property_type", this.f59451b.toString());
            }
            jSONObject.put("property_key", this.f59452c);
            jSONObject.put("comparator", this.f59453d);
            jSONObject.put("property_value", this.f59454e);
        } catch (JSONException e) {
            C43664k20.m29434m(f59450f, "Caught exception creating property filter Json.", e);
        }
        return jSONObject;
    }

    public C13233y3(JSONObject jSONObject) {
        this((EnumC13282z3) C31696Aj2.m115347l(jSONObject, "property_type", EnumC13282z3.class, EnumC13282z3.UNKNOWN), jSONObject.getString("property_key"), jSONObject.getInt("comparator"));
        if (jSONObject.has("property_value")) {
            if (this.f59451b.equals(EnumC13282z3.STRING)) {
                this.f59454e = jSONObject.getString("property_value");
            } else if (this.f59451b.equals(EnumC13282z3.BOOLEAN)) {
                this.f59454e = Boolean.valueOf(jSONObject.getBoolean("property_value"));
            } else if (this.f59451b.equals(EnumC13282z3.NUMBER)) {
                this.f59454e = Double.valueOf(jSONObject.getDouble("property_value"));
            } else if (this.f59451b.equals(EnumC13282z3.DATE)) {
                this.f59454e = Long.valueOf(jSONObject.getLong("property_value"));
            }
        }
    }

    /* renamed from: a */
    private boolean m62736a(Object obj, long j) {
        Date date = null;
        if (obj instanceof String) {
            try {
                date = C46287oT0.m21025k((String) obj, EnumC37717a20.LONG);
            } catch (Exception e) {
                C43664k20.m29434m(f59450f, "Caught exception trying to parse date in compareTimestamps", e);
            }
        }
        if (date == null) {
            return this.f59453d == 2;
        }
        long m21029g = C46287oT0.m21029g(date);
        long longValue = ((Number) this.f59454e).longValue();
        int i = this.f59453d;
        if (i == 15) {
            return m21029g < j + longValue;
        } else if (i == 16) {
            return m21029g > j + longValue;
        } else {
            switch (i) {
                case 1:
                    return m21029g == longValue;
                case 2:
                    return m21029g != longValue;
                case 3:
                    return m21029g > longValue;
                case 4:
                    return m21029g >= j - longValue;
                case 5:
                    return m21029g < longValue;
                case 6:
                    return m21029g <= j - longValue;
                default:
                    return false;
            }
        }
    }

    /* renamed from: a */
    private boolean m62737a(Object obj) {
        if (!(obj instanceof Boolean)) {
            return this.f59453d == 2;
        }
        int i = this.f59453d;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return !obj.equals(this.f59454e);
        }
        return obj.equals(this.f59454e);
    }

    /* renamed from: a */
    public static boolean m62735a(String str, String str2) {
        return Pattern.compile(str, 2).matcher(str2).find();
    }
}
