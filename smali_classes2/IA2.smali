.class public final LIA2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHA2;


# instance fields
.field public final a:LJA2;


# direct methods
.method public constructor <init>(LJA2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIA2;->a:LJA2;

    return-void
.end method

.method public static b(LJA2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJA2;",
            ")",
            "LY94<",
            "LHA2;",
            ">;"
        }
    .end annotation

    new-instance v0, LIA2;

    invoke-direct {v0, p0}, LIA2;-><init>(LJA2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)LCA2;
    .locals 1

    iget-object v0, p0, LIA2;->a:LJA2;

    invoke-virtual {v0, p1, p2, p3}, LJA2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)LCA2;

    move-result-object p1

    return-object p1
.end method
