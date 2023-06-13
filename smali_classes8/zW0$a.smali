.class public LzW0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly80;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzW0;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly80<",
        "Ljava/lang/Object;",
        "Lx80<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:LzW0;


# direct methods
.method public constructor <init>(LzW0;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LzW0$a;->c:LzW0;

    iput-object p2, p0, LzW0$a;->a:Ljava/lang/reflect/Type;

    iput-object p3, p0, LzW0$a;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LzW0$a;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public bridge synthetic b(Lx80;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LzW0$a;->c(Lx80;)Lx80;

    move-result-object p1

    return-object p1
.end method

.method public c(Lx80;)Lx80;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "Ljava/lang/Object;",
            ">;)",
            "Lx80<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LzW0$a;->b:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LzW0$b;

    invoke-direct {v1, v0, p1}, LzW0$b;-><init>(Ljava/util/concurrent/Executor;Lx80;)V

    move-object p1, v1

    :goto_0
    return-object p1
.end method
