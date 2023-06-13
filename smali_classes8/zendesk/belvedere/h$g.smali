.class public Lzendesk/belvedere/h$g;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Z

.field public final synthetic b:Lzendesk/belvedere/h;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/h;Z)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    iput-boolean p2, p0, Lzendesk/belvedere/h$g;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/belvedere/h;ZLzendesk/belvedere/h$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/belvedere/h$g;-><init>(Lzendesk/belvedere/h;Z)V

    return-void
.end method


# virtual methods
.method public final a(IFILandroid/view/View;)V
    .locals 2

    int-to-float p1, p1

    mul-float v0, p2, p1

    sub-float/2addr p1, v0

    int-to-float p3, p3

    cmpg-float v0, p1, p3

    if-gtz v0, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LEi6;->f(Landroid/view/View;Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    div-float p3, p1, p3

    sub-float/2addr v0, p3

    invoke-virtual {p4, v0}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p4, p1}, Landroid/view/View;->setY(F)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p3}, LEi6;->f(Landroid/view/View;Z)V

    :goto_0
    iget-object p1, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-static {p1, p2}, Lzendesk/belvedere/h;->o(Lzendesk/belvedere/h;F)V

    return-void
.end method

.method public layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/View;->getId()I

    move-result p1

    sget p2, LSg4;->bottom_sheet:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v1, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-static {v1}, Lzendesk/belvedere/h;->j(Lzendesk/belvedere/h;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p3}, Landroid/view/View;->getY()F

    move-result p3

    sub-float/2addr v1, p3

    iget-object p3, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-static {p3}, Lzendesk/belvedere/h;->j(Lzendesk/belvedere/h;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K()I

    move-result p3

    int-to-float p3, p3

    sub-float/2addr v1, p3

    int-to-float p3, v0

    div-float/2addr v1, p3

    iget-object p3, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-static {p3}, Lzendesk/belvedere/h;->n(Lzendesk/belvedere/h;)Landroidx/appcompat/widget/Toolbar;

    move-result-object p3

    invoke-static {p3}, Lbq6;->E(Landroid/view/View;)I

    move-result p3

    invoke-virtual {p0, v0, v1, p3, p2}, Lzendesk/belvedere/h$g;->a(IFILandroid/view/View;)V

    iget-boolean p2, p0, Lzendesk/belvedere/h$g;->a:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lzendesk/belvedere/h$g;->b:Lzendesk/belvedere/h;

    invoke-static {p2}, Lzendesk/belvedere/h;->m(Lzendesk/belvedere/h;)Lzendesk/belvedere/g;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p2, p1, v0, v1}, Lzendesk/belvedere/g;->h(IIF)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
