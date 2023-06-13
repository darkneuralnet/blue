.class public final synthetic LpF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpF6;->b:Ljava/util/List;

    iput-object p2, p0, LpF6;->c:Ljava/util/List;

    iput-boolean p3, p0, LpF6;->d:Z

    iput-object p4, p0, LpF6;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LpF6;->b:Ljava/util/List;

    iget-object v1, p0, LpF6;->c:Ljava/util/List;

    iget-boolean v2, p0, LpF6;->d:Z

    iget-object v3, p0, LpF6;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, LqF6;->b(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
