package zendesk.messaging;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.MediaResult;
/* loaded from: classes8.dex */
public class BelvedereMediaResolverCallback extends G80<List<MediaResult>> {
    private final EventFactory eventFactory;
    private final EventListener eventListener;

    public BelvedereMediaResolverCallback(EventListener eventListener, EventFactory eventFactory) {
        this.eventListener = eventListener;
        this.eventFactory = eventFactory;
    }

    @Override // p000.G80
    public void success(List<MediaResult> list) {
        C33694Ix2.m101457b("BelvedereMediaResolverCallback", "Uris have been resolved, collecting files to send the event", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (MediaResult mediaResult : list) {
            File m785c = mediaResult.m785c();
            if (m785c == null) {
                C33694Ix2.m101447l("BelvedereMediaResolverCallback", "Unable to get file, skipping Uri: %s", mediaResult.m779j().toString());
            } else {
                arrayList.add(m785c);
            }
        }
        if (arrayList.isEmpty()) {
            C33694Ix2.m101447l("BelvedereMediaResolverCallback", "No files resolved. No event will be sent", new Object[0]);
            return;
        }
        C33694Ix2.m101457b("BelvedereMediaResolverCallback", "Sending attachment event", new Object[0]);
        this.eventListener.onEvent(this.eventFactory.sendAttachment(arrayList));
    }
}
