package com.appboy.models.push;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.networking.FraudDetectionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C42130hS3;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b0\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u000b\b\u0007\u0018\u0000 \u009c\u00012\u00020\u0001:\n\u009d\u0001\u009c\u0001\u009e\u0001\u009f\u0001 \u0001B9\b\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010,\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R$\u00107\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010:\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R$\u0010=\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R$\u0010@\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001f\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010!\"\u0004\bL\u0010#R\"\u0010M\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010&\u001a\u0004\bN\u0010'\"\u0004\bO\u0010)R\"\u0010P\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010&\u001a\u0004\bQ\u0010'\"\u0004\bR\u0010)R$\u0010S\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010/\u001a\u0004\bT\u00101\"\u0004\bU\u00103R$\u0010V\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010/\u001a\u0004\bW\u00101\"\u0004\bX\u00103R$\u0010Y\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010/\u001a\u0004\bZ\u00101\"\u0004\b[\u00103R$\u0010\\\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010/\u001a\u0004\b]\u00101\"\u0004\b^\u00103R$\u0010_\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010/\u001a\u0004\b`\u00101\"\u0004\ba\u00103R$\u0010b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010/\u001a\u0004\bc\u00101\"\u0004\bd\u00103R$\u0010e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010/\u001a\u0004\bf\u00101\"\u0004\bg\u00103R$\u0010h\u001a\u0004\u0018\u00010\u001d8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010\u001f\u001a\u0004\bi\u0010!\"\u0004\bj\u0010#R$\u0010k\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010/\u001a\u0004\bl\u00101\"\u0004\bm\u00103R$\u0010n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010/\u001a\u0004\bo\u00101\"\u0004\bp\u00103R$\u0010q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010/\u001a\u0004\br\u00101\"\u0004\bs\u00103R\u001c\u0010v\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\"\u0010x\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001c\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010wR&\u0010\u0080\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010&\u001a\u0005\b\u0080\u0001\u0010'\"\u0005\b\u0081\u0001\u0010)R\u001d\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010wR'\u0010\u0086\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010/\u001a\u0005\b\u0089\u0001\u00101\"\u0005\b\u008a\u0001\u00103R,\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010/\u001a\u0005\b\u008d\u0001\u00101R\u001b\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020u0\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020~0\u008e\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u008e\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0090\u0001R$\u0010\u0099\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0005\u0012\u00030\u0085\u00010\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006¡\u0001"}, m28432d2 = {"Lcom/appboy/models/push/BrazeNotificationPayload;", "", "", "parsePayloadFieldsFromBundle", "", "toString", "Landroid/os/Bundle;", "notificationExtras", "Landroid/os/Bundle;", "getNotificationExtras", "()Landroid/os/Bundle;", "brazeExtras", "getBrazeExtras", "setBrazeExtras", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "LX10;", "configurationProvider", "LX10;", "getConfigurationProvider", "()LX10;", "setConfigurationProvider", "(LX10;)V", "", "pushDuration", "Ljava/lang/Integer;", "getPushDuration", "()Ljava/lang/Integer;", "setPushDuration", "(Ljava/lang/Integer;)V", "", "isPushStory", "Z", "()Z", "setPushStory", "(Z)V", "isInlineImagePush", "setInlineImagePush", "isConversationalPush", "setConversationalPush", "publicNotificationExtras", "Ljava/lang/String;", "getPublicNotificationExtras", "()Ljava/lang/String;", "setPublicNotificationExtras", "(Ljava/lang/String;)V", "notificationChannelId", "getNotificationChannelId", "setNotificationChannelId", "notificationCategory", "getNotificationCategory", "setNotificationCategory", "notificationVisibility", "getNotificationVisibility", "setNotificationVisibility", "notificationBadgeNumber", "getNotificationBadgeNumber", "setNotificationBadgeNumber", "customNotificationId", "getCustomNotificationId", "setCustomNotificationId", "", "notificationReceivedTimestampMillis", "Ljava/lang/Long;", "getNotificationReceivedTimestampMillis", "()Ljava/lang/Long;", "setNotificationReceivedTimestampMillis", "(Ljava/lang/Long;)V", "notificationPriorityInt", "getNotificationPriorityInt", "setNotificationPriorityInt", "shouldFetchTestTriggers", "getShouldFetchTestTriggers", "setShouldFetchTestTriggers", "shouldSyncGeofences", "getShouldSyncGeofences", "setShouldSyncGeofences", "contentCardSyncData", "getContentCardSyncData", "setContentCardSyncData", "contentCardSyncUserId", "getContentCardSyncUserId", "setContentCardSyncUserId", "titleText", "getTitleText", "setTitleText", "contentText", "getContentText", "setContentText", "largeIcon", "getLargeIcon", "setLargeIcon", "notificationSound", "getNotificationSound", "setNotificationSound", "summaryText", "getSummaryText", "setSummaryText", "accentColor", "getAccentColor", "setAccentColor", "bigSummaryText", "getBigSummaryText", "setBigSummaryText", "bigTitleText", "getBigTitleText", "setBigTitleText", "bigImageUrl", "getBigImageUrl", "setBigImageUrl", "", "Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;", "actionButtonsInternal", "Ljava/util/List;", "pushStoryPageIndex", "I", "getPushStoryPageIndex", "()I", "setPushStoryPageIndex", "(I)V", "Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPagesInternal", "isNewlyReceivedPushStory", "setNewlyReceivedPushStory", "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;", "conversationMessagesInternal", "", "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;", "conversationPersonMapInternal", "Ljava/util/Map;", "conversationShortcutId", "getConversationShortcutId", "setConversationShortcutId", "<set-?>", "conversationReplyPersonId", "getConversationReplyPersonId", "", "getActionButtons", "()Ljava/util/List;", "actionButtons", "getPushStoryPages", "pushStoryPages", "getConversationMessages", "conversationMessages", "", "getConversationPersonMap", "()Ljava/util/Map;", "conversationPersonMap", "<init>", "(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;)V", "Companion", "ActionButton", "ConversationMessage", "ConversationPerson", "PushStoryPage", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion(null);
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private X10 configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushStory;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private boolean shouldFetchTestTriggers;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006$"}, m28432d2 = {"Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;", "", "Landroid/os/Bundle;", "destination", "", "putIntoBundle", "", "toString", "", "actionIndex", "I", "getActionIndex", "()I", "setActionIndex", "(I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "actionId", "getActionId", "setActionId", "uri", "getUri", "setUri", "useWebview", "getUseWebview", "setUseWebview", Entry.TYPE_TEXT, "getText", "setText", "notificationExtras", "<init>", "(Landroid/os/Bundle;I)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle notificationExtras, int i) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_a*_a");
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_id");
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_uri");
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_use_webview");
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_a*_t");
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final void putIntoBundle(Bundle destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            destination.putInt("appboy_action_index", this.actionIndex);
            destination.putString("appboy_action_type", this.type);
            destination.putString("appboy_action_id", this.actionId);
            destination.putString("appboy_action_uri", this.uri);
            destination.putString("appboy_action_use_webview", this.useWebview);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("Type", this.type));
            sb.append(companion.stringAndKey(JsonDocumentFields.POLICY_ID, this.actionId));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            sb.append(companion.stringAndKey("Text", this.text));
            return sb.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J,\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0007J(\u0010\f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000fH\u0007J(\u0010\f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0010H\u0007J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J!\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J!\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¨\u0006\u001f"}, m28432d2 = {"Lcom/appboy/models/push/BrazeNotificationPayload$Companion;", "", "", "prefix", "value", "stringAndKey", "Landroid/os/Bundle;", "notificationExtras", "getAttachedBrazeExtras", "", "index", "actionFieldKeyTemplate", "getTemplateFieldAtIndex", "defaultValue", "actionIndex", "", "", "getPushStoryGravityAtIndex", "bundle", "key", "parseStringAsInteger", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "parseObjectAsInteger", "parseStringAsBoolean", "parseLong", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseString", "parseStringAsColorInt", "parseNonBlankString", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Companion {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$a */
        /* loaded from: classes.dex */
        public static final class C16954a extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C16954a f68639b = new C16954a();

            public C16954a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field boolean. Returning default.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$b */
        /* loaded from: classes.dex */
        public static final class C16955b extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C16955b f68640b = new C16955b();

            public C16955b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field long. Returning default.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$c */
        /* loaded from: classes.dex */
        public static final class C16956c extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68641b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68642c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16956c(String str, Bundle bundle) {
                super(0);
                this.f68641b = str;
                this.f68642c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse long with key " + this.f68641b + " and bundle: " + this.f68642c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$d */
        /* loaded from: classes.dex */
        public static final class C16957d extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68643b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68644c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16957d(String str, Bundle bundle) {
                super(0);
                this.f68643b = str;
                this.f68644c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse non blank string with key " + this.f68643b + " and bundle: " + this.f68644c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$e */
        /* loaded from: classes.dex */
        public static final class C16958e extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68645b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68646c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16958e(String str, Bundle bundle) {
                super(0);
                this.f68645b = str;
                this.f68646c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.f68645b + " and bundle: " + this.f68646c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$f */
        /* loaded from: classes.dex */
        public static final class C16959f extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68647b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68648c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16959f(String str, Bundle bundle) {
                super(0);
                this.f68647b = str;
                this.f68648c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string with key " + this.f68647b + " and bundle: " + this.f68648c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$g */
        /* loaded from: classes.dex */
        public static final class C16960g extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68649b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68650c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16960g(String str, Bundle bundle) {
                super(0);
                this.f68649b = str;
                this.f68650c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as boolean with key " + this.f68649b + " and bundle: " + this.f68650c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$h */
        /* loaded from: classes.dex */
        public static final class C16961h extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68651b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68652c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16961h(String str, Bundle bundle) {
                super(0);
                this.f68651b = str;
                this.f68652c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as color int with key " + this.f68651b + " and bundle: " + this.f68652c;
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$i */
        /* loaded from: classes.dex */
        public static final class C16962i extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ String f68653b;

            /* renamed from: c */
            final /* synthetic */ Bundle f68654c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16962i(String str, Bundle bundle) {
                super(0);
                this.f68653b = str;
                this.f68654c = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.f68653b + " and bundle: " + this.f68654c;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            if (obj != null) {
                return '\n' + str + " = " + obj;
            }
            return "";
        }

        @JvmStatic
        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey("appboy_story_newly_received") && !bundle.getBoolean("appboy_story_newly_received")) {
                Bundle bundle2 = bundle.getBundle("extra");
                if (bundle2 == null) {
                    return new Bundle();
                }
                return bundle2;
            } else if (C36977Wy0.m77599a()) {
                return new Bundle(bundle);
            } else {
                Object obj = bundle.get("extra");
                if (obj instanceof String) {
                    return C31696Aj2.m115346m((String) obj);
                }
                if (obj instanceof Bundle) {
                    return (Bundle) obj;
                }
                return new Bundle();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getPushStoryGravityAtIndex(int i, Bundle notificationExtras, String actionFieldKeyTemplate) {
            String replace$default;
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            replace$default = StringsKt__StringsJVMKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(i), false, 4, (Object) null);
            String string = notificationExtras.getString(replace$default);
            if (string != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(string);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        int hashCode = string.hashCode();
                        if (hashCode != -1364013995) {
                            if (hashCode != 100571) {
                                if (hashCode == 109757538 && string.equals("start")) {
                                    return 8388611;
                                }
                            } else if (string.equals("end")) {
                                return 8388613;
                            }
                        } else {
                            string.equals("center");
                        }
                    }
                    return 17;
                }
            }
            z = true;
            if (!z) {
            }
            return 17;
        }

        @JvmStatic
        public final String getTemplateFieldAtIndex(int i, Bundle notificationExtras, String actionFieldKeyTemplate) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(i, notificationExtras, actionFieldKeyTemplate, "");
        }

        @JvmStatic
        public final Long parseLong(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return Long.valueOf(bundle.getLong(key));
                }
                return null;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16956c(key, bundle), 7, null);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String parseNonBlankString(Bundle bundle, String key) {
            boolean z;
            boolean isBlank;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                String parseString = parseString(bundle, key);
                if (parseString != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(parseString);
                    if (!isBlank) {
                        z = false;
                        if (z) {
                            return parseString;
                        }
                        return null;
                    }
                }
                z = true;
                if (z) {
                }
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16957d(key, bundle), 7, null);
                return null;
            }
        }

        @JvmStatic
        public final int parseObjectAsInteger(Bundle bundle, String key, int i) {
            Object obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key) && (obj = bundle.get(key)) != null) {
                    return Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16958e(key, bundle), 7, null);
            }
            return i;
        }

        @JvmStatic
        public final String parseString(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key)) {
                    return bundle.getString(key);
                }
                return null;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16959f(key, bundle), 7, null);
                return null;
            }
        }

        @JvmStatic
        public final boolean parseStringAsBoolean(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key) && (string = bundle.getString(key)) != null) {
                    return Boolean.parseBoolean(string);
                }
                return false;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16960g(key, bundle), 7, null);
                return false;
            }
        }

        @JvmStatic
        public final Integer parseStringAsColorInt(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key) && (string = bundle.getString(key)) != null) {
                    return Integer.valueOf((int) Long.parseLong(string));
                }
                return null;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16961h(key, bundle), 7, null);
                return null;
            }
        }

        @JvmStatic
        public final Integer parseStringAsInteger(Bundle bundle, String key) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            try {
                if (bundle.containsKey(key) && (string = bundle.getString(key)) != null) {
                    return Integer.valueOf(Integer.parseInt(string));
                }
                return null;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16962i(key, bundle), 7, null);
                return null;
            }
        }

        private Companion() {
        }

        @JvmStatic
        public final String getTemplateFieldAtIndex(int i, Bundle notificationExtras, String actionFieldKeyTemplate, String str) {
            String replace$default;
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            replace$default = StringsKt__StringsJVMKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(i), false, 4, (Object) null);
            String string = notificationExtras.getString(replace$default);
            return string == null ? str : string;
        }

        @JvmStatic
        public final boolean getTemplateFieldAtIndex(int i, Bundle notificationExtras, String actionFieldKeyTemplate, boolean z) {
            String replace$default;
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            replace$default = StringsKt__StringsJVMKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(i), false, 4, (Object) null);
            String string = notificationExtras.getString(replace$default);
            if (string == null) {
                return z;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C16954a.f68639b, 4, null);
                return z;
            }
        }

        @JvmStatic
        public final long getTemplateFieldAtIndex(int i, Bundle notificationExtras, String actionFieldKeyTemplate, long j) {
            String replace$default;
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(actionFieldKeyTemplate, "actionFieldKeyTemplate");
            replace$default = StringsKt__StringsJVMKt.replace$default(actionFieldKeyTemplate, "*", String.valueOf(i), false, 4, (Object) null);
            String string = notificationExtras.getString(replace$default);
            if (string == null) {
                return j;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C16955b.f68640b, 4, null);
                return j;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\bH\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;", "", "notificationExtras", "Landroid/os/Bundle;", "index", "", "(Landroid/os/Bundle;I)V", "message", "", "getMessage", "()Ljava/lang/String;", "personId", "getPersonId", FraudDetectionData.KEY_TIMESTAMP, "", "getTimestamp", "()J", "toString", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* loaded from: classes.dex */
    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle notificationExtras, int i) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_mt*");
            this.timestamp = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_mw*", 0L);
            this.personId = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_mp*");
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("Message", this.message));
            sb.append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)));
            sb.append(companion.stringAndKey("PersonId", this.personId));
            return sb.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m28432d2 = {"Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;", "", "", "toString", "personId", "Ljava/lang/String;", "getPersonId", "()Ljava/lang/String;", "name", "getName", "uri", "getUri", "", "isImportant", "Z", "()Z", "isBot", "LhS3;", "getPerson", "()LhS3;", "person", "Landroid/os/Bundle;", "notificationExtras", "", "index", "<init>", "(Landroid/os/Bundle;I)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle notificationExtras, int i) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_pi*");
            this.name = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_pn*");
            this.uri = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_pu*", (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_pt*", false);
            this.isBot = companion.getTemplateFieldAtIndex(i, notificationExtras, "ab_c_pb*", false);
        }

        public final C42130hS3 getPerson() {
            C42130hS3 m36373a = new C42130hS3.C22663b().m36369e(this.personId).m36368f(this.name).m36367g(this.uri).m36372b(this.isBot).m36370d(this.isImportant).m36373a();
            Intrinsics.checkNotNullExpressionValue(m36373a, "Builder()\n              …\n                .build()");
            return m36373a;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("PersonId", this.personId));
            sb.append(companion.stringAndKey("Name", this.name));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)));
            sb.append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot)));
            return sb.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0012R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0012¨\u0006,"}, m28432d2 = {"Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;", "", "", "toString", "", "actionIndex", "I", "getActionIndex", "()I", "setActionIndex", "(I)V", "campaignId", "Ljava/lang/String;", "getCampaignId", "()Ljava/lang/String;", "title", "getTitle", "setTitle", "(Ljava/lang/String;)V", "titleGravity", "getTitleGravity", "setTitleGravity", "subtitle", "getSubtitle", "setSubtitle", "subtitleGravity", "getSubtitleGravity", "setSubtitleGravity", "bitmapUrl", "getBitmapUrl", "setBitmapUrl", "storyPageId", "getStoryPageId", "setStoryPageId", "deeplink", "getDeeplink", "setDeeplink", "useWebview", "getUseWebview", "setUseWebview", "Landroid/os/Bundle;", "notificationExtras", "<init>", "(Landroid/os/Bundle;I)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle notificationExtras, int i) {
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(notificationExtras, "cid");
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_t");
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, "ab_c*_t_j");
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_st");
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, notificationExtras, "ab_c*_st_j");
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_i");
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_id", "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_uri");
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, notificationExtras, "ab_c*_use_webview");
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("CampaignId", this.campaignId));
            sb.append(companion.stringAndKey("Title", this.title));
            sb.append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity)));
            sb.append(companion.stringAndKey("Subtitle", this.subtitle));
            sb.append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity)));
            sb.append(companion.stringAndKey("BitmapUrl", this.bitmapUrl));
            sb.append(companion.stringAndKey("StoryPageId", this.storyPageId));
            sb.append(companion.stringAndKey("Deeplink", this.deeplink));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            return sb.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, X10 x10) {
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.context = context;
        this.configurationProvider = x10;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[LOOP:0: B:3:0x0007->B:11:0x001f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        boolean isBlank;
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, "ab_a*_a");
            if (templateFieldAtIndex != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(templateFieldAtIndex);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i));
                        i++;
                    } else {
                        return;
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        boolean isBlank;
        Companion companion = Companion;
        String parseNonBlankString = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, "ab_iu");
        brazeNotificationPayload.bigImageUrl = parseNonBlankString;
        if (parseNonBlankString != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(parseNonBlankString);
            if (!isBlank) {
                z = false;
                if (!z) {
                    brazeNotificationPayload.bigImageUrl = companion.parseNonBlankString(brazeNotificationPayload.brazeExtras, "appboy_image_url");
                    return;
                }
                return;
            }
        }
        z = true;
        if (!z) {
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_bs");
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_bt");
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_cd");
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_cd_uid");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[LOOP:0: B:3:0x0022->B:11:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[LOOP:1: B:13:0x004b->B:21:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[EDGE_INSN: B:23:0x004a->B:12:0x004a ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        boolean z2;
        boolean isBlank;
        boolean isBlank2;
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_c_si");
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_c_rpi");
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, "ab_c_mt*");
            if (templateFieldAtIndex != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(templateFieldAtIndex);
                if (!isBlank2) {
                    z = false;
                    if (!z) {
                        break;
                    }
                    brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i));
                    i++;
                }
            }
            z = true;
            if (!z) {
            }
        }
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, "ab_c_pi*");
            if (templateFieldAtIndex2 != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(templateFieldAtIndex2);
                if (!isBlank) {
                    z2 = false;
                    if (z2) {
                        ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i2);
                        brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            z2 = true;
            if (z2) {
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "nd");
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey("ab_c");
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_ct");
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "ab_vs");
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "ab_bc");
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_pn");
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "n");
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, "appboy_push_received_timestamp");
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey("ab_iip");
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey("ab_cp");
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "p");
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_push_fetch_test_triggers_key");
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_sync_geos");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[LOOP:0: B:3:0x000e->B:11:0x0026, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        boolean isBlank;
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, "appboy_story_index", 0);
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, "ab_c*_i");
            if (templateFieldAtIndex != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(templateFieldAtIndex);
                if (!isBlank) {
                    z = false;
                    if (z) {
                        brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i));
                        i++;
                    } else {
                        brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean("appboy_story_newly_received", false);
                        return;
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, "ab_nc");
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, "t");
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, C17296a.f69688o);
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_li");
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, "sd");
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, "s");
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, "ac");
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final X10 getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final void setNewlyReceivedPushStory(boolean z) {
        this.isNewlyReceivedPushStory = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Companion companion = Companion;
        sb.append(companion.stringAndKey("PushDuration", this.pushDuration));
        sb.append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory)));
        sb.append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush)));
        sb.append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush)));
        sb.append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras));
        sb.append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId));
        sb.append(companion.stringAndKey("NotificationCategory", this.notificationCategory));
        sb.append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility));
        sb.append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber));
        sb.append(companion.stringAndKey("CustomNotificationId", this.customNotificationId));
        sb.append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis));
        sb.append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData));
        sb.append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId));
        sb.append(companion.stringAndKey("TitleText", this.titleText));
        sb.append(companion.stringAndKey("ContentText", this.contentText));
        sb.append(companion.stringAndKey("LargeIcon", this.largeIcon));
        sb.append(companion.stringAndKey("NotificationSound", this.notificationSound));
        sb.append(companion.stringAndKey("SummaryText", this.summaryText));
        sb.append(companion.stringAndKey("AccentColor", this.accentColor));
        sb.append(companion.stringAndKey("BigSummaryText", this.bigSummaryText));
        sb.append(companion.stringAndKey("BigTitleText", this.bigTitleText));
        sb.append(companion.stringAndKey("BigImageUrl", this.bigImageUrl));
        sb.append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex)));
        sb.append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal));
        sb.append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal));
        sb.append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal));
        sb.append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb.toString();
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, X10 x10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i & 2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (i & 4) != 0 ? null : context, (i & 8) != 0 ? null : x10);
    }
}
