.class public final LZO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LcO5;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:LcP6;


# direct methods
.method public constructor <init>(LcP6;LcO5;II)V
    .locals 0

    iput-object p1, p0, LZO6;->e:LcP6;

    iput-object p2, p0, LZO6;->b:LcO5;

    iput p3, p0, LZO6;->c:I

    iput p4, p0, LZO6;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    iget-object v0, p0, LZO6;->e:LcP6;

    iget-object v1, p0, LZO6;->b:LcO5;

    iget v4, p0, LZO6;->c:I

    iget v5, p0, LZO6;->d:I

    new-instance v14, LUJ6;

    invoke-virtual {v1}, LcO5;->h()I

    move-result v3

    invoke-virtual {v1}, LcO5;->c()J

    move-result-wide v6

    invoke-virtual {v1}, LcO5;->j()J

    move-result-wide v8

    invoke-virtual {v1}, LcO5;->a()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, LcO5;->b()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, LcO5;->g()Landroid/app/PendingIntent;

    move-result-object v12

    invoke-virtual {v1}, LcO5;->d()Ljava/util/List;

    move-result-object v13

    move-object v2, v14

    invoke-direct/range {v2 .. v13}, LUJ6;-><init>(IIIJJLjava/util/List;Ljava/util/List;Landroid/app/PendingIntent;Ljava/util/List;)V

    invoke-virtual {v0, v14}, LcP6;->g(LcO5;)V

    return-void
.end method
