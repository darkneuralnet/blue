.class final Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/messaging/ui/MessagingComposer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BelvedereMediaPickerListener"
.end annotation


# instance fields
.field private final belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

.field private final imageStream:Lzendesk/belvedere/b;

.field private final inputBox:Lzendesk/messaging/ui/InputBox;


# direct methods
.method public constructor <init>(Lzendesk/messaging/BelvedereMediaHolder;Lzendesk/messaging/ui/InputBox;Lzendesk/belvedere/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    iput-object p2, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->inputBox:Lzendesk/messaging/ui/InputBox;

    iput-object p3, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->imageStream:Lzendesk/belvedere/b;

    return-void
.end method


# virtual methods
.method public onDismissed()V
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {v0}, Lzendesk/belvedere/b;->A9()Lzendesk/belvedere/KeyboardHelper;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/belvedere/KeyboardHelper;->k()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->inputBox:Lzendesk/messaging/ui/InputBox;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_0
    return-void
.end method

.method public onMediaDeselected(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {v0, p1}, Lzendesk/messaging/BelvedereMediaHolder;->removeAll(Ljava/util/List;)V

    iget-object p1, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->inputBox:Lzendesk/messaging/ui/InputBox;

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {v0}, Lzendesk/messaging/BelvedereMediaHolder;->getSelectedMediaCount()I

    move-result v0

    invoke-virtual {p1, v0}, Lzendesk/messaging/ui/InputBox;->setAttachmentsCount(I)V

    return-void
.end method

.method public onMediaSelected(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/belvedere/MediaResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {v0, p1}, Lzendesk/messaging/BelvedereMediaHolder;->addAll(Ljava/util/List;)V

    iget-object p1, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->inputBox:Lzendesk/messaging/ui/InputBox;

    iget-object v0, p0, Lzendesk/messaging/ui/MessagingComposer$BelvedereMediaPickerListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {v0}, Lzendesk/messaging/BelvedereMediaHolder;->getSelectedMediaCount()I

    move-result v0

    invoke-virtual {p1, v0}, Lzendesk/messaging/ui/InputBox;->setAttachmentsCount(I)V

    return-void
.end method

.method public onVisible()V
    .locals 0

    return-void
.end method
