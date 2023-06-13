.class public final synthetic LOa3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lab3;

.field public final synthetic c:Ldb3;


# direct methods
.method public synthetic constructor <init>(Lab3;Ldb3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOa3;->b:Lab3;

    iput-object p2, p0, LOa3;->c:Ldb3;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LOa3;->b:Lab3;

    iget-object v1, p0, LOa3;->c:Ldb3;

    invoke-static {v0, v1}, Lab3;->A(Lab3;Ldb3;)Lio/reactivex/B;

    move-result-object v0

    return-object v0
.end method
