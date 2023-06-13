.class public final synthetic LvJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LTJ4;


# direct methods
.method public synthetic constructor <init>(LTJ4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvJ4;->b:LTJ4;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LvJ4;->b:LTJ4;

    invoke-static {v0}, LTJ4;->H(LTJ4;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
