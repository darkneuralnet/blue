package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import zendesk.support.RequestStatus;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;
/* loaded from: classes8.dex */
class CellSystemMessages {

    /* loaded from: classes8.dex */
    public static class CellDateMessage extends CellBase {
        public CellDateMessage(CellBindHelper cellBindHelper, long j, Date date) {
            super(cellBindHelper, C52975zk4.zs_request_date_message, j, -2147483648L, date);
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public boolean areContentsTheSame(CellType.Base base) {
            return getTimeStamp().equals(base.getTimeStamp());
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            this.utils.bindDate((TextView) requestViewHolder.findCachedView(C35181Pg4.request_date_message_text), getTimeStamp());
        }
    }

    /* loaded from: classes8.dex */
    public static class CellRequestStatus extends CellBase {
        private final RequestStatus requestStatus;

        public CellRequestStatus(CellBindHelper cellBindHelper, RequestStatus requestStatus) {
            super(cellBindHelper, C52975zk4.zs_request_system_message, -9223372036854775807L, -2147483648L, new Date());
            this.requestStatus = requestStatus;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellRequestStatus;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            TextView textView = (TextView) requestViewHolder.findCachedView(C35181Pg4.request_system_message_text);
            if (this.requestStatus == RequestStatus.Closed) {
                textView.setText(C41720gl4.request_system_message_closed_ticket);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class CellSystemMessage extends CellBase {
        private final String message;

        public CellSystemMessage(Date date, String str) {
            super(null, C52975zk4.zs_request_system_message, Long.MIN_VALUE, -2147483648L, date);
            this.message = str;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellSystemMessage;
        }

        @Override // zendesk.support.request.CellBase, zendesk.support.request.CellType.Base
        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            ((TextView) requestViewHolder.findCachedView(C35181Pg4.request_system_message_text)).setText(this.message);
        }
    }
}
