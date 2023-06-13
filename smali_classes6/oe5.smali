.class public final synthetic Loe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lqe5;

.field public final synthetic c:Lwy0;


# direct methods
.method public synthetic constructor <init>(Lqe5;Lwy0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe5;->b:Lqe5;

    iput-object p2, p0, Loe5;->c:Lwy0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Loe5;->b:Lqe5;

    iget-object v1, p0, Loe5;->c:Lwy0;

    invoke-static {v0, v1}, Lqe5;->g(Lqe5;Lwy0;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
