.class public final synthetic Lmk7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxq7;


# instance fields
.field public final a:Lsj7;

.field public final b:LKg7;


# direct methods
.method public constructor <init>(Lsj7;LKg7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmk7;->a:Lsj7;

    iput-object p2, p0, Lmk7;->b:LKg7;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lmk7;->a:Lsj7;

    iget-object v1, p0, Lmk7;->b:LKg7;

    invoke-virtual {v1}, LKg7;->c()Ljava/util/Map;

    move-result-object v1

    iget-object v0, v0, Lsj7;->b:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
