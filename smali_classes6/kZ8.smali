.class public final LkZ8;
.super Lxx9;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcD1$g;


# direct methods
.method public constructor <init>(LcD1;LcD1$g;)V
    .locals 0

    iput-object p2, p0, LkZ8;->a:LcD1$g;

    invoke-direct {p0}, Lxx9;-><init>()V

    return-void
.end method


# virtual methods
.method public final S(LC99;)V
    .locals 2

    iget-object v0, p0, LkZ8;->a:LcD1$g;

    new-instance v1, LfE1;

    invoke-direct {v1, p1}, LfE1;-><init>(LC99;)V

    invoke-interface {v0, v1}, LcD1$g;->a(LfE1;)V

    return-void
.end method
