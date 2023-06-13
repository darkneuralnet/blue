package zendesk.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes8.dex */
class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, TicketForm> cachedTicketForms = new HashMap();

    @Override // zendesk.support.RequestSessionCache
    public boolean containsAllTicketForms(List<Long> list) {
        boolean z;
        List m29952e = C43505jm0.m29952e(list);
        synchronized (this.cachedTicketForms) {
            Iterator it = m29952e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!this.cachedTicketForms.containsKey((Long) it.next())) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // zendesk.support.RequestSessionCache
    public synchronized List<TicketForm> getTicketFormsById(List<Long> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Long> m29952e = C43505jm0.m29952e(list);
        synchronized (this.cachedTicketForms) {
            for (Long l : m29952e) {
                arrayList.add(this.cachedTicketForms.get(l));
            }
        }
        return arrayList;
    }

    @Override // zendesk.support.RequestSessionCache
    public void updateTicketFormCache(List<TicketForm> list) {
        List<TicketForm> m29952e = C43505jm0.m29952e(list);
        HashMap hashMap = new HashMap();
        for (TicketForm ticketForm : m29952e) {
            hashMap.put(Long.valueOf(ticketForm.getId()), ticketForm);
        }
        synchronized (this.cachedTicketForms) {
            this.cachedTicketForms.putAll(hashMap);
        }
    }
}
