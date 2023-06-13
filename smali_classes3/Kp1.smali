.class public final synthetic LKp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LLp1;


# direct methods
.method public synthetic constructor <init>(LLp1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKp1;->b:LLp1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LKp1;->b:LLp1;

    invoke-static {v0}, LLp1;->b(LLp1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
