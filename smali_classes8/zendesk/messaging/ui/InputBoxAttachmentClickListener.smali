.class Lzendesk/messaging/ui/InputBoxAttachmentClickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final activity:Landroidx/appcompat/app/AppCompatActivity;

.field private final belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

.field private final imageStream:Lzendesk/belvedere/b;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lzendesk/belvedere/b;Lzendesk/messaging/BelvedereMediaHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->activity:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->imageStream:Lzendesk/belvedere/b;

    iput-object p3, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {p1}, Lzendesk/belvedere/b;->D9()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->showImagePicker()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->imageStream:Lzendesk/belvedere/b;

    invoke-virtual {p1}, Lzendesk/belvedere/b;->dismiss()V

    :goto_0
    return-void
.end method

.method public showImagePicker()V
    .locals 5

    iget-object v0, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-static {v0}, Lzendesk/belvedere/BelvedereUi;->a(Landroid/content/Context;)Lzendesk/belvedere/BelvedereUi$b;

    move-result-object v0

    invoke-virtual {v0}, Lzendesk/belvedere/BelvedereUi$b;->g()Lzendesk/belvedere/BelvedereUi$b;

    move-result-object v0

    const-string v1, "*/*"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lzendesk/belvedere/BelvedereUi$b;->h(Ljava/lang/String;Z)Lzendesk/belvedere/BelvedereUi$b;

    move-result-object v0

    iget-object v1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->belvedereMediaHolder:Lzendesk/messaging/BelvedereMediaHolder;

    invoke-virtual {v1}, Lzendesk/messaging/BelvedereMediaHolder;->getSelectedMedia()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzendesk/belvedere/BelvedereUi$b;->l(Ljava/util/List;)Lzendesk/belvedere/BelvedereUi$b;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v3, 0x0

    sget v4, Lzendesk/messaging/R$id;->input_box_attachments_indicator:I

    aput v4, v1, v3

    sget v3, Lzendesk/messaging/R$id;->input_box_send_btn:I

    aput v3, v1, v2

    invoke-virtual {v0, v1}, Lzendesk/belvedere/BelvedereUi$b;->m([I)Lzendesk/belvedere/BelvedereUi$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lzendesk/belvedere/BelvedereUi$b;->j(Z)Lzendesk/belvedere/BelvedereUi$b;

    move-result-object v0

    iget-object v1, p0, Lzendesk/messaging/ui/InputBoxAttachmentClickListener;->activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {v0, v1}, Lzendesk/belvedere/BelvedereUi$b;->f(Landroidx/appcompat/app/AppCompatActivity;)V

    return-void
.end method
