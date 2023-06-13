.class public final synthetic Lao;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LYn;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LYn;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao;->b:LYn;

    iput-object p2, p0, Lao;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lao;->b:LYn;

    iget-object v1, p0, Lao;->c:Ljava/util/List;

    invoke-static {v0, v1}, LYn$d;->b(LYn;Ljava/util/List;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
