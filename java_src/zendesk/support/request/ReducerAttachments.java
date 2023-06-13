package zendesk.support.request;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zendesk.belvedere.MediaResult;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;
/* loaded from: classes8.dex */
class ReducerAttachments extends Reducer<StateAttachments> {
    private static final String LOG_FORMAT_ATTACHMENT_DROPPED = "Cannot add attachment %s. Size is %d, max attachment size is %d.";
    private static final String LOG_MESSAGE_ATTACHMENTS_DISABLED = "Cannot add attachments, they are disabled in your Zendesk settings.";

    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateAttachments reduce(StateAttachments stateAttachments, Action action) {
        return reduce2(stateAttachments, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateAttachments getInitialState() {
        return new StateAttachments();
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public StateAttachments reduce2(StateAttachments stateAttachments, Action<?> action) {
        String actionType = action.getActionType();
        actionType.hashCode();
        char c = 65535;
        switch (actionType.hashCode()) {
            case -1326172566:
                if (actionType.equals("ATTACHMENTS_SELECTED")) {
                    c = 0;
                    break;
                }
                break;
            case -635275733:
                if (actionType.equals("ATTACHMENTS_DESELECTED")) {
                    c = 1;
                    break;
                }
                break;
            case -91317760:
                if (actionType.equals("LOAD_SETTINGS_SUCCESS")) {
                    c = 2;
                    break;
                }
                break;
            case 207206879:
                if (actionType.equals("START_CONFIG")) {
                    c = 3;
                    break;
                }
                break;
            case 979542142:
                if (actionType.equals("CLEAR_ATTACHMENTS")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (MediaResult mediaResult : (List) action.getData()) {
                    arrayList.add(StateRequestAttachment.convert(mediaResult));
                }
                return stateAttachments.newBuilder().addAllSelectedAttachments(arrayList).setSelectedAttachments(C43505jm0.m29955b(arrayList, stateAttachments.getSelectedAttachments())).build();
            case 1:
                HashSet hashSet = new HashSet();
                for (MediaResult mediaResult2 : (List) action.getData()) {
                    hashSet.add(mediaResult2.m781h());
                }
                ArrayList arrayList2 = new ArrayList();
                for (StateRequestAttachment stateRequestAttachment : stateAttachments.getSelectedAttachments()) {
                    if (!hashSet.contains(stateRequestAttachment.getParsedLocalUri())) {
                        arrayList2.add(stateRequestAttachment);
                    }
                }
                return stateAttachments.newBuilder().setSelectedAttachments(arrayList2).build();
            case 2:
                StateSettings stateSettings = (StateSettings) action.getData();
                ArrayList arrayList3 = new ArrayList();
                if (stateSettings.isAttachmentsEnabled()) {
                    long maxAttachmentSize = stateSettings.getMaxAttachmentSize();
                    for (StateRequestAttachment stateRequestAttachment2 : stateAttachments.getSelectedAttachments()) {
                        if (stateRequestAttachment2.getSize() > maxAttachmentSize) {
                            C33694Ix2.m101457b("RequestActivity", LOG_FORMAT_ATTACHMENT_DROPPED, stateRequestAttachment2.getName(), Long.valueOf(stateRequestAttachment2.getSize()), Long.valueOf(maxAttachmentSize));
                        } else {
                            arrayList3.add(stateRequestAttachment2);
                        }
                    }
                    return stateAttachments.newBuilder().setSelectedAttachments(arrayList3).build();
                }
                C33694Ix2.m101447l("RequestActivity", LOG_MESSAGE_ATTACHMENTS_DISABLED, new Object[0]);
                return new StateAttachments();
            case 3:
                List<StateRequestAttachment> files = ((RequestConfiguration) action.getData()).getFiles();
                return stateAttachments.newBuilder().addAllSelectedAttachments(files).setSelectedAttachments(files).build();
            case 4:
                return new StateAttachments();
            default:
                return null;
        }
    }
}
