.class public final synthetic Loe7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LyP7;


# direct methods
.method public synthetic constructor <init>(LyP7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe7;->b:LyP7;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Loe7;->b:LyP7;

    invoke-virtual {v0}, LyP7;->b()Len7;

    move-result-object v0

    return-object v0
.end method
