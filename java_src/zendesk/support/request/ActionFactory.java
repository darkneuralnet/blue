package zendesk.support.request;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import zendesk.belvedere.C31096a;
import zendesk.belvedere.MediaResult;
import zendesk.core.AuthenticationProvider;
import zendesk.core.Zendesk;
import zendesk.support.CommentsResponse;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.suas.Action;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ActionFactory {
    static final String ANDROID_ON_PAUSE = "ANDROID_ON_PAUSE";
    static final String ANDROID_ON_RESUME = "ANDROID_ON_RESUME";
    static final String ATTACHMENTS_DESELECTED = "ATTACHMENTS_DESELECTED";
    static final String ATTACHMENTS_SELECTED = "ATTACHMENTS_SELECTED";
    static final String ATTACHMENT_DOWNLOADED = "ATTACHMENT_DOWNLOADED";
    static final String CLEAR_ATTACHMENTS = "CLEAR_ATTACHMENTS";
    static final String CLEAR_MESSAGES = "CLEAR_MESSAGES";
    static final String CREATE_COMMENT = "CREATE_COMMENT";
    static final String CREATE_COMMENT_ERROR = "CREATE_COMMENT_ERROR";
    static final String CREATE_COMMENT_SUCCESS = "CREATE_COMMENT_SUCCESS";
    static final String CREATE_REQUEST = "CREATE_REQUEST";
    static final String CREATE_REQUEST_ERROR = "CREATE_REQUEST_ERROR";
    static final String CREATE_REQUEST_SUCCESS = "CREATE_REQUEST_SUCCESS";
    static final String DELETE_MESSAGE = "DELETE_MESSAGE";
    static final String DIALOG_DISMISSED = "DIALOG_DISMISSED";
    static final String LOAD_COMMENTS_FROM_CACHE = "LOAD_COMMENTS_FROM_CACHE";
    static final String LOAD_COMMENTS_FROM_CACHE_ERROR = "LOAD_COMMENTS_FROM_CACHE_ERROR";
    static final String LOAD_COMMENTS_FROM_CACHE_SUCCESS = "LOAD_COMMENTS_FROM_CACHE_SUCCESS";
    static final String LOAD_COMMENTS_INITIAL = "LOAD_COMMENT_INITIAL";
    static final String LOAD_COMMENTS_INITIAL_ERROR = "LOAD_COMMENTS_INITIAL_ERROR";
    static final String LOAD_COMMENTS_INITIAL_SUCCESS = "LOAD_COMMENTS_INITIAL_SUCCESS";
    static final String LOAD_COMMENTS_UPDATE = "LOAD_COMMENTS_UPDATE";
    static final String LOAD_COMMENTS_UPDATE_ERROR = "LOAD_COMMENTS_UPDATE_ERROR";
    static final String LOAD_COMMENTS_UPDATE_SUCCESS = "LOAD_COMMENTS_UPDATE_SUCCESS";
    static final String LOAD_REQUEST = "LOAD_REQUEST";
    static final String LOAD_REQUEST_ERROR = "LOAD_REQUEST_ERROR";
    static final String LOAD_REQUEST_SUCCESS = "LOAD_REQUEST_SUCCESS";
    static final String LOAD_SETTINGS = "LOAD_SETTINGS";
    static final String LOAD_SETTINGS_ERROR = "LOAD_SETTINGS_ERROR";
    static final String LOAD_SETTINGS_SUCCESS = "LOAD_SETTINGS_SUCCESS";
    static final String REQUEST_CLOSED = "REQUEST_CLOSED";
    static final String SHOW_RETRY_DIALOG = "SHOW_RETRY_DIALOG";
    static final String SKIP_ACTION = "SKIP_ACTION";
    static final String START_CONFIG = "START_CONFIG";
    private final AuthenticationProvider authProvider;
    private final C31096a belvedere;
    private final Executor executorService;
    private final Executor mainThreadExecutor;
    private final RequestProvider requestProvider;
    private final String sdkVersion;
    private final SupportSettingsProvider settingsProvider;
    private final SupportBlipsProvider supportBlipsProvider;
    private final SupportUiStorage supportUiStorage;
    private final UploadProvider uploadProvider;

    /* renamed from: zendesk  reason: collision with root package name */
    private final Zendesk f122704zendesk;

    /* loaded from: classes8.dex */
    public static class ErrorAction<E> extends Action<E> {
        private final InterfaceC48782sg1 errorResponse;

        public ErrorAction(String str, InterfaceC48782sg1 interfaceC48782sg1) {
            this(str, interfaceC48782sg1, null);
        }

        public InterfaceC48782sg1 getErrorResponse() {
            return this.errorResponse;
        }

        public ErrorAction(String str, InterfaceC48782sg1 interfaceC48782sg1, E e) {
            super(str, e);
            this.errorResponse = interfaceC48782sg1;
        }
    }

    public ActionFactory(RequestProvider requestProvider, UploadProvider uploadProvider, SupportSettingsProvider supportSettingsProvider, C31096a c31096a, SupportUiStorage supportUiStorage, Executor executor, String str, AuthenticationProvider authenticationProvider, Zendesk zendesk2, SupportBlipsProvider supportBlipsProvider, Executor executor2) {
        this.requestProvider = requestProvider;
        this.uploadProvider = uploadProvider;
        this.settingsProvider = supportSettingsProvider;
        this.belvedere = c31096a;
        this.supportUiStorage = supportUiStorage;
        this.executorService = executor;
        this.mainThreadExecutor = executor2;
        this.sdkVersion = str;
        this.authProvider = authenticationProvider;
        this.f122704zendesk = zendesk2;
        this.supportBlipsProvider = supportBlipsProvider;
    }

    public Action androidOnPause() {
        return new Action(ANDROID_ON_PAUSE);
    }

    public Action androidOnResume() {
        return new Action(ANDROID_ON_RESUME);
    }

    public Action attachmentDownloaded(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        return new Action(ATTACHMENT_DOWNLOADED, C48526sE3.m14515a(stateRequestAttachment, mediaResult));
    }

    public Action clearAttachments() {
        return new Action(CLEAR_ATTACHMENTS);
    }

    public Action clearMessages() {
        return new Action(CLEAR_MESSAGES);
    }

    public Action createComment(StateMessage stateMessage) {
        return new Action(CREATE_COMMENT, stateMessage);
    }

    public Action createCommentAsync(String str, List<StateRequestAttachment> list) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, this.belvedere, list), new StateMessage(str, list)));
    }

    public Action createCommentError(InterfaceC48782sg1 interfaceC48782sg1, StateMessage stateMessage) {
        return new ErrorAction(CREATE_COMMENT_ERROR, interfaceC48782sg1, stateMessage);
    }

    public Action createCommentSuccess(ActionCreateComment.CreateCommentResult createCommentResult) {
        return new Action(CREATE_COMMENT_SUCCESS, createCommentResult);
    }

    public Action createRequestError(InterfaceC48782sg1 interfaceC48782sg1, StateMessage stateMessage) {
        return new ErrorAction(CREATE_REQUEST_ERROR, interfaceC48782sg1, stateMessage);
    }

    public Action createRequestSuccess(ActionCreateComment.CreateCommentResult createCommentResult) {
        return new Action(CREATE_REQUEST_SUCCESS, createCommentResult);
    }

    public Action deleteMessage(StateMessage stateMessage) {
        return new Action(DELETE_MESSAGE, stateMessage);
    }

    public Action deselectAttachment(List<MediaResult> list) {
        return new Action(ATTACHMENTS_DESELECTED, list);
    }

    public Action initialLoadCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, this.belvedere, true));
    }

    public Action installStartConfigAsync(RequestConfiguration requestConfiguration) {
        return AsyncMiddleware.createAction(new ActionInstallConfiguration(this.supportUiStorage, requestConfiguration, this.executorService, this.mainThreadExecutor, this, this.supportBlipsProvider));
    }

    public Action loadComments(boolean z) {
        if (z) {
            return new Action(LOAD_COMMENTS_INITIAL);
        }
        return new Action(LOAD_COMMENTS_UPDATE);
    }

    public Action loadCommentsError(boolean z, InterfaceC48782sg1 interfaceC48782sg1) {
        if (z) {
            return new ErrorAction(LOAD_COMMENTS_INITIAL_ERROR, interfaceC48782sg1);
        }
        return new ErrorAction(LOAD_COMMENTS_UPDATE_ERROR, interfaceC48782sg1);
    }

    public Action loadCommentsFromCache() {
        return new Action(LOAD_COMMENTS_FROM_CACHE);
    }

    public Action loadCommentsFromCacheAsync() {
        return AsyncMiddleware.createAction(new ActionLoadCachedComments(this, this.supportUiStorage, this.belvedere, this.executorService, this.sdkVersion));
    }

    public Action loadCommentsFromCacheError() {
        return new Action(LOAD_COMMENTS_FROM_CACHE_ERROR);
    }

    public Action loadCommentsFromCacheSuccess(StateConversation stateConversation) {
        return new Action(LOAD_COMMENTS_FROM_CACHE_SUCCESS, stateConversation);
    }

    public Action loadCommentsSuccess(boolean z, CommentsResponse commentsResponse, Map<Long, MediaResult> map) {
        C48526sE3 c48526sE3 = new C48526sE3(commentsResponse, map);
        if (z) {
            return new Action(LOAD_COMMENTS_INITIAL_SUCCESS, c48526sE3);
        }
        return new Action(LOAD_COMMENTS_UPDATE_SUCCESS, c48526sE3);
    }

    public Action loadRequest() {
        return new Action(LOAD_REQUEST);
    }

    public Action loadRequestAsync() {
        return AsyncMiddleware.createAction(new ActionLoadRequest(this, this.requestProvider));
    }

    public Action loadRequestError(InterfaceC48782sg1 interfaceC48782sg1) {
        return new ErrorAction(LOAD_REQUEST_ERROR, interfaceC48782sg1);
    }

    public Action loadRequestSuccess(Request request) {
        return new Action(LOAD_REQUEST_SUCCESS, request);
    }

    public Action loadSettings() {
        return new Action(LOAD_SETTINGS);
    }

    public Action loadSettingsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadSettings(this, this.settingsProvider, this.authProvider));
    }

    public Action loadSettingsError(InterfaceC48782sg1 interfaceC48782sg1) {
        return new ErrorAction(LOAD_SETTINGS_ERROR, interfaceC48782sg1);
    }

    public Action loadSettingsSuccess(StateSettings stateSettings) {
        return new Action(LOAD_SETTINGS_SUCCESS, stateSettings);
    }

    public Action onDialogDismissed() {
        return new Action(DIALOG_DISMISSED);
    }

    public Action requestClosed() {
        return new Action(REQUEST_CLOSED);
    }

    public Action resendCommentAsync(StateMessage stateMessage) {
        return AsyncMiddleware.createAction(new ActionCreateComment(this, this.requestProvider, new AttachmentUploadService(this.uploadProvider, this.belvedere, stateMessage.getAttachments()), stateMessage));
    }

    public Action selectAttachment(List<MediaResult> list) {
        return new Action(ATTACHMENTS_SELECTED, list);
    }

    public Action showRetryDialog(List<StateMessage> list) {
        return new Action(SHOW_RETRY_DIALOG, list);
    }

    public Action skipAction() {
        return new Action(SKIP_ACTION);
    }

    public Action startConfig(RequestConfiguration requestConfiguration) {
        return new Action(START_CONFIG, requestConfiguration);
    }

    public Action updateCommentsAsync() {
        return AsyncMiddleware.createAction(new ActionLoadComments(this, this.requestProvider, this.belvedere, false));
    }

    public Action updateNameEmailAsync(String str, String str2) {
        return AsyncMiddleware.createAction(new ActionUpdateNameEmail(str, str2, this.authProvider, this.f122704zendesk));
    }
}
