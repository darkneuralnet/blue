.class public LoM2$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoM2;->d()Landroid/content/BroadcastReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LoM2;


# direct methods
.method public constructor <init>(LoM2;)V
    .locals 0

    iput-object p1, p0, LoM2$d;->a:LoM2;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p2, p0, LoM2$d;->a:LoM2;

    invoke-virtual {p2, p1}, LoM2;->f(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, LoM2$d;->a:LoM2;

    invoke-static {}, LBy0;->b()LBy0;

    move-result-object p2

    invoke-virtual {p1, p2}, LoM2;->h(LBy0;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LoM2$d;->a:LoM2;

    invoke-static {p1}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object p1

    invoke-virtual {p2, p1}, LoM2;->h(LBy0;)V

    :goto_0
    return-void
.end method
