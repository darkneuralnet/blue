.class public LoM2$e;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoM2;->e(Landroid/content/Context;)Landroid/net/ConnectivityManager$NetworkCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:LoM2;


# direct methods
.method public constructor <init>(LoM2;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LoM2$e;->b:LoM2;

    iput-object p2, p0, LoM2$e;->a:Landroid/content/Context;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, LoM2$e;->b:LoM2;

    iget-object v0, p0, LoM2$e;->a:Landroid/content/Context;

    invoke-static {v0}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object v0

    invoke-virtual {p1, v0}, LoM2;->h(LBy0;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, LoM2$e;->b:LoM2;

    iget-object v0, p0, LoM2$e;->a:Landroid/content/Context;

    invoke-static {v0}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object v0

    invoke-virtual {p1, v0}, LoM2;->h(LBy0;)V

    return-void
.end method
