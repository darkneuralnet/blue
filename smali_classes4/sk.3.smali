.class public final Lsk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lwi2;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/DeserializerKind;",
            "LF01;",
            ">;>;"
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
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/DeserializerKind;",
            "LF01;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsk;->a:Lhj;

    iput-object p2, p0, Lsk;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)Lsk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/DeserializerKind;",
            "LF01;",
            ">;>;)",
            "Lsk;"
        }
    .end annotation

    new-instance v0, Lsk;

    invoke-direct {v0, p0, p1}, Lsk;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Ljava/util/Map;)Lwi2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/DeserializerKind;",
            "LF01;",
            ">;)",
            "Lwi2;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhj;->l0(Ljava/util/Map;)Lwi2;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwi2;

    return-object p0
.end method


# virtual methods
.method public b()Lwi2;
    .locals 2

    iget-object v0, p0, Lsk;->a:Lhj;

    iget-object v1, p0, Lsk;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v0, v1}, Lsk;->c(Lhj;Ljava/util/Map;)Lwi2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsk;->b()Lwi2;

    move-result-object v0

    return-object v0
.end method
