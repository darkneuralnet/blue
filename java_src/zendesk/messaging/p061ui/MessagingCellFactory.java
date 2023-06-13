package zendesk.messaging.p061ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import zendesk.messaging.AgentDetails;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.Engine;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$layout;
import zendesk.messaging.components.DateProvider;
import zendesk.messaging.p061ui.ActionOptionsView;
import zendesk.messaging.p061ui.AgentFileCellView;
import zendesk.messaging.p061ui.AgentImageCellView;
import zendesk.messaging.p061ui.AgentMessageView;
import zendesk.messaging.p061ui.ArticlesResponseView;
import zendesk.messaging.p061ui.MessagingState;
import zendesk.messaging.p061ui.SystemMessageView;
import zendesk.messaging.p061ui.TypingIndicatorView;
/* renamed from: zendesk.messaging.ui.MessagingCellFactory */
/* loaded from: classes8.dex */
public class MessagingCellFactory {
    private final AvatarStateFactory avatarStateFactory;
    private final AvatarStateRenderer avatarStateRenderer;
    private final MessagingCellPropsFactory cellPropsFactory;
    private final DateProvider dateProvider;
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final boolean multilineResponseOptionsEnabled;
    static final String TYPING_INDICATOR_ID = UUID.randomUUID().toString();
    private static final AgentDetails DEFAULT_TYPING_INDICATOR_LABEL_STATE = new AgentDetails("", "", false);

    /* renamed from: zendesk.messaging.ui.MessagingCellFactory$MessageActionAdapter */
    /* loaded from: classes8.dex */
    public static class MessageActionAdapter implements MessageActionListener {
        private final EventFactory eventFactory;
        private final EventListener eventListener;
        private final MessagingItem.Query messagingItem;

        public MessageActionAdapter(EventListener eventListener, MessagingItem.Query query, EventFactory eventFactory) {
            this.eventListener = eventListener;
            this.messagingItem = query;
            this.eventFactory = eventFactory;
        }

        @Override // zendesk.messaging.p061ui.MessageActionListener
        public void copy(String str) {
            this.eventListener.onEvent(this.eventFactory.copyQueryClick(this.messagingItem));
        }

        @Override // zendesk.messaging.p061ui.MessageActionListener
        public void delete(String str) {
            this.eventListener.onEvent(this.eventFactory.deleteQueryClick(this.messagingItem));
        }

        @Override // zendesk.messaging.p061ui.MessageActionListener
        public void retry(String str) {
            MessagingItem.Query query = this.messagingItem;
            if (query instanceof MessagingItem.FileQuery) {
                this.eventListener.onEvent(this.eventFactory.retrySendAttachmentClick((MessagingItem.FileQuery) query));
            } else {
                this.eventListener.onEvent(this.eventFactory.retryQueryClick(query));
            }
        }
    }

    /* renamed from: zendesk.messaging.ui.MessagingCellFactory$TypingItem */
    /* loaded from: classes8.dex */
    public static class TypingItem extends MessagingItem.Response {
        private TypingItem(Date date, String str, AgentDetails agentDetails) {
            super(date, str, agentDetails);
        }
    }

    public MessagingCellFactory(MessagingCellPropsFactory messagingCellPropsFactory, DateProvider dateProvider, EventListener eventListener, EventFactory eventFactory, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory, boolean z) {
        this.cellPropsFactory = messagingCellPropsFactory;
        this.dateProvider = dateProvider;
        this.eventListener = eventListener;
        this.eventFactory = eventFactory;
        this.avatarStateRenderer = avatarStateRenderer;
        this.avatarStateFactory = avatarStateFactory;
        this.multilineResponseOptionsEnabled = z;
    }

