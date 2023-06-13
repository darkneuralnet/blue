.class public final synthetic Li90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfp;


# instance fields
.field public final synthetic a:Lr90;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lr90;Ljava/util/List;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li90;->a:Lr90;

    iput-object p2, p0, Li90;->b:Ljava/util/List;

    iput p3, p0, Li90;->c:I

    iput p4, p0, Li90;->d:I

    iput p5, p0, Li90;->e:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 6

    iget-object v0, p0, Li90;->a:Lr90;

    iget-object v1, p0, Li90;->b:Ljava/util/List;

    iget v2, p0, Li90;->c:I

    iget v3, p0, Li90;->d:I

    iget v4, p0, Li90;->e:I

    move-object v5, p1

    check-cast v5, Ljava/lang/Void;

    invoke-static/range {v0 .. v5}, Lr90;->r(Lr90;Ljava/util/List;IIILjava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
