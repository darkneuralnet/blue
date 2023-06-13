.class public final Lyj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LLo;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/manager/localasset/persistence/AssetDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/manager/localasset/persistence/AssetDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj;->a:Lhj;

    iput-object p2, p0, Lyj;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)Lyj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/manager/localasset/persistence/AssetDatabase;",
            ">;)",
            "Lyj;"
        }
    .end annotation

    new-instance v0, Lyj;

    invoke-direct {v0, p0, p1}, Lyj;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/manager/localasset/persistence/AssetDatabase;)LLo;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->q(Lco/bird/android/manager/localasset/persistence/AssetDatabase;)LLo;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LLo;

    return-object p0
.end method


# virtual methods
.method public b()LLo;
    .locals 2

    iget-object v0, p0, Lyj;->a:Lhj;

    iget-object v1, p0, Lyj;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/manager/localasset/persistence/AssetDatabase;

    invoke-static {v0, v1}, Lyj;->c(Lhj;Lco/bird/android/manager/localasset/persistence/AssetDatabase;)LLo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyj;->b()LLo;

    move-result-object v0

    return-object v0
.end method
