.class public final synthetic LN84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LI84;


# direct methods
.method public synthetic constructor <init>(LI84;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN84;->b:LI84;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN84;->b:LI84;

    invoke-static {v0}, LI84$h;->a(LI84;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
