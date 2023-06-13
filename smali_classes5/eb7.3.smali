.class public final Leb7;
.super LMa7;
.source "SourceFile"


# instance fields
.field public final a:LTb7;

.field public final b:Ljava/lang/Object;

.field public final c:LTb7;

.field public final d:Ldb7;


# direct methods
.method public constructor <init>(LTb7;Ljava/lang/Object;LTb7;Ldb7;Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, LMa7;-><init>()V

    if-eqz p1, :cond_2

    iget-object p5, p4, Ldb7;->c:LRc7;

    sget-object v0, LRc7;->n:LRc7;

    if-ne p5, v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null messageDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Leb7;->a:LTb7;

    iput-object p2, p0, Leb7;->b:Ljava/lang/Object;

    iput-object p3, p0, Leb7;->c:LTb7;

    iput-object p4, p0, Leb7;->d:Ldb7;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
