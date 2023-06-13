.class public final Lco/bird/android/feature/repair/v1/overview/a$b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY94;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/repair/v1/overview/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LY94<",
        "LCy4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LNy4;


# direct methods
.method public constructor <init>(LNy4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/repair/v1/overview/a$b$f;->a:LNy4;

    return-void
.end method


# virtual methods
.method public a()LCy4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/repair/v1/overview/a$b$f;->a:LNy4;

    invoke-interface {v0}, LNy4;->a()LCy4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCy4;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v1/overview/a$b$f;->a()LCy4;

    move-result-object v0

    return-object v0
.end method
