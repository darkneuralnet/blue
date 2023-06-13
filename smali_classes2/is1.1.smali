.class public final Lis1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhs1;


# instance fields
.field public final a:Ljs1;


# direct methods
.method public constructor <init>(Ljs1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis1;->a:Ljs1;

    return-void
.end method

.method public static b(Ljs1;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljs1;",
            ")",
            "LY94<",
            "Lhs1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lis1;

    invoke-direct {v0, p0}, Lis1;-><init>(Ljs1;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Le13;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lks1;Lco/bird/android/app/feature/map/ui/MapUi;)Lfs1;
    .locals 7

    iget-object v0, p0, Lis1;->a:Ljs1;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Ljs1;->b(Lco/bird/android/core/mvp/BaseActivity;Le13;LsJ4;Lcom/uber/autodispose/ScopeProvider;Lks1;Lco/bird/android/app/feature/map/ui/MapUi;)Lfs1;

    move-result-object p1

    return-object p1
.end method
