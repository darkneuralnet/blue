package zendesk.support;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes8.dex */
final class RequestDataList {
    final List<RequestData> requestDataList;

    public RequestDataList(List<RequestData> list) {
        ArrayList arrayList = new ArrayList(0);
        this.requestDataList = arrayList;
        if (C43505jm0.m29948i(list)) {
            arrayList.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RequestDataList.class == obj.getClass()) {
            return this.requestDataList.equals(((RequestDataList) obj).requestDataList);
        }
        return false;
    }

    public int hashCode() {
        return this.requestDataList.hashCode();
    }
}
