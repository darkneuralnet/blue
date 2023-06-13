.class public final LVt9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx9;


# instance fields
.field public final a:LJf7;

.field public final b:LJf7;


# direct methods
.method public constructor <init>(LJf7;LJf7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVt9;->a:LJf7;

    iput-object p2, p0, LVt9;->b:LJf7;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LVt9;->a:LJf7;

    invoke-interface {v0}, LJf7;->zza()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LVt9;->b:LJf7;

    invoke-interface {v1}, LJf7;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LxA8;

    new-instance v2, LNq9;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v2, v0, v1}, LNq9;-><init>(Landroid/content/Context;LxA8;)V

    return-object v2
.end method
