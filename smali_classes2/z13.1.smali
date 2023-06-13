.class public final synthetic Lz13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LA13;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LA13;Ljava/util/List;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz13;->b:Ljava/util/List;

    iput-object p2, p0, Lz13;->c:LA13;

    iput-object p3, p0, Lz13;->d:Ljava/util/List;

    iput-boolean p4, p0, Lz13;->e:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lz13;->b:Ljava/util/List;

    iget-object v1, p0, Lz13;->c:LA13;

    iget-object v2, p0, Lz13;->d:Ljava/util/List;

    iget-boolean v3, p0, Lz13;->e:Z

    invoke-static {v0, v1, v2, v3}, LA13;->a(Ljava/util/List;LA13;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
