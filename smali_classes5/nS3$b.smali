.class public LnS3$b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnS3;-><init>(Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LnS3;


# direct methods
.method public constructor <init>(LnS3;)V
    .locals 0

    iput-object p1, p0, LnS3$b;->b:LnS3;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    iget-object p1, p0, LnS3$b;->b:LnS3;

    invoke-static {p1}, LnS3;->h(LnS3;)Lkh3;

    const/4 p1, 0x0

    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object p1, p0, LnS3$b;->b:LnS3;

    invoke-static {p1}, LnS3;->g(LnS3;)Landroid/view/View$OnLongClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LnS3$b;->b:LnS3;

    invoke-static {p1}, LnS3;->g(LnS3;)Landroid/view/View$OnLongClickListener;

    move-result-object p1

    iget-object v0, p0, LnS3$b;->b:LnS3;

    invoke-static {v0}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    :cond_0
    return-void
.end method
