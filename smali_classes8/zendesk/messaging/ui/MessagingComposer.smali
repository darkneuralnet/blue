.class public Lzendesk/messaging/ui/MessagingComposer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;
    }
.end annotation


# static fields
.field static final DEFAULT_HINT:I


# instance fields
.field private final activity:Landroidx/appcompat/app/AppCompatActivity;

.field private final belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

.field private belvedereMediaPickerListener:Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;

.field private final imageStream:Lzendesk/belvedere/b;

.field private final inputBoxAttachmentClickListener:Lzendesk/messaging/ui/InputBoxAttachmentClickListener;

.field private final inputBoxConsumer:Lzendesk/messaging/ui/InputBoxConsumer;

.field private final typingEventDispatcher:Lzendesk/messaging/TypingEventDispatcher;

.field private final viewModel:Lzendesk/messaging/MessagingViewModel;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, Lzendesk/messaging/R$string;->zui_hint_type_message:I

    sput v0, Lzendesk/messaging/ui/MessagingComposer;->DEFAULT_HINT:I

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/messaging/MessagingViewModel;Lzendesk/belvedere/b;Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/ui/InputBoxConsumer;Lzendesk/messaging/ui/InputBoxAttachmentClickListener;Lzendesk/messaging/TypingEventDispatcher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/MessagingComposer;->activity:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lzendesk/messaging/ui/MessagingComposer;->viewModel:Lzendesk/messaging/MessagingViewModel;

    iput-object p3, p0, Lzendesk/messaging/ui/MessagingComposer;->imageStream:Lzendesk/belvedere/b;

    iput-object p4, p0, Lzendesk/messaging/ui/MessagingComposer;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    iput-object p5, p0, Lzendesk/messaging/ui/MessagingComposer;->inputBoxConsumer:Lzendesk/messaging/ui/InputBoxConsumer;

    iput-object p6, p0, Lzendesk/messaging/ui/MessagingComposer;->inputBoxAttachmentClickListener:Lzendesk/messaging/ui/InputBoxAttachmentClickListener;

    iput-object p7, p0, Lzendesk/messaging/ui/MessagingComposer;->typingEventDispatcher:Lzendesk/messaging/TypingEventDispatcher;

    return-void
.end method

.method public static synthetic access$000(Lzendesk/messaging/ui/MessagingComposer;)Lzendesk/messaging/TypingEventDispatcher;
    .locals 0

    iget-object p0, p0, Lzendesk/messaging/ui/MessagingComposer;->typingEventDispatcher:Lzendesk/messaging/TypingEventDispatcher;

    return-object p0
.end method


# virtual methods
.method public bind(Lzendesk/messaging/ui/InputBox;)V
    .locals 3

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer;->inputBoxConsumer:Lzendesk/messaging/ui/InputBoxConsumer;

    invoke-virtual {p1, v0}, Lzendesk/messaging/ui/InputBox;->setInputTextConsumer(Lzendesk/messaging/ui/InputBox$InputTextConsumer;)V

    new-instance v0, Lzendesk/messaging/ui/MessagingComposer$1;

    invoke-direct {v0, p0}, Lzendesk/messaging/ui/MessagingComposer$1;-><init>(Lzendesk/messaging/ui/MessagingComposer;)V

    invoke-virtual {p1, v0}, Lzendesk/messaging/ui/InputBox;->setInputTextWatcher(Landroid/text/TextWatcher;)V

    new-instance v0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;

    iget-object v1, p0, Lzendesk/messaging/ui/MessagingComposer;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    iget-object v2, p0, Lzendesk/messaging/ui/MessagingComposer;->imageStream:Lzendesk/belvedere/b;

    invoke-direct {v0, v1, p1, v2}, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;-><init>(Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/ui/InputBox;Lzendesk/belvedere/b;)V

    iput-object v0, p0, Lzendesk/messaging/ui/MessagingComposer;->belvedereMediaPickerListener:Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;

    iget-object v1, p0, Lzendesk/messaging/ui/MessagingComposer;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {v1, v0}, Lzendesk/belvedere/b;->N6(Lzendesk/belvedere/b$b;)V

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer;->viewModel:Lzendesk/messaging/MessagingViewModel;

    invoke-virtual {v0}, Lzendesk/messaging/MessagingViewModel;->getLiveMessagingState()Landroidx/lifecycle/LiveData;

    move-result-object v0

    iget-object v1, p0, Lzendesk/messaging/ui/MessagingComposer;->activity:Landroidx/appcompat/app/AppCompatActivity;

    new-instance v2, Lzendesk/messaging/ui/MessagingComposer$2;

    invoke-direct {v2, p0, p1}, Lzendesk/messaging/ui/MessagingComposer$2;-><init>(Lzendesk/messaging/ui/MessagingComposer;Lzendesk/messaging/ui/InputBox;)V

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/LiveData;->observe(LLifecycleOwner;Lfe3;)V

    return-void
.end method

.method public renderState(Lzendesk/messaging/ui/MessagingState;Lzendesk/messaging/ui/InputBox;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object v0, p1, Lzendesk/messaging/ui/MessagingState;->hint:Ljava/lang/String;

    invoke-static {v0}, LlS5;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lzendesk/messaging/ui/MessagingState;->hint:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer;->activity:Landroidx/appcompat/app/AppCompatActivity;

    sget v1, Lzendesk/messaging/ui/MessagingComposer;->DEFAULT_HINT:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lzendesk/messaging/ui/InputBox;->setHint(Ljava/lang/String;)V

    iget-boolean v0, p1, Lzendesk/messaging/ui/MessagingState;->enabled:Z

    invoke-virtual {p2, v0}, Lzendesk/messaging/ui/InputBox;->setEnabled(Z)V

    iget v0, p1, Lzendesk/messaging/ui/MessagingState;->keyboardInputType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lzendesk/messaging/ui/InputBox;->setInputType(Ljava/lang/Integer;)V

    iget-object p1, p1, Lzendesk/messaging/ui/MessagingState;->attachmentSettings:Lzendesk/messaging/AttachmentSettings;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lzendesk/messaging/AttachmentSettings;->isSendingEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lzendesk/messaging/ui/MessagingComposer;->inputBoxAttachmentClickListener:Lzendesk/messaging/ui/InputBoxAttachmentClickListener;

    invoke-virtual {p2, p1}, Lzendesk/messaging/ui/InputBox;->setAttachmentsIndicatorClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lzendesk/messaging/ui/MessagingComposer;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {p1}, Lzendesk/messaging/BelvedereMediaHolder;->getSelectedMediaCount()I

    move-result p1

    invoke-virtual {p2, p1}, Lzendesk/messaging/ui/InputBox;->setAttachmentsCount(I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lzendesk/messaging/ui/InputBox;->setAttachmentsIndicatorClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_1
    return-void
.end method
