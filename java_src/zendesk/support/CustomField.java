package zendesk.support;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes8.dex */
public class CustomField implements Serializable {
    private static final String LOG_TAG = "CustomField";

    /* renamed from: id */
    private Long f121948id;
    private Object value;

    public CustomField(Long l, Object obj) {
        this.f121948id = l;
        this.value = obj;
    }

    public Long getId() {
        return this.f121948id;
    }

    @Deprecated
    public String getValue() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        C33694Ix2.m101447l(LOG_TAG, "Custom Field Value is of a type other than String or Boolean. Is this a multi-select field?", new Object[0]);
        return null;
    }

    public Boolean getValueBoolean() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        C33694Ix2.m101447l(LOG_TAG, "Custom field value is not a boolean", new Object[0]);
        return null;
    }

    public List<String> getValueList() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            if (C43505jm0.m29948i(list)) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj2 : list) {
                    arrayList.add(String.valueOf(obj2));
                }
                return arrayList;
            }
        }
        C33694Ix2.m101447l(LOG_TAG, "Custom field value is not a list.", new Object[0]);
        return null;
    }

    public Object getValueObject() {
        return this.value;
    }

    public String getValueString() {
        Object obj = this.value;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        C33694Ix2.m101447l(LOG_TAG, "Custom field value is not a string", new Object[0]);
        return null;
    }
}
