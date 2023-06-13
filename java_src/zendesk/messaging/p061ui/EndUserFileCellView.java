package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;
/* renamed from: zendesk.messaging.ui.EndUserFileCellView */
/* loaded from: classes8.dex */
public class EndUserFileCellView extends LinearLayout implements Updatable<EndUserCellFileState> {
    private ImageView appIcon;
    private LinearLayout bubble;
    private Drawable defaultAppIcon;
    private TextView fileDescriptor;
    private TextView fileName;
    private FileUploadProgressView fileUploadProgressView;
    private TextView label;
    private MessageStatusView statusView;

    public EndUserFileCellView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(1);
        setGravity(8388693);
        View.inflate(getContext(), R$layout.zui_view_end_user_file_cell_content, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.bubble = (LinearLayout) findViewById(R$id.zui_cell_file_container);
        this.fileName = (TextView) findViewById(R$id.zui_file_cell_name);
        this.fileDescriptor = (TextView) findViewById(R$id.zui_cell_file_description);
        this.appIcon = (ImageView) findViewById(R$id.zui_cell_file_app_icon);
        this.fileUploadProgressView = (FileUploadProgressView) findViewById(R$id.zui_cell_file_upload_progress);
        this.statusView = (MessageStatusView) findViewById(R$id.zui_cell_status_view);
        this.label = (TextView) findViewById(R$id.zui_cell_label_message);
        Drawable m94299e = NA0.m94299e(getContext(), R$drawable.zui_ic_insert_drive_file);
        this.defaultAppIcon = m94299e;
        if (m94299e != null) {
            C31646Ad6.m115424c(C31646Ad6.m115422e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary), this.defaultAppIcon, this.appIcon);
        }
    }

    @Override // zendesk.messaging.p061ui.Updatable
    public void update(EndUserCellFileState endUserCellFileState) {
        UtilsEndUserCellView.setCellBackground(endUserCellFileState, this.bubble);
        UtilsEndUserCellView.setLabelErrorMessage(endUserCellFileState, this.label, getContext());
        UtilsEndUserCellView.setClickListener(endUserCellFileState, this);
        UtilsEndUserCellView.setLongClickListener(endUserCellFileState, this);
        this.statusView.setStatus(endUserCellFileState.getStatus());
        endUserCellFileState.getAttachment();
        throw null;
    }

    public EndUserFileCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EndUserFileCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
