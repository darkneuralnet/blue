.class public final synthetic LAz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LBz0;

.field public final synthetic c:Lco/bird/android/model/wire/WireContainerOrder;

.field public final synthetic d:Z

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(LBz0;Lco/bird/android/model/wire/WireContainerOrder;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAz0;->b:LBz0;

    iput-object p2, p0, LAz0;->c:Lco/bird/android/model/wire/WireContainerOrder;

    iput-boolean p3, p0, LAz0;->d:Z

    iput-boolean p4, p0, LAz0;->e:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LAz0;->b:LBz0;

    iget-object v1, p0, LAz0;->c:Lco/bird/android/model/wire/WireContainerOrder;

    iget-boolean v2, p0, LAz0;->d:Z

    iget-boolean v3, p0, LAz0;->e:Z

    invoke-static {v0, v1, v2, v3}, LBz0;->a(LBz0;Lco/bird/android/model/wire/WireContainerOrder;ZZ)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
