package zendesk.messaging.p061ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$drawable;
/* renamed from: zendesk.messaging.ui.MessageStatusView */
/* loaded from: classes8.dex */
public class MessageStatusView extends AppCompatImageView {
    private int deliveredIconColor;
    private int failedIconColor;
    private int pendingIconColor;

    /* renamed from: zendesk.messaging.ui.MessageStatusView$1 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C312171 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$MessagingItem$Query$Status;

        static {
            int[] iArr = new int[MessagingItem.Query.Status.values().length];
            $SwitchMap$zendesk$messaging$MessagingItem$Query$Status = iArr;
            try {
                iArr[MessagingItem.Query.Status.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.FAILED_NO_RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.DELIVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MessageStatusView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.deliveredIconColor = C31646Ad6.m115422e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary);
        this.failedIconColor = C31646Ad6.m115425b(R$color.zui_error_text_color, getContext());
        this.pendingIconColor = C31646Ad6.m115425b(R$color.zui_cell_pending_indicator_color, getContext());
    }

    public void setStatus(MessagingItem.Query.Status status) {
        int i = C312171.$SwitchMap$zendesk$messaging$MessagingItem$Query$Status[status.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    setImageResource(0);
                    return;
                }
                C51668xY1.m5035c(this, ColorStateList.valueOf(this.pendingIconColor));
                setImageResource(R$drawable.zui_ic_status_pending);
                return;
            }
            C51668xY1.m5035c(this, ColorStateList.valueOf(this.deliveredIconColor));
            setImageResource(R$drawable.zui_ic_status_sent);
            return;
        }
        C51668xY1.m5035c(this, ColorStateList.valueOf(this.failedIconColor));
        setImageResource(R$drawable.zui_ic_status_fail);
    }

    public MessageStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MessageStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
