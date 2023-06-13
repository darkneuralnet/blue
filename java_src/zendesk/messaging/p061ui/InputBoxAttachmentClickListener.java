package zendesk.messaging.p061ui;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C31098b;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.R$id;
/* renamed from: zendesk.messaging.ui.InputBoxAttachmentClickListener */
/* loaded from: classes8.dex */
class InputBoxAttachmentClickListener implements View.OnClickListener {
    private final AppCompatActivity activity;
    private final BelvedereMediaHolder belvedereMediaHolder;
    private final C31098b imageStream;

    public InputBoxAttachmentClickListener(AppCompatActivity appCompatActivity, C31098b c31098b, BelvedereMediaHolder belvedereMediaHolder) {
        this.activity = appCompatActivity;
        this.imageStream = c31098b;
        this.belvedereMediaHolder = belvedereMediaHolder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!this.imageStream.m755D9()) {
            showImagePicker();
        } else {
            this.imageStream.dismiss();
        }
    }

    public void showImagePicker() {
        BelvedereUi.m866a(this.activity).m850g().m849h("*/*", true).m845l(this.belvedereMediaHolder.getSelectedMedia()).m844m(R$id.input_box_attachments_indicator, R$id.input_box_send_btn).m847j(true).m851f(this.activity);
    }
}
