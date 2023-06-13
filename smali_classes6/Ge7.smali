.class public final LGe7;
.super Lov7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcD1$l;


# direct methods
.method public constructor <init>(LcD1;LcD1$l;)V
    .locals 0

    iput-object p2, p0, LGe7;->a:LcD1$l;

    invoke-direct {p0}, Lov7;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEw9;)Z
    .locals 2

    iget-object v0, p0, LGe7;->a:LcD1$l;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$l;->c(LfM2;)Z

    move-result p1

    return p1
.end method
