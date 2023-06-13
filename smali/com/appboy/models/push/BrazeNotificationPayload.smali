.class public final Lcom/appboy/models/push/BrazeNotificationPayload;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;,
        Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;,
        Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;,
        Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;,
        Lcom/appboy/models/push/BrazeNotificationPayload$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u001e\n\u0002\u0010\t\n\u0002\u00080\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u009c\u00012\u00020\u0001:\n\u009d\u0001\u009c\u0001\u009e\u0001\u009f\u0001\u00a0\u0001B9\u0008\u0007\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\u000c\u0010\n\"\u0004\u0008\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008%\u0010\'\"\u0004\u0008(\u0010)R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010&\u001a\u0004\u0008*\u0010\'\"\u0004\u0008+\u0010)R\"\u0010,\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u0010&\u001a\u0004\u0008,\u0010\'\"\u0004\u0008-\u0010)R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u0010/\u001a\u0004\u00085\u00101\"\u0004\u00086\u00103R$\u00107\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00087\u0010/\u001a\u0004\u00088\u00101\"\u0004\u00089\u00103R$\u0010:\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010\u001f\u001a\u0004\u0008;\u0010!\"\u0004\u0008<\u0010#R$\u0010=\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010\u001f\u001a\u0004\u0008>\u0010!\"\u0004\u0008?\u0010#R$\u0010@\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010\u001f\u001a\u0004\u0008A\u0010!\"\u0004\u0008B\u0010#R$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR$\u0010J\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008J\u0010\u001f\u001a\u0004\u0008K\u0010!\"\u0004\u0008L\u0010#R\"\u0010M\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010&\u001a\u0004\u0008N\u0010\'\"\u0004\u0008O\u0010)R\"\u0010P\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008P\u0010&\u001a\u0004\u0008Q\u0010\'\"\u0004\u0008R\u0010)R$\u0010S\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010/\u001a\u0004\u0008T\u00101\"\u0004\u0008U\u00103R$\u0010V\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008V\u0010/\u001a\u0004\u0008W\u00101\"\u0004\u0008X\u00103R$\u0010Y\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010/\u001a\u0004\u0008Z\u00101\"\u0004\u0008[\u00103R$\u0010\\\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010/\u001a\u0004\u0008]\u00101\"\u0004\u0008^\u00103R$\u0010_\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008_\u0010/\u001a\u0004\u0008`\u00101\"\u0004\u0008a\u00103R$\u0010b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010/\u001a\u0004\u0008c\u00101\"\u0004\u0008d\u00103R$\u0010e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008e\u0010/\u001a\u0004\u0008f\u00101\"\u0004\u0008g\u00103R$\u0010h\u001a\u0004\u0018\u00010\u001d8G@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008h\u0010\u001f\u001a\u0004\u0008i\u0010!\"\u0004\u0008j\u0010#R$\u0010k\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008k\u0010/\u001a\u0004\u0008l\u00101\"\u0004\u0008m\u00103R$\u0010n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008n\u0010/\u001a\u0004\u0008o\u00101\"\u0004\u0008p\u00103R$\u0010q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008q\u0010/\u001a\u0004\u0008r\u00101\"\u0004\u0008s\u00103R\u001c\u0010v\u001a\u0008\u0012\u0004\u0012\u00020u0t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\"\u0010x\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008x\u0010y\u001a\u0004\u0008z\u0010{\"\u0004\u0008|\u0010}R\u001c\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020~0t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010wR&\u0010\u0080\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0080\u0001\u0010&\u001a\u0005\u0008\u0080\u0001\u0010\'\"\u0005\u0008\u0081\u0001\u0010)R\u001d\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010t8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0083\u0001\u0010wR\'\u0010\u0086\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0088\u0001\u0010/\u001a\u0005\u0008\u0089\u0001\u00101\"\u0005\u0008\u008a\u0001\u00103R,\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0005\u0008\u008c\u0001\u0010/\u001a\u0005\u0008\u008d\u0001\u00101R\u001b\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020u0\u008e\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u001b\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020~0\u008e\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u008e\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0094\u0001\u0010\u0090\u0001R$\u0010\u0099\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0005\u0012\u00030\u0085\u00010\u0096\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u00a8\u0006\u00a1\u0001"
    }
    d2 = {
        "Lcom/appboy/models/push/BrazeNotificationPayload;",
        "",
        "",
        "parsePayloadFieldsFromBundle",
        "",
        "toString",
        "Landroid/os/Bundle;",
        "notificationExtras",
        "Landroid/os/Bundle;",
        "getNotificationExtras",
        "()Landroid/os/Bundle;",
        "brazeExtras",
        "getBrazeExtras",
        "setBrazeExtras",
        "(Landroid/os/Bundle;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "setContext",
        "(Landroid/content/Context;)V",
        "LX10;",
        "configurationProvider",
        "LX10;",
        "getConfigurationProvider",
        "()LX10;",
        "setConfigurationProvider",
        "(LX10;)V",
        "",
        "pushDuration",
        "Ljava/lang/Integer;",
        "getPushDuration",
        "()Ljava/lang/Integer;",
        "setPushDuration",
        "(Ljava/lang/Integer;)V",
        "",
        "isPushStory",
        "Z",
        "()Z",
        "setPushStory",
        "(Z)V",
        "isInlineImagePush",
        "setInlineImagePush",
        "isConversationalPush",
        "setConversationalPush",
        "publicNotificationExtras",
        "Ljava/lang/String;",
        "getPublicNotificationExtras",
        "()Ljava/lang/String;",
        "setPublicNotificationExtras",
        "(Ljava/lang/String;)V",
        "notificationChannelId",
        "getNotificationChannelId",
        "setNotificationChannelId",
        "notificationCategory",
        "getNotificationCategory",
        "setNotificationCategory",
        "notificationVisibility",
        "getNotificationVisibility",
        "setNotificationVisibility",
        "notificationBadgeNumber",
        "getNotificationBadgeNumber",
        "setNotificationBadgeNumber",
        "customNotificationId",
        "getCustomNotificationId",
        "setCustomNotificationId",
        "",
        "notificationReceivedTimestampMillis",
        "Ljava/lang/Long;",
        "getNotificationReceivedTimestampMillis",
        "()Ljava/lang/Long;",
        "setNotificationReceivedTimestampMillis",
        "(Ljava/lang/Long;)V",
        "notificationPriorityInt",
        "getNotificationPriorityInt",
        "setNotificationPriorityInt",
        "shouldFetchTestTriggers",
        "getShouldFetchTestTriggers",
        "setShouldFetchTestTriggers",
        "shouldSyncGeofences",
        "getShouldSyncGeofences",
        "setShouldSyncGeofences",
        "contentCardSyncData",
        "getContentCardSyncData",
        "setContentCardSyncData",
        "contentCardSyncUserId",
        "getContentCardSyncUserId",
        "setContentCardSyncUserId",
        "titleText",
        "getTitleText",
        "setTitleText",
        "contentText",
        "getContentText",
        "setContentText",
        "largeIcon",
        "getLargeIcon",
        "setLargeIcon",
        "notificationSound",
        "getNotificationSound",
        "setNotificationSound",
        "summaryText",
        "getSummaryText",
        "setSummaryText",
        "accentColor",
        "getAccentColor",
        "setAccentColor",
        "bigSummaryText",
        "getBigSummaryText",
        "setBigSummaryText",
        "bigTitleText",
        "getBigTitleText",
        "setBigTitleText",
        "bigImageUrl",
        "getBigImageUrl",
        "setBigImageUrl",
        "",
        "Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;",
        "actionButtonsInternal",
        "Ljava/util/List;",
        "pushStoryPageIndex",
        "I",
        "getPushStoryPageIndex",
        "()I",
        "setPushStoryPageIndex",
        "(I)V",
        "Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;",
        "pushStoryPagesInternal",
        "isNewlyReceivedPushStory",
        "setNewlyReceivedPushStory",
        "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;",
        "conversationMessagesInternal",
        "",
        "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;",
        "conversationPersonMapInternal",
        "Ljava/util/Map;",
        "conversationShortcutId",
        "getConversationShortcutId",
        "setConversationShortcutId",
        "<set-?>",
        "conversationReplyPersonId",
        "getConversationReplyPersonId",
        "",
        "getActionButtons",
        "()Ljava/util/List;",
        "actionButtons",
        "getPushStoryPages",
        "pushStoryPages",
        "getConversationMessages",
        "conversationMessages",
        "",
        "getConversationPersonMap",
        "()Ljava/util/Map;",
        "conversationPersonMap",
        "<init>",
        "(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;)V",
        "Companion",
        "ActionButton",
        "ConversationMessage",
        "ConversationPerson",
        "PushStoryPage",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;


# instance fields
.field private accentColor:Ljava/lang/Integer;

.field private actionButtonsInternal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;",
            ">;"
        }
    .end annotation
