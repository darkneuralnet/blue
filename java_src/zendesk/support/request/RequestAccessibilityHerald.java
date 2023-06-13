package zendesk.support.request;

import android.view.View;
import zendesk.support.CommentsResponse;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.suas.Action;
import zendesk.support.suas.Listener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RequestAccessibilityHerald implements Listener<Action<?>> {
    private final View view;

    public RequestAccessibilityHerald(View view) {
        this.view = view;
    }

    private void announce(int i, Object... objArr) {
        this.view.announceForAccessibility(this.view.getContext().getString(i, objArr));
    }

    public static RequestAccessibilityHerald create(RequestActivity requestActivity) {
        return new RequestAccessibilityHerald(requestActivity.findViewById(C35181Pg4.activity_request_root));
    }

    @Override // zendesk.support.suas.Listener
    public void update(Action<?> action) {
        Object obj;
        String actionType = action.getActionType();
        actionType.hashCode();
        char c = 65535;
        switch (actionType.hashCode()) {
            case -1679314784:
                if (actionType.equals("CREATE_COMMENT_SUCCESS")) {
                    c = 0;
                    break;
                }
                break;
            case -1319777819:
                if (actionType.equals("CREATE_COMMENT_ERROR")) {
                    c = 1;
                    break;
                }
                break;
            case -292168757:
                if (actionType.equals("LOAD_COMMENT_INITIAL")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                announce(C41720gl4.zs_request_announce_comment_created_accessibility, ((ActionCreateComment.CreateCommentResult) action.getData()).getMessage().getPlainBody());
                return;
            case 1:
                announce(C41720gl4.zs_request_announce_comment_failed_accessibility, ((StateMessage) action.getData()).getPlainBody());
                return;
            case 2:
                C48526sE3 c48526sE3 = (C48526sE3) action.getData();
                if (c48526sE3 == null || (obj = c48526sE3.f108491a) == null || !C43505jm0.m29948i(((CommentsResponse) obj).getComments())) {
                    return;
                }
                announce(C41720gl4.zs_request_announce_comments_loaded_accessibility, new Object[0]);
                return;
            default:
                return;
        }
    }
}
