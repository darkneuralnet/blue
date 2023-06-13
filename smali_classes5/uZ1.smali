.class public final synthetic LuZ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuZ1;->b:Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;

    iput-object p2, p0, LuZ1;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LuZ1;->b:Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;

    iget-object v1, p0, LuZ1;->c:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;->a(Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;Landroid/view/View;)V

    return-void
.end method
