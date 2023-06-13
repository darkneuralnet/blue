.class public final synthetic Lx55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LB55;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LB55;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx55;->b:Ljava/lang/String;

    iput-object p2, p0, Lx55;->c:LB55;

    iput-object p3, p0, Lx55;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lx55;->b:Ljava/lang/String;

    iget-object v1, p0, Lx55;->c:LB55;

    iget-object v2, p0, Lx55;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LB55;->a0(Ljava/lang/String;LB55;Ljava/lang/String;)Lio/reactivex/u;

    move-result-object v0

    return-object v0
.end method
