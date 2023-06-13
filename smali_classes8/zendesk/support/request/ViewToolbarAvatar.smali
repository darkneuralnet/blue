.class Lzendesk/support/request/ViewToolbarAvatar;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field private static final IMAGE_VIEW_IDS:[I

.field static final MAX_IMAGES:I = 0x5


# instance fields
.field private final avatarViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/ZendeskAvatarView;",
            ">;"
        }
    .end annotation
.end field

.field private imageRadius:I

.field private strokeColor:I

.field private strokeWidth:I

.field private userInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LsE3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, LPg4;->zs_request_toolbar_avatar_1:I

    aput v2, v0, v1

    const/4 v1, 0x1

    sget v2, LPg4;->zs_request_toolbar_avatar_2:I

    aput v2, v0, v1

    const/4 v1, 0x2

    sget v2, LPg4;->zs_request_toolbar_avatar_3:I

    aput v2, v0, v1

    const/4 v1, 0x3

    sget v2, LPg4;->zs_request_toolbar_avatar_4:I

    aput v2, v0, v1

    const/4 v1, 0x4

    sget v2, LPg4;->zs_request_toolbar_avatar_5:I

    aput v2, v0, v1

    sput-object v0, Lzendesk/support/request/ViewToolbarAvatar;->IMAGE_VIEW_IDS:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lzendesk/support/request/ViewToolbarAvatar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lzendesk/support/request/ViewToolbarAvatar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Ljava/util/ArrayList;

    const/4 p3, 0x5

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Lzendesk/support/request/ViewToolbarAvatar;->avatarViews:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Lzendesk/support/request/ViewToolbarAvatar;->userInfo:Ljava/util/List;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, LRf4;->zs_request_toolbar_avatar_radius:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p2

    iput p2, p0, Lzendesk/support/request/ViewToolbarAvatar;->imageRadius:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, LRf4;->zs_request_toolbar_avatar_stroke_width:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, Lzendesk/support/request/ViewToolbarAvatar;->strokeWidth:I

    sget p1, Lkf4;->colorPrimary:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    sget v0, Lzf4;->zs_request_fallback_color_primary:I

    invoke-static {p1, p2, v0}, Lzendesk/support/UiUtils;->themeAttributeToColor(ILandroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lzendesk/support/request/ViewToolbarAvatar;->strokeColor:I

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p3, :cond_0

    invoke-direct {p0, p1}, Lzendesk/support/request/ViewToolbarAvatar;->createAndAddView(I)Lzendesk/support/ZendeskAvatarView;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lzendesk/support/request/ViewToolbarAvatar;->avatarViews:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private bindData(LiT3;)V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lzendesk/support/request/ViewToolbarAvatar;->avatarViews:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lzendesk/support/request/ViewToolbarAvatar;->avatarViews:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/support/ZendeskAvatarView;

    iget-object v3, p0, Lzendesk/support/request/ViewToolbarAvatar;->userInfo:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    iget-object v3, p0, Lzendesk/support/request/ViewToolbarAvatar;->userInfo:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LsE3;

    iget-object v4, v3, LsE3;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, LlS5;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, v3, LsE3;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v3, v3, LsE3;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget v5, p0, Lzendesk/support/request/ViewToolbarAvatar;->imageRadius:I

    invoke-virtual {v2, p1, v4, v3, v5}, Lzendesk/support/ZendeskAvatarView;->showUserWithAvatarImage(LiT3;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    iget-object v3, v3, LsE3;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lzendesk/support/ZendeskAvatarView;->showUserWithName(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_1
    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private createAndAddView(I)Lzendesk/support/ZendeskAvatarView;
    .locals 3

    new-instance v0, Lzendesk/support/ZendeskAvatarView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lzendesk/support/ZendeskAvatarView;-><init>(Landroid/content/Context;)V

    sget-object v1, Lzendesk/support/request/ViewToolbarAvatar;->IMAGE_VIEW_IDS:[I

    aget v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    iget v1, p0, Lzendesk/support/request/ViewToolbarAvatar;->strokeColor:I

    iget v2, p0, Lzendesk/support/request/ViewToolbarAvatar;->strokeWidth:I

    invoke-virtual {v0, v1, v2}, Lzendesk/support/ZendeskAvatarView;->setStroke(II)V

    iget v1, p0, Lzendesk/support/request/ViewToolbarAvatar;->imageRadius:I

    mul-int/lit8 v1, v1, 0x2

    mul-int/lit8 p1, p1, 0x2

    div-int/lit8 v2, v1, 0x3

    mul-int/2addr p1, v2

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v1, 0x800005

    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method


# virtual methods
.method public setImageUrls(LiT3;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LiT3;",
            "Ljava/util/List<",
            "LsE3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p2, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lzendesk/support/request/ViewToolbarAvatar;->userInfo:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lzendesk/support/request/ViewToolbarAvatar;->userInfo:Ljava/util/List;

    :goto_0
    iget-object p2, p0, Lzendesk/support/request/ViewToolbarAvatar;->userInfo:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lzendesk/support/request/ViewToolbarAvatar;->bindData(LiT3;)V

    return-void
.end method
