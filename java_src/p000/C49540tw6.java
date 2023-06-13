package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import p000.AbstractC45006mI4;
import p000.Y70;
/* renamed from: tw6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49540tw6 implements AbstractC45006mI4.InterfaceC26038b {

    /* renamed from: b */
    public final IM4 f111392b;

    /* renamed from: d */
    public final C39574d80 f111394d;

    /* renamed from: e */
    public final BlockingQueue<AbstractC45006mI4<?>> f111395e;

    /* renamed from: a */
    public final Map<String, List<AbstractC45006mI4<?>>> f111391a = new HashMap();

    /* renamed from: c */
    public final C40864fJ4 f111393c = null;

    public C49540tw6(C39574d80 c39574d80, BlockingQueue<AbstractC45006mI4<?>> blockingQueue, IM4 im4) {
        this.f111392b = im4;
        this.f111394d = c39574d80;
        this.f111395e = blockingQueue;
    }

    @Override // p000.AbstractC45006mI4.InterfaceC26038b
    /* renamed from: a */
    public synchronized void mo11189a(AbstractC45006mI4<?> abstractC45006mI4) {
        BlockingQueue<AbstractC45006mI4<?>> blockingQueue;
        String cacheKey = abstractC45006mI4.getCacheKey();
        List<AbstractC45006mI4<?>> remove = this.f111391a.remove(cacheKey);
        if (remove != null && !remove.isEmpty()) {
            if (C34841Nu6.f25359b) {
                C34841Nu6.m93202e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), cacheKey);
            }
            AbstractC45006mI4<?> remove2 = remove.remove(0);
            this.f111391a.put(cacheKey, remove);
            remove2.setNetworkRequestCompleteListener(this);
            C40864fJ4 c40864fJ4 = this.f111393c;
            if (c40864fJ4 != null) {
                c40864fJ4.m41566f(remove2);
            } else if (this.f111394d != null && (blockingQueue = this.f111395e) != null) {
                try {
                    blockingQueue.put(remove2);
                } catch (InterruptedException e) {
                    C34841Nu6.m93204c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f111394d.m44584d();
                }
            }
        }
    }

    @Override // p000.AbstractC45006mI4.InterfaceC26038b
    /* renamed from: b */
    public void mo11188b(AbstractC45006mI4<?> abstractC45006mI4, EM4<?> em4) {
        List<AbstractC45006mI4<?>> remove;
        Y70.C9639a c9639a = em4.f7349b;
        if (c9639a != null && !c9639a.m75667a()) {
            String cacheKey = abstractC45006mI4.getCacheKey();
            synchronized (this) {
                remove = this.f111391a.remove(cacheKey);
            }
            if (remove != null) {
                if (C34841Nu6.f25359b) {
                    C34841Nu6.m93202e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), cacheKey);
                }
                for (AbstractC45006mI4<?> abstractC45006mI42 : remove) {
                    this.f111392b.mo102457a(abstractC45006mI42, em4);
                }
                return;
            }
            return;
        }
        mo11189a(abstractC45006mI4);
    }

    /* renamed from: c */
    public synchronized boolean m11187c(AbstractC45006mI4<?> abstractC45006mI4) {
        String cacheKey = abstractC45006mI4.getCacheKey();
        if (this.f111391a.containsKey(cacheKey)) {
            List<AbstractC45006mI4<?>> list = this.f111391a.get(cacheKey);
            if (list == null) {
                list = new ArrayList<>();
            }
            abstractC45006mI4.addMarker("waiting-for-response");
            list.add(abstractC45006mI4);
            this.f111391a.put(cacheKey, list);
            if (C34841Nu6.f25359b) {
                C34841Nu6.m93205b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        }
        this.f111391a.put(cacheKey, null);
        abstractC45006mI4.setNetworkRequestCompleteListener(this);
        if (C34841Nu6.f25359b) {
            C34841Nu6.m93205b("new request, sending to network %s", cacheKey);
        }
        return false;
    }
}
