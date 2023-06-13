.class public final synthetic LU01;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCanceledListener;


# instance fields
.field public final synthetic a:LZ01;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(LZ01;Ljava/lang/String;Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU01;->a:LZ01;

    iput-object p2, p0, LU01;->b:Ljava/lang/String;

    iput-object p3, p0, LU01;->c:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 3

    iget-object v0, p0, LU01;->a:LZ01;

    iget-object v1, p0, LU01;->b:Ljava/lang/String;

    iget-object v2, p0, LU01;->c:Lio/reactivex/H;

    invoke-static {v0, v1, v2}, LZ01;->p(LZ01;Ljava/lang/String;Lio/reactivex/H;)V

    return-void
.end method
