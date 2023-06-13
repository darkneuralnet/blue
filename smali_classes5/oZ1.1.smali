.class public final synthetic LoZ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/braze/ui/inappmessage/views/InAppMessageFullView;


# direct methods
.method public synthetic constructor <init>(Lcom/braze/ui/inappmessage/views/InAppMessageFullView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoZ1;->b:Lcom/braze/ui/inappmessage/views/InAppMessageFullView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LoZ1;->b:Lcom/braze/ui/inappmessage/views/InAppMessageFullView;

    invoke-static {v0, p1}, Lcom/braze/ui/inappmessage/views/InAppMessageFullView;->c(Lcom/braze/ui/inappmessage/views/InAppMessageFullView;Landroid/view/View;)V

    return-void
.end method
