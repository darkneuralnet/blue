.class public final LyO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LyO6;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LyO6;->b:Landroid/content/Context;

    invoke-static {v0}, LcP6;->f(Landroid/content/Context;)LcP6;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LVK6;->c(Z)V

    return-void
.end method
