.class public final LNy5$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNy5;->i(Lcom/facebook/share/model/ShareStoryContent;Ljava/util/UUID;)Landroid/os/Bundle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyi6$b<",
        "Lcom/facebook/share/model/SharePhoto;",
        "LrY2$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, LNy5$i;->a:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/share/model/SharePhoto;)LrY2$a;
    .locals 1

    iget-object v0, p0, LNy5$i;->a:Ljava/util/UUID;

    invoke-static {v0, p1}, LNy5;->a(Ljava/util/UUID;Lcom/facebook/share/model/ShareMedia;)LrY2$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/facebook/share/model/SharePhoto;

    invoke-virtual {p0, p1}, LNy5$i;->a(Lcom/facebook/share/model/SharePhoto;)LrY2$a;

    move-result-object p1

    return-object p1
.end method
