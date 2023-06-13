.class public final LSW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRW3;


# instance fields
.field public final a:LTW3;


# direct methods
.method public constructor <init>(LTW3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSW3;->a:LTW3;

    return-void
.end method

.method public static b(LTW3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTW3;",
            ")",
            "LY94<",
            "LRW3;",
            ">;"
        }
    .end annotation

    new-instance v0, LSW3;

    invoke-direct {v0, p0}, LSW3;-><init>(LTW3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvt4;)Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;
    .locals 1

    iget-object v0, p0, LSW3;->a:LTW3;

    invoke-virtual {v0, p1}, LTW3;->b(Lvt4;)Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;

    move-result-object p1

    return-object p1
.end method
