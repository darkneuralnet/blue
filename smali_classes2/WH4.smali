.class public final synthetic LWH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:LbI4;


# direct methods
.method public synthetic constructor <init>(LbI4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWH4;->b:LbI4;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LWH4;->b:LbI4;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, LbI4$a;->d(LbI4;Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method