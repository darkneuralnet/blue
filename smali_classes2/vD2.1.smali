.class public final synthetic LvD2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LrD2;


# direct methods
.method public synthetic constructor <init>(LrD2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvD2;->b:LrD2;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LvD2;->b:LrD2;

    invoke-static {v0}, LAD2;->e(LrD2;)LbE2;

    move-result-object v0

    return-object v0
.end method
