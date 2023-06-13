.class public final LFh7;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:LKg7;


# direct methods
.method public constructor <init>(LKg7;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, LFh7;->a:LKg7;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 0

    iget-object p1, p0, LFh7;->a:LKg7;

    invoke-virtual {p1}, LKg7;->d()V

    iget-object p1, p0, LFh7;->a:LKg7;

    invoke-static {p1}, LKg7;->b(LKg7;)V

    return-void
.end method
