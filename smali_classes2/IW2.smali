.class public final LIW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHW2;


# instance fields
.field public final a:LJW2;


# direct methods
.method public constructor <init>(LJW2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIW2;->a:LJW2;

    return-void
.end method

.method public static b(LJW2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJW2;",
            ")",
            "LY94<",
            "LHW2;",
            ">;"
        }
    .end annotation

    new-instance v0, LIW2;

    invoke-direct {v0, p0}, LIW2;-><init>(LJW2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;LKW2;)LGW2;
    .locals 1

    iget-object v0, p0, LIW2;->a:LJW2;

    invoke-virtual {v0, p1, p2}, LJW2;->b(Lcom/uber/autodispose/ScopeProvider;LKW2;)LGW2;

    move-result-object p1

    return-object p1
.end method
