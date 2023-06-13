.class public LKy5$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC31$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKy5$e;->e(Lcom/facebook/share/model/ShareContent;)LSh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LSh;

.field public final synthetic b:Lcom/facebook/share/model/ShareContent;

.field public final synthetic c:Z

.field public final synthetic d:LKy5$e;


# direct methods
.method public constructor <init>(LKy5$e;LSh;Lcom/facebook/share/model/ShareContent;Z)V
    .locals 0

    iput-object p1, p0, LKy5$e$a;->d:LKy5$e;

    iput-object p2, p0, LKy5$e$a;->a:LSh;

    iput-object p3, p0, LKy5$e$a;->b:Lcom/facebook/share/model/ShareContent;

    iput-boolean p4, p0, LKy5$e$a;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, LKy5$e$a;->a:LSh;

    invoke-virtual {v0}, LSh;->a()Ljava/util/UUID;

    move-result-object v0

    iget-object v1, p0, LKy5$e$a;->b:Lcom/facebook/share/model/ShareContent;

    iget-boolean v2, p0, LKy5$e$a;->c:Z

    invoke-static {v0, v1, v2}, Ldp2;->e(Ljava/util/UUID;Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getParameters()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, LKy5$e$a;->a:LSh;

    invoke-virtual {v0}, LSh;->a()Ljava/util/UUID;

    move-result-object v0

    iget-object v1, p0, LKy5$e$a;->b:Lcom/facebook/share/model/ShareContent;

    iget-boolean v2, p0, LKy5$e$a;->c:Z

    invoke-static {v0, v1, v2}, LuY2;->k(Ljava/util/UUID;Lcom/facebook/share/model/ShareContent;Z)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
