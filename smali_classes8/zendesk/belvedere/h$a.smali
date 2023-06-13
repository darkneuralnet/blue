.class public Lzendesk/belvedere/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/h;->u(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lzendesk/belvedere/h;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/h;Z)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/h$a;->c:Lzendesk/belvedere/h;

    iput-boolean p2, p0, Lzendesk/belvedere/h$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lzendesk/belvedere/h$a;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lzendesk/belvedere/h$a;->c:Lzendesk/belvedere/h;

    invoke-static {p1}, Lzendesk/belvedere/h;->j(Lzendesk/belvedere/h;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/h$a;->c:Lzendesk/belvedere/h;

    invoke-virtual {p1}, Lzendesk/belvedere/h;->dismiss()V

    :goto_0
    return-void
.end method
