.class public final synthetic Lwf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lyf6;

.field public final synthetic c:LT96;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lyf6;LT96;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf6;->b:Lyf6;

    iput-object p2, p0, Lwf6;->c:LT96;

    iput p3, p0, Lwf6;->d:I

    iput-object p4, p0, Lwf6;->e:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lwf6;->b:Lyf6;

    iget-object v1, p0, Lwf6;->c:LT96;

    iget v2, p0, Lwf6;->d:I

    iget-object v3, p0, Lwf6;->e:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, Lyf6;->a(Lyf6;LT96;ILjava/lang/Runnable;)V

    return-void
.end method
