.class public final LsR0$b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY94;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LsR0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LY94<",
        "Len0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lkn0;


# direct methods
.method public constructor <init>(Lkn0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsR0$b$e;->a:Lkn0;

    return-void
.end method


# virtual methods
.method public a()Len0;
    .locals 1

    iget-object v0, p0, LsR0$b$e;->a:Lkn0;

    invoke-interface {v0}, Lkn0;->a()Len0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Len0;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LsR0$b$e;->a()Len0;

    move-result-object v0

    return-object v0
.end method
