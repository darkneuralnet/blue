.class public LXq2$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC31$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LXq2$a;->e(Lcom/facebook/share/internal/LikeContent;)LSh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/facebook/share/internal/LikeContent;

.field public final synthetic b:LXq2$a;


# direct methods
.method public constructor <init>(LXq2$a;Lcom/facebook/share/internal/LikeContent;)V
    .locals 0

    iput-object p1, p0, LXq2$a$a;->b:LXq2$a;

    iput-object p2, p0, LXq2$a$a;->a:Lcom/facebook/share/internal/LikeContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 2

    const-string v0, "LikeDialog"

    const-string v1, "Attempting to present the Like Dialog with an outdated Facebook app on the device"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public getParameters()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LXq2$a$a;->a:Lcom/facebook/share/internal/LikeContent;

    invoke-static {v0}, LXq2;->l(Lcom/facebook/share/internal/LikeContent;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
