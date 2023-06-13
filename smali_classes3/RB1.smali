.class public final LRB1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQB1;


# instance fields
.field public final a:LSB1;


# direct methods
.method public constructor <init>(LSB1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRB1;->a:LSB1;

    return-void
.end method

.method public static b(LSB1;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSB1;",
            ")",
            "LY94<",
            "LQB1;",
            ">;"
        }
    .end annotation

    new-instance v0, LRB1;

    invoke-direct {v0, p0}, LRB1;-><init>(LSB1;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lvt4;)Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;
    .locals 1

    iget-object v0, p0, LRB1;->a:LSB1;

    invoke-virtual {v0, p1}, LSB1;->b(Lvt4;)Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;

    move-result-object p1

    return-object p1
.end method
