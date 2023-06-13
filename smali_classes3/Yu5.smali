.class public final synthetic LYu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LZu5;


# direct methods
.method public synthetic constructor <init>(LZu5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYu5;->b:LZu5;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYu5;->b:LZu5;

    invoke-static {v0}, LZu5;->o(LZu5;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
