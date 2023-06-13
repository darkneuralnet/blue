.class public final Ls6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Landroid/widget/ImageView;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;

.field public final g:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final h:Landroid/widget/ImageView;

.field public final i:Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;

.field public final j:Lco/bird/android/feature/ar/view/VpsView;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/ImageView;Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;Lco/bird/android/feature/ar/view/VpsView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Ls6;->b:Landroid/widget/ImageView;

    iput-object p3, p0, Ls6;->c:Landroid/widget/TextView;

    iput-object p4, p0, Ls6;->d:Landroid/widget/ImageView;

    iput-object p5, p0, Ls6;->e:Landroid/widget/ImageView;

    iput-object p6, p0, Ls6;->f:Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;

    iput-object p7, p0, Ls6;->g:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    iput-object p8, p0, Ls6;->h:Landroid/widget/ImageView;

    iput-object p9, p0, Ls6;->i:Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;

    iput-object p10, p0, Ls6;->j:Lco/bird/android/feature/ar/view/VpsView;

    return-void
.end method

.method public static a(Landroid/view/View;)Ls6;
    .locals 13

    sget v0, LZg4;->buildingsOverlay:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, LZg4;->debug:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v0, LZg4;->inside:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    sget v0, LZg4;->outside:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    sget v0, LZg4;->parkingStatusMapBottomSheet:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;

    if-eqz v8, :cond_0

    sget v0, LZg4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v9, :cond_0

    sget v0, LZg4;->qrCodeOverlay:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v10, :cond_0

    sget v0, LZg4;->scanSurroundingsBottomSheet:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;

    if-eqz v11, :cond_0

    sget v0, LZg4;->vpsView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lco/bird/android/feature/ar/view/VpsView;

    if-eqz v12, :cond_0

    new-instance v0, Ls6;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Ls6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/ImageView;Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;Lco/bird/android/feature/ar/view/VpsView;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Landroid/view/LayoutInflater;)Ls6;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Ls6;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ls6;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Ls6;
    .locals 2

    sget v0, LUj4;->activity_vps_parking:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Ls6;->a(Landroid/view/View;)Ls6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    iget-object v0, p0, Ls6;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Ls6;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    return-object v0
.end method
