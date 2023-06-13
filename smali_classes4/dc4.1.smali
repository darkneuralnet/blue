.class public final synthetic Ldc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lec4;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lec4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldc4;->b:Ljava/util/List;

    iput-object p2, p0, Ldc4;->c:Ljava/util/List;

    iput-object p3, p0, Ldc4;->d:Lec4;

    iput-object p4, p0, Ldc4;->e:Ljava/lang/String;

    iput-object p5, p0, Ldc4;->f:Ljava/util/List;

    iput-object p6, p0, Ldc4;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Ldc4;->b:Ljava/util/List;

    iget-object v1, p0, Ldc4;->c:Ljava/util/List;

    iget-object v2, p0, Ldc4;->d:Lec4;

    iget-object v3, p0, Ldc4;->e:Ljava/lang/String;

    iget-object v4, p0, Ldc4;->f:Ljava/util/List;

    iget-object v5, p0, Ldc4;->g:Ljava/util/List;

    invoke-static/range {v0 .. v5}, Lec4;->b(Ljava/util/List;Ljava/util/List;Lec4;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
