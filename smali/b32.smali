.class public final Lb32;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb32$a;,
        Lb32$b;,
        Lb32$c;
    }
.end annotation


# instance fields
.field public final a:Lb32$c;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    new-instance v0, Lb32$a;

    invoke-direct {v0, p1, p2, p3}, Lb32$a;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Lb32;->a:Lb32$c;

    goto :goto_0

    :cond_0
    new-instance v0, Lb32$b;

    invoke-direct {v0, p1, p2, p3}, Lb32$b;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Lb32;->a:Lb32$c;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lb32$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb32;->a:Lb32$c;

    return-void
.end method

.method public static f(Ljava/lang/Object;)Lb32;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x19

    if-ge v1, v2, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lb32;

    new-instance v1, Lb32$a;

    invoke-direct {v1, p0}, Lb32$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lb32;-><init>(Lb32$c;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lb32;->a:Lb32$c;

    invoke-interface {v0}, Lb32$c;->b()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/content/ClipDescription;
    .locals 1

    iget-object v0, p0, Lb32;->a:Lb32$c;

    invoke-interface {v0}, Lb32$c;->getDescription()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lb32;->a:Lb32$c;

    invoke-interface {v0}, Lb32$c;->d()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lb32;->a:Lb32$c;

    invoke-interface {v0}, Lb32$c;->c()V

    return-void
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb32;->a:Lb32$c;

    invoke-interface {v0}, Lb32$c;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
