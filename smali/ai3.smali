.class public Lai3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXh3;


# instance fields
.field public final c:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "LXh3$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lew5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lew5<",
            "LXh3$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LuX2;

    invoke-direct {v0}, LuX2;-><init>()V

    iput-object v0, p0, Lai3;->c:LuX2;

    invoke-static {}, Lew5;->t()Lew5;

    move-result-object v0

    iput-object v0, p0, Lai3;->d:Lew5;

    sget-object v0, LXh3;->b:LXh3$b$b;

    invoke-virtual {p0, v0}, Lai3;->a(LXh3$b;)V

    return-void
.end method


# virtual methods
.method public a(LXh3$b;)V
    .locals 1

    iget-object v0, p0, Lai3;->c:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    instance-of v0, p1, LXh3$b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lai3;->d:Lew5;

    check-cast p1, LXh3$b$c;

    invoke-virtual {v0, p1}, Lew5;->p(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, LXh3$b$a;

    if-eqz v0, :cond_1

    check-cast p1, LXh3$b$a;

    iget-object v0, p0, Lai3;->d:Lew5;

    invoke-virtual {p1}, LXh3$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lew5;->q(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
