.class public final synthetic LXZ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LYZ3;


# direct methods
.method public synthetic constructor <init>(LYZ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXZ3;->b:LYZ3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXZ3;->b:LYZ3;

    invoke-static {v0}, LYZ3;->b(LYZ3;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