    private static MessagingCell<ActionOptionsView.State, ActionOptionsView> createActionOptionsCell(MessagingItem.TransferResponse transferResponse, MessagingCellProps messagingCellProps, final EventListener eventListener, final EventFactory eventFactory, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        ArrayList arrayList = new ArrayList();
        for (final Engine.TransferOptionDescription transferOptionDescription : transferResponse.getEngineOptions()) {
            arrayList.add(new ActionOptionsView.ActionOptionState(transferOptionDescription.getDisplayName(), new View.OnClickListener() { // from class: zendesk.messaging.ui.MessagingCellFactory.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EventListener.this.onEvent(eventFactory.transferOptionClick(transferOptionDescription));
                }
            }));
        }
        return new MessagingCell<>(transferResponse.getId(), new ActionOptionsView.State(transferResponse.getMessage(), transferResponse.getAgentDetails().getAgentName(), transferResponse.getAgentDetails().isBot(), messagingCellProps, arrayList, transferResponse.isEnabled(), avatarStateFactory.createAvatarState(transferResponse.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_action_options, ActionOptionsView.class);
    }

    private static MessagingCell<AgentFileCellView.State, AgentFileCellView> createAgentFileCell(MessagingItem.FileResponse fileResponse, MessagingCellProps messagingCellProps, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        fileResponse.getAttachment();
        return new MessagingCell<>(fileResponse.getId(), new AgentFileCellView.State(null, messagingCellProps, fileResponse.getAgentDetails().getAgentName(), fileResponse.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(fileResponse.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_agent_file_view, AgentFileCellView.class);
    }

    private static MessagingCell<AgentImageCellView.State, AgentImageCellView> createAgentImageCell(MessagingItem.ImageResponse imageResponse, MessagingCellProps messagingCellProps, C42732iT3 c42732iT3, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        imageResponse.getAttachment();
        return new MessagingCell<>(imageResponse.getId(), new AgentImageCellView.State(c42732iT3, messagingCellProps, null, imageResponse.getAgentDetails().getAgentName(), imageResponse.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(imageResponse.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_agent_image_view, AgentImageCellView.class);
    }

    private static ArticlesResponseView.ArticleSuggestionViewState createArticleSuggestionViewState(final MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion, final EventListener eventListener, final EventFactory eventFactory) {
        return new ArticlesResponseView.ArticleSuggestionViewState(articleSuggestion.getTitle(), articleSuggestion.getSnippet(), new OnArticleSuggestionSelectionListener() { // from class: zendesk.messaging.ui.MessagingCellFactory.1
            @Override // zendesk.messaging.p061ui.OnArticleSuggestionSelectionListener
            public void onArticleSuggestionSelected(Context context) {
                EventListener.this.onEvent(eventFactory.articleSuggestionClick(articleSuggestion));
            }
        });
    }

    private static List<ArticlesResponseView.ArticleSuggestionViewState> createArticleSuggestionViewStates(List<MessagingItem.ArticlesResponse.ArticleSuggestion> list, EventListener eventListener, EventFactory eventFactory) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MessagingItem.ArticlesResponse.ArticleSuggestion articleSuggestion : list) {
            arrayList.add(createArticleSuggestionViewState(articleSuggestion, eventListener, eventFactory));
        }
        return arrayList;
    }

    private static MessagingCell<ArticlesResponseView.State, ArticlesResponseView> createArticlesResponseCell(MessagingItem.ArticlesResponse articlesResponse, MessagingCellProps messagingCellProps, EventListener eventListener, EventFactory eventFactory, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        return new MessagingCell<>(articlesResponse.getId(), new ArticlesResponseView.State(articlesResponse.getAgentDetails().getAgentName(), articlesResponse.getAgentDetails().isBot(), messagingCellProps, createArticleSuggestionViewStates(articlesResponse.getArticleSuggestions(), eventListener, eventFactory), avatarStateFactory.createAvatarState(articlesResponse.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_articles_response, ArticlesResponseView.class);
    }

    private static MessagingCell createCell(MessagingItem messagingItem, MessagingCellProps messagingCellProps, C42732iT3 c42732iT3, AttachmentSettings attachmentSettings, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory, EventListener eventListener, EventFactory eventFactory, boolean z) {
        if (messagingItem instanceof MessagingItem.Query) {
            return createQueryCell(messagingItem, messagingCellProps, c42732iT3, attachmentSettings, eventListener, eventFactory);
        }
        if (messagingItem instanceof MessagingItem.Response) {
            return createResponseCell((MessagingItem.Response) messagingItem, messagingCellProps, c42732iT3, eventListener, eventFactory, avatarStateRenderer, avatarStateFactory);
        }
        if (messagingItem instanceof MessagingItem.OptionsResponse) {
            return createResponseOptionsCell((MessagingItem.OptionsResponse) messagingItem, messagingCellProps, eventListener, eventFactory, z);
        }
        if (messagingItem instanceof MessagingItem.SystemMessage) {
            return createSystemMessageCell((MessagingItem.SystemMessage) messagingItem, messagingCellProps);
        }
        return null;
    }

    private static MessagingCell<EndUserCellFileState, EndUserFileCellView> createFileQueryCell(MessagingItem.FileQuery fileQuery, MessagingCellProps messagingCellProps, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        String id = fileQuery.getId();
        MessagingItem.Query.Status status = fileQuery.getStatus();
        MessageActionAdapter messageActionAdapter = new MessageActionAdapter(eventListener, fileQuery, eventFactory);
        fileQuery.getAttachment();
        return new MessagingCell<>(fileQuery.getId(), new EndUserCellFileState(id, messagingCellProps, status, messageActionAdapter, null, fileQuery.getFailureReason(), attachmentSettings), R$layout.zui_cell_end_user_file_view, EndUserFileCellView.class);
    }

    private static MessagingCell<EndUserCellImageState, EndUserImageCellView> createImageQueryCell(MessagingItem.ImageQuery imageQuery, MessagingCellProps messagingCellProps, C42732iT3 c42732iT3, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        String id = imageQuery.getId();
        MessagingItem.Query.Status status = imageQuery.getStatus();
        MessageActionAdapter messageActionAdapter = new MessageActionAdapter(eventListener, imageQuery, eventFactory);
        imageQuery.getAttachment();
        return new MessagingCell<>(imageQuery.getId(), new EndUserCellImageState(id, messagingCellProps, status, messageActionAdapter, null, imageQuery.getFailureReason(), attachmentSettings, c42732iT3), R$layout.zui_cell_end_user_image_view, EndUserImageCellView.class);
    }

    private static MessagingCell<EndUserCellImageState, EndUserImageCellView> createImageQueryCellForFile(MessagingItem.ImageQuery imageQuery, MessagingCellProps messagingCellProps, C42732iT3 c42732iT3, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        return createImageQueryCell(imageQuery, messagingCellProps, c42732iT3, attachmentSettings, eventListener, eventFactory);
    }

    private static MessagingCell createQueryCell(MessagingItem messagingItem, MessagingCellProps messagingCellProps, C42732iT3 c42732iT3, AttachmentSettings attachmentSettings, EventListener eventListener, EventFactory eventFactory) {
        if (messagingItem instanceof MessagingItem.TextQuery) {
            return createTextQueryCell((MessagingItem.TextQuery) messagingItem, messagingCellProps, eventListener, eventFactory);
        }
        if (messagingItem instanceof MessagingItem.ImageQuery) {
            return createImageQueryCellForFile((MessagingItem.ImageQuery) messagingItem, messagingCellProps, c42732iT3, attachmentSettings, eventListener, eventFactory);
        }
        if (messagingItem instanceof MessagingItem.FileQuery) {
            return createFileQueryCell((MessagingItem.FileQuery) messagingItem, messagingCellProps, attachmentSettings, eventListener, eventFactory);
        }
        return null;
    }

    private static MessagingCell createResponseCell(MessagingItem.Response response, MessagingCellProps messagingCellProps, C42732iT3 c42732iT3, EventListener eventListener, EventFactory eventFactory, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory) {
        if (response instanceof MessagingItem.ArticlesResponse) {
            return createArticlesResponseCell((MessagingItem.ArticlesResponse) response, messagingCellProps, eventListener, eventFactory, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.TransferResponse) {
            return createActionOptionsCell((MessagingItem.TransferResponse) response, messagingCellProps, eventListener, eventFactory, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.ActionResponse) {
            return createActionOptionsCell((MessagingItem.ActionResponse) response, messagingCellProps, eventListener, eventFactory, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.ImageResponse) {
            return createAgentImageCell((MessagingItem.ImageResponse) response, messagingCellProps, c42732iT3, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof MessagingItem.FileResponse) {
            return createAgentFileCell((MessagingItem.FileResponse) response, messagingCellProps, avatarStateFactory, avatarStateRenderer);
        }
        if (response instanceof TypingItem) {
            return createTypingIndicatorCell((TypingItem) response, messagingCellProps, avatarStateRenderer, avatarStateFactory);
        }
        if (response instanceof MessagingItem.TextResponse) {
            return createTextResponseCell((MessagingItem.TextResponse) response, messagingCellProps, avatarStateRenderer, avatarStateFactory);
        }
        return null;
    }

    private static MessagingCell<ResponseOptionsViewState, ?> createResponseOptionsCell(final MessagingItem.OptionsResponse optionsResponse, MessagingCellProps messagingCellProps, final EventListener eventListener, final EventFactory eventFactory, boolean z) {
        ResponseOptionsViewState responseOptionsViewState = new ResponseOptionsViewState(optionsResponse.getOptions(), new ResponseOptionHandler() { // from class: zendesk.messaging.ui.MessagingCellFactory.4
            @Override // zendesk.messaging.p061ui.ResponseOptionHandler
            public void onResponseOptionSelected(MessagingItem.Option option) {
                EventListener.this.onEvent(eventFactory.formOptionClick(optionsResponse, option));
            }
        }, messagingCellProps);
        if (z) {
            return new MessagingCell<>(optionsResponse.getId(), responseOptionsViewState, R$layout.zui_cell_response_options_stacked, StackedResponseOptionsView.class);
        }
        return new MessagingCell<>(optionsResponse.getId(), responseOptionsViewState, R$layout.zui_cell_response_options, ResponseOptionsView.class);
    }

    private static MessagingCell<SystemMessageView.State, SystemMessageView> createSystemMessageCell(MessagingItem.SystemMessage systemMessage, MessagingCellProps messagingCellProps) {
        return new MessagingCell<>(systemMessage.getId(), new SystemMessageView.State(messagingCellProps, systemMessage.getSystemMessage()), R$layout.zui_cell_system_message, SystemMessageView.class);
    }

    private static MessagingCell<EndUserCellMessageState, EndUserMessageView> createTextQueryCell(MessagingItem.TextQuery textQuery, MessagingCellProps messagingCellProps, EventListener eventListener, EventFactory eventFactory) {
        return new MessagingCell<>(textQuery.getId(), new EndUserCellMessageState(textQuery.getId(), messagingCellProps, textQuery.getStatus(), new MessageActionAdapter(eventListener, textQuery, eventFactory), textQuery.getMessage()), R$layout.zui_cell_end_user_message, EndUserMessageView.class);
    }

    private static MessagingCell<AgentMessageView.State, AgentMessageView> createTextResponseCell(MessagingItem.TextResponse textResponse, MessagingCellProps messagingCellProps, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory) {
        return new MessagingCell<>(textResponse.getId(), new AgentMessageView.State(messagingCellProps, textResponse.getMessage(), textResponse.getAgentDetails().getAgentName(), textResponse.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(textResponse.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_agent_message_view, AgentMessageView.class);
    }

    private static MessagingCell<TypingIndicatorView.State, TypingIndicatorView> createTypingIndicatorCell(TypingItem typingItem, MessagingCellProps messagingCellProps, AvatarStateRenderer avatarStateRenderer, AvatarStateFactory avatarStateFactory) {
        return new MessagingCell<>(TYPING_INDICATOR_ID, new TypingIndicatorView.State(messagingCellProps, typingItem.getAgentDetails().getAgentName(), typingItem.getAgentDetails().isBot(), avatarStateFactory.createAvatarState(typingItem.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_typing_indicator, TypingIndicatorView.class);
    }

    public List<MessagingCell> createCells(List<MessagingItem> list, MessagingState.TypingState typingState, C42732iT3 c42732iT3, AttachmentSettings attachmentSettings) {
        AgentDetails agentDetails;
        if (list == null) {
            return Collections.emptyList();
        }
        List<MessagingItem> m29954c = C43505jm0.m29954c(list);
        if (typingState != null && typingState.isTyping()) {
            if (typingState.getAgentDetails() != null) {
                agentDetails = typingState.getAgentDetails();
            } else {
                agentDetails = DEFAULT_TYPING_INDICATOR_LABEL_STATE;
            }
            m29954c.add(new TypingItem(this.dateProvider.now(), TYPING_INDICATOR_ID, agentDetails));
        }
        List<MessagingCellProps> create = this.cellPropsFactory.create(m29954c);
        ArrayList arrayList = new ArrayList(m29954c.size());
        for (int i = 0; i < m29954c.size(); i++) {
            MessagingCell createCell = createCell(m29954c.get(i), create.get(i), c42732iT3, attachmentSettings, this.avatarStateRenderer, this.avatarStateFactory, this.eventListener, this.eventFactory, this.multilineResponseOptionsEnabled);
            if (createCell != null) {
                arrayList.add(createCell);
            }
        }
        return arrayList;
    }

    private static MessagingCell<ActionOptionsView.State, ActionOptionsView> createActionOptionsCell(MessagingItem.ActionResponse actionResponse, MessagingCellProps messagingCellProps, final EventListener eventListener, final EventFactory eventFactory, AvatarStateFactory avatarStateFactory, AvatarStateRenderer avatarStateRenderer) {
        ArrayList arrayList = new ArrayList();
        for (final MessagingItem.Action action : actionResponse.getActions()) {
            arrayList.add(new ActionOptionsView.ActionOptionState(action.getDisplayName(), new View.OnClickListener() { // from class: zendesk.messaging.ui.MessagingCellFactory.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EventListener.this.onEvent(eventFactory.actionOptionClick(action));
                }
            }));
        }
        return new MessagingCell<>(actionResponse.getId(), new ActionOptionsView.State(actionResponse.getMessage(), actionResponse.getAgentDetails().getAgentName(), actionResponse.getAgentDetails().isBot(), messagingCellProps, arrayList, true, avatarStateFactory.createAvatarState(actionResponse.getAgentDetails()), avatarStateRenderer), R$layout.zui_cell_action_options, ActionOptionsView.class);
    }
}
