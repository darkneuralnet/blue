.class public final LYz6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYz6;->c(Lcom/facebook/share/model/SharePhotoContent;)Landroid/os/Bundle;
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
        "Ljava/lang/String;",
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
.method public a(Lcom/facebook/share/model/SharePhoto;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Lcom/facebook/share/model/SharePhoto;->e()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/facebook/share/model/SharePhoto;

    invoke-virtual {p0, p1}, LYz6$a;->a(Lcom/facebook/share/model/SharePhoto;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
