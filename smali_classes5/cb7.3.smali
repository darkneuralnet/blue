.class public abstract Lcb7;
.super Lfb7;
.source "SourceFile"

# interfaces
.implements LUb7;


# instance fields
.field protected zbb:LTa7;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lfb7;-><init>()V

    invoke-static {}, LTa7;->e()LTa7;

    move-result-object v0

    iput-object v0, p0, Lcb7;->zbb:LTa7;

    return-void
.end method


# virtual methods
.method public final E()LTa7;
    .locals 1

    iget-object v0, p0, Lcb7;->zbb:LTa7;

    invoke-virtual {v0}, LTa7;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcb7;->zbb:LTa7;

    invoke-virtual {v0}, LTa7;->d()LTa7;

    move-result-object v0

    iput-object v0, p0, Lcb7;->zbb:LTa7;

    :cond_0
    iget-object v0, p0, Lcb7;->zbb:LTa7;

    return-object v0
.end method
