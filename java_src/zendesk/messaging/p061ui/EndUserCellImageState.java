package zendesk.messaging.p061ui;

import zendesk.messaging.Attachment;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.MessagingItem;
/* renamed from: zendesk.messaging.ui.EndUserCellImageState */
/* loaded from: classes8.dex */
class EndUserCellImageState extends EndUserCellFileState {
    private final C42732iT3 picasso;

    public EndUserCellImageState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, Attachment attachment, MessagingItem.FileQuery.FailureReason failureReason, AttachmentSettings attachmentSettings, C42732iT3 c42732iT3) {
        super(str, messagingCellProps, status, messageActionListener, attachment, failureReason, attachmentSettings);
        this.picasso = c42732iT3;
    }

    @Override // zendesk.messaging.p061ui.EndUserCellFileState, zendesk.messaging.p061ui.EndUserCellBaseState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C42732iT3 c42732iT3 = this.picasso;
        C42732iT3 c42732iT32 = ((EndUserCellImageState) obj).picasso;
        if (c42732iT3 != null) {
            return c42732iT3.equals(c42732iT32);
        }
        if (c42732iT32 == null) {
            return true;
        }
        return false;
    }

    @Override // zendesk.messaging.p061ui.EndUserCellFileState, zendesk.messaging.p061ui.EndUserCellBaseState
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        C42732iT3 c42732iT3 = this.picasso;
        if (c42732iT3 != null) {
            i = c42732iT3.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
