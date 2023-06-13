.class public final synthetic LP30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LM30;

.field public final synthetic c:Ljava/io/File;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(LM30;Ljava/io/File;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP30;->b:LM30;

    iput-object p2, p0, LP30;->c:Ljava/io/File;

    iput-boolean p3, p0, LP30;->d:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LP30;->b:LM30;

    iget-object v1, p0, LP30;->c:Ljava/io/File;

    iget-boolean v2, p0, LP30;->d:Z

    invoke-static {v0, v1, v2}, LM30$d;->a(LM30;Ljava/io/File;Z)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
