.class public final synthetic LpF;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LqF;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LqF;Ljava/util/List;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpF;->b:LqF;

    iput-object p2, p0, LpF;->c:Ljava/util/List;

    iput-object p3, p0, LpF;->d:Ljava/util/List;

    iput p4, p0, LpF;->e:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LpF;->b:LqF;

    iget-object v1, p0, LpF;->c:Ljava/util/List;

    iget-object v2, p0, LpF;->d:Ljava/util/List;

    iget v3, p0, LpF;->e:I

    invoke-static {v0, v1, v2, v3}, LqF;->b(LqF;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
