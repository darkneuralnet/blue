.class public final synthetic LHc4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LJc4;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LJc4;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHc4;->b:LJc4;

    iput-object p2, p0, LHc4;->c:Ljava/lang/String;

    iput-object p3, p0, LHc4;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LHc4;->b:LJc4;

    iget-object v1, p0, LHc4;->c:Ljava/lang/String;

    iget-object v2, p0, LHc4;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, LJc4;->n(LJc4;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
