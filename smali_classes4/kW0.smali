.class public final synthetic LkW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic b:LjW0;

.field public final synthetic c:Lio/reactivex/H;

.field public final synthetic d:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(LjW0;Lio/reactivex/H;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkW0;->b:LjW0;

    iput-object p2, p0, LkW0;->c:Lio/reactivex/H;

    iput-object p3, p0, LkW0;->d:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, LkW0;->b:LjW0;

    iget-object v1, p0, LkW0;->c:Lio/reactivex/H;

    iget-object v2, p0, LkW0;->d:Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, LjW0$c;->a(LjW0;Lio/reactivex/H;Landroid/net/Uri;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
