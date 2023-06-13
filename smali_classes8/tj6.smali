.class public Ltj6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT83;


# instance fields
.field public final a:LT83;

.field public b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcr5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LT83;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltj6;->a:LT83;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1

    iget-object v0, p0, Ltj6;->a:LT83;

    invoke-interface {v0, p1}, LT83;->a(Ljava/util/Collection;)V

    iget-object p1, p0, Ltj6;->a:LT83;

    invoke-interface {p1}, LT83;->b()Ljava/util/Collection;

    move-result-object p1

    iput-object p1, p0, Ltj6;->b:Ljava/util/Collection;

    invoke-virtual {p0}, Ltj6;->c()V

    return-void
.end method

.method public b()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Ltj6;->b:Ljava/util/Collection;

    return-object v0
.end method

.method public final c()V
    .locals 2

    new-instance v0, LJj1;

    iget-object v1, p0, Ltj6;->b:Ljava/util/Collection;

    invoke-direct {v0, v1}, LJj1;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, LJj1;->b()V

    return-void
.end method
