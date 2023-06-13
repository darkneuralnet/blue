.class public final LiH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhH3;


# instance fields
.field public final a:LjH3;


# direct methods
.method public constructor <init>(LjH3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiH3;->a:LjH3;

    return-void
.end method

.method public static b(LjH3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LjH3;",
            ")",
            "LY94<",
            "LhH3;",
            ">;"
        }
    .end annotation

    new-instance v0, LiH3;

    invoke-direct {v0, p0}, LiH3;-><init>(LjH3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)LgH3;
    .locals 7

    iget-object v0, p0, LiH3;->a:LjH3;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, LjH3;->b(Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/ScopeProvider;LRH3;Lco/bird/android/app/feature/map/ui/MapParkingUi;Le13;LZr1;)LgH3;

    move-result-object p1

    return-object p1
.end method
