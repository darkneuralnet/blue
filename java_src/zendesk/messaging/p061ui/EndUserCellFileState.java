package zendesk.messaging.p061ui;

import zendesk.messaging.Attachment;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.MessagingItem;
/* renamed from: zendesk.messaging.ui.EndUserCellFileState */
/* loaded from: classes8.dex */
class EndUserCellFileState extends EndUserCellBaseState {
    private final AttachmentSettings attachmentSettings;
    private final MessagingItem.FileQuery.FailureReason failureReason;

    public EndUserCellFileState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, Attachment attachment, MessagingItem.FileQuery.FailureReason failureReason, AttachmentSettings attachmentSettings) {
        super(str, messagingCellProps, status, messageActionListener);
        this.failureReason = failureReason;
        this.attachmentSettings = attachmentSettings;
    }

    @Override // zendesk.messaging.p061ui.EndUserCellBaseState
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        EndUserCellFileState endUserCellFileState = (EndUserCellFileState) obj;
        if (this.failureReason != endUserCellFileState.failureReason) {
            return false;
        }
        AttachmentSettings attachmentSettings = this.attachmentSettings;
        if (attachmentSettings != null) {
            return attachmentSettings.equals(endUserCellFileState.attachmentSettings);
        }
        if (endUserCellFileState.attachmentSettings == null) {
            return true;
        }
        return false;
    }

    public Attachment getAttachment() {
        return null;
    }

    public AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public MessagingItem.FileQuery.FailureReason getFailureReason() {
        return this.failureReason;
    }

    @Override // zendesk.messaging.p061ui.EndUserCellBaseState
    public int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((super.hashCode() * 31) + 0) * 31;
        MessagingItem.FileQuery.FailureReason failureReason = this.failureReason;
        if (failureReason != null) {
            i = failureReason.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        AttachmentSettings attachmentSettings = this.attachmentSettings;
        if (attachmentSettings != null) {
            i2 = attachmentSettings.hashCode();
        }
        return i3 + i2;
    }
}
