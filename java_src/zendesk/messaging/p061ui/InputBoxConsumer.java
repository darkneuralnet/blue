package zendesk.messaging.p061ui;

import java.util.ArrayList;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.C31098b;
import zendesk.belvedere.MediaResult;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.BelvedereMediaResolverCallback;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.p061ui.InputBox;
/* renamed from: zendesk.messaging.ui.InputBoxConsumer */
/* loaded from: classes8.dex */
public class InputBoxConsumer implements InputBox.InputTextConsumer {
    private final C31096a belvedere;
    private final BelvedereMediaHolder belvedereMediaHolder;
    private final BelvedereMediaResolverCallback belvedereMediaResolverCallback;
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final C31098b imageStream;

    public InputBoxConsumer(EventListener eventListener, EventFactory eventFactory, C31098b c31098b, C31096a c31096a, BelvedereMediaHolder belvedereMediaHolder, BelvedereMediaResolverCallback belvedereMediaResolverCallback) {
        this.eventListener = eventListener;
        this.eventFactory = eventFactory;
        this.imageStream = c31098b;
        this.belvedere = c31096a;
        this.belvedereMediaHolder = belvedereMediaHolder;
        this.belvedereMediaResolverCallback = belvedereMediaResolverCallback;
    }

    @Override // zendesk.messaging.p061ui.InputBox.InputTextConsumer
    public boolean onConsumeText(String str) {
        if (C44504lS5.m27273b(str)) {
            this.eventListener.onEvent(this.eventFactory.textInput(str));
        }
        ArrayList arrayList = new ArrayList();
        for (MediaResult mediaResult : this.belvedereMediaHolder.getSelectedMedia()) {
            arrayList.add(mediaResult.m779j());
        }
        if (!arrayList.isEmpty()) {
            this.belvedere.m759h(arrayList, "zendesk/messaging", this.belvedereMediaResolverCallback);
            this.belvedereMediaHolder.clear();
        }
        if (this.imageStream.m755D9()) {
            this.imageStream.dismiss();
            return true;
        }
        return true;
    }
}
