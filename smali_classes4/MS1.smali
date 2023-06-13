.class public final synthetic LMS1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMS1;->b:Landroid/content/Context;

    iput-object p2, p0, LMS1;->c:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LMS1;->b:Landroid/content/Context;

    iget-object v1, p0, LMS1;->c:Landroid/net/Uri;

    invoke-static {v0, v1}, LUS1;->f(Landroid/content/Context;Landroid/net/Uri;)Lg32;

    move-result-object v0

    return-object v0
.end method
