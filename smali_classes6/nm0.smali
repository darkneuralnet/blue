.class public abstract Lnm0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LDh0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LDh0;

    invoke-direct {v0}, LDh0;-><init>()V

    iput-object v0, p0, Lnm0;->a:LDh0;

    invoke-virtual {v0}, LDh0;->d()V

    return-void
.end method


# virtual methods
.method public abstract a()Lnm0;
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lnm0;->a:LDh0;

    invoke-virtual {v0}, LDh0;->d()V

    return-void
.end method
