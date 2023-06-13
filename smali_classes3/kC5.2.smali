.class public final synthetic LkC5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LlC5;

.field public final synthetic c:Lco/bird/android/model/wire/WireSkuOrder;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Z

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(LlC5;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkC5;->b:LlC5;

    iput-object p2, p0, LkC5;->c:Lco/bird/android/model/wire/WireSkuOrder;

    iput-object p3, p0, LkC5;->d:Ljava/util/List;

    iput-boolean p4, p0, LkC5;->e:Z

    iput-boolean p5, p0, LkC5;->f:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LkC5;->b:LlC5;

    iget-object v1, p0, LkC5;->c:Lco/bird/android/model/wire/WireSkuOrder;

    iget-object v2, p0, LkC5;->d:Ljava/util/List;

    iget-boolean v3, p0, LkC5;->e:Z

    iget-boolean v4, p0, LkC5;->f:Z

    invoke-static {v0, v1, v2, v3, v4}, LlC5;->a(LlC5;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ZZ)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