.end field

.field private bigImageUrl:Ljava/lang/String;

.field private bigSummaryText:Ljava/lang/String;

.field private bigTitleText:Ljava/lang/String;

.field private brazeExtras:Landroid/os/Bundle;

.field private configurationProvider:LX10;

.field private contentCardSyncData:Ljava/lang/String;

.field private contentCardSyncUserId:Ljava/lang/String;

.field private contentText:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private final conversationMessagesInternal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final conversationPersonMapInternal:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;",
            ">;"
        }
    .end annotation
.end field

.field private conversationReplyPersonId:Ljava/lang/String;

.field private conversationShortcutId:Ljava/lang/String;

.field private customNotificationId:Ljava/lang/Integer;

.field private isConversationalPush:Z

.field private isInlineImagePush:Z

.field private isNewlyReceivedPushStory:Z

.field private isPushStory:Z

.field private largeIcon:Ljava/lang/String;

.field private notificationBadgeNumber:Ljava/lang/Integer;

.field private notificationCategory:Ljava/lang/String;

.field private notificationChannelId:Ljava/lang/String;

.field private final notificationExtras:Landroid/os/Bundle;

.field private notificationPriorityInt:Ljava/lang/Integer;

.field private notificationReceivedTimestampMillis:Ljava/lang/Long;

