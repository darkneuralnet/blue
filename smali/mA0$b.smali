.class public final LmA0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmA0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LmA0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/view/ContentInfo$Builder;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LqA0;->a()V

    invoke-static {p1, p2}, LpA0;->a(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LmA0$b;->a:Landroid/view/ContentInfo$Builder;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, LmA0$b;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LsA0;->a(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, LmA0$b;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LnA0;->a(Landroid/view/ContentInfo$Builder;I)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public build()LmA0;
    .locals 3

    new-instance v0, LmA0;

    new-instance v1, LmA0$e;

    iget-object v2, p0, LmA0$b;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, LoA0;->a(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, LmA0$e;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, LmA0;-><init>(LmA0$f;)V

    return-object v0
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LmA0$b;->a:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LrA0;->a(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)Landroid/view/ContentInfo$Builder;

    return-void
.end method
