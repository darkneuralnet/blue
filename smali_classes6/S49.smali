.class public final LS49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx9;


# instance fields
.field public final a:LJf7;


# direct methods
.method public constructor <init>(LJf7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS49;->a:LJf7;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LS49;->a:LJf7;

    invoke-interface {v0}, LJf7;->zza()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LtZ8;

    check-cast v0, LNq9;

    invoke-direct {v1, v0}, LtZ8;-><init>(LNq9;)V

    return-object v1
.end method
