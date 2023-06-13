package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.transition.C12055c;
import androidx.transition.Fade;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ComponentToolbar implements Listener<ToolbarModel> {
    private final ViewToolbarAvatar avatarContainer;
    private final View container;
    private final Context context;
    private final C42732iT3 picasso;
    private final ViewAlmostRealProgressBar progressBar;
    private final TextView subTitle;
    private final TextView title;
    private final Toolbar toolbar;
    private ToolbarModel toolbarModel;
    private final Fade fadeTransition = new Fade();
    private final ToolbarSelector toolbarSelector = new ToolbarSelector();

    /* loaded from: classes8.dex */
    public static class ToolbarModel {
        static int STATE_AGENT_INFO = 3;
        static int STATE_LOADING = 1;
        static int STATE_TITLE = 2;
        private final List<StateRequestUser> agent;
        private final boolean isProgressEnabled;
        private final Date lastReply;
        private final int toolbarContentState;

        public ToolbarModel(boolean z, int i, List<StateRequestUser> list, Date date) {
            this.isProgressEnabled = z;
            this.toolbarContentState = i;
            this.agent = list;
            this.lastReply = date;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ToolbarModel toolbarModel = (ToolbarModel) obj;
            if (this.isProgressEnabled != toolbarModel.isProgressEnabled || this.toolbarContentState != toolbarModel.toolbarContentState) {
                return false;
            }
            List<StateRequestUser> list = this.agent;
            if (list == null ? toolbarModel.agent != null : !list.equals(toolbarModel.agent)) {
                return false;
            }
            Date date = this.lastReply;
            Date date2 = toolbarModel.lastReply;
            if (date != null) {
                return date.equals(date2);
            }
            if (date2 == null) {
                return true;
            }
            return false;
        }

        public List<StateRequestUser> getAgents() {
            return this.agent;
        }

        public List<C48526sE3<String, String>> getAvatarUrls() {
            ArrayList arrayList = new ArrayList();
            for (StateRequestUser stateRequestUser : this.agent) {
                arrayList.add(C48526sE3.m14515a(stateRequestUser.getAvatar(), stateRequestUser.getName()));
            }
            return arrayList;
        }

        public Date getLastReply() {
            return this.lastReply;
        }

        public String getNameOfFirstAgent() {
            if (C43505jm0.m29948i(this.agent)) {
                return this.agent.get(0).getName();
            }
            return "";
        }

        public int getToolbarContentState() {
            return this.toolbarContentState;
        }

        public int hashCode() {
            int i;
            int i2 = (((this.isProgressEnabled ? 1 : 0) * 31) + this.toolbarContentState) * 31;
            List<StateRequestUser> list = this.agent;
            int i3 = 0;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            Date date = this.lastReply;
            if (date != null) {
                i3 = date.hashCode();
            }
            return i4 + i3;
        }

        public boolean isProgressEnabled() {
            return this.isProgressEnabled;
        }
    }

    /* loaded from: classes8.dex */
    public static class ToolbarSelector implements StateSelector<ToolbarModel> {
        private StateMessage findLastAgentReply(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    return stateMessage;
                }
            }
            return null;
        }

        private List<StateRequestUser> getInvolvedAgents(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    linkedHashSet.add(map.get(Long.valueOf(stateMessage.getUserId())));
                }
            }
            return new ArrayList(linkedHashSet);
        }

        private boolean isProgressEnabled(State state) {
            if (StateProgress.fomState(state).getRunningRequests() > 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"UseSparseArrays"})
        private Map<Long, StateRequestUser> mapAgents(List<StateRequestUser> list) {
            HashMap hashMap = new HashMap();
            for (StateRequestUser stateRequestUser : list) {
                if (stateRequestUser.isAgent()) {
                    hashMap.put(Long.valueOf(stateRequestUser.getId()), stateRequestUser);
                }
            }
            return hashMap;
        }

        @Override // zendesk.support.suas.StateSelector
        public ToolbarModel selectData(State state) {
            int i;
            boolean isProgressEnabled = isProgressEnabled(state);
            StateConversation fromState = StateConversation.fromState(state);
            Map<Long, StateRequestUser> mapAgents = mapAgents(fromState.getUsers());
            ArrayList arrayList = new ArrayList();
            if (!C44504lS5.m27273b(fromState.getLocalId()) && !C44504lS5.m27273b(fromState.getRemoteId())) {
                i = ToolbarModel.STATE_LOADING;
            } else if (fromState.hasAgentReplies() && mapAgents.size() == 0) {
                i = ToolbarModel.STATE_LOADING;
            } else if (fromState.hasAgentReplies() && mapAgents.size() > 0) {
                int i2 = ToolbarModel.STATE_AGENT_INFO;
                StateMessage findLastAgentReply = findLastAgentReply(fromState.getMessages(), mapAgents);
                r4 = findLastAgentReply != null ? findLastAgentReply.getDate() : null;
                arrayList.addAll(getInvolvedAgents(fromState.getMessages(), mapAgents));
                i = i2;
            } else {
                i = ToolbarModel.STATE_TITLE;
            }
            return new ToolbarModel(isProgressEnabled, i, arrayList, r4);
        }
    }

    public ComponentToolbar(C42732iT3 c42732iT3, Toolbar toolbar, ViewAlmostRealProgressBar viewAlmostRealProgressBar) {
        this.picasso = c42732iT3;
        this.progressBar = viewAlmostRealProgressBar;
        this.toolbar = toolbar;
        this.context = toolbar.getContext();
        this.container = toolbar.findViewById(C35181Pg4.activity_request_toolbar_container);
        this.title = (TextView) toolbar.findViewById(C35181Pg4.activity_request_toolbar_custom_title);
        this.subTitle = (TextView) toolbar.findViewById(C35181Pg4.activity_request_toolbar_custom_sub_title);
        this.avatarContainer = (ViewToolbarAvatar) toolbar.findViewById(C35181Pg4.activity_request_toolbar_avatar_holder);
    }

    private void updateProgressBar(boolean z) {
        if (z) {
            this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
        } else {
            this.progressBar.stop(300L);
        }
    }

    private void updateToolbar(ToolbarModel toolbarModel) {
        if (toolbarModel.getToolbarContentState() == ToolbarModel.STATE_LOADING) {
            this.container.setVisibility(8);
            this.toolbar.setTitle("");
        } else if (toolbarModel.getToolbarContentState() == ToolbarModel.STATE_AGENT_INFO) {
            this.title.setText(toolbarModel.getNameOfFirstAgent());
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(this.context, toolbarModel.getLastReply().getTime(), true);
            this.subTitle.setText(this.context.getString(C41720gl4.request_toolbar_last_reply, relativeTimeSpanString));
            this.toolbar.setTitle("");
            this.avatarContainer.setImageUrls(this.picasso, toolbarModel.getAvatarUrls());
            C12055c.m65804b(this.toolbar, this.fadeTransition);
            this.container.setVisibility(0);
            this.container.setContentDescription(this.container.getContext().getString(C41720gl4.zs_request_toolbar_accessibility, toolbarModel.getNameOfFirstAgent(), relativeTimeSpanString));
        } else if (toolbarModel.getToolbarContentState() == ToolbarModel.STATE_TITLE) {
            this.container.setVisibility(8);
            this.toolbar.setTitle(C41720gl4.request_activity_title);
        }
    }

    public ToolbarSelector getToolbarSelector() {
        return this.toolbarSelector;
    }

    @Override // zendesk.support.suas.Listener
    public void update(ToolbarModel toolbarModel) {
        if (toolbarModel.equals(this.toolbarModel)) {
            return;
        }
        this.toolbarModel = toolbarModel;
        updateProgressBar(toolbarModel.isProgressEnabled());
        updateToolbar(toolbarModel);
    }
}
