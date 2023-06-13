.class public final LvM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU23;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LvM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:LvM0$b;


# direct methods
.method public constructor <init>(LlG2;Lio/reactivex/subjects/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lio/reactivex/subjects/g<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LvM0$b;->c:LvM0$b;

    iput-object p1, p0, LvM0$b;->a:LlG2;

    iput-object p2, p0, LvM0$b;->b:Lio/reactivex/subjects/g;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lio/reactivex/subjects/g;LwM0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LvM0$b;-><init>(LlG2;Lio/reactivex/subjects/g;)V

    return-void
.end method


# virtual methods
.method public a(LX23;)V
    .locals 0

    invoke-virtual {p0, p1}, LvM0$b;->b(LX23;)LX23;

    return-void
.end method

.method public final b(LX23;)LX23;
    .locals 1

    invoke-virtual {p0}, LvM0$b;->c()Li33;

    move-result-object v0

    invoke-static {p1, v0}, LY23;->b(LX23;Li33;)V

    return-object p1
.end method

.method public final c()Li33;
    .locals 3

    new-instance v0, Li33;

    iget-object v1, p0, LvM0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->F0()Lom3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lom3;

    iget-object v2, p0, LvM0$b;->b:Lio/reactivex/subjects/g;

    invoke-direct {v0, v1, v2}, Li33;-><init>(Lom3;Lio/reactivex/subjects/g;)V

    return-object v0
.end method
