.class public final synthetic LfF1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:LgF1;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Lco/bird/android/model/persistence/HardCountScan;

.field public final synthetic f:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;LgF1;Ljava/util/Set;Lco/bird/android/model/persistence/HardCountScan;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfF1;->b:Ljava/util/Set;

    iput-object p2, p0, LfF1;->c:LgF1;

    iput-object p3, p0, LfF1;->d:Ljava/util/Set;

    iput-object p4, p0, LfF1;->e:Lco/bird/android/model/persistence/HardCountScan;

    iput-object p5, p0, LfF1;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LfF1;->b:Ljava/util/Set;

    iget-object v1, p0, LfF1;->c:LgF1;

    iget-object v2, p0, LfF1;->d:Ljava/util/Set;

    iget-object v3, p0, LfF1;->e:Lco/bird/android/model/persistence/HardCountScan;

    iget-object v4, p0, LfF1;->f:Ljava/util/Set;

    invoke-static {v0, v1, v2, v3, v4}, LgF1;->b(Ljava/util/Set;LgF1;Ljava/util/Set;Lco/bird/android/model/persistence/HardCountScan;Ljava/util/Set;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