.field private notificationSound:Ljava/lang/String;

.field private notificationVisibility:Ljava/lang/Integer;

.field private publicNotificationExtras:Ljava/lang/String;

.field private pushDuration:Ljava/lang/Integer;

.field private pushStoryPageIndex:I

.field private pushStoryPagesInternal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;",
            ">;"
        }
    .end annotation
.end field

.field private shouldFetchTestTriggers:Z

.field private shouldSyncGeofences:Z

.field private summaryText:Ljava/lang/String;

.field private titleText:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    if-nez p2, :cond_1

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    :cond_1
    iput-object p2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->brazeExtras:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->context:Landroid/content/Context;

    iput-object p4, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->configurationProvider:LX10;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->actionButtonsInternal:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPagesInternal:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationMessagesInternal:Ljava/util/List;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationPersonMapInternal:Ljava/util/Map;

    invoke-direct {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    invoke-virtual {p2, p1}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getAttachedBrazeExtras(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/appboy/models/push/BrazeNotificationPayload;-><init>(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;)V

    return-void
.end method

.method private final parsePayloadFieldsFromBundle()V
    .locals 0

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseNotificationMetadata(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseContentCardData(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseVisibleContent(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseBigTextStyle(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseBigImageStyle(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseActionButtons(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parsePushStoryData(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->parsePayloadFieldsFromBundle$parseConversationPushData(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseActionButtons(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 5

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->actionButtonsInternal:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v4, "ab_a*_a"

    invoke-virtual {v2, v1, v3, v4}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    move v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-nez v2, :cond_2

    new-instance v2, Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;

    iget-object v3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    invoke-direct {v2, v3, v1}, Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;-><init>(Landroid/os/Bundle;I)V

    iget-object v3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->actionButtonsInternal:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseBigImageStyle(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 3

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_iu"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseNonBlankString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigImageUrl:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->brazeExtras:Landroid/os/Bundle;

    const-string v2, "appboy_image_url"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseNonBlankString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigImageUrl:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseBigTextStyle(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 3

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_bs"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigSummaryText:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_bt"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigTitleText:Ljava/lang/String;

    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseContentCardData(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 3

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_cd"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentCardSyncData:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_cd_uid"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentCardSyncUserId:Ljava/lang/String;

    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseConversationPushData(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 6

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_c_si"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationShortcutId:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_c_rpi"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationReplyPersonId:Ljava/lang/String;

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationMessagesInternal:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationPersonMapInternal:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v4, "ab_c_mt*"

    invoke-virtual {v2, v1, v3, v4}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    move v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    move v2, v3

    :goto_2
    if-nez v2, :cond_2

    new-instance v2, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;

    iget-object v3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    invoke-direct {v2, v3, v1}, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;-><init>(Landroid/os/Bundle;I)V

    iget-object v3, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationMessagesInternal:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_3
    sget-object v2, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v4, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v5, "ab_c_pi*"

    invoke-virtual {v2, v1, v4, v5}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_4

    :cond_3
    move v2, v0

    goto :goto_5

    :cond_4
    :goto_4
    move v2, v3

    :goto_5
    if-nez v2, :cond_5

    new-instance v2, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;

    iget-object v4, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    invoke-direct {v2, v4, v1}, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;-><init>(Landroid/os/Bundle;I)V

    iget-object v4, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationPersonMapInternal:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;->getPersonId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseNotificationMetadata(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 3

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "nd"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsInteger(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushDuration:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_c"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isPushStory:Z

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_ct"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationCategory:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_vs"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsInteger(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationVisibility:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_bc"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsInteger(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationBadgeNumber:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_pn"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->publicNotificationExtras:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "n"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsInteger(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->customNotificationId:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "appboy_push_received_timestamp"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseLong(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationReceivedTimestampMillis:Ljava/lang/Long;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_iip"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isInlineImagePush:Z

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_cp"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isConversationalPush:Z

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "p"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsInteger(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationPriorityInt:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_push_fetch_test_triggers_key"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsBoolean(Landroid/os/Bundle;Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->shouldFetchTestTriggers:Z

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_sync_geos"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsBoolean(Landroid/os/Bundle;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->shouldSyncGeofences:Z

    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parsePushStoryData(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 5

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "appboy_story_index"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseObjectAsInteger(Landroid/os/Bundle;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPageIndex:I

    move v0, v3

    :goto_0
    sget-object v1, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v4, "ab_c*_i"

    invoke-virtual {v1, v0, v2, v4}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getTemplateFieldAtIndex(ILandroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move v1, v3

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-nez v1, :cond_2

    new-instance v1, Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    invoke-direct {v1, v2, v0}, Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;-><init>(Landroid/os/Bundle;I)V

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPagesInternal:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v1, "appboy_story_newly_received"

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isNewlyReceivedPushStory:Z

    return-void
.end method

.method private static final parsePayloadFieldsFromBundle$parseVisibleContent(Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 3

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_nc"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseNonBlankString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationChannelId:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "t"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->titleText:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "a"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentText:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ab_li"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->largeIcon:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "sd"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationSound:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "s"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseString(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->summaryText:Ljava/lang/String;

    iget-object v1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    const-string v2, "ac"

    invoke-virtual {v0, v1, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->parseStringAsColorInt(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->accentColor:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final getAccentColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->accentColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getActionButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->actionButtonsInternal:Ljava/util/List;

    return-object v0
.end method

.method public final getBigImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBigSummaryText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigSummaryText:Ljava/lang/String;

    return-object v0
.end method

.method public final getBigTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigTitleText:Ljava/lang/String;

    return-object v0
.end method

.method public final getBrazeExtras()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->brazeExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getConfigurationProvider()LX10;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->configurationProvider:LX10;

    return-object v0
.end method

.method public final getContentCardSyncData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentCardSyncData:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentCardSyncUserId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentCardSyncUserId:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentText:Ljava/lang/String;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getConversationMessages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationMessagesInternal:Ljava/util/List;

    return-object v0
.end method

.method public final getConversationPersonMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/appboy/models/push/BrazeNotificationPayload$ConversationPerson;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationPersonMapInternal:Ljava/util/Map;

    return-object v0
.end method

.method public final getConversationReplyPersonId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationReplyPersonId:Ljava/lang/String;

    return-object v0
.end method

.method public final getConversationShortcutId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationShortcutId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomNotificationId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->customNotificationId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getLargeIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->largeIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationBadgeNumber()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationBadgeNumber:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNotificationCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationChannelId:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationExtras()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getNotificationPriorityInt()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationPriorityInt:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNotificationSound()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationSound:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationVisibility()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationVisibility:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPublicNotificationExtras()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->publicNotificationExtras:Ljava/lang/String;

    return-object v0
.end method

.method public final getPushDuration()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushDuration:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPushStoryPageIndex()I
    .locals 1

    iget v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPageIndex:I

    return v0
.end method

.method public final getPushStoryPages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appboy/models/push/BrazeNotificationPayload$PushStoryPage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPagesInternal:Ljava/util/List;

    return-object v0
.end method

.method public final getShouldFetchTestTriggers()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->shouldFetchTestTriggers:Z

    return v0
.end method

.method public final getShouldSyncGeofences()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->shouldSyncGeofences:Z

    return v0
.end method

.method public final getSummaryText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->summaryText:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->titleText:Ljava/lang/String;

    return-object v0
.end method

.method public final isConversationalPush()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isConversationalPush:Z

    return v0
.end method

.method public final isInlineImagePush()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isInlineImagePush:Z

    return v0
.end method

.method public final isNewlyReceivedPushStory()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isNewlyReceivedPushStory:Z

    return v0
.end method

.method public final isPushStory()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isPushStory:Z

    return v0
.end method

.method public final setNewlyReceivedPushStory(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isNewlyReceivedPushStory:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushDuration:Ljava/lang/Integer;

    const-string v3, "PushDuration"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isPushStory:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "IsPushStory"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isInlineImagePush:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "IsInlineImagePush"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->isConversationalPush:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "IsConversationalPush"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->publicNotificationExtras:Ljava/lang/String;

    const-string v3, "PublicNotificationExtras"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationChannelId:Ljava/lang/String;

    const-string v3, "NotificationChannelId"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationCategory:Ljava/lang/String;

    const-string v3, "NotificationCategory"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationVisibility:Ljava/lang/Integer;

    const-string v3, "NotificationVisibility"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationBadgeNumber:Ljava/lang/Integer;

    const-string v3, "NotificationBadgeNumber"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->customNotificationId:Ljava/lang/Integer;

    const-string v3, "CustomNotificationId"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationReceivedTimestampMillis:Ljava/lang/Long;

    const-string v3, "NotificationReceivedTimestampMillis"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentCardSyncData:Ljava/lang/String;

    const-string v3, "ContentCardSyncData"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentCardSyncUserId:Ljava/lang/String;

    const-string v3, "ContentCardSyncUserId"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->titleText:Ljava/lang/String;

    const-string v3, "TitleText"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->contentText:Ljava/lang/String;

    const-string v3, "ContentText"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->largeIcon:Ljava/lang/String;

    const-string v3, "LargeIcon"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->notificationSound:Ljava/lang/String;

    const-string v3, "NotificationSound"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->summaryText:Ljava/lang/String;

    const-string v3, "SummaryText"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->accentColor:Ljava/lang/Integer;

    const-string v3, "AccentColor"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigSummaryText:Ljava/lang/String;

    const-string v3, "BigSummaryText"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigTitleText:Ljava/lang/String;

    const-string v3, "BigTitleText"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->bigImageUrl:Ljava/lang/String;

    const-string v3, "BigImageUrl"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/appboy/models/push/BrazeNotificationPayload;->getActionButtons()Ljava/util/List;

    move-result-object v2

    const-string v3, "ActionButtons"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPageIndex:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "PushStoryPageIndex"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->pushStoryPagesInternal:Ljava/util/List;

    const-string v3, "PushStoryPages"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationMessagesInternal:Ljava/util/List;

    const-string v3, "ConversationMessages"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationPersonMapInternal:Ljava/util/Map;

    const-string v3, "ConversationPersonMap"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appboy/models/push/BrazeNotificationPayload;->conversationShortcutId:Ljava/lang/String;

    const-string v3, "ConversationShortcutId"

    invoke-static {v1, v3, v2}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->access$stringAndKey(Lcom/appboy/models/push/BrazeNotificationPayload$Companion;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
