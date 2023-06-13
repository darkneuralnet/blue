.class public final synthetic LiW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:LjW0;

.field public final synthetic c:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(LjW0;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiW0;->b:LjW0;

    iput-object p2, p0, LiW0;->c:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LiW0;->b:LjW0;

    iget-object v1, p0, LiW0;->c:Landroid/net/Uri;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LjW0;->f(LjW0;Landroid/net/Uri;Ljava/lang/Throwable;)LcW0;

    move-result-object p1

    return-object p1
.end method
