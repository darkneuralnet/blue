.class public final Lvh3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh3;


# instance fields
.field public final a:Lwh3;


# direct methods
.method public constructor <init>(Lwh3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh3;->a:Lwh3;

    return-void
.end method

.method public static b(Lwh3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh3;",
            ")",
            "LY94<",
            "Luh3;",
            ">;"
        }
    .end annotation

    new-instance v0, Lvh3;

    invoke-direct {v0, p0}, Lvh3;-><init>(Lwh3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)Lth3;
    .locals 1

    iget-object v0, p0, Lvh3;->a:Lwh3;

    invoke-virtual {v0, p1, p2, p3, p4}, Lwh3;->b(Lxh3;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lth3$a;)Lth3;

    move-result-object p1

    return-object p1
.end method
