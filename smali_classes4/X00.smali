.class public final synthetic LX00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LY00;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LY00;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX00;->b:LY00;

    iput-object p2, p0, LX00;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LX00;->b:LY00;

    iget-object v1, p0, LX00;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LY00$a;->a(LY00;Ljava/lang/String;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method
