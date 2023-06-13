.class public final synthetic LVs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LUs;


# direct methods
.method public synthetic constructor <init>(LUs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVs;->b:LUs;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVs;->b:LUs;

    invoke-static {v0}, LUs$b;->a(LUs;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
