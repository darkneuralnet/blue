package zendesk.support.request;

import android.annotation.SuppressLint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.CustomField;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class StateRequestTicketForm implements Serializable {
    static final long NO_ID = -1;

    /* renamed from: id */
    private final long f122004id;
    private final Map<Long, String> ticketFields;

    public StateRequestTicketForm(long j, List<CustomField> list) {
        this.f122004id = j;
        this.ticketFields = fieldsToMap(list);
    }

    @SuppressLint({"UseSparseArrays"})
    private static Map<Long, String> fieldsToMap(List<CustomField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (CustomField customField : list) {
            if (customField != null && C44504lS5.m27273b(customField.getValueString())) {
                hashMap.put(customField.getId(), customField.getValueString());
            }
        }
        return hashMap;
    }

    private static List<CustomField> mapToFields(Map<Long, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            arrayList.add(new CustomField(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public long getId() {
        return this.f122004id;
    }

    public Map<Long, String> getTicketFields() {
        return this.ticketFields;
    }

    public List<CustomField> getTicketFieldsForApi() {
        return mapToFields(this.ticketFields);
    }

    public StateRequestTicketForm(List<CustomField> list) {
        this(-1L, list);
    }
}
