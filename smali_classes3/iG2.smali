.class public final synthetic LiG2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LjG2;


# direct methods
.method public synthetic constructor <init>(LjG2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiG2;->b:LjG2;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LiG2;->b:LjG2;

    invoke-static {v0}, LjG2;->f(LjG2;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
