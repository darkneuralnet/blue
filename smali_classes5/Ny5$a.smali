.class public final LNy5$a;
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
        "LrY2$a;",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LrY2$a;)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, LrY2$a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LrY2$a;->e()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, LNy5;->k(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v1, "extension"

    invoke-static {v0, v1, p1}, Lyi6;->g0(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LrY2$a;

    invoke-virtual {p0, p1}, LNy5$a;->a(LrY2$a;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
