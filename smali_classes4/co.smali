.class public final synthetic Lco;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:LYn;

.field public final synthetic e:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;LYn;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco;->b:Ljava/util/List;

    iput-object p2, p0, Lco;->c:Ljava/util/List;

    iput-object p3, p0, Lco;->d:LYn;

    iput-object p4, p0, Lco;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lco;->b:Ljava/util/List;

    iget-object v1, p0, Lco;->c:Ljava/util/List;

    iget-object v2, p0, Lco;->d:LYn;

    iget-object v3, p0, Lco;->e:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3}, LYn$g;->a(Ljava/util/List;Ljava/util/List;LYn;Ljava/util/Map;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
