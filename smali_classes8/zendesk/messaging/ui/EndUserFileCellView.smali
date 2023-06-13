.class public Lzendesk/messaging/ui/EndUserFileCellView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lzendesk/messaging/ui/Updatable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Lzendesk/messaging/ui/Updatable<",
        "Lzendesk/messaging/ui/EndUserCellFileState;",
        ">;"
    }
.end annotation


# instance fields
.field private appIcon:Landroid/widget/ImageView;

.field private bubble:Landroid/widget/LinearLayout;

.field private defaultAppIcon:Landroid/graphics/drawable/Drawable;

.field private fileDescriptor:Landroid/widget/TextView;

.field private fileName:Landroid/widget/TextView;

.field private fileUploadProgressView:Lzendesk/messaging/ui/FileUploadProgressView;

.field private label:Landroid/widget/TextView;

.field private statusView:Lzendesk/messaging/ui/MessageStatusView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Lzendesk/messaging/ui/EndUserFileCellView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lzendesk/messaging/ui/EndUserFileCellView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-direct {p0}, Lzendesk/messaging/ui/EndUserFileCellView;->init()V

    return-void
.end method

.method private init()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const v0, 0x800055

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lzendesk/messaging/R$layout;->zui_view_end_user_file_cell_content:I

    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onFinishInflate()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    sget v0, Lzendesk/messaging/R$id;->zui_cell_file_container:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->bubble:Landroid/widget/LinearLayout;

    sget v0, Lzendesk/messaging/R$id;->zui_file_cell_name:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->fileName:Landroid/widget/TextView;

    sget v0, Lzendesk/messaging/R$id;->zui_cell_file_description:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->fileDescriptor:Landroid/widget/TextView;

    sget v0, Lzendesk/messaging/R$id;->zui_cell_file_app_icon:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->appIcon:Landroid/widget/ImageView;

    sget v0, Lzendesk/messaging/R$id;->zui_cell_file_upload_progress:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/ui/FileUploadProgressView;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->fileUploadProgressView:Lzendesk/messaging/ui/FileUploadProgressView;

    sget v0, Lzendesk/messaging/R$id;->zui_cell_status_view:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/ui/MessageStatusView;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->statusView:Lzendesk/messaging/ui/MessageStatusView;

    sget v0, Lzendesk/messaging/R$id;->zui_cell_label_message:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->label:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lzendesk/messaging/R$drawable;->zui_ic_insert_drive_file:I

    invoke-static {v0, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->defaultAppIcon:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    sget v0, Lzendesk/messaging/R$attr;->colorPrimary:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lzendesk/messaging/R$color;->zui_color_primary:I

    invoke-static {v0, v1, v2}, LAd6;->e(ILandroid/content/Context;I)I

    move-result v0

    iget-object v1, p0, Lzendesk/messaging/ui/EndUserFileCellView;->defaultAppIcon:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lzendesk/messaging/ui/EndUserFileCellView;->appIcon:Landroid/widget/ImageView;

    invoke-static {v0, v1, v2}, LAd6;->c(ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic update(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/messaging/ui/EndUserCellFileState;

    invoke-virtual {p0, p1}, Lzendesk/messaging/ui/EndUserFileCellView;->update(Lzendesk/messaging/ui/EndUserCellFileState;)V

    return-void
.end method

.method public update(Lzendesk/messaging/ui/EndUserCellFileState;)V
    .locals 2

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->bubble:Landroid/widget/LinearLayout;

    invoke-static {p1, v0}, Lzendesk/messaging/ui/UtilsEndUserCellView;->setCellBackground(Lzendesk/messaging/ui/EndUserCellBaseState;Landroid/view/View;)V

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->label:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lzendesk/messaging/ui/UtilsEndUserCellView;->setLabelErrorMessage(Lzendesk/messaging/ui/EndUserCellBaseState;Landroid/widget/TextView;Landroid/content/Context;)V

    invoke-static {p1, p0}, Lzendesk/messaging/ui/UtilsEndUserCellView;->setClickListener(Lzendesk/messaging/ui/EndUserCellBaseState;Landroid/view/View;)V

    invoke-static {p1, p0}, Lzendesk/messaging/ui/UtilsEndUserCellView;->setLongClickListener(Lzendesk/messaging/ui/EndUserCellBaseState;Landroid/view/View;)V

    iget-object v0, p0, Lzendesk/messaging/ui/EndUserFileCellView;->statusView:Lzendesk/messaging/ui/MessageStatusView;

    invoke-virtual {p1}, Lzendesk/messaging/ui/EndUserCellBaseState;->getStatus()Lzendesk/messaging/MessagingItem$Query$Status;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzendesk/messaging/ui/MessageStatusView;->setStatus(Lzendesk/messaging/MessagingItem$Query$Status;)V

    invoke-virtual {p1}, Lzendesk/messaging/ui/EndUserCellFileState;->getAttachment()Lzendesk/messaging/Attachment;

    const/4 p1, 0x0

    throw p1
.end method
