.class public final synthetic Lxs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:LHs4;

.field public final synthetic b:LO80$a;


# direct methods
.method public synthetic constructor <init>(LHs4;LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxs4;->a:LHs4;

    iput-object p2, p0, Lxs4;->b:LO80$a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lxs4;->a:LHs4;

    iget-object v1, p0, Lxs4;->b:LO80$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LHs4;->n(LHs4;LO80$a;Ljava/lang/Throwable;)V

    return-void
.end method
