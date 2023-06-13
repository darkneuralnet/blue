.class public final synthetic LpY1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LrY1;


# direct methods
.method public synthetic constructor <init>(LrY1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpY1;->b:LrY1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LpY1;->b:LrY1;

    invoke-static {v0}, LrY1;->c(LrY1;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
