.class public final synthetic LF7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LG7;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ZLG7;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LF7;->b:Z

    iput-object p2, p0, LF7;->c:LG7;

    iput-object p3, p0, LF7;->d:Ljava/lang/String;

    iput-object p4, p0, LF7;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-boolean v0, p0, LF7;->b:Z

    iget-object v1, p0, LF7;->c:LG7;

    iget-object v2, p0, LF7;->d:Ljava/lang/String;

    iget-object v3, p0, LF7;->e:Ljava/util/List;

    invoke-static {v0, v1, v2, v3}, LG7;->b(ZLG7;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
