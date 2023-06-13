package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C31096a;
import zendesk.support.request.CellType;
import zendesk.support.suas.Dispatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class CellBindHelper {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());

    /* renamed from: af */
    private final ActionFactory f121975af;
    private final CellAttachmentLoadingUtil attachmentUtil;
    private final Context context;
    private final Dispatcher dispatcher;
    private final String today;
    private final String yesterday;

    public CellBindHelper(Context context, C42732iT3 c42732iT3, ActionFactory actionFactory, Dispatcher dispatcher) {
        this.context = context;
        this.f121975af = actionFactory;
        this.dispatcher = dispatcher;
        this.attachmentUtil = new CellAttachmentLoadingUtil(c42732iT3, context);
        this.today = context.getString(C41720gl4.request_message_date_today);
        this.yesterday = context.getString(C41720gl4.request_message_date_yesterday);
    }

    private boolean basicCellChecks(CellType.Base base, CellType.Base base2) {
        if (base == base2) {
            return true;
        }
        if (base.getPositionType() == base2.getPositionType() && base.getClass().isInstance(base2)) {
            return true;
        }
        return false;
    }

    private int getPixelForDp(int i) {
        if (i != 0) {
            return this.context.getResources().getDimensionPixelOffset(i);
        }
        return 0;
    }

    private boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAttachment(Context context, StateRequestAttachment stateRequestAttachment) {
        Intent m761f = C31096a.m764c(context).m761f(stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getMimeType());
        if (context.getPackageManager().queryIntentActivities(m761f, 0).size() > 0) {
            context.startActivity(m761f);
        }
    }

    public void addOnClickListenerForFileAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setAlpha(1.0f);
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    CellBindHelper.this.openAttachment(view2.getContext(), stateRequestAttachment);
                }
            });
            return;
        }
        view.setAlpha(this.context.getResources().getInteger(C35199Pi4.zs_request_file_attachment_downloading_cell_alpha) / 100.0f);
        view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.2
            private final String toastMessage;

            {
                this.toastMessage = CellBindHelper.this.context.getString(C41720gl4.request_file_attachment_download_in_progress);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Toast.makeText(view2.getContext(), this.toastMessage, 0).show();
            }
        });
    }

    public void addOnClickListenerForImageAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    CellBindHelper.this.openAttachment(view2.getContext(), stateRequestAttachment);
                }
            });
        } else {
            view.setOnClickListener(null);
        }
    }

    public boolean areAgentCellContentsTheSame(CellType.Agent agent, CellType.Base base) {
        boolean z;
        boolean z2;
        if (!basicCellChecks(agent, base) || !(base instanceof CellType.Agent)) {
            return false;
        }
        CellType.Agent agent2 = (CellType.Agent) base;
        if (agent.getAgent().getId() == agent2.getAgent().getId()) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = agent.getAgent().getName().equals(agent2.getAgent().getName());
        if (agent.isAgentNameVisible() == agent2.isAgentNameVisible()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !equals || !z2) {
            return false;
        }
        return true;
    }

    public boolean areAttachmentCellContentsTheSame(CellType.Attachment attachment, CellType.Base base) {
        if (!basicCellChecks(attachment, base) || !(base instanceof CellType.Attachment)) {
            return false;
        }
        StateRequestAttachment attachment2 = attachment.getAttachment();
        StateRequestAttachment attachment3 = ((CellType.Attachment) base).getAttachment();
        boolean nullSafeEquals = nullSafeEquals(attachment2.getLocalFile(), attachment3.getLocalFile());
        boolean nullSafeEquals2 = nullSafeEquals(attachment2.getLocalUri(), attachment3.getLocalUri());
        boolean nullSafeEquals3 = nullSafeEquals(attachment2.getUrl(), attachment3.getUrl());
        if (!nullSafeEquals || !nullSafeEquals2 || !nullSafeEquals3) {
            return false;
        }
        return true;
    }

    public boolean areMessageContentsTheSame(CellType.Message message, CellType.Base base) {
        if (!basicCellChecks(message, base) || !(base instanceof CellType.Message)) {
            return false;
        }
        return message.getMessage().equals(((CellType.Message) base).getMessage());
    }

    public boolean areStatefulCellContentsTheSame(CellType.Stateful stateful, CellType.Base base) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!basicCellChecks(stateful, base) || !(base instanceof CellType.Stateful)) {
            return false;
        }
        CellType.Stateful stateful2 = (CellType.Stateful) base;
        if (stateful.isErrorShown() == stateful2.isErrorShown()) {
            z = true;
        } else {
            z = false;
        }
        if (stateful.isMarkedAsDelivered() == stateful2.isMarkedAsDelivered()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (stateful.getErrorGroupMessages().size() == stateful2.getErrorGroupMessages().size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (stateful.isLastErrorCellOfBlock() == stateful2.isLastErrorCellOfBlock()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    public void bindAgentName(TextView textView, boolean z, StateRequestUser stateRequestUser) {
        if (z) {
            textView.setVisibility(0);
            textView.setText(stateRequestUser.getName());
            return;
        }
        textView.setVisibility(4);
    }

    public void bindAppInfo(ResolveInfo resolveInfo, TextView textView, ImageView imageView) {
        textView.setText(UtilsAttachment.getAppName(this.context, resolveInfo));
        imageView.setImageDrawable(UtilsAttachment.getAppIcon(this.context, resolveInfo));
    }

    public void bindDate(TextView textView, Date date) {
        String format;
        if (UtilsDate.isToday(date)) {
            format = this.today;
        } else if (UtilsDate.isYesterday(date)) {
            format = this.yesterday;
        } else {
            format = DATE_FORMAT.format(date);
        }
        textView.setText(format.toUpperCase(Locale.getDefault()));
    }

    public void bindImage(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
        this.attachmentUtil.bindImage(imageView, stateRequestAttachment);
    }

    public void bindStatusLabel(TextView textView, boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = 0;
        if (z) {
            i = C52925zf4.zs_request_cell_label_color_error;
            i2 = C41720gl4.request_messages_status_error;
        } else if (z2) {
            i = C52925zf4.zs_request_cell_label_color;
            i2 = C41720gl4.request_message_status_delivered;
        } else {
            i = -1;
            i3 = 4;
            i2 = -1;
        }
        if (i > 0) {
            textView.setTextColor(NA0.m94301c(this.context, i));
        }
        if (i2 > 0) {
            textView.setText(i2);
        }
        textView.clearAnimation();
        if (i3 == 0 && i3 != textView.getVisibility()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(250L);
            alphaAnimation.setInterpolator(C43828kJ3.m29072a(0.0f, 0.0f, 0.2f, 1.0f));
            textView.startAnimation(alphaAnimation);
        }
        textView.setVisibility(i3);
    }

    public int colorForError(boolean z) {
        int i;
        if (z) {
            i = C52925zf4.zs_request_user_background_color_error;
        } else {
            i = C52925zf4.zs_request_user_background_color;
        }
        return NA0.m94301c(this.context, i);
    }

    public int colorForErrorImage(boolean z) {
        if (z) {
            return NA0.m94301c(this.context, C52925zf4.zs_request_user_background_image_color_error);
        }
        return 0;
    }

    public View.OnClickListener errorClickListener(boolean z, final List<StateMessage> list) {
        if (z) {
            return new View.OnClickListener() { // from class: zendesk.support.request.CellBindHelper.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CellBindHelper.this.dispatcher.dispatch(CellBindHelper.this.f121975af.showRetryDialog(list));
                }
            };
        }
        return null;
    }

    public ResolveInfo getAppInfo(String str) {
        return UtilsAttachment.getAppInfoForFile(this.context, str);
    }

    public Rect getInsets(int i, int i2, int i3, int i4) {
        return new Rect(getPixelForDp(i), getPixelForDp(i2), getPixelForDp(i3), getPixelForDp(i4));
    }
}
