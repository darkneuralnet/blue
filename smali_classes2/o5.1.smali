.class public final Lo5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/RelativeLayout;

.field public final b:Lco/bird/android/app/feature/communitymode/widget/OptionsView;

.field public final c:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final d:Lco/bird/android/app/feature/reportcomplaint/ReportView;

.field public final e:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/widget/RelativeLayout;Lco/bird/android/app/feature/communitymode/widget/OptionsView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lco/bird/android/app/feature/reportcomplaint/ReportView;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5;->a:Landroid/widget/RelativeLayout;

    iput-object p2, p0, Lo5;->b:Lco/bird/android/app/feature/communitymode/widget/OptionsView;

    iput-object p3, p0, Lo5;->c:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    iput-object p4, p0, Lo5;->d:Lco/bird/android/app/feature/reportcomplaint/ReportView;

    iput-object p5, p0, Lo5;->e:Landroid/widget/Button;

    return-void
.end method

.method public static a(Landroid/view/View;)Lo5;
    .locals 8

    sget v0, LVg4;->optionsView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lco/bird/android/app/feature/communitymode/widget/OptionsView;

    if-eqz v4, :cond_0

    sget v0, LVg4;->progressBar:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v5, :cond_0

    sget v0, LVg4;->reportView:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lco/bird/android/app/feature/reportcomplaint/ReportView;

    if-eqz v6, :cond_0

    sget v0, LVg4;->submitButton:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/Button;

    if-eqz v7, :cond_0

    new-instance v0, Lo5;

    move-object v3, p0

    check-cast v3, Landroid/widget/RelativeLayout;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lo5;-><init>(Landroid/widget/RelativeLayout;Lco/bird/android/app/feature/communitymode/widget/OptionsView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lco/bird/android/app/feature/reportcomplaint/ReportView;Landroid/widget/Button;)V

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

.method public static c(Landroid/view/LayoutInflater;)Lo5;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo5;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lo5;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lo5;
    .locals 2

    sget v0, Lcj4;->activity_report:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lo5;->a(Landroid/view/View;)Lo5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lo5;->a:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lo5;->b()Landroid/widget/RelativeLayout;

    move-result-object v0

    return-object v0
.end method
