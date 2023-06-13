package zendesk.messaging.p061ui;

import zendesk.messaging.MessagingItem;
/* renamed from: zendesk.messaging.ui.EndUserCellBaseState */
/* loaded from: classes8.dex */
abstract class EndUserCellBaseState {

    /* renamed from: id */
    private final String f121936id;
    private final MessageActionListener messageActionListener;
    private final MessagingCellProps props;
    private final MessagingItem.Query.Status status;

    public EndUserCellBaseState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener) {
        this.f121936id = str;
        this.props = messagingCellProps;
        this.status = status;
        this.messageActionListener = messageActionListener;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndUserCellBaseState endUserCellBaseState = (EndUserCellBaseState) obj;
        String str = this.f121936id;
        if (str == null ? endUserCellBaseState.f121936id != null : !str.equals(endUserCellBaseState.f121936id)) {
            return false;
        }
        MessagingCellProps messagingCellProps = this.props;
        if (messagingCellProps == null ? endUserCellBaseState.props != null : !messagingCellProps.equals(endUserCellBaseState.props)) {
            return false;
        }
        if (this.status != endUserCellBaseState.status) {
            return false;
        }
        if (this.messageActionListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (endUserCellBaseState.messageActionListener == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f121936id;
    }

    public MessageActionListener getMessageActionListener() {
        return this.messageActionListener;
    }

    public MessagingCellProps getProps() {
        return this.props;
    }

    public MessagingItem.Query.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f121936id;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        MessagingCellProps messagingCellProps = this.props;
        if (messagingCellProps != null) {
            i2 = messagingCellProps.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        MessagingItem.Query.Status status = this.status;
        if (status != null) {
            i3 = status.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        MessageActionListener messageActionListener = this.messageActionListener;
        if (messageActionListener != null) {
            i4 = messageActionListener.hashCode();
        }
        return i7 + i4;
    }
}
