.class public final Ln68;
.super Loj7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcD1$i;


# direct methods
.method public constructor <init>(LcD1;LcD1$i;)V
    .locals 0

    iput-object p2, p0, Ln68;->a:LcD1$i;

    invoke-direct {p0}, Loj7;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEw9;)V
    .locals 2

    iget-object v0, p0, Ln68;->a:LcD1$i;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$i;->a(LfM2;)V

    return-void
.end method
