.class public final LRJ6;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:LVK6;


# direct methods
.method public synthetic constructor <init>(LVK6;)V
    .locals 0

    iput-object p1, p0, LRJ6;->a:LVK6;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, LRJ6;->a:LVK6;

    invoke-virtual {v0, p1, p2}, LVK6;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
