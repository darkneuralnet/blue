.class Lzendesk/messaging/MessagingEventSerializer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ARTICLE_OPENED_FORMATTER:I

.field private static final ARTICLE_SUGGESTIONS_MESSAGE:I

.field private static final DEFAULT_VISITOR_NAME:I

.field private static final MESSAGE_FAILED_TO_SEND_WARNING:I

.field private static final TRANSFER_OPTION_SELECTION_FORMATTER:I


# instance fields
.field private final context:Landroid/content/Context;

.field private final timestampFactory:Lzendesk/messaging/TimestampFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, Lzendesk/messaging/R$string;->zui_message_log_default_visitor_name:I

    sput v0, Lzendesk/messaging/MessagingEventSerializer;->DEFAULT_VISITOR_NAME:I

    sget v0, Lzendesk/messaging/R$string;->zui_message_log_article_suggestion_message:I

    sput v0, Lzendesk/messaging/MessagingEventSerializer;->ARTICLE_SUGGESTIONS_MESSAGE:I

    sget v0, Lzendesk/messaging/R$string;->zui_message_log_article_opened_formatter:I

    sput v0, Lzendesk/messaging/MessagingEventSerializer;->ARTICLE_OPENED_FORMATTER:I

    sget v0, Lzendesk/messaging/R$string;->zui_message_log_transfer_option_selection_formatter:I

    sput v0, Lzendesk/messaging/MessagingEventSerializer;->TRANSFER_OPTION_SELECTION_FORMATTER:I

    sget v0, Lzendesk/messaging/R$string;->zui_message_log_message_failed_to_send:I

    sput v0, Lzendesk/messaging/MessagingEventSerializer;->MESSAGE_FAILED_TO_SEND_WARNING:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lzendesk/messaging/TimestampFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingEventSerializer;->context:Landroid/content/Context;

    iput-object p2, p0, Lzendesk/messaging/MessagingEventSerializer;->timestampFactory:Lzendesk/messaging/TimestampFactory;

    return-void
.end method
