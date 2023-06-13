.class public final Lsv8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb8;


# instance fields
.field public final synthetic a:LPn8;


# direct methods
.method public constructor <init>(LGv8;LPn8;)V
    .locals 0

    iput-object p2, p0, Lsv8;->a:LPn8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lsv8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsv8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->D()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
