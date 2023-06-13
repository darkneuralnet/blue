.class public final Lax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

.field public final b:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;


# direct methods
.method public constructor <init>(Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax;->a:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    iput-object p2, p0, Lax;->b:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lax;
    .locals 1

    if-eqz p0, :cond_0

    check-cast p0, Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    new-instance v0, Lax;

    invoke-direct {v0, p0, p0}, Lax;-><init>(Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lax;
    .locals 2

    sget v0, Lxk4;->balloon_layout_overlay:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lax;->a(Landroid/view/View;)Lax;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;
    .locals 1

    iget-object v0, p0, Lax;->a:Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lax;->b()Lcom/skydoves/balloon/overlay/BalloonAnchorOverlayView;

    move-result-object v0

    return-object v0
.end method
