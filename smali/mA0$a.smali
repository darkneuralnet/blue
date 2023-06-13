.class public final LmA0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LmA0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LmA0$c;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, LmA0$b;

    invoke-direct {v0, p1, p2}, LmA0$b;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, LmA0$a;->a:LmA0$c;

    goto :goto_0

    :cond_0
    new-instance v0, LmA0$d;

    invoke-direct {v0, p1, p2}, LmA0$d;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, LmA0$a;->a:LmA0$c;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()LmA0;
    .locals 1

    iget-object v0, p0, LmA0$a;->a:LmA0$c;

    invoke-interface {v0}, LmA0$c;->build()LmA0;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)LmA0$a;
    .locals 1

    iget-object v0, p0, LmA0$a;->a:LmA0$c;

    invoke-interface {v0, p1}, LmA0$c;->setExtras(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public c(I)LmA0$a;
    .locals 1

    iget-object v0, p0, LmA0$a;->a:LmA0$c;

    invoke-interface {v0, p1}, LmA0$c;->b(I)V

    return-object p0
.end method

.method public d(Landroid/net/Uri;)LmA0$a;
    .locals 1

    iget-object v0, p0, LmA0$a;->a:LmA0$c;

    invoke-interface {v0, p1}, LmA0$c;->a(Landroid/net/Uri;)V

    return-object p0
.end method
