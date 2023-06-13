.class public final synthetic LM60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LV60$a;

.field public final synthetic c:Lco/bird/api/response/OpsBatchJobActionKind;


# direct methods
.method public synthetic constructor <init>(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM60;->b:LV60$a;

    iput-object p2, p0, LM60;->c:Lco/bird/api/response/OpsBatchJobActionKind;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LM60;->b:LV60$a;

    iget-object v1, p0, LM60;->c:Lco/bird/api/response/OpsBatchJobActionKind;

    invoke-static {v0, v1}, LN60;->a(LV60$a;Lco/bird/api/response/OpsBatchJobActionKind;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
