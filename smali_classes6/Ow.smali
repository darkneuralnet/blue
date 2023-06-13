.class public final synthetic LOw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/skydoves/balloon/Balloon;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Landroidx/appcompat/widget/AppCompatImageView;


# direct methods
.method public synthetic constructor <init>(Lcom/skydoves/balloon/Balloon;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOw;->b:Lcom/skydoves/balloon/Balloon;

    iput-object p2, p0, LOw;->c:Landroid/view/View;

    iput-object p3, p0, LOw;->d:Landroidx/appcompat/widget/AppCompatImageView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LOw;->b:Lcom/skydoves/balloon/Balloon;

    iget-object v1, p0, LOw;->c:Landroid/view/View;

    iget-object v2, p0, LOw;->d:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-static {v0, v1, v2}, Lcom/skydoves/balloon/Balloon;->b(Lcom/skydoves/balloon/Balloon;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;)V

    return-void
.end method
