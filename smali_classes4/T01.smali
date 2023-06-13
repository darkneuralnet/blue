.class public final synthetic LT01;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:LZ01;

.field public final synthetic b:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(LZ01;Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT01;->a:LZ01;

    iput-object p2, p0, LT01;->b:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, LT01;->a:LZ01;

    iget-object v1, p0, LT01;->b:Lio/reactivex/H;

    invoke-static {v0, v1, p1}, LZ01;->i(LZ01;Lio/reactivex/H;Ljava/lang/Exception;)V

    return-void
.end method
