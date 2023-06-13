.class public final synthetic LlW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lio/reactivex/H;

.field public final synthetic b:LjW0;

.field public final synthetic c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;LjW0;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlW0;->a:Lio/reactivex/H;

    iput-object p2, p0, LlW0;->b:LjW0;

    iput-object p3, p0, LlW0;->c:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, LlW0;->a:Lio/reactivex/H;

    iget-object v1, p0, LlW0;->b:LjW0;

    iget-object v2, p0, LlW0;->c:Landroid/net/Uri;

    invoke-static {v0, v1, v2, p1}, LjW0$c;->b(Lio/reactivex/H;LjW0;Landroid/net/Uri;Ljava/lang/Exception;)V

    return-void
.end method
