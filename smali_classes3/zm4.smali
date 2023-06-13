.class public final synthetic Lzm4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LvT3;


# direct methods
.method public synthetic constructor <init>(LvT3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzm4;->b:LvT3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzm4;->b:LvT3;

    invoke-static {v0}, LMm4;->c(LvT3;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
