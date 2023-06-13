package zendesk.support.request;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.MediaResult;
/* loaded from: classes8.dex */
class AttachmentHelper {
    private final int[] touchableItems;
    private long maxFileSize = -1;
    private List<StateRequestAttachment> selectedAttachments = new ArrayList();
    private List<StateRequestAttachment> additionalAttachments = new ArrayList();

    public AttachmentHelper(int... iArr) {
        this.touchableItems = iArr;
    }

    private List<MediaResult> requestAttachmentsToMediaResult(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StateRequestAttachment stateRequestAttachment : list) {
            arrayList.add(StateRequestAttachment.convert(stateRequestAttachment));
        }
        return arrayList;
    }

    public List<StateRequestAttachment> getSelectedAttachments() {
        return C43505jm0.m29954c(this.selectedAttachments);
    }

    public void showImagePicker(AppCompatActivity appCompatActivity) {
        BelvedereUi.C31075b m848i = BelvedereUi.m866a(appCompatActivity).m850g().m849h("*/*", true).m845l(requestAttachmentsToMediaResult(this.selectedAttachments)).m847j(appCompatActivity.getResources().getBoolean(C51739xf4.zs_request_image_picker_full_screen)).m848i(requestAttachmentsToMediaResult(this.additionalAttachments));
        int[] iArr = this.touchableItems;
        if (iArr != null && iArr.length > 0) {
            m848i = m848i.m844m(iArr);
        }
        long j = this.maxFileSize;
        if (j > 0) {
            m848i = m848i.m846k(j);
        }
        m848i.m851f(appCompatActivity);
    }

    public void updateAttachments(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2) {
        this.selectedAttachments = C43505jm0.m29954c(new ArrayList(collection));
        this.additionalAttachments = C43505jm0.m29954c(new ArrayList(collection2));
    }

    public void updateMaxFileSize(long j) {
        this.maxFileSize = j;
    }
}
