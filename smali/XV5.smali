.class public final synthetic LXV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LYV5;


# direct methods
.method public synthetic constructor <init>(LYV5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXV5;->b:LYV5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LXV5;->b:LYV5;

    invoke-static {v0}, LYV5;->c(LYV5;)V

    return-void
.end method
