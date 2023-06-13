.class public final synthetic LqG1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LoG1;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lco/bird/api/request/HardCountCreateRequest;

.field public final synthetic f:LHM4;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqG1;->b:LoG1;

    iput-object p2, p0, LqG1;->c:Ljava/lang/String;

    iput-object p3, p0, LqG1;->d:Ljava/lang/String;

    iput-object p4, p0, LqG1;->e:Lco/bird/api/request/HardCountCreateRequest;

    iput-object p5, p0, LqG1;->f:LHM4;

    iput-boolean p6, p0, LqG1;->g:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LqG1;->b:LoG1;

    iget-object v1, p0, LqG1;->c:Ljava/lang/String;

    iget-object v2, p0, LqG1;->d:Ljava/lang/String;

    iget-object v3, p0, LqG1;->e:Lco/bird/api/request/HardCountCreateRequest;

    iget-object v4, p0, LqG1;->f:LHM4;

    iget-boolean v5, p0, LqG1;->g:Z

    invoke-static/range {v0 .. v5}, LoG1$h;->a(LoG1;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/HardCountCreateRequest;LHM4;Z)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
