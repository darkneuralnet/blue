.class public final synthetic LVA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LhB;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LhB;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVA;->b:LhB;

    iput-object p2, p0, LVA;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LVA;->b:LhB;

    iget-object v1, p0, LVA;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LhB;->o(LhB;Ljava/lang/String;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
