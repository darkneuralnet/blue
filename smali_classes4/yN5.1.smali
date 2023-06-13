.class public final synthetic LyN5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic a:LzN5;


# direct methods
.method public synthetic constructor <init>(LzN5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyN5;->a:LzN5;

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object v0, p0, LyN5;->a:LzN5;

    invoke-static {v0, p1}, LzN5;->a(LzN5;Landroid/media/MediaPlayer;)V

    return-void
.end method
